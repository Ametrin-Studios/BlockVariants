package com.barion.block_variants.registry;

import com.google.common.collect.Maps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ColorCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class BVBlockFamilies {
    public static final Map<Block, BlockFamily> MAP = Maps.newHashMap();
    public static final List<BlockFamily> LOG_FAMILIES = new ArrayList<>();
    public static final List<BlockFamily> WOOD_FAMILIES = new ArrayList<>();

    public static final BlockFamily NETHERRACK = familyBuilder(Blocks.NETHERRACK)
            .stairs(BVBuildingBlocks.NETHERRACK_STAIRS.get())
            .slab(BVBuildingBlocks.NETHERRACK_SLAB.get())
            .wall(BVBuildingBlocks.NETHERRACK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily END_STONE = familyBuilder(Blocks.END_STONE)
            .stairs(BVBuildingBlocks.END_STONE_STAIRS.get())
            .slab(BVBuildingBlocks.END_STONE_SLAB.get())
            .wall(BVBuildingBlocks.END_STONE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily CRACKED_POLISHED_BLACKSTONE_BRICKS = familyBuilder(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily BASALT = familyBuilder(Blocks.BASALT)
            .stairs(BVBuildingBlocks.BASALT_STAIRS.get())
            .slab(BVBuildingBlocks.BASALT_SLAB.get())
            .wall(BVBuildingBlocks.BASALT_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily POLISHED_BASALT = familyBuilder(Blocks.POLISHED_BASALT)
            .stairs(BVBuildingBlocks.POLISHED_BASALT_STAIRS.get())
            .slab(BVBuildingBlocks.POLISHED_BASALT_SLAB.get())
            .wall(BVBuildingBlocks.POLISHED_BASALT_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily DRIPSTONE_BLOCK = familyBuilder(Blocks.DRIPSTONE_BLOCK)
            .stairs(BVBuildingBlocks.DRIPSTONE_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.DRIPSTONE_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.DRIPSTONE_BLOCK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily AMETHYST_BLOCK = familyBuilder(Blocks.AMETHYST_BLOCK)
            .stairs(BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.AMETHYST_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.AMETHYST_BLOCK_WALL.get())
            .getFamily();
    public static final BlockFamily CRACKED_STONE_BRICKS = familyBuilder(Blocks.CRACKED_STONE_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_STONE_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_STONE_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_STONE_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    // OAK
    public static final BlockFamily OAK_LOG = logFamily(familyBuilder(Blocks.OAK_LOG)
            .stairs(BVBuildingBlocks.OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.OAK_LOG_SLAB.get()));
    public static final BlockFamily OAK_WOOD = woodFamily(familyBuilder(Blocks.OAK_WOOD)
            .log(Blocks.OAK_LOG)
            .stairs(BVBuildingBlocks.OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.OAK_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_OAK_LOG = logFamily(familyBuilder(Blocks.STRIPPED_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_OAK_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_OAK_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_OAK_WOOD)
            .log(Blocks.STRIPPED_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get()));

    // SPRUCE
    public static final BlockFamily SPRUCE_LOG = logFamily(familyBuilder(Blocks.SPRUCE_LOG)
            .stairs(BVBuildingBlocks.SPRUCE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.SPRUCE_LOG_SLAB.get()));
    public static final BlockFamily SPRUCE_WOOD = woodFamily(familyBuilder(Blocks.SPRUCE_WOOD)
            .log(Blocks.SPRUCE_LOG)
            .stairs(BVBuildingBlocks.SPRUCE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.SPRUCE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.SPRUCE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.SPRUCE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.SPRUCE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_SPRUCE_LOG = logFamily(familyBuilder(Blocks.STRIPPED_SPRUCE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_SPRUCE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_SPRUCE_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_SPRUCE_WOOD)
            .log(Blocks.STRIPPED_SPRUCE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get()));

    // BIRCH
    public static final BlockFamily BIRCH_LOG = logFamily(familyBuilder(Blocks.BIRCH_LOG)
            .stairs(BVBuildingBlocks.BIRCH_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.BIRCH_LOG_SLAB.get()));
    public static final BlockFamily BIRCH_WOOD = woodFamily(familyBuilder(Blocks.BIRCH_WOOD)
            .log(Blocks.BIRCH_LOG)
            .stairs(BVBuildingBlocks.BIRCH_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.BIRCH_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.BIRCH_WOOD_WALL.get())
            .fence(BVBuildingBlocks.BIRCH_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.BIRCH_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_BIRCH_LOG = logFamily(familyBuilder(Blocks.STRIPPED_BIRCH_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_BIRCH_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_BIRCH_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_BIRCH_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_BIRCH_WOOD)
            .log(Blocks.STRIPPED_BIRCH_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get()));

    // JUNGLE
    public static final BlockFamily JUNGLE_LOG = logFamily(familyBuilder(Blocks.JUNGLE_LOG)
            .stairs(BVBuildingBlocks.JUNGLE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.JUNGLE_LOG_SLAB.get()));
    public static final BlockFamily JUNGLE_WOOD = woodFamily(familyBuilder(Blocks.JUNGLE_WOOD)
            .log(Blocks.JUNGLE_LOG)
            .stairs(BVBuildingBlocks.JUNGLE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.JUNGLE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.JUNGLE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.JUNGLE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.JUNGLE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_JUNGLE_LOG = logFamily(familyBuilder(Blocks.STRIPPED_JUNGLE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_JUNGLE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_JUNGLE_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_JUNGLE_WOOD)
            .log(Blocks.STRIPPED_JUNGLE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get()));

    // ACACIA
    public static final BlockFamily ACACIA_LOG = logFamily(familyBuilder(Blocks.ACACIA_LOG)
            .stairs(BVBuildingBlocks.ACACIA_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.ACACIA_LOG_SLAB.get()));
    public static final BlockFamily ACACIA_WOOD = woodFamily(familyBuilder(Blocks.ACACIA_WOOD)
            .log(Blocks.ACACIA_LOG)
            .stairs(BVBuildingBlocks.ACACIA_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.ACACIA_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.ACACIA_WOOD_WALL.get())
            .fence(BVBuildingBlocks.ACACIA_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.ACACIA_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_ACACIA_LOG = logFamily(familyBuilder(Blocks.STRIPPED_ACACIA_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_ACACIA_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_ACACIA_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_ACACIA_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_ACACIA_WOOD)
            .log(Blocks.STRIPPED_ACACIA_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get()));

    // DARK_OAK
    public static final BlockFamily DARK_OAK_LOG = logFamily(familyBuilder(Blocks.DARK_OAK_LOG)
            .stairs(BVBuildingBlocks.DARK_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.DARK_OAK_LOG_SLAB.get()));
    public static final BlockFamily DARK_OAK_WOOD = woodFamily(familyBuilder(Blocks.DARK_OAK_WOOD)
            .log(Blocks.DARK_OAK_LOG)
            .stairs(BVBuildingBlocks.DARK_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.DARK_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.DARK_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.DARK_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.DARK_OAK_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_DARK_OAK_LOG = logFamily(familyBuilder(Blocks.STRIPPED_DARK_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_DARK_OAK_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_DARK_OAK_WOOD)
            .log(Blocks.STRIPPED_DARK_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get()));

    // MANGROVE
    public static final BlockFamily MANGROVE_LOG = logFamily(familyBuilder(Blocks.MANGROVE_LOG)
            .stairs(BVBuildingBlocks.MANGROVE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.MANGROVE_LOG_SLAB.get()));
    public static final BlockFamily MANGROVE_WOOD = woodFamily(familyBuilder(Blocks.MANGROVE_WOOD)
            .log(Blocks.MANGROVE_LOG)
            .stairs(BVBuildingBlocks.MANGROVE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.MANGROVE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.MANGROVE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.MANGROVE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.MANGROVE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_MANGROVE_LOG = logFamily(familyBuilder(Blocks.STRIPPED_MANGROVE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_MANGROVE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_MANGROVE_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_MANGROVE_WOOD)
            .log(Blocks.STRIPPED_MANGROVE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get()));

    // CHERRY
    public static final BlockFamily CHERRY_LOG = logFamily(familyBuilder(Blocks.CHERRY_LOG)
            .stairs(BVBuildingBlocks.CHERRY_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.CHERRY_LOG_SLAB.get()));
    public static final BlockFamily CHERRY_WOOD = woodFamily(familyBuilder(Blocks.CHERRY_WOOD)
            .log(Blocks.CHERRY_LOG)
            .stairs(BVBuildingBlocks.CHERRY_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.CHERRY_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.CHERRY_WOOD_WALL.get())
            .fence(BVBuildingBlocks.CHERRY_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.CHERRY_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_CHERRY_LOG = logFamily(familyBuilder(Blocks.STRIPPED_CHERRY_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_CHERRY_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CHERRY_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_CHERRY_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_CHERRY_WOOD)
            .log(Blocks.STRIPPED_CHERRY_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get()));

    // PALE_OAK
    public static final BlockFamily PALE_OAK_LOG = logFamily(familyBuilder(Blocks.PALE_OAK_LOG)
            .stairs(BVBuildingBlocks.PALE_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.PALE_OAK_LOG_SLAB.get()));
    public static final BlockFamily PALE_OAK_WOOD = woodFamily(familyBuilder(Blocks.PALE_OAK_WOOD)
            .log(Blocks.PALE_OAK_LOG)
            .stairs(BVBuildingBlocks.PALE_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.PALE_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.PALE_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.PALE_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.PALE_OAK_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_PALE_OAK_LOG = logFamily(familyBuilder(Blocks.STRIPPED_PALE_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_PALE_OAK_WOOD = woodFamily(familyBuilder(Blocks.STRIPPED_PALE_OAK_WOOD)
            .log(Blocks.STRIPPED_PALE_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE_GATE.get()));

    // BAMBOO_BLOCK
    public static final BlockFamily BAMBOO_BLOCK = familyBuilder(Blocks.BAMBOO_BLOCK)
            .stairs(BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.BAMBOO_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.BAMBOO_BLOCK_WALL.get())
            .fence(BVBuildingBlocks.BAMBOO_BLOCK_FENCE.get())
            .fenceGate(BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.get())
            .getFamily();
    public static final BlockFamily STRIPPED_BAMBOO_BLOCK = familyBuilder(Blocks.STRIPPED_BAMBOO_BLOCK)
            .stairs(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get())
            .getFamily();

    // CRIMSON
    public static final BlockFamily CRIMSON_STEM = logFamily(familyBuilder(Blocks.CRIMSON_STEM)
            .stairs(BVBuildingBlocks.CRIMSON_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.CRIMSON_STEM_SLAB.get()));
    public static final BlockFamily CRIMSON_HYPHAE = woodFamily(familyBuilder(Blocks.CRIMSON_HYPHAE)
            .log(Blocks.CRIMSON_STEM)
            .stairs(BVBuildingBlocks.CRIMSON_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.CRIMSON_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.CRIMSON_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.CRIMSON_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.CRIMSON_HYPHAE_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_CRIMSON_STEM = logFamily(familyBuilder(Blocks.STRIPPED_CRIMSON_STEM)
            .stairs(BVBuildingBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CRIMSON_STEM_SLAB.get()));
    public static final BlockFamily STRIPPED_CRIMSON_HYPHAE = woodFamily(familyBuilder(Blocks.STRIPPED_CRIMSON_HYPHAE)
            .log(Blocks.STRIPPED_CRIMSON_STEM)
            .stairs(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get()));

    // WARPED
    public static final BlockFamily WARPED_STEM = logFamily(familyBuilder(Blocks.WARPED_STEM)
            .stairs(BVBuildingBlocks.WARPED_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.WARPED_STEM_SLAB.get()));
    public static final BlockFamily WARPED_HYPHAE = woodFamily(familyBuilder(Blocks.WARPED_HYPHAE)
            .log(Blocks.WARPED_STEM)
            .stairs(BVBuildingBlocks.WARPED_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.WARPED_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.WARPED_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.WARPED_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.WARPED_HYPHAE_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_WARPED_STEM = logFamily(familyBuilder(Blocks.STRIPPED_WARPED_STEM)
            .stairs(BVBuildingBlocks.STRIPPED_WARPED_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_WARPED_STEM_SLAB.get()));
    public static final BlockFamily STRIPPED_WARPED_HYPHAE = woodFamily(familyBuilder(Blocks.STRIPPED_WARPED_HYPHAE)
            .log(Blocks.STRIPPED_WARPED_STEM)
            .stairs(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get()));


    public static final BlockFamily CALCITE = familyBuilder(Blocks.CALCITE)
            .stairs(BVBuildingBlocks.CALCITE_STAIRS.get())
            .slab(BVBuildingBlocks.CALCITE_SLAB.get())
            .wall(BVBuildingBlocks.CALCITE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily SMOOTH_BASALT = familyBuilder(Blocks.SMOOTH_BASALT)
            .stairs(BVBuildingBlocks.SMOOTH_BASALT_STAIRS.get())
            .slab(BVBuildingBlocks.SMOOTH_BASALT_SLAB.get())
            .wall(BVBuildingBlocks.SMOOTH_BASALT_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily DEEPSLATE = familyBuilder(Blocks.DEEPSLATE)
            .stairs(BVBuildingBlocks.DEEPSLATE_STAIRS.get())
            .slab(BVBuildingBlocks.DEEPSLATE_SLAB.get())
            .wall(BVBuildingBlocks.DEEPSLATE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily CRACKED_DEEPSLATE_BRICKS = familyBuilder(Blocks.CRACKED_DEEPSLATE_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily CRACKED_DEEPSLATE_TILES = familyBuilder(Blocks.CRACKED_DEEPSLATE_TILES)
            .stairs(BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily CRACKED_NETHER_BRICKS = familyBuilder(Blocks.CRACKED_NETHER_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_NETHER_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_NETHER_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_NETHER_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();


    public static final BlockFamily OBSIDIAN = familyBuilder(Blocks.OBSIDIAN)
            .stairs(BVBuildingBlocks.OBSIDIAN_STAIRS.get())
            .slab(BVBuildingBlocks.OBSIDIAN_SLAB.get())
            .wall(BVBuildingBlocks.OBSIDIAN_WALL.get())
            .getFamily();
    public static final BlockFamily CRYING_OBSIDIAN = familyBuilder(Blocks.CRYING_OBSIDIAN)
            .stairs(BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.get())
            .slab(BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.get())
            .wall(BVBuildingBlocks.CRYING_OBSIDIAN_WALL.get())
            .getFamily();

    public static final BlockFamily TERRACOTTA = familyBuilder(Blocks.TERRACOTTA)
            .stairs(BVColoredBlocks.TERRACOTTA_STAIRS.get())
            .slab(BVColoredBlocks.TERRACOTTA_SLAB.get())
            .wall(BVColoredBlocks.TERRACOTTA_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final ColorCollection<BlockFamily> DYED_TERRACOTTA = ColorCollection.VALUES
            .map(
                    color -> familyBuilder(Blocks.DYED_TERRACOTTA.pick(color))
                            .stairs(BVColoredBlocks.DYED_TERRACOTTA_STAIRS.pick(color).get())
                            .slab(BVColoredBlocks.DYED_TERRACOTTA_SLAB.pick(color).get())
                            .wall(BVColoredBlocks.DYED_TERRACOTTA_WALL.pick(color).get())
                            .generateStonecutterRecipe()
                            .getFamily()
            );

    public static final ColorCollection<BlockFamily> GLAZED_TERRACOTTA = ColorCollection.VALUES
            .map(
                    color -> familyBuilder(Blocks.GLAZED_TERRACOTTA.pick(color))
                            .stairs(BVColoredBlocks.GLAZED_TERRACOTTA_STAIRS.pick(color).get())
                            .slab(BVColoredBlocks.GLAZED_TERRACOTTA_SLAB.pick(color).get())
                            .wall(BVColoredBlocks.GLAZED_TERRACOTTA_WALL.pick(color).get())
                            .generateStonecutterRecipe()
                            .getFamily()
            );

    private static BlockFamily logFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();

        validateLogFamily(family);

        LOG_FAMILIES.add(family);
        return family;
    }

    private static BlockFamily woodFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();

        validateWoodFamily(family);

        WOOD_FAMILIES.add(family);
        return family;
    }

    private static BlockFamily.Builder familyBuilder(Block base) {
        var builder = new BlockFamily.Builder(base);
        var blockFamily = MAP.put(base, builder.getFamily());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + BuiltInRegistries.BLOCK.getKey(base));
        } else {
            return builder;
        }
    }

    public static void validateLogFamily(BlockFamily family) {
        var variants = family.getVariants();
        if (!variants.containsKey(BlockFamily.Variant.STAIRS)) {
            throw new UnsupportedOperationException("missing stairs");
        }
        if (!variants.containsKey(BlockFamily.Variant.SLAB)) {
            throw new UnsupportedOperationException("missing slab");
        }
    }

    public static void validateWoodFamily(BlockFamily family) {
        var variants = family.getVariants();
        if (!variants.containsKey(BlockFamily.Variant.STAIRS)) {
            throw new UnsupportedOperationException("missing stairs");
        }
        if (!variants.containsKey(BlockFamily.Variant.SLAB)) {
            throw new UnsupportedOperationException("missing slab");
        }
        if (!variants.containsKey(BlockFamily.Variant.WALL)) {
            throw new UnsupportedOperationException("missing wall");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE)) {
            throw new UnsupportedOperationException("missing fence");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE_GATE)) {
            throw new UnsupportedOperationException("missing fence gate");
        }
    }
}
