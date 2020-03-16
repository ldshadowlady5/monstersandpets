package com.ldshadowlady.monstersandpets.client;


import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.client.renderer.monster.*;
import com.ldshadowlady.monstersandpets.client.renderer.pet.*;
import com.ldshadowlady.monstersandpets.entity.monster.*;
import com.ldshadowlady.monstersandpets.entity.pet.*;
import com.ldshadowlady.monstersandpets.entity.pet.mountable.EntityMysticalGoat;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = MonstersAndPets.MODID)
public final class MonsterEntityModels {
	private MonsterEntityModels() {}

	@SubscribeEvent
	public static void onRegister(ModelRegistryEvent event) {

		RenderingRegistry.registerEntityRenderingHandler(EntitySkeletonSpider.class,rendermanager -> new RenderSkeletonSpider(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlower.class,rendermanager -> new RenderFlower(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherCreature.class,rendermanager -> new RenderNetherCreature(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityPigMan.class,rendermanager -> new RenderPigMan(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlenderman.class,rendermanager -> new RenderSlenderman(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityWendigo.class,rendermanager -> new RenderWendigo(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityHauntedTree.class,rendermanager -> new RenderHauntedTree(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityNoFace.class,rendermanager -> new RenderNoFace(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityPumpkinGhast.class,rendermanager -> new RenderPumpkinGhast(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityMysticalGoat.class,rendermanager -> new RenderMysticalGoat(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityWorpeltinger.class,rendermanager -> new RenderWorpeltinger(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoo.class,rendermanager -> new RenderBoo(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoose.class,rendermanager -> new RenderGoose(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityPascal.class,rendermanager -> new RenderPascal(rendermanager));


		RenderingRegistry.registerEntityRenderingHandler(EntityClown.class,rendermanager -> new RenderClown(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityClownGirl.class,rendermanager -> new RenderClownGirl(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityClownDark.class,rendermanager -> new RenderClownDark(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityClownSpooky.class,rendermanager -> new RenderClownSpooky(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityBonnie.class,rendermanager -> new RenderBonnie(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityFreddy.class,rendermanager -> new RenderFreddy(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityFoxy.class,rendermanager -> new RenderFoxy(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityPuppet.class,rendermanager -> new RenderPuppet(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityChica.class,rendermanager -> new RenderChica(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityYandereChan.class,rendermanager -> new RenderYandereChan(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityYandereRyusei.class,rendermanager -> new RenderYandereRyusei(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityYandereOsana.class,rendermanager -> new RenderYandereOsana(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityYandereKokona.class,rendermanager -> new RenderYandereKokona(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityYandereKatelyn.class,rendermanager -> new RenderYandereKatelyn(rendermanager));
		RenderingRegistry.registerEntityRenderingHandler(EntityYandereSenpai.class,rendermanager -> new RenderYandereSenpai(rendermanager));

		
	}
}
