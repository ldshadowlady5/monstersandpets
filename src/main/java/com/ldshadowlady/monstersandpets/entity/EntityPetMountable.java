package com.ldshadowlady.monstersandpets.entity;

import com.google.common.collect.Iterables;
import com.ldshadowlady.monstersandpets.monstersandpets.PetsMountableType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public abstract class EntityPetMountable extends EntityAbstractPet {
	private final PetsMountableType type;

	public EntityPetMountable(World world, PetsMountableType type) {
		super(world);
		this.type = type;
		this.stepHeight = 1.0F;
	}

	@Override
	public boolean canBeSteered() {
		return getControllingPassenger() instanceof EntityLivingBase;
	}

	@Override
	public boolean canBePushed() {
		return !isBeingRidden();
	}

	@Override
	protected float getSoundVolume() {
		return 0.8F;
	}

	@Override
	public Entity getControllingPassenger() {
		return Iterables.getFirst(getPassengers(), null);
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if (isTamed() && !isEdible(stack) && !isTameItem(stack) && !isBreedingItem(stack)) {
			player.rotationYaw = rotationYaw;
			player.rotationPitch = rotationPitch;
			if (!world.isRemote) {
				player.startRiding(this);
			}
			return true;
		}
		return super.processInteract(player, hand);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		Entity entity = source.getTrueSource();
		return (!isBeingRidden() || entity == null || !isRidingOrBeingRiddenBy(entity)) && super.attackEntityFrom(source, amount);
	}


	@Override
	public final void updatePassenger(Entity passenger) {
		super.updatePassenger(passenger);
		if (passenger instanceof EntityLiving && getControllingPassenger() == passenger) {
			renderYawOffset = ((EntityLivingBase) passenger).renderYawOffset;
		}
	}

	@Override
	public final void travel(float strafe, float vertical, float forward) {
		Entity entity = getControllingPassenger();
		if (entity instanceof EntityLivingBase) {
			rotationYaw = entity.rotationYaw;
			prevRotationYaw = rotationYaw;
			rotationPitch = entity.rotationPitch * 0.5F;
			setRotation(rotationYaw, rotationPitch);
			renderYawOffset = rotationYaw;
			rotationYawHead = renderYawOffset;
			strafe = ((EntityLivingBase) entity).moveStrafing * 0.5F;
			forward = ((EntityLivingBase) entity).moveForward;
			if (forward <= 0.0F) {
				forward *= 0.25F;
			}
			jumpMovementFactor = getAIMoveSpeed() * 0.1F;
			if (canPassengerSteer()) {
				setAIMoveSpeed((float) getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
				super.travel(strafe, vertical, forward);
			} else if (entity instanceof EntityPlayer) {
				motionX = 0.0D;
				motionY = 0.0D;
				motionZ = 0.0D;
			}
			prevLimbSwingAmount = limbSwingAmount;
			double dx = posX - prevPosX;
			double dz = posZ - prevPosZ;
			float amt = Math.min(MathHelper.sqrt(dx * dx + dz * dz) * 4.0F, 1.0F);
			limbSwingAmount += (amt - limbSwingAmount) * 0.4F;
			limbSwing += limbSwingAmount;
		} else {
			jumpMovementFactor = 0.02F;
			super.travel(strafe, vertical, forward);
		}
	}
}
