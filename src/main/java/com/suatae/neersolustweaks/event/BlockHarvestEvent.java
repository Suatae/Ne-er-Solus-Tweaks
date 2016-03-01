package com.suatae.neersolustweaks.event;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BlockHarvestEvent {
	
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onBlockHarvest(HarvestDropsEvent event) {

		World world = event.world;
		Block block = event.block;


			if (block == Blocks.glowstone) {
				event.drops.clear();

			}
		}

	}

