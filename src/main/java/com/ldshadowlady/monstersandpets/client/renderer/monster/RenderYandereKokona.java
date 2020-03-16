package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.monster.EntityYandereKokona;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderYandereKokona extends RenderBiped<EntityYandereKokona> {

	public RenderYandereKokona(RenderManager manager) {
	super(manager, new ModelPlayer(0F,true), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityYandereKokona entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/yandere_kokona.png");
	}

	protected void preRenderCallback(EntityYandereKokona entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1F, 1F, 1F);
	}


}