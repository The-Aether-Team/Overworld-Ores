package com.aetherteam.overworldores.data.generators;

import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.data.resources.registries.OverworldOresBiomeModifiers;
import com.aetherteam.overworldores.data.resources.registries.OverworldOresConfiguredFeatures;
import com.aetherteam.overworldores.data.resources.registries.OverworldOresPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class OverworldOresRegistrySets extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, OverworldOresConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, OverworldOresPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, OverworldOresBiomeModifiers::bootstrap);

    public OverworldOresRegistrySets(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Collections.singleton(OverworldOres.MODID));
    }
}
