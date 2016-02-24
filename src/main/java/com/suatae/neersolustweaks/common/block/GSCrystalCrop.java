package com.suatae.neersolustweaks.common.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.suatae.neersolustweaks.client.creativetab.NeerSolusTab;
import com.suatae.neersolustweaks.common.init.CropBase;
import com.suatae.neersolustweaks.common.tileentity.TileEntityGSCrystal;
import com.suatae.neersolustweaks.lib.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GSCrystalCrop  extends CropBase implements ITileEntityProvider{
	
	public GSCrystalCrop() {
		super(Material.rock, 14);
		this.setBlockName(Ref.Name.Block.GSC);
		this.setBlockTextureName(Ref.Name.Block.GSC_Tex);
		this.setCreativeTab(NeerSolusTab.NeerSolus_TAB);
		this.setStepSound(Block.soundTypeGlass);
		this.setLightLevel(0.5F);
		this.setHardness(1.5F);
		this.setResistance(10.0F);

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityGSCrystal();
	}

	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		super.onNeighborBlockChange(world, x, y, z, block);
		this.canBlockStay(world, x, y, z);
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
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int X, int Y, int Z, Random ran) {
		super.randomDisplayTick(world, X, Y, Z, ran);
		double d0 = X + ran.nextFloat();
		double d1 = Y + 0.5F;
		double d2 = Z + ran.nextFloat();
		double d3 = 1.0D; // Color R
		double d4 = 1.0D; // Color G
		double d5 = 0.0D; // Color B

		double d6 = X + 0.0F + (6.0F * ran.nextFloat());
		double d6m = X + 0.0F + (-6.0F * ran.nextFloat());
		double d7 = Y + 0.0F + (2.0F * ran.nextFloat());
		double d8 = Z + 0.0F + (6.0F * ran.nextFloat());
		double d8m = Z + 0.0F + (-6.0F * ran.nextFloat());
		double d9 = Y + 0.0F + (-2.0F * ran.nextFloat());

		double d10 = 5.0F + (ran.nextFloat());
		double d11 = Y + 0.9F;
		double d12 = 4.8F;
		double d13 = 0.0D; // Velocity
		double d14 = 0.0D; // Velocity
		double d15 = 0.0D; // Velocity

		if (getPlantMetadata(world, X, Y, Z) == maxGrowthStage) {
			world.spawnParticle("mobSpell", d0, d1, d2, d3, d4, d5);
		}

		if (getPlantMetadata(world, X, Y, Z) >= maxGrowthStage - 4) {
			world.spawnParticle("townaura", d6, d7, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6, d9, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d7, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d9, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6, d7, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6, d9, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d7, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d9, d8, d3, d4, d5);
		}
	};

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

			drops.add(new ItemStack(this, 1, 0));

		}

		return drops;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister parIIconRegister) {
		iIcon = new IIcon[maxGrowthStage + 1];
		iIcon[0] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[1] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[2] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[3] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[4] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[5] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[6] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[7] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[8] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[9] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[10] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[11] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[12] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[13] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
		iIcon[14] = parIIconRegister.registerIcon(Ref.Name.Block.GSC_Tex);
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z,
			EntityPlayer player) {
		return null;
	}

}
