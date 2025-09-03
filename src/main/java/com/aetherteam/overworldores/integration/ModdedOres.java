package com.aetherteam.overworldores.integration;

import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.google.common.collect.Lists;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ModdedOres {
    public static Map<OreKey, List<OreEntry>> ORE_MOD_MAP = new LinkedHashMap<>();

    static {
        ORE_MOD_MAP.put(new OreKey("tin", OverworldOresBlocks.HOLYSTONE_TIN_ORE), Lists.newArrayList(
                new OreEntry("thermal", getItem("thermal", "raw_tin"), ConstantInt.of(1), getItem("thermal", "tin_ingot"), 0.6F),
                new OreEntry("railcraft", getItem("railcraft", "tin_raw"), ConstantInt.of(1), getItem("railcraft", "tin_ingot"), 1.0F),
                new OreEntry("mekanism", getItem("mekanism", "raw_tin"), ConstantInt.of(1), getItem("mekanism", "ingot_tin"), 0.6F)));
        ORE_MOD_MAP.put(new OreKey("lead", OverworldOresBlocks.HOLYSTONE_LEAD_ORE), Lists.newArrayList(
                new OreEntry("thermal", getItem("thermal", "raw_lead"), ConstantInt.of(1), getItem("thermal", "lead_ingot"), 0.8F),
                new OreEntry("railcraft", getItem("railcraft", "lead_raw"), ConstantInt.of(1), getItem("railcraft", "lead_ingot"), 1.0F),
                new OreEntry("mekanism", getItem("mekanism", "raw_lead"), ConstantInt.of(1), getItem("mekanism", "ingot_lead"), 0.6F),
                new OreEntry("embers", getItem("embers", "raw_lead"), ConstantInt.of(1), getItem("embers", "lead_ingot"), 0.7F),
                new OreEntry("immersiveengineering", getItem("immersiveengineering", "raw_lead"), ConstantInt.of(1), getItem("immersiveengineering", "ingot_lead"), 0.7F),
                new OreEntry("oreganized", getItem("oreganized", "raw_lead"), ConstantInt.of(1), getItem("oreganized", "lead_ingot"), 0.7F)));
        ORE_MOD_MAP.put(new OreKey("silver", OverworldOresBlocks.HOLYSTONE_SILVER_ORE), Lists.newArrayList(
                new OreEntry("thermal", getItem("thermal", "raw_silver"), ConstantInt.of(1), getItem("thermal", "silver_ingot"), 1.0F),
                new OreEntry("railcraft", getItem("railcraft", "silver_raw"), ConstantInt.of(1), getItem("railcraft", "silver_ingot"), 1.0F),
                new OreEntry("embers", getItem("embers", "raw_silver"), ConstantInt.of(1), getItem("embers", "silver_ingot"), 0.7F),
                new OreEntry("immersiveengineering", getItem("immersiveengineering", "raw_silver"), ConstantInt.of(1), getItem("immersiveengineering", "ingot_silver"), 1.0F),
                new OreEntry("oreganized", getItem("oreganized", "raw_silver"), ConstantInt.of(1), getItem("oreganized", "silver_ingot"), 1.0F),
                new OreEntry("caverns_and_chasms", getItem("caverns_and_chasms", "raw_silver"), ConstantInt.of(1), getItem("caverns_and_chasms", "silver_ingot"), 1.0F),
                new OreEntry("iceandfire", getItem("iceandfire", "raw_silver"), ConstantInt.of(1), getItem("iceandfire", "silver_ingot"), 0.35F)));
        ORE_MOD_MAP.put(new OreKey("nickel", OverworldOresBlocks.HOLYSTONE_NICKEL_ORE), Lists.newArrayList(
                new OreEntry("thermal", getItem("thermal", "raw_nickel"), ConstantInt.of(1), getItem("thermal", "nickel_ingot"), 1.0F),
                new OreEntry("railcraft", getItem("railcraft", "nickel_raw"), ConstantInt.of(1), getItem("railcraft", "nickel_ingot"), 1.0F),
                new OreEntry("immersiveengineering", getItem("immersiveengineering", "raw_nickel"), ConstantInt.of(1), getItem("immersiveengineering", "ingot_nickel"), 1.0F)));
        ORE_MOD_MAP.put(new OreKey("zinc", OverworldOresBlocks.HOLYSTONE_ZINC_ORE), Lists.newArrayList(
                new OreEntry("railcraft", getItem("railcraft", "zinc_raw"), ConstantInt.of(1), getItem("railcraft", "zinc_ingot"), 1.0F),
                new OreEntry("create", getItem("create", "raw_zinc"), ConstantInt.of(1), getItem("create", "zinc_ingot"), 1.0F)));
        ORE_MOD_MAP.put(new OreKey("uranium", OverworldOresBlocks.HOLYSTONE_URANIUM_ORE), List.of(
                new OreEntry("mekanism", getItem("mekanism", "raw_uranium"), ConstantInt.of(1), getItem("mekanism", "ingot_uranium"), 0.6F),
                new OreEntry("immersiveengineering", getItem("immersiveengineering", "raw_uranium"), ConstantInt.of(1), getItem("immersiveengineering", "ingot_uranium"), 1.0F)));
        ORE_MOD_MAP.put(new OreKey("sulfur", OverworldOresBlocks.HOLYSTONE_SULFUR_ORE), Lists.newArrayList(
                new OreEntry("thermal", getItem("thermal", "sulfur"), UniformInt.of(3, 5), getItem("thermal", "sulfur"), 0.5F),
                new OreEntry("railcraft", getItem("railcraft", "sulfur_dust"), UniformInt.of(2, 5), () -> Items.AIR, 0.0F)));
    }

    public record OreKey(String name, RegistryObject<Block> holystoneOreBlock) { }

    public record OreEntry(String modId, Supplier<ItemLike> raw, IntProvider dropCount, Supplier<ItemLike> ingot, float xp) { }

    public static Supplier<ItemLike> getItem(String modId, String name) {
        return () -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(modId, name));
    }
}
