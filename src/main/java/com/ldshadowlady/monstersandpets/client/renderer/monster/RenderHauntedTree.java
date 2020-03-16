package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelHauntedTree;
import com.ldshadowlady.monstersandpets.entity.monster.EntityHauntedTree;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderHauntedTree extends RenderLiving<EntityHauntedTree> {

	public RenderHauntedTree(RenderManager manager) {
	super(manager, new ModelHauntedTree(), 0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityHauntedTree entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/haunted_tree.png");
	}

}