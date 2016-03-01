package com.suatae.neersolustweaks.common.init;

import com.suatae.neersolustweaks.common.block.DeathUrn;
import com.suatae.neersolustweaks.common.block.GSCrystalCrop;
import com.suatae.neersolustweaks.common.tileentity.TileEntityDeathUrn;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;
import com.suatae.neersolustweaks.lib.Ref;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Ref.MOD_ID)
public class BlockReg {
	
	public static final Block	blockCrystalCrop			= new GSCrystalCrop();
	public static final Block blockDeathUrn = new DeathUrn();

	public static void init(){
		GameRegistry.registerBlock(blockCrystalCrop, "blockGSCrystalCrop");
		GameRegistry.registerBlock(blockDeathUrn, "blockDeathUrn");
		GameRegistry.registerTileEntity(TileEntityGSCrystal.class, "TileEntityCrystalCrop");
		GameRegistry.registerTileEntity(TileEntityDeathUrn.class, "TileEntityDeathUrn");
		
	}
}
