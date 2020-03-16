package com.ldshadowlady.monstersandpets.world.gen;

import java.util.Random;

import com.ldshadowlady.monstersandpets.MonstersAndPets;
import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsLootTableList;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponentTemplate;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.TemplateManager;

public final class BathHouseTemplate extends StructureComponentTemplate {
	private static final ResourceLocation ID = new ResourceLocation(MonstersAndPets.MODID, "bath_house");

	private static final PlacementSettings SETTINGS_PROTO = new PlacementSettings()
		.setIgnoreEntities(true)
		.setReplacedBlock(Blocks.STRUCTURE_VOID);

	private static final String ROT = "Rot";

	private Rotation rotation;

	@SuppressWarnings("unused")
	public BathHouseTemplate() {}

	public BathHouseTemplate(TemplateManager mgr, BlockPos pos, Rotation rotation) {
		super(0);
		this.templatePosition = pos;
		this.rotation = rotation;
		load(mgr);
	}

	private void load(TemplateManager mgr) {
		setup(mgr.getTemplate(null, ID), templatePosition, SETTINGS_PROTO.copy().setRotation(rotation));
	}

	@Override
	protected void handleDataMarker(String function, BlockPos pos, World world, Random rng, StructureBoundingBox sbb) {
		switch (function) {
			case "princess": {
				break;
			}
			case "chest": {
				world.setBlockState(pos,Blocks.AIR.getDefaultState(),2);
				BlockPos chestPos = pos.down();
				if (sbb.isVecInside(chestPos)) {
					TileEntity entity = world.getTileEntity(chestPos);
					if (entity instanceof TileEntityChest) {
						((TileEntityChest) entity).setLootTable(MonstersAndPetsLootTableList.BATH_HOUSE_CHEST, rng.nextLong());
					}
				}
				break;
			}
			case "spawner": {
				
				break;
			}
		}
	}

	@Override
	protected void writeStructureToNBT(NBTTagCompound compound) {
		super.writeStructureToNBT(compound);
		compound.setString(ROT, rotation.name());
	}

	@Override
	protected void readStructureFromNBT(NBTTagCompound compound, TemplateManager mgr) {
		super.readStructureFromNBT(compound, mgr);
		rotation = Rotation.valueOf(compound.getString(ROT));
		load(mgr);
	}
}
