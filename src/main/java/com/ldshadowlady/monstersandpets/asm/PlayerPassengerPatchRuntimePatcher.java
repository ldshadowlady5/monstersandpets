package com.ldshadowlady.monstersandpets.asm;

import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import net.ilexiconn.llibrary.server.asm.InsnPredicate;
import net.ilexiconn.llibrary.server.asm.RuntimePatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityTrackerEntry;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketSetPassengers;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.storage.AnvilChunkLoader;
import net.minecraftforge.common.util.Constants;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public final class PlayerPassengerPatchRuntimePatcher extends RuntimePatcher {
	@Override
	public void onInit() {
		/*
		 * Patch EntityPlayerMP#mountEntityAndWakeUp() to not call Entity#removePassengers()
		 * so we can handle them during EntityList#playerLoggedOut(EntityPlayerMP).
		 * 
		 * Patch EntityPlayerMP#writeEntityToNBT() to use correct logic to determine if vehicle
		 * nbt should be written. Current code will attempt to write players to nbt of they are
		 * root vehicle.
		 *
		 * Side note:
		 * The mcp name "mountEntityAndWakeUp" comes from pre 1.9 where instead of removing
		 * the player's passengers it made the riddenByEntity remount the player. Haven't
		 * checked why it was done though.
		 */
		patchClass(EntityPlayerMP.class)
			.patchMethod("mountEntityAndWakeUp", void.class)
				.apply(Patch.REPLACE_NODE, new InsnPredicate.Method(EntityPlayerMP.class, "removePassengers", void.class), method -> method
					.node(POP)
				).pop()
			.patchMethod("writeEntityToNBT", NBTTagCompound.class, void.class)
				.apply(Patch.REPLACE_NODE, new InsnPredicate.Method(EntityPlayerMP.class, "getLowestRidingEntity", Entity.class), method -> method
					.node(DUP)
					.var(ALOAD, 1)
					.method(INVOKESTATIC, Code.class, "writeToNBT", EntityPlayerMP.class, NBTTagCompound.class, void.class)
				);
		/*
		 * Patch PlayerList#initializeConnectionToPlayer(NetworkManager,EntityPlayerMP,NetHandlerPlayServer)
		 * and PlayerList#playerLoggedOut(EntityPlayerMP) to include passenger during player log in and log out.
		 *
		 * Each hook is placed before existing existing vehicle logic.
		 */
		patchClass(PlayerList.class)
			.patchMethod("initializeConnectionToPlayer", NetworkManager.class, EntityPlayerMP.class, NetHandlerPlayServer.class, void.class)
				.apply(Patch.REPLACE_NODE, new InsnPredicate.Method(NBTTagCompound.class, "hasKey", String.class, int.class, boolean.class), method -> method
					.node(POP2)
					.var(ALOAD, 2)
					.node(SWAP)
					.method(INVOKESTATIC, Code.class, "onLogIn", EntityPlayerMP.class, NBTTagCompound.class, void.class)
					.node(ICONST_0)
				).pop()
			.patchMethod("playerLoggedOut", EntityPlayerMP.class, void.class)
				.apply(Patch.REPLACE_NODE, new InsnPredicate.Method(EntityPlayerMP.class, "isRiding", boolean.class), method -> method
					.method(INVOKESTATIC, Code.class, "onLogOut", EntityPlayerMP.class, void.class)
					.node(ICONST_0)
				);
		/*
		 * Patch EntityTrackerEntry#updatePlayerList() so the entity tracker has players
		 * receive passenger updates to themselves.
		 */
		String packetSetPassengers = ((Object) SPacketSetPassengers.class).toString().replace('.', '/');
		patchClass(EntityTrackerEntry.class)
			.patchMethod("updatePlayerList", List.class, void.class)
				.apply(Patch.REPLACE_NODE, new InsnPredicate.Method(EntityTrackerEntry.class, "sendPacketToTrackedPlayers", Packet.class, void.class).and(data -> {
						AbstractInsnNode node = data.node.getPrevious();
						return node != null && node.getOpcode() == INVOKESPECIAL && packetSetPassengers.equals(((MethodInsnNode) node).owner);
					}), method -> method
						.method(INVOKEVIRTUAL, EntityTrackerEntry.class, "sendToTrackingAndSelf", Packet.class, void.class)
				);
	}

	public static final class Code {
		private Code() {}

		public static void writeToNBT(EntityPlayerMP player, NBTTagCompound compound) {
			Entity root = getRoot(player);
			Entity attachment = player.getRidingEntity();
			if (attachment != null && root != player) {
				NBTTagCompound vehicleCompound = new NBTTagCompound();
				NBTTagCompound rootCompound = new NBTTagCompound();
				root.writeToNBTOptional(rootCompound);
				vehicleCompound.setUniqueId("Attach", attachment.getUniqueID());
				vehicleCompound.setTag("Entity", rootCompound);
				compound.setTag("RootVehicle", vehicleCompound);
			}
		}

		public static void onLogIn(EntityPlayerMP player, NBTTagCompound compound) {
			WorldServer world = player.getServerWorld();
			if (compound.hasKey("Passengers", Constants.NBT.TAG_LIST)) {
				NBTTagList passengers = compound.getTagList("Passengers", Constants.NBT.TAG_COMPOUND);
				for (int i = 0; i < passengers.tagCount(); i++) {
					Entity entity = AnvilChunkLoader.readWorldEntity(passengers.getCompoundTagAt(i), world, true);
					if (entity != null) {
						entity.startRiding(player, true);
					}
				}
			}
			if (compound.hasKey("RootVehicle", Constants.NBT.TAG_COMPOUND)) {
				NBTTagCompound vehicleCompound = compound.getCompoundTag("RootVehicle");
				Entity root = AnvilChunkLoader.readWorldEntity(vehicleCompound.getCompoundTag("Entity"), world, true);
				if (root != null) {
					UUID attach = vehicleCompound.getUniqueId("Attach");
					Deque<Entity> entities = Queues.newArrayDeque();
					entities.add(root);
					for (Entity e; (e = entities.poll()) != null; ) {
						if (e.getUniqueID().equals(attach)) {
							player.startRiding(e, true);
							break;
						} else {
							entities.addAll(e.getPassengers());
						}
					}
				}
			}
		}

		public static void onLogOut(EntityPlayerMP player) {
			WorldServer world = player.getServerWorld();
			Deque<Entity> entities = Queues.newArrayDeque();
			entities.add(getRoot(player));
			entities.addAll(player.getPassengers());
			Set<ChunkPos> removals = Sets.newHashSet();
			for (Entity e; (e = entities.poll()) != null; ) {
				if (e instanceof EntityPlayerMP) {
					e.dismountRidingEntity();
				} else {
					world.removeEntityDangerously(e);
					removals.add(new ChunkPos(e.chunkCoordX, e.chunkCoordZ));
					entities.addAll(e.getPassengers());
				}
			}
			for (ChunkPos pos : removals) {
				world.getChunkFromChunkCoords(pos.x, pos.z).markDirty();
			}
		}

		private static Entity getRoot(EntityPlayerMP player) {
			Entity root = player.getLowestRidingEntity();
			Deque<Entity> entities = Queues.newArrayDeque();
			entities.add(root);
			for (Entity e; (e = entities.poll()) != null; ) {
				if (e instanceof EntityPlayerMP) {
					if (e != player) {
						return player;
					}
				} else {
					entities.addAll(e.getPassengers());
				}
			}
			return root;
		}
	}
}
