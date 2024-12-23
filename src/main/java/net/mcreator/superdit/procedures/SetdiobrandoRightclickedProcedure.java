package net.mcreator.superdit.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superdit.network.SuperDitModVariables;

public class SetdiobrandoRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(SuperDitModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dio_brando = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
