package com.ldshadowlady.monstersandpets.entity.pet;

import com.ldshadowlady.monstersandpets.entity.EntityPet;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.PetsType;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class EntityBoo extends EntityPet {
	public EntityBoo(World world) {
		super(world, PetsType.BOO);
		setSize(0.6F, 0.6F);
	}

	@Override
	protected boolean isTameItem(ItemStack stack) {
		return stack.getItem() == Items.BONE;
	}

	@Override
	protected boolean isEdible(ItemStack stack) {
		return stack.getItem() == Items.COOKED_BEEF;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return MonstersAndPetsSounds.BOO_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return MonstersAndPetsSounds.BOO_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return MonstersAndPetsSounds.BOO_DEATH;
	}
}
