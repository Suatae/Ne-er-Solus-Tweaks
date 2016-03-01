package com.suatae.neersolustweaks.client.renders;

import org.lwjgl.opengl.GL11;

import com.suatae.neersolustweaks.client.models.DeathUrn;
import com.suatae.neersolustweaks.lib.Ref;







import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.obj.WavefrontObject;

public class TESRDeathUrn extends TileEntitySpecialRenderer {

//	private IModelCustom model;
	private ResourceLocation texture;
	
	private DeathUrn model;
	
	public TESRDeathUrn(){
		this.model = new DeathUrn();
		
		
		//model = AdvancedModelLoader.loadModel(new ResourceLocation(Ref.MOD_ID.toLowerCase() + ":models/DeathUrn.obj"));
		texture = new ResourceLocation(Ref.MOD_ID.toLowerCase() + ":textures/models/DeathUrn.png");
	}

	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		renderWorldBlock(tileEntity, x, y, z, f);
	}

	public void renderWorldBlock(TileEntity tileEntity, double x, double y, double z, float f) {

			GL11.glPushMatrix();

			GL11.glTranslated(x + 0.5F, y + 1.5F, z + 0.5F);

			this.bindTexture(texture);
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			//this.model.renderAll();
			this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();

	}

	protected int shouldrenderPass() {
		return 1;
	}
	
	private void adjustLightFixture(World world, int x, int y, int z, Block block) {
		Tessellator tess = Tessellator.instance;
		float brightness = block.getLightValue(world, x, y, z);
		int skyLight = world.getLightBrightnessForSkyBlocks(x, y, z, 0);
		int modulousModifier = skyLight % 65536;
		int divModifier = skyLight / 65536;
		tess.setColorOpaque_F(brightness, brightness, brightness);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, modulousModifier,
				divModifier);
	}
}
