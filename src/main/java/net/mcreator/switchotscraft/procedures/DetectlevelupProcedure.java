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
public class DetectlevelupProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level < RevampedProgressionModVariables.WorldVariables.get(world).levelmax) {
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP >= (entity
					.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).levelupxp) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP
							- (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).levelupxp;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.backxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				LevelupandtechProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
