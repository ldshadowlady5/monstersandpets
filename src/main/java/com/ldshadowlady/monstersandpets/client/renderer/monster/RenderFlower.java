package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelFlower;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelSkeletonSpider;
import com.ldshadowlady.monstersandpets.entity.monster.EntityFlower;
import com.ldshadowlady.monstersandpets.entity.monster.EntitySkeletonSpider;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderFlower extends RenderLiving<EntityFlower> {

	public RenderFlower(RenderManager manager) {
	super(manager, new ModelFlower(), 0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityFlower entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/flower.png");
	}

}