package net.mcreator.switchotscraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.switchotscraft.block.entity.SawblockTileEntity;

public class SawblockBlockModel extends GeoModel<SawblockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SawblockTileEntity animatable) {
		return new ResourceLocation("revamped_progression", "animations/saw.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SawblockTileEntity animatable) {
		return new ResourceLocation("revamped_progression", "geo/saw.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SawblockTileEntity entity) {
		return new ResourceLocation("revamped_progression", "textures/block/sawtext.png");
	}
}
