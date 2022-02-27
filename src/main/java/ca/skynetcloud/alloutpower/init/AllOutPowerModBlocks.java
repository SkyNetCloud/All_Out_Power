
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.skynetcloud.alloutpower.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesWoodBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesStairsBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesSlabBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesPressurePlateBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesPlanksBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesLogBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesLeavesBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesFenceGateBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesFenceBlock;
import ca.skynetcloud.alloutpower.block.Pink_Coral_Mapl_TreesButtonBlock;
import ca.skynetcloud.alloutpower.block.Holy_IngotOreBlock;
import ca.skynetcloud.alloutpower.block.Holy_IngotBlockBlock;
import ca.skynetcloud.alloutpower.block.HolyChestBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllOutPowerModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block HOLY_INGOT_ORE = register(new Holy_IngotOreBlock());
	public static final Block HOLY_INGOT_BLOCK = register(new Holy_IngotBlockBlock());
	public static final Block HOLY_CHEST = register(new HolyChestBlock());
	public static final Block PINK_CORAL_MAPL_TREES_WOOD = register(new Pink_Coral_Mapl_TreesWoodBlock());
	public static final Block PINK_CORAL_MAPL_TREES_LOG = register(new Pink_Coral_Mapl_TreesLogBlock());
	public static final Block PINK_CORAL_MAPL_TREES_PLANKS = register(new Pink_Coral_Mapl_TreesPlanksBlock());
	public static final Block PINK_CORAL_MAPL_TREES_LEAVES = register(new Pink_Coral_Mapl_TreesLeavesBlock());
	public static final Block PINK_CORAL_MAPL_TREES_STAIRS = register(new Pink_Coral_Mapl_TreesStairsBlock());
	public static final Block PINK_CORAL_MAPL_TREES_SLAB = register(new Pink_Coral_Mapl_TreesSlabBlock());
	public static final Block PINK_CORAL_MAPL_TREES_FENCE = register(new Pink_Coral_Mapl_TreesFenceBlock());
	public static final Block PINK_CORAL_MAPL_TREES_FENCE_GATE = register(new Pink_Coral_Mapl_TreesFenceGateBlock());
	public static final Block PINK_CORAL_MAPL_TREES_PRESSURE_PLATE = register(new Pink_Coral_Mapl_TreesPressurePlateBlock());
	public static final Block PINK_CORAL_MAPL_TREES_BUTTON = register(new Pink_Coral_Mapl_TreesButtonBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			HolyChestBlock.registerRenderLayer();
		}
	}
}
