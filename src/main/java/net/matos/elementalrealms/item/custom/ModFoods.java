package net.matos.elementalrealms.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    //Emberoot
    public static final FoodProperties EMBEROOT = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200), 0.2f).build();
}
