package com.ldshadowlady.monstersandpets.monstersandpets;

import java.awt.*;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.EntityPetMountable;
import com.ldshadowlady.monstersandpets.entity.pet.mountable.EntityMysticalGoat;
import net.minecraft.util.ResourceLocation;

public enum PetsMountableType {
	MYSTICAL_GOAT(EntityMysticalGoat.class, "mystical_goat",
		new Color(255, 255, 255),
		new Color(15, 15, 15),
		1, 1, 1
	);

	private final Class<? extends EntityPetMountable> entityClass;

	private final String name;

	private final ResourceLocation texture;

	private final Color primaryColor;

	private final Color secondaryColor;

	private final int spawnWeight;

	private final int spawnMin;

	private final int spawnMax;

	PetsMountableType(Class<? extends EntityPetMountable> entityClass, String name, Color backgroundColor, Color foregroundColor,int spawnWeight,int spawnMin,int spawnMax) {
		this.entityClass = entityClass;
		this.name = name;
		this.texture = new ResourceLocation(MonstersAndPets.MODID, "textures/entity/" + name + ".png");
		this.primaryColor = backgroundColor;
		this.secondaryColor = foregroundColor;
		this.spawnWeight = spawnWeight;
		this.spawnMin = spawnMin;
		this.spawnMax = spawnMax;
	}

	public final Class<? extends EntityPetMountable> getEntityClass() {
		return entityClass;
	}

	public final String getName() {
		return name;
	}

	public final ResourceLocation getTexture() {
		return texture;
	}

	public final int getBackgroundColor() {return primaryColor.getRGB();}

	public final int getForegroundColor() { return secondaryColor.getRGB();	}

	public final int getSpawnWeight() { return spawnWeight;}

	public final int getSpawnMin() { return spawnMin;}

	public final int getSpawnMax() { return spawnMax;}

}

