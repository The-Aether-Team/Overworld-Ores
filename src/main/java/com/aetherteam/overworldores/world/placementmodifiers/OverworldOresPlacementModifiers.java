package com.aetherteam.overworldores.world.placementmodifiers;

import com.aetherteam.overworldores.OverworldOres;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OverworldOresPlacementModifiers {
    public static final DeferredRegister<PlacementModifierType<?>> PLACEMENT_MODIFIERS = DeferredRegister.create(BuiltInRegistries.PLACEMENT_MODIFIER_TYPE, OverworldOres.MODID);

    public static final DeferredHolder<PlacementModifierType<?>, PlacementModifierType<ModFilter>> MOD_FILTER = PLACEMENT_MODIFIERS.register("mod_filter", () -> () -> ModFilter.CODEC);
}
