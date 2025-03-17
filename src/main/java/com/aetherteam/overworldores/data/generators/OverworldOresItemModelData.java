package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenItemModelProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class OverworldOresItemModelData extends NitrogenItemModelProvider {
    public OverworldOresItemModelData(PackOutput output, ExistingFileHelper helper) {
        super(output, OverworldOres.MODID, helper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<? extends Block> ore : OverworldOresBlocks.ORE_BLOCKS) {
            this.itemBlock(ore.get());
        }
    }
}
