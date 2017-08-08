/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Block.Dimension.Structure.LightPanel;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import Reika.ChromatiCraft.Base.BlockDimensionStructureTile;
import Reika.ChromatiCraft.Base.DimensionStructureGenerator.DimensionStructureType;
import Reika.ChromatiCraft.Base.TileEntity.StructureBlockTile;
import Reika.ChromatiCraft.World.Dimension.Structure.LightPanelGenerator;
import Reika.DragonAPI.Libraries.IO.ReikaSoundHelper;
import Reika.DragonAPI.Libraries.MathSci.ReikaMathLibrary;


public class BlockLightSwitch extends BlockDimensionStructureTile {

	private final IIcon[] icons = new IIcon[3];

	public BlockLightSwitch(Material mat) {
		super(mat);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new LightSwitchTile();
	}

	@Override
	public IIcon getIcon(int s, int meta) {
		return icons[s <= 1 ? 0 : 1+meta];
	}

	@Override
	public void registerBlockIcons(IIconRegister ico) {
		icons[0] = ico.registerIcon("chromaticraft:dimstruct/lightpanel");
		icons[1] = ico.registerIcon("chromaticraft:dimstruct/lightpanel_switch_off");
		icons[2] = ico.registerIcon("chromaticraft:dimstruct/lightpanel_switch_on");
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer ep, int s, float a, float b, float c) {
		int meta = ReikaMathLibrary.toggleBit(world.getBlockMetadata(x, y, z), 0);
		world.setBlockMetadataWithNotify(x, y, z, meta, 3);
		if (!world.isRemote)
			((LightSwitchTile)world.getTileEntity(x, y, z)).sendState();
		ReikaSoundHelper.playSoundAtBlock(world, x, y, z, "random.click", 1, meta%2 == 1 ? 0.875F : 0.75F);
		return true;
	}

	public static class LightSwitchTile extends StructureBlockTile<LightPanelGenerator> {

		private int level;
		private int channel;

		@Override
		public void writeToNBT(NBTTagCompound NBT) {
			super.writeToNBT(NBT);

			NBT.setInteger("ch", channel);
			NBT.setInteger("lvl", level);
		}

		@Override
		public void readFromNBT(NBTTagCompound NBT) {
			super.readFromNBT(NBT);

			channel = NBT.getInteger("ch");
			level = NBT.getInteger("lvl");
		}

		public void sendState() {
			LightPanelGenerator g = this.getGenerator();
			if (g != null)
				g.toggleSwitch(worldObj, xCoord, yCoord, zCoord, level, channel, this.getBlockMetadata() == 1);
		}

		public void setData(int level, int channel) {
			this.level = level;
			this.channel = channel;
		}

		@Override
		public DimensionStructureType getType() {
			return DimensionStructureType.LIGHTPANEL;
		}

	}

}
