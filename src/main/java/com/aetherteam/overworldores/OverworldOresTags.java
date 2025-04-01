package com.aetherteam.overworldores;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class OverworldOresTags {
    public static class Biomes {
        public static final TagKey<Biome> HAS_HOLYSTONE_COAL_ORE = tag("has_holystone_coal_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_IRON_ORE = tag("has_holystone_iron_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_COPPER_ORE = tag("has_holystone_copper_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_GOLD_ORE = tag("has_holystone_gold_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_REDSTONE_ORE = tag("has_holystone_redstone_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_LAPIS_ORE = tag("has_holystone_lapis_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_EMERALD_ORE = tag("has_holystone_emerald_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_DIAMOND_ORE = tag("has_holystone_diamond_ore");

        public static final TagKey<Biome> HAS_HOLYSTONE_TIN_ORE = tag("has_holystone_tin_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_LEAD_ORE = tag("has_holystone_lead_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_SILVER_ORE = tag("has_holystone_silver_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_NICKEL_ORE = tag("has_holystone_nickel_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_ZINC_ORE = tag("has_holystone_zinc_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_URANIUM_ORE = tag("has_holystone_uranium_ore");
        public static final TagKey<Biome> HAS_HOLYSTONE_SULFUR_ORE = tag("has_holystone_sulfur_ore");

        private static TagKey<Biome> tag(String name) {
            return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(OverworldOres.MODID, name));
        }
    }
}
