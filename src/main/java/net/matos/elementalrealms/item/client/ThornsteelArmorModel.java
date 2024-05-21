package net.matos.elementalrealms.item.client;

import net.matos.elementalrealms.ElementalRealms;
import net.matos.elementalrealms.item.custom.ThornsteelArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ThornsteelArmorModel extends GeoModel<ThornsteelArmorItem> {
    @Override
    public ResourceLocation getModelResource(ThornsteelArmorItem animatable) {
        return new ResourceLocation(ElementalRealms.MOD_ID, "geo/thornsteel_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ThornsteelArmorItem animatable) {
        return new ResourceLocation(ElementalRealms.MOD_ID, "textures/models/armor/thornsteel_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ThornsteelArmorItem animatable) {
        return new ResourceLocation(ElementalRealms.MOD_ID, "animations/thornsteel_armor.animation.json");
    }
}