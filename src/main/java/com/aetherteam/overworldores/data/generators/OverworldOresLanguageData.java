package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenLanguageProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OverworldOresLanguageData extends NitrogenLanguageProvider {
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

        this.addPackDescription("mod", "The Aether: Overworld Ores Resources");
    }
}
