package com.ldshadowlady.monstersandpets.client.renderer.monster;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelSlenderman;
import com.ldshadowlady.monstersandpets.client.models.monster.ModelWendigo;
import com.ldshadowlady.monstersandpets.entity.monster.EntitySlenderman;
import com.ldshadowlady.monstersandpets.entity.monster.EntityWendigo;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderWendigo extends RenderLiving<EntityWendigo> {

	public RenderWendigo(RenderManager manager) { super(manager, new ModelWendigo(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWendigo entity) {

		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/wendigo.png");
	}



}