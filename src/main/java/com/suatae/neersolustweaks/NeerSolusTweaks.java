package com.suatae.neersolustweaks;

import com.suatae.neersolustweaks.common.Registry.BlockReg;
import com.suatae.neersolustweaks.lib.Ref;
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
		
		BlockReg.init();
		
		proxy.registerBlockRenders();
	}

	@Mod.EventHandler
	public static void Load(FMLInitializationEvent event) {}

	@Mod.EventHandler
	public static void PostLoad(FMLPostInitializationEvent event) {}

}
