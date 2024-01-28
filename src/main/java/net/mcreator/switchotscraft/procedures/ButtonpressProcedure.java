package net.mcreator.switchotscraft.procedures;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.switchotscraft.network.RevampedProgressionModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class ButtonpressProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem) {
			if ((entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point >= 1) {
				{
					double _setval = (entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RevampedProgressionModVariables.PlayerVariables())).Tech_Point - 1;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Tech_Point = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(RevampedProgressionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PickaxeSearch = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
