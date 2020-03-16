package com.ldshadowlady.monstersandpets.proxy;

import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import com.ldshadowlady.monstersandpets.world.MonstersAndPetsWorldCapability;
import com.ldshadowlady.monstersandpets.world.gen.AphmauHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.BathHouseGenerator;
import com.ldshadowlady.monstersandpets.world.gen.CircusTentGenerator;
import com.ldshadowlady.monstersandpets.world.gen.DantdmHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.GamerburryHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.JoelHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.JoeyHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.KoilHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.LaurenHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.LdshadowladyHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.OliHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.PizzeriaGenerator;
import com.ldshadowlady.monstersandpets.world.gen.ScottHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.SeapeekayHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.StacyHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.WitchHouseGenerator;
import com.ldshadowlady.monstersandpets.world.gen.WitherTowerGenerator;
import com.ldshadowlady.monstersandpets.world.gen.YammyHeadGenerator;
import com.ldshadowlady.monstersandpets.world.gen.YandereHighGenerator;

public class CommonProxy {
	public void initRenders() {}

	public void init(){
		BathHouseGenerator.init();
		WitchHouseGenerator.init();
		WitherTowerGenerator.init();
		CircusTentGenerator.init();
		PizzeriaGenerator.init();
		YandereHighGenerator.init();
		AphmauHeadGenerator.init();
		DantdmHeadGenerator.init();
		GamerburryHeadGenerator.init();
		JoelHeadGenerator.init();
		JoeyHeadGenerator.init();
		KoilHeadGenerator.init();
		LaurenHeadGenerator.init();
		LdshadowladyHeadGenerator.init();
		OliHeadGenerator.init();
		ScottHeadGenerator.init();
		SeapeekayHeadGenerator.init();
		StacyHeadGenerator.init();
		YammyHeadGenerator.init();
		MonstersAndPetsWorldCapability.init();
		MonstersAndPetsLootTableList.init();
	}
}
