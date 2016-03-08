package com.suatae.neersolustweaks.common.block.compressed;

import java.util.List;
import java.util.Random;

import com.suatae.neersolustweaks.common.init.BlockCompBase;
import com.suatae.neersolustweaks.common.init.BlockReg;
import com.suatae.neersolustweaks.lib.Ref;
import com.suatae.neersolustweaks.util.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockCobble extends BlockCompBase {
	public static int		maxMeta	= 8;
	private final String	name	= Ref.Name.Block.cobble;
	private final String	namei	= Ref.Name.Block.icobble;
//	Random ran = new Random();
//	private int timer = 5 + ran.nextInt(25);
	
	@SideOnly(Side.CLIENT)
	private IIcon[]			icons;

	public BlockCobble() {
		super(Material.rock, "pickaxe", 0, 1.5F, 10F, Block.soundTypeStone);
		this.setBlockName(name);
//		this.setTickRandomly(true);
//		if (timer > 0) timer--;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[maxMeta];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister.registerIcon(namei + i);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {

		for (int i = 0; i < maxMeta; i++) {

			list.add(new ItemStack(item, 1, i));
		}
	}
	
//	public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
//    {
//		int meta = world.getBlockMetadata(x, y, x);
//		Block north = world.getBlock(x, y, z-1);
//		Block south = world.getBlock(x, y, z+1);
//		Block east = world.getBlock(x+1, y, z);
//		Block west = world.getBlock(x-1, y, z);
//		if(north == Blocks.lava || south == Blocks.lava || east == Blocks.lava || west == Blocks.lava){
//			LogHelper.info("I see Lava");
//				if(timer == 0){
//					LogHelper.info(timer);
//					world.setBlock(x, y, z, BlockReg.blockObsidian);
//				}
//			}	
//    }
}
