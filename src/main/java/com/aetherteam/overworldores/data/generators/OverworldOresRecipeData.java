package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenRecipeProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.integration.ModdedOres;
import com.google.common.collect.ImmutableList;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
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
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) { //todo create crushing and other compat recipes
        for (var entry : SMELTABLES) {
            this.smeltingOreRecipe(entry.b, entry.a, entry.c).group(entry.b.asItem().builtInRegistryHolder().key().location().getPath()).save(consumer, this.name(getItemName(entry.b) + "_from_smelting_" + getItemName(entry.a)));
            this.blastingOreRecipe(entry.b, entry.a, entry.c).group(entry.b.asItem().builtInRegistryHolder().key().location().getPath()).save(consumer, this.name(getItemName(entry.b) + "_from_blasting_" + getItemName(entry.a)));
        }

        for (var entry : ModdedOres.ORE_MOD_MAP.entries()) {
            String modId = entry.getValue().modId();
            ItemLike itemlike = entry.getKey().holystoneOreBlock().get();
            ItemLike result = entry.getValue().ingot().get();
            float experience = entry.getValue().xp();
            String group = entry.getValue().ingot().get().asItem().builtInRegistryHolder().key().location().getPath();
            ConditionalRecipe.builder()
                    .addCondition(new ModLoadedCondition(modId))
                    .addRecipe(SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), RecipeCategory.MISC, result, experience, 200, RecipeSerializer.SMELTING_RECIPE).group(group).unlockedBy(getHasName(itemlike), has(itemlike))::save)
                    .build(consumer, this.name(getItemName(result) + "_from_smelting" + "_" + getItemName(itemlike) + "_" + modId));
            ConditionalRecipe.builder()
                    .addCondition(new ModLoadedCondition(modId))
                    .addRecipe(SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), RecipeCategory.MISC, result, experience, 100, RecipeSerializer.BLASTING_RECIPE).group(group).unlockedBy(getHasName(itemlike), has(itemlike))::save)
                    .build(consumer, this.name(getItemName(result) + "_from_blasting" + "_" + getItemName(itemlike) + "_" + modId));
        }
    }
}
