package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * PigManThing - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelPigMan extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer body2;
    public ModelRenderer legBackLeft;
    public ModelRenderer legBackRight;
    public ModelRenderer humanBody;
    public ModelRenderer legFrontRight;
    public ModelRenderer legFrontLeft;
    public ModelRenderer tail;
    public ModelRenderer humanTorso;
    public ModelRenderer head;
    public ModelRenderer armRight;
    public ModelRenderer armLeft;
    public ModelRenderer armRight2;
    public ModelRenderer armLeft2;

    public ModelPigMan() {
        this.textureWidth = 140;
        this.textureHeight = 70;
        this.humanTorso = new ModelRenderer(this, 90, 35);
        this.humanTorso.setRotationPoint(0.0F, -7.0F, 0.5F);
        this.humanTorso.addBox(-5.5F, -8.0F, -5.0F, 11, 8, 10, 0.0F);
        this.setRotateAngle(humanTorso, -0.08726646259971647F, 0.0F, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 78, 26);
        this.armLeft2.setRotationPoint(1.0F, 4.6F, 0.0F);
        this.armLeft2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(armLeft2, -0.05235987755982988F, 0.0F, 0.13962634015954636F);
        this.head = new ModelRenderer(this, 11, 40);
        this.head.setRotationPoint(0.0F, -7.5F, -0.5F);
        this.head.addBox(-4.5F, -9.0F, -4.5F, 9, 9, 9, 0.0F);
        this.setRotateAngle(head, 0.13962634015954636F, 0.0F, 0.0F);
        this.legFrontRight = new ModelRenderer(this, 0, 28);
        this.legFrontRight.setRotationPoint(-4.5F, 0.0F, -0.5F);
        this.legFrontRight.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(legFrontRight, 0.06981317007977318F, 0.0F, 0.0F);
        this.humanBody = new ModelRenderer(this, 42, 26);
        this.humanBody.setRotationPoint(0.0F, -1.2F, -1.0F);
        this.humanBody.addBox(-6.0F, -8.0F, -6.0F, 12, 11, 12, 0.0F);
        this.setRotateAngle(humanBody, 0.10471975511965977F, 0.0F, 0.0F);
        this.legBackRight = new ModelRenderer(this, 104, 20);
        this.legBackRight.setRotationPoint(-4.5F, 0.2F, 3.0F);
        this.legBackRight.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(legBackRight, -0.05235987755982988F, 0.0F, 0.0F);
        this.legFrontLeft = new ModelRenderer(this, 104, 0);
        this.legFrontLeft.setRotationPoint(4.5F, 0.0F, -0.5F);
        this.legFrontLeft.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(legFrontLeft, 0.06981317007977318F, 0.0F, 0.0F);
        this.armLeft = new ModelRenderer(this, 71, 49);
        this.armLeft.setRotationPoint(5.5F, -5.0F, 0.0F);
        this.armLeft.addBox(-2.0F, -2.0F, -3.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(armLeft, -0.08726646259971647F, 0.0F, -0.40142572795869574F);
        this.legBackLeft = new ModelRenderer(this, 119, 10);
        this.legBackLeft.setRotationPoint(4.5F, 0.2F, 3.0F);
        this.legBackLeft.addBox(-2.5F, 0.0F, -2.5F, 5, 10, 5, 0.0F);
        this.setRotateAngle(legBackLeft, -0.05235987755982988F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 0);
        this.tail.setRotationPoint(0.0F, -6.5F, 16.2F);
        this.tail.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(tail, -0.5235987755982988F, 0.0F, 0.0F);
        this.armRight2 = new ModelRenderer(this, 39, 0);
        this.armRight2.setRotationPoint(-1.0F, 4.6F, 0.0F);
        this.armRight2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(armRight2, -0.05235987755982988F, 0.0F, -0.13962634015954636F);
        this.armRight = new ModelRenderer(this, 47, 49);
        this.armRight.setRotationPoint(-5.5F, -5.0F, 0.0F);
        this.armRight.addBox(-4.0F, -2.0F, -3.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(armRight, -0.08726646259971647F, 0.0F, 0.40142572795869574F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.body.addBox(-6.0F, -7.0F, -7.5F, 12, 13, 15, 0.0F);
        this.setRotateAngle(body, 0.05235987755982988F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 54, 0);
        this.body2.setRotationPoint(0.0F, -0.5F, -10.0F);
        this.body2.addBox(-6.5F, -7.5F, -6.0F, 13, 14, 12, 0.0F);
        this.setRotateAngle(body2, -0.12217304763960307F, 0.0F, 0.0F);
        this.humanBody.addChild(this.humanTorso);
        this.armLeft.addChild(this.armLeft2);
        this.humanTorso.addChild(this.head);
        this.body2.addChild(this.legFrontRight);
        this.body2.addChild(this.humanBody);
        this.body.addChild(this.legBackRight);
        this.body2.addChild(this.legFrontLeft);
        this.humanTorso.addChild(this.armLeft);
        this.body.addChild(this.legBackLeft);
        this.body2.addChild(this.tail);
        this.armRight.addChild(this.armRight2);
        this.humanTorso.addChild(this.armRight);
        this.body.addChild(this.body2);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legBackRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legBackLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        legFrontLeft.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legFrontRight.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        armLeft.rotateAngleX = MathHelper.cos(swing * 0.2F + (float) Math.PI) * 1F * speed;
        armRight.rotateAngleX = MathHelper.cos(swing * 0.2F) * 1F * speed;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
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
