package com.ldshadowlady.monstersandpets.entity;

import java.util.Objects;
import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public abstract class EntityAbstractPet extends EntityTameable {
	public EntityAbstractPet(World world) {
		super(world);
		setTamed(false);
		setSize(0.5F, 0.5F);
	}

	@Override
	protected void initEntityAI() {
		super.initEntityAI();
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, aiSit = new EntityAISit(this));
		tasks.addTask(3, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
		tasks.addTask(4, new EntityAIMate(this, 1.0D));
		tasks.addTask(5, new EntityAIWander(this, 1.0D));
		tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		tasks.addTask(6, new EntityAILookIdle(this));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
	}

	@Override
	public final boolean canRiderInteract() {
		return true;
	}

	protected boolean isTameItem(ItemStack stack) {
		return stack.getItem() == Items.APPLE;
	}

	protected boolean isEdible(ItemStack stack) {
		return stack.getItem() == Items.MELON;
	}

	@Override
	public final boolean isBreedingItem(ItemStack stack) {
		return false;
	}

	@Nullable
	@Override
	public final EntityAgeable createChild(EntityAgeable other) {
		return null;
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if (isTamed()) {
			if (isEdible(stack) && getHealth() < getMaxHealth()) {
				if (!player.capabilities.isCreativeMode) {
					stack.shrink(1);
				}
				heal(stack.getItem() instanceof ItemFood ? ((ItemFood) stack.getItem()).getHealAmount(stack) : getHealAmount(stack));
				return true;
			}
			if (!player.isSneaking() && !player.isPassenger(this) && !isBreedingItem(stack) && isOwner(player)) {
				if (!world.isRemote) {
					aiSit.setSitting(!isSitting());
					isJumping = false;
					navigator.clearPath();
					setAttackTarget(null);
				}
				return true;
			}
		} else if (isTameItem(stack)){
			if (!player.capabilities.isCreativeMode) {
				stack.shrink(1);
			}
			if (!world.isRemote) {
				if (rand.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, player)) {
					setTamedBy(player);
					navigator.clearPath();
					setAttackTarget(null);
					aiSit.setSitting(true);
					setHealth(getMaxHealth());
					playTameEffect(true);
					createHearts();
				} else {
					playTameEffect(false);
					createSmoke();
				}
			}
			return true;
		}
		return super.processInteract(player, hand);
	}

	public final void createHearts() {
		world.setEntityState(this, (byte) 7);
	}

	public final void createSmoke() {
		world.setEntityState(this, (byte) 6);
	}

	private float getHealAmount(ItemStack stack) {
		return Objects.requireNonNull(stack.getItem().getRegistryName()).getResourcePath().chars()
				.filter(c -> "aeiou".indexOf(c) != -1)
				.count() + 1;
	}
}
