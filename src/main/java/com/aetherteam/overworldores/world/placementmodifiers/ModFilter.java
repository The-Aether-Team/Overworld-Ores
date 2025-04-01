package com.aetherteam.overworldores.world.placementmodifiers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.neoforged.fml.ModList;

import java.util.List;

public class ModFilter extends PlacementFilter {
    public static final MapCodec<ModFilter> CODEC = Codec.STRING.listOf().fieldOf("mods").xmap(ModFilter::new, (filter) -> filter.mods);
    private final List<String> mods;

    private ModFilter(List<String> mods) {
        this.mods = mods;
    }

    public static ModFilter anyLoaded(List<String> mods) {
        return new ModFilter(mods);
    }

    @Override
    protected boolean shouldPlace(PlacementContext context, RandomSource random, BlockPos pos) {
        for (String mod : this.mods) {
            if (ModList.get().isLoaded(mod)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public PlacementModifierType<?> type() {
        return OverworldOresPlacementModifiers.MOD_FILTER.get();
    }
}
