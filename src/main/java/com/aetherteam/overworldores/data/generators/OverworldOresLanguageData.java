package com.aetherteam.overworldores.data.generators;

import com.aetherteam.aether.data.providers.AetherLanguageProvider;
import com.aetherteam.nitrogen.data.providers.NitrogenLanguageProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OverworldOresLanguageData extends AetherLanguageProvider {
    public OverworldOresLanguageData(PackOutput output) {
        super(output, OverworldOres.MODID);
    }

    @Override
    protected void addTranslations() {
        for (RegistryObject<? extends Block> ore : OverworldOresBlocks.ORE_BLOCKS) {
            String id = ore.getId().getPath();
            String name = Stream.of(id.replace('_', ' ').split(" "))
                    .map((str) -> str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase())
                    .collect(Collectors.joining(" "));
            this.addBlock(ore, name);
        }

        this.addLore(OverworldOresBlocks.HOLYSTONE_COAL_ORE, "Coal, like Ambrosium, is a useful furnace fuel in any dimension. However, torches and campfires made with coal won't work in the Aether.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_COPPER_ORE, "The copper dropped by this ore can be made into dozens of different building blocks, each of which oxidize over time. Oxidization can be sped up in contact with rain or water.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_GOLD_ORE, "The Aether variety of gold ore, this shiny, warm metal is prized by players and Piglins alike. Among other uses, it can be made into the healthy Golden Carrot and Golden Apple.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE, "This vibrant ore teems with potential, glowing when touched. Its Redstone Dust can be used to make contraptions.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE, "A fruitful ore that drops several Lapis Lazuli, an indispensible ingredient for enchanting.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE, "This is a rare ore that is only found in groups of one. Emeralds can be sold to and bought from Villagers and have few other uses.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE, "Diamonds not only rival Gravitite in rarity, durability, and power, but also are integral for Jukeboxes and to copy Smithing Templates.");

        this.addLore(OverworldOresBlocks.HOLYSTONE_TIN_ORE, "An uncommon metal ore, some ancient civilizations smelted it with copper to produce Bronze.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_LEAD_ORE, "Lead, when smelted, is a durable yet pliable metal good for a variety of purposes. However, it is toxic to ingest.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_SILVER_ORE, "This Aether ore smelts down into Silver Ingots, which is fit for industry and royalty alike.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_NICKEL_ORE, "A variety of Nickel Ore found in the Aether. Nickel is known for its resistance to corrosion.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_ZINC_ORE, "Like all metal ores, the Raw Zinc this block drops must be smelted before use. Alongside copper, it is a component of Brass.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_URANIUM_ORE, "Uranium is a rare material filled with energy. Standing near this ore feels dangerous.");
        this.addLore(OverworldOresBlocks.HOLYSTONE_SULFUR_ORE, "A form of Sulfur native to the Aether. It smells rather repulsive.");

        this.addPackDescription("mod", "The Aether: Overworld Ores Resources");
    }
}
