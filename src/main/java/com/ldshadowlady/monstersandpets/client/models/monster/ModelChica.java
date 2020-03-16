package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * FNAFChica - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelChica extends ModelBase {
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
    public ModelRenderer toeRight;
    public ModelRenderer toeRight2;
    public ModelRenderer legLeftpad;
    public ModelRenderer legLeft2;
    public ModelRenderer legLeftpad2;
    public ModelRenderer footRight_1;
    public ModelRenderer toeRight_1;
    public ModelRenderer toeRight2_1;
    public ModelRenderer armLeftpad;
    public ModelRenderer armLeft2;
    public ModelRenderer armLeftpad2;
    public ModelRenderer handLeft;
    public ModelRenderer nose;
    public ModelRenderer hair;
    public ModelRenderer hair2;
    public ModelRenderer hair3;
    public ModelRenderer jaw;

    public ModelChica() {
        this.textureWidth = 120;
        this.textureHeight = 100;
        this.armLeftpad = new ModelRenderer(this, 27, 48);
        this.armLeftpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armLeftpad.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.body.addBox(-1.0F, -14.0F, -1.0F, 2, 24, 2, 0.0F);
        this.armRightpad = new ModelRenderer(this, 90, 12);
        this.armRightpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armRightpad.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 0, 43);
        this.armLeft2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.armLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(armLeft2, -0.17453292519943295F, 0.0F, 0.0F);
        this.armLeftpad2 = new ModelRenderer(this, 70, 49);
        this.armLeftpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armLeftpad2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.hair3 = new ModelRenderer(this, 48, 12);
        this.hair3.setRotationPoint(0.0F, -7.3F, 0.0F);
        this.hair3.addBox(-1.5F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(hair3, -0.6981317007977318F, 1.0471975511965976F, 0.0F);
        this.footRight_1 = new ModelRenderer(this, 75, 41);
        this.footRight_1.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footRight_1.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(footRight_1, -0.03490658503988659F, -0.03490658503988659F, 0.0F);
        this.armRightpad2 = new ModelRenderer(this, 3, 24);
        this.armRightpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armRightpad2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.legLeftpad = new ModelRenderer(this, 51, 39);
        this.legLeftpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legLeftpad.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.toeRight_1 = new ModelRenderer(this, 103, 36);
        this.toeRight_1.setRotationPoint(-1.5F, 1.0F, -2.5F);
        this.toeRight_1.addBox(-1.5F, 0.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(toeRight_1, 0.0F, 0.08726646259971647F, 0.0F);
        this.hair = new ModelRenderer(this, 8, 0);
        this.hair.setRotationPoint(0.0F, -7.3F, 0.0F);
        this.hair.addBox(-1.5F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(hair, 0.6981317007977318F, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 103, 50);
        this.jaw.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.jaw.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 3, 0.0F);
        this.handRight = new ModelRenderer(this, 23, 24);
        this.handRight.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.handRight.addBox(-2.0F, 0.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(handRight, 0.0F, 0.0F, -0.05235987755982988F);
        this.armLeft = new ModelRenderer(this, 108, 0);
        this.armLeft.setRotationPoint(6.5F, -8.0F, 0.0F);
        this.armLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armLeft, 0.0F, 0.0F, -0.2617993877991494F);
        this.toeRight = new ModelRenderer(this, 18, 33);
        this.toeRight.setRotationPoint(-1.5F, 1.0F, -2.5F);
        this.toeRight.addBox(-1.5F, 0.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(toeRight, 0.0F, 0.2617993877991494F, 0.0F);
        this.handLeft = new ModelRenderer(this, 90, 50);
        this.handLeft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.handLeft.addBox(-2.0F, 0.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(handLeft, 0.0F, 0.0F, 0.05235987755982988F);
        this.armRight = new ModelRenderer(this, 48, 0);
        this.armRight.setRotationPoint(-6.5F, -8.0F, 0.0F);
        this.armRight.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armRight, 0.0F, 0.0F, 0.2617993877991494F);
        this.legRight = new ModelRenderer(this, 92, 0);
        this.legRight.setRotationPoint(-3.3F, 10.5F, 0.0F);
        this.legRight.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(legRight, 0.0F, 0.03490658503988659F, 0.0F);
        this.armRight2 = new ModelRenderer(this, 80, 10);
        this.armRight2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.armRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(armRight2, -0.17453292519943295F, 0.0F, 0.0F);
        this.footRight = new ModelRenderer(this, 57, 31);
        this.footRight.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footRight.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(footRight, -0.03490658503988659F, 0.03490658503988659F, 0.0F);
        this.toeRight2 = new ModelRenderer(this, 0, 36);
        this.toeRight2.setRotationPoint(1.5F, 1.0F, -2.5F);
        this.toeRight2.addBox(-1.5F, 0.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(toeRight2, 0.0F, -0.08726646259971647F, 0.0F);
        this.hair2 = new ModelRenderer(this, 40, 0);
        this.hair2.setRotationPoint(0.0F, -7.3F, 0.0F);
        this.hair2.addBox(-1.5F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(hair2, -0.6981317007977318F, -1.0471975511965976F, 0.0F);
        this.legRight2 = new ModelRenderer(this, 110, 12);
        this.legRight2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.legRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(legRight2, 0.03490658503988659F, 0.0F, 0.0F);
        this.legRightpad = new ModelRenderer(this, 84, 26);
        this.legRightpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legRightpad.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.head = new ModelRenderer(this, 48, 10);
        this.head.setRotationPoint(0.0F, -13.0F, -0.5F);
        this.head.addBox(-5.5F, -8.0F, -5.0F, 11, 11, 10, 0.0F);
        this.legLeftpad2 = new ModelRenderer(this, 10, 40);
        this.legLeftpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legLeftpad2.addBox(-2.5F, 0.0F, -3.0F, 5, 7, 6, 0.0F);
        this.torso = new ModelRenderer(this, 8, 0);
        this.torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.torso.addBox(-6.0F, -9.0F, -4.0F, 12, 16, 8, 0.0F);
        this.setRotateAngle(torso, 0.017453292519943295F, 0.0F, 0.0F);
        this.legRightpad2 = new ModelRenderer(this, 35, 31);
        this.legRightpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legRightpad2.addBox(-2.5F, 0.0F, -3.0F, 5, 7, 6, 0.0F);
        this.toeRight2_1 = new ModelRenderer(this, 95, 43);
        this.toeRight2_1.setRotationPoint(1.5F, 1.0F, -2.5F);
        this.toeRight2_1.addBox(-1.5F, 0.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(toeRight2_1, 0.0F, -0.2617993877991494F, 0.0F);
        this.crotch = new ModelRenderer(this, 56, 0);
        this.crotch.setRotationPoint(0.0F, 7.5F, 0.0F);
        this.crotch.addBox(-5.5F, 0.0F, -3.5F, 11, 3, 7, 0.0F);
        this.nose = new ModelRenderer(this, 0, 53);
        this.nose.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.nose.addBox(-2.0F, -1.5F, -3.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(nose, 0.08726646259971647F, 0.0F, 0.0F);
        this.legLeft2 = new ModelRenderer(this, 110, 22);
        this.legLeft2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.legLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(legLeft2, 0.03490658503988659F, 0.0F, 0.0F);
        this.legLeft = new ModelRenderer(this, 100, 0);
        this.legLeft.setRotationPoint(3.3F, 10.5F, 0.0F);
        this.legLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(legLeft, 0.0F, -0.03490658503988659F, 0.0F);
        this.armLeft.addChild(this.armLeftpad);
        this.armRight.addChild(this.armRightpad);
        this.armLeft.addChild(this.armLeft2);
        this.armLeft2.addChild(this.armLeftpad2);
        this.head.addChild(this.hair3);
        this.legLeft2.addChild(this.footRight_1);
        this.armRight2.addChild(this.armRightpad2);
        this.legLeft.addChild(this.legLeftpad);
        this.footRight_1.addChild(this.toeRight_1);
        this.head.addChild(this.hair);
        this.nose.addChild(this.jaw);
        this.armRight2.addChild(this.handRight);
        this.body.addChild(this.armLeft);
        this.footRight.addChild(this.toeRight);
        this.armLeft2.addChild(this.handLeft);
        this.body.addChild(this.armRight);
        this.body.addChild(this.legRight);
        this.armRight.addChild(this.armRight2);
        this.legRight2.addChild(this.footRight);
        this.footRight.addChild(this.toeRight2);
        this.head.addChild(this.hair2);
        this.legRight.addChild(this.legRight2);
        this.legRight.addChild(this.legRightpad);
        this.body.addChild(this.head);
        this.legLeft2.addChild(this.legLeftpad2);
        this.body.addChild(this.torso);
        this.legRight2.addChild(this.legRightpad2);
        this.footRight_1.addChild(this.toeRight2_1);
        this.body.addChild(this.crotch);
        this.head.addChild(this.nose);
        this.legLeft.addChild(this.legLeft2);
        this.body.addChild(this.legLeft);
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
