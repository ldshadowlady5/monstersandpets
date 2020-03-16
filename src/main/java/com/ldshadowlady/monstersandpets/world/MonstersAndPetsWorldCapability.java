package com.ldshadowlady.monstersandpets.world;

import java.lang.reflect.Field;
import java.util.Objects;

import com.google.common.collect.ImmutableList;
import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.util.MapGenScatteredFeatureHook;
import com.ldshadowlady.monstersandpets.world.gen.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.ChunkProviderServer;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

@Mod.EventBusSubscriber(modid = MonstersAndPets.MODID)
public final class MonstersAndPetsWorldCapability {
	private MonstersAndPetsWorldCapability() {}

	private static final ResourceLocation MONSTERS_AND_PETS_WORLD_ID = new ResourceLocation(MonstersAndPets.MODID, "monsters_and_pets");

	@CapabilityInject(MonstersAndPetsWorld.class)
	private static final Capability<MonstersAndPetsWorld> CAPABILITY = null;

	public static Capability<MonstersAndPetsWorld> capability() {
		//noinspection ConstantConditions
		return Objects.requireNonNull(CAPABILITY, "CAPABILITY");
	}

	public static void init() {

		//CapabilityManager.INSTANCE.register(YouTuberDungeonWorld.class, new PrincessesSystemStorage(), StandardYouTuberDungeonWorld::ofNoTowers);
	}

	public static MonstersAndPetsWorld get(World world) {
		MonstersAndPetsWorld cap = world.getCapability(capability(), null);
		if (cap == null) {
			throw new IllegalStateException("Missing capability: " + world.getWorldInfo().getWorldName() + "/" + world.provider.getDimensionType().getName());	
		}
		return cap;
	}

	@SubscribeEvent
	public static void onAttachCapabilities(AttachCapabilitiesEvent<World> event) {
		IChunkProvider provider = event.getObject().getChunkProvider();
		MonstersAndPetsWorld monstersAndPetsWorld = null;
		if (provider instanceof ChunkProviderServer) {
			IChunkGenerator chunkGen = ((ChunkProviderServer) provider).chunkGenerator;
			if (chunkGen instanceof ChunkGeneratorOverworld) {
				ChunkGeneratorOverworld chunkGenOverworld = (ChunkGeneratorOverworld) chunkGen;
				Field genField = ReflectionHelper.findField(ChunkGeneratorOverworld.class, "field_186007_z", "scatteredFeatureGenerator");
				MapGenScatteredFeature gen;
				try {
					gen = (MapGenScatteredFeature) genField.get(chunkGenOverworld);
				} catch (IllegalAccessException e) {
					throw new RuntimeException("Unable to access temple generator", e);
				}
				BathHouseGenerator generatorbathhouse = new BathHouseGenerator(chunkGenOverworld);
				WitchHouseGenerator generatorwitchhouse = new WitchHouseGenerator(chunkGenOverworld);
				WitherTowerGenerator generatorwithertower = new WitherTowerGenerator(chunkGenOverworld);
				CircusTentGenerator generatorcircustent = new CircusTentGenerator(chunkGenOverworld);
				PizzeriaGenerator generatorpizzeria = new PizzeriaGenerator(chunkGenOverworld);
				YandereHighGenerator generatoryanderehigh = new YandereHighGenerator(chunkGenOverworld);
				AphmauHeadGenerator generatoraphmauhead = new AphmauHeadGenerator(chunkGenOverworld);
				DantdmHeadGenerator generatordantdmhead = new DantdmHeadGenerator(chunkGenOverworld);
				GamerburryHeadGenerator generatorgamerburryhead = new GamerburryHeadGenerator(chunkGenOverworld);
				JoelHeadGenerator generatorjoelhead = new JoelHeadGenerator(chunkGenOverworld);
				JoeyHeadGenerator generatorjoeyhead = new JoeyHeadGenerator(chunkGenOverworld);
				KoilHeadGenerator generatorkoilhead = new KoilHeadGenerator(chunkGenOverworld);
				LaurenHeadGenerator generatorlaurenhead = new LaurenHeadGenerator(chunkGenOverworld);
				LdshadowladyHeadGenerator generatorldshadowladyhead = new LdshadowladyHeadGenerator(chunkGenOverworld);
				OliHeadGenerator generatorolihead = new OliHeadGenerator(chunkGenOverworld);
				ScottHeadGenerator generatorscotthead = new ScottHeadGenerator(chunkGenOverworld);
				SeapeekayHeadGenerator generatorseapeekayhead = new SeapeekayHeadGenerator(chunkGenOverworld);
				StacyHeadGenerator generatorstacyhead = new StacyHeadGenerator(chunkGenOverworld);
				YammyHeadGenerator generatoryammyhead = new YammyHeadGenerator(chunkGenOverworld);


				gen = new MapGenScatteredFeatureHook(gen, ImmutableList.of(
					generatorbathhouse,
					generatorwithertower,
					generatorwitchhouse,
					generatorcircustent,
					generatorpizzeria,
					generatoryanderehigh,
					generatoraphmauhead,
					generatordantdmhead,
					generatorgamerburryhead,
					generatorjoelhead,
					generatorjoeyhead,
					generatorkoilhead,
					generatorlaurenhead,
					generatorldshadowladyhead,
					generatorolihead,
					generatorscotthead,
					generatorseapeekayhead,
					generatorstacyhead,
					generatoryammyhead
					));

				try {
					genField.set(chunkGenOverworld, gen);
				} catch (IllegalAccessException e) {
					throw new RuntimeException("Unable to replace temple generator", e);
				}
			}
		}

		event.addCapability(MONSTERS_AND_PETS_WORLD_ID, monstersAndPetsWorld);

	}

}
