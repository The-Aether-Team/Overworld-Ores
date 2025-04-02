package com.aetherteam.overworldores.data;

import com.aetherteam.overworldores.data.generators.*;
import com.aetherteam.overworldores.data.generators.tags.OverworldOresBiomeTagData;
import com.aetherteam.overworldores.data.generators.tags.OverworldOresBlockTagData;
import com.aetherteam.overworldores.data.generators.tags.OverworldOresItemTagData;
import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.util.InclusiveRange;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class OverworldOresData {
    public static void dataSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        PackOutput packOutput = generator.getPackOutput();

        // Client Data
        generator.addProvider(event.includeClient(), new OverworldOresBlockStateData(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new OverworldOresItemModelData(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new OverworldOresLanguageData(packOutput));

        // Server Data
        generator.addProvider(event.includeServer(), new OverworldOresRecipeData(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), OverworldOresLootTableData.create(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new OverworldOresRegistrySets(packOutput, lookupProvider));
        // Tags
        OverworldOresBlockTagData blockTags = new OverworldOresBlockTagData(packOutput, lookupProvider, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new OverworldOresItemTagData(packOutput, lookupProvider, blockTags.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new OverworldOresBiomeTagData(packOutput, lookupProvider, fileHelper));

        // pack.mcmeta
        generator.addProvider(true, new PackMetadataGenerator(packOutput).add(PackMetadataSection.TYPE, new PackMetadataSection(
                Component.translatable("pack.aether_overworld_ores.mod.description"),
                DetectedVersion.BUILT_IN.getPackVersion(PackType.SERVER_DATA),
                Optional.of(new InclusiveRange<>(0, Integer.MAX_VALUE)))));
    }
}
