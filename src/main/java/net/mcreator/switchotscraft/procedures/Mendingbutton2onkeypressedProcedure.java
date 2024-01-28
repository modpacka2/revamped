package net.mcreator.switchotscraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.switchotscraft.init.RevampedProgressionModEnchantments;

public class Mendingbutton2onkeypressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RevampedProgressionModEnchantments.HUNGERMENDING.get()) == 1
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).isEnchanted()) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - Mth.nextInt(RandomSource.create(), 1, 3)));
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(-10, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RevampedProgressionModEnchantments.HUNGERMENDING.get()) == 2
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).isEnchanted()) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - Mth.nextInt(RandomSource.create(), 1, 3)));
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(-20, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RevampedProgressionModEnchantments.HUNGERMENDING.get()) == 3
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).isEnchanted()) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - Mth.nextInt(RandomSource.create(), 1, 3)));
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(-30, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
