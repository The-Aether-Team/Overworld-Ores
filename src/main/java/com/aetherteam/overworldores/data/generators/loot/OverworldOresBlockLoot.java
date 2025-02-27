package com.aetherteam.overworldores.data.generators.loot;

import com.aetherteam.nitrogen.data.providers.NitrogenBlockLootSubProvider;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

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
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return OverworldOresBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
    }
}
