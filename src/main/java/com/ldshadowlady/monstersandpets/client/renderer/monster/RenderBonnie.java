package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelBonnie;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelNoFace;
import com.ldshadowlady.monstersandpets.entity.monster.EntityBonnie;
import com.ldshadowlady.monstersandpets.entity.monster.EntityNoFace;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderBonnie extends RenderLiving<EntityBonnie> {

	public RenderBonnie(RenderManager manager) { super(manager, new ModelBonnie(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBonnie entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/bonnie.png");
	}
	protected void preRenderCallback(EntityBonnie entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.75F, 0.75F, 0.75F);
	}

	protected void applyRotations(EntityBonnie entityLiving, float p_77043_2_, float rotationYaw, float partialTicks){
		GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0F) * 0F, 0F);
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}



}