package com.ldshadowlady.monstersandpets.client.renderer.pet;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.pets.ModelBoo;
import com.ldshadowlady.monstersandpets.entity.pet.EntityBoo;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderBoo extends RenderLiving<EntityBoo> {

	public RenderBoo(RenderManager manager) {
	super(manager, new ModelBoo(), 0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBoo entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/boo.png");
	}

}