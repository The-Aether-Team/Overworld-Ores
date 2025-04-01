package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenBlockStateProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class OverworldOresBlockStateData extends NitrogenBlockStateProvider {
    public OverworldOresBlockStateData(PackOutput output, ExistingFileHelper helper) {
        super(output, OverworldOres.MODID, helper);
    }

    @Override
    public void registerStatesAndModels() {
        for (DeferredBlock<? extends Block> ore : OverworldOresBlocks.ORE_BLOCKS) {
            this.block(ore.get(), "natural/");
        }
    }
}
