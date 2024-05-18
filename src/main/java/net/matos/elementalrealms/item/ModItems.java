package net.matos.elementalrealms.item;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.item.custom.ModFoods;
import net.matos.elementalrealms.item.custom.OreFinderItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementalRealms.MOD_ID);


    //Amberite
    public static final RegistryObject<Item>  AMBERITE = ITEMS.register("amberite",
            () -> new Item(new Item.Properties()));

    //Thornsteel Ingot
    public static final RegistryObject<Item> THORNSTEEL_INGOT = ITEMS.register("thornsteel_ingot",
            () -> new Item(new Item.Properties()));

    //Thornsteel Scrap
    public static final RegistryObject<Item> THORNSTEEL_SCRAP = ITEMS.register("thornsteel_scrap",
            () -> new Item(new Item.Properties()));

    //Ore Finder
    public static final RegistryObject<Item> ORE_FINDER = ITEMS.register("ore_finder",
            () -> new OreFinderItem(new Item.Properties().durability(100)));

    //Emberoot
    public static final RegistryObject<Item>  EMBEROOT = ITEMS.register("emberoot",
            () -> new Item(new Item.Properties().food(ModFoods.EMBEROOT)));

    //Geomancer's Staff
    public static final RegistryObject<Item>  GEOMANCER_STAFF = ITEMS.register("geomancer_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
