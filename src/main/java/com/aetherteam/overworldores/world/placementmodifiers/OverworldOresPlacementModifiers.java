package com.aetherteam.overworldores.world.placementmodifiers;

import com.aetherteam.overworldores.OverworldOres;
import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

public class OverworldOresPlacementModifiers {
    public static final PlacementModifierType<ModFilter> MOD_FILTER = register(new ResourceLocation(OverworldOres.MODID, "mod_filter"), ModFilter.CODEC);

    private static <P extends PlacementModifier> PlacementModifierType<P> register(ResourceLocation name, Codec<P> codec) {
        return Registry.register(BuiltInRegistries.PLACEMENT_MODIFIER_TYPE, name, () -> codec);
    }
}
