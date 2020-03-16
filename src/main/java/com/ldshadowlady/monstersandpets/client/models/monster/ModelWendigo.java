package com.ldshadowlady.monstersandpets.client.models.monster;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * Wendigo - Jvckk
 * Created using Tabula 5.1.0
 */
public class ModelWendigo extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer legRight;
    public ModelRenderer legLeft;
    public ModelRenderer torso;
    public ModelRenderer legRight2;
    public ModelRenderer legRight3;
    public ModelRenderer footRight;
    public ModelRenderer legLeft2;
    public ModelRenderer legLeft3;
    public ModelRenderer footLeft;
    public ModelRenderer armRight;
    public ModelRenderer neck;
    public ModelRenderer armLeft;
    public ModelRenderer ribRight1;
    public ModelRenderer ribRight2;
    public ModelRenderer ribRight3;
    public ModelRenderer ribLeft1;
    public ModelRenderer ribLeft2;
    public ModelRenderer ribLeft3;
    public ModelRenderer armRight2;
    public ModelRenderer head;
    public ModelRenderer snout;
    public ModelRenderer antlerRight;
    public ModelRenderer antlerLeftt;
    public ModelRenderer earRight;
    public ModelRenderer earLeft;
    public ModelRenderer jaw;
    public ModelRenderer antlerRight2;
    public ModelRenderer antlerRight3;
    public ModelRenderer antlerRight4;
    public ModelRenderer antlerRight5;
    public ModelRenderer antlerLeft2;
    public ModelRenderer antlerLeft3;
    public ModelRenderer antlerLeft4;
    public ModelRenderer antlerLeft5;
    public ModelRenderer armLeft2;

    public ModelWendigo() {
        this.textureWidth = 170;
        this.textureHeight = 115;
        this.armLeft = new ModelRenderer(this, 122, 33);
        this.armLeft.setRotationPoint(9.0F, -3.0F, 0.0F);
        this.armLeft.addBox(-2.5F, -2.5F, -2.5F, 5, 22, 5, 0.0F);
        this.setRotateAngle(armLeft, 0.06981317007977318F, 0.0F, -0.20943951023931953F);
        this.antlerLeft5 = new ModelRenderer(this, 80, 72);
        this.antlerLeft5.setRotationPoint(0.0F, 5.5F, -2.5F);
        this.antlerLeft5.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(antlerLeft5, -0.2617993877991494F, -0.6981317007977318F, 0.0F);
        this.legLeft3 = new ModelRenderer(this, 62, 22);
        this.legLeft3.setRotationPoint(0.0F, 12.0F, -2.0F);
        this.legLeft3.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(legLeft3, -1.2217304763960306F, 0.0F, 0.0F);
        this.ribLeft1 = new ModelRenderer(this, 152, 35);
        this.ribLeft1.setRotationPoint(5.5F, 5.0F, -7.5F);
        this.ribLeft1.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(ribLeft1, 0.05235987755982988F, 0.4363323129985824F, 0.0F);
        this.antlerLeft3 = new ModelRenderer(this, 132, 64);
        this.antlerLeft3.setRotationPoint(0.0F, -9.0F, 1.0F);
        this.antlerLeft3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(antlerLeft3, 0.6981317007977318F, 0.2617993877991494F, 0.0F);
        this.antlerRight5 = new ModelRenderer(this, 0, 40);
        this.antlerRight5.setRotationPoint(0.0F, 5.5F, -2.5F);
        this.antlerRight5.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(antlerRight5, -0.2617993877991494F, 0.6981317007977318F, 0.0F);
        this.legLeft = new ModelRenderer(this, 76, 0);
        this.legLeft.setRotationPoint(5.0F, 6.0F, 0.5F);
        this.legLeft.addBox(-4.0F, 0.0F, -4.0F, 8, 14, 8, 0.0F);
        this.setRotateAngle(legLeft, -0.17453292519943295F, 0.0F, 0.0F);
        this.antlerRight2 = new ModelRenderer(this, 154, 0);
        this.antlerRight2.setRotationPoint(0.5F, -0.2F, 7.5F);
        this.antlerRight2.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 3, 0.0F);
        this.setRotateAngle(antlerRight2, -0.6981317007977318F, -0.17453292519943295F, 0.0F);
        this.antlerRight = new ModelRenderer(this, 132, 50);
        this.antlerRight.setRotationPoint(-4.5F, -4.8F, -3.0F);
        this.antlerRight.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 10, 0.0F);
        this.setRotateAngle(antlerRight, 0.2617993877991494F, -0.17453292519943295F, 0.0F);
        this.antlerLeft4 = new ModelRenderer(this, 104, 71);
        this.antlerLeft4.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.antlerLeft4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(antlerLeft4, 0.17453292519943295F, 0.7853981633974483F, 0.0F);
        this.earRight = new ModelRenderer(this, 150, 43);
        this.earRight.setRotationPoint(-6.5F, -3.0F, -3.5F);
        this.earRight.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 7, 0.0F);
        this.setRotateAngle(earRight, 0.12217304763960307F, -0.3490658503988659F, 0.0F);
        this.footRight = new ModelRenderer(this, 100, 0);
        this.footRight.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footRight.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(footRight, 0.2617993877991494F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 58);
        this.head.setRotationPoint(0.0F, -0.5F, -12.0F);
        this.head.addBox(-6.5F, -6.0F, -10.0F, 13, 12, 10, 0.0F);
        this.setRotateAngle(head, 0.12217304763960307F, 0.0F, 0.0F);
        this.armLeft2 = new ModelRenderer(this, 46, 73);
        this.armLeft2.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.armLeft2.addBox(-2.0F, 0.0F, -2.0F, 4, 22, 4, 0.0F);
        this.setRotateAngle(armLeft2, -0.3490658503988659F, 0.0F, 0.08726646259971647F);
        this.ribLeft3 = new ModelRenderer(this, 68, 0);
        this.ribLeft3.setRotationPoint(5.5F, 10.0F, -6.9F);
        this.ribLeft3.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(ribLeft3, 0.05235987755982988F, 0.4363323129985824F, 0.0F);
        this.antlerLeftt = new ModelRenderer(this, 84, 58);
        this.antlerLeftt.setRotationPoint(4.5F, -4.8F, -3.0F);
        this.antlerLeftt.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 10, 0.0F);
        this.setRotateAngle(antlerLeftt, 0.2617993877991494F, 0.17453292519943295F, 0.0F);
        this.ribRight2 = new ModelRenderer(this, 68, 0);
        this.ribRight2.setRotationPoint(-5.5F, 7.5F, -7.2F);
        this.ribRight2.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(ribRight2, 0.05235987755982988F, -0.4363323129985824F, 0.0F);
        this.ribLeft2 = new ModelRenderer(this, 34, 0);
        this.ribLeft2.setRotationPoint(5.5F, 7.5F, -7.2F);
        this.ribLeft2.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(ribLeft2, 0.05235987755982988F, 0.4363323129985824F, 0.0F);
        this.footLeft = new ModelRenderer(this, 16, 26);
        this.footLeft.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.footLeft.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(footLeft, 0.2617993877991494F, 0.0F, 0.0F);
        this.legLeft2 = new ModelRenderer(this, 78, 22);
        this.legLeft2.setRotationPoint(0.0F, 10.8F, -2.0F);
        this.legLeft2.addBox(-3.0F, 0.0F, -3.0F, 6, 14, 6, 0.0F);
        this.setRotateAngle(legLeft2, 1.3089969389957472F, 0.0F, 0.0F);
        this.armRight2 = new ModelRenderer(this, 78, 42);
        this.armRight2.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.armRight2.addBox(-2.0F, 0.0F, -2.0F, 4, 22, 4, 0.0F);
        this.setRotateAngle(armRight2, -0.3490658503988659F, 0.0F, -0.08726646259971647F);
        this.earLeft = new ModelRenderer(this, 112, 60);
        this.earLeft.setRotationPoint(6.5F, -3.0F, -3.5F);
        this.earLeft.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 7, 0.0F);
        this.setRotateAngle(earLeft, 0.12217304763960307F, 0.3490658503988659F, 0.0F);
        this.ribRight3 = new ModelRenderer(this, 142, 33);
        this.ribRight3.setRotationPoint(-5.5F, 10.0F, -6.9F);
        this.ribRight3.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(ribRight3, 0.05235987755982988F, -0.4363323129985824F, 0.0F);
        this.antlerRight3 = new ModelRenderer(this, 62, 63);
        this.antlerRight3.setRotationPoint(0.0F, -9.0F, 1.0F);
        this.antlerRight3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(antlerRight3, 0.6981317007977318F, -0.2617993877991494F, 0.0F);
        this.snout = new ModelRenderer(this, 42, 50);
        this.snout.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.snout.addBox(-3.5F, -2.0F, -8.0F, 7, 5, 8, 0.0F);
        this.setRotateAngle(snout, 0.06981317007977318F, 0.0F, 0.0F);
        this.antlerRight4 = new ModelRenderer(this, 122, 64);
        this.antlerRight4.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.antlerRight4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(antlerRight4, 0.17453292519943295F, -0.7853981633974483F, 0.0F);
        this.neck = new ModelRenderer(this, 2, 34);
        this.neck.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.neck.addBox(-5.0F, -5.0F, -14.0F, 10, 10, 14, 0.0F);
        this.setRotateAngle(neck, -0.08726646259971647F, 0.0F, 0.0F);
        this.legRight2 = new ModelRenderer(this, 38, 22);
        this.legRight2.setRotationPoint(0.0F, 10.8F, -2.0F);
        this.legRight2.addBox(-3.0F, 0.0F, -3.0F, 6, 14, 6, 0.0F);
        this.setRotateAngle(legRight2, 1.3089969389957472F, 0.0F, 0.0F);
        this.legRight = new ModelRenderer(this, 44, 0);
        this.legRight.setRotationPoint(-5.0F, 6.0F, 0.5F);
        this.legRight.addBox(-4.0F, 0.0F, -4.0F, 8, 14, 8, 0.0F);
        this.setRotateAngle(legRight, -0.17453292519943295F, 0.0F, 0.0F);
        this.ribRight1 = new ModelRenderer(this, 34, 0);
        this.ribRight1.setRotationPoint(-5.5F, 5.0F, -7.5F);
        this.ribRight1.addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(ribRight1, 0.05235987755982988F, -0.4363323129985824F, 0.0F);
        this.torso = new ModelRenderer(this, 108, 0);
        this.torso.setRotationPoint(0.0F, -9.6F, 0.0F);
        this.torso.addBox(-8.0F, -6.0F, -8.0F, 16, 19, 14, 0.0F);
        this.setRotateAngle(torso, 0.17453292519943295F, 0.0F, 0.0F);
        this.antlerLeft2 = new ModelRenderer(this, 157, 61);
        this.antlerLeft2.setRotationPoint(-0.5F, -0.2F, 7.5F);
        this.antlerLeft2.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 3, 0.0F);
        this.setRotateAngle(antlerLeft2, -0.6981317007977318F, 0.17453292519943295F, 0.0F);
        this.legRight3 = new ModelRenderer(this, 0, 26);
        this.legRight3.setRotationPoint(0.0F, 12.0F, -2.0F);
        this.legRight3.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(legRight3, -1.2217304763960306F, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 46, 63);
        this.jaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.jaw.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 7, 0.0F);
        this.setRotateAngle(jaw, -0.03490658503988659F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, -10.6F, 0.0F);
        this.body.addBox(-6.0F, -6.0F, -4.5F, 12, 16, 10, 0.0F);
        this.setRotateAngle(body, -0.17453292519943295F, 0.0F, 0.0F);
        this.armRight = new ModelRenderer(this, 102, 33);
        this.armRight.setRotationPoint(-9.0F, -3.0F, 0.0F);
        this.armRight.addBox(-2.5F, -2.5F, -2.5F, 5, 22, 5, 0.0F);
        this.setRotateAngle(armRight, 0.06981317007977318F, 0.0F, 0.20943951023931953F);
        this.torso.addChild(this.armLeft);
        this.antlerLeft3.addChild(this.antlerLeft5);
        this.legLeft2.addChild(this.legLeft3);
        this.torso.addChild(this.ribLeft1);
        this.antlerLeft2.addChild(this.antlerLeft3);
        this.antlerRight3.addChild(this.antlerRight5);
        this.body.addChild(this.legLeft);
        this.antlerRight.addChild(this.antlerRight2);
        this.head.addChild(this.antlerRight);
        this.antlerLeft3.addChild(this.antlerLeft4);
        this.head.addChild(this.earRight);
        this.legRight3.addChild(this.footRight);
        this.neck.addChild(this.head);
        this.armLeft.addChild(this.armLeft2);
        this.torso.addChild(this.ribLeft3);
        this.head.addChild(this.antlerLeftt);
        this.torso.addChild(this.ribRight2);
        this.torso.addChild(this.ribLeft2);
        this.legLeft3.addChild(this.footLeft);
        this.legLeft.addChild(this.legLeft2);
        this.armRight.addChild(this.armRight2);
        this.head.addChild(this.earLeft);
        this.torso.addChild(this.ribRight3);
        this.antlerRight2.addChild(this.antlerRight3);
        this.head.addChild(this.snout);
        this.antlerRight3.addChild(this.antlerRight4);
        this.torso.addChild(this.neck);
        this.legRight.addChild(this.legRight2);
        this.body.addChild(this.legRight);
        this.torso.addChild(this.ribRight1);
        this.body.addChild(this.torso);
        this.antlerLeftt.addChild(this.antlerLeft2);
        this.legRight2.addChild(this.legRight3);
        this.snout.addChild(this.jaw);
        this.torso.addChild(this.armRight);
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float swing, float speed, float delta) {
        // Change the 1.2F for leg length (shorter = smaller/ longer = bigger
        // number)
        // Change the 0.7F (increase to increase speed legs move)
        legRight.rotateAngleX = MathHelper.cos(swing * 0.7F + (float) Math.PI) * 1.2F * speed;
        legLeft.rotateAngleX = MathHelper.cos(swing * 0.7F) * 1.2F * speed;
        armLeft.rotateAngleX = MathHelper.cos(swing * 0.2F + (float) Math.PI) * 1F * speed;
        armRight.rotateAngleX = MathHelper.cos(swing * 0.2F) * 1F * speed;
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
