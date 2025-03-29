package com.aetherteam.overworldores.data.resources.registries;

import com.aetherteam.nitrogen.data.resources.builders.NitrogenPlacedFeatureBuilders;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.world.placementmodifiers.ModFilter;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OverworldOresPlacedFeatures {
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_COAL_PLACEMENT = createKey("holystone_ore_coal");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_IRON_PLACEMENT = createKey("holystone_ore_iron");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_COPPER_PLACEMENT = createKey("holystone_ore_copper");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_GOLD_PLACEMENT = createKey("holystone_ore_gold");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_REDSTONE_PLACEMENT = createKey("holystone_ore_redstone");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_LAPIS_PLACEMENT = createKey("holystone_ore_lapis");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_EMERALD_PLACEMENT = createKey("holystone_ore_emerald");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_DIAMOND_PLACEMENT = createKey("holystone_ore_diamond");

    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_TIN_PLACEMENT = createKey("holystone_ore_tin");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_LEAD_PLACEMENT = createKey("holystone_ore_lead");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_SILVER_PLACEMENT = createKey("holystone_ore_silver");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_NICKEL_PLACEMENT = createKey("holystone_ore_nickel");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_ZINC_PLACEMENT = createKey("holystone_ore_zinc");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_URANIUM_PLACEMENT = createKey("holystone_ore_uranium");
    public static final ResourceKey<PlacedFeature> HOLYSTONE_ORE_SULFUR_PLACEMENT = createKey("holystone_ore_sulfur");

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

        register(context, HOLYSTONE_ORE_TIN_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_TIN_CONFIGURATION),
                moddedOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)), "thermal", "railcraft", "mekanism"));
        register(context, HOLYSTONE_ORE_LEAD_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_LEAD_CONFIGURATION),
                moddedOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)), "thermal", "railcraft", "mekanism", "embers", "immersiveengineering"));
        register(context, HOLYSTONE_ORE_SILVER_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_SILVER_CONFIGURATION),
                moddedOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)), "thermal", "railcraft", "embers", "immersiveengineering"));
        register(context, HOLYSTONE_ORE_NICKEL_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_NICKEL_CONFIGURATION),
                moddedOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)), "thermal", "railcraft", "immersiveengineering"));
        register(context, HOLYSTONE_ORE_ZINC_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_ZINC_CONFIGURATION),
                moddedOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)), "railcraft", "zinc"));
        register(context, HOLYSTONE_ORE_URANIUM_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_URANIUM_CONFIGURATION),
                moddedOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)), "mekanism", "immersiveengineering"));
        register(context, HOLYSTONE_ORE_SULFUR_PLACEMENT, configuredFeatures.getOrThrow(OverworldOresConfiguredFeatures.HOLYSTONE_ORE_SULFUR_CONFIGURATION),
                moddedOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(96)), "thermal", "railcraft"));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    public static List<PlacementModifier> moddedOrePlacement(int count, PlacementModifier heightRange, String... mods) {
        return orePlacement(CountPlacement.of(count), heightRange, mods);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier heightRange, String... mods) {
        return List.of(count, InSquarePlacement.spread(), heightRange, BiomeFilter.biome(), ModFilter.anyLoaded(List.of(mods)));
    }
}