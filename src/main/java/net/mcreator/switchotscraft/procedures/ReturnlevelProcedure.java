package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.switchotscraft.network.RevampedProgressionModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReturnlevelProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static String execute(Entity entity) {
		return execute(null, entity);
	}

	private static String execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return "";
		return "Level : " + new java.text.DecimalFormat("##").format((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level);
	}
}
