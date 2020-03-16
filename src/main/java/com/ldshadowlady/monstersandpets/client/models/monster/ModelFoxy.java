package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * FNAFFoxy - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelFoxy extends ModelBase {
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
    public ModelRenderer hookBase;
    public ModelRenderer hook1;
    public ModelRenderer hook2;
    public ModelRenderer hook3;
    public ModelRenderer hook4;
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
    public ModelRenderer nose_1;
    public ModelRenderer hair;
    public ModelRenderer hair2;
    public ModelRenderer hair3;
    public ModelRenderer earRightpad;
    public ModelRenderer earRightpad_1;

    public ModelFoxy() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.earLeft = new ModelRenderer(this, 91, 0);
        this.earLeft.setRotationPoint(4.5F, -5.5F, 0.0F);
        this.earLeft.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earLeft, 0.05235987755982988F, 0.0F, 1.0471975511965976F);
        this.legRightpad2 = new ModelRenderer(this, 38, 39);
        this.legRightpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legRightpad2.addBox(-2.5F, 0.0F, -3.0F, 5, 7, 6, 0.0F);
        this.hook1 = new ModelRenderer(this, 8, 0);
        this.hook1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.hook1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(hook1, 0.0F, 0.0F, 0.5235987755982988F);
        this.earRightpad = new ModelRenderer(this, 0, 38);
        this.earRightpad.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.earRightpad.addBox(-2.0F, -6.0F, -1.0F, 4, 6, 2, 0.0F);
        this.armLeftpad2 = new ModelRenderer(this, 0, 62);
        this.armLeftpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armLeftpad2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.jaw = new ModelRenderer(this, 29, 63);
        this.jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.jaw.addBox(-5.0F, 0.0F, -4.5F, 10, 3, 9, 0.0F);
        this.setRotateAngle(jaw, 0.08726646259971647F, 0.0F, 0.0F);
        this.torso = new ModelRenderer(this, 8, 0);
        this.torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.torso.addBox(-6.0F, -9.0F, -4.0F, 12, 18, 8, 0.0F);
        this.setRotateAngle(torso, 0.017453292519943295F, 0.0F, 0.0F);
        this.armLeft = new ModelRenderer(this, 62, 10);
        this.armLeft.setRotationPoint(6.5F, -8.0F, 0.0F);
        this.armLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armLeft, 0.0F, 0.0F, -0.2617993877991494F);
        this.armRightpad = new ModelRenderer(this, 70, 10);
        this.armRightpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armRightpad.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.body.addBox(-1.0F, -14.0F, -1.0F, 2, 24, 2, 0.0F);
        this.footLeft = new ModelRenderer(this, 24, 52);
        this.footLeft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footLeft.addBox(-2.5F, 0.0F, -6.0F, 5, 3, 8, 0.0F);
        this.setRotateAngle(footLeft, -0.03490658503988659F, 0.0F, 0.0F);
        this.hair2 = new ModelRenderer(this, 92, 4);
        this.hair2.setRotationPoint(0.0F, -7.3F, 0.0F);
        this.hair2.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(hair2, 0.8726646259971648F, 1.9123572614101867F, 0.0F);
        this.hook4 = new ModelRenderer(this, 56, 0);
        this.hook4.setRotationPoint(-0.2F, 3.5F, 0.0F);
        this.hook4.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(hook4, 0.0F, 0.0F, -1.48352986419518F);
        this.nose = new ModelRenderer(this, 0, 75);
        this.nose.setRotationPoint(0.0F, -1.6F, -2.5F);
        this.nose.addBox(-7.0F, -1.5F, -3.0F, 14, 3, 9, 0.0F);
        this.setRotateAngle(nose, 0.03490658503988659F, 0.0F, 0.0F);
        this.hair3 = new ModelRenderer(this, 70, 10);
        this.hair3.setRotationPoint(0.3F, -7.3F, 0.5F);
        this.hair3.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(hair3, 0.6981317007977318F, -2.1816615649929116F, 0.0F);
        this.crotch = new ModelRenderer(this, 56, 0);
        this.crotch.setRotationPoint(0.0F, 9.5F, 0.0F);
        this.crotch.addBox(-5.5F, 0.0F, -3.5F, 11, 3, 7, 0.0F);
        this.armRight2 = new ModelRenderer(this, 90, 20);
        this.armRight2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.armRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(armRight2, -0.17453292519943295F, 0.0F, 0.0F);
        this.handLeft = new ModelRenderer(this, 20, 63);
        this.handLeft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.handLeft.addBox(-2.0F, 0.0F, -2.5F, 4, 4, 5, 0.0F);
        this.setRotateAngle(handLeft, 0.0F, 0.0F, 0.05235987755982988F);
        this.armRight = new ModelRenderer(this, 48, 0);
        this.armRight.setRotationPoint(-6.5F, -8.0F, 0.0F);
        this.armRight.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(armRight, 0.0F, 0.0F, 0.2617993877991494F);
        this.armRightpad2 = new ModelRenderer(this, 0, 26);
        this.armRightpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armRightpad2.addBox(-2.5F, 0.0F, -2.5F, 5, 7, 5, 0.0F);
        this.legLeftpad2 = new ModelRenderer(this, 54, 50);
        this.legLeftpad2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legLeftpad2.addBox(-2.5F, 0.0F, -3.0F, 5, 7, 6, 0.0F);
        this.earRight = new ModelRenderer(this, 85, 0);
        this.earRight.setRotationPoint(-4.5F, -5.5F, 0.0F);
        this.earRight.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(earRight, 0.05235987755982988F, 0.0F, -1.0471975511965976F);
        this.legLeft2 = new ModelRenderer(this, 87, 30);
        this.legLeft2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.legLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(legLeft2, 0.03490658503988659F, 0.0F, 0.0F);
        this.hair = new ModelRenderer(this, 59, 2);
        this.hair.setRotationPoint(0.0F, -7.3F, 0.0F);
        this.hair.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(hair, 0.5235987755982988F, 0.0F, 0.0F);
        this.legRightpad = new ModelRenderer(this, 14, 32);
        this.legRightpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legRightpad.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.earRightpad_1 = new ModelRenderer(this, 42, 52);
        this.earRightpad_1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.earRightpad_1.addBox(-2.0F, -6.0F, -1.0F, 4, 6, 2, 0.0F);
        this.hookBase = new ModelRenderer(this, 70, 24);
        this.hookBase.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.hookBase.addBox(-2.5F, 0.0F, -2.5F, 5, 1, 5, 0.0F);
        this.legRight2 = new ModelRenderer(this, 79, 30);
        this.legRight2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.legRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(legRight2, 0.03490658503988659F, 0.0F, 0.0F);
        this.hook3 = new ModelRenderer(this, 44, 0);
        this.hook3.setRotationPoint(-0.2F, 4.5F, 0.0F);
        this.hook3.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(hook3, 0.0F, 0.0F, -1.48352986419518F);
        this.legRight = new ModelRenderer(this, 90, 8);
        this.legRight.setRotationPoint(-3.3F, 12.5F, 0.0F);
        this.legRight.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.legLeft = new ModelRenderer(this, 54, 10);
        this.legLeft.setRotationPoint(3.3F, 12.5F, 0.0F);
        this.legLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.hook2 = new ModelRenderer(this, 40, 0);
        this.hook2.setRotationPoint(-0.5F, 3.5F, 0.0F);
        this.hook2.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(hook2, 0.0F, 0.0F, -0.9599310885968813F);
        this.nose_1 = new ModelRenderer(this, 58, 63);
        this.nose_1.setRotationPoint(0.0F, -1.7F, -4.0F);
        this.nose_1.addBox(-2.0F, -1.5F, -5.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(nose_1, 0.08726646259971647F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 39, 22);
        this.head.setRotationPoint(0.0F, -13.0F, -0.5F);
        this.head.addBox(-5.5F, -8.0F, -4.5F, 11, 8, 9, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 86, 40);
        this.armLeft2.setRotationPoint(0.0F, 9.6F, 0.0F);
        this.armLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(armLeft2, -0.17453292519943295F, 0.0F, 0.0F);
        this.armLeftpad = new ModelRenderer(this, 76, 50);
        this.armLeftpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.armLeftpad.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.footRight = new ModelRenderer(this, 60, 39);
        this.footRight.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footRight.addBox(-2.5F, 0.0F, -6.0F, 5, 3, 8, 0.0F);
        this.setRotateAngle(footRight, -0.03490658503988659F, 0.0F, 0.0F);
        this.legLeftpad = new ModelRenderer(this, 0, 47);
        this.legLeftpad.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.legLeftpad.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.head.addChild(this.earLeft);
        this.legRight2.addChild(this.legRightpad2);
        this.hookBase.addChild(this.hook1);
        this.earRight.addChild(this.earRightpad);
        this.armLeft2.addChild(this.armLeftpad2);
        this.head.addChild(this.jaw);
        this.body.addChild(this.torso);
        this.body.addChild(this.armLeft);
        this.armRight.addChild(this.armRightpad);
        this.legLeft2.addChild(this.footLeft);
        this.head.addChild(this.hair2);
        this.hook3.addChild(this.hook4);
        this.head.addChild(this.nose);
        this.head.addChild(this.hair3);
        this.body.addChild(this.crotch);
        this.armRight.addChild(this.armRight2);
        this.armLeft2.addChild(this.handLeft);
        this.body.addChild(this.armRight);
        this.armRight2.addChild(this.armRightpad2);
        this.legLeft2.addChild(this.legLeftpad2);
        this.head.addChild(this.earRight);
        this.legLeft.addChild(this.legLeft2);
        this.head.addChild(this.hair);
        this.legRight.addChild(this.legRightpad);
        this.earLeft.addChild(this.earRightpad_1);
        this.armRight2.addChild(this.hookBase);
        this.legRight.addChild(this.legRight2);
        this.hook2.addChild(this.hook3);
        this.body.addChild(this.legRight);
        this.body.addChild(this.legLeft);
        this.hook1.addChild(this.hook2);
        this.head.addChild(this.nose_1);
        this.body.addChild(this.head);
        this.armLeft.addChild(this.armLeft2);
        this.armLeft.addChild(this.armLeftpad);
        this.legRight2.addChild(this.footRight);
        this.legLeft.addChild(this.legLeftpad);
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
