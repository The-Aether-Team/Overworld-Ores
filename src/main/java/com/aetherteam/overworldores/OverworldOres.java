package com.aetherteam.overworldores;

import com.aetherteam.nitrogen.fabric.registries.DeferredRegister;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.block.OverworldOresItems;
import com.aetherteam.overworldores.item.OverworldOresCreativeTabs;
import com.aetherteam.overworldores.world.placementmodifiers.OverworldOresPlacementModifiers;
import com.google.common.reflect.Reflection;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.slf4j.Logger;

public class OverworldOres implements ModInitializer {
    public static final String MODID = "aether_overworld_ores";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        DeferredRegister<?>[] registers = {
                OverworldOresBlocks.BLOCKS,
                OverworldOresItems.ITEMS,
                OverworldOresPlacementModifiers.PLACEMENT_MODIFIERS
        };

        for (DeferredRegister<?> register : registers) {
            register.addEntriesToRegistry();
        }

        Reflection.initialize(OverworldOresPlacementModifiers.class);

        ItemGroupEvents.MODIFY_ENTRIES_ALL.register(OverworldOresCreativeTabs::buildCreativeModeTabs);
    }
}
