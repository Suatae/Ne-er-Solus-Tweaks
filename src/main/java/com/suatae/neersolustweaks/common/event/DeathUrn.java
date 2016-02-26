package com.suatae.neersolustweaks.common.event;

import java.util.Iterator;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DeathUrn {
	
public DeathUrn() {
		
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
			
			world.setBlock(x, y, z, Blocks.chest);
			TileEntityChest chest = (TileEntityChest) world.getTileEntity(x, y, z);
			for(EntityItem droppedItemEntity : event.drops) {
				counter++;
				ItemStack droppedItem = droppedItemEntity.getEntityItem();
				
				if(counter > chest.getSizeInventory()) {
					return;
				} else {
					chest.setInventorySlotContents(counter - 1, droppedItem);
					droppedItemEntity.setDead();
				}
			}
		}
	}

}
