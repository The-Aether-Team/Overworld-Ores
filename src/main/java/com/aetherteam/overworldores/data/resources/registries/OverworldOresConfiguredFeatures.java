package com.aetherteam.overworldores.data.resources.registries;

import com.aetherteam.aether.data.resources.AetherFeatureRules;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.data.resources.OverworldOresFeatureStates;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class OverworldOresConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_COAL_CONFIGURATION = createKey("holystone_ore_coal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_IRON_CONFIGURATION = createKey("holystone_ore_iron");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_COPPER_CONFIGURATION = createKey("holystone_ore_copper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_GOLD_CONFIGURATION = createKey("holystone_ore_gold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_REDSTONE_CONFIGURATION = createKey("holystone_ore_redstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_LAPIS_CONFIGURATION = createKey("holystone_ore_lapis");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_EMERALD_CONFIGURATION = createKey("holystone_ore_emerald");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_DIAMOND_CONFIGURATION = createKey("holystone_ore_diamond");

    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_TIN_CONFIGURATION = createKey("holystone_ore_tin");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_LEAD_CONFIGURATION = createKey("holystone_ore_lead");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_SILVER_CONFIGURATION = createKey("holystone_ore_silver");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_NICKEL_CONFIGURATION = createKey("holystone_ore_nickel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_ZINC_CONFIGURATION = createKey("holystone_ore_zinc");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_URANIUM_CONFIGURATION = createKey("holystone_ore_uranium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLYSTONE_ORE_SULFUR_CONFIGURATION = createKey("holystone_ore_sulfur");

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(OverworldOres.MODID, name));
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, HOLYSTONE_ORE_COAL_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_COAL_ORE, 17));
        register(context, HOLYSTONE_ORE_IRON_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_IRON_ORE, 7));
        register(context, HOLYSTONE_ORE_COPPER_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_COPPER_ORE, 15));
        register(context, HOLYSTONE_ORE_GOLD_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_GOLD_ORE, 9));
        register(context, HOLYSTONE_ORE_REDSTONE_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_REDSTONE_ORE, 8));
        register(context, HOLYSTONE_ORE_LAPIS_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_LAPIS_ORE, 7));
        register(context, HOLYSTONE_ORE_EMERALD_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_EMERALD_ORE, 3));
        register(context, HOLYSTONE_ORE_DIAMOND_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_DIAMOND_ORE, 8, 0.7F));

        register(context, HOLYSTONE_ORE_TIN_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_TIN_ORE, 5));
        register(context, HOLYSTONE_ORE_LEAD_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_LEAD_ORE, 5));
        register(context, HOLYSTONE_ORE_SILVER_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_SILVER_ORE, 5));
        register(context, HOLYSTONE_ORE_NICKEL_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_NICKEL_ORE, 5));
        register(context, HOLYSTONE_ORE_ZINC_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_ZINC_ORE, 5));
        register(context, HOLYSTONE_ORE_URANIUM_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_URANIUM_ORE, 5));
        register(context, HOLYSTONE_ORE_SULFUR_CONFIGURATION, Feature.ORE, new OreConfiguration(AetherFeatureRules.HOLYSTONE, OverworldOresFeatureStates.HOLYSTONE_SULFUR_ORE, 5));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
