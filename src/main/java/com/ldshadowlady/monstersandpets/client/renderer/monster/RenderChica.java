package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelChica;
import com.ldshadowlady.monstersandpets.entity.monster.EntityChica;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderChica extends RenderLiving<EntityChica> {

	public RenderChica(RenderManager manager) { super(manager, new ModelChica(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityChica entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/chica.png");
	}
	protected void preRenderCallback(EntityChica entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.75F, 0.75F, 0.75F);
	}

	protected void applyRotations(EntityChica entityLiving, float p_77043_2_, float rotationYaw, float partialTicks){
		GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0F) * 0F, 0F);
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}



}