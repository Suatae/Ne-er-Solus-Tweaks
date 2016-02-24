package com.suatae.neersolustweaks.common.init;

import java.util.Random;

import com.suatae.neersolustweaks.lib.Ref;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CropBase extends BlockBush implements IGrowable {
	protected int		maxGrowthStage;

	@SideOnly(Side.CLIENT)
	protected IIcon[]	iIcon;

	public CropBase(Material mat, int MaxGrowthStage) {

		super(mat);
		this.setTickRandomly(true);
		this.setHardness(0.0F);
		this.setStepSound(soundTypeGrass);
		this.disableStats();
		maxGrowthStage = MaxGrowthStage;

	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }

	@Override
	public IIcon getIcon(int Side, int GrowthStage) {
		return iIcon[GrowthStage];
	}

	public void incrementGrowStage(World world, Random Rand, int x, int y, int z) {
		int growStage = world.getBlockMetadata(x, y, z)
				+ MathHelper.getRandomIntegerInRange(Rand, 2, 5);

		if (growStage > maxGrowthStage && world.isBlockIndirectlyGettingPowered(x, y, z) == true) {
			growStage = maxGrowthStage;
		}

		world.setBlockMetadataWithNotify(x, y, z, growStage, 2);
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random Rand, int Fortune) {
		return Item.getItemFromBlock(this);
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean func_149851_a(World world, int x, int y, int z, boolean p_149851_5_) {
		return world.getBlockMetadata(x, y, z) != maxGrowthStage;
	}

	@Override
	public boolean func_149852_a(World world, Random Rand, int x, int y, int z) {
		return true;
	}

	@Override
	public void func_149853_b(World world, Random Rand, int x, int y, int z) {
		incrementGrowStage(world, Rand, x, y, z);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random Rand) {
		super.updateTick(world, x, y, z, Rand);
		int growStage = world.getBlockMetadata(x, y, z) + 1;

		if (growStage > maxGrowthStage) {
			growStage = maxGrowthStage;
		}

		world.setBlockMetadataWithNotify(x, y, z, growStage, 2);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Ref.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
