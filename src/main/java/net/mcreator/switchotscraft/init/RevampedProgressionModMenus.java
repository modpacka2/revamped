
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.switchotscraft.world.inventory.SearchingtableguiMenu;
import net.mcreator.switchotscraft.world.inventory.SawblockguiMenu;
import net.mcreator.switchotscraft.world.inventory.LevelupMenu;
import net.mcreator.switchotscraft.world.inventory.DontspawnMenu;
import net.mcreator.switchotscraft.RevampedProgressionMod;

public class RevampedProgressionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RevampedProgressionMod.MODID);
	public static final RegistryObject<MenuType<DontspawnMenu>> DONTSPAWN = REGISTRY.register("dontspawn", () -> IForgeMenuType.create(DontspawnMenu::new));
	public static final RegistryObject<MenuType<SawblockguiMenu>> SAWBLOCKGUI = REGISTRY.register("sawblockgui", () -> IForgeMenuType.create(SawblockguiMenu::new));
	public static final RegistryObject<MenuType<LevelupMenu>> LEVELUP = REGISTRY.register("levelup", () -> IForgeMenuType.create(LevelupMenu::new));
	public static final RegistryObject<MenuType<SearchingtableguiMenu>> SEARCHINGTABLEGUI = REGISTRY.register("searchingtablegui", () -> IForgeMenuType.create(SearchingtableguiMenu::new));
}
