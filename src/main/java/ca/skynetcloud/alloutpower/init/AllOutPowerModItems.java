
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.skynetcloud.alloutpower.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import ca.skynetcloud.alloutpower.item.Holy_IngotIngotItem;
import ca.skynetcloud.alloutpower.item.HolySwordItem;
import ca.skynetcloud.alloutpower.item.HolyShovelItem;
import ca.skynetcloud.alloutpower.item.HolyPickaxeItem;
import ca.skynetcloud.alloutpower.item.HolyHoeItem;
import ca.skynetcloud.alloutpower.item.HolyAxeItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllOutPowerModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item HOLY_INGOT_INGOT = register(new Holy_IngotIngotItem());
	public static final Item HOLY_INGOT_ORE = register(AllOutPowerModBlocks.HOLY_INGOT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item HOLY_INGOT_BLOCK = register(AllOutPowerModBlocks.HOLY_INGOT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item HOLY_PICKAXE = register(new HolyPickaxeItem());
	public static final Item HOLY_AXE = register(new HolyAxeItem());
	public static final Item HOLY_SWORD = register(new HolySwordItem());
	public static final Item HOLY_SHOVEL = register(new HolyShovelItem());
	public static final Item HOLY_HOE = register(new HolyHoeItem());
	public static final Item HOLY_CHEST = register(AllOutPowerModBlocks.HOLY_CHEST, null);
	public static final Item PINK_CORAL_MAPL_TREES_WOOD = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_WOOD,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item PINK_CORAL_MAPL_TREES_LOG = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_LOG,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item PINK_CORAL_MAPL_TREES_PLANKS = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_PLANKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item PINK_CORAL_MAPL_TREES_LEAVES = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_LEAVES,
			CreativeModeTab.TAB_DECORATIONS);
	public static final Item PINK_CORAL_MAPL_TREES_STAIRS = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item PINK_CORAL_MAPL_TREES_SLAB = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item PINK_CORAL_MAPL_TREES_FENCE = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_FENCE,
			CreativeModeTab.TAB_DECORATIONS);
	public static final Item PINK_CORAL_MAPL_TREES_FENCE_GATE = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_FENCE_GATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item PINK_CORAL_MAPL_TREES_PRESSURE_PLATE = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final Item PINK_CORAL_MAPL_TREES_BUTTON = register(AllOutPowerModBlocks.PINK_CORAL_MAPL_TREES_BUTTON,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
