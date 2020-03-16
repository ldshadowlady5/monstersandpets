package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityWendigo extends EntityMonster {

	public EntityWendigo(World world) {

		super(world, MonstersType.WENDIGO);
		this.setSize(1.8F,3.2F);

	}
	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.WENDIGO;}
	@Override
	protected SoundEvent getAmbientSound()
	{
		return MonstersAndPetsSounds.WENDIGO_AMBIENT;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return MonstersAndPetsSounds.WENDIGO_HURT;}
	@Override
	protected SoundEvent getDeathSound(){return MonstersAndPetsSounds.WENDIGO_DEATH;}

	public float getEyeHeight()
	{
		return 3F;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

}

