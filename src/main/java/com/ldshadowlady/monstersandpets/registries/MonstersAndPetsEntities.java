package com.ldshadowlady.monstersandpets.registries;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.monstersandpets.*;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MonstersAndPets.MODID)
public class MonstersAndPetsEntities {

	@SubscribeEvent
	public static void onRegister(RegistryEvent.Register<EntityEntry> event) {

		int id = 0;

		for (MonstersType monster : MonstersType.values()) {
			String name = monster.getName() + "_monster";
			int spawnWeight = monster.getSpawnWeight();
			int spawnMin = monster.getSpawnMin();
			int spawnMax = monster.getSpawnMax();
			event.getRegistry().register(EntityEntryBuilder.create()
				.entity(monster.getEntityClass())
				.id(new ResourceLocation(MonstersAndPets.MODID,name), id++)
				.name(name)
				.tracker(80, 3, true)
				.egg(monster.getBackgroundColor(), monster.getForegroundColor())
				.spawn(EnumCreatureType.MONSTER,spawnWeight,spawnMin,spawnMax, ForgeRegistries.BIOMES)
				.build());
		}

		for (MonstersUnspawnableType unspawnablemonster : MonstersUnspawnableType.values()) {
			String name = unspawnablemonster.getName() + "_monster";
			event.getRegistry().register(EntityEntryBuilder.create()
				.entity(unspawnablemonster.getEntityClass())
				.id(new ResourceLocation(MonstersAndPets.MODID,name), id++)
				.name(name)
				.tracker(80, 3, true)
				.egg(unspawnablemonster.getBackgroundColor(), unspawnablemonster.getForegroundColor())
				.build());
		}

		for (PetsType pet : PetsType.values()) {
			String name = pet.getName() + "_pet";
			int spawnWeight = pet.getSpawnWeight();
			int spawnMin = pet.getSpawnMin();
			int spawnMax = pet.getSpawnMax();

			event.getRegistry().register(EntityEntryBuilder.create()
				.entity(pet.getEntityClass())
				.id(new ResourceLocation(MonstersAndPets.MODID,name), id++)
				.name(name)
				.tracker(80, 3, true)
				.egg(pet.getBackgroundColor(), pet.getForegroundColor())
				.spawn(EnumCreatureType.CREATURE,spawnWeight,spawnMin,spawnMax, ForgeRegistries.BIOMES)
				.build());
		}

		for (PetsMountableType pet : PetsMountableType.values()) {
			String name = pet.getName() + "_pet";
			int spawnWeight = pet.getSpawnWeight();
			int spawnMin = pet.getSpawnMin();
			int spawnMax = pet.getSpawnMax();

			event.getRegistry().register(EntityEntryBuilder.create()
				.entity(pet.getEntityClass())
				.id(new ResourceLocation(MonstersAndPets.MODID,name), id++)
				.name(name)
				.tracker(80, 3, true)
				.egg(pet.getBackgroundColor(), pet.getForegroundColor())
				.spawn(EnumCreatureType.CREATURE,spawnWeight,spawnMin,spawnMax, ForgeRegistries.BIOMES)
				.build());
		}
	}
}
