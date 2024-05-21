package net.matos.elementalrealms.item.client;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.item.custom.ThornsteelArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ThornsteelArmorRenderer extends GeoArmorRenderer<ThornsteelArmorItem>
{

    public ThornsteelArmorRenderer() {
        super(new ThornsteelArmorModel());
    }
}
