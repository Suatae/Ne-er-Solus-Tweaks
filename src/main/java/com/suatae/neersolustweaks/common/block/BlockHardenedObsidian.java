package com.suatae.neersolustweaks.common.block;

import java.util.Random;

import com.suatae.neersolustweaks.client.creativetab.NeerSolusTab;
import com.suatae.neersolustweaks.common.init.BlockBase;
import com.suatae.neersolustweaks.common.init.BlockReg;
import com.suatae.neersolustweaks.lib.Ref;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockHardenedObsidian extends BlockBase{
	
	public BlockHardenedObsidian(){
		super(Material.rock);
		this.setBlockName(Ref.Name.Block.HO);
		this.setBlockTextureName(Ref.Name.Block.HO_T);
		this.setCreativeTab(NeerSolusTab.NeerSolus_TAB);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(100F);
		this.setResistance(4000.0F);
	}
	
	public Item getItemDropped(int p_149650_1_, Random ran, int p_149650_3_)
    {
        return Item.getItemFromBlock(BlockReg.blockObsidian);
    }

}
