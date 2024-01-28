package net.mcreator.switchotscraft.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.switchotscraft.init.RevampedProgressionModBlockEntities;
import net.mcreator.switchotscraft.block.renderer.SawblockTileRenderer;
import net.mcreator.switchotscraft.RevampedProgressionMod;

@Mod.EventBusSubscriber(modid = RevampedProgressionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(RevampedProgressionModBlockEntities.SAWBLOCK.get(), context -> new SawblockTileRenderer());
	}
}
