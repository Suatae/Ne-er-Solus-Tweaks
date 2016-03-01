package com.suatae.neersolustweaks.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.neersolustweaks.client.renders.TESRDeathUrn;
import com.suatae.neersolustweaks.client.renders.TESRGlowStone;
import com.suatae.neersolustweaks.client.renders.ir.blocks.IRDeathUrn;
import com.suatae.neersolustweaks.common.registry.BlockReg;
import com.suatae.neersolustweaks.common.tileentity.TileEntityDeathUrn;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{
	
	TileEntitySpecialRenderer Crystal = new TESRGlowStone();
	TileEntitySpecialRenderer DeathUrn = new TESRDeathUrn();
	
	@Override
	public void registerBlockRenders(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGSCrystal.class, Crystal);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeathUrn.class, DeathUrn);
		
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockDeathUrn),
				new IRDeathUrn(DeathUrn, new TileEntityDeathUrn()));
		
	}

}
