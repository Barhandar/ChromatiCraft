/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import Reika.ChromatiCraft.ChromatiCraft;
import Reika.ChromatiCraft.Base.BlockAttachableMini;
import Reika.ChromatiCraft.Block.Worldgen.BlockTieredOre;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.ChromatiCraft.Registry.ChromaGuis;
import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.ChromatiCraft.Render.Particle.EntityCenterBlurFX;
import Reika.ChromatiCraft.Render.Particle.EntityLaserFX;
import Reika.DragonAPI.ModList;
import Reika.DragonAPI.ASM.DependentMethodStripper.ModDependent;
import Reika.DragonAPI.Interfaces.TileEntity.GuiController;
import Reika.DragonAPI.Interfaces.TileEntity.ThermalTile;
import Reika.DragonAPI.Libraries.ReikaAABBHelper;
import Reika.DragonAPI.Libraries.Java.ReikaRandomHelper;
import Reika.ReactorCraft.Auxiliary.ReactorCoreTE;
import Reika.RotaryCraft.API.Interfaces.BasicTemperatureMachine;
import Reika.RotaryCraft.Auxiliary.Interfaces.TemperatureTE;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHeatLamp extends BlockAttachableMini {

	public BlockHeatLamp(Material mat) {
		super(mat);
	}

	@Override
	public void registerBlockIcons(IIconRegister ico) {
		blockIcon = ((BlockTieredOre)ChromaBlocks.TIEREDORE.getBlockInstance()).getGeodeIcon(6);
	}

	@Override
	@SideOnly(Side.CLIENT)
	protected void createFX(World world, double dx, double dy, double dz, Random r) {
		EntityFX fx = new EntityCenterBlurFX(CrystalElement.ORANGE, world, dx, dy, dz, 0, 0, 0).setScale(2+r.nextFloat()*2);
		if (r.nextInt(4) == 0) {
			fx = new EntityLaserFX(CrystalElement.ORANGE, world, dx, dy, dz, 0, 0, 0).setScale(2+r.nextFloat()*2);
		}
		Minecraft.getMinecraft().effectRenderer.addEffect(fx);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer ep, int s, float a, float b, float c) {
		ep.openGui(ChromatiCraft.instance, ChromaGuis.TILE.ordinal(), world, x, y, z);
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityHeatLamp();
	}

	@Override
	public boolean hasTileEntity(int meta) {
		return true;
	}

	@Override
	public int getColor() {
		return 0xffaa00;
	}

	public static class TileEntityHeatLamp extends TileEntity implements GuiController {

		public int temperature;
		public static final int MAXTEMP = 615;

		@Override
		public boolean canUpdate() {
			return true;
		}

		@Override
		public void updateEntity() {
			temperature = Math.max(0, Math.min(MAXTEMP, temperature));
			ForgeDirection dir = ((BlockHeatLamp)this.getBlockType()).getSide(worldObj, xCoord, yCoord, zCoord).getOpposite();
			TileEntity te = worldObj.getTileEntity(xCoord+dir.offsetX, yCoord+dir.offsetY, zCoord+dir.offsetZ);
			if (te instanceof ThermalTile) {
				//((ThermalTile)te).setTemperature(((ThermalTile) te).getTemperature()+(int)Math.signum(temperature-((ThermalTile) te).getTemperature()));
				ThermalTile tl = (ThermalTile)te;
				if (this.canHeat(tl)) {
					if (temperature > tl.getTemperature()) {
						tl.setTemperature(tl.getTemperature()+1);
						if (ModList.ROTARYCRAFT.isLoaded() && te instanceof BasicTemperatureMachine)
							((BasicTemperatureMachine)te).resetAmbientTemperatureTimer();
					}
				}
				else {
					((BlockHeatLamp)this.getBlockType()).drop(worldObj, xCoord, yCoord, zCoord);
				}
			}
			else if (te instanceof TileEntityFurnace) {
				TileEntityFurnace tf = (TileEntityFurnace)te;
				double c = Math.min(1, 1.25*temperature/1000D);
				if (ReikaRandomHelper.doWithChance(c)) {
					if (tf.furnaceBurnTime == 0 && ReikaRandomHelper.doWithChance(c)) {
						tf.furnaceBurnTime = 20;
					}
					te.updateEntity();
				}
			}
		}

		private boolean canHeat(ThermalTile tl) {
			if (ModList.ROTARYCRAFT.isLoaded() && this.isRotaryHeatTile(tl))
				return false;
			return !ModList.REACTORCRAFT.isLoaded() || !this.isReactorTile(tl);
		}

		@ModDependent(ModList.ROTARYCRAFT)
		private boolean isRotaryHeatTile(ThermalTile tl) {
			return tl instanceof TemperatureTE && !((TemperatureTE)tl).allowExternalHeating();
		}

		@ModDependent(ModList.REACTORCRAFT)
		private boolean isReactorTile(ThermalTile tl) {
			return tl instanceof ReactorCoreTE;
		}

		@Override
		public void writeToNBT(NBTTagCompound NBT) {
			super.writeToNBT(NBT);

			NBT.setInteger("temperature", temperature);
		}

		@Override
		public void readFromNBT(NBTTagCompound NBT) {
			super.readFromNBT(NBT);

			temperature = NBT.getInteger("temperature");
		}

		@Override
		public Packet getDescriptionPacket() {
			NBTTagCompound NBT = new NBTTagCompound();
			this.writeToNBT(NBT);
			S35PacketUpdateTileEntity pack = new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 0, NBT);
			return pack;
		}

		@Override
		public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity p)  {
			this.readFromNBT(p.field_148860_e);
			worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		}

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return ReikaAABBHelper.getBlockAABB(xCoord, yCoord, zCoord);
		}

	}

}
