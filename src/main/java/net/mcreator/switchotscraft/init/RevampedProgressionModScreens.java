
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.switchotscraft.client.gui.SearchingtableguiScreen;
import net.mcreator.switchotscraft.client.gui.SawblockguiScreen;
import net.mcreator.switchotscraft.client.gui.LevelupScreen;
import net.mcreator.switchotscraft.client.gui.DontspawnScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RevampedProgressionModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RevampedProgressionModMenus.DONTSPAWN.get(), DontspawnScreen::new);
			MenuScreens.register(RevampedProgressionModMenus.SAWBLOCKGUI.get(), SawblockguiScreen::new);
			MenuScreens.register(RevampedProgressionModMenus.LEVELUP.get(), LevelupScreen::new);
			MenuScreens.register(RevampedProgressionModMenus.SEARCHINGTABLEGUI.get(), SearchingtableguiScreen::new);
		});
	}
}
