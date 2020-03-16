package com.ldshadowlady.monstersandpets.entity;

import com.ldshadowlady.monstersandpets.entity.ai.EntityAIRide;
import com.ldshadowlady.monstersandpets.monstersandpets.PetsType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class EntityPet extends EntityAbstractPet {
	private final PetsType type;

	private EntityAIRide aiRide;

	public EntityPet(World world, PetsType type) {
		super(world);
		this.type = type;
	}

	@Override
	protected void initEntityAI() {
		super.initEntityAI();
		tasks.addTask(2, aiRide = new EntityAIRide(this));
	}

	@Override
	public double getMountedYOffset() {
		return height * 0.5F;
	}

	@Override
	public double getYOffset() {
		return getRidingEntity() instanceof EntityPlayer ? 0.5F : 0;
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if (isTamed() && (player.isSneaking() || player.isPassenger(this)) && !isEdible(stack) && !isBreedingItem(stack) && isOwner(player)) {
			if (!world.isRemote) {
				aiSit.setSitting(false);
				aiRide.toggle();
				isJumping = false;
				navigator.clearPath();
				setAttackTarget(null);
			}
			return true;
		}
		return super.processInteract(player, hand);
	}
	
	@Override
	public boolean startRiding(Entity entity, boolean force) {
		return startRiding(entity, force, true);
	}

	public boolean startRiding(Entity entity, boolean force, boolean updateState) {
		if (super.startRiding(entity, force)) {
			if (updateState && !world.isRemote) {
				aiRide.ride(entity);
			}
			return true;
		}
		return false;
	}

	@Override
	public void dismountRidingEntity() {
		super.dismountRidingEntity();
		rideCooldown = 0;
	}
}
