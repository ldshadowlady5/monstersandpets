package com.ldshadowlady.monstersandpets.registries;

import java.util.stream.Stream;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.item.ItemChainsaw;
import com.ldshadowlady.monstersandpets.item.MonstersAndPetsTab;
import com.ldshadowlady.monstersandpets.util.Util;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(MonstersAndPets.MODID)
@Mod.EventBusSubscriber(modid = MonstersAndPets.MODID)
public class MonstersAndPetsItems {

	private static final Item NIL = Items.AIR;
	public static final Item BALLOON = NIL;
	public static final Item CLOWN_SWORD = NIL;
	public static final Item FNAF_WALL = NIL;
	public static final Item FNAF_WALL_DETAIL = NIL;
	public static final Item FNAF_FLOOR = NIL;
	public static final Item HEART_COOKIE = NIL;
	public static final Item YANDERE_KNIFE = NIL;
	public static final Item YANDERE_CHAINSAW = NIL;
	public static final Item YANDERE_KATANA = NIL;
	public static final Item HAPPY_MEAL = NIL;
	public static final Item BURGER = NIL;
	public static final Item PIZZA = NIL;
	public static final Item DIARY = NIL;
	public static final Item CHALK = NIL;
	public static final Item LOVE_LETTER = NIL;

	private static final Item.ToolMaterial CLOWNSWORD = EnumHelper.addToolMaterial("CLOWN_SWORD", 0, 800, 1.0F, 12.0F, 10);
	private static final Item.ToolMaterial YANDEREKNIFE = EnumHelper.addToolMaterial("YANDERE_KNIFE", 0, 800, 1.0F, 8.0F, 10);
	private static final Item.ToolMaterial YANDEREKATANA = EnumHelper.addToolMaterial("YANDERE_KATANA", 0, 800, 1.0F, 9.0F, 10);
	private static final Item.ToolMaterial YANDERECHAINSAW = EnumHelper.addToolMaterial("YANDERE_CHAINSAW", 0, 800, 1.0F, 10.0F, 10);

	public static final Item FLOUR = NIL;
	public static final Item ICING_SUGAR = NIL;
	public static final Item CHOCOLATE = NIL;
	public static final Item SPRINKLES = NIL;
	public static final Item STRAWBERRY_CAKE = NIL;
	public static final Item PINK_DONUT = NIL;
	public static final Item CHOCOLATE_DONUT = NIL;


	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			create(new Item(), "balloon"),
			create(new ItemSword(CLOWNSWORD), "clown_sword"),
			create(new ItemFood(1,1,false), "heart_cookie"),
			create(new ItemSword(YANDEREKNIFE), "yandere_knife"),
			create(new ItemChainsaw(YANDERECHAINSAW), "yandere_chainsaw"),
			create(new ItemSword(YANDEREKATANA), "yandere_katana"),
			create(new ItemFood(1,1,false), "happy_meal"),
			create(new ItemFood(1,1,false), "burger"),
			create(new ItemFood(1,1,false), "pizza"),
			create(new Item(), "diary"),
			create(new Item(), "chalk"),
			create(new Item(), "love_letter"),
			create(MonstersAndPetsBlocks.FNAF_WALL),
			create(MonstersAndPetsBlocks.FNAF_WALL_DETAIL),
			create(MonstersAndPetsBlocks.FNAF_FLOOR),

			//Food Items for pets
			
			//COMPONENTS
			create(new ItemFood(1,0.1F,false), "flour"),
			create(new ItemFood(1,0.1F,false), "icing_sugar"),
			create(new ItemFood(1,0.1F,false), "chocolate"),
			create(new ItemFood(1,0.1F,false), "sprinkles"),

			//SNACCS
			create(new ItemFood(10,1F,false), "pink_donut"),
			create(new ItemFood(10,1F,false), "chocolate_donut")




		);

	}

	private static Item[] create(Block... blocks) {
		return Stream.of(blocks).map(MonstersAndPetsItems::create).toArray(Item[]::new);
	}

	private static Item create(Block block) {
		return create(new ItemBlock(block));
	}

	private static Item create(ItemBlock item) {
		return create(item, item.getBlock().getRegistryName().toString());
	}

	private static Item create(Item item, String registryName) {return create(item, registryName, MonstersAndPetsTab.instance());}

	private static Item create(Item item, String registryName, CreativeTabs tab) {return Util.name(item, registryName).setCreativeTab(tab);}


}
