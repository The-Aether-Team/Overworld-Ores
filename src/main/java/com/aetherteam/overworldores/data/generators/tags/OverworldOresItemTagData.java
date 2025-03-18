package com.aetherteam.overworldores.data.generators.tags;

import com.aetherteam.aether.Aether;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.integration.ModdedOres;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class OverworldOresItemTagData extends ItemTagsProvider {
    public OverworldOresItemTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper helper) {
        super(output, registries, blockTags, Aether.MODID, helper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        for (ModdedOres.OreKey ore : ModdedOres.ORE_MOD_MAP.keySet()) {
            this.tag(Tags.Items.ORES).add(ore.holystoneOreBlock().get().asItem());
            this.tag(TagKey.create(Registries.ITEM, new ResourceLocation("forge", "ores/" + ore.name()))).add(ore.holystoneOreBlock().get().asItem());
        }

        this.tag(Tags.Items.ORE_RATES_DENSE).add(
                OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get().asItem(),
                OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get().asItem(),
                OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get().asItem()
        );
        this.tag(Tags.Items.ORE_RATES_SINGULAR).add(
                OverworldOresBlocks.HOLYSTONE_COAL_ORE.get().asItem(),
                OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get().asItem(),
                OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get().asItem(),
                OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get().asItem(),
                OverworldOresBlocks.HOLYSTONE_IRON_ORE.get().asItem(),
                OverworldOresBlocks.HOLYSTONE_TIN_ORE.get().asItem()
        );
    }
}
