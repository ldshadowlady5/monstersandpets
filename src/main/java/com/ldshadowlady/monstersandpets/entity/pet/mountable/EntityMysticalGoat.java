package com.ldshadowlady.monstersandpets.entity.pet.mountable;

import com.ldshadowlady.monstersandpets.entity.EntityPetMountable;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.PetsMountableType;
import com.ldshadowlady.monstersandpets.registries.MonstersAndPetsItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public final class EntityMysticalGoat extends EntityPetMountable {
	public EntityMysticalGoat(World world) {
		super(world, PetsMountableType.MYSTICAL_GOAT);
		setSize(1.2F, 1.2F);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	@Override
	protected boolean isTameItem(ItemStack stack) {
		return stack.getItem() == MonstersAndPetsItems.CHOCOLATE_DONUT;
	}

	@Override
	protected boolean isEdible(ItemStack stack) { return stack.getItem() == Items.WHEAT; }

	@Override
	protected SoundEvent getAmbientSound() {
		return MonstersAndPetsSounds.MYSTICAL_GOAT_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return MonstersAndPetsSounds.MYSTICAL_GOAT_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return MonstersAndPetsSounds.MYSTICAL_GOAT_DEATH;
	}

	@Override
	public double getMountedYOffset() {
		return 0.6F;
	}
}
