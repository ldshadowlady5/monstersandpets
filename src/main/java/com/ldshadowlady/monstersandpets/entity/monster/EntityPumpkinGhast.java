package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import net.minecraft.client.audio.Sound;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityPumpkinGhast extends EntityMonster {

	public EntityPumpkinGhast(World world) {

		super(world, MonstersType.PUMPKIN_GHAST);
		this.setSize(1F,2F);
	}

	public float getEyeHeight(){return 1.6F;}


	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.PUMPKIN_GHAST;}

	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Override
	protected SoundEvent getAmbientSound(){return SoundEvents.ENTITY_GHAST_AMBIENT;}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return SoundEvents.ENTITY_GHAST_HURT;}
	@Override
	protected SoundEvent getDeathSound(){return SoundEvents.ENTITY_GHAST_DEATH;}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.5D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

}

