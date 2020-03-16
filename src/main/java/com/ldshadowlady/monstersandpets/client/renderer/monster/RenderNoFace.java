package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelNoFace;
import com.ldshadowlady.monstersandpets.entity.monster.EntityNoFace;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderNoFace extends RenderLiving<EntityNoFace> {

	public RenderNoFace(RenderManager manager) { super(manager, new ModelNoFace(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityNoFace entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/no_face.png");
	}
	//protected void preRenderCallback(EntityNoFace entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
	}

	protected void applyRotations(EntityNoFace entityLiving, float p_77043_2_, float rotationYaw, float partialTicks){
		GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0.3F) * 0.1F, 0.0F);
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}



}