package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelFlower;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelNetherCreature;
import com.ldshadowlady.monstersandpets.entity.monster.EntityFlower;
import com.ldshadowlady.monstersandpets.entity.monster.EntityNetherCreature;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public final class RenderNetherCreature extends RenderLiving<EntityNetherCreature> {

	public RenderNetherCreature(RenderManager manager) {
	super(manager, new ModelNetherCreature(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityNetherCreature entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/nether_creature.png");
	}



}