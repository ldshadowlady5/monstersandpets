package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelPumpkinGhast;
import com.ldshadowlady.monstersandpets.entity.monster.EntityPumpkinGhast;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderPumpkinGhast extends RenderLiving<EntityPumpkinGhast> {

	public RenderPumpkinGhast(RenderManager manager) { super(manager, new ModelPumpkinGhast(), 0.3F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPumpkinGhast entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/pumpkin_ghast.png");
	}
	//protected void preRenderCallback(EntityPumpkinGhast entitylivingbaseIn, float partialTickTime)
	{
		GlStateManager.scale(0.25F, 0.25F, 0.25F);
	}

	protected void applyRotations(EntityPumpkinGhast entityLiving, float p_77043_2_, float rotationYaw, float partialTicks){
		GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0.03F) * 0.3F, 0.0F);
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}



}