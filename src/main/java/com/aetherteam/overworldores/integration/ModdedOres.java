package com.aetherteam.overworldores.integration;

import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.google.common.collect.Multimaps;
import com.google.common.collect.SetMultimap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;

public class ModdedOres {
    public static SetMultimap<OreKey, OreEntry> ORE_MOD_MAP = Multimaps.newSetMultimap(new HashMap<>(), HashSet::new);

    static {
        ORE_MOD_MAP.putAll(new OreKey("tin", OverworldOresBlocks.HOLYSTONE_TIN_ORE), List.of(
                        new OreEntry("thermal", getItem("thermal", "raw_tin"), getItem("thermal", "tin_ingot"), 0.6F),
                        new OreEntry("railcraft", getItem("railcraft", "tin_raw"), getItem("railcraft", "tin_ingot"), 1.0F),
                        new OreEntry("mekanism", getItem("mekanism", "raw_tin"), getItem("mekanism", "ingot_tin"), 0.6F)));
    }

    public record OreKey(String name, RegistryObject<Block> holystoneOreBlock) { }

    public record OreEntry(String modId, Supplier<ItemLike> raw, Supplier<ItemLike> ingot, float xp) { }

    public static Supplier<ItemLike> getItem(String modId, String name) {
        return () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(modId, name));
    }
}
