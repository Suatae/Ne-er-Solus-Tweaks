package com.suatae.neersolustweaks.client.renders;

import net.minecraft.tileentity.TileEntity;




public class TESRGlowStone extends TESR {

	public TESRGlowStone() {
		super();
}

	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		this.renderCrystalCrop(tileEntity, x, y, z, f);
	}
}
