package com.barion.block_variants.registry;

import com.barion.block_variants.BlockVariants;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Function;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.copyProperties;
import static com.barion.block_variants.registry.BVBuildingBlocks.DEFAULT_ITEM_PROPERTIES;
import static com.barion.block_variants.registry.BVBuildingBlocks.getVanillaBlock;

public final class BVColoredBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);

    public static final DeferredBlock<StairBlock> WHITE_WOOL_STAIRS = regWoolStairs(DyeColor.WHITE);
    public static final DeferredBlock<SlabBlock> WHITE_WOOL_SLAB = regWoolSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_WOOL_WALL = regWoolWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_WOOL_STAIRS = regWoolStairs(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_WOOL_SLAB = regWoolSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_WOOL_WALL = regWoolWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> GRAY_WOOL_STAIRS = regWoolStairs(DyeColor.GRAY);
    public static final DeferredBlock<SlabBlock> GRAY_WOOL_SLAB = regWoolSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_WOOL_WALL = regWoolWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> BLACK_WOOL_STAIRS = regWoolStairs(DyeColor.BLACK);
    public static final DeferredBlock<SlabBlock> BLACK_WOOL_SLAB = regWoolSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_WOOL_WALL = regWoolWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> BROWN_WOOL_STAIRS = regWoolStairs(DyeColor.BROWN);
    public static final DeferredBlock<SlabBlock> BROWN_WOOL_SLAB = regWoolSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_WOOL_WALL = regWoolWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> RED_WOOL_STAIRS = regWoolStairs(DyeColor.RED);
    public static final DeferredBlock<SlabBlock> RED_WOOL_SLAB = regWoolSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_WOOL_WALL = regWoolWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> ORANGE_WOOL_STAIRS = regWoolStairs(DyeColor.ORANGE);
    public static final DeferredBlock<SlabBlock> ORANGE_WOOL_SLAB = regWoolSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_WOOL_WALL = regWoolWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> YELLOW_WOOL_STAIRS = regWoolStairs(DyeColor.YELLOW);
    public static final DeferredBlock<SlabBlock> YELLOW_WOOL_SLAB = regWoolSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_WOOL_WALL = regWoolWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_WOOL_STAIRS = regWoolStairs(DyeColor.LIME);
    public static final DeferredBlock<SlabBlock> LIME_WOOL_SLAB = regWoolSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_WOOL_WALL = regWoolWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> GREEN_WOOL_STAIRS = regWoolStairs(DyeColor.GREEN);
    public static final DeferredBlock<SlabBlock> GREEN_WOOL_SLAB = regWoolSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_WOOL_WALL = regWoolWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> CYAN_WOOL_STAIRS = regWoolStairs(DyeColor.CYAN);
    public static final DeferredBlock<SlabBlock> CYAN_WOOL_SLAB = regWoolSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_WOOL_WALL = regWoolWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_WOOL_STAIRS = regWoolStairs(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_WOOL_SLAB = regWoolSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_WOOL_WALL = regWoolWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> BLUE_WOOL_STAIRS = regWoolStairs(DyeColor.BLUE);
    public static final DeferredBlock<SlabBlock> BLUE_WOOL_SLAB = regWoolSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_WOOL_WALL = regWoolWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> PURPLE_WOOL_STAIRS = regWoolStairs(DyeColor.PURPLE);
    public static final DeferredBlock<SlabBlock> PURPLE_WOOL_SLAB = regWoolSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_WOOL_WALL = regWoolWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> MAGENTA_WOOL_STAIRS = regWoolStairs(DyeColor.MAGENTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_WOOL_SLAB = regWoolSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_WOOL_WALL = regWoolWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> PINK_WOOL_STAIRS = regWoolStairs(DyeColor.PINK);
    public static final DeferredBlock<SlabBlock> PINK_WOOL_SLAB = regWoolSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_WOOL_WALL = regWoolWall(DyeColor.PINK);


    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIRS = register("terracotta_stairs", StairBlock::new, Blocks.TERRACOTTA);
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab", SlabBlock::new, Blocks.TERRACOTTA);
    public static final DeferredBlock<WallBlock> TERRACOTTA_WALL = register("terracotta_wall", WallBlock::new, Blocks.TERRACOTTA);

    public static final DeferredBlock<StairBlock> WHITE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> WHITE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> BLACK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> BLACK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> BROWN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> BROWN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> RED_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.RED, Blocks.RED_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> RED_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_TERRACOTTA_WALL = regTerracottaWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> ORANGE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> ORANGE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> YELLOW_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> YELLOW_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_TERRACOTTA_WALL = regTerracottaWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> LIME_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> GREEN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> GREEN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> CYAN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> CYAN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> PURPLE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> PURPLE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> MAGENTA_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_TERRACOTTA_WALL = regTerracottaWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> PINK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> PINK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PINK);


    public static final DeferredBlock<StairBlock> WHITE_CONCRETE_STAIRS = regConcreteStairs(DyeColor.WHITE);
    public static final DeferredBlock<SlabBlock> WHITE_CONCRETE_SLAB = regConcreteSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_CONCRETE_WALL = regConcreteWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = regConcreteStairs(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = regConcreteSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CONCRETE_WALL = regConcreteWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> GRAY_CONCRETE_STAIRS = regConcreteStairs(DyeColor.GRAY);
    public static final DeferredBlock<SlabBlock> GRAY_CONCRETE_SLAB = regConcreteSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_CONCRETE_WALL = regConcreteWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> BLACK_CONCRETE_STAIRS = regConcreteStairs(DyeColor.BLACK);
    public static final DeferredBlock<SlabBlock> BLACK_CONCRETE_SLAB = regConcreteSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_CONCRETE_WALL = regConcreteWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> BROWN_CONCRETE_STAIRS = regConcreteStairs(DyeColor.BROWN);
    public static final DeferredBlock<SlabBlock> BROWN_CONCRETE_SLAB = regConcreteSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_CONCRETE_WALL = regConcreteWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> RED_CONCRETE_STAIRS = regConcreteStairs(DyeColor.RED);
    public static final DeferredBlock<SlabBlock> RED_CONCRETE_SLAB = regConcreteSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_CONCRETE_WALL = regConcreteWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> ORANGE_CONCRETE_STAIRS = regConcreteStairs(DyeColor.ORANGE);
    public static final DeferredBlock<SlabBlock> ORANGE_CONCRETE_SLAB = regConcreteSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_CONCRETE_WALL = regConcreteWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> YELLOW_CONCRETE_STAIRS = regConcreteStairs(DyeColor.YELLOW);
    public static final DeferredBlock<SlabBlock> YELLOW_CONCRETE_SLAB = regConcreteSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_CONCRETE_WALL = regConcreteWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_CONCRETE_STAIRS = regConcreteStairs(DyeColor.LIME);
    public static final DeferredBlock<SlabBlock> LIME_CONCRETE_SLAB = regConcreteSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_CONCRETE_WALL = regConcreteWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> GREEN_CONCRETE_STAIRS = regConcreteStairs(DyeColor.GREEN);
    public static final DeferredBlock<SlabBlock> GREEN_CONCRETE_SLAB = regConcreteSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_CONCRETE_WALL = regConcreteWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> CYAN_CONCRETE_STAIRS = regConcreteStairs(DyeColor.CYAN);
    public static final DeferredBlock<SlabBlock> CYAN_CONCRETE_SLAB = regConcreteSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_CONCRETE_WALL = regConcreteWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = regConcreteStairs(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = regConcreteSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CONCRETE_WALL = regConcreteWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> BLUE_CONCRETE_STAIRS = regConcreteStairs(DyeColor.BLUE);
    public static final DeferredBlock<SlabBlock> BLUE_CONCRETE_SLAB = regConcreteSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_CONCRETE_WALL = regConcreteWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> PURPLE_CONCRETE_STAIRS = regConcreteStairs(DyeColor.PURPLE);
    public static final DeferredBlock<SlabBlock> PURPLE_CONCRETE_SLAB = regConcreteSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_CONCRETE_WALL = regConcreteWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> MAGENTA_CONCRETE_STAIRS = regConcreteStairs(DyeColor.MAGENTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_CONCRETE_SLAB = regConcreteSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_CONCRETE_WALL = regConcreteWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> PINK_CONCRETE_STAIRS = regConcreteStairs(DyeColor.PINK);
    public static final DeferredBlock<SlabBlock> PINK_CONCRETE_SLAB = regConcreteSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_CONCRETE_WALL = regConcreteWall(DyeColor.PINK);


    public static final DeferredBlock<StairBlock> WHITE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.WHITE);
    public static final DeferredBlock<SlabBlock> WHITE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GRAY);
    public static final DeferredBlock<SlabBlock> GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> BLACK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLACK);
    public static final DeferredBlock<SlabBlock> BLACK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> BROWN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BROWN);
    public static final DeferredBlock<SlabBlock> BROWN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> RED_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.RED);
    public static final DeferredBlock<SlabBlock> RED_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> ORANGE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.ORANGE);
    public static final DeferredBlock<SlabBlock> ORANGE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> YELLOW_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.YELLOW);
    public static final DeferredBlock<SlabBlock> YELLOW_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIME);
    public static final DeferredBlock<SlabBlock> LIME_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> GREEN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GREEN);
    public static final DeferredBlock<SlabBlock> GREEN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> CYAN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.CYAN);
    public static final DeferredBlock<SlabBlock> CYAN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLUE);
    public static final DeferredBlock<SlabBlock> BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> PURPLE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PURPLE);
    public static final DeferredBlock<SlabBlock> PURPLE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> MAGENTA_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.MAGENTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> PINK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PINK);
    public static final DeferredBlock<SlabBlock> PINK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PINK);



    private static DeferredBlock<StairBlock> regTerracottaStairs(DyeColor color, Block base) {
        return register(color.getName() + "_terracotta_stairs", prop -> new StairBlock(base.defaultBlockState(), prop), copyProperties(base));
    }

    private static DeferredBlock<SlabBlock> regTerracottaSlab(DyeColor color) {
        return register(color.getName() + "_terracotta_slab", SlabBlock::new, copyProperties(Blocks.TERRACOTTA));
    }

    private static DeferredBlock<WallBlock> regTerracottaWall(DyeColor color) {
        return register(color.getName() + "_terracotta_wall", WallBlock::new, copyProperties(Blocks.TERRACOTTA));
    }

    private static DeferredBlock<StairBlock> regGlazedTerracottaStairs(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_stairs", prop -> new StairBlock(parent.defaultBlockState(), prop), parent);
    }

    private static DeferredBlock<SlabBlock> regGlazedTerracottaSlab(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_slab", SlabBlock::new, parent);
    }

    private static DeferredBlock<WallBlock> regGlazedTerracottaWall(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_wall", WallBlock::new, parent);
    }

    private static DeferredBlock<StairBlock> regWoolStairs(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_stairs", prop -> new StairBlock(parent.defaultBlockState(), prop), parent);
    }

    private static DeferredBlock<SlabBlock> regWoolSlab(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_slab", SlabBlock::new, parent);
    }

    private static DeferredBlock<WallBlock> regWoolWall(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_wall", WallBlock::new, parent);
    }

    private static DeferredBlock<StairBlock> regConcreteStairs(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_concrete");
        return register(color.getName() + "_concrete_stairs", prop -> new StairBlock(parent.defaultBlockState(), prop), parent);
    }

    private static DeferredBlock<SlabBlock> regConcreteSlab(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_concrete");
        return register(color.getName() + "_concrete_slab", SlabBlock::new, parent);
    }

    private static DeferredBlock<WallBlock> regConcreteWall(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_concrete");
        return register(color.getName() + "_concrete_wall", WallBlock::new, parent);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base) {
        return register(name, block, copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties) {
        return register(name, block, properties, DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties, Item.Properties itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }
}
