package com.aetherteam.overworldores.data.resources.registries;

import com.aetherteam.nitrogen.fabric.world.biome.BiomeModificationData;
import com.aetherteam.nitrogen.fabric.world.biome.BiomeModificationDataRegistries;
import com.aetherteam.nitrogen.fabric.world.biome.BiomeModificationImpls;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.OverworldOresTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;

public class OverworldOresBiomeModifiers {
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_COAL_ORE = createKey("add_holystone_coal_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_IRON_ORE = createKey("add_holystone_iron_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_COPPER_ORE = createKey("add_holystone_copper_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_GOLD_ORE = createKey("add_holystone_gold_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_REDSTONE_ORE = createKey("add_holystone_redstone_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_LAPIS_ORE = createKey("add_holystone_lapis_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_EMERALD_ORE = createKey("add_holystone_emerald_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_DIAMOND_ORE = createKey("add_holystone_diamond_ore");

    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_TIN_ORE = createKey("add_holystone_tin_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_LEAD_ORE = createKey("add_holystone_lead_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_SILVER_ORE = createKey("add_holystone_silver_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_NICKEL_ORE = createKey("add_holystone_nickel_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_ZINC_ORE = createKey("add_holystone_zinc_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_URANIUM_ORE = createKey("add_holystone_uranium_ore");
    public static final ResourceKey<BiomeModificationData> ADD_HOLYSTONE_SULFUR_ORE = createKey("add_holystone_sulfur_ore");

    private static ResourceKey<BiomeModificationData> createKey(String name) {
        return ResourceKey.create(BiomeModificationDataRegistries.BIOME_MODIFIERS_KEY, ResourceLocation.fromNamespaceAndPath(OverworldOres.MODID, name));
    }

    public static void bootstrap(BootstrapContext<BiomeModificationData> context) {
        context.register(ADD_HOLYSTONE_COAL_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_COAL_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_COAL_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_IRON_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_IRON_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_IRON_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_COPPER_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_COPPER_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_COPPER_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_GOLD_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_GOLD_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_GOLD_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_REDSTONE_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_REDSTONE_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_REDSTONE_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_LAPIS_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_LAPIS_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_LAPIS_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_EMERALD_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_EMERALD_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_EMERALD_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_DIAMOND_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_DIAMOND_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_DIAMOND_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(ADD_HOLYSTONE_TIN_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_TIN_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_TIN_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_LEAD_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_LEAD_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_LEAD_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_SILVER_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_SILVER_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_SILVER_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_NICKEL_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_NICKEL_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_NICKEL_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_ZINC_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_ZINC_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_ZINC_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_URANIUM_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_URANIUM_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_URANIUM_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_SULFUR_ORE, new BiomeModificationImpls.AddFeaturesBiomeModification(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_SULFUR_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_SULFUR_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }
}
