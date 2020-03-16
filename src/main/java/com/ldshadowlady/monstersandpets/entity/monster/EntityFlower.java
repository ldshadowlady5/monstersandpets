package com.ldshadowlady.monstersandpets.entity.monster;

import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import com.ldshadowlady.monstersandpets.monstersandpets.MonstersType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityFlower extends EntityMonster {

	public EntityFlower(World world) {

		super(world, MonstersType.FLOWER);
		this.setSize(0.4F,0.4F);
	}

	@Nullable
	protected ResourceLocation getLootTable() {return MonstersAndPetsLootTableList.FLOWER;}

	@Override
	protected boolean isValidLightLevel(){ return true;}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.02300000041723251D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

}

