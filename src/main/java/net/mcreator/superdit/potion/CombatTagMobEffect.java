
package net.mcreator.superdit.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

public class CombatTagMobEffect extends MobEffect {
	public CombatTagMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
