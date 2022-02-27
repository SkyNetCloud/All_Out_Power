
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.skynetcloud.alloutpower.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import ca.skynetcloud.alloutpower.client.gui.HolyAxeGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllOutPowerModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AllOutPowerModMenus.HOLY_AXE_GUI, HolyAxeGuiScreen::new);
		});
	}
}
