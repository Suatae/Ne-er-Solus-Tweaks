package com.suatae.neersolustweaks.common.registry;

import com.suatae.neersolustweaks.common.item.GlowstoneSeed;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemReg {
	
	public static final Item ItemCrystalSeed = new GlowstoneSeed();
	
	public static void init(){
		GameRegistry.registerItem(ItemCrystalSeed, "itemGlowstoneSeed");
	}

}
