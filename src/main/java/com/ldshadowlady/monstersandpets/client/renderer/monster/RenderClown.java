package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelFlower;
import com.ldshadowlady.monstersandpets.entity.monster.EntityClown;
import com.ldshadowlady.monstersandpets.entity.monster.EntityFlower;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderClown extends RenderBiped<EntityClown> {

	public RenderClown(RenderManager manager) {
	super(manager, new ModelPlayer(0F,false), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityClown entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/clown.png");
	}

	protected void preRenderCallback(EntityClown entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.9F, 0.8F, 0.9F);
	}


}