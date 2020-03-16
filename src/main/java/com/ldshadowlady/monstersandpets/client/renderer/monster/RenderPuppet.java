package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelPuppet;
import com.ldshadowlady.monstersandpets.entity.monster.EntityPuppet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderPuppet extends RenderLiving<EntityPuppet> {

	public RenderPuppet(RenderManager manager) { super(manager, new ModelPuppet(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPuppet entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/puppet.png");
	}
	protected void preRenderCallback(EntityPuppet entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.75F, 0.75F, 0.75F);
	}

	protected void applyRotations(EntityPuppet entityLiving, float p_77043_2_, float rotationYaw, float partialTicks){
		GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0F) * 0F, 0F);
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}



}