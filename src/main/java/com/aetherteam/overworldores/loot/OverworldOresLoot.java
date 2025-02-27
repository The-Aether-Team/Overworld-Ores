package com.aetherteam.overworldores.loot;

import net.minecraft.resources.ResourceLocation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class OverworldOresLoot {
    private static final Set<ResourceLocation> LOOT_TABLES = new HashSet<>();
    public static final Set<ResourceLocation> IMMUTABLE_LOOT_TABLES = Collections.unmodifiableSet(LOOT_TABLES);
}
