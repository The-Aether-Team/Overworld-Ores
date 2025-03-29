package com.aetherteam.overworldores;

import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.block.OverworldOresItems;
import com.aetherteam.overworldores.data.OverworldOresData;
import com.aetherteam.overworldores.loot.entries.OverworldOresLootPoolEntries;
import com.aetherteam.overworldores.world.placementmodifiers.OverworldOresPlacementModifiers;
import com.google.common.reflect.Reflection;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(OverworldOres.MODID)
public class OverworldOres {
    public static final String MODID = "aether_overworld_ores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OverworldOres() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(OverworldOresData::dataSetup);
        modEventBus.addListener(this::commonSetup);

        DeferredRegister<?>[] registers = {
                OverworldOresBlocks.BLOCKS,
                OverworldOresItems.ITEMS,
                OverworldOresLootPoolEntries.LOOT_POOL_ENTRY_TYPES,
        };

        for (DeferredRegister<?> register : registers) {
            register.register(modEventBus);
        }
    }

    public void commonSetup(FMLCommonSetupEvent event) {
        Reflection.initialize(OverworldOresPlacementModifiers.class);
    }
}
