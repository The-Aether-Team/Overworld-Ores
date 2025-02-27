package com.aetherteam.overworldores.item;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOreBlocks;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OverworldOres.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OverworldOresCreativeTabs {
    @SubscribeEvent
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab == AetherCreativeTabs.AETHER_NATURAL_BLOCKS.getKey()) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.GRAVITITE_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_COAL_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(OverworldOreBlocks.HOLYSTONE_COAL_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_IRON_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(OverworldOreBlocks.HOLYSTONE_IRON_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get()), new ItemStack(OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
