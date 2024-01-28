package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.switchotscraft.world.inventory.LevelupMenu;
import net.mcreator.switchotscraft.network.RevampedProgressionModVariables;
import net.mcreator.switchotscraft.configuration.CustomLVConfiguration;

import io.netty.buffer.Unpooled;

public class LevelupandtechProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).backxp;
			entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.XP = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level + 1;
			entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Level = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		XpneededperlevelProcedure.execute(entity);
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 2) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T1.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T1.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 3) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T2.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T2.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 4) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T3.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T3.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 5) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T4.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T4.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 6) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T5.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T5.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 7) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T6.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T6.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 8) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T7.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T7.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 9) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T8.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T8.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Level == 10) {
			{
				double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point + (double) CustomLVConfiguration.LV_T9.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Tech_Point = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) CustomLVConfiguration.LV_T9.get();
				entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.plustech = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof ServerPlayer _ent) {
			BlockPos _bpos = BlockPos.containing(x, y, z);
			NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Levelup");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new LevelupMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
	}
}
