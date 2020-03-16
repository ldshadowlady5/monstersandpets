package com.ldshadowlady.monstersandpets.client.renderer.pet;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.pets.ModelWorpeltinger;
import com.ldshadowlady.monstersandpets.entity.pet.EntityWorpeltinger;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderWorpeltinger extends RenderLiving<EntityWorpeltinger> {

	public RenderWorpeltinger(RenderManager manager) {
	super(manager, new ModelWorpeltinger(), 0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWorpeltinger entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/worpeltinger.png");
	}

}