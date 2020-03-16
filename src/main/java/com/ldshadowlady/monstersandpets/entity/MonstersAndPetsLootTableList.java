package com.ldshadowlady.monstersandpets.entity;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public final class MonstersAndPetsLootTableList {
	private MonstersAndPetsLootTableList() {}

	public static final ResourceLocation SKELETON_SPIDER = register("entities/skeleton_spider");
	public static final ResourceLocation FLOWER = register("entities/flower");
	public static final ResourceLocation NETHER_CREATURE = register("entities/nether_creature");
	public static final ResourceLocation PIG_MAN = register("entities/pig_man");
	public static final ResourceLocation SLENDERMAN = register("entities/slenderman");
	public static final ResourceLocation WENDIGO = register("entities/wendigo");
	public static final ResourceLocation HAUNTED_TREE = register("entities/haunted_tree");
	public static final ResourceLocation NO_FACE = register("entities/no_face");
	public static final ResourceLocation PUMPKIN_GHAST = register("entities/pumpkin_ghast");
	public static final ResourceLocation CLOWN = register("entities/clown");
	public static final ResourceLocation BONNIE = register("entities/bonnie");
	public static final ResourceLocation CHICA = register("entities/chica");
	public static final ResourceLocation FOXY = register("entities/foxy");
	public static final ResourceLocation FREDDY = register("entities/freddy");
	public static final ResourceLocation PUPPET = register("entities/puppet");
	public static final ResourceLocation YANDERE_CHAN = register("entities/yandere_chan");
	public static final ResourceLocation YANDERE_STUDENT = register("entities/yandere_student");

	public static final ResourceLocation BATH_HOUSE_CHEST = register("chests/bath_house");
	public static final ResourceLocation WITCH_HOUSE_CHEST = register("chests/witch_house");
	public static final ResourceLocation WITHER_TOWER_CHEST = register("chests/wither_tower");
	public static final ResourceLocation CIRCUS_TENT_CHEST = register("chests/circus_tent");
	public static final ResourceLocation PIZZERIA_CHEST = register("chests/pizzeria");
	public static final ResourceLocation YANDERE_HIGH_CHEST = register("chests/yandere_high");

	public static final ResourceLocation APHMAU_CHEST = register("chests/aphmau_head");
	public static final ResourceLocation DANTDM_CHEST = register("chests/dantdm_head");
	public static final ResourceLocation GAMERBURRY_CHEST = register("chests/gamerburry_head");
	public static final ResourceLocation JOEL_CHEST = register("chests/joel_head");
	public static final ResourceLocation JOEY_CHEST = register("chests/joey_head");
	public static final ResourceLocation KOIL_CHEST = register("chests/koil_head");
	public static final ResourceLocation LAUREN_CHEST = register("chests/lauren_head");
	public static final ResourceLocation LDSHADOWLADY_CHEST = register("chests/lizzie_head");
	public static final ResourceLocation OLI_CHEST = register("chests/oli_head");
	public static final ResourceLocation SCOTT_CHEST = register("chests/scott_head");
	public static final ResourceLocation SEAPEEKAY_CHEST = register("chests/seapeekay_head");
	public static final ResourceLocation STACY_CHEST = register("chests/stacy_head");
	public static final ResourceLocation YAMMY_CHEST = register("chests/yammy_head");

	public static void init() {}

	private static ResourceLocation register(String id) {
		return LootTableList.register(new ResourceLocation(MonstersAndPets.MODID, id));
	}
}
