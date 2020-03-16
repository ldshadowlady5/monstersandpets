package com.ldshadowlady.monstersandpets.client.models.pets;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Baymax - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelDisneyBaymax extends ModelBase {
    public ModelRenderer bodyLower;
    public ModelRenderer legRight;
    public ModelRenderer legLeft;
    public ModelRenderer bodyUpper;
    public ModelRenderer armRight1;
    public ModelRenderer head;
    public ModelRenderer chestbadge;
    public ModelRenderer armLeft1;
    public ModelRenderer armRight2;
    public ModelRenderer handRightThumb;
    public ModelRenderer handRightFinger1;
    public ModelRenderer handRightFinger2;
    public ModelRenderer handRightFinger3;
    public ModelRenderer armLeft2;
    public ModelRenderer handLeftThumb;
    public ModelRenderer handLeftFinger1;
    public ModelRenderer handLeftFinger2;
    public ModelRenderer handLeftFinger3;

    public ModelDisneyBaymax() {
        this.textureWidth = 118;
        this.textureHeight = 82;
        this.handRightThumb = new ModelRenderer(this, 56, 0);
        this.handRightThumb.setRotationPoint(2.8F, 12.5F, -1.9F);
        this.handRightThumb.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(handRightThumb, 0.0F, 0.0F, 0.05235987755982988F);
        this.handRightFinger1 = new ModelRenderer(this, 64, 0);
        this.handRightFinger1.setRotationPoint(-1.5F, 13.4F, -2.3F);
        this.handRightFinger1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(handRightFinger1, 0.0F, 0.0F, -0.2617993877991494F);
        this.armRight1 = new ModelRenderer(this, 60, 40);
        this.armRight1.setRotationPoint(-8.6F, -8.4F, 1.0F);
        this.armRight1.addBox(-3.0F, -2.5F, -3.0F, 6, 12, 6, 0.0F);
        this.setRotateAngle(armRight1, -0.08726646259971647F, 0.0F, 0.6108652381980153F);
        this.armLeft1 = new ModelRenderer(this, 0, 59);
        this.armLeft1.setRotationPoint(8.6F, -8.4F, 1.0F);
        this.armLeft1.addBox(-3.0F, -2.5F, -3.0F, 6, 12, 6, 0.0F);
        this.setRotateAngle(armLeft1, -0.08726646259971647F, 0.0F, -0.6108652381980153F);
        this.armLeft2 = new ModelRenderer(this, 24, 59);
        this.armLeft2.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.armLeft2.addBox(-3.5F, 0.0F, -3.5F, 7, 14, 7, 0.0F);
        this.setRotateAngle(armLeft2, 0.0F, 0.0F, 0.4363323129985824F);
        this.legLeft = new ModelRenderer(this, 72, 20);
        this.legLeft.setRotationPoint(4.3F, 4.0F, 0.0F);
        this.legLeft.addBox(-4.0F, 0.0F, -4.5F, 8, 11, 9, 0.0F);
        this.bodyLower = new ModelRenderer(this, 0, 0);
        this.bodyLower.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.bodyLower.addBox(-10.0F, -14.0F, -8.0F, 20, 20, 16, 0.0F);
        this.head = new ModelRenderer(this, 76, 51);
        this.head.setRotationPoint(0.0F, -12.5F, 0.0F);
        this.head.addBox(-6.0F, -7.0F, -4.0F, 12, 7, 8, 0.0F);
        this.armRight2 = new ModelRenderer(this, 52, 59);
        this.armRight2.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.armRight2.addBox(-3.5F, 0.0F, -3.5F, 7, 14, 7, 0.0F);
        this.setRotateAngle(armRight2, 0.0F, 0.0F, -0.4363323129985824F);
        this.handRightFinger2 = new ModelRenderer(this, 72, 0);
        this.handRightFinger2.setRotationPoint(-1.5F, 13.6F, 0.0F);
        this.handRightFinger2.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(handRightFinger2, 0.0F, 0.0F, -0.17453292519943295F);
        this.chestbadge = new ModelRenderer(this, 0, 0);
        this.chestbadge.setRotationPoint(4.0F, -7.0F, -5.7F);
        this.chestbadge.addBox(-2.0F, -2.0F, -1.0F, 4, 4, 1, 0.0F);
        this.handLeftThumb = new ModelRenderer(this, 105, 0);
        this.handLeftThumb.setRotationPoint(-2.8F, 12.5F, -1.9F);
        this.handLeftThumb.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(handLeftThumb, 0.0F, 0.0F, -0.05235987755982988F);
        this.handLeftFinger1 = new ModelRenderer(this, 8, 3);
        this.handLeftFinger1.setRotationPoint(1.5F, 13.4F, -2.3F);
        this.handLeftFinger1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(handLeftFinger1, 0.0F, 0.0F, 0.2617993877991494F);
        this.legRight = new ModelRenderer(this, 72, 0);
        this.legRight.setRotationPoint(-4.3F, 4.0F, 0.0F);
        this.legRight.addBox(-4.0F, 0.0F, -4.4F, 8, 11, 9, 0.0F);
        this.bodyUpper = new ModelRenderer(this, 0, 36);
        this.bodyUpper.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.bodyUpper.addBox(-8.5F, -12.5F, -6.5F, 17, 10, 13, 0.0F);
        this.handLeftFinger2 = new ModelRenderer(this, 0, 5);
        this.handLeftFinger2.setRotationPoint(1.5F, 13.6F, 0.0F);
        this.handLeftFinger2.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(handLeftFinger2, 0.0F, 0.0F, 0.17453292519943295F);
        this.handLeftFinger3 = new ModelRenderer(this, 56, 5);
        this.handLeftFinger3.setRotationPoint(1.5F, 13.3F, 2.3F);
        this.handLeftFinger3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(handLeftFinger3, 0.0F, 0.0F, 0.2617993877991494F);
        this.handRightFinger3 = new ModelRenderer(this, 97, 0);
        this.handRightFinger3.setRotationPoint(-1.5F, 13.3F, 2.3F);
        this.handRightFinger3.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(handRightFinger3, 0.0F, 0.0F, -0.2617993877991494F);
        this.armRight2.addChild(this.handRightThumb);
        this.armRight2.addChild(this.handRightFinger1);
        this.bodyUpper.addChild(this.armRight1);
        this.bodyUpper.addChild(this.armLeft1);
        this.armLeft1.addChild(this.armLeft2);
        this.bodyLower.addChild(this.legLeft);
        this.bodyUpper.addChild(this.head);
        this.armRight1.addChild(this.armRight2);
        this.armRight2.addChild(this.handRightFinger2);
        this.bodyUpper.addChild(this.chestbadge);
        this.armLeft2.addChild(this.handLeftThumb);
        this.armLeft2.addChild(this.handLeftFinger1);
        this.bodyLower.addChild(this.legRight);
        this.bodyLower.addChild(this.bodyUpper);
        this.armLeft2.addChild(this.handLeftFinger2);
        this.armLeft2.addChild(this.handLeftFinger3);
        this.armRight2.addChild(this.handRightFinger3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.bodyLower.render(f5);
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
