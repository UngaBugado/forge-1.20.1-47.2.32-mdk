package net.matos.elementalrealms.datagen;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, ElementalRealms.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        blockWithItem(ModBlocks.THORNSTEEL_BLOCK);
        blockWithItem(ModBlocks.THORNSTEEL_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject)
    {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
