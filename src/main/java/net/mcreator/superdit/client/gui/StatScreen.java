package net.mcreator.superdit.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.superdit.world.inventory.StatMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StatScreen extends AbstractContainerScreen<StatMenu> {
	private final static HashMap<String, Object> guistate = StatMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_shop;

	public StatScreen(StatMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("super_dit:textures/screens/stat.png");

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

		guiGraphics.blit(new ResourceLocation("super_dit:textures/screens/stat.png"), this.leftPos + 184, this.topPos + 2, 0, 0, 176, 166, 176, 166);

		guiGraphics.blit(new ResourceLocation("super_dit:textures/screens/stat.png"), this.leftPos + -185, this.topPos + 0, 0, 0, 176, 166, 176, 166);

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_empty"), 4, 121, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_speed"), 6, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_power"), 6, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_special"), 6, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_hp"), 6, 79, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_11"), 51, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_12"), 51, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_13"), 60, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_14"), 60, 79, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_level"), 96, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_15"), 141, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_remaining_points"), 7, 132, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_yen"), -120, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_1"), -93, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.super_dit.stat.label_3"), 106, 132, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_shop = Button.builder(Component.translatable("gui.super_dit.stat.button_shop"), e -> {
		}).bounds(this.leftPos + -122, this.topPos + 132, 46, 20).build();
		guistate.put("button:button_shop", button_shop);
		this.addRenderableWidget(button_shop);
	}
}
