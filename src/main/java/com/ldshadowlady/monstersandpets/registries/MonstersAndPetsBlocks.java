package com.ldshadowlady.monstersandpets.registries;


import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.item.MonstersAndPetsTab;
import com.ldshadowlady.monstersandpets.util.HarvestLevel;
import com.ldshadowlady.monstersandpets.util.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(MonstersAndPets.MODID)
@Mod.EventBusSubscriber(modid = MonstersAndPets.MODID)
public final class MonstersAndPetsBlocks {
	private MonstersAndPetsBlocks() {}

	private final static Block NIL = Blocks.AIR;

	public static final Block FNAF_WALL = NIL;
	public static final Block FNAF_WALL_DETAIL = NIL;
	public static final Block FNAF_FLOOR = NIL;




	@SubscribeEvent
	public static void onRegister(RegistryEvent.Register<Block> event){
		event.getRegistry().registerAll(
			create(new Block(Material.ROCK), "fnaf_wall"),
			create(new Block(Material.ROCK), "fnaf_wall_detail"),
			create(new Block(Material.ROCK), "fnaf_floor")



		);
	}


	private static Block setHarvestLevel(Block block, String toolClass, HarvestLevel level) {
		block.setHarvestLevel(toolClass, level.getValue());
		return block;
	}

	private static Block create(Block block, String name) {return create(block, name, MonstersAndPetsTab.instance());}

	private static Block create(Block block, String name, CreativeTabs tab) {
		return Util.name(block, name).setCreativeTab(tab);
	}
}
