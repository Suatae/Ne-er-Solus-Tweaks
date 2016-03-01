package com.suatae.neersolustweaks.event;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class EventHandler {
	
	public static void preInit() {}
	
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new DeathUrnEvent());
		MinecraftForge.EVENT_BUS.register(new BlockHarvestEvent());
	}
	
	public static void postInit() {}
}
