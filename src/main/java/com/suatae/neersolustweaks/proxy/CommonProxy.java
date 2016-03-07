package com.suatae.neersolustweaks.proxy;

import net.minecraft.entity.player.EntityPlayer;

public abstract class CommonProxy {
	public void registerRenders(){}

	public EntityPlayer getClientPlayer() {
		return null;
	}
}
