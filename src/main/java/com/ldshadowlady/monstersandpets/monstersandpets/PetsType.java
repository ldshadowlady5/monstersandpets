package com.ldshadowlady.monstersandpets.monstersandpets;

import java.awt.Color;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.EntityPet;
import com.ldshadowlady.monstersandpets.entity.pet.*;
import net.minecraft.util.ResourceLocation;

public enum PetsType {
	WORPELTINGER(EntityWorpeltinger.class, "worpeltinger",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1, 1, 1
	),
	BOO(EntityBoo.class, "boo",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1, 1, 1
	),
	GOOSE(EntityGoose.class, "goose",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1, 1, 1
	),
	PASCAL(EntityPascal.class, "pascal",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1, 1, 1
	);

	private final Class<? extends EntityPet> entityClass;

	private final String name;

	private final ResourceLocation texture;

	private final Color primaryColor;

	private final Color secondaryColor;

	private final int spawnWeight;

	private final int spawnMin;

	private final int spawnMax;


	PetsType(Class<? extends EntityPet> entityClass, String name, Color backgroundColor, Color foregroundColor,int spawnWeight,int spawnMin,int spawnMax) {
		this.entityClass = entityClass;
		this.name = name;
		this.texture = new ResourceLocation(MonstersAndPets.MODID, "textures/entity/" + name + ".png");
		this.primaryColor = backgroundColor;
		this.secondaryColor = foregroundColor;
		this.spawnWeight = spawnWeight;
		this.spawnMin = spawnMin;
		this.spawnMax = spawnMax;
	}

	public final Class<? extends EntityPet> getEntityClass() {
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

