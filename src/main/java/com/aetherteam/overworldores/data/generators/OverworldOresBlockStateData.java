package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenBlockStateProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOreBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OverworldOresBlockStateData extends NitrogenBlockStateProvider {
    public OverworldOresBlockStateData(PackOutput output, ExistingFileHelper helper) {
        super(output, OverworldOres.MODID, helper);
    }

    @Override
    public void registerStatesAndModels() {
        this.block(OverworldOreBlocks.HOLYSTONE_COAL_ORE.get(), "natural/");
        this.block(OverworldOreBlocks.HOLYSTONE_IRON_ORE.get(), "natural/");
        this.block(OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get(), "natural/");
        this.block(OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get(), "natural/");
        this.block(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get(), "natural/");
        this.block(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get(), "natural/");
        this.block(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get(), "natural/");
        this.block(OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get(), "natural/");
    }
}
