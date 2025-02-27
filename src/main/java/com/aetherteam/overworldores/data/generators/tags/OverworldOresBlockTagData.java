package com.aetherteam.overworldores.data.generators.tags;

import com.aetherteam.aether.Aether;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
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
        this.tag(BlockTags.COAL_ORES).add(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get());
        this.tag(BlockTags.IRON_ORES).add(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get());
        this.tag(BlockTags.COPPER_ORES).add(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get());
        this.tag(BlockTags.GOLD_ORES).add(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get());
        this.tag(BlockTags.REDSTONE_ORES).add(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get());
        this.tag(BlockTags.LAPIS_ORES).add(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get());
        this.tag(BlockTags.EMERALD_ORES).add(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get());
        this.tag(BlockTags.DIAMOND_ORES).add(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get()
        );

        this.tag(BlockTags.SNAPS_GOAT_HORN).add(
                OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(),
                OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get()
        );
    }
}
