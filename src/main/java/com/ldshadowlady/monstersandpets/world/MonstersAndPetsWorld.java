package com.ldshadowlady.monstersandpets.world;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public interface MonstersAndPetsWorld extends ICapabilityProvider {
	boolean isInPrincessTower(World world, BlockPos pos);
}
