package net.matos.elementalrealms.util;

import net.matos.elementalrealms.ElementalRealms;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> ORE_FINDER_VALUABLES = tag("ore_finder_valuables");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(ElementalRealms.MOD_ID,  name));
        }

    }

    public static class Items
    {
        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(ElementalRealms.MOD_ID,  name));
        }

    }
}
