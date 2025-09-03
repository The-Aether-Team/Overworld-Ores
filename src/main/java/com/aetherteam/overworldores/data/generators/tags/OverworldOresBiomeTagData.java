package com.aetherteam.overworldores.data.generators.tags;

import com.aetherteam.aether.AetherTags;
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
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_COAL_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_IRON_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_COPPER_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_GOLD_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_REDSTONE_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_LAPIS_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_EMERALD_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_DIAMOND_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());

        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_TIN_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_LEAD_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_SILVER_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_NICKEL_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_ZINC_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_URANIUM_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
        this.tag(OverworldOresTags.Biomes.HAS_HOLYSTONE_SULFUR_ORE).addOptionalTag(AetherTags.Biomes.IS_AETHER.location());
    }
}
