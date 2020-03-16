package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelSkeletonSpider;
import com.ldshadowlady.monstersandpets.entity.monster.EntitySkeletonSpider;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public final class RenderSkeletonSpider  extends RenderLiving<EntitySkeletonSpider> {

	public RenderSkeletonSpider(RenderManager manager) {
	super(manager, new ModelSkeletonSpider(), 0.3F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySkeletonSpider entity) {
		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/skeleton_spider.png");
	}

}