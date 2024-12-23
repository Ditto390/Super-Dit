
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superdit.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.superdit.potion.CooldownMobEffect;
import net.mcreator.superdit.potion.CombatTagMobEffect;
import net.mcreator.superdit.SuperDitMod;

public class SuperDitModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SuperDitMod.MODID);
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> COMBAT_TAG = REGISTRY.register("combat_tag", () -> new CombatTagMobEffect());
}
