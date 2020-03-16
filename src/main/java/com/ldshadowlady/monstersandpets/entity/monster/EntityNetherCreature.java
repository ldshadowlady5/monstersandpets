package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityNetherCreature extends EntityMonster {

	public EntityNetherCreature(World world) {

		super(world, MonstersType.NETHER_CREATURE);
		this.setSize(0.5F,0.5F);

	}

	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.NETHER_CREATURE;}
	@Override
	protected SoundEvent getAmbientSound()
	{
		return MonstersAndPetsSounds.NETHER_CREATURE_AMBIENT;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return MonstersAndPetsSounds.NETHER_CREATURE_HURT;}
	@Override
	protected SoundEvent getDeathSound(){return MonstersAndPetsSounds.NETHER_CREATURE_DEATH;}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(5.0D);
	}

}

