package com.suatae.neersolustweaks.common.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.suatae.neersolustweaks.client.creativetab.NeerSolusTab;
import com.suatae.neersolustweaks.common.init.CropBase;
import com.suatae.neersolustweaks.common.init.ItemReg;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;
import com.suatae.neersolustweaks.lib.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGSCrystalCrop  extends CropBase implements ITileEntityProvider{
	
	public BlockGSCrystalCrop() {
		super(Material.rock, 14);
		this.setBlockName(Ref.Name.Block.GSC);
		this.setBlockTextureName(Ref.Name.Block.GSC_T);
		this.setCreativeTab(NeerSolusTab.NeerSolus_TAB);
		this.setStepSound(Block.soundTypeGlass);
		this.setLightLevel(1F);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setBlockBounds(0F, .4F, 0F, 1F, 1F, 1F);

	}
	
	
	@Override
	public TileEntity createNewTileEntity(World world, int var2) {
		return new TileEntityGSCrystal();
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return AxisAlignedBB.getBoundingBox((double)x + this.minX, (double)y + this.minY, (double)z + this.minZ, (double)x + this.maxX, (double)y + this.maxY, (double)z + this.maxZ);
    }
	
	public boolean canBlockStay(World world, int x, int y, int z)
    {
        return  true;
    }
	
	private boolean func_150107_m(World world, int x, int y, int z) {
		if (World.doesBlockHaveSolidTopSurface(world, x, y, z)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block Block) {
		return false;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		if (metadata == maxGrowthStage) {
			if (world.isBlockIndirectlyGettingPowered(x, y, z))
	        {
	            this.onBlockDestroyedByPlayer(world, x, y, z, 1);
	            drops.add(new ItemStack(Items.glowstone_dust, 5, 0));
	        }
			else{
				drops.add(new ItemStack(Items.glowstone_dust, 3, 0));
			}
		}

		if (metadata <= maxGrowthStage - 1) {

			drops.add(new ItemStack(ItemReg.ItemCrystalSeed, 1, 0));

		}

		return drops;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister parIIconRegister) {
		iIcon = new IIcon[maxGrowthStage + 1];
		iIcon[0] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[1] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[2] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[3] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[4] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[5] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[6] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[7] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[8] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[9] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[10] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[11] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[12] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[13] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
		iIcon[14] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_T);
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}

}
