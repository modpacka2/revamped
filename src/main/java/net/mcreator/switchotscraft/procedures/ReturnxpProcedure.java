package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.switchotscraft.network.RevampedProgressionModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReturnxpProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static String execute(LevelAccessor world, Entity entity) {
		return execute(null, world, entity);
	}

	private static String execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level >= RevampedProgressionModVariables.WorldVariables.get(world).levelmax) {
			return "Level max";
		} else if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level < RevampedProgressionModVariables.WorldVariables.get(world).levelmax) {
			return new java.text.DecimalFormat("####").format((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP) + "" + ((" / ").toUpperCase()
					+ "" + new java.text.DecimalFormat("####").format((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).levelupxp));
		}
		return "Error 1";
	}
}
