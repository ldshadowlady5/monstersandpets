package com.ldshadowlady.monstersandpets.entity;

import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersUnspawnableType;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityMonsterUnspawnable extends EntityMob {
	private final MonstersUnspawnableType monstersunspawnabletype;

	public EntityMonsterUnspawnable(World world, MonstersUnspawnableType type) {
		super(world);
		this.monstersunspawnabletype = type;
	}

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

	protected void applyEntityAI()
	{
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}


}
