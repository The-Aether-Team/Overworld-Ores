//package com.aetherteam.overworldores.data.generators.tags;
//
//import com.aetherteam.aether.AetherTags;
//import com.aetherteam.overworldores.OverworldOres;
//import com.aetherteam.overworldores.block.OverworldOresBlocks;
//import com.aetherteam.overworldores.integration.ModdedOres;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.data.PackOutput;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.tags.BlockTags;
//import net.minecraft.tags.TagKey;
//import net.minecraft.world.level.block.Block;
//import net.neoforged.neoforge.common.Tags;
//import net.neoforged.neoforge.common.data.BlockTagsProvider;
//import net.neoforged.neoforge.common.data.ExistingFileHelper;
//import net.neoforged.neoforge.registries.DeferredBlock;
//
//import javax.annotation.Nullable;
//import java.util.concurrent.CompletableFuture;
//
//public class OverworldOresBlockTagData extends BlockTagsProvider {
//    public OverworldOresBlockTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper helper) {
//        super(output, registries, OverworldOres.MODID, helper);
//    }
//
//    @Override
//    public void addTags(HolderLookup.Provider provider) {
//        IntrinsicTagAppender<Block> aetherBlock = this.tag(AetherTags.Blocks.TREATED_AS_AETHER_BLOCK);
//        IntrinsicTagAppender<Block> pickaxe = this.tag(BlockTags.MINEABLE_WITH_PICKAXE);
//
//        for (DeferredBlock<? extends Block> ore : OverworldOresBlocks.ORE_BLOCKS) {
//            pickaxe.add(ore.get());
//            aetherBlock.add(ore.get());
//        }
//
//        this.tag(BlockTags.COAL_ORES).add(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get());
//        this.tag(BlockTags.IRON_ORES).add(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get());
//        this.tag(BlockTags.COPPER_ORES).add(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get());
//        this.tag(BlockTags.GOLD_ORES).add(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get());
//        this.tag(BlockTags.REDSTONE_ORES).add(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get());
//        this.tag(BlockTags.LAPIS_ORES).add(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get());
//        this.tag(BlockTags.EMERALD_ORES).add(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get());
//        this.tag(BlockTags.DIAMOND_ORES).add(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get());
//        for (ModdedOres.OreKey ore : ModdedOres.ORE_MOD_MAP.keySet()) {
//            this.tag(TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores/" + ore.name()))).add(ore.holystoneOreBlock().get());
//        }
//
//        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
//                OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_TIN_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_LEAD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_SILVER_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_NICKEL_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_ZINC_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_URANIUM_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_SULFUR_ORE.get()
//        );
//        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
//                OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get()
//        );
//
//        this.tag(BlockTags.SNAPS_GOAT_HORN).add(
//                OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_TIN_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_LEAD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_URANIUM_ORE.get()
//        );
//
//        this.tag(Tags.Blocks.ORE_RATES_DENSE).add(
//                OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_SULFUR_ORE.get()
//        );
//        this.tag(Tags.Blocks.ORE_RATES_SINGULAR).add(
//                OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_TIN_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_LEAD_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_SILVER_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_NICKEL_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_ZINC_ORE.get(),
//                OverworldOresBlocks.HOLYSTONE_URANIUM_ORE.get()
//        );
//    }
//}
