
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superdit.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.superdit.network.MenuMessage;
import net.mcreator.superdit.network.Abillty5Message;
import net.mcreator.superdit.network.Abillty4Message;
import net.mcreator.superdit.network.Abillty3Message;
import net.mcreator.superdit.network.Abillty2Message;
import net.mcreator.superdit.network.Abillty1Message;
import net.mcreator.superdit.SuperDitMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuperDitModKeyMappings {
	public static final KeyMapping ABILLTY_1 = new KeyMapping("key.super_dit.abillty_1", GLFW.GLFW_KEY_Z, "key.categories.super") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SuperDitMod.PACKET_HANDLER.sendToServer(new Abillty1Message(0, 0));
				Abillty1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILLTY_2 = new KeyMapping("key.super_dit.abillty_2", GLFW.GLFW_KEY_X, "key.categories.super") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SuperDitMod.PACKET_HANDLER.sendToServer(new Abillty2Message(0, 0));
				Abillty2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILLTY_3 = new KeyMapping("key.super_dit.abillty_3", GLFW.GLFW_KEY_C, "key.categories.super") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SuperDitMod.PACKET_HANDLER.sendToServer(new Abillty3Message(0, 0));
				Abillty3Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILLTY_4 = new KeyMapping("key.super_dit.abillty_4", GLFW.GLFW_KEY_G, "key.categories.super") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SuperDitMod.PACKET_HANDLER.sendToServer(new Abillty4Message(0, 0));
				Abillty4Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILLTY_5 = new KeyMapping("key.super_dit.abillty_5", GLFW.GLFW_KEY_R, "key.categories.super") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SuperDitMod.PACKET_HANDLER.sendToServer(new Abillty5Message(0, 0));
				Abillty5Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MENU = new KeyMapping("key.super_dit.menu", GLFW.GLFW_KEY_M, "key.categories.super") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				SuperDitMod.PACKET_HANDLER.sendToServer(new MenuMessage(0, 0));
				MenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ABILLTY_1);
		event.register(ABILLTY_2);
		event.register(ABILLTY_3);
		event.register(ABILLTY_4);
		event.register(ABILLTY_5);
		event.register(MENU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ABILLTY_1.consumeClick();
				ABILLTY_2.consumeClick();
				ABILLTY_3.consumeClick();
				ABILLTY_4.consumeClick();
				ABILLTY_5.consumeClick();
				MENU.consumeClick();
			}
		}
	}
}
