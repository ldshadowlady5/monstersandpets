package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/* MinecraftFlower - Jvckk
	 * Created using Tabula 5.1.0
	 */
public class ModelFlower extends ModelBase {
	public ModelRenderer plane1;
	public ModelRenderer plane2;

	public ModelFlower() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.plane1 = new ModelRenderer(this, 12, 8);
		this.plane1.setRotationPoint(0.0F, 20.0F, 0.0F);
		this.plane1.addBox(-3.0F, -4.0F, 0.0F, 6, 8, 0, 0.0F);
		this.setRotateAngle(plane1, 0.0F, 0.7853981633974483F, 0.0F);
		this.plane2 = new ModelRenderer(this, 12, 8);
		this.plane2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.plane2.addBox(-3.0F, -4.0F, 0.0F, 6, 8, 0, 0.0F);
		this.setRotateAngle(plane2, 0.0F, -1.5707963267948966F, 0.0F);
		this.plane1.addChild(this.plane2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.plane1.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}