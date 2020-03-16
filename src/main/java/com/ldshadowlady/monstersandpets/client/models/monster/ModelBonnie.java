package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * FNAFBonnie - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelBonnie extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer torso;
    public ModelRenderer armRight;
    public ModelRenderer crotch;
    public ModelRenderer legRight;
    public ModelRenderer legLeft;
    public ModelRenderer armLeft;
    public ModelRenderer head;
    public ModelRenderer armRightpad;
    public ModelRenderer armRight2;
    public ModelRenderer armRightpad2;
    public ModelRenderer handRight;
    public ModelRenderer legRightpad;
    public ModelRenderer legRight2;
    public ModelRenderer legRightpad2;
    public ModelRenderer footRight;
    public ModelRenderer legLeftpad;
    public ModelRenderer legLeft2;
    public ModelRenderer legLeftpad2;
    public ModelRenderer footLeft;
    public ModelRenderer armLeftpad;
    public ModelRenderer armLeft2;
    public ModelRenderer armLeftpad2;
    public ModelRenderer handLeft;
    public ModelRenderer jaw;
    public ModelRenderer nose;
    public ModelRenderer earRight;
    public ModelRenderer earLeft;
    public ModelRenderer earRightpad;
    public ModelRenderer earRightpad2;
    public ModelRenderer earRightpad_1;
    public ModelRenderer earRightpad2_1;

    public ModelBonnie() {
        this.textureWidth = 100;
        this.textureHeight = 80;
        this.jaw = new ModelRenderer(this, 49, 65);
        this.jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.jaw.addBox(-5.0F, 0.0F, -4.5F, 10, 3, 9, 0.0F);
        this.setRotateAngle(jaw, 0.08726646259971647F, 0.0F, 0.0F);
        this.armRightpad2 = new ModelRenderer(this, 0, 26);
        this.armRightpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armRightpad2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.armLeftpad2 = new ModelRenderer(this, 0, 58);
        this.armLeftpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armLeftpad2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.handRight = new ModelRenderer(this, 20, 26);
        this.handRight.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.handRight.addBox(-2.0F, 0.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(handRight, 0.0F, 0.0F, -0.05235987755982988F);
        this.earRightpad2 = new ModelRenderer(this, 40, 39);
        this.earRightpad2.setRotationPoint(0.0F, -6.5F, 0.0F);
        this.earRightpad2.addBox(-2.0F, -4.0F, -1.0F, 4, 4, 2, 0.0F);
        this.head = new ModelRenderer(this, 39, 22);
        this.head.setRotationPoint(0.0F, -13.0F, -0.5F);
        this.head.addBox(-5.5F, -8.0F, -4.5F, 11, 8, 9, 0.0F);
        this.earRightpad = new ModelRenderer(this, 70, 24);
        this.earRightpad.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.earRightpad.addBox(-2.0F, -5.0F, -1.0F, 4, 5, 2, 0.0F);
        this.footLeft = new ModelRenderer(this, 72, 50);
        this.footLeft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footLeft.addBox(-2.5F, 0.0F, -6.0F, 5, 3, 8, 0.0F);
        this.setRotateAngle(footLeft, -0.03490658503988659F, 0.0F, 0.0F);
        this.nose = new ModelRenderer(this, 85, 0);
        this.nose.setRotationPoint(0.0F, -1.5F, -4.5F);
        this.nose.addBox(-2.5F, -1.5F, -2.0F, 5, 3, 2, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 90, 48);
        this.armLeft2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.armLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(armLeft2, -0.17453292519943295F, 0.0F, 0.0F);
        this.earRightpad_1 = new ModelRenderer(this, 20, 63);
        this.earRightpad_1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.earRightpad_1.addBox(-2.0F, -5.0F, -1.0F, 4, 5, 2, 0.0F);
        this.crotch = new ModelRenderer(this, 56, 0);
        this.crotch.setRotationPoint(0.0F, 9.5F, 0.0F);
        this.crotch.addBox(-5.5F, 0.0F, -3.5F, 11, 3, 7, 0.0F);
        this.legRightpad = new ModelRenderer(this, 73, 33);
        this.legRightpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legRightpad.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.armRight2 = new ModelRenderer(this, 90, 20);
        this.armRight2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.armRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(armRight2, -0.17453292519943295F, 0.0F, 0.0F);
        this.legLeftpad = new ModelRenderer(this, 48, 39);
        this.legLeftpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legLeftpad.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.legLeftpad2 = new ModelRenderer(this, 16, 50);
        this.legLeftpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legLeftpad2.addBox(-2.5F, 0.0F, -3.0F, 5, 7, 6, 0.0F);
        this.legLeft2 = new ModelRenderer(this, 72, 48);
        this.legLeft2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.legLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(legLeft2, 0.03490658503988659F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.body.addBox(-1.0F, -14.0F, -1.0F, 2, 24, 2, 0.0F);
        this.legLeft = new ModelRenderer(this, 54, 10);
        this.legLeft.setRotationPoint(3.3F, 12.5F, 0.0F);
        this.legLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.torso = new ModelRenderer(this, 8, 0);
        this.torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.torso.addBox(-6.0F, -9.0F, -4.0F, 12, 18, 8, 0.0F);
        this.setRotateAngle(torso, 0.017453292519943295F, 0.0F, 0.0F);
        this.legRight2 = new ModelRenderer(this, 20, 35);
        this.legRight2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.legRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(legRight2, 0.03490658503988659F, 0.0F, 0.0F);
        this.handLeft = new ModelRenderer(this, 58, 56);
        this.handLeft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.handLeft.addBox(-2.0F, 0.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(handLeft, 0.0F, 0.0F, 0.05235987755982988F);
        this.earRight = new ModelRenderer(this, 78, 61);
        this.earRight.setRotationPoint(-2.5F, -7.5F, 0.0F);
        this.earRight.addBox(-1.0F, -10.0F, -0.5F, 2, 10, 1, 0.0F);
        this.setRotateAngle(earRight, 0.05235987755982988F, 0.0F, -0.05235987755982988F);
        this.legRight = new ModelRenderer(this, 90, 8);
        this.legRight.setRotationPoint(-3.3F, 12.5F, 0.0F);
        this.legRight.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.footRight = new ModelRenderer(this, 22, 39);
        this.footRight.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footRight.addBox(-2.5F, 0.0F, -6.0F, 5, 3, 8, 0.0F);
        this.setRotateAngle(footRight, -0.03490658503988659F, 0.0F, 0.0F);
        this.armLeft = new ModelRenderer(this, 62, 10);
        this.armLeft.setRotationPoint(6.5F, -8.0F, 0.0F);
        this.armLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armLeft, 0.0F, 0.0F, -0.2617993877991494F);
        this.legRightpad2 = new ModelRenderer(this, 0, 39);
        this.legRightpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legRightpad2.addBox(-2.5F, 0.0F, -3.0F, 5, 7, 6, 0.0F);
        this.earRightpad2_1 = new ModelRenderer(this, 0, 52);
        this.earRightpad2_1.setRotationPoint(0.0F, -6.5F, 0.0F);
        this.earRightpad2_1.addBox(-2.0F, -4.0F, -1.0F, 4, 4, 2, 0.0F);
        this.armRightpad = new ModelRenderer(this, 70, 10);
        this.armRightpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armRightpad.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.armLeftpad = new ModelRenderer(this, 38, 54);
        this.armLeftpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armLeftpad.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.armRight = new ModelRenderer(this, 48, 0);
        this.armRight.setRotationPoint(-6.5F, -8.0F, 0.0F);
        this.armRight.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armRight, 0.0F, 0.0F, 0.2617993877991494F);
        this.earLeft = new ModelRenderer(this, 84, 61);
        this.earLeft.setRotationPoint(2.5F, -7.5F, 0.0F);
        this.earLeft.addBox(-1.0F, -10.0F, -0.5F, 2, 10, 1, 0.0F);
        this.setRotateAngle(earLeft, 0.05235987755982988F, 0.0F, 0.05235987755982988F);
        this.head.addChild(this.jaw);
        this.armRight2.addChild(this.armRightpad2);
        this.armLeft2.addChild(this.armLeftpad2);
        this.armRight2.addChild(this.handRight);
        this.earRight.addChild(this.earRightpad2);
        this.body.addChild(this.head);
        this.earRight.addChild(this.earRightpad);
        this.legLeft2.addChild(this.footLeft);
        this.head.addChild(this.nose);
        this.armLeft.addChild(this.armLeft2);
        this.earLeft.addChild(this.earRightpad_1);
        this.body.addChild(this.crotch);
        this.legRight.addChild(this.legRightpad);
        this.armRight.addChild(this.armRight2);
        this.legLeft.addChild(this.legLeftpad);
        this.legLeft2.addChild(this.legLeftpad2);
        this.legLeft.addChild(this.legLeft2);
        this.body.addChild(this.legLeft);
        this.body.addChild(this.torso);
        this.legRight.addChild(this.legRight2);
        this.armLeft2.addChild(this.handLeft);
        this.head.addChild(this.earRight);
        this.body.addChild(this.legRight);
        this.legRight2.addChild(this.footRight);
        this.body.addChild(this.armLeft);
        this.legRight2.addChild(this.legRightpad2);
        this.earLeft.addChild(this.earRightpad2_1);
        this.armRight.addChild(this.armRightpad);
        this.armLeft.addChild(this.armLeftpad);
        this.body.addChild(this.armRight);
        this.head.addChild(this.earLeft);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        armLeft.rotateAngleX = MathHelper.cos(swing * 0.2F + (float) Math.PI) * 0.6F * speed;
        armRight.rotateAngleX = MathHelper.cos(swing * 0.2F) * 0.6F * speed;
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
