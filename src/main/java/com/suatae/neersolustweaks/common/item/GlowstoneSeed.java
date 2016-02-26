package com.suatae.neersolustweaks.common.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

import com.suatae.neersolustweaks.common.init.ItemBase;
import com.suatae.neersolustweaks.common.registry.BlockReg;
import com.suatae.neersolustweaks.lib.Ref;

public class GlowstoneSeed extends ItemBase implements IPlantable{

	private final Block plant = BlockReg.blockCrystalCrop;
	private final Block soil = Blocks.netherrack;
	
	public GlowstoneSeed(){
		super();
		this.setUnlocalizedName(Ref.Name.Item.GS);
	}
	
	@Override
	public boolean onItemUse(ItemStack ItemStack, EntityPlayer Player, World world, int x, int y,
			int z, int par7, float par8, float par9, float par10) {
		if (par7 != 1){
			return false;
		}
		else
			if(Player.canPlayerEdit(x, y+1, z, par7, ItemStack)){
				Block plantBlock = world.getBlock(x, y+1, z);
				if(!(plantBlock !=Blocks.air)){
					Block soilBlock = world.getBlock(x, y, z);
					if(!(soilBlock !=soil)){
						world.setBlock(x, y+1, z, plant);
						--ItemStack.stackSize;
					}
					return true;
				}
				return false;
			}
		return false;
		
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Cave;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		return plant;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		return 0;
	}

}
