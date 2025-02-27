package com.aetherteam.overworldores.data.resources.registries;

import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.OverworldOresTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class OverworldOresBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_COAL_ORE = createKey("add_holystone_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_IRON_ORE = createKey("add_holystone_iron_ore");
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_COPPER_ORE = createKey("add_holystone_copper_ore");
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_GOLD_ORE = createKey("add_holystone_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_REDSTONE_ORE = createKey("add_holystone_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_LAPIS_ORE = createKey("add_holystone_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_EMERALD_ORE = createKey("add_holystone_emerald_ore");
    public static final ResourceKey<BiomeModifier> ADD_HOLYSTONE_DIAMOND_ORE = createKey("add_holystone_diamond_ore");

    private static ResourceKey<BiomeModifier> createKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(OverworldOres.MODID, name));
    }

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        context.register(ADD_HOLYSTONE_COAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_COAL_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_COAL_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_IRON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_IRON_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_IRON_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_COPPER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_COPPER_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_COPPER_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_GOLD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_GOLD_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_GOLD_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_REDSTONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_REDSTONE_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_REDSTONE_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_LAPIS_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_LAPIS_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_LAPIS_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_EMERALD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_EMERALD_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_EMERALD_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_HOLYSTONE_DIAMOND_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                context.lookup(Registries.BIOME).getOrThrow(OverworldOresTags.Biomes.HAS_HOLYSTONE_DIAMOND_ORE),
                HolderSet.direct(context.lookup(Registries.PLACED_FEATURE).getOrThrow(OverworldOresPlacedFeatures.HOLYSTONE_ORE_DIAMOND_PLACEMENT)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }
}
