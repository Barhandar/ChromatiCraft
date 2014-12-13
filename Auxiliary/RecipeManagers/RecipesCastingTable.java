/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Auxiliary.RecipeManagers;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.ShapedOreRecipe;
import Reika.ChromatiCraft.Auxiliary.ChromaStacks;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipe.RecipeType;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.AcceleratorRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.AspectFormerRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.AuraCleanerRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.BatteryRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.BeaconRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.BreakerRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CompoundRepeaterRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CompoundRuneRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalChargerRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalClusterRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalCoreRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalFocusRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalFurnaceRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalGroupRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalLaserRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalLensRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalMirrorRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalSeedRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalStarRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.CrystalTankRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.ElementUnitRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.EnchanterRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.EnergyCoreRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.EnhancedPendantRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.FabricatorRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.FiberRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.GuardianStoneRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.HeatLilyRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.InfuserRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.InvTickerRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.InventoryLinkRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.IridescentChunkRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.IridescentCrystalRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.LampControlRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.LampRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.LumenLampRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.MinerRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.PendantRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.PotionCrystalRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.PylonFinderRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.RecipeCrystalRepeater;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.RecipeEnderTNT;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.RecipeTankBlock;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.RiftRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.RitualTableRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.RuneRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.SpawnerReprogrammerRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.StandRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.StorageCrystalRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.TelePumpRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.TeleportWandRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.TransformationCoreRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.TransitionRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.UpgradeRecipe;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.CastingRecipes.VoidCoreRecipe;
import Reika.ChromatiCraft.Registry.ChromaBlocks;
import Reika.ChromatiCraft.Registry.ChromaItems;
import Reika.ChromatiCraft.Registry.ChromaOptions;
import Reika.ChromatiCraft.Registry.ChromaTiles;
import Reika.ChromatiCraft.Registry.CrystalElement;
import Reika.ChromatiCraft.TileEntity.AOE.TileEntityAccelerator;
import Reika.ChromatiCraft.TileEntity.Recipe.TileEntityCastingTable;
import Reika.DragonAPI.ModList;
import Reika.DragonAPI.Libraries.ReikaPlayerAPI;
import Reika.DragonAPI.Libraries.ReikaRecipeHelper;
import Reika.DragonAPI.Libraries.Registry.ReikaItemHelper;

public class RecipesCastingTable {

	public static final RecipesCastingTable instance = new RecipesCastingTable();
	private final HashMap<RecipeType, ArrayList<CastingRecipe>> recipes = new HashMap();

