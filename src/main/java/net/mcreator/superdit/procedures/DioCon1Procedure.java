package net.mcreator.superdit.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superdit.network.SuperDitModVariables;
import net.mcreator.superdit.init.SuperDitModMobEffects;

public class DioCon1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(SuperDitModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperDitModVariables.PlayerVariables())).dio_brando == true
				&& (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperDitModMobEffects.COOLDOWN.get())) == false) {
			return true;
		}
		return false;
	}
}
