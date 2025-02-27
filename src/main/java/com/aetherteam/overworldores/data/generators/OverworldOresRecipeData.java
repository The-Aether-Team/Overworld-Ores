package com.aetherteam.overworldores.data.generators;

import com.aetherteam.nitrogen.data.providers.NitrogenRecipeProvider;
import com.aetherteam.overworldores.OverworldOres;
import com.aetherteam.overworldores.block.OverworldOreBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.Items;

import java.util.List;
import java.util.function.Consumer;

public class OverworldOresRecipeData extends NitrogenRecipeProvider {
    public OverworldOresRecipeData(PackOutput output) {
        super(output, OverworldOres.MODID);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.1F, 200, "coal");
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 200, "iron_ingot");
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 200, "copper_ingot");
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 1.0F, 200, "gold_ingot");
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 1.0F, 200, "diamond");
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get()), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2F, 200, "lapis_lazuli");
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get()), RecipeCategory.REDSTONE, Items.REDSTONE, 0.7F, 200, "redstone");
        oreSmelting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.EMERALD, 1.0F, 200, "emerald");

        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.1F, 100, "coal");
        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 100, "iron_ingot");
        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 100, "copper_ingot");
        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 1.0F, 100, "gold_ingot");
        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_REDSTONE_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 1.0F, 100, "diamond");
        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_LAPIS_ORE.get()), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2F, 100, "lapis_lazuli");
        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_EMERALD_ORE.get()), RecipeCategory.REDSTONE, Items.REDSTONE, 0.7F, 100, "redstone");
        oreBlasting(consumer, List.of(OverworldOreBlocks.HOLYSTONE_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.EMERALD, 1.0F, 100, "emerald");
    }
}
