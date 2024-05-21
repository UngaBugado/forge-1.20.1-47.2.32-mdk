package net.matos.elementalrealms.item;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.block.ModBlocks;
import net.matos.elementalrealms.item.custom.ModFoods;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementalRealms.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ELEMENTAL_TAB = CREATIVE_MODE_TABS.register("elemental_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.THORNSTEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.elemental_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        //Item list that is going to show in the Creative Mode Tab
                        pOutput.accept(ModItems.AMBERITE.get());

                        //Thornsteel
                        pOutput.accept(ModItems.THORNSTEEL_INGOT.get());
                        pOutput.accept(ModItems.THORNSTEEL_SCRAP.get());
                        pOutput.accept(ModBlocks.THORNSTEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.THORNSTEEL_ORE.get());
                            //Thornsteel Tools
                            pOutput.accept(ModItems.THORNSTEEL_SWORD.get());
                            pOutput.accept(ModItems.THORNSTEEL_PICKAXE.get());
                            pOutput.accept(ModItems.THORNSTEEL_AXE.get());
                            pOutput.accept(ModItems.THORNSTEEL_SHOVEL.get());
                            pOutput.accept(ModItems.THORNSTEEL_HOE.get());
                            //Thornsteel Armor
                        pOutput.accept(ModItems.THORNSTEEL_HELMET.get());
                        pOutput.accept(ModItems.THORNSTEEL_CHESTPLATE.get());
                        pOutput.accept(ModItems.THORNSTEEL_LEGGINGS.get());
                        pOutput.accept(ModItems.THORNSTEEL_BOOTS.get());

                        pOutput.accept(ModItems.ORE_FINDER.get());

                        pOutput.accept((ModBlocks.SOUND_BLOCK.get()));

                        pOutput.accept((ModItems.EMBEROOT.get()));

                        pOutput.accept((ModItems.GEOMANCER_STAFF.get()));



                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
