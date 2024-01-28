
package net.mcreator.switchotscraft.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class LifemendingEnchantment extends Enchantment {
	public LifemendingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}
}
