/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Container;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import Reika.ChromatiCraft.Items.Tools.ItemChromaBook;

public class ContainerBookPages extends Container {

	private static final int width = 9;
	private static final int height = 3;

	public InventoryCrafting inventory = new InventoryCrafting(this, width, height);

	public ContainerBookPages(EntityPlayer player)
	{
		int var6;
		int var7;

		for (int i = 0; i < height; i++) {
			for (int k = 0; k < width; k++) {
				this.addSlotToContainer(new Slot(inventory, i*width+k, 8+k*18, 17+i*18));
			}
		}

		for (var6 = 0; var6 < 3; ++var6)
			for (var7 = 0; var7 < 9; ++var7)
				this.addSlotToContainer(new Slot(player.inventory, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
		for (var6 = 0; var6 < 9; ++var6)
			this.addSlotToContainer(new Slot(player.inventory, var6, 8 + var6 * 18, 142));

		ItemStack tool = player.getCurrentEquippedItem();
		ItemChromaBook iil = (ItemChromaBook)tool.getItem();
		ArrayList<ItemStack> li = iil.getItemList(tool);
		for (int i = 0; i < li.size(); i++) {
			inventory.setInventorySlotContents(i, li.get(i));
		}

		this.onCraftMatrixChanged(inventory);
	}

	@Override
	public ItemStack slotClick(int slot, int par2, int par3, EntityPlayer ep) {
		return super.slotClick(slot, par2, par3, ep);
	}

	@Override
	public void onContainerClosed(EntityPlayer ep) {
		super.onContainerClosed(ep);

		ArrayList<ItemStack> li = new ArrayList();
		for (int i = 0; i < inventory.getSizeInventory(); i++) {
			ItemStack in = inventory.getStackInSlot(i);
			if (in != null) {
				li.add(in);
			}
		}

		ItemStack is = ep.getCurrentEquippedItem();
		ItemChromaBook iil = (ItemChromaBook)is.getItem();
		iil.setItems(is, li);
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
		return true;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		return null;
	}

}