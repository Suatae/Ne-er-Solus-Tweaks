package com.suatae.neersolustweaks.common.event;

import java.util.Iterator;

import com.suatae.neersolustweaks.common.registry.BlockReg;
import com.suatae.neersolustweaks.common.tileentity.TileEntityDeathUrn;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DeathUrnEvent {
	
public DeathUrnEvent() {
		
	}
	
	@SubscribeEvent
	public void onPlayerDrops(PlayerDropsEvent event) {
		boolean saveItems = false;
		int counter = 0;
		
		for (Iterator<EntityItem> iterator = event.drops.iterator(); iterator.hasNext();) {
		    EntityItem droppedStack = iterator.next();
		    	iterator.remove();
		    	saveItems = true;
		    	break;
		}
		
		if(saveItems == true) {
			int x = MathHelper.floor_double(event.entityPlayer.posX);
			int y = MathHelper.floor_double(event.entityPlayer.posY);
			int z = MathHelper.floor_double(event.entityPlayer.posZ);
			
			World world = event.entityPlayer.worldObj;
			
			world.setBlock(x, y, z, BlockReg.blockDeathUrn);
			TileEntityDeathUrn urn = (TileEntityDeathUrn) world.getTileEntity(x, y, z);
			for(EntityItem droppedItemEntity : event.drops) {
				counter++;
				ItemStack droppedItem = droppedItemEntity.getEntityItem();
				
				if(counter > urn.getSizeInventory()) {
					return;
				} else {
					urn.setInventorySlotContents(counter - 1, droppedItem);
					droppedItemEntity.setDead();
				}
			}
		}
	}

}
