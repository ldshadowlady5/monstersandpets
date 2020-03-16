package com.ldshadowlady.monstersandpets.client.renderer;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.registries.MonstersAndPetsItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = MonstersAndPets.MODID)
public class MonstersAndPetsItemModels {
	private MonstersAndPetsItemModels() {}

	@SubscribeEvent
	public static void onRegister(ModelRegistryEvent event) {
		register(MonstersAndPetsItems.BALLOON);
		register(MonstersAndPetsItems.CLOWN_SWORD);
		register(MonstersAndPetsItems.YANDERE_CHAINSAW);
		register(MonstersAndPetsItems.YANDERE_KATANA);
		register(MonstersAndPetsItems.YANDERE_KNIFE);
		register(MonstersAndPetsItems.HAPPY_MEAL);
		register(MonstersAndPetsItems.PIZZA);
		register(MonstersAndPetsItems.BURGER);
		register(MonstersAndPetsItems.HEART_COOKIE);
		register(MonstersAndPetsItems.DIARY);
		register(MonstersAndPetsItems.CHALK);
		register(MonstersAndPetsItems.LOVE_LETTER);

		register(MonstersAndPetsItems.FNAF_WALL);
		register(MonstersAndPetsItems.FNAF_WALL_DETAIL);
		register(MonstersAndPetsItems.FNAF_FLOOR);

		register(MonstersAndPetsItems.FLOUR);
		register(MonstersAndPetsItems.ICING_SUGAR);
		register(MonstersAndPetsItems.CHOCOLATE);
		register(MonstersAndPetsItems.SPRINKLES);
		register(MonstersAndPetsItems.PINK_DONUT);
		register(MonstersAndPetsItems.CHOCOLATE_DONUT);


	}

	private static ModelResourceLocation register(Item item) {
		System.out.printf("%s%n",item.getRegistryName());
		return register(item, 0);
	}

	private static ModelResourceLocation register(Item item, int id) {
		ResourceLocation name = item.getRegistryName();
		if (name == null) {
			throw new RuntimeException("Missing register name: " + item.getClass().getName() + ", unlocalizedName = " + item.getUnlocalizedName());
		}
		ModelResourceLocation resource = new ModelResourceLocation(MonstersAndPets.MODID + ':' + name.getResourcePath(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, id, resource);
		return resource;
	}

}
