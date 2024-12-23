
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superdit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.superdit.item.ZangetsuItem;
import net.mcreator.superdit.item.SetdiobrandoItem;
import net.mcreator.superdit.item.SetDiegoBrandoItem;
import net.mcreator.superdit.item.IchigoItem;
import net.mcreator.superdit.item.FlexibilityItem;
import net.mcreator.superdit.SuperDitMod;

public class SuperDitModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SuperDitMod.MODID);
	public static final RegistryObject<Item> SET_DIEGO_BRANDO = REGISTRY.register("set_diego_brando", () -> new SetDiegoBrandoItem());
	public static final RegistryObject<Item> SETDIOBRANDO = REGISTRY.register("setdiobrando", () -> new SetdiobrandoItem());
	public static final RegistryObject<Item> FLEXIBILITY = REGISTRY.register("flexibility", () -> new FlexibilityItem());
	public static final RegistryObject<Item> ZANGETSU = REGISTRY.register("zangetsu", () -> new ZangetsuItem());
	public static final RegistryObject<Item> ICHIGO = REGISTRY.register("ichigo", () -> new IchigoItem());
	// Start of user code block custom items
	// End of user code block custom items
}
