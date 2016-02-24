package com.suatae.neersolustweaks.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

import com.suatae.neersolustweaks.client.renders.TESRGlowStone;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{
	
	TileEntitySpecialRenderer Crystal = new TESRGlowStone();
	
	@Override
	public void registerBlockRenders(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGSCrystal.class, Crystal);
		
	}

}
