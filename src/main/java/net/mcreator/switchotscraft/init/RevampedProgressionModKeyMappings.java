
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.switchotscraft.network.Mendingbutton2Message;
import net.mcreator.switchotscraft.network.Mendingbutton1Message;
import net.mcreator.switchotscraft.RevampedProgressionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RevampedProgressionModKeyMappings {
	public static final KeyMapping MENDINGBUTTON_1 = new KeyMapping("key.revamped_progression.mendingbutton_1", GLFW.GLFW_KEY_KP_1, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RevampedProgressionMod.PACKET_HANDLER.sendToServer(new Mendingbutton1Message(0, 0));
				Mendingbutton1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MENDINGBUTTON_2 = new KeyMapping("key.revamped_progression.mendingbutton_2", GLFW.GLFW_KEY_KP_2, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RevampedProgressionMod.PACKET_HANDLER.sendToServer(new Mendingbutton2Message(0, 0));
				Mendingbutton2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(MENDINGBUTTON_1);
		event.register(MENDINGBUTTON_2);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				MENDINGBUTTON_1.consumeClick();
				MENDINGBUTTON_2.consumeClick();
			}
		}
	}
}
