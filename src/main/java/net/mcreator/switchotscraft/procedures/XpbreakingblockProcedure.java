package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.switchotscraft.network.RevampedProgressionModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class XpbreakingblockProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, BlockState blockstate, Entity entity) {
		execute(null, world, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level < RevampedProgressionModVariables.WorldVariables.get(world).levelmax) {
			if (blockstate.getBlock() == Blocks.COAL_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 20;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.IRON_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 50;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.REDSTONE_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 35;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.GOLD_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 40;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.LAPIS_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 35;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DIAMOND_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 100;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.EMERALD_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 75;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.COPPER_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 15;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 25;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 55;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 40;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 45;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 40;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 105;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 80;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 20;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.NETHER_QUARTZ_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 5;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (blockstate.getBlock() == Blocks.NETHER_GOLD_ORE) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).XP + 7;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.XP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
