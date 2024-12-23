
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superdit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.superdit.SuperDitMod;

public class SuperDitModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SuperDitMod.MODID);
	public static final RegistryObject<CreativeModeTab> SUPER_DIT = REGISTRY.register("super_dit",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.super_dit.super_dit")).icon(() -> new ItemStack(Items.PINK_DYE)).displayItems((parameters, tabData) -> {
				tabData.accept(SuperDitModItems.SET_DIEGO_BRANDO.get());
				tabData.accept(SuperDitModItems.SETDIOBRANDO.get());
				tabData.accept(SuperDitModItems.FLEXIBILITY.get());
				tabData.accept(SuperDitModItems.ZANGETSU.get());
				tabData.accept(SuperDitModItems.ICHIGO.get());
			})

					.build());
}
