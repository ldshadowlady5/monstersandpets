package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelGhast - Either Mojang or a mod author
 * Created using Tabula 5.1.0
 */
public class ModelPumpkinGhast extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer leg4;
    public ModelRenderer leg5;
    public ModelRenderer leg6;
    public ModelRenderer leg7;
    public ModelRenderer leg8;
    public ModelRenderer leg9;

    public ModelPumpkinGhast() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.leg7 = new ModelRenderer(this, 0, 0);
        this.leg7.setRotationPoint(1.25F, 7.0F, 5.0F);
        this.leg7.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(leg7, 0.5314527572322734F, 0.0F, 0.0F);
        this.leg5 = new ModelRenderer(this, 0, 0);
        this.leg5.setRotationPoint(3.75F, 7.0F, 0.0F);
        this.leg5.addBox(-1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(leg5, 0.20821777976292352F, 0.0F, 0.0F);
        this.leg6 = new ModelRenderer(this, 0, 0);
        this.leg6.setRotationPoint(-1.25F, 7.0F, 0.0F);
        this.leg6.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.setRotateAngle(leg6, 0.24870941840919195F, 0.0F, 0.0F);
        this.leg8 = new ModelRenderer(this, 0, 0);
        this.leg8.setRotationPoint(-3.75F, 7.0F, 5.0F);
        this.leg8.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(leg8, 0.34417892849328174F, 0.0F, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 0);
        this.leg4.setRotationPoint(6.25F, 7.0F, -5.0F);
        this.leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(leg4, 0.5818927726149095F, 0.0F, 0.0F);
        this.leg3 = new ModelRenderer(this, 0, 0);
        this.leg3.setRotationPoint(-6.25F, 7.0F, 0.0F);
        this.leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.setRotateAngle(leg3, 0.42830379843940847F, 0.0F, 0.0F);
        this.leg9 = new ModelRenderer(this, 0, 0);
        this.leg9.setRotationPoint(6.25F, 7.0F, 5.0F);
        this.leg9.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.setRotateAngle(leg9, 0.5979498017332573F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.body.addBox(-8.0F, -8.0F, -8.0F, 16, 16, 16, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 0);
        this.leg2.setRotationPoint(-3.75F, 7.0F, -5.0F);
        this.leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(leg2, 0.40002946455710037F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 0);
        this.leg1.setRotationPoint(1.25F, 7.0F, -5.0F);
        this.leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 13, 2, 0.0F);
        this.setRotateAngle(leg1, 0.5682792044493538F, 0.0F, 0.0F);
        this.body.addChild(this.leg7);
        this.body.addChild(this.leg5);
        this.body.addChild(this.leg6);
        this.body.addChild(this.leg8);
        this.body.addChild(this.leg4);
        this.body.addChild(this.leg3);
        this.body.addChild(this.leg9);
        this.body.addChild(this.leg2);
        this.body.addChild(this.leg1);
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
