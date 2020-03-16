package com.ldshadowlady.monstersandpets.util;

import java.util.List;
import java.util.Random;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStructure;

public final class MapGenScatteredFeatureHook extends MapGenScatteredFeature {
	private final MapGenScatteredFeature original;

	private final ImmutableList<MapGenStructure> generators;

	public MapGenScatteredFeatureHook(MapGenScatteredFeature original, ImmutableList<MapGenStructure> generators) {
		this.original = original;
		this.generators = generators;
	}

	@Override
	public void generate(World world, int chunkX, int chunkZ, ChunkPrimer primer) {
		original.generate(world, chunkX, chunkZ, primer);
		for (MapGenStructure generator : generators) {
			generator.generate(world, chunkX, chunkZ, primer);
		}
	}

	@Override
	public String getStructureName() {
		return original.getStructureName();
	}

	@Override
	public synchronized boolean generateStructure(World world, Random rng, ChunkPos pos) {
		boolean generated = original.generateStructure(world, rng, pos);
		for (MapGenStructure generator : generators) {
			generated |= generator.generateStructure(world, rng, pos);
		}
		return generated;
	}

	@Override
	public boolean isInsideStructure(BlockPos pos) {
		return original.isInsideStructure(pos);
	}

	@Override
	public boolean isPositionInStructure(World world, BlockPos pos) {
		return original.isPositionInStructure(world, pos);
	}

	@Override
	public BlockPos getNearestStructurePos(World world, BlockPos pos, boolean findUnexplored) {
		return original.getNearestStructurePos(world, pos, findUnexplored);
	}

	@Override
	public boolean isSwampHut(BlockPos pos) {
		return original.isSwampHut(pos);
	}

	@Override
	public List<Biome.SpawnListEntry> getMonsters() {
		return original.getMonsters();
	}
}
