package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * HauntedTree - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelHauntedTree extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer legFrontRight;
    public ModelRenderer legFrontLeft;
    public ModelRenderer legBackRight;
    public ModelRenderer legBackLeft;
    public ModelRenderer armRight;
    public ModelRenderer armLeft;
    public ModelRenderer spikes;

    public ModelHauntedTree() {
        this.textureWidth = 64;
        this.textureHeight = 45;
        this.spikes = new ModelRenderer(this, 0, 28);
        this.spikes.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.spikes.addBox(-4.0F, -4.0F, -4.0F, 8, 4, 8, 0.0F);
        this.legBackLeft = new ModelRenderer(this, 44, 12);
        this.legBackLeft.setRotationPoint(2.5F, 9.0F, 2.5F);
        this.legBackLeft.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(legBackLeft, -0.3839724354387525F, 0.7853981633974483F, 0.0F);
        this.legFrontLeft = new ModelRenderer(this, 44, 3);
        this.legFrontLeft.setRotationPoint(2.5F, 9.0F, -2.5F);
        this.legFrontLeft.addBox(-1.5F, -1.5F, -6.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(legFrontLeft, 0.3839724354387525F, -0.7853981633974483F, 0.0F);
        this.armRight = new ModelRenderer(this, 40, 21);
        this.armRight.setRotationPoint(-4.0F, -9.5F, 1.0F);
        this.armRight.addBox(-1.0F, 0.0F, -1.0F, 2, 16, 2, 0.0F);
        this.setRotateAngle(armRight, -0.17453292519943295F, 0.17453292519943295F, 0.08726646259971647F);
        this.legBackRight = new ModelRenderer(this, 32, 9);
        this.legBackRight.setRotationPoint(-2.5F, 9.0F, 2.5F);
        this.legBackRight.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(legBackRight, -0.3839724354387525F, -0.7853981633974483F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 13.5F, 0.0F);
        this.body.addBox(-4.0F, -10.0F, -4.0F, 8, 20, 8, 0.0F);
        this.armLeft = new ModelRenderer(this, 32, 18);
        this.armLeft.setRotationPoint(4.0F, -9.5F, 1.0F);
        this.armLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 16, 2, 0.0F);
        this.setRotateAngle(armLeft, -0.10471975511965977F, -0.17453292519943295F, -0.08726646259971647F);
        this.legFrontRight = new ModelRenderer(this, 32, 0);
        this.legFrontRight.setRotationPoint(-2.5F, 9.0F, -2.5F);
        this.legFrontRight.addBox(-1.5F, -1.5F, -6.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(legFrontRight, 0.3839724354387525F, 0.7853981633974483F, 0.0F);
        this.body.addChild(this.spikes);
        this.body.addChild(this.legBackLeft);
        this.body.addChild(this.legFrontLeft);
        this.body.addChild(this.armRight);
        this.body.addChild(this.legBackRight);
        this.body.addChild(this.armLeft);
        this.body.addChild(this.legFrontRight);
    }



    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legFrontRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 0.9F * speed;
        legFrontLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 0.9F * speed;
        legBackLeft.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 0.9F * speed;
        legBackRight.rotateAngleX = MathHelper.cos(swing * 0.7F) * 0.9F * speed;
    }


    @Override
    public void render(Entity entity, float swing, float speed, float age, float yaw, float pitch, float scale) {
        setRotationAngles(swing, speed, age, yaw, pitch, scale, entity);
        GlStateManager.pushMatrix();
        float sc = 0.4F;
        GlStateManager.scale(sc, sc, sc);
        GlStateManager.translate(0, (1 / sc - 1) * 24 * scale, 0);
        body.render(scale);
        //bodyLower.render(scale);
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
