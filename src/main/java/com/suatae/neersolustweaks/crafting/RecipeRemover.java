package com.suatae.neersolustweaks.crafting;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeRemover {
	
	public static void removeRecipe(){
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> remover = recipes.iterator();
		
		while(remover.hasNext()){
			ItemStack stack = remover.next().getRecipeOutput();
			if(stack !=null && stack.getItem() == Items.glowstone_dust){
				remover.remove();
			}
			if(stack !=null && stack.getItem() == Item.getItemFromBlock(Blocks.glowstone)){
				remover.remove();
			}
		}
	}

}
