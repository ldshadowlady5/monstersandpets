package com.ldshadowlady.monstersandpets.client.renderer.pet;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.pets.ModelGoose;
import com.ldshadowlady.monstersandpets.client.models.pets.ModelPascal;
import com.ldshadowlady.monstersandpets.entity.pet.EntityGoose;
import com.ldshadowlady.monstersandpets.entity.pet.EntityPascal;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderPascal extends RenderLiving<EntityPascal> {

	public RenderPascal(RenderManager manager) {
	super(manager, new ModelPascal(), 0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPascal entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/pascal.png");
	}

}