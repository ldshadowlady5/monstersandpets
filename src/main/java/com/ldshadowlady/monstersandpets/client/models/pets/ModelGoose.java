package com.ldshadowlady.monstersandpets.client.models.pets;

import com.ldshadowlady.monstersandpets.entity.pet.EntityGoose;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public final class ModelGoose extends ModelBase {
    private ModelRenderer body;
    private ModelRenderer rightleg;
    private ModelRenderer leftleg;
    private ModelRenderer neck;
    private ModelRenderer rwing;
    private ModelRenderer lwing;
    private ModelRenderer tail;
    private ModelRenderer head;
    private ModelRenderer bill;

    public ModelGoose() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.rwing = new ModelRenderer(this, 44, 9);
        this.rwing.setRotationPoint(-3.5F, -0.2F, -3.6F);
        this.rwing.addBox(-1.0F, -2.0F, 0.0F, 1, 4, 8, 0.0F);
        this.bill = new ModelRenderer(this, 51, 0);
        this.bill.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.bill.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 2, 0.0F);
        this.tail = new ModelRenderer(this, 0, 0);
        this.tail.setRotationPoint(0.0F, -2.5F, 4.5F);
        this.tail.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(tail, -0.045553093477052F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.body.addBox(-3.5F, -2.5F, -4.5F, 7, 5, 9, 0.0F);
        this.neck = new ModelRenderer(this, 32, 9);
        this.neck.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.neck.addBox(-1.5F, -7.0F, -3.0F, 3, 8, 3, 0.0F);
        this.leftleg = new ModelRenderer(this, 23, 0);
        this.leftleg.setRotationPoint(2.0F, 2.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.rightleg = new ModelRenderer(this, 39, 0);
        this.rightleg.setRotationPoint(-2.0F, 2.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.lwing = new ModelRenderer(this, 0, 14);
        this.lwing.setRotationPoint(3.5F, -0.2F, -3.6F);
        this.lwing.addBox(0.0F, -2.0F, 0.0F, 1, 4, 8, 0.0F);
        this.head = new ModelRenderer(this, 18, 19);
        this.head.setRotationPoint(0.0F, -8.9F, 0.0F);
        this.head.addBox(-2.5F, -2.0F, -5.0F, 5, 4, 5, 0.0F);
        this.body.addChild(this.rwing);
        this.head.addChild(this.bill);
        this.body.addChild(this.tail);
        this.body.addChild(this.neck);
        this.body.addChild(this.leftleg);
        this.body.addChild(this.rightleg);
        this.body.addChild(this.lwing);
        this.neck.addChild(this.head);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        leftleg.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        rightleg.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        if (((EntityGoose)entity).isSitting()) {
            leftleg.showModel = rightleg.showModel = false;
            body.rotationPointY = 21.5F;
        } else {
            leftleg.showModel = rightleg.showModel = true;
            body.rotationPointY = 17.0F;
        }
    }
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    private void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
