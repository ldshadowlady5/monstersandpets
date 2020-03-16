package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * Slenderman - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelSlenderman extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer legRight;
    public ModelRenderer legLeft;
    public ModelRenderer armRight1;
    public ModelRenderer armLeft1;
    public ModelRenderer head;
    public ModelRenderer armRight2;
    public ModelRenderer armLeft2;

    public ModelSlenderman() {
        this.textureWidth = 85;
        this.textureHeight = 60;
        this.armRight1 = new ModelRenderer(this, 52, 0);
        this.armRight1.setRotationPoint(-4.5F, -8.0F, 0.0F);
        this.armRight1.addBox(-3.0F, 0.0F, -2.0F, 3, 14, 4, 0.0F);
        this.setRotateAngle(armRight1, 0.017453292519943295F, 0.0F, 0.017453292519943295F);
        this.legLeft = new ModelRenderer(this, 40, 0);
        this.legLeft.setRotationPoint(2.5F, 5.0F, 0.0F);
        this.legLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 28, 3, 0.0F);
        this.head = new ModelRenderer(this, 52, 18);
        this.head.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.head.addBox(-3.5F, -8.0F, -3.0F, 7, 8, 6, 0.0F);
        this.setRotateAngle(head, 0.03490658503988659F, 0.0F, 0.0F);
        this.armRight2 = new ModelRenderer(this, 0, 21);
        this.armRight2.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.armRight2.addBox(-3.0F, 0.0F, -1.5F, 3, 14, 3, 0.0F);
        this.setRotateAngle(armRight2, -0.03490658503988659F, 0.0F, 0.0F);
        this.legRight = new ModelRenderer(this, 28, 0);
        this.legRight.setRotationPoint(-2.5F, 5.0F, 0.0F);
        this.legRight.addBox(-1.5F, 0.0F, -1.5F, 3, 28, 3, 0.0F);
        this.armLeft1 = new ModelRenderer(this, 66, 0);
        this.armLeft1.setRotationPoint(4.5F, -8.0F, 0.0F);
        this.armLeft1.addBox(0.0F, 0.0F, -2.0F, 3, 14, 4, 0.0F);
        this.setRotateAngle(armLeft1, 0.017453292519943295F, 0.0F, -0.017453292519943295F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.body.addBox(-4.5F, -8.0F, -2.5F, 9, 16, 5, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 12, 21);
        this.armLeft2.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.armLeft2.addBox(0.0F, 0.0F, -1.5F, 3, 14, 3, 0.0F);
        this.setRotateAngle(armLeft2, -0.03490658503988659F, 0.0F, 0.0F);
        this.body.addChild(this.armRight1);
        this.body.addChild(this.legLeft);
        this.body.addChild(this.head);
        this.armRight1.addChild(this.armRight2);
        this.body.addChild(this.legRight);
        this.body.addChild(this.armLeft1);
        this.armLeft1.addChild(this.armLeft2);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
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
