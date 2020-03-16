package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntitySlenderman extends EntityMonster {

	public EntitySlenderman(World world) {

		super(world, MonstersType.SLENDERMAN);
		this.setSize(0.8F,3.1F);

	}

	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.SLENDERMAN;}
	@Override
	protected SoundEvent getAmbientSound()
	{
		return MonstersAndPetsSounds.SLENDERMAN_AMBIENT;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return MonstersAndPetsSounds.SLENDERMAN_HURT;}
	@Override
	protected SoundEvent getDeathSound(){return MonstersAndPetsSounds.SLENDERMAN_DEATH;}

	public float getEyeHeight(){return 3F;}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(75.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.39000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);
		if (cause.getTrueSource() instanceof EntityPlayer) {
			world.spawnEntity(new EntityLightningBolt(world, this.posX, this.posY, this.posZ, false));
		}
	}
}

