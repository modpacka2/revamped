package net.mcreator.switchotscraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.switchotscraft.world.inventory.SearchingtableguiMenu;
import net.mcreator.switchotscraft.procedures.SearchingtablenumberProcedure;
import net.mcreator.switchotscraft.procedures.SearchingtablecostProcedure;
import net.mcreator.switchotscraft.network.SearchingtableguiButtonMessage;
import net.mcreator.switchotscraft.RevampedProgressionMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SearchingtableguiScreen extends AbstractContainerScreen<SearchingtableguiMenu> {
	private final static HashMap<String, Object> guistate = SearchingtableguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_search;

	public SearchingtableguiScreen(SearchingtableguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("revamped_progression:textures/screens/searchingtablegui.png");

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
		guiGraphics.drawString(this.font,

				SearchingtablecostProcedure.execute(entity), 6, 17, -12829636, false);
		guiGraphics.drawString(this.font,

				SearchingtablenumberProcedure.execute(entity), 5, 3, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_search = Button.builder(Component.translatable("gui.revamped_progression.searchingtablegui.button_search"), e -> {
			if (true) {
				RevampedProgressionMod.PACKET_HANDLER.sendToServer(new SearchingtableguiButtonMessage(0, x, y, z));
				SearchingtableguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 58, this.topPos + 59, 56, 20).build();
		guistate.put("button:button_search", button_search);
		this.addRenderableWidget(button_search);
	}
}
