package com.suatae.neersolustweaks.common.init;

import com.suatae.neersolustweaks.common.block.BlockRoadDirt;
import com.suatae.neersolustweaks.common.block.BlockRoadDirtSlab;
import com.suatae.neersolustweaks.common.block.BlockRoadStone;
import com.suatae.neersolustweaks.common.block.BlockRoadStoneSlab;
import com.suatae.neersolustweaks.common.block.BlockDeathUrn;
import com.suatae.neersolustweaks.common.block.BlockGSCrystalCrop;
import com.suatae.neersolustweaks.common.block.BlockHardenedObsidian;
import com.suatae.neersolustweaks.common.block.compressed.BlockCobble;
import com.suatae.neersolustweaks.common.block.compressed.BlockDirt;
import com.suatae.neersolustweaks.common.block.compressed.BlockGravel;
import com.suatae.neersolustweaks.common.block.compressed.BlockSand;
import com.suatae.neersolustweaks.common.block.compressed.ItemBlockCompressed;
import com.suatae.neersolustweaks.common.tileentity.TileEntityDeathUrn;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;
import com.suatae.neersolustweaks.common.tileentity.TileEntityRoad;
import com.suatae.neersolustweaks.lib.Ref;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Ref.MOD_ID)
public class BlockReg {
	
	public static final Block	blockCrystalCrop			= new BlockGSCrystalCrop();
	public static final Block blockDeathUrn = new BlockDeathUrn();
	
	public static final Block	blockRoadStone				= new BlockRoadStone();
	public static final Block	blockRoadStoneSlab			= new BlockRoadStoneSlab();

	public static final Block	blockRoaddirt				= new BlockRoadDirt();
	public static final Block	blockRoaddirtSlab			= new BlockRoadDirtSlab();
	
	public static final Block	blockCobble					= new BlockCobble();
	public static final Block	blockDirt					= new BlockDirt();
	public static final Block	blockSand					= new BlockSand();
	public static final Block	blockGravel					= new BlockGravel();
	
	public static final Block blockObsidian = new BlockHardenedObsidian();


	public static void init(){
		GameRegistry.registerBlock(blockCrystalCrop, "blockGSCrystalCrop");
		GameRegistry.registerBlock(blockDeathUrn, "blockDeathUrn");
		
		GameRegistry.registerBlock(blockRoadStone, "blockRoadStone");
		GameRegistry.registerBlock(blockRoadStoneSlab, "blockRoadStoneSlab");

		GameRegistry.registerBlock(blockRoaddirt, "blockRoaddirt");
		GameRegistry.registerBlock(blockRoaddirtSlab, "blockRoaddirtSlab");
		
		GameRegistry.registerBlock(blockObsidian, "blockHObsidian");
		
		
		GameRegistry.registerTileEntity(TileEntityGSCrystal.class, "TileEntityGSCrystal");
		GameRegistry.registerTileEntity(TileEntityDeathUrn.class, "TileEntityDeathUrn");
		
		GameRegistry.registerTileEntity(TileEntityRoad.class, "TileEntityRoad");
		
		
		GameRegistry.registerBlock(blockCobble, ItemBlockCompressed.class, "blockCobble");
		GameRegistry.registerBlock(blockDirt, ItemBlockCompressed.class, "blockDirt");
		GameRegistry.registerBlock(blockSand, ItemBlockCompressed.class, "blockSand");
		GameRegistry.registerBlock(blockGravel, ItemBlockCompressed.class, "blockGravel");
	}
}
