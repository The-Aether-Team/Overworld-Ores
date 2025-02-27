package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenLanguageProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOreBlocks;
import net.minecraft.data.PackOutput;

public class OverworldOresLanguageData extends NitrogenLanguageProvider {
    public OverworldOresLanguageData(PackOutput output) {
        super(output, OverworldOres.MODID);
    }

    @Override
    protected void addTranslations() {
        this.addBlock(OverworldOreBlocks.HOLYSTONE_COAL_ORE, "Holystone Coal Ore");
        this.addBlock(OverworldOreBlocks.HOLYSTONE_IRON_ORE, "Holystone Iron Ore");
        this.addBlock(OverworldOreBlocks.HOLYSTONE_COPPER_ORE, "Holystone Copper Ore");
        this.addBlock(OverworldOreBlocks.HOLYSTONE_GOLD_ORE, "Holystone Gold Ore");
        this.addBlock(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE, "Holystone Redstone Ore");
        this.addBlock(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE, "Holystone Lapis Ore");
        this.addBlock(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE, "Holystone Emerald Ore");
        this.addBlock(OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE, "Holystone Diamond Ore");
    }
}
