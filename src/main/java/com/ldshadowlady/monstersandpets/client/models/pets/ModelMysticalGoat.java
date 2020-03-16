package com.ldshadowlady.monstersandpets.client.models.pets;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSheep2 - Either Mojang or a mod author
 * Created using Tabula 5.1.0
 */
public class ModelMysticalGoat extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer tail;
    public ModelRenderer legBackLeft;
    public ModelRenderer legBackRight;
    public ModelRenderer neck;
    public ModelRenderer legFrontLeft;
    public ModelRenderer legFrontRight;
    public ModelRenderer mane;
    public ModelRenderer head;
    public ModelRenderer hornRight;
    public ModelRenderer earLeft;
    public ModelRenderer earRight;
    public ModelRenderer hornLeft;
    public ModelRenderer nose;
    public ModelRenderer hornRight1;
    public ModelRenderer ring;
    public ModelRenderer hornLeft1;
    public ModelRenderer goateeRight;
    public ModelRenderer goateeLeft;

    public ModelMysticalGoat() {
        this.textureWidth = 100;
        this.textureHeight = 50;
        this.body = new ModelRenderer(this, 0, 0);
        this.body.mirror = true;
        this.body.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.body.addBox(-4.5F, -3.0F, -8.0F, 9, 6, 14, 0.0F);
        this.legFrontRight = new ModelRenderer(this, 84, 0);
        this.legFrontRight.setRotationPoint(-3.1F, 2.0F, -5.5F);
        this.legFrontRight.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 3, 0.0F);
        this.hornLeft = new ModelRenderer(this, 84, 11);
        this.hornLeft.setRotationPoint(1.5F, -4.0F, 2.0F);
        this.hornLeft.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(hornLeft, -1.0471975511965976F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 20);
        this.head.setRotationPoint(0.0F, -5.2F, -1.0F);
        this.head.addBox(-3.0F, -5.0F, -4.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(head, -0.17453292519943295F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 56, 0);
        this.neck.setRotationPoint(0.0F, -2.0F, -6.5F);
        this.neck.addBox(-2.0F, -5.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(neck, 0.3490658503988659F, 0.0F, 0.0F);
        this.legFrontLeft = new ModelRenderer(this, 72, 0);
        this.legFrontLeft.setRotationPoint(3.1F, 2.0F, -5.5F);
        this.legFrontLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 3, 0.0F);
        this.nose = new ModelRenderer(this, 85, 19);
        this.nose.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.nose.addBox(-2.0F, -1.5F, -2.0F, 4, 3, 2, 0.0F);
        this.ring = new ModelRenderer(this, 5, 0);
        this.ring.setRotationPoint(0.7F, -1.3F, 1.5F);
        this.ring.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.earLeft = new ModelRenderer(this, 0, 7);
        this.earLeft.setRotationPoint(2.5F, -2.8F, 1.3F);
        this.earLeft.addBox(0.0F, -4.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(earLeft, -0.6981317007977318F, 0.17453292519943295F, 0.0F);
        this.legBackRight = new ModelRenderer(this, 44, 0);
        this.legBackRight.setRotationPoint(-3.1F, 1.0F, 4.8F);
        this.legBackRight.addBox(-1.5F, 0.0F, -2.0F, 3, 9, 3, 0.0F);
        this.hornLeft1 = new ModelRenderer(this, 19, 20);
        this.hornLeft1.setRotationPoint(0.1F, -6.0F, -1.0F);
        this.hornLeft1.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(hornLeft1, 0.40142572795869574F, 0.0F, 0.0F);
        this.legBackLeft = new ModelRenderer(this, 32, 0);
        this.legBackLeft.setRotationPoint(3.1F, 1.0F, 4.8F);
        this.legBackLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 9, 3, 0.0F);
        this.goateeLeft = new ModelRenderer(this, 92, 14);
        this.goateeLeft.setRotationPoint(1.0F, 1.0F, -0.8F);
        this.goateeLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(goateeLeft, -0.17453292519943295F, 0.0F, 0.0F);
        this.mane = new ModelRenderer(this, 47, 11);
        this.mane.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.mane.addBox(-5.0F, -3.5F, -4.5F, 10, 7, 9, 0.0F);
        this.goateeRight = new ModelRenderer(this, 95, 10);
        this.goateeRight.setRotationPoint(-1.0F, 1.0F, -0.8F);
        this.goateeRight.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(goateeRight, -0.17453292519943295F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 0, 0);
        this.tail.setRotationPoint(0.0F, -2.5F, 5.5F);
        this.tail.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(tail, -1.0016444577195458F, 0.0F, 0.0F);
        this.hornRight = new ModelRenderer(this, 6, 2);
        this.hornRight.setRotationPoint(-1.5F, -4.0F, 2.0F);
        this.hornRight.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(hornRight, -1.0471975511965976F, 0.0F, 0.0F);
        this.earRight = new ModelRenderer(this, 76, 11);
        this.earRight.setRotationPoint(-2.5F, -2.8F, 1.3F);
        this.earRight.addBox(-1.0F, -4.0F, -1.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(earRight, -0.6981317007977318F, -0.17453292519943295F, 0.0F);
        this.hornRight1 = new ModelRenderer(this, 46, 12);
        this.hornRight1.setRotationPoint(-0.1F, -6.0F, -1.0F);
        this.hornRight1.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(hornRight1, 0.40142572795869574F, 0.0F, 0.0F);
        this.body.addChild(this.legFrontRight);
        this.head.addChild(this.hornLeft);
        this.neck.addChild(this.head);
        this.body.addChild(this.neck);
        this.body.addChild(this.legFrontLeft);
        this.head.addChild(this.nose);
        this.earLeft.addChild(this.ring);
        this.head.addChild(this.earLeft);
        this.body.addChild(this.legBackRight);
        this.hornLeft.addChild(this.hornLeft1);
        this.body.addChild(this.legBackLeft);
        this.nose.addChild(this.goateeLeft);
        this.body.addChild(this.mane);
        this.nose.addChild(this.goateeRight);
        this.body.addChild(this.tail);
        this.head.addChild(this.hornRight);
        this.head.addChild(this.earRight);
        this.hornRight.addChild(this.hornRight1);
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
