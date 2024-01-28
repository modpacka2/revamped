package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.switchotscraft.network.RevampedProgressionModVariables;
import net.mcreator.switchotscraft.configuration.TreecutConfiguration;
import net.mcreator.switchotscraft.configuration.CustomLVConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class XpneededperlevelProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (TreecutConfiguration.CONFIG_XP.get() == false) {
			{
				double _setval = (double) TreecutConfiguration.BASE_XP.get()
						* Math.pow((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level, (double) TreecutConfiguration.XP_MULTI_PER_LV.get());
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.levelupxp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (TreecutConfiguration.CONFIG_XP.get() == true) {
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 1) {
				{
					double _setval = (double) CustomLVConfiguration.LV_1.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 2) {
				{
					double _setval = (double) CustomLVConfiguration.LV_2.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 3) {
				{
					double _setval = (double) CustomLVConfiguration.LV_3.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 4) {
				{
					double _setval = (double) CustomLVConfiguration.LV_4.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 5) {
				{
					double _setval = (double) CustomLVConfiguration.LV_5.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 6) {
				{
					double _setval = (double) CustomLVConfiguration.LV_6.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 7) {
				{
					double _setval = (double) CustomLVConfiguration.LV_7.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 8) {
				{
					double _setval = (double) CustomLVConfiguration.LV_8.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 9) {
				{
					double _setval = (double) CustomLVConfiguration.LV_9.get();
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.levelupxp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
