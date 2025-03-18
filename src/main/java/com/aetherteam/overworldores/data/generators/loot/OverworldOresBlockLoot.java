package com.aetherteam.overworldores.data.generators.loot;

import com.aetherteam.nitrogen.data.providers.NitrogenBlockLootSubProvider;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.integration.ModdedOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;

import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OverworldOresBlockLoot extends NitrogenBlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Set.of();

    public OverworldOresBlockLoot() {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        this.add(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        this.add(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        this.add(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(), this::createCopperOreDrops);
        this.add(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        this.add(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        this.add(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(), this::createLapisOreDrops);
        this.add(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        this.add(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));
        for (ModdedOres.OreKey ore : ModdedOres.ORE_MOD_MAP.keySet()) {
            this.add(ore.holystoneOreBlock().get(), (block) -> this.createOreTagDrop(block, TagKey.create(Registries.ITEM, new ResourceLocation("forge", "raw_materials/" + ore.name()))));
        }
    }

    protected LootTable.Builder createOreTagDrop(Block block, TagKey<Item> item) {
        return createSilkTouchDispatchTable(block, this.applyExplosionDecay(block, TagEntry.expandTag(item)).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return OverworldOresBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
    }
}
