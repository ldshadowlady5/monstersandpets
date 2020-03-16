package com.ldshadowlady.monstersandpets.util.biome;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;

public final class BiomePredicateSpecific implements BiomePredicate {
    private final Biome biome;

    private BiomePredicateSpecific(Biome biome) {
        this.biome = biome;
    }

    @Override
    public boolean test(Biome biome) {
        return this.biome.equals(biome);
    }

    @Override
    public ImmutableList<Biome> getBiomes() {
        return ImmutableList.of(biome);
    }

    public static BiomePredicate of(Biome biome) {
        return new BiomePredicateSpecific(biome);
    }
}
