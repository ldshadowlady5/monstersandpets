package com.ldshadowlady.monstersandpets.client.models.pets;

import com.ldshadowlady.monstersandpets.entity.EntityAbstractPet;
import com.ldshadowlady.monstersandpets.entity.pet.EntityBoo;
import com.ldshadowlady.monstersandpets.entity.pet.EntityPascal;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * Boo - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelBoo extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer legFrontLeft;
    public ModelRenderer legFrontRight;
    public ModelRenderer legBackLeft;
    public ModelRenderer legBackRight;
    public ModelRenderer neck;
    public ModelRenderer tail;
    public ModelRenderer head;
    public ModelRenderer afro;
    public ModelRenderer jawTop;
    public ModelRenderer earRight;
    public ModelRenderer earLeft;
    public ModelRenderer afro2;
    public ModelRenderer jawBottom;

    public ModelBoo() {
        this.textureWidth = 90;
        this.textureHeight = 60;
        this.legBackLeft = new ModelRenderer(this, 66, 0);
        this.legBackLeft.setRotationPoint(3.1F, 1.5F, 4.5F);
        this.legBackLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.jawBottom = new ModelRenderer(this, 46, 0);
        this.jawBottom.setRotationPoint(0.0F, 2.0F, 0.4F);
        this.jawBottom.addBox(-1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F);
        this.setRotateAngle(jawBottom, -0.017453292519943295F, 0.0F, 0.0F);
        this.earLeft = new ModelRenderer(this, 76, 13);
        this.earLeft.setRotationPoint(4.1F, -4.4F, -1.0F);
        this.earLeft.addBox(-2.0F, -3.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(earLeft, 0.17453292519943295F, 0.0F, 0.4363323129985824F);
        this.legFrontRight = new ModelRenderer(this, 50, 0);
        this.legFrontRight.setRotationPoint(-2.8F, 3.5F, -4.5F);
        this.legFrontRight.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.neck = new ModelRenderer(this, 57, 17);
        this.neck.setRotationPoint(0.0F, -1.8F, -5.0F);
        this.neck.addBox(-3.0F, -2.5F, -6.0F, 6, 5, 7, 0.0F);
        this.setRotateAngle(neck, -0.6108652381980153F, 0.0F, 0.0F);
        this.jawTop = new ModelRenderer(this, 0, 5);
        this.jawTop.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.jawTop.addBox(-2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(jawTop, -0.017453292519943295F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 0);
        this.tail.setRotationPoint(0.0F, -3.5F, 7.0F);
        this.tail.addBox(-1.5F, 0.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(tail, 0.17453292519943295F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 13.5F, 0.0F);
        this.body.addBox(-5.0F, -4.0F, -7.0F, 10, 8, 14, 0.0F);
        this.legFrontLeft = new ModelRenderer(this, 34, 0);
        this.legFrontLeft.setRotationPoint(2.8F, 3.5F, -4.5F);
        this.legFrontLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 22);
        this.head.setRotationPoint(0.0F, 0.0F, -4.8F);
        this.head.addBox(-4.5F, -3.5F, -5.0F, 9, 7, 5, 0.0F);
        this.setRotateAngle(head, 0.6283185307179586F, 0.0F, 0.0F);
        this.afro = new ModelRenderer(this, 28, 24);
        this.afro.setRotationPoint(0.0F, -6.0F, -0.9F);
        this.afro.addBox(-6.0F, 0.0F, -2.5F, 12, 10, 5, 0.0F);
        this.setRotateAngle(afro, -0.03490658503988659F, 0.0F, 0.0F);
        this.afro2 = new ModelRenderer(this, 0, 35);
        this.afro2.setRotationPoint(0.0F, 2.3F, -0.9F);
        this.afro2.addBox(-5.5F, -2.3F, -4.0F, 11, 5, 4, 0.0F);
        this.setRotateAngle(afro2, 0.08726646259971647F, 0.0F, 0.0F);
        this.earRight = new ModelRenderer(this, 0, 9);
        this.earRight.setRotationPoint(-4.1F, -4.4F, -1.0F);
        this.earRight.addBox(-2.0F, -3.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(earRight, 0.17453292519943295F, 0.0F, -0.4363323129985824F);
        this.legBackRight = new ModelRenderer(this, 48, 11);
        this.legBackRight.setRotationPoint(-3.1F, 1.5F, 4.5F);
        this.legBackRight.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.body.addChild(this.legBackLeft);
        this.jawTop.addChild(this.jawBottom);
        this.head.addChild(this.earLeft);
        this.body.addChild(this.legFrontRight);
        this.body.addChild(this.neck);
        this.head.addChild(this.jawTop);
        this.body.addChild(this.tail);
        this.body.addChild(this.legFrontLeft);
        this.neck.addChild(this.head);
        this.head.addChild(this.afro);
        this.afro.addChild(this.afro2);
        this.head.addChild(this.earRight);
        this.body.addChild(this.legBackRight);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float partialTickTime) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legBackRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legBackLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        legFrontLeft.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legFrontRight.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;

        if (((EntityAbstractPet)entity).isSitting()) {
            body.rotateAngleX = -0.5F;
            legFrontLeft.rotateAngleX = 0.5F;
            legBackLeft.rotateAngleX = -0.8F;
            legFrontRight.rotateAngleX = 0.5F;
            legBackRight.rotateAngleX = -0.8F;
            tail.rotateAngleX = 0.5F;
            neck.rotateAngleX = -0.3F;

        } else {
            body.rotateAngleX = 0F;
            legBackRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
            legBackLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
            legFrontLeft.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
            legFrontRight.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
            neck.rotateAngleX = -0.6108652381980153F;
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
