package com.suatae.neersolustweaks.crafting;

import com.suatae.neersolustweaks.common.init.ItemReg;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BasicCraftingHandler {
	
	static ItemStack glowSeed = new ItemStack(ItemReg.ItemCrystalSeed);
	
	public static void shapedRecipes(){
	GameRegistry.addShapelessRecipe(glowSeed, new Object[]{Items.glowstone_dust, Items.glowstone_dust, Items.glowstone_dust, Items.glowstone_dust});
	}

}
