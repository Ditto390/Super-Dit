package net.mcreator.superdit.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superdit.init.SuperDitModMobEffects;

public class CombatTagConProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperDitModMobEffects.COMBAT_TAG.get())) == true) {
			return true;
		}
		return false;
	}
}
