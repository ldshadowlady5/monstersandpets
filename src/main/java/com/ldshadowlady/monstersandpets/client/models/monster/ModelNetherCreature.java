package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * NetherCreature - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelNetherCreature extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer tail;
    public ModelRenderer legLeft;
    public ModelRenderer legRight;
    public ModelRenderer toothTop;
    public ModelRenderer toothRight;
    public ModelRenderer toothLeft;
    public ModelRenderer tail2;
    public ModelRenderer footLeft;
    public ModelRenderer footRight;

    public ModelNetherCreature() {
        this.textureWidth = 107;
        this.textureHeight = 70;
        this.toothRight = new ModelRenderer(this, 0, 8);
        this.toothRight.setRotationPoint(-2.5F, 0.0F, -9.5F);
        this.toothRight.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(toothRight, -0.17453292519943295F, -0.08726646259971647F, 0.0F);
        this.footLeft = new ModelRenderer(this, 0, 26);
        this.footLeft.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.footLeft.addBox(-1.0F, 0.0F, -6.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(footLeft, -0.3490658503988659F, 0.0F, 0.0F);
        this.toothTop = new ModelRenderer(this, 0, 0);
        this.toothTop.setRotationPoint(0.0F, -6.3F, -9.5F);
        this.toothTop.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(toothTop, 0.17453292519943295F, 0.0F, 0.0F);
        this.toothLeft = new ModelRenderer(this, 90, 16);
        this.toothLeft.setRotationPoint(2.5F, 0.0F, -9.5F);
        this.toothLeft.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(toothLeft, -0.17453292519943295F, 0.08726646259971647F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 15.1F, 0.0F);
        this.body.addBox(-6.0F, -5.0F, -8.0F, 12, 10, 16, 0.0F);
        this.footRight = new ModelRenderer(this, 16, 26);
        this.footRight.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.footRight.addBox(-1.0F, 0.0F, -6.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(footRight, -0.3490658503988659F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 68, 24);
        this.tail2.setRotationPoint(0.0F, -0.5F, 8.5F);
        this.tail2.addBox(-6.0F, -1.0F, 0.0F, 12, 2, 5, 0.0F);
        this.head = new ModelRenderer(this, 56, 0);
        this.head.setRotationPoint(0.0F, -4.5F, -5.5F);
        this.head.addBox(-4.0F, -8.0F, -10.0F, 8, 10, 12, 0.0F);
        this.legLeft = new ModelRenderer(this, 40, 0);
        this.legLeft.setRotationPoint(6.5F, 1.9F, 3.5F);
        this.legLeft.addBox(-1.5F, -1.5F, -4.5F, 3, 6, 6, 0.0F);
        this.setRotateAngle(legLeft, 0.3490658503988659F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 47, 22);
        this.tail.setRotationPoint(0.0F, -1.5F, 7.0F);
        this.tail.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 9, 0.0F);
        this.setRotateAngle(tail, 0.17453292519943295F, 0.0F, 0.0F);
        this.legRight = new ModelRenderer(this, 84, 0);
        this.legRight.setRotationPoint(-6.5F, 1.9F, 3.5F);
        this.legRight.addBox(-1.5F, -1.5F, -4.5F, 3, 6, 6, 0.0F);
        this.setRotateAngle(legRight, 0.3490658503988659F, 0.0F, 0.0F);
        this.head.addChild(this.toothRight);
        this.legLeft.addChild(this.footLeft);
        this.head.addChild(this.toothTop);
        this.head.addChild(this.toothLeft);
        this.legRight.addChild(this.footRight);
        this.tail.addChild(this.tail2);
        this.body.addChild(this.head);
        this.body.addChild(this.legLeft);
        this.body.addChild(this.tail);
        this.body.addChild(this.legRight);
    }

	@Override
	public void render(Entity entity, float swing, float speed, float age, float yaw, float pitch, float scale) {
		setRotationAngles(swing, speed, age, yaw, pitch, scale, entity);
		GlStateManager.pushMatrix();
		float sc = 0.35F;
		GlStateManager.scale(sc, sc, sc);
		GlStateManager.translate(0, (1 / sc - 1) * 24 * scale, 0);
		body.render(scale);
		//bodyLower.render(scale);
		GlStateManager.popMatrix();
	}

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
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
