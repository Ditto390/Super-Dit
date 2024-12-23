package net.mcreator.superdit.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superdit.network.SuperDitModVariables;
import net.mcreator.superdit.init.SuperDitModMobEffects;

public class Abillty1OnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperDitModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperDitModVariables.PlayerVariables())).Diego_Brando == true) {
			if ((entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperDitModMobEffects.COOLDOWN.get())) == false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"summon minecraft:horse ~ ~ ~ {Tame:1}");
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(SuperDitModMobEffects.COOLDOWN.get(), 60, 1, false, false));
			} else if ((entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(SuperDitModMobEffects.COOLDOWN.get())) == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("On Cooldown"), true);
			}
		}
		if ((entity.getCapability(SuperDitModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperDitModVariables.PlayerVariables())).dio_brando == true) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("ditto is the best and most sigma"), true);
		}
		if ((entity.getCapability(SuperDitModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperDitModVariables.PlayerVariables())).Ichigo == true) {
			if ((entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(SuperDitModMobEffects.COOLDOWN.get())) == false) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(SuperDitModMobEffects.COOLDOWN.get(), 60, 1, false, false));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ASH, x, y, z, 7, 1, 1, 0, 1);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"give super_dit:zangetsu");
			} else if ((entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(SuperDitModMobEffects.COOLDOWN.get())) == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("On Cooldown"), true);
			}
		}
	}
}
