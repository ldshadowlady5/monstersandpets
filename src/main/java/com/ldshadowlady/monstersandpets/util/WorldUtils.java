package com.ldshadowlady.monstersandpets.util;

import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraftforge.common.BiomeDictionary;

public final class WorldUtils {
	private WorldUtils() {}

	public static boolean checkBiomes(BiomeProvider provider, int x, int z, int radius, Collection<BiomeDictionary.Type> includeTypes, Collection<BiomeDictionary.Type> excludeTypes) {
		return checkBiomes(provider, x, z, radius, b -> {
			Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(b);
			boolean isIncluded = false;
			for (BiomeDictionary.Type type : types) {
				if (!isIncluded && includeTypes.contains(type)) {
					isIncluded = true;
				}
				if (excludeTypes.contains(type)) {
					return false;
				}
			}
			return isIncluded;
		});
	}

	public static boolean checkBiomes(BiomeProvider provider, int x, int z, int radius, Collection<Biome> biomes) {
		return checkBiomes(provider, x, z, radius, biomes::contains);
	}

	// Good version of BiomeProvider#areBiomesViable
	public static boolean checkBiomes(BiomeProvider provider, int x, int z, int radius, Predicate<Biome> isAllowed) {
		int minX = x - radius >> 2;
		int minZ = z - radius >> 2;
		int maxX = x + radius >> 2;
		int maxZ = z + radius >> 2;
		int width = maxX - minX + 1;
		int height = maxZ - minZ + 1;
		//noinspection ConstantConditions
		Biome[] biomes = provider.getBiomesForGeneration(null, minX, minZ, width, height);
		for (int i = 0; i < width * height; i++) {
			Biome biome = biomes[i];
			if (!isAllowed.test(biome)) {
				return false;
			}
		}
		return true;
	}
}
