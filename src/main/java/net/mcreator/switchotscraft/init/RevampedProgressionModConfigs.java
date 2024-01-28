package net.mcreator.switchotscraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.switchotscraft.configuration.TreecutConfiguration;
import net.mcreator.switchotscraft.configuration.CustomLVConfiguration;
import net.mcreator.switchotscraft.RevampedProgressionMod;

@Mod.EventBusSubscriber(modid = RevampedProgressionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RevampedProgressionModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TreecutConfiguration.SPEC, "Revamped_progression.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CustomLVConfiguration.SPEC, "R_progression_level_config.toml");
		});
	}
}
