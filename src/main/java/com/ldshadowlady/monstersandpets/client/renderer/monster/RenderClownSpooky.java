package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.monster.EntityClownSpooky;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderClownSpooky extends RenderBiped<EntityClownSpooky> {

	public RenderClownSpooky(RenderManager manager) {
	super(manager, new ModelPlayer(0F,false), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityClownSpooky entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/clown_spooky.png");
	}

	protected void preRenderCallback(EntityClownSpooky entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(1.25F, 1.25F, 1.25F);
	}


}