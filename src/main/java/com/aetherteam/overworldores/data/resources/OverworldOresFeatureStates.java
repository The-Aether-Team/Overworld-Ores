package com.aetherteam.overworldores.data.resources;

import com.aetherteam.aether.block.AetherBlockStateProperties;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import net.minecraft.world.level.block.state.BlockState;

public class OverworldOresFeatureStates {
    public static final BlockState HOLYSTONE_COAL_ORE = OverworldOresBlocks.HOLYSTONE_COAL_ORE.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState HOLYSTONE_IRON_ORE = OverworldOresBlocks.HOLYSTONE_IRON_ORE.get().defaultBlockState();
    public static final BlockState HOLYSTONE_COPPER_ORE = OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get().defaultBlockState();
    public static final BlockState HOLYSTONE_GOLD_ORE = OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get().defaultBlockState();
    public static final BlockState HOLYSTONE_REDSTONE_ORE = OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get().defaultBlockState();
    public static final BlockState HOLYSTONE_LAPIS_ORE = OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get().defaultBlockState();
    public static final BlockState HOLYSTONE_EMERALD_ORE = OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get().defaultBlockState();
    public static final BlockState HOLYSTONE_DIAMOND_ORE = OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get().defaultBlockState();
}
