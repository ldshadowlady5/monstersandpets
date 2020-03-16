package com.ldshadowlady.monstersandpets.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MonstersAndPetsTab extends CreativeTabs{
	private static final class Holder {
		private static final CreativeTabs INSTANCE = new MonstersAndPetsTab();
	}

	private MonstersAndPetsTab() {
		super("monstersandpets");
	}

	@Override
	public ItemStack getTabIconItem() {return new ItemStack(Items.DIAMOND_SWORD); }

	public static CreativeTabs instance() {
		return Holder.INSTANCE;
	}
}

