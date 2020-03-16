package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.entity.*;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersUnspawnableType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityNoFace extends EntityMonsterUnspawnable {

	public EntityNoFace(World world) {

		super(world, MonstersUnspawnableType.NO_FACE);
		this.setSize(1.2F,3.5F);
	}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.NO_FACE;}

	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Override
	protected SoundEvent getAmbientSound()
	{
		return MonstersAndPetsSounds.NO_FACE_AMBIENT;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return MonstersAndPetsSounds.NO_FACE_HURT;}
	@Override
	protected SoundEvent getDeathSound(){return MonstersAndPetsSounds.NO_FACE_DEATH;}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.300000041723251D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.5D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

}

