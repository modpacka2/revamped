package net.mcreator.switchotscraft.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.switchotscraft.block.display.SawblockDisplayItem;

public class SawblockDisplayModel extends GeoModel<SawblockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SawblockDisplayItem animatable) {
		return new ResourceLocation("revamped_progression", "animations/saw.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SawblockDisplayItem animatable) {
		return new ResourceLocation("revamped_progression", "geo/saw.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SawblockDisplayItem entity) {
		return new ResourceLocation("revamped_progression", "textures/block/sawtext.png");
	}
}
