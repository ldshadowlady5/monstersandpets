package com.ldshadowlady.monstersandpets.util.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public final class BiomePredicateDictionary implements BiomePredicate {
    private final BiomeDictionary.Type type;

    private BiomePredicateDictionary(BiomeDictionary.Type type) {
        this.type = type;
    }

    @Override
    public boolean test(Biome biome) {
        return BiomeDictionary.hasType(biome, this.type);
    }

    public static BiomePredicate of(BiomeDictionary.Type type) {
        return new BiomePredicateDictionary(type);
    }
}
