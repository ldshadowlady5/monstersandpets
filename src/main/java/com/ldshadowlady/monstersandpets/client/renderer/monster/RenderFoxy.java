package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelFoxy;
import com.ldshadowlady.monstersandpets.entity.monster.EntityFoxy;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderFoxy extends RenderLiving<EntityFoxy> {

	public RenderFoxy(RenderManager manager) { super(manager, new ModelFoxy(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityFoxy entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/foxy.png");
	}
	protected void preRenderCallback(EntityFoxy entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.75F, 0.75F, 0.75F);
	}

	protected void applyRotations(EntityFoxy entityLiving, float p_77043_2_, float rotationYaw, float partialTicks){
		GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0F) * 0F, 0F);
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}



}