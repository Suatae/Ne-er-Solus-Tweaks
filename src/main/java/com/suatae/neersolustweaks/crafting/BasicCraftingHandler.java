package com.suatae.neersolustweaks.crafting;

import com.suatae.neersolustweaks.common.init.ItemReg;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BasicCraftingHandler {
	
	static ItemStack glowBlock = new ItemStack(Blocks.glowstone);
	
	static ItemStack glowItem = new ItemStack(Items.glowstone_dust);
	static ItemStack glowSeed = new ItemStack(ItemReg.ItemCrystalSeed);
	
	public static void shapedRecipes(){
	//	GameRegistry.addShapedRecipe(glowSeed, new Object[] {"##", "##", "", Items.glowstone_dust});
	}

}
