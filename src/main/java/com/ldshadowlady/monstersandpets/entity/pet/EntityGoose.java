package com.ldshadowlady.monstersandpets.entity.pet;

import com.ldshadowlady.monstersandpets.entity.EntityPet;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.PetsType;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public final class EntityGoose extends EntityPet {
	public EntityGoose(World world) {
		super(world, PetsType.GOOSE);
		setSize(0.8F, 1.0F);
	}

	@Override
	protected boolean isTameItem(ItemStack stack) {
		return stack.getItem() == Items.WHEAT_SEEDS;
	}

	@Override
	protected boolean isEdible(ItemStack stack) {
		return stack.getItem() == Items.WHEAT;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return MonstersAndPetsSounds.GOOSE_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return MonstersAndPetsSounds.GOOSE_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return MonstersAndPetsSounds.GOOSE_DEATH;
	}
}
