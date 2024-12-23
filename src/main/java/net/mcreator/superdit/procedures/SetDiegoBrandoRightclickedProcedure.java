package net.mcreator.superdit.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superdit.network.SuperDitModVariables;

public class SetDiegoBrandoRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(SuperDitModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Diego_Brando = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
