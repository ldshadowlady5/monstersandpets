package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.monster.EntityYandereKatelyn;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderYandereKatelyn extends RenderBiped<EntityYandereKatelyn> {

	public RenderYandereKatelyn(RenderManager manager) {
	super(manager, new ModelPlayer(0F,true), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityYandereKatelyn entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/yandere_katelyn.png");
	}

	protected void preRenderCallback(EntityYandereKatelyn entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1F, 1F, 1F);
	}


}