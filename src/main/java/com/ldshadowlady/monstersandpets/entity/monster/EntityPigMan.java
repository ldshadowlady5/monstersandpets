package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityPigMan extends EntityMonster {

	public EntityPigMan(World world) {

		super(world, MonstersType.PIG_MAN);
		this.setSize(1.5F,2.1F);

	}

	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.PIG_MAN;}
	@Override
	protected SoundEvent getAmbientSound()
	{
		return MonstersAndPetsSounds.PIG_MAN_AMBIENT;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return MonstersAndPetsSounds.PIG_MAN_HURT;}
	@Override
	protected SoundEvent getDeathSound(){return MonstersAndPetsSounds.PIG_MAN_DEATH;}

	public float getEyeHeight()
	{
		return 2F;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(75.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.28000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

}

