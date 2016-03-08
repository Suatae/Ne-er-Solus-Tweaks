package com.suatae.neersolustweaks;

import net.minecraftforge.common.MinecraftForge;

import com.suatae.neersolustweaks.common.init.BlockReg;
import com.suatae.neersolustweaks.common.init.ItemReg;
import com.suatae.neersolustweaks.crafting.BasicCraftingHandler;
import com.suatae.neersolustweaks.crafting.RecipeRemover;
import com.suatae.neersolustweaks.event.DeathUrnEvent;
import com.suatae.neersolustweaks.event.EventHandler;
import com.suatae.neersolustweaks.lib.Ref;
import com.suatae.neersolustweaks.network.DescriptionHandler;
import com.suatae.neersolustweaks.proxy.CommonProxy;
import com.suatae.neersolustweaks.util.ConfigUtil;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version = Ref.VERSION)
public class NeerSolusTweaks {
	@Mod.Instance(Ref.MOD_ID)
	public static NeerSolusTweaks instance;
	
	@SidedProxy(clientSide = Ref.CLIENTSIDE, serverSide = Ref.SERVERSIDE)
	public static CommonProxy		proxy;
	
	@Mod.EventHandler
	public static void PreLoad(FMLPreInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new ConfigUtil());
		ConfigUtil.init(event.getSuggestedConfigurationFile());
		
		
		EventHandler.preInit();
		
		
	}

	@Mod.EventHandler
	public static void Load(FMLInitializationEvent event) {
		
		BlockReg.init();
		ItemReg.init();
		EventHandler.init();
		RecipeRemover.removeRecipe();
		BasicCraftingHandler.shapedRecipes();
		BasicCraftingHandler.shapelessRecipes();
		BasicCraftingHandler.forgeRecipes();
		proxy.registerRenders();
		
		DescriptionHandler.init();
	}

	@Mod.EventHandler
	public static void PostLoad(FMLPostInitializationEvent event) {
		EventHandler.postInit();
	}

}
