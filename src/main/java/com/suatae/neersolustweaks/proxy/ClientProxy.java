package com.suatae.neersolustweaks.proxy;

import com.suatae.neersolustweaks.client.renders.TESRDeathUrn;
import com.suatae.neersolustweaks.client.renders.TESRGlowStone;
import com.suatae.neersolustweaks.client.renders.ir.blocks.IRDeathUrn;
import com.suatae.neersolustweaks.common.init.BlockReg;
import com.suatae.neersolustweaks.common.tileentity.TileEntityDeathUrn;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;



public class ClientProxy extends CommonProxy {

	TileEntitySpecialRenderer	Crystal		= new TESRGlowStone();
	TileEntitySpecialRenderer	DeathUrn	= new TESRDeathUrn();

	@Override
	public void registerRenders() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGSCrystal.class, Crystal);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDeathUrn.class, DeathUrn);

		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockDeathUrn), new IRDeathUrn(
				DeathUrn, new TileEntityDeathUrn()));
		//System.out.println("rendering others"); 
	}

}
