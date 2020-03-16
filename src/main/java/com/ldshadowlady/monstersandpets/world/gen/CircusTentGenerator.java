package com.ldshadowlady.monstersandpets.world.gen;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.gen.structure.template.TemplateManager;

public final class CircusTentGenerator extends MapGenStructure {
	private static final String NAME = "CircusTent";

	private static final String COMPONENT_NAME = "CrcsTnt";

	private static final int SEED = 5749511;

	private final ChunkGeneratorOverworld generator;


	private final int spacing;

	private final int separation;

	public CircusTentGenerator(ChunkGeneratorOverworld generator) {
		this.generator = generator;
		this.spacing = 214;
		this.separation = 10;
	}

	@Override
	public String getStructureName() {
		return NAME;
	}

	@Override
	public BlockPos getNearestStructurePos(World world, BlockPos pos, boolean findUnexplored) {
		this.world = world;
		return findNearestStructurePosBySpacing(world, this, pos, spacing, separation, SEED, true, 100, findUnexplored);
	}

	@Override
	protected boolean canSpawnStructureAtCoords(int chunkX, int chunkZ) {
		int cellX = Math.floorDiv(chunkX, spacing);
		int cellZ = Math.floorDiv(chunkZ, spacing);
		Random rng = world.setRandomSeed(cellX, cellZ, SEED);
		int candidateX = cellX * spacing + (rng.nextInt(spacing - separation) + rng.nextInt(spacing - separation)) / 2;
		int candidateZ = cellZ * spacing + (rng.nextInt(spacing - separation) + rng.nextInt(spacing - separation)) / 2;
		BlockPos pos = new ChunkPos(chunkX, chunkZ).getBlock(8, 0, 8);
		return candidateX == chunkX && candidateZ == chunkZ;
	}

	@Override
	protected StructureStart getStructureStart(int chunkX, int chunkZ) {
		return Start.create(world, generator, rand, chunkX, chunkZ);
	}

	public static void init() {
		MapGenStructureIO.registerStructure(CircusTentGenerator.Start.class, NAME);
		MapGenStructureIO.registerStructureComponent(CircusTentTemplate.class, COMPONENT_NAME);
	}


	public static final class Start extends StructureStart {
		@SuppressWarnings("unused")
		public Start() {}

		private Start(int chunkX, int chunkZ, Collection<? extends StructureComponent> components) {
			super(chunkX, chunkZ);
			this.components.addAll(components);
			updateBoundingBox();
		}

		//Creates and randomizes rotation
		public static Start create(World world, ChunkGeneratorOverworld generator, Random rng, int chunkX, int chunkZ) {
			Rotation rotation = Rotation.values()[rng.nextInt(Rotation.values().length)];
			ChunkPrimer primer = new ChunkPrimer();
			generator.setBlocksInChunk(chunkX, chunkZ, primer);
			int y = primer.findGroundBlockIdx(0,0);
			BlockPos pos = new ChunkPos(chunkX, chunkZ).getBlock(12, y-15, 12);
			MinecraftServer server = world.getMinecraftServer();
			TemplateManager mgr = world.getSaveHandler().getStructureTemplateManager();
			return new Start(chunkX, chunkZ, Collections.singletonList(new CircusTentTemplate(mgr, pos, rotation)));
		}
	}
}