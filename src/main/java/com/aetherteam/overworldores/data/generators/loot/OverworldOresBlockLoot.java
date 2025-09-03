package com.aetherteam.overworldores.data.generators.loot;

import com.aetherteam.nitrogen.data.providers.NitrogenBlockLootSubProvider;
import com.aetherteam.nitrogen.loot.entries.RandomEntry;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.integration.ModdedOres;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OverworldOresBlockLoot extends NitrogenBlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Set.of();

    public OverworldOresBlockLoot(HolderLookup.Provider registries) {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        this.add(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(), (block) -> this.createOreDrop(block, Items.COAL));
        this.add(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_IRON));
        this.add(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(), this::createCopperOreDrops);
        this.add(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(), (block) -> this.createOreDrop(block, Items.RAW_GOLD));
        this.add(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(), this::createRedstoneOreDrops);
        this.add(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(), this::createLapisOreDrops);
        this.add(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(), (block) -> this.createOreDrop(block, Items.EMERALD));
        this.add(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get(), (block) -> this.createOreDrop(block, Items.DIAMOND));

//        for (ModdedOres.OreKey ore : ModdedOres.ORE_MOD_MAP.keySet()) {
//            Collection<ModdedOres.OreEntry> values = ModdedOres.ORE_MOD_MAP.get(ore);
//            Block block = ore.holystoneOreBlock().get();
//            if (values.isEmpty()) {
//                this.dropNone(block);
//            } else {
//                RandomEntry.Builder builder = new RandomEntry.Builder();
//                for (ModdedOres.OreEntry oreEntry : values) {
//                    builder = builder.another(this.applyExplosionDecay(block, LootItem.lootTableItem(oreEntry.raw().get()))
//                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(oreEntry.dropCount().getMinValue(), oreEntry.dropCount().getMaxValue())))
//                            .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE))));
//                }
//                RandomEntry.Builder finalBuilder = builder;
//                this.add(block, (inner) -> LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(inner).when(this.hasSilkTouch()).otherwise(finalBuilder))));
//            }
//        }
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        List<Block> moddedOres = ModdedOres.ORE_MOD_MAP.keySet().stream().map(key -> key.holystoneOreBlock().get()).toList();
        return OverworldOresBlocks.BLOCKS.getEntries().stream().map(Supplier::get).filter(block -> !moddedOres.contains(block)).collect(Collectors.toList());
    }
}
