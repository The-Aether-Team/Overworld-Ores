package com.aetherteam.overworldores.item;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.integration.ModdedOres;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

@Mod.EventBusSubscriber(modid = OverworldOres.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OverworldOresCreativeTabs {
    public static List<Pair<RegistryObject<Block>, Predicate<Void>>> ORDER = new ArrayList<>();

    static {
        ORDER.addAll(List.of(
                Pair.of(AetherBlocks.GRAVITITE_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_COAL_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_IRON_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_COPPER_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_GOLD_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE, (v) -> true),
                Pair.of(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE, (v) -> true)
        ));
        for (Map.Entry<ModdedOres.OreKey, List<ModdedOres.OreEntry>> entry : Lists.reverse(ModdedOres.ORE_MOD_MAP.entrySet().stream().toList())) {
            Predicate<Void> predicate = null;
            for (ModdedOres.OreEntry value : entry.getValue()) {
                String modId = value.modId();
                if (predicate == null) {
                    predicate = (v) -> ModList.get().isLoaded(modId);
                } else {
                    predicate = predicate.or((v) -> ModList.get().isLoaded(modId));
                }
            }
            ORDER.add(Pair.of(entry.getKey().holystoneOreBlock(), Objects.requireNonNullElse(predicate, (v) -> false)));
        }
    }

    @SubscribeEvent
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab == AetherCreativeTabs.AETHER_NATURAL_BLOCKS.getKey()) {
            Block after = null;
            for (int i = 1; i < ORDER.size(); i++) {
                if (ORDER.get(i).getSecond().test(null)) {
                    if (ORDER.get(i - 1).getSecond().test(null)) {
                        after = ORDER.get(i - 1).getFirst().get();
                    }
                    if (after != null) {
                        Block key = ORDER.get(i).getFirst().get();
                        event.getEntries().putAfter(new ItemStack(after), new ItemStack(key), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                    }
                }
            }
        }
    }
}
