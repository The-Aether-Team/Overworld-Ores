package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenRecipeProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.antlr.v4.runtime.misc.Triple;

import java.util.List;
import java.util.function.Consumer;

public class OverworldOresRecipeData extends NitrogenRecipeProvider {
    public OverworldOresRecipeData(PackOutput output) {
        super(output, OverworldOres.MODID);
    }

    public static final ImmutableList<Triple<ItemLike, ItemLike, Float>> SMELTABLES = ImmutableList.of(
            new Triple<>(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(), Items.COAL, 0.1F),
            new Triple<>(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(), Items.IRON_INGOT, 0.7F),
            new Triple<>(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(), Items.COPPER_INGOT, 0.7F),
            new Triple<>(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(), Items.GOLD_INGOT, 1.0F),
            new Triple<>(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(), Items.REDSTONE, 0.7F),
            new Triple<>(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 0.2F),
            new Triple<>(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(), Items.EMERALD, 1.0F),
            new Triple<>(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get(), Items.DIAMOND, 1.0F)
    );

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        for (Triple<ItemLike, ItemLike, Float> entry : SMELTABLES) {
            oreSmelting(consumer, List.of(entry.a), RecipeCategory.MISC, entry.b, entry.c, 200, entry.b.asItem().builtInRegistryHolder().key().location().getPath());
            oreBlasting(consumer, List.of(entry.a), RecipeCategory.MISC, entry.b, entry.c, 100, entry.b.asItem().builtInRegistryHolder().key().location().getPath());
        }
    }
}
