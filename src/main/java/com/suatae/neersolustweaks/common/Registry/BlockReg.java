package com.suatae.neersolustweaks.common.Registry;

import com.suatae.neersolustweaks.common.block.GSCrystalCrop;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockReg {
	
	public static final Block	blockCrystalCrop			= new GSCrystalCrop();

	public static void init(){
		GameRegistry.registerBlock(blockCrystalCrop, "blockGSCrystalCrop");
		GameRegistry.registerTileEntity(TileEntityGSCrystal.class, "TileEntityCrystalCrop");
		
	}
}
