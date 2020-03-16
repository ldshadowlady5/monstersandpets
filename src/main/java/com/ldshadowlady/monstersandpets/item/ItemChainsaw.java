package com.ldshadowlady.monstersandpets.item;

import com.ldshadowlady.monstersandpets.entity.MonstersAndPetsSounds;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemChainsaw extends ItemSword {
	public ItemChainsaw(ToolMaterial material) {
		super(material);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	{
		World worldIn = attacker.getEntityWorld();
		stack.damageItem(1, attacker);
		worldIn.playSound(null, attacker.posX, attacker.posY, attacker.posZ, MonstersAndPetsSounds.YANDERE_CHAINSAW, SoundCategory.PLAYERS, 0.4F, 1);
		return true;
	}

}
