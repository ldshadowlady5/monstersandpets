package com.ldshadowlady.monstersandpets.monstersandpets;

import java.awt.*;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.EntityMonster;
import com.ldshadowlady.monstersandpets.entity.monster.*;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public enum MonstersType {

	FLOWER(EntityFlower.class, "flower",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		5,1,1 //weight,mix,max
	),
	NETHER_CREATURE(EntityNetherCreature.class, "nether_creature",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1,1,6 //weight,mix,max
	),
	PIG_MAN(EntityPigMan.class, "pig_man",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1,1,1 //weight,mix,max
	),
	SLENDERMAN(EntitySlenderman.class, "slenderman",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1,1,1 //weight,mix,max
	),
	WENDIGO(EntityWendigo.class, "wendigo",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1,1,1 //weight,mix,max
	),
	HAUNTED_TREE(EntityHauntedTree.class, "haunted_tree",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		10,1,1 //weight,mix,max
	),
	PUMPKIN_GHAST(EntityPumpkinGhast.class, "pumpkin_ghast",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1,1,1 //weight,mix,max
	)
	;
	;

	private final Class<? extends EntityMonster> entityClass;

	private final String name;

	private final ResourceLocation texture;

	private final Color primaryColor;

	private final Color secondaryColor;

	private final int spawnWeight;

	private final int spawnMin;

	private final int spawnMax;


	MonstersType(Class<? extends EntityMonster> entityClass, String name, Color backgroundColor, Color foregroundColor,int spawnWeight,int spawnMin,int spawnMax) {
		this.entityClass = entityClass;
		this.name = name;
		this.texture = new ResourceLocation(MonstersAndPets.MODID, "textures/entity/" + name + ".png");
		this.primaryColor = backgroundColor;
		this.secondaryColor = foregroundColor;
		this.spawnWeight = spawnWeight;
		this.spawnMin = spawnMin;
		this.spawnMax = spawnMax;

	}

	public final Class<? extends EntityMonster> getEntityClass() {
		return entityClass;
	}

	public final String getName() {
		return name;
	}

	public final ResourceLocation getTexture() {
		return texture;
	}

	public final int getBackgroundColor() {
		return primaryColor.getRGB();
	}

	public final int getForegroundColor() {
		return secondaryColor.getRGB();
	}

	public final int getSpawnWeight() { return spawnWeight;}

	public final int getSpawnMin() { return spawnMin;}

	public final int getSpawnMax() { return spawnMax;}

}

