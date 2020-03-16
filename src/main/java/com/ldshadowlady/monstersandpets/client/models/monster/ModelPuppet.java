package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * FNAFPuppet - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelPuppet extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer torso;
    public ModelRenderer armRight;
    public ModelRenderer crotch;
    public ModelRenderer legRight;
    public ModelRenderer legLeft;
    public ModelRenderer armLeft;
    public ModelRenderer head;
    public ModelRenderer armRight2;
    public ModelRenderer fingerRight;
    public ModelRenderer fingerRight2;
    public ModelRenderer fingerRight3;
    public ModelRenderer legRight2;
    public ModelRenderer legLeft2;
    public ModelRenderer armLeft2;
    public ModelRenderer fingerLeft;
    public ModelRenderer fingerLeft2;
    public ModelRenderer fingerLeft3;

    public ModelPuppet() {
        this.textureWidth = 100;
        this.textureHeight = 80;
        this.crotch = new ModelRenderer(this, 52, 0);
        this.crotch.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.crotch.addBox(-3.5F, 0.0F, -2.5F, 7, 6, 5, 0.0F);
        this.legLeft2 = new ModelRenderer(this, 16, 20);
        this.legLeft2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.legLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(legLeft2, 0.03490658503988659F, 0.0F, 0.0F);
        this.fingerLeft2 = new ModelRenderer(this, 92, 0);
        this.fingerLeft2.setRotationPoint(0.4F, 10.0F, 0.4F);
        this.fingerLeft2.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(fingerLeft2, 0.05235987755982988F, 0.0F, 0.3490658503988659F);
        this.armLeft2 = new ModelRenderer(this, 24, 20);
        this.armLeft2.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.armLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armLeft2, -0.17453292519943295F, 0.0F, 0.0F);
        this.legLeft = new ModelRenderer(this, 84, 0);
        this.legLeft.setRotationPoint(1.9F, 12.5F, 0.0F);
        this.legLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.fingerLeft3 = new ModelRenderer(this, 75, 10);
        this.fingerLeft3.setRotationPoint(-0.4F, 9.5F, 0.0F);
        this.fingerLeft3.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(fingerLeft3, 0.05235987755982988F, 0.0F, 0.6108652381980153F);
        this.fingerRight2 = new ModelRenderer(this, 12, 0);
        this.fingerRight2.setRotationPoint(-0.4F, 10.0F, 0.4F);
        this.fingerRight2.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(fingerRight2, 0.05235987755982988F, 0.0F, -0.3490658503988659F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -6.4F, 0.0F);
        this.body.addBox(-1.0F, -14.0F, -1.0F, 2, 24, 2, 0.0F);
        this.fingerLeft = new ModelRenderer(this, 40, 0);
        this.fingerLeft.setRotationPoint(0.4F, 10.0F, -0.4F);
        this.fingerLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(fingerLeft, -0.05235987755982988F, 0.0F, 0.17453292519943295F);
        this.fingerRight = new ModelRenderer(this, 8, 0);
        this.fingerRight.setRotationPoint(-0.4F, 10.0F, -0.4F);
        this.fingerRight.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(fingerRight, -0.05235987755982988F, 0.0F, -0.17453292519943295F);
        this.armRight = new ModelRenderer(this, 44, 0);
        this.armRight.setRotationPoint(-5.0F, -8.0F, 0.0F);
        this.armRight.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armRight, 0.0F, 0.0F, 0.2617993877991494F);
        this.fingerRight3 = new ModelRenderer(this, 36, 0);
        this.fingerRight3.setRotationPoint(0.4F, 9.5F, 0.0F);
        this.fingerRight3.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(fingerRight3, 0.05235987755982988F, 0.0F, -0.6108652381980153F);
        this.torso = new ModelRenderer(this, 8, 0);
        this.torso.setRotationPoint(0.0F, -3.5F, 0.0F);
        this.torso.addBox(-5.0F, -6.0F, -4.0F, 10, 12, 8, 0.0F);
        this.setRotateAngle(torso, 0.017453292519943295F, 0.0F, 0.0F);
        this.armRight2 = new ModelRenderer(this, 83, 18);
        this.armRight2.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.armRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armRight2, -0.17453292519943295F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 43, 11);
        this.head.setRotationPoint(0.0F, -14.0F, -0.5F);
        this.head.addBox(-5.5F, -11.0F, -4.5F, 11, 11, 9, 0.0F);
        this.armLeft = new ModelRenderer(this, 90, 8);
        this.armLeft.setRotationPoint(5.0F, -8.0F, 0.0F);
        this.armLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armLeft, 0.0F, 0.0F, -0.2617993877991494F);
        this.legRight2 = new ModelRenderer(this, 8, 20);
        this.legRight2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.legRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(legRight2, 0.03490658503988659F, 0.0F, 0.0F);
        this.legRight = new ModelRenderer(this, 76, 0);
        this.legRight.setRotationPoint(-1.9F, 12.5F, 0.0F);
        this.legRight.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.body.addChild(this.crotch);
        this.legLeft.addChild(this.legLeft2);
        this.armLeft2.addChild(this.fingerLeft2);
        this.armLeft.addChild(this.armLeft2);
        this.body.addChild(this.legLeft);
        this.armLeft2.addChild(this.fingerLeft3);
        this.armRight2.addChild(this.fingerRight2);
        this.armLeft2.addChild(this.fingerLeft);
        this.armRight2.addChild(this.fingerRight);
        this.body.addChild(this.armRight);
        this.armRight2.addChild(this.fingerRight3);
        this.body.addChild(this.torso);
        this.armRight.addChild(this.armRight2);
        this.body.addChild(this.head);
        this.body.addChild(this.armLeft);
        this.legRight.addChild(this.legRight2);
        this.body.addChild(this.legRight);
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        armLeft.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 0.6F * speed;
        armRight.rotateAngleX = MathHelper.cos(swing * 0.7F) * 0.6F * speed;
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
