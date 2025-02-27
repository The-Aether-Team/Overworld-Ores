package com.aetherteam.overworldores.data.generators;

import com.aetherteam.overworldores.data.generators.loot.OverworldOresBlockLoot;
import com.aetherteam.overworldores.loot.OverworldOresLoot;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;

public class OverworldOresLootTableData {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, OverworldOresLoot.IMMUTABLE_LOOT_TABLES, List.of(
                new LootTableProvider.SubProviderEntry(OverworldOresBlockLoot::new, LootContextParamSets.BLOCK)
        ));
    }
}
