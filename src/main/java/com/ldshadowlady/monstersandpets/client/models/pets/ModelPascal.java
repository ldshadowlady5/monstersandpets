package com.ldshadowlady.monstersandpets.client.models.pets;

import com.ldshadowlady.monstersandpets.entity.pet.EntityGoose;
import com.ldshadowlady.monstersandpets.entity.pet.EntityPascal;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.math.MathHelper;

/**
 * Pascal - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelPascal extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer legFrontRight1;
    public ModelRenderer legFrontLeft1;
    public ModelRenderer legBackLeft1;
    public ModelRenderer legBackRight1;
    public ModelRenderer tail1;
    public ModelRenderer spine;
    public ModelRenderer mane;
    public ModelRenderer eyeRight;
    public ModelRenderer eyeLeft;
    public ModelRenderer legFrontRight2;
    public ModelRenderer footFrontRight;
    public ModelRenderer legFrontLeft2;
    public ModelRenderer footFrontLeft;
    public ModelRenderer legBackLeft2;
    public ModelRenderer footBackLeft;
    public ModelRenderer legBackRight2;
    public ModelRenderer footBackRight;
    public ModelRenderer tail2;
    public ModelRenderer tail3;

    public ModelPascal() {
        this.textureWidth = 100;
        this.textureHeight = 80;
        this.footFrontRight = new ModelRenderer(this, 14, 30);
        this.footFrontRight.setRotationPoint(0.0F, 5.4F, 0.1F);
        this.footFrontRight.addBox(-2.0F, 0.0F, -3.3F, 4, 1, 5, 0.0F);
        this.setRotateAngle(footFrontRight, -0.02617993877991494F, 0.0F, 0.0F);
        this.footFrontLeft = new ModelRenderer(this, 9, 36);
        this.footFrontLeft.setRotationPoint(0.0F, 5.4F, 0.1F);
        this.footFrontLeft.addBox(-2.0F, 0.0F, -3.3F, 4, 1, 5, 0.0F);
        this.setRotateAngle(footFrontLeft, -0.02617993877991494F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 58, 0);
        this.head.setRotationPoint(0.0F, -2.3F, -6.7F);
        this.head.addBox(-5.0F, -5.5F, -10.0F, 10, 11, 10, 0.0F);
        this.setRotateAngle(head, 0.10471975511965977F, 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 48, 47);
        this.tail3.setRotationPoint(0.0F, 3.0F, 9.0F);
        this.tail3.addBox(-1.0F, -7.0F, 0.0F, 2, 7, 6, 0.0F);
        this.footBackRight = new ModelRenderer(this, 74, 40);
        this.footBackRight.setRotationPoint(0.0F, 5.4F, 0.1F);
        this.footBackRight.addBox(-2.0F, 0.0F, -3.8F, 4, 1, 6, 0.0F);
        this.setRotateAngle(footBackRight, -0.02617993877991494F, 0.0F, 0.0F);
        this.footBackLeft = new ModelRenderer(this, 54, 40);
        this.footBackLeft.setRotationPoint(0.0F, 5.4F, 0.1F);
        this.footBackLeft.addBox(-2.0F, 0.0F, -3.8F, 4, 1, 6, 0.0F);
        this.setRotateAngle(footBackLeft, -0.02617993877991494F, 0.0F, 0.0F);
        this.legFrontLeft1 = new ModelRenderer(this, 38, 0);
        this.legFrontLeft1.setRotationPoint(2.5F, 2.5F, -4.7F);
        this.legFrontLeft1.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(legFrontLeft1, -0.05235987755982988F, -0.17453292519943295F, -0.17453292519943295F);
        this.mane = new ModelRenderer(this, 79, 21);
        this.mane.setRotationPoint(0.0F, -5.0F, -3.9F);
        this.mane.addBox(-0.5F, -3.0F, -5.6F, 1, 3, 9, 0.0F);
        this.setRotateAngle(mane, 0.05235987755982988F, 0.0F, 0.0F);
        this.eyeRight = new ModelRenderer(this, 54, 0);
        this.eyeRight.setRotationPoint(-4.5F, -1.0F, -8.3F);
        this.eyeRight.addBox(-1.0F, -2.5F, -2.5F, 2, 5, 5, 0.0F);
        this.setRotateAngle(eyeRight, -0.03490658503988659F, -0.2617993877991494F, 0.0F);
        this.spine = new ModelRenderer(this, 62, 23);
        this.spine.setRotationPoint(0.0F, -4.5F, 3.7F);
        this.spine.addBox(-0.5F, -2.0F, -7.5F, 1, 2, 15, 0.0F);
        this.setRotateAngle(spine, -0.017453292519943295F, 0.0F, 0.0F);
        this.legFrontRight1 = new ModelRenderer(this, 0, 0);
        this.legFrontRight1.setRotationPoint(-2.5F, 2.5F, -4.7F);
        this.legFrontRight1.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(legFrontRight1, -0.05235987755982988F, 0.17453292519943295F, 0.17453292519943295F);
        this.legFrontRight2 = new ModelRenderer(this, 64, 21);
        this.legFrontRight2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.legFrontRight2.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(legFrontRight2, 0.1308996938995747F, 0.0F, -0.17453292519943295F);
        this.legBackLeft2 = new ModelRenderer(this, 40, 38);
        this.legBackLeft2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.legBackLeft2.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(legBackLeft2, 0.1308996938995747F, 0.0F, 0.2617993877991494F);
        this.tail1 = new ModelRenderer(this, 45, 21);
        this.tail1.setRotationPoint(0.0F, -4.5F, 11.8F);
        this.tail1.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 13, 0.0F);
        this.setRotateAngle(tail1, -0.2617993877991494F, 0.0F, 0.0F);
        this.legBackRight2 = new ModelRenderer(this, 23, 39);
        this.legBackRight2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.legBackRight2.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(legBackRight2, 0.1308996938995747F, 0.0F, -0.2617993877991494F);
        this.eyeLeft = new ModelRenderer(this, 0, 30);
        this.eyeLeft.setRotationPoint(4.5F, -1.0F, -8.3F);
        this.eyeLeft.addBox(-1.0F, -2.5F, -2.5F, 2, 5, 5, 0.0F);
        this.setRotateAngle(eyeLeft, -0.03490658503988659F, 0.2617993877991494F, 0.0F);
        this.legFrontLeft2 = new ModelRenderer(this, 32, 30);
        this.legFrontLeft2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.legFrontLeft2.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(legFrontLeft2, 0.1308996938995747F, 0.0F, 0.17453292519943295F);
        this.tail2 = new ModelRenderer(this, 0, 42);
        this.tail2.setRotationPoint(0.0F, 0.8F, 11.8F);
        this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F);
        this.setRotateAngle(tail2, 0.5235987755982988F, 0.0F, 0.0F);
        this.legBackLeft1 = new ModelRenderer(this, 0, 9);
        this.legBackLeft1.setRotationPoint(2.8F, 2.4F, 7.5F);
        this.legBackLeft1.addBox(-2.0F, -1.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(legBackLeft1, -0.05235987755982988F, -0.17453292519943295F, -0.2617993877991494F);
        this.legBackRight1 = new ModelRenderer(this, 38, 9);
        this.legBackRight1.setRotationPoint(-2.8F, 2.4F, 7.5F);
        this.legBackRight1.addBox(-2.0F, -1.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(legBackRight1, -0.05235987755982988F, 0.17453292519943295F, 0.2617993877991494F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 11.8F, 0.0F);
        this.body.addBox(-4.5F, -5.0F, -8.0F, 9, 10, 20, 0.0F);
        this.setRotateAngle(body, -0.017453292519943295F, 0.0F, 0.0F);
        this.legFrontRight2.addChild(this.footFrontRight);
        this.legFrontLeft2.addChild(this.footFrontLeft);
        this.body.addChild(this.head);
        this.tail2.addChild(this.tail3);
        this.legBackRight2.addChild(this.footBackRight);
        this.legBackLeft2.addChild(this.footBackLeft);
        this.body.addChild(this.legFrontLeft1);
        this.head.addChild(this.mane);
        this.head.addChild(this.eyeRight);
        this.body.addChild(this.spine);
        this.body.addChild(this.legFrontRight1);
        this.legFrontRight1.addChild(this.legFrontRight2);
        this.legBackLeft1.addChild(this.legBackLeft2);
        this.body.addChild(this.tail1);
        this.legBackRight1.addChild(this.legBackRight2);
        this.head.addChild(this.eyeLeft);
        this.legFrontLeft1.addChild(this.legFrontLeft2);
        this.tail1.addChild(this.tail2);
        this.body.addChild(this.legBackLeft1);
        this.body.addChild(this.legBackRight1);
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legBackRight1.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legBackLeft1.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        legFrontLeft1.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legFrontRight1.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;

        if (((EntityPascal)entity).isSitting()) {
            body.rotateAngleX = -0.5F;
            legFrontLeft1.rotateAngleX = 0.5F;
            legBackLeft1.rotateAngleX = -0.8F;
            legFrontRight1.rotateAngleX = 0.5F;
            legBackRight1.rotateAngleX = -0.8F;
            tail1.rotateAngleX = 0.5F;
            head.rotationPointX = 0.3F;

        } else {
            body.rotateAngleX = 0F;
            legBackRight1.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
            legBackLeft1.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
            legFrontLeft1.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
            legFrontRight1.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        }
    }

    @Override
    public void render(Entity entity, float swing, float speed, float age, float yaw, float pitch, float scale) {
        setRotationAngles(swing, speed, age, yaw, pitch, scale, entity);
        GlStateManager.pushMatrix();
        float sc = 0.28F;
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
