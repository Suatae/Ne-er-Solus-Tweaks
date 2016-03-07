package com.suatae.neersolustweaks.proxy;

import net.minecraft.entity.player.EntityPlayer;

public class ServerProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){}
	
	@Override
	public EntityPlayer getClientPlayer() {
		return null;
	}
}
