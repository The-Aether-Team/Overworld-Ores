package com.aetherteam.overworldores.loot.entries;

import com.aetherteam.overworldores.OverworldOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.entries.CompositeEntryBase;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class OverworldOresLootPoolEntries {
    public static final DeferredRegister<LootPoolEntryType> LOOT_POOL_ENTRY_TYPES = DeferredRegister.create(Registries.LOOT_POOL_ENTRY_TYPE, OverworldOres.MODID);

    public static final RegistryObject<LootPoolEntryType> RANDOM = LOOT_POOL_ENTRY_TYPES.register("random", () -> new LootPoolEntryType(CompositeEntryBase.createSerializer(RandomEntry::new)));
}
