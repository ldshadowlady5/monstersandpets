package com.ldshadowlady.monstersandpets.entity.ai;

import com.ldshadowlady.monstersandpets.entity.monster.EntityClown;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.monster.EntityZombie;

public class EntityAIClownAttack extends EntityAIAttackMelee {
	private final EntityClown clown;
	private int swipeArmTicks;

	public EntityAIClownAttack(EntityClown clownIn, double speedIn, boolean longMemoryIn)
	{
		super(clownIn, speedIn, longMemoryIn);
		this.clown = clownIn;
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting()
	{
		super.startExecuting();
		this.swipeArmTicks = 0;
	}

	/**
	 * Reset the task's internal state. Called when this task is interrupted by another one
	 */
	public void resetTask()
	{
		super.resetTask();
		//this.clown.setArmsRaised(false);
	}

	/**
	 * Keep ticking a continuous task that has already been started
	 */
	public void updateTask()
	{
		super.updateTask();
		++this.swipeArmTicks;

		if (this.swipeArmTicks >= 5 && this.attackTick < 10)
		{
			//this.clown.swingingHand
		}
		else
		{
		//	this.clown.setArmsRaised(false);
		}
	}


}
