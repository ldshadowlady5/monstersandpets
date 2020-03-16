package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.entity.*;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersUnspawnableType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityYandereChan extends EntityMonsterUnspawnable {

	public EntityYandereChan(World world) {
		super(world, MonstersUnspawnableType.YANDERE_CHAN);
		this.setSize(1.2F,2F);
	}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.YANDERE_CHAN;}

	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Override
	protected SoundEvent getAmbientSound()
	{
		return MonstersAndPetsSounds.YANDERE_CHAN;
	}


	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3300000041723251D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(24.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0D);
	}

	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1,new EntityAIAttackMelee(this,1,false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.applyEntityAI();
	}

	@Override
	protected void applyEntityAI()
	{
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityYandereKatelyn.class, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityYandereKokona.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityYandereOsana.class, true));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityYandereRyusei.class, true));

	}

}

