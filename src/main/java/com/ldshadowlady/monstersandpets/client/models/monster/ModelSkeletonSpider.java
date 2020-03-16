package com.ldshadowlady.monstersandpets.client.models.monster;


import net.minecraft.client.model.*;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * SkeletonSpider - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelSkeletonSpider extends ModelBase {
	public ModelRenderer head;
	public ModelRenderer jaw;
	public ModelRenderer legRight1;
	public ModelRenderer legRight2;
	public ModelRenderer legRight3;
	public ModelRenderer legRight4;
	public ModelRenderer legLeft1;
	public ModelRenderer legRight2_1;
	public ModelRenderer legRight3_1;
	public ModelRenderer legRight4_1;

	public ModelSkeletonSpider() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.legRight3_1 = new ModelRenderer(this, 33, 4);
		this.legRight3_1.setRotationPoint(3.0F, 1.2F, 1.4F);
		this.legRight3_1.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legRight3_1, 0.1308996938995747F, -0.08726646259971647F, 0.17453292519943295F);
		this.legRight3 = new ModelRenderer(this, 53, 1);
		this.legRight3.setRotationPoint(-3.0F, 1.2F, 1.4F);
		this.legRight3.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legRight3, 0.1308996938995747F, 0.08726646259971647F, -0.17453292519943295F);
		this.legRight2_1 = new ModelRenderer(this, 44, 3);
		this.legRight2_1.setRotationPoint(3.0F, 1.4F, 0.6F);
		this.legRight2_1.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legRight2_1, 0.1308996938995747F, 0.061086523819801536F, 0.17453292519943295F);
		this.legRight1 = new ModelRenderer(this, 34, 0);
		this.legRight1.setRotationPoint(-3.0F, 1.6F, -0.3F);
		this.legRight1.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legRight1, 0.1308996938995747F, -0.20943951023931953F, -0.17453292519943295F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, 21.5F, 0.0F);
		this.head.addBox(-4.0F, -4.0F, -4.0F, 8, 6, 8, 0.0F);
		this.setRotateAngle(head, -0.1308996938995747F, 0.0F, 0.0F);
		this.jaw = new ModelRenderer(this, 24, 0);
		this.jaw.setRotationPoint(0.0F, 2.5F, -2.8F);
		this.jaw.addBox(-2.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.legRight4 = new ModelRenderer(this, 24, 3);
		this.legRight4.setRotationPoint(-3.0F, 1.0F, 2.3F);
		this.legRight4.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legRight4, 0.1308996938995747F, 0.20943951023931953F, -0.17453292519943295F);
		this.legLeft1 = new ModelRenderer(this, 35, 2);
		this.legLeft1.setRotationPoint(3.0F, 1.5F, -0.3F);
		this.legLeft1.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legLeft1, 0.1308996938995747F, 0.20943951023931953F, 0.17453292519943295F);
		this.legRight2 = new ModelRenderer(this, 44, 0);
		this.legRight2.setRotationPoint(-3.0F, 1.4F, 0.6F);
		this.legRight2.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legRight2, 0.1308996938995747F, -0.061086523819801536F, -0.17453292519943295F);
		this.legRight4_1 = new ModelRenderer(this, 53, 4);
		this.legRight4_1.setRotationPoint(3.0F, 1.0F, 2.3F);
		this.legRight4_1.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
		this.setRotateAngle(legRight4_1, 0.1308996938995747F, -0.20943951023931953F, 0.17453292519943295F);
		this.head.addChild(this.legRight3_1);
		this.head.addChild(this.legRight3);
		this.head.addChild(this.legRight2_1);
		this.head.addChild(this.legRight1);
		this.head.addChild(this.jaw);
		this.head.addChild(this.legRight4);
		this.head.addChild(this.legLeft1);
		this.head.addChild(this.legRight2);
		this.head.addChild(this.legRight4_1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.head.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
		// Change the 1.2F for leg length (shorter = smaller/ longer = bigger
		// number)
		// Change the 0.7F (increase to increase speed legs move)
		this.head.addChild(this.legRight3_1);
		this.head.addChild(this.legRight3);
		this.head.addChild(this.legRight2_1);
		this.head.addChild(this.legRight1);
		this.head.addChild(this.jaw);
		this.head.addChild(this.legRight4);
		this.head.addChild(this.legLeft1);
		this.head.addChild(this.legRight2);
		this.head.addChild(this.legRight4_1);

		legRight3_1.rotateAngleX = MathHelper.cos(swing * 17F + (float) Math.PI) * 0.2F * speed;
		legRight3.rotateAngleX = MathHelper.cos(swing * 17F + (float) Math.PI) * 0.2F * speed;
		legRight2.rotateAngleX = MathHelper.cos(swing * 17F + (float) Math.PI) * 0.2F * speed;
		legRight1.rotateAngleX = MathHelper.cos(swing * 1.7F + (float) Math.PI) * 0.2F * speed;
		legRight4.rotateAngleX = MathHelper.cos(swing * 1.7F + (float) Math.PI) * 0.2F * speed;

		legRight4_1.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
		legRight2.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI);
		legRight2_1.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed * 1.2F * speed;
	}



}