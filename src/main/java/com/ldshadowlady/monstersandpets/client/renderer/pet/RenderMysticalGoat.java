package com.ldshadowlady.monstersandpets.client.renderer.pet;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.models.pets.ModelMysticalGoat;
import com.ldshadowlady.monstersandpets.entity.pet.mountable.EntityMysticalGoat;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public final class RenderMysticalGoat extends RenderLiving<EntityMysticalGoat> {
	public RenderMysticalGoat(RenderManager manager) {
	super(manager, new ModelMysticalGoat(), 0.0F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMysticalGoat entity) {
		return new ResourceLocation(MonstersAndPets.MODID, "textures/entity/mystical_goat.png");
	}
}
