package com.aetherteam.overworldores.data;

import com.aetherteam.overworldores.data.generators.*;
import com.aetherteam.overworldores.data.generators.tags.OverworldOresBiomeTagData;
import com.aetherteam.overworldores.data.generators.tags.OverworldOresBlockTagData;
import net.minecraft.SharedConstants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.Map;
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
        generator.addProvider(event.includeServer(), new OverworldOresRecipeData(packOutput));
        generator.addProvider(event.includeServer(), OverworldOresLootTableData.create(packOutput));
        generator.addProvider(event.includeServer(), new OverworldOresRegistrySets(packOutput, lookupProvider));
        // Tags
        generator.addProvider(event.includeServer(), new OverworldOresBlockTagData(packOutput, lookupProvider, fileHelper));
        generator.addProvider(event.includeServer(), new OverworldOresBiomeTagData(packOutput, lookupProvider, fileHelper));

        // pack.mcmeta
        PackMetadataGenerator packMeta = new PackMetadataGenerator(packOutput);
        Map<PackType, Integer> packTypes = Map.of(PackType.SERVER_DATA, SharedConstants.getCurrentVersion().getPackVersion(PackType.SERVER_DATA));
        packMeta.add(PackMetadataSection.TYPE, new PackMetadataSection(Component.translatable("pack.aether_overworld_ores.mod.description"), SharedConstants.getCurrentVersion().getPackVersion(PackType.CLIENT_RESOURCES), packTypes));
        generator.addProvider(true, packMeta);
    }
}
