package net.mcreator.switchotscraft.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.switchotscraft.block.model.SawblockDisplayModel;
import net.mcreator.switchotscraft.block.display.SawblockDisplayItem;

public class SawblockDisplayItemRenderer extends GeoItemRenderer<SawblockDisplayItem> {
	public SawblockDisplayItemRenderer() {
		super(new SawblockDisplayModel());
	}

	@Override
	public RenderType getRenderType(SawblockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
