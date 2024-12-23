
package net.mcreator.superdit.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.superdit.procedures.DioCon1Procedure;
import net.mcreator.superdit.procedures.DiegoBrandoCon1Procedure;
import net.mcreator.superdit.procedures.CoodlwondiegobanrdoProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilltyOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_abillty_1"), 6, 8, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_abillty_2"), 6, 26, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_abillty_3"), 6, 44, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_abillty_4"), 6, 62, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_abillty_5"), 6, 80, -1, false);
			if (DiegoBrandoCon1Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_loyal"), 15, 8, -1, false);
			if (CoodlwondiegobanrdoProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_loyal_companion"), 15, 8, -6750208, false);
			if (DioCon1Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.super_dit.abillty_overlay.label_time_stop"), w / 2 + -198, h / 2 + -76, -1, false);
		}
	}
}
