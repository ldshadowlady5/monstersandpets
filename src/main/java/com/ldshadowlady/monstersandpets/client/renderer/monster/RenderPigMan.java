package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelPigMan;
import com.ldshadowlady.monstersandpets.entity.monster.EntityPigMan;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderPigMan extends RenderLiving<EntityPigMan> {

	public RenderPigMan(RenderManager manager) {
	super(manager, new ModelPigMan(), 0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityPigMan entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/pig_man.png");
	}

}