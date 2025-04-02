package com.aetherteam.overworldores;

import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.block.OverworldOresItems;
import com.aetherteam.overworldores.data.OverworldOresData;
import com.aetherteam.overworldores.world.placementmodifiers.OverworldOresPlacementModifiers;
import com.google.common.reflect.Reflection;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(OverworldOres.MODID)
public class OverworldOres {
    public static final String MODID = "aether_overworld_ores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OverworldOres(ModContainer mod, IEventBus bus) {
        bus.addListener(OverworldOresData::dataSetup);
        bus.addListener(this::commonSetup);

        DeferredRegister<?>[] registers = {
                OverworldOresBlocks.BLOCKS,
                OverworldOresItems.ITEMS,
                OverworldOresPlacementModifiers.PLACEMENT_MODIFIERS
        };

        for (DeferredRegister<?> register : registers) {
            register.register(bus);
        }
    }

    public void commonSetup(FMLCommonSetupEvent event) {
        Reflection.initialize(OverworldOresPlacementModifiers.class);
    }
}
