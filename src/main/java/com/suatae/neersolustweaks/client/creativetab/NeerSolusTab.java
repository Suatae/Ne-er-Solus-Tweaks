package com.suatae.neersolustweaks.client.creativetab;

import com.suatae.neersolustweaks.lib.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class NeerSolusTab {
	
	public static final CreativeTabs	NeerSolus_TAB		= new CreativeTabs(Ref.MOD_ID) {
		@Override
		public Item getTabIconItem() {
			return Items.glowstone_dust;
		}
	};
}
