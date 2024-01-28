package net.mcreator.switchotscraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.switchotscraft.world.inventory.SawblockguiMenu;
import net.mcreator.switchotscraft.procedures.Saw90pProcedure;
import net.mcreator.switchotscraft.procedures.Saw80pProcedure;
import net.mcreator.switchotscraft.procedures.Saw70pProcedure;
import net.mcreator.switchotscraft.procedures.Saw60pProcedure;
import net.mcreator.switchotscraft.procedures.Saw50pProcedure;
import net.mcreator.switchotscraft.procedures.Saw40pProcedure;
import net.mcreator.switchotscraft.procedures.Saw30pProcedure;
import net.mcreator.switchotscraft.procedures.Saw20pProcedure;
import net.mcreator.switchotscraft.procedures.Saw10pProcedure;
import net.mcreator.switchotscraft.procedures.Saw100pProcedure;
import net.mcreator.switchotscraft.procedures.Saw0pProcedure;
import net.mcreator.switchotscraft.procedures.Arr90pProcedure;
import net.mcreator.switchotscraft.procedures.Arr80pProcedure;
import net.mcreator.switchotscraft.procedures.Arr70pProcedure;
import net.mcreator.switchotscraft.procedures.Arr60pProcedure;
import net.mcreator.switchotscraft.procedures.Arr50pProcedure;
import net.mcreator.switchotscraft.procedures.Arr40pProcedure;
import net.mcreator.switchotscraft.procedures.Arr30pProcedure;
import net.mcreator.switchotscraft.procedures.Arr20pProcedure;
import net.mcreator.switchotscraft.procedures.Arr10pProcedure;
import net.mcreator.switchotscraft.procedures.Arr0pProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SawblockguiScreen extends AbstractContainerScreen<SawblockguiMenu> {
	private final static HashMap<String, Object> guistate = SawblockguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SawblockguiScreen(SawblockguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("revamped_progression:textures/screens/sawblockgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Saw0pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saws1.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw10pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw10p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw20pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw20p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw30pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw30p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw40pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw40p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw50pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw50p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw60pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw60p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw70pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw70p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw80pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw80p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw90pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw90p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Saw100pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/saw100p.png"), this.leftPos + 44, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr0pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr10pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow10p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr20pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow20p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr30pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow30p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr40pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow40p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr50pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow50p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr60pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow60p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr70pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow70p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr80pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow80p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		if (Arr90pProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("revamped_progression:textures/screens/arrow90p.png"), this.leftPos + 86, this.topPos + 40, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.revamped_progression.sawblockgui.label_sawmill"), 7, 6, -13421773, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
