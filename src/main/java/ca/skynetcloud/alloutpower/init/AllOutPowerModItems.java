
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.skynetcloud.alloutpower.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import java.util.List;
import java.util.ArrayList;

import ca.skynetcloud.alloutpower.item.HolyAxeItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllOutPowerModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item HOLY_AXE = register(new HolyAxeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}