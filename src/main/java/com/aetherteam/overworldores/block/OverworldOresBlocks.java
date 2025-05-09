package com.aetherteam.overworldores.block;

import com.aetherteam.aether.block.natural.AetherDoubleDropsOreBlock;
import com.aetherteam.overworldores.OverworldOres;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import com.aetherteam.aetherfabric.registries.DeferredBlock;
import com.aetherteam.aetherfabric.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class OverworldOresBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(OverworldOres.MODID);

    public static final List<DeferredBlock<? extends Block>> ORE_BLOCKS = new ArrayList<>();

    public static final DeferredBlock<Block> HOLYSTONE_COAL_ORE = register("holystone_coal_ore", () -> new AetherDoubleDropsOreBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_IRON_ORE = register("holystone_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_COPPER_ORE = register("holystone_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofLegacyCopy(HOLYSTONE_IRON_ORE.get())));
    public static final DeferredBlock<Block> HOLYSTONE_GOLD_ORE = register("holystone_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_REDSTONE_ORE = register("holystone_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().randomTicks().lightLevel((state) -> 9).strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_LAPIS_ORE = register("holystone_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_EMERALD_ORE = register("holystone_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_DIAMOND_ORE = register("holystone_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));

    public static final DeferredBlock<Block> HOLYSTONE_TIN_ORE = register("holystone_tin_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_LEAD_ORE = register("holystone_lead_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_SILVER_ORE = register("holystone_silver_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_NICKEL_ORE = register("holystone_nickel_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_ZINC_ORE = register("holystone_zinc_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_URANIUM_ORE = register("holystone_uranium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> HOLYSTONE_SULFUR_ORE = register("holystone_sulfur_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));

    private static <T extends Block> DeferredBlock<T> baseRegister(String name, Supplier<? extends T> block, Function<DeferredBlock<T>, Supplier<? extends Item>> item) {
        DeferredBlock<T> register = BLOCKS.register(name, block);
        OverworldOresItems.ITEMS.register(name, item.apply(register));
        ORE_BLOCKS.add(register);
        return register;
    }

    private static <B extends Block> DeferredBlock<B> register(String name, Supplier<B> block) {
        return baseRegister(name, block, OverworldOresBlocks::registerBlockItem);
    }

    private static <T extends Block> Supplier<BlockItem> registerBlockItem(final DeferredBlock<T> deferredBlock) {
        return () -> {
            DeferredBlock<T> block = Objects.requireNonNull(deferredBlock);
            return new BlockItem(block.get(), new Item.Properties());
        };
    }
}
