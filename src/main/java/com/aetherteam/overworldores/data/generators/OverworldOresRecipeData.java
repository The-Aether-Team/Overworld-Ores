package com.aetherteam.overworldores.data.generators;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.nitrogen.data.providers.NitrogenRecipeProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOresBlocks;
import com.aetherteam.overworldores.integration.ModdedOres;
import com.google.common.collect.ImmutableList;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeSerializer;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class OverworldOresRecipeData extends NitrogenRecipeProvider {
    public OverworldOresRecipeData(PackOutput output) {
        super(output, OverworldOres.MODID);
    }

    public static final ImmutableList<OreSmelting> SMELTING = ImmutableList.of(
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(), Items.COAL, 0.1F),
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(), Items.IRON_INGOT, 0.7F),
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(), Items.COPPER_INGOT, 0.7F),
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(), Items.GOLD_INGOT, 1.0F),
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(), Items.REDSTONE, 0.7F),
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 0.2F),
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(), Items.EMERALD, 1.0F),
            new OreSmelting(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get(), Items.DIAMOND, 1.0F)
    );

    public static final ImmutableList<OreCrushing> CRUSHING = ImmutableList.of(
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_COAL_ORE.get(), Items.COAL, 2.25F, 300),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_IRON_ORE.get(), Items.RAW_IRON,  2.25F,350),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_COPPER_ORE.get(), Items.RAW_COPPER, 7.25F, 350),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_GOLD_ORE.get(), Items.RAW_GOLD, 2.25F, 350),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_REDSTONE_ORE.get(), Items.REDSTONE, 7.5F, 350),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 12.5F, 350),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_EMERALD_ORE.get(), Items.EMERALD, 2.25F, 450),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_DIAMOND_ORE.get(), Items.DIAMOND, 2.25F, 450),
            new OreCrushing(OverworldOresBlocks.HOLYSTONE_SULFUR_ORE.get(), ModdedOres.getItem("thermal", "sulfur").get(), 2.25F, 350)
    );

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        for (var entry : SMELTING) {
            this.smeltingOreRecipe(entry.processed(), entry.block(), entry.smeltingXp()).group(entry.processed().asItem().builtInRegistryHolder().key().location().getPath()).save(consumer, this.name(getItemName(entry.processed()) + "_from_smelting_" + getItemName(entry.block())));
            this.blastingOreRecipe(entry.processed(), entry.block(), entry.smeltingXp()).group(entry.processed().asItem().builtInRegistryHolder().key().location().getPath()).save(consumer, this.name(getItemName(entry.processed()) + "_from_blasting_" + getItemName(entry.block())));
        }
        for (var entry : CRUSHING) {
            this.crushingOreRecipe(entry.block(), entry.raw(), entry.crushingAmount(), entry.crushingDuration()).build(consumer);
        }

        for (var entry : ModdedOres.ORE_MOD_MAP.entrySet()) {
            for (var value : entry.getValue()) {
                if (value.ingot().get() != Items.AIR) {
                    String modId = value.modId();
                    ItemLike itemlike = entry.getKey().holystoneOreBlock().get();
                    ItemLike result = value.ingot().get();
                    float experience = value.xp();
                    String group = value.ingot().get().asItem().builtInRegistryHolder().key().location().getPath();
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
    }

    protected ProcessingRecipeBuilder<?> crushingOreRecipe(ItemLike ore, ItemLike raw, float expectedAmount, int duration) {
        ProcessingRecipeBuilder<?> builder = new ProcessingRecipeBuilder<>(((ProcessingRecipeSerializer<?>) AllRecipeTypes.CRUSHING.getSerializer()).getFactory(), this.name(getItemName(ore) + "_crushing"))
                .withItemIngredients(Ingredient.of(ore))
                .duration(duration)
                .output(raw, Mth.floor(expectedAmount));
        float extra = expectedAmount - (float) Mth.floor(expectedAmount);
        if (extra > 0.0F) {
            builder.output(extra, raw, 1);
        }
        builder.output(0.75F, ForgeRegistries.ITEMS.getValue(new ResourceLocation("create", "experience_nugget")), 1);
        builder.output(0.12F, AetherBlocks.HOLYSTONE.get());
        return builder;
    }

    public record OreSmelting(ItemLike block, ItemLike processed, float smeltingXp) { }

    public record OreCrushing(ItemLike block, ItemLike raw, float crushingAmount, int crushingDuration) { }
}
