package com.aetherteam.overworldores;

import com.aetherteam.overworldores.block.OverworldOreBlocks;
import com.aetherteam.overworldores.block.OverworldOreItems;
import com.aetherteam.overworldores.data.OverworldOreData;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(OverworldOres.MODID)
public class OverworldOres {
    public static final String MODID = "aether_overworld_ores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OverworldOres() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(OverworldOreData::dataSetup);

        DeferredRegister<?>[] registers = {
                OverworldOreBlocks.BLOCKS,
                OverworldOreItems.ITEMS,
        };

        for (DeferredRegister<?> register : registers) {
            register.register(modEventBus);
        }
    }
}
