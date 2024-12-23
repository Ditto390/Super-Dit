
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superdit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.superdit.world.inventory.StatMenu;
import net.mcreator.superdit.SuperDitMod;

public class SuperDitModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SuperDitMod.MODID);
	public static final RegistryObject<MenuType<StatMenu>> STAT = REGISTRY.register("stat", () -> IForgeMenuType.create(StatMenu::new));
}
