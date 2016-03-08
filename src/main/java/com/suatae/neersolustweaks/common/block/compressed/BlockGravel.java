package com.suatae.neersolustweaks.common.block.compressed;

import java.util.List;

import com.suatae.neersolustweaks.common.init.BlockCompBaseFalling;
import com.suatae.neersolustweaks.lib.Ref;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockGravel extends BlockCompBaseFalling {
	public static int		maxMeta	= 8;
	private final String	name	= Ref.Name.Block.gravel;
	private final String	namei	= Ref.Name.Block.igravel;
	@SideOnly(Side.CLIENT)
	private IIcon[]			icons;

	public BlockGravel() {
		super(Material.ground, "shovel", 0, 0.5F, 0F, Block.soundTypeGravel);
		this.setBlockName(name);
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
}
