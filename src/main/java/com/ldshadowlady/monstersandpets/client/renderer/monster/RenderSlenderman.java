package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelSlenderman;
import com.ldshadowlady.monstersandpets.entity.monster.EntitySlenderman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderSlenderman extends RenderLiving<EntitySlenderman> {

	public RenderSlenderman(RenderManager manager) {
	super(manager, new ModelSlenderman(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySlenderman entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/slenderman.png");
	}



}