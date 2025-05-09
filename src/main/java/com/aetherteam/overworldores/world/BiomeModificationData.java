/*
 * Copyright (c) Forge Development LLC and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

package com.aetherteam.overworldores.world;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryCodecs;
import net.minecraft.resources.RegistryFileCodec;
import net.minecraft.resources.RegistryOps;

import java.util.function.Function;
import java.util.function.Predicate;

public interface BiomeModificationData {
    /**
     * Codec for (de)serializing biome modifiers inline.
     * Mods can use this for data generation.
     */
    Codec<BiomeModificationData> DIRECT_CODEC = BiomeModificationDataRegistries.BIOME_MODIFIER_CODEC.byNameCodec()
            .dispatch(BiomeModificationData::codec, Function.identity());

    /**
     * Codec for referring to biome modifiers by id in other datapack registry files.
     * Can only be used with {@link RegistryOps}.
     */
    Codec<Holder<BiomeModificationData>> REFERENCE_CODEC = RegistryFileCodec.create(BiomeModificationDataRegistries.BIOME_MODIFIERS_KEY, DIRECT_CODEC);

    /**
     * Codec for referring to biome modifiers by id, list of id, or tags.
     * Can only be used with {@link RegistryOps}.
     */
    Codec<HolderSet<BiomeModificationData>> LIST_CODEC = RegistryCodecs.homogeneousList(BiomeModificationDataRegistries.BIOME_MODIFIERS_KEY, DIRECT_CODEC);

    void modify(BiomeSelectionContext selectionContext, BiomeModificationContext modificationContext);

    ModificationPhase phase();

    Predicate<BiomeSelectionContext> selector();

    /**
     * @return the codec which serializes and deserializes this biome modifier
     */
    MapCodec<? extends BiomeModificationData> codec();
}
