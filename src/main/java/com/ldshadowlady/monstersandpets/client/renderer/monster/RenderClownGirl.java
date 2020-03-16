package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.monster.EntityClown;
import com.ldshadowlady.monstersandpets.entity.monster.EntityClownGirl;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderClownGirl extends RenderBiped<EntityClownGirl> {

	public RenderClownGirl(RenderManager manager) {
	super(manager, new ModelPlayer(0F,false), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityClownGirl entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/clown_girl.png");
	}

	protected void preRenderCallback(EntityClownGirl entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1F, 1F, 1F);
	}


}