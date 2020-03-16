package com.ldshadowlady.monstersandpets;

import com.ldshadowlady.monstersandpets.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
	modid = MonstersAndPets.MODID,
	version = MonstersAndPets.VERSION, 
	name = MonstersAndPets.NAME,
	dependencies = "required-after:llibrary@[1.7,1.8)"
)
public class MonstersAndPets {
	public static final String MODID = "monstersandpets";

	public static final String NAME = "Monsters and Pets";

	public static final String VERSION = "1.0.1";

	@SidedProxy(
		clientSide = "com.ldshadowlady.monstersandpets.proxy.ClientProxy",
		serverSide = "com.ldshadowlady.monstersandpets.proxy.CommonProxy"
	)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void init(FMLPreInitializationEvent event) {
		proxy.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.initRenders();
	}
}
