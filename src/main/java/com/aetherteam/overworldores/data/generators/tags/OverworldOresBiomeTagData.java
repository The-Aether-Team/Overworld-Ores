package com.aetherteam.overworldores.data.generators.tags;

import com.aetherteam.aether.data.resources.registries.AetherBiomes;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.OverworldOresTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class OverworldOresBiomeTagData extends BiomeTagsProvider {
    public OverworldOresBiomeTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper helper) {
        super(output, registries, OverworldOres.MODID, helper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_COAL_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_IRON_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_COPPER_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_GOLD_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_REDSTONE_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_LAPIS_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_EMERALD_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_DIAMOND_ORE)
                .addOptional(AetherBiomes.SKYROOT_MEADOW.location())
                .addOptional(AetherBiomes.SKYROOT_GROVE.location())
                .addOptional(AetherBiomes.SKYROOT_WOODLAND.location())
                .addOptional(AetherBiomes.SKYROOT_FOREST.location());
    }
}
