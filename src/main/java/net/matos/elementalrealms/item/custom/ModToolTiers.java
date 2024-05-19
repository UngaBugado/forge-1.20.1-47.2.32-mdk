package net.matos.elementalrealms.item.custom;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.item.ModItems;
import net.matos.elementalrealms.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers
{
    public static final Tier THORNSTEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3,1830, 8.5f, 3.5f,12,
                    ModTags.Blocks.NEEDS_THORNSTEEL_TOOL, () -> Ingredient.of(ModItems.THORNSTEEL_INGOT.get())),
            new ResourceLocation(ElementalRealms.MOD_ID, "thornsteel_ingot"), List.of(Tiers.DIAMOND), List.of());
}
