package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;

/**
 * NoFace - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelNoFace extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer face;

    public ModelNoFace() {
        this.textureWidth = 120;
        this.textureHeight = 50;
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -10.3F, 0.0F);
        this.body.addBox(-9.0F, -10.0F, -5.0F, 18, 40, 10, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, -13.0F, 0.0F);
        this.head.addBox(-7.0F, -10.0F, -5.0F, 14, 13, 10, 0.0F);
        this.face = new ModelRenderer(this, 56, 23);
        this.face.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.face.addBox(-5.0F, -8.0F, -2.0F, 10, 16, 2, 0.0F);
        this.body.addChild(this.head);
        this.head.addChild(this.face);
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
