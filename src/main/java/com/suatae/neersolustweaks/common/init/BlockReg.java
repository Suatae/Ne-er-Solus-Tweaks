package com.suatae.neersolustweaks.common.init;

import com.suatae.neersolustweaks.common.block.BlockRoadDirt;
import com.suatae.neersolustweaks.common.block.BlockRoadDirtSlab;
import com.suatae.neersolustweaks.common.block.BlockRoadStone;
import com.suatae.neersolustweaks.common.block.BlockRoadStoneSlab;
import com.suatae.neersolustweaks.common.block.DeathUrn;
import com.suatae.neersolustweaks.common.block.GSCrystalCrop;
import com.suatae.neersolustweaks.common.tileentity.TileEntityDeathUrn;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;
import com.suatae.neersolustweaks.common.tileentity.TileEntityRoad;
import com.suatae.neersolustweaks.lib.Ref;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Ref.MOD_ID)
public class BlockReg {
	
	public static final Block	blockCrystalCrop			= new GSCrystalCrop();
	public static final Block blockDeathUrn = new DeathUrn();
	
	public static final Block	blockRoadStone				= new BlockRoadStone();
	public static final Block	blockRoadStoneSlab			= new BlockRoadStoneSlab();

	public static final Block	blockRoaddirt				= new BlockRoadDirt();
	public static final Block	blockRoaddirtSlab			= new BlockRoadDirtSlab();

	public static void init(){
		GameRegistry.registerBlock(blockCrystalCrop, "blockGSCrystalCrop");
		GameRegistry.registerBlock(blockDeathUrn, "blockDeathUrn");
		
		GameRegistry.registerBlock(blockRoadStone, "blockRoadStone");
		GameRegistry.registerBlock(blockRoadStoneSlab, "blockRoadStoneSlab");

		GameRegistry.registerBlock(blockRoaddirt, "blockRoaddirt");
		GameRegistry.registerBlock(blockRoaddirtSlab, "blockRoaddirtSlab");
		
		
		GameRegistry.registerTileEntity(TileEntityGSCrystal.class, "TileEntityGSCrystal");
		GameRegistry.registerTileEntity(TileEntityDeathUrn.class, "TileEntityDeathUrn");
		
		GameRegistry.registerTileEntity(TileEntityRoad.class, "TileEntityRoad");
	}
}
