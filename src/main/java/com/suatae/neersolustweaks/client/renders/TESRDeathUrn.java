package com.suatae.neersolustweaks.client.renders;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;



public class TESRDeathUrn extends TESR {

	public TESRDeathUrn() {
		super();
	}

	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		this.renderDeathUrn(tileEntity, x, y, z, f);
	}
}
