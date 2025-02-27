package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenBlockStateProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OverworldOresBlockStateData extends NitrogenBlockStateProvider {
    public OverworldOresBlockStateData(PackOutput output, ExistingFileHelper helper) {
        super(output, OverworldOres.MODID, helper);
    }

    @Override
    public void registerStatesAndModels() {
        this.block(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(), "natural/");
        this.block(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(), "natural/");
        this.block(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(), "natural/");
        this.block(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(), "natural/");
        this.block(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(), "natural/");
        this.block(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(), "natural/");
        this.block(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(), "natural/");
        this.block(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get(), "natural/");
    }
}
