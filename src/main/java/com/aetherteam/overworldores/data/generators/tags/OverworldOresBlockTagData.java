package com.aetherteam.overworldores.data.generators.tags;

import com.aetherteam.aether.Aether;
import com.aetherteam.overworldores.block.OverworldOreBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class OverworldOresBlockTagData extends BlockTagsProvider {
    public OverworldOresBlockTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper helper) {
        super(output, registries, Aether.MODID, helper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.COAL_ORES).add(OverworldOreBlocks.HOLYSTONE_COAL_ORE.get());
        this.tag(BlockTags.IRON_ORES).add(OverworldOreBlocks.HOLYSTONE_IRON_ORE.get());
        this.tag(BlockTags.COPPER_ORES).add(OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get());
        this.tag(BlockTags.GOLD_ORES).add(OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get());
        this.tag(BlockTags.REDSTONE_ORES).add(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get());
        this.tag(BlockTags.LAPIS_ORES).add(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get());
        this.tag(BlockTags.EMERALD_ORES).add(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get());
        this.tag(BlockTags.DIAMOND_ORES).add(OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                OverworldOreBlocks.HOLYSTONE_COAL_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_IRON_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                OverworldOreBlocks.HOLYSTONE_IRON_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get()
        );

        this.tag(BlockTags.SNAPS_GOAT_HORN).add(
                OverworldOreBlocks.HOLYSTONE_IRON_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_COAL_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get(),
                OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get()
        );
    }
}
