package net.matos.elementalrealms.datagen;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ElementalRealms.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        simpleItem(ModItems.THORNSTEEL_INGOT);
        simpleItem(ModItems.THORNSTEEL_SCRAP);
        simpleItem(ModItems.AMBERITE);
        simpleItem(ModItems.EMBEROOT);
        simpleItem(ModItems.ORE_FINDER);

        simpleItem(ModItems.THORNSTEEL_HELMET);
        simpleItem(ModItems.THORNSTEEL_CHESTPLATE);
        simpleItem(ModItems.THORNSTEEL_LEGGINGS);
        simpleItem(ModItems.THORNSTEEL_BOOTS);

        handheldItem(ModItems.THORNSTEEL_SWORD);
        handheldItem(ModItems.THORNSTEEL_PICKAXE);
        handheldItem(ModItems.THORNSTEEL_AXE);
        handheldItem(ModItems.THORNSTEEL_SHOVEL);
        handheldItem(ModItems.THORNSTEEL_HOE);
    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ElementalRealms.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ElementalRealms.MOD_ID, "item/" + item.getId().getPath()));
    }
}
