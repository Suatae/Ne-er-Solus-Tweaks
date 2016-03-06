package com.suatae.neersolustweaks.client.renders;

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

import org.lwjgl.opengl.GL11;

import com.suatae.neersolustweaks.client.models.DeathUrn;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal00;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal01;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal02;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal03;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal04;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal05;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal06;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal07;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal08;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal09;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal10;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal11;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal12;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal13;
import com.suatae.neersolustweaks.client.models.glowstone.Crystal14;
import com.suatae.neersolustweaks.lib.Ref;
import com.suatae.neersolustweaks.util.ResourceUtil;





public abstract class TESR extends TileEntitySpecialRenderer {

	//Block Death Urn
//	private IModelCustom model;
//	private static final ResourceLocation objLocation = ResourceUtil.getLocation(Ref.MOD_ID.toLowerCase(), "models/"+"deathurn"+".obj");
	private static final ResourceLocation	deathUrn_t	= ResourceUtil.getLocation("DeathUrn");
	private DeathUrn						deathUrn_m;
	
	//Block Crystal
	private static final ResourceLocation crystal_t = ResourceUtil.getLocation("CrystalCrop");
	private Crystal00			crystal00;
	private Crystal01			crystal01;
	private Crystal02			crystal02;
	private Crystal03			crystal03;
	private Crystal04			crystal04;
	private Crystal05			crystal05;
	private Crystal06			crystal06;
	private Crystal07			crystal07;
	private Crystal08			crystal08;
	private Crystal09			crystal09;
	private Crystal10			crystal10;
	private Crystal11			crystal11;
	private Crystal12			crystal12;
	private Crystal13			crystal13;
	private Crystal14			crystal14;

	public TESR() {
		this.deathUrn_m = new DeathUrn();
		//model = AdvancedModelLoader.loadModel(objLocation);
		
		this.crystal00 = new Crystal00();
		this.crystal01 = new Crystal01();
		this.crystal02 = new Crystal02();
		this.crystal03 = new Crystal03();
		this.crystal04 = new Crystal04();
		this.crystal05 = new Crystal05();
		this.crystal06 = new Crystal06();
		this.crystal07 = new Crystal07();
		this.crystal08 = new Crystal08();
		this.crystal09 = new Crystal09();
		this.crystal10 = new Crystal10();
		this.crystal11 = new Crystal11();
		this.crystal12 = new Crystal12();
		this.crystal13 = new Crystal13();
		this.crystal14 = new Crystal14();
	}

	public void renderDeathUrn(TileEntity tileEntity, double x, double y, double z, float f) {	
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        this.bindTexture(deathUrn_t);
     
		GL11.glPushMatrix();
		GL11.glRotatef(-180F, 0F, 0F, 1F);
		GL11.glScalef(1F, 1F, 1F);
		//model.renderAll();
		this.deathUrn_m.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	
	public void renderCrystalCrop(TileEntity tileEntity, double x, double y, double z, float f) {
		if (tileEntity.getBlockMetadata() == 0) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal00.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 1) {

			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal01.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 2) {

			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal02.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 3) {

			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal03.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 4) {

			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal04.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 5) {

			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal05.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 6) {

			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal06.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 7) {

			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal07.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 8) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal08.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 9) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal09.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 10) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal10.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}

		if (tileEntity.getBlockMetadata() == 11) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal11.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 12) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal12.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 13) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal13.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
		if (tileEntity.getBlockMetadata() == 14) {
			GL11.glPushMatrix();

			GL11.glTranslated((float)x + 0.5F, (float)y - 0.5F, (float)z + 0.5F);

			this.bindTexture(crystal_t);
			GL11.glPushMatrix();
			GL11.glRotatef(-180F, 0F, 0F, 1F);
			GL11.glScalef(1F, 1F, 1F);
			GL11.glRotatef(180F, 1F, 0F, 0F);
			this.crystal14.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
		}
	}

	protected int shouldrenderPass() {
		return 0;
	}

	private void adjustLightFixture(World world, int x, int y, int z, Block block) {
		Tessellator tess = Tessellator.instance;
		float brightness = block.getLightValue(world, x, y, z);
		int skyLight = world.getLightBrightnessForSkyBlocks(x, y, z, 0);
		int modulousModifier = skyLight % 65536;
		int divModifier = skyLight / 65536;
		tess.setColorOpaque_F(brightness, brightness, brightness);
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, modulousModifier, divModifier);
	}
}
