package com.ldshadowlady.monstersandpets.entity.pet;

import com.ldshadowlady.monstersandpets.entity.EntityPet;
import com.ldshadowlady.monstersandpets.monstersandpets.PetsType;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public final class EntityWorpeltinger extends EntityPet {
	public EntityWorpeltinger(World world) {
		super(world, PetsType.WORPELTINGER);
		setSize(1.2F, 1.2F);
	}

	@Override
	protected boolean isTameItem(ItemStack stack) {
		return stack.getItem() == Items.GOLDEN_CARROT;
	}

	@Override
	protected boolean isEdible(ItemStack stack) {
		return stack.getItem() == Items.CARROT;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_RABBIT_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_RABBIT_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_RABBIT_DEATH;
	}
}
