package com.ldshadowlady.monstersandpets.client.renderer.pet;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.pets.ModelGoose;
import com.ldshadowlady.monstersandpets.entity.pet.EntityGoose;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderGoose extends RenderLiving<EntityGoose> {

	public RenderGoose(RenderManager manager) {
	super(manager, new ModelGoose(), 0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGoose entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/goose.png");
	}

}