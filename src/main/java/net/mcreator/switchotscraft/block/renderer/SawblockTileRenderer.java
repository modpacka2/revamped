package net.mcreator.switchotscraft.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.switchotscraft.block.model.SawblockBlockModel;
import net.mcreator.switchotscraft.block.entity.SawblockTileEntity;

public class SawblockTileRenderer extends GeoBlockRenderer<SawblockTileEntity> {
	public SawblockTileRenderer() {
		super(new SawblockBlockModel());
	}

	@Override
	public RenderType getRenderType(SawblockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
