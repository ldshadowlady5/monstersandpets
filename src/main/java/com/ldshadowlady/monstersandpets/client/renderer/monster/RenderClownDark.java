package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.monster.EntityClownDark;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderClownDark extends RenderBiped<EntityClownDark> {

	public RenderClownDark(RenderManager manager) {
	super(manager, new ModelPlayer(0F,false), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityClownDark entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/clown_dark.png");
	}

	protected void preRenderCallback(EntityClownDark entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.4F, 1.4F, 1.4F);
	}


}