	private RecipesCastingTable() {
		this.addRecipe(new CrystalGroupRecipe(ChromaStacks.redGroup, " R ", "B P", " M ", 'B', CrystalElement.BLUE, 'R', CrystalElement.RED, 'P', CrystalElement.PURPLE, 'M', CrystalElement.MAGENTA));
		this.addRecipe(new CrystalGroupRecipe(ChromaStacks.greenGroup, " Y ", "C L", " G ", 'G', CrystalElement.GREEN, 'Y', CrystalElement.YELLOW, 'C', CrystalElement.CYAN, 'L', CrystalElement.LIME));
		this.addRecipe(new CrystalGroupRecipe(ChromaStacks.orangeGroup, " B ", "P O", " L ", 'B', CrystalElement.BROWN, 'P', CrystalElement.PINK, 'O', CrystalElement.ORANGE, 'L', CrystalElement.LIGHTBLUE));
		this.addRecipe(new CrystalGroupRecipe(ChromaStacks.whiteGroup, " B ", "G L", " W ", 'B', CrystalElement.BLACK, 'G', CrystalElement.GRAY, 'L', CrystalElement.LIGHTGRAY, 'W', CrystalElement.WHITE));
		this.addRecipe(new CrystalClusterRecipe(ChromaStacks.primaryCluster));
		this.addRecipe(new CrystalClusterRecipe(ChromaStacks.secondaryCluster));
		this.addRecipe(new CrystalCoreRecipe(ChromaStacks.crystalCore, new ItemStack(Items.diamond)));
		this.addRecipe(new CrystalStarRecipe(ChromaStacks.crystalStar, new ItemStack(Items.nether_star)));

		this.addRecipe(new VoidCoreRecipe(ChromaStacks.voidCore, ChromaStacks.crystalStar));
		this.addRecipe(new EnergyCoreRecipe(ChromaStacks.energyCore, ChromaStacks.crystalStar));
		this.addRecipe(new TransformationCoreRecipe(ChromaStacks.transformCore, ChromaStacks.crystalCore));
		this.addRecipe(new CrystalLensRecipe(ChromaStacks.crystalLens, new ItemStack(Blocks.glass)));

		this.addRecipe(new StorageCrystalRecipe(ChromaItems.STORAGE.getStackOf(), ChromaStacks.elementUnit));
		for (int i = 0; i < ChromaItems.STORAGE.getNumberMetadatas()-2; i++)
			this.addRecipe(new StorageCrystalRecipe(ChromaItems.STORAGE.getStackOfMetadata(i+1), ChromaItems.STORAGE.getStackOfMetadata(i)));

		for (int i = 0; i < 16; i++) {
			this.addRecipe(new RuneRecipe(new ItemStack(ChromaBlocks.RUNE.getBlockInstance(), 1, i), i));
			this.addRecipe(new RuneRecipe(new ItemStack(ChromaBlocks.RUNE.getBlockInstance(), 16, i), i+16));
			ItemStack shard = ChromaItems.SHARD.getStackOfMetadata(i);
			ItemStack seed = ChromaItems.SEED.getStackOfMetadata(i);
			ItemStack block = new ItemStack(ChromaBlocks.PYLONSTRUCT.getBlockInstance(), 8, 0);
			ShapedOreRecipe sr = new ShapedOreRecipe(block, " S ", "SCS", " S ", 'S', "stone", 'C', shard);
			this.addRecipe(new CastingRecipe(block, sr));

			this.addRecipe(new CrystalSeedRecipe(seed, CrystalElement.elements[i]));

			this.addRecipe(new LumenLampRecipe(new ItemStack(ChromaBlocks.LAMPBLOCK.getBlockInstance(), 16, i), CrystalElement.elements[i]));
		}
		Block block = ChromaBlocks.PYLONSTRUCT.getBlockInstance();
		ShapedRecipes sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 2, 2), "S", "S", 'S', new ItemStack(block, 1, 0));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 2, 2), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 4, 12), "SS", "SS", 'S', new ItemStack(block, 1, 0));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 4, 12), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 2, 1), "SS", 'S', new ItemStack(block, 1, 0));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 2, 1), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 4, 7), " S ", "S S", " S ", 'S', new ItemStack(block, 1, 0));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 4, 7), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 5, 8), " S ", "SSS", " S ", 'S', new ItemStack(block, 1, 0));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 5, 8), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 5, 6), "SSS", "S  ", "S  ", 'S', new ItemStack(block, 1, 0));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 5, 6), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 3, 11), " S ", " S ", " S ", 'S', new ItemStack(block, 1, 0));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 3, 11), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 4, 14), "sSs", "ScS", "sSs", 'S', new ItemStack(block, 1, 0), 'c', ChromaStacks.chargedWhiteShard, 's', new ItemStack(ChromaBlocks.RUNE.getBlockInstance(), 1, 15));
		this.addRecipe(new CastingRecipe(new ItemStack(block, 4, 14), sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(new ItemStack(block, 6, 15), "SSS", "ccc", "SSS", 'S', new ItemStack(block, 1, 0), 'c', ChromaStacks.chargedWhiteShard);
		this.addRecipe(new CastingRecipe(new ItemStack(block, 6, 15), sr));

		this.addRecipe(new GuardianStoneRecipe(ChromaTiles.GUARDIAN.getCraftedProduct(), ChromaStacks.crystalStar));

		for (int i = 0; i <= TileEntityAccelerator.MAX_TIER; i++)
			this.addRecipe(new AcceleratorRecipe(i));

		ItemStack is = ChromaTiles.STAND.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "I I", "SLS", "CCC", 'I', Items.iron_ingot, 'C', Blocks.cobblestone, 'S', ReikaItemHelper.stoneSlab, 'L', ReikaItemHelper.lapisDye);
		this.addRecipe(new StandRecipe(is, sr));

		is = ChromaTiles.ENCHANTER.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "eGe", "OEO", "BOB", 'e', Items.emerald, 'O', Blocks.obsidian, 'B', ReikaItemHelper.stoneBricks, 'E', Blocks.enchanting_table, 'G', Items.gold_ingot);
		this.addRecipe(new EnchanterRecipe(is, sr));

		is = ChromaTiles.BREWER.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "S S", "ScS", "CCC", 'C', Blocks.stone, 'c', Items.cauldron, 'S', ChromaItems.SHARD.getAnyMetaStack());
		this.addRecipe(new CastingRecipe(is, sr));

		is = ChromaTiles.CHROMAFLOWER.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "LFL", "GsG", 'L', Blocks.leaves, 'F', Blocks.red_flower, 'G', Items.glowstone_dust, 's', ChromaItems.SHARD.getAnyMetaStack());
		this.addRecipe(new CastingRecipe(is, sr));

		sr = ReikaRecipeHelper.getShapedRecipeFor(ChromaStacks.crystalMirror, "GWI", "GWI", "GWI", 'G', Blocks.glass, 'I', Items.iron_ingot, 'W', ChromaItems.SHARD.getStackOfMetadata(15));
		this.addRecipe(new CastingRecipe(ChromaStacks.crystalMirror, sr));

		this.addRecipe(new RiftRecipe(ChromaTiles.RIFT.getCraftedProduct(), ChromaStacks.voidCore));
		this.addRecipe(new CrystalTankRecipe(ChromaTiles.TANK.getCraftedProduct(), ChromaStacks.voidCore));
		this.addRecipe(new RecipeTankBlock(new ItemStack(ChromaBlocks.TANK.getBlockInstance(), 4, 0), new ItemStack(Items.diamond)));
		this.addRecipe(new CrystalFurnaceRecipe(ChromaTiles.FURNACE.getCraftedProduct(), ChromaStacks.energyCore));
		this.addRecipe(new CrystalLaserRecipe(ChromaTiles.LASER.getCraftedProduct(), ChromaStacks.energyCore));
		this.addRecipe(new CrystalChargerRecipe(ChromaTiles.CHARGER.getCraftedProduct(), ChromaStacks.crystalCore));

		for (int i = 0; i < CrystalElement.elements.length; i++) {
			CrystalElement e = CrystalElement.elements[i];
			ItemStack shard = ChromaItems.SHARD.getStackOfMetadata(i);
			ItemStack lamp = new ItemStack(ChromaBlocks.LAMP.getBlockInstance(), 1, i);
			ItemStack cave = new ItemStack(ChromaBlocks.CRYSTAL.getBlockInstance(), 1, i);
			ItemStack supercry = new ItemStack(ChromaBlocks.SUPER.getBlockInstance(), 1, i);
			ItemStack seed = ChromaItems.SEED.getStackOfMetadata(i);
			ItemStack pendant = ChromaItems.PENDANT.getStackOfMetadata(i);
			ItemStack pendant3 = ChromaItems.PENDANT3.getStackOfMetadata(i);

			this.addRecipe(new PendantRecipe(pendant, cave));
			this.addRecipe(new EnhancedPendantRecipe(pendant3, supercry));
			this.addRecipe(new PotionCrystalRecipe(supercry, cave));

			sr = ReikaRecipeHelper.getShapedRecipeFor(ChromaStacks.rawCrystal, " F ", "FSF", " F ", 'F', ChromaStacks.purityDust, 'S', shard);
			this.addRecipe(new CastingRecipe(ReikaItemHelper.getSizedItemStack(ChromaStacks.rawCrystal, 2), sr));
		}

		this.addRecipe(new CrystalFocusRecipe(ChromaStacks.crystalFocus, ChromaStacks.primaryCluster));
		this.addRecipe(new CrystalMirrorRecipe(ChromaStacks.crystalMirror, ChromaStacks.getChargedShard(CrystalElement.WHITE)));

		this.addRecipe(new RecipeCrystalRepeater(ChromaTiles.REPEATER.getCraftedProduct(), ChromaStacks.crystalCore));

		this.addRecipe(new TransitionRecipe(ChromaItems.TRANSITION.getStackOf(), ChromaStacks.transformCore));
		this.addRecipe(new BreakerRecipe(ChromaItems.EXCAVATOR.getStackOf(), ChromaStacks.energyCore));

		this.addRecipe(new ElementUnitRecipe(ChromaStacks.elementUnit, ChromaStacks.bindingCrystal));

		is = ChromaTiles.HEATLILY.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, " F ", "FBF", "LSL", 'L', Blocks.waterlily, 'F', Blocks.yellow_flower, 'S', ChromaStacks.orangeShard, 'B', Items.blaze_powder);
		this.addRecipe(new HeatLilyRecipe(is, sr));

		is = ChromaTiles.RITUAL.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "SSS", "CSC", "CCC", 'C', Blocks.cobblestone, 'S', ChromaItems.SHARD.getAnyMetaStack());
		this.addRecipe(new RitualTableRecipe(is, sr));

		is = ChromaTiles.COLLECTOR.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "SES", "ScS", "CCC", 'E', Items.ender_eye, 'C', Blocks.stone, 'c', Blocks.glowstone, 'S', ChromaItems.SHARD.getAnyMetaStack());
		this.addRecipe(new CastingRecipe(is, sr));

		this.addRecipe(new SpawnerReprogrammerRecipe(ChromaTiles.REPROGRAMMER.getCraftedProduct(), ChromaStacks.transformCore));

		this.addRecipe(new TelePumpRecipe(ChromaTiles.TELEPUMP.getCraftedProduct(), ChromaStacks.energyCore));

		this.addRecipe(new CompoundRepeaterRecipe(ChromaTiles.COMPOUND.getCraftedProduct(), ChromaStacks.crystalFocus));

		is = ChromaTiles.FIBER.getCraftedProduct();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "GgG", "GDG", "GgG", 'G', Blocks.glass, 'D', Items.diamond, 'g', Items.glowstone_dust);
		this.addRecipe(new FiberRecipe(is, sr));

		this.addRecipe(new CompoundRuneRecipe(new ItemStack(ChromaBlocks.PYLONSTRUCT.getBlockInstance(), 1, 13), ChromaStacks.bindingCrystal));

		this.addRecipe(new IridescentChunkRecipe(ChromaStacks.iridChunk, ChromaStacks.bindingCrystal));

		this.addRecipe(new IridescentCrystalRecipe(ChromaTiles.CRYSTAL.getCraftedProduct(), new ItemStack(Items.diamond)));

		this.addRecipe(new InfuserRecipe(ChromaTiles.INFUSER.getCraftedProduct(), ChromaTiles.STAND.getCraftedProduct()));

		if (ModList.THAUMCRAFT.isLoaded()) {
			this.addRecipe(new AspectFormerRecipe(ChromaTiles.ASPECT.getCraftedProduct(), ChromaStacks.transformCore));
		}

		this.addRecipe(new InventoryLinkRecipe(ChromaItems.LINK.getStackOf(), ChromaStacks.resonanceDust));

		this.addRecipe(new LampRecipe(ChromaTiles.LAMP.getCraftedProduct(), new ItemStack(Blocks.glowstone)));

		this.addRecipe(new BeaconRecipe(ChromaTiles.BEACON.getCraftedProduct(), new ItemStack(Items.nether_star)));

		is = ChromaItems.FINDER.getStackOf();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, "SIS", "IAI", "SIS", 'A', ChromaStacks.auraDust, 'I', Items.iron_ingot, 'S', ChromaItems.SHARD.getAnyMetaStack());
		this.addRecipe(new PylonFinderRecipe(is, sr));

		this.addRecipe(new BatteryRecipe(ChromaTiles.POWERTREE.getCraftedProduct(), ChromaStacks.crystalStar));

		this.addRecipe(new InvTickerRecipe(ChromaTiles.TICKER.getCraftedProduct(), new ItemStack(Blocks.chest)));

		is = ChromaItems.WARP.getStackOf();
		sr = ReikaRecipeHelper.getShapedRecipeFor(is, " g ", "sps", "sss", 's', ChromaStacks.getShard(CrystalElement.WHITE), 'g', Blocks.glowstone, 'p', Items.potionitem);
		this.addRecipe(new AuraCleanerRecipe(is, sr));

		this.addRecipe(new MinerRecipe(ChromaTiles.MINER.getCraftedProduct(), ChromaStacks.energyCore));

		this.addRecipe(new FabricatorRecipe(ChromaTiles.FABRICATOR.getCraftedProduct(), ChromaStacks.transformCore));

		this.addRecipe(new LampControlRecipe(ChromaTiles.LAMPCONTROL.getCraftedProduct(), new ItemStack(Items.quartz)));

		this.addRecipe(new UpgradeRecipe(ChromaStacks.silkUpgrade, new ItemStack(Items.diamond)));
		this.addRecipe(new UpgradeRecipe(ChromaStacks.speedUpgrade, new ItemStack(Items.redstone)));
		this.addRecipe(new UpgradeRecipe(ChromaStacks.efficiencyUpgrade, new ItemStack(Items.emerald)));

		if (ChromaOptions.ENDERTNT.getState())
			this.addRecipe(new RecipeEnderTNT(ChromaBlocks.TNT.getStackOf(), ChromaItems.BUCKET.getStackOfMetadata(1)));

		this.addRecipe(new TeleportWandRecipe(ChromaItems.TELEPORT.getStackOf(), ChromaStacks.transformCore));
	}

	private void addRecipe(CastingRecipe r) {
		ArrayList<CastingRecipe> li = recipes.get(r.type);
		if (li == null) {
			li = new ArrayList();
			recipes.put(r.type, li);
		}
		li.add(r);
	}

	public CastingRecipe getRecipe(TileEntityCastingTable table, ArrayList<RecipeType> type) {
		ItemStack main = table.getStackInSlot(0);
		ArrayList<CastingRecipe> li = new ArrayList();
		for (int i = 0; i < type.size(); i++) {
			ArrayList<CastingRecipe> list = recipes.get(type.get(i));
			if (list != null)
				li.addAll(list);
		}
		for (CastingRecipe r : li) {
			if (r.match(table))
				return r;
		}
		return null;
	}

	public ArrayList<CastingRecipe> getAllRecipesMaking(ItemStack result) {
		ArrayList<CastingRecipe> li = new ArrayList();
		for (RecipeType type : recipes.keySet()) {
			ArrayList<CastingRecipe> ir = recipes.get(type);
			if (ir != null) {
				for (int i = 0; i < ir.size(); i++) {
					CastingRecipe r = ir.get(i);
					if (ReikaItemHelper.matchStacks(result, r.getOutput()) && (result.stackTagCompound == null || ItemStack.areItemStackTagsEqual(result, r.getOutput())))
						li.add(r);
				}
			}
		}
		return li;
	}

	public ArrayList<CastingRecipe> getAllRecipesUsing(ItemStack ingredient) {
		ArrayList<CastingRecipe> li = new ArrayList();
		for (RecipeType type : recipes.keySet()) {
			ArrayList<CastingRecipe> ir = recipes.get(type);
			if (ir != null) {
				for (int i = 0; i < ir.size(); i++) {
					CastingRecipe r = ir.get(i);
					if (r.usesItem(ingredient))
						li.add(r);
				}
			}
		}
		return li;
	}

	public static boolean playerHasCrafted(EntityPlayer ep, RecipeType type) {
		NBTTagCompound nbt = ReikaPlayerAPI.getDeathPersistentNBT(ep);
		NBTTagCompound cast = nbt.getCompoundTag("castingprog");
		return cast.getBoolean(type.name().toLowerCase());
	}

	public static void setPlayerHasCrafted(EntityPlayer ep, RecipeType type) {
		NBTTagCompound nbt = ReikaPlayerAPI.getDeathPersistentNBT(ep);
		NBTTagCompound cast = nbt.getCompoundTag("castingprog");
		cast.setBoolean(type.name().toLowerCase(), true);
		nbt.setTag("castingprog", cast);
	}

}
