package net.matos.elementalrealms.item;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.item.custom.ModFoods;
import net.matos.elementalrealms.item.custom.ModToolTiers;
import net.matos.elementalrealms.item.custom.OreFinderItem;
import net.minecraft.world.item.*;
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

    //Thornsteel Sword
    public static final RegistryObject<Item>  THORNSTEEL_SWORD = ITEMS.register("thornsteel_sword",
            () -> new PickaxeItem(ModToolTiers.THORNSTEEL, 9, 2.6f, new Item.Properties()));
    //Thornsteel Pickaxe
    public static final RegistryObject<Item>  THORNSTEEL_PICKAXE = ITEMS.register("thornsteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.THORNSTEEL, 5, 2, new Item.Properties()));
    //Thornsteel Axe
    public static final RegistryObject<Item>  THORNSTEEL_AXE = ITEMS.register("thornsteel_axe",
            () -> new AxeItem(ModToolTiers.THORNSTEEL, 11, 2.6f, new Item.Properties()));
    //Thornsteel Shovel
    public static final RegistryObject<Item>  THORNSTEEL_SHOVEL = ITEMS.register("thornsteel_shovel",
            () -> new ShovelItem(ModToolTiers.THORNSTEEL, 5, 2.6f, new Item.Properties()));
    //Thornsteel Hoe
    public static final RegistryObject<Item>  THORNSTEEL_HOE = ITEMS.register("thornsteel_hoe",
            () -> new HoeItem(ModToolTiers.THORNSTEEL, 5, 2, new Item.Properties()));






    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
