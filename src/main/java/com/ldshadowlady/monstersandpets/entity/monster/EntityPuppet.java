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

public class EntityPuppet extends EntityMonsterUnspawnable {

	public EntityPuppet(World world) {
		super(world, MonstersUnspawnableType.PUPPET);
		this.setSize(1.2F,2F);
	}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.PUPPET;}

	@Override
	protected boolean isValidLightLevel(){ return true;}
	protected SoundEvent getAmbientSound()
	{
		return MonstersAndPetsSounds.PUPPET;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return MonstersAndPetsSounds.FNAF_HURT;}
	@Override
	protected SoundEvent getDeathSound(){return MonstersAndPetsSounds.FNAF_DEATH;}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3300000041723251D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(24.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}
}

