package com.ldshadowlady.monstersandpets.util.biome;

import java.util.function.Predicate;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public interface BiomePredicate extends Predicate<Biome> {
    default ImmutableList<Biome> getBiomes() {
        return ForgeRegistries.BIOMES.getValuesCollection().stream()
            .filter(this)
            .collect(ImmutableList.toImmutableList());
    }

    default BiomePredicate not() {
        return b -> !test(b);
    }

    default BiomePredicate or(BiomePredicate other) {
        return b -> test(b) || other.test(b);
    }

    default BiomePredicate and(BiomePredicate other) {
        return b -> test(b) && other.test(b);
    }

    default BiomePredicate xor(BiomePredicate other) {
        return b -> test(b) ^ other.test(b);
    }

    default BiomePredicate implies(BiomePredicate other) {
        return b -> !test(b) || other.test(b);
    }

    static BiomePredicate any() {
        return b -> true;
    }

    static BiomePredicate none() {
        return b -> false;
    }

    static BiomePredicate of(BiomeDictionary.Type type) {
        return BiomePredicateDictionary.of(type);
    }

    static BiomePredicate of(Biome biome) {
        return BiomePredicateSpecific.of(biome);
    }
}
