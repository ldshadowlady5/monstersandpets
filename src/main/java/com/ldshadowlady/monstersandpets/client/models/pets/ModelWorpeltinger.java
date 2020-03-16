package com.ldshadowlady.monstersandpets.client.models.pets;

import com.ldshadowlady.monstersandpets.entity.EntityAbstractPet;
import com.ldshadowlady.monstersandpets.entity.pet.EntityGoose;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * Worpeltinger - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelWorpeltinger extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer legFrontRight;
    public ModelRenderer legFrontLeft;
    public ModelRenderer legBackLeft;
    public ModelRenderer legBackRight;
    public ModelRenderer head;
    public ModelRenderer tail;
    public ModelRenderer earRight;
    public ModelRenderer earLeft;
    public ModelRenderer antlerRight;
    public ModelRenderer antlerLeft;
    public ModelRenderer whiskerRight2;
    public ModelRenderer whiskerRight1;
    public ModelRenderer whiskerLeft2;
    public ModelRenderer whiskerLeft1;
    public ModelRenderer nose;
    public ModelRenderer antlerRight2;
    public ModelRenderer antlerLeft2;

    public ModelWorpeltinger() {
        this.textureWidth = 64;
        this.textureHeight = 45;
        this.antlerLeft = new ModelRenderer(this, 58, 10);
        this.antlerLeft.setRotationPoint(1.5F, -3.8F, -1.5F);
        this.antlerLeft.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(antlerLeft, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
        this.nose = new ModelRenderer(this, 30, 6);
        this.nose.setRotationPoint(0.0F, 1.5F, -2.4F);
        this.nose.addBox(-2.0F, -1.0F, -1.0F, 4, 2, 1, 0.0F);
        this.antlerRight2 = new ModelRenderer(this, 42, 0);
        this.antlerRight2.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.antlerRight2.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(antlerRight2, 0.6981317007977318F, 0.0F, 0.0F);
        this.antlerLeft2 = new ModelRenderer(this, 53, 0);
        this.antlerLeft2.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.antlerLeft2.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(antlerLeft2, 0.6981317007977318F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 22);
        this.head.setRotationPoint(0.0F, 0.5F, -8.5F);
        this.head.addBox(-4.0F, -4.0F, -3.0F, 8, 8, 6, 0.0F);
        this.legFrontLeft = new ModelRenderer(this, 30, 0);
        this.legFrontLeft.setRotationPoint(2.9F, 5.0F, -4.2F);
        this.legFrontLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.earRight = new ModelRenderer(this, 44, 16);
        this.earRight.setRotationPoint(-2.9F, -4.0F, 2.4F);
        this.earRight.addBox(-1.0F, -7.0F, -3.0F, 2, 7, 3, 0.0F);
        this.whiskerLeft2 = new ModelRenderer(this, 0, 36);
        this.whiskerLeft2.setRotationPoint(4.0F, 2.5F, -1.5F);
        this.whiskerLeft2.addBox(0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F);
        this.whiskerLeft1 = new ModelRenderer(this, 0, 36);
        this.whiskerLeft1.setRotationPoint(4.0F, 1.0F, -1.5F);
        this.whiskerLeft1.addBox(0.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F);
        this.antlerRight = new ModelRenderer(this, 58, 0);
        this.antlerRight.setRotationPoint(-1.5F, -3.8F, -1.5F);
        this.antlerRight.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(antlerRight, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
        this.legFrontRight = new ModelRenderer(this, 0, 0);
        this.legFrontRight.setRotationPoint(-2.9F, 5.0F, -4.2F);
        this.legFrontRight.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.body.addBox(-4.5F, -5.0F, -6.0F, 9, 10, 12, 0.0F);
        this.legBackRight = new ModelRenderer(this, 42, 8);
        this.legBackRight.setRotationPoint(-2.9F, 5.0F, 3.7F);
        this.legBackRight.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 5, 0.0F);
        this.whiskerRight1 = new ModelRenderer(this, 0, 36);
        this.whiskerRight1.setRotationPoint(-4.0F, 1.0F, -1.5F);
        this.whiskerRight1.addBox(-3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F);
        this.whiskerRight2 = new ModelRenderer(this, 0, 36);
        this.whiskerRight2.setRotationPoint(-4.0F, 2.5F, -1.5F);
        this.whiskerRight2.addBox(-3.0F, -0.5F, 0.0F, 3, 1, 0, 0.0F);
        this.legBackLeft = new ModelRenderer(this, 42, 0);
        this.legBackLeft.setRotationPoint(2.9F, 5.0F, 3.7F);
        this.legBackLeft.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 5, 0.0F);
        this.tail = new ModelRenderer(this, 0, 6);
        this.tail.setRotationPoint(0.0F, -2.7F, 6.0F);
        this.tail.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
        this.earLeft = new ModelRenderer(this, 53, 31);
        this.earLeft.setRotationPoint(2.9F, -4.0F, 2.4F);
        this.earLeft.addBox(-1.0F, -7.0F, -3.0F, 2, 7, 3, 0.0F);
        this.head.addChild(this.antlerLeft);
        this.head.addChild(this.nose);
        this.antlerRight.addChild(this.antlerRight2);
        this.antlerLeft.addChild(this.antlerLeft2);
        this.body.addChild(this.head);
        this.body.addChild(this.legFrontLeft);
        this.head.addChild(this.earRight);
        this.head.addChild(this.whiskerLeft2);
        this.head.addChild(this.whiskerLeft1);
        this.head.addChild(this.antlerRight);
        this.body.addChild(this.legFrontRight);
        this.body.addChild(this.legBackRight);
        this.head.addChild(this.whiskerRight1);
        this.head.addChild(this.whiskerRight2);
        this.body.addChild(this.legBackLeft);
        this.body.addChild(this.tail);
        this.head.addChild(this.earLeft);
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
        if (((EntityAbstractPet)entity).isSitting()) {
            legBackLeft.showModel = legBackRight.showModel = false;
            legFrontLeft.showModel = legFrontRight.showModel = false;
            body.rotationPointY = 17.5F;
        } else {
            legBackLeft.showModel = legBackRight.showModel = true;
            legFrontLeft.showModel = legFrontRight.showModel = true;
            body.rotationPointY = 16.0F;
        }
    }

    @Override
    public void render(Entity entity, float swing, float speed, float age, float yaw, float pitch, float scale) {
        setRotationAngles(swing, speed, age, yaw, pitch, scale, entity);
        GlStateManager.pushMatrix();
        float sc = 0.55F;
        GlStateManager.scale(sc, sc, sc);
        GlStateManager.translate(0, (1 / sc - 1) * 24 * scale, 0);
        body.render(scale);
        //bodyLower.render(scale);
        GlStateManager.popMatrix();
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
