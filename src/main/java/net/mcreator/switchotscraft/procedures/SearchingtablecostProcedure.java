package net.mcreator.switchotscraft.procedures;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class SearchingtablecostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem) {
			return "You need " + (new java.text.DecimalFormat("##").format(1) + " points of technology");
		}
		return "This item cannot be research";
	}
}
