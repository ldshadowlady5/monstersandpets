package com.ldshadowlady.monstersandpets.entity.pet;

import com.ldshadowlady.monstersandpets.entity.EntityPet;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.PetsType;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public final class EntityPascal extends EntityPet {
	public EntityPascal(World world) {
		super(world, PetsType.PASCAL);
		setSize(0.2F, 0.2F);
	}

	@Override
	protected boolean isTameItem(ItemStack stack) {
		return stack.getItem() == Items.DIAMOND;
	}

	@Override
	protected boolean isEdible(ItemStack stack) {
		return stack.getItem() == Items.APPLE;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_RABBIT_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_BAT_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_RABBIT_DEATH;
	}

}
