package com.aetherteam.overworldores.block;

import com.aetherteam.aether.block.natural.AetherDoubleDropsOreBlock;
import com.aetherteam.overworldores.OverworldOres;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class OverworldOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OverworldOres.MODID);

    public static final RegistryObject<Block> HOLYSTONE_COAL_ORE = register("holystone_coal_ore", () -> new AetherDoubleDropsOreBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> HOLYSTONE_IRON_ORE = register("holystone_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> HOLYSTONE_COPPER_ORE = register("holystone_copper_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(HOLYSTONE_IRON_ORE.get())));
    public static final RegistryObject<Block> HOLYSTONE_GOLD_ORE = register("holystone_gold_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> HOLYSTONE_REDSTONE_ORE = register("holystone_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().randomTicks().lightLevel((state) -> 9).strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> HOLYSTONE_LAPIS_ORE = register("holystone_lapis_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> HOLYSTONE_EMERALD_ORE = register("holystone_emerald_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> HOLYSTONE_DIAMOND_ORE = register("holystone_diamond_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F), UniformInt.of(3, 7)));

    private static <T extends Block> RegistryObject<T> baseRegister(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> register = BLOCKS.register(name, block);
        OverworldOresItems.ITEMS.register(name, item.apply(register));
        return register;
    }

    @SuppressWarnings("unchecked")
    private static <B extends Block> RegistryObject<B> register(String name, Supplier<? extends Block> block) {
        return (RegistryObject<B>) baseRegister(name, block, OverworldOresBlocks::registerBlockItem);
    }

    private static <B extends Block> Supplier<BlockItem> registerBlockItem(final RegistryObject<B> blockRegistryObject) {
        return () -> {
            B block = Objects.requireNonNull(blockRegistryObject.get());
            return new BlockItem(block, new Item.Properties());
        };
    }
}
