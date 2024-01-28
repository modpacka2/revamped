
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.switchotscraft.enchantment.LifemendingEnchantment;
import net.mcreator.switchotscraft.enchantment.HungermendingEnchantment;
import net.mcreator.switchotscraft.RevampedProgressionMod;

public class RevampedProgressionModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RevampedProgressionMod.MODID);
	public static final RegistryObject<Enchantment> LIFEMENDING = REGISTRY.register("lifemending", () -> new LifemendingEnchantment());
	public static final RegistryObject<Enchantment> HUNGERMENDING = REGISTRY.register("hungermending", () -> new HungermendingEnchantment());
}
