package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenItemModelProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOreBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OverworldOresItemModelData extends NitrogenItemModelProvider {
    public OverworldOresItemModelData(PackOutput output, ExistingFileHelper helper) {
        super(output, OverworldOres.MODID, helper);
    }

    @Override
    protected void registerModels() {
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_COAL_ORE.get());
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_IRON_ORE.get());
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get());
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get());
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get());
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get());
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get());
        this.itemBlock(OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get());
    }
}
