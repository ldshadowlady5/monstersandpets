package com.ldshadowlady.monstersandpets.asm.plugin;

import java.util.Map;
import javax.annotation.Nullable;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name(MonstersAndPets.MODID)
@IFMLLoadingPlugin.MCVersion(MinecraftForge.MC_VERSION)
@IFMLLoadingPlugin.SortingIndex(1002)
@IFMLLoadingPlugin.TransformerExclusions("com.ldshadowlady.monstersandpets.asm.plugin.")
public final class MnstrPetPlugin implements IFMLLoadingPlugin {
	@Override
	public String[] getASMTransformerClass() {
		return new String[] { "com.ldshadowlady.monstersandpets.asm.PlayerPassengerPatchRuntimePatcher" };
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Nullable
	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}
}
