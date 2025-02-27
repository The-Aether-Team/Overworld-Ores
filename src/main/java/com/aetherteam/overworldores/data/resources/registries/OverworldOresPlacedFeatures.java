package com.aetherteam.overworldores.data.resources.registries;

import com.aetherteam.aether.data.resources.registries.AetherConfiguredFeatures;
import com.aetherteam.nitrogen.data.resources.builders.NitrogenPlacedFeatureBuilders;
import com.aetherteam.overworldores.OverworldOres;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class OverworldOresPlacedFeatures {
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_COAL_PLACEMENT = createKey("holystone_ore_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_IRON_PLACEMENT = createKey("holystone_iron_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_COPPER_PLACEMENT = createKey("holystone_copper_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_GOLD_PLACEMENT = createKey("holystone_gold_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_REDSTONE_PLACEMENT = createKey("holystone_redstone_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_LAPIS_PLACEMENT = createKey("holystone_lapis_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_EMERALD_PLACEMENT = createKey("holystone_emerald_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_DIAMOND_PLACEMENT = createKey("holystone_diamond_coal");

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(OverworldOres.MODID, name));
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) { 
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, HOLYSTONE_ORE_COAL_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_COAL_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(128))));
        register(context, HOLYSTONE_ORE_IRON_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_IRON_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(75))));
        register(context, HOLYSTONE_ORE_COPPER_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_COPPER_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(80))));
        register(context, HOLYSTONE_ORE_GOLD_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_GOLD_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))));
        register(context, HOLYSTONE_ORE_REDSTONE_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_REDSTONE_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(44))));
        register(context, HOLYSTONE_ORE_LAPIS_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_LAPIS_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(52))));
        register(context, HOLYSTONE_ORE_EMERALD_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_EMERALD_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(190))));
        register(context, HOLYSTONE_ORE_DIAMOND_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_DIAMOND_CONFIGURATION),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-58), VerticalAnchor.aboveBottom(74))));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
