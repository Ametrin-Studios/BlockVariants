package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import org.jetbrains.annotations.NotNull;

public final class BVModelProvider extends ExtendedModelProvider {
    public BVModelProvider(PackOutput output) {
        super(output, BlockVariants.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_GRANITE).wall(BVBlocks.POLISHED_GRANITE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_DIORITE).wall(BVBlocks.POLISHED_DIORITE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_ANDESITE).wall(BVBlocks.POLISHED_ANDESITE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.STONE).wall(BVBlocks.STONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.SMOOTH_STONE).wall(BVBlocks.SMOOTH_STONE_WALL.get());
        customStairs(blockModels, BVBlocks.SMOOTH_STONE_STAIRS.get(), TextureMapping.cube(Blocks.SMOOTH_STONE).put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/smooth_stone_slab_side")));

        blockModels.familyWithExistingFullBlock(Blocks.CUT_SANDSTONE).wall(BVBlocks.CUT_SANDSTONE_WALL.get());
        customStairs(blockModels, BVBlocks.CUT_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE));
        blockModels.familyWithExistingFullBlock(Blocks.CUT_RED_SANDSTONE).wall(BVBlocks.CUT_RED_SANDSTONE_WALL.get());
        customStairs(blockModels, BVBlocks.CUT_RED_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE));

        customWall(blockModels, BVBlocks.QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, ResourceLocation.withDefaultNamespace("block/quartz_block_top")));
        blockModels.familyWithExistingFullBlock(Blocks.QUARTZ_BRICKS).stairs(BVBlocks.QUARTZ_BRICK_STAIRS.get()).slab(BVBlocks.QUARTZ_BRICK_SLAB.get()).wall(BVBlocks.QUARTZ_BRICK_WALL.get());
        customWall(blockModels, BVBlocks.SMOOTH_QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, ResourceLocation.withDefaultNamespace("block/quartz_block_bottom")));
        blockModels.familyWithExistingFullBlock(Blocks.CHISELED_QUARTZ_BLOCK).stairs(BVBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get()).slab(BVBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get()).wall(BVBlocks.CHISELED_QUARTZ_BLOCK_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.PRISMARINE_BRICKS).wall(BVBlocks.PRISMARINE_BRICK_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.DARK_PRISMARINE).wall(BVBlocks.DARK_PRISMARINE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.NETHERRACK).stairs(BVBlocks.NETHERRACK_STAIRS.get()).slab(BVBlocks.NETHERRACK_SLAB.get()).wall(BVBlocks.NETHERRACK_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.END_STONE).stairs(BVBlocks.END_STONE_STAIRS.get()).slab(BVBlocks.END_STONE_SLAB.get()).wall(BVBlocks.END_STONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.PURPUR_BLOCK).wall(BVBlocks.PURPUR_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).stairs(BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get()).slab(BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get()).wall(BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get());
        columnStairsSlabWall(blockModels, Blocks.BASALT, BVBlocks.BASALT_STAIRS.get(), BVBlocks.BASALT_SLAB.get(), BVBlocks.BASALT_WALL.get());
        columnStairsSlabWall(blockModels, Blocks.POLISHED_BASALT, BVBlocks.POLISHED_BASALT_STAIRS.get(), BVBlocks.POLISHED_BASALT_SLAB.get(), BVBlocks.POLISHED_BASALT_WALL.get());

        stairsSlabWall(blockModels, Blocks.TERRACOTTA, BVBlocks.TERRACOTTA_STAIRS.get(), BVBlocks.TERRACOTTA_SLAB.get(), BVBlocks.TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.WHITE_TERRACOTTA, BVBlocks.WHITE_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.ORANGE_TERRACOTTA, BVBlocks.ORANGE_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.MAGENTA_TERRACOTTA, BVBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_BLUE_TERRACOTTA, BVBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.YELLOW_TERRACOTTA, BVBlocks.YELLOW_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIME_TERRACOTTA, BVBlocks.LIME_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_TERRACOTTA_SLAB.get(), BVBlocks.LIME_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PINK_TERRACOTTA, BVBlocks.PINK_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_TERRACOTTA_SLAB.get(), BVBlocks.PINK_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GRAY_TERRACOTTA, BVBlocks.GRAY_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_GRAY_TERRACOTTA, BVBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.CYAN_TERRACOTTA, BVBlocks.CYAN_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PURPLE_TERRACOTTA, BVBlocks.PURPLE_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLUE_TERRACOTTA, BVBlocks.BLUE_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BROWN_TERRACOTTA, BVBlocks.BROWN_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GREEN_TERRACOTTA, BVBlocks.GREEN_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.RED_TERRACOTTA, BVBlocks.RED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_TERRACOTTA_SLAB.get(), BVBlocks.RED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLACK_TERRACOTTA, BVBlocks.BLACK_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_TERRACOTTA_WALL.get());

        stairsSlabWall(blockModels, Blocks.DRIPSTONE_BLOCK, BVBlocks.DRIPSTONE_BLOCK_STAIRS.get(), BVBlocks.DRIPSTONE_BLOCK_SLAB.get(), BVBlocks.DRIPSTONE_BLOCK_WALL.get());
        stairsSlabWall(blockModels, Blocks.AMETHYST_BLOCK, BVBlocks.AMETHYST_BLOCK_STAIRS.get(), BVBlocks.AMETHYST_BLOCK_SLAB.get(), BVBlocks.AMETHYST_BLOCK_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRACKED_STONE_BRICKS, BVBlocks.CRACKED_STONE_BRICK_STAIRS.get(), BVBlocks.CRACKED_STONE_BRICK_SLAB.get(), BVBlocks.CRACKED_STONE_BRICK_WALL.get());

        logStairsSlab(blockModels, Blocks.STRIPPED_OAK_LOG, BVBlocks.STRIPPED_OAK_LOG_STAIRS.get(), BVBlocks.STRIPPED_OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_SPRUCE_LOG, BVBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get(), BVBlocks.STRIPPED_SPRUCE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_BIRCH_LOG, BVBlocks.STRIPPED_BIRCH_LOG_STAIRS.get(), BVBlocks.STRIPPED_BIRCH_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_JUNGLE_LOG, BVBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get(), BVBlocks.STRIPPED_JUNGLE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_ACACIA_LOG, BVBlocks.STRIPPED_ACACIA_LOG_STAIRS.get(), BVBlocks.STRIPPED_ACACIA_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_DARK_OAK_LOG, BVBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get(), BVBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_MANGROVE_LOG, BVBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get(), BVBlocks.STRIPPED_MANGROVE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_CHERRY_LOG, BVBlocks.STRIPPED_CHERRY_LOG_STAIRS.get(), BVBlocks.STRIPPED_CHERRY_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_PALE_OAK_LOG, BVBlocks.STRIPPED_PALE_OAK_LOG_STAIRS.get(), BVBlocks.STRIPPED_PALE_OAK_LOG_SLAB.get());

        logStairsSlab(blockModels, Blocks.OAK_LOG, BVBlocks.OAK_LOG_STAIRS.get(), BVBlocks.OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.SPRUCE_LOG, BVBlocks.SPRUCE_LOG_STAIRS.get(), BVBlocks.SPRUCE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.BIRCH_LOG, BVBlocks.BIRCH_LOG_STAIRS.get(), BVBlocks.BIRCH_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.JUNGLE_LOG, BVBlocks.JUNGLE_LOG_STAIRS.get(), BVBlocks.JUNGLE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.ACACIA_LOG, BVBlocks.ACACIA_LOG_STAIRS.get(), BVBlocks.ACACIA_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.DARK_OAK_LOG, BVBlocks.DARK_OAK_LOG_STAIRS.get(), BVBlocks.DARK_OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.MANGROVE_LOG, BVBlocks.MANGROVE_LOG_STAIRS.get(), BVBlocks.MANGROVE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.CHERRY_LOG, BVBlocks.CHERRY_LOG_STAIRS.get(), BVBlocks.CHERRY_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.PALE_OAK_LOG, BVBlocks.PALE_OAK_LOG_STAIRS.get(), BVBlocks.PALE_OAK_LOG_SLAB.get());

        logStairsSlab(blockModels, Blocks.STRIPPED_CRIMSON_STEM, BVBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get(), BVBlocks.STRIPPED_CRIMSON_STEM_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_WARPED_STEM, BVBlocks.STRIPPED_WARPED_STEM_STAIRS.get(), BVBlocks.STRIPPED_WARPED_STEM_SLAB.get());
        logStairsSlab(blockModels, Blocks.CRIMSON_STEM, BVBlocks.CRIMSON_STEM_STAIRS.get(), BVBlocks.CRIMSON_STEM_SLAB.get());
        logStairsSlab(blockModels, Blocks.WARPED_STEM, BVBlocks.WARPED_STEM_STAIRS.get(), BVBlocks.WARPED_STEM_SLAB.get());


        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_OAK_LOG, BVBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_OAK_WOOD, BVBlocks.STRIPPED_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_SPRUCE_LOG, BVBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), Blocks.STRIPPED_SPRUCE_WOOD, BVBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_BIRCH_LOG, BVBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), BVBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), Blocks.STRIPPED_BIRCH_WOOD, BVBlocks.STRIPPED_BIRCH_WOOD_WALL.get(), BVBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(), BVBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_JUNGLE_LOG, BVBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), Blocks.STRIPPED_JUNGLE_WOOD, BVBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_ACACIA_LOG, BVBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), BVBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), Blocks.STRIPPED_ACACIA_WOOD, BVBlocks.STRIPPED_ACACIA_WOOD_WALL.get(), BVBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(), BVBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_DARK_OAK_LOG, BVBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_DARK_OAK_WOOD, BVBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_MANGROVE_LOG, BVBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), Blocks.STRIPPED_MANGROVE_WOOD, BVBlocks.STRIPPED_MANGROVE_WOOD_WALL.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_CHERRY_LOG, BVBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(), BVBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), Blocks.STRIPPED_CHERRY_WOOD, BVBlocks.STRIPPED_CHERRY_WOOD_WALL.get(), BVBlocks.STRIPPED_CHERRY_WOOD_FENCE.get(), BVBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_PALE_OAK_LOG, BVBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_PALE_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_PALE_OAK_WOOD, BVBlocks.STRIPPED_PALE_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_PALE_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_PALE_OAK_WOOD_FENCE_GATE.get());
        logStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_BAMBOO_BLOCK, BVBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get());

        woodStairsSlabWallFenceGate(blockModels, Blocks.OAK_LOG, BVBlocks.OAK_WOOD_STAIRS.get(), BVBlocks.OAK_WOOD_SLAB.get(), Blocks.OAK_WOOD, BVBlocks.OAK_WOOD_WALL.get(), BVBlocks.OAK_WOOD_FENCE.get(), BVBlocks.OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.SPRUCE_LOG, BVBlocks.SPRUCE_WOOD_STAIRS.get(), BVBlocks.SPRUCE_WOOD_SLAB.get(), Blocks.SPRUCE_WOOD, BVBlocks.SPRUCE_WOOD_WALL.get(), BVBlocks.SPRUCE_WOOD_FENCE.get(), BVBlocks.SPRUCE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.BIRCH_LOG, BVBlocks.BIRCH_WOOD_STAIRS.get(), BVBlocks.BIRCH_WOOD_SLAB.get(), Blocks.BIRCH_WOOD, BVBlocks.BIRCH_WOOD_WALL.get(), BVBlocks.BIRCH_WOOD_FENCE.get(), BVBlocks.BIRCH_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.JUNGLE_LOG, BVBlocks.JUNGLE_WOOD_STAIRS.get(), BVBlocks.JUNGLE_WOOD_SLAB.get(), Blocks.JUNGLE_WOOD, BVBlocks.JUNGLE_WOOD_WALL.get(), BVBlocks.JUNGLE_WOOD_FENCE.get(), BVBlocks.JUNGLE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.ACACIA_LOG, BVBlocks.ACACIA_WOOD_STAIRS.get(), BVBlocks.ACACIA_WOOD_SLAB.get(), Blocks.ACACIA_WOOD, BVBlocks.ACACIA_WOOD_WALL.get(), BVBlocks.ACACIA_WOOD_FENCE.get(), BVBlocks.ACACIA_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.DARK_OAK_LOG, BVBlocks.DARK_OAK_WOOD_STAIRS.get(), BVBlocks.DARK_OAK_WOOD_SLAB.get(), Blocks.DARK_OAK_WOOD, BVBlocks.DARK_OAK_WOOD_WALL.get(), BVBlocks.DARK_OAK_WOOD_FENCE.get(), BVBlocks.DARK_OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.MANGROVE_LOG, BVBlocks.MANGROVE_WOOD_STAIRS.get(), BVBlocks.MANGROVE_WOOD_SLAB.get(), Blocks.MANGROVE_WOOD, BVBlocks.MANGROVE_WOOD_WALL.get(), BVBlocks.MANGROVE_WOOD_FENCE.get(), BVBlocks.MANGROVE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.CHERRY_LOG, BVBlocks.CHERRY_WOOD_STAIRS.get(), BVBlocks.CHERRY_WOOD_SLAB.get(), Blocks.CHERRY_WOOD, BVBlocks.CHERRY_WOOD_WALL.get(), BVBlocks.CHERRY_WOOD_FENCE.get(), BVBlocks.CHERRY_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.PALE_OAK_LOG, BVBlocks.PALE_OAK_WOOD_STAIRS.get(), BVBlocks.PALE_OAK_WOOD_SLAB.get(), Blocks.PALE_OAK_WOOD, BVBlocks.PALE_OAK_WOOD_WALL.get(), BVBlocks.PALE_OAK_WOOD_FENCE.get(), BVBlocks.PALE_OAK_WOOD_FENCE_GATE.get());
        logStairsSlabWallFenceGate(blockModels, Blocks.BAMBOO_BLOCK, BVBlocks.BAMBOO_BLOCK_STAIRS.get(), BVBlocks.BAMBOO_BLOCK_SLAB.get(), BVBlocks.BAMBOO_BLOCK_WALL.get(), BVBlocks.BAMBOO_BLOCK_FENCE.get(), BVBlocks.BAMBOO_BLOCK_FENCE_GATE.get());

        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_CRIMSON_STEM, BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_WARPED_STEM, BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), Blocks.STRIPPED_WARPED_HYPHAE, BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.CRIMSON_STEM, BVBlocks.CRIMSON_HYPHAE_STAIRS.get(), BVBlocks.CRIMSON_HYPHAE_SLAB.get(), Blocks.CRIMSON_HYPHAE, BVBlocks.CRIMSON_HYPHAE_WALL.get(), BVBlocks.CRIMSON_HYPHAE_FENCE.get(), BVBlocks.CRIMSON_HYPHAE_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.WARPED_STEM, BVBlocks.WARPED_HYPHAE_STAIRS.get(), BVBlocks.WARPED_HYPHAE_SLAB.get(), Blocks.WARPED_HYPHAE, BVBlocks.WARPED_HYPHAE_WALL.get(), BVBlocks.WARPED_HYPHAE_FENCE.get(), BVBlocks.WARPED_HYPHAE_FENCE_GATE.get());

        stairsSlabWall(blockModels, Blocks.CALCITE, BVBlocks.CALCITE_STAIRS.get(), BVBlocks.CALCITE_SLAB.get(), BVBlocks.CALCITE_WALL.get());
        stairsSlabWall(blockModels, Blocks.SMOOTH_BASALT, BVBlocks.SMOOTH_BASALT_STAIRS.get(), BVBlocks.SMOOTH_BASALT_SLAB.get(), BVBlocks.SMOOTH_BASALT_WALL.get());

        stairsSlabWall(blockModels, Blocks.DEEPSLATE, BVBlocks.DEEPSLATE_STAIRS.get(), BVBlocks.DEEPSLATE_SLAB.get(), BVBlocks.DEEPSLATE_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRACKED_DEEPSLATE_BRICKS, BVBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), BVBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), BVBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRACKED_DEEPSLATE_TILES, BVBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), BVBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), BVBlocks.CRACKED_DEEPSLATE_TILE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.NETHER_BRICKS).fenceGate(BVBlocks.NETHER_BRICK_FENCE_GATE.get());
        stairsSlabWallFenceGate(blockModels, Blocks.CRACKED_NETHER_BRICKS, BVBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), BVBlocks.CRACKED_NETHER_BRICK_SLAB.get(), BVBlocks.CRACKED_NETHER_BRICK_WALL.get(), BVBlocks.CRACKED_NETHER_BRICK_FENCE.get(), BVBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get());
        blockModels.familyWithExistingFullBlock(Blocks.RED_NETHER_BRICKS).fence(BVBlocks.RED_NETHER_BRICK_FENCE.get()).fenceGate(BVBlocks.RED_NETHER_BRICK_FENCE_GATE.get());

        stairsSlabWall(blockModels, Blocks.OBSIDIAN, BVBlocks.OBSIDIAN_STAIRS.get(), BVBlocks.OBSIDIAN_SLAB.get(), BVBlocks.OBSIDIAN_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRYING_OBSIDIAN, BVBlocks.CRYING_OBSIDIAN_STAIRS.get(), BVBlocks.CRYING_OBSIDIAN_SLAB.get(), BVBlocks.CRYING_OBSIDIAN_WALL.get());

        stairsSlabWall(blockModels, Blocks.WHITE_GLAZED_TERRACOTTA, BVBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.ORANGE_GLAZED_TERRACOTTA, BVBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.MAGENTA_GLAZED_TERRACOTTA, BVBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.YELLOW_GLAZED_TERRACOTTA, BVBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIME_GLAZED_TERRACOTTA, BVBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIME_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PINK_GLAZED_TERRACOTTA, BVBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PINK_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GRAY_GLAZED_TERRACOTTA, BVBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.CYAN_GLAZED_TERRACOTTA, BVBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PURPLE_GLAZED_TERRACOTTA, BVBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLUE_GLAZED_TERRACOTTA, BVBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BROWN_GLAZED_TERRACOTTA, BVBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GREEN_GLAZED_TERRACOTTA, BVBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.RED_GLAZED_TERRACOTTA, BVBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.RED_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLACK_GLAZED_TERRACOTTA, BVBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get());

        stairsSlabWall(blockModels, Blocks.WHITE_WOOL, BVBlocks.WHITE_WOOL_STAIRS.get(), BVBlocks.WHITE_WOOL_SLAB.get(), BVBlocks.WHITE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.ORANGE_WOOL, BVBlocks.ORANGE_WOOL_STAIRS.get(), BVBlocks.ORANGE_WOOL_SLAB.get(), BVBlocks.ORANGE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.MAGENTA_WOOL, BVBlocks.MAGENTA_WOOL_STAIRS.get(), BVBlocks.MAGENTA_WOOL_SLAB.get(), BVBlocks.MAGENTA_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_BLUE_WOOL, BVBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), BVBlocks.LIGHT_BLUE_WOOL_SLAB.get(), BVBlocks.LIGHT_BLUE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.YELLOW_WOOL, BVBlocks.YELLOW_WOOL_STAIRS.get(), BVBlocks.YELLOW_WOOL_SLAB.get(), BVBlocks.YELLOW_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIME_WOOL, BVBlocks.LIME_WOOL_STAIRS.get(), BVBlocks.LIME_WOOL_SLAB.get(), BVBlocks.LIME_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.PINK_WOOL, BVBlocks.PINK_WOOL_STAIRS.get(), BVBlocks.PINK_WOOL_SLAB.get(), BVBlocks.PINK_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.GRAY_WOOL, BVBlocks.GRAY_WOOL_STAIRS.get(), BVBlocks.GRAY_WOOL_SLAB.get(), BVBlocks.GRAY_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_GRAY_WOOL, BVBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), BVBlocks.LIGHT_GRAY_WOOL_SLAB.get(), BVBlocks.LIGHT_GRAY_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.CYAN_WOOL, BVBlocks.CYAN_WOOL_STAIRS.get(), BVBlocks.CYAN_WOOL_SLAB.get(), BVBlocks.CYAN_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.PURPLE_WOOL, BVBlocks.PURPLE_WOOL_STAIRS.get(), BVBlocks.PURPLE_WOOL_SLAB.get(), BVBlocks.PURPLE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLUE_WOOL, BVBlocks.BLUE_WOOL_STAIRS.get(), BVBlocks.BLUE_WOOL_SLAB.get(), BVBlocks.BLUE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.BROWN_WOOL, BVBlocks.BROWN_WOOL_STAIRS.get(), BVBlocks.BROWN_WOOL_SLAB.get(), BVBlocks.BROWN_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.GREEN_WOOL, BVBlocks.GREEN_WOOL_STAIRS.get(), BVBlocks.GREEN_WOOL_SLAB.get(), BVBlocks.GREEN_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.RED_WOOL, BVBlocks.RED_WOOL_STAIRS.get(), BVBlocks.RED_WOOL_SLAB.get(), BVBlocks.RED_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLACK_WOOL, BVBlocks.BLACK_WOOL_STAIRS.get(), BVBlocks.BLACK_WOOL_SLAB.get(), BVBlocks.BLACK_WOOL_WALL.get());

        stairsSlabWall(blockModels, Blocks.PACKED_MUD, BVBlocks.PACKED_MUD_STAIRS.get(), BVBlocks.PACKED_MUD_SLAB.get(), BVBlocks.PACKED_MUD_WALL.get());
    }

    private static void stairsSlabWall(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).slab(slab).wall(wall);
    }

    private static void stairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).slab(slab).wall(wall).fence(fence).fenceGate(gate);
    }

    private static void woodStairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, Block doubleSlap, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).wall(wall).fence(fence).fenceGate(gate);
        customSlab(blockModels, slab, doubleSlap, new TextureMapping()
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(base))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(base))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(base))
        );
    }

    private static void logStairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        blockModels.familyWithExistingFullBlock(base).wall(wall).fence(fence).fenceGate(gate);
        var mapping = logTextureMapping(base);
        customStairs(blockModels, stair, mapping);
        customSlab(blockModels, slab, base, mapping);
    }

    private static void stairsSlab(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).slab(slab);
    }

    private static void logStairsSlab(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab) {
        var mapping = logTextureMapping(base);
        customStairs(blockModels, stair, mapping);
        customSlab(blockModels, slab, base, mapping);
    }

    private static void columnStairsSlabWall(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall) {
        var mapping = columnTopSideTextureMapping(base);
        customStairs(blockModels, stair, mapping);
        customSlab(blockModels, slab, base, mapping);
        customWall(blockModels, wall, mapping);
    }

    private static TextureMapping logTextureMapping(Block log) {
        return new TextureMapping()
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(log))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(log, "_top"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(log, "_top"));
    }

    private static TextureMapping sandstoneTextureMapping(Block side, Block top) {
        return new TextureMapping()
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(side))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(top, "_top"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(top, "_top"));
    }

    private static TextureMapping columnTopSideTextureMapping(Block log) {
        return new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(log, "_side"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(log, "_side"))
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(log, "_top"))
                .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(log, "_top"));
    }

    public static void customStairs(BlockModelGenerators blockModels, Block stairsBlock, TextureMapping mapping) {
        var innerModel = ModelTemplates.STAIRS_INNER.create(stairsBlock, mapping, blockModels.modelOutput);
        var straightModel = ModelTemplates.STAIRS_STRAIGHT.create(stairsBlock, mapping, blockModels.modelOutput);
        var outerModel = ModelTemplates.STAIRS_OUTER.create(stairsBlock, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createStairs(stairsBlock, innerModel, straightModel, outerModel));
        blockModels.registerSimpleItemModel(stairsBlock, straightModel);
    }

    public static void customSlab(BlockModelGenerators blockModels, Block slabBlock, Block doubleSlab, TextureMapping mapping) {
        var bottomModel = ModelTemplates.SLAB_BOTTOM.create(slabBlock, mapping, blockModels.modelOutput);
        var topModel = ModelTemplates.SLAB_TOP.create(slabBlock, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSlab(slabBlock, bottomModel, topModel, ModelLocationUtils.getModelLocation(doubleSlab)));
        blockModels.registerSimpleItemModel(slabBlock, bottomModel);
    }

    public static void customWall(BlockModelGenerators blockModels, Block wallBlock, TextureMapping mapping) {
        var postModel = ModelTemplates.WALL_POST.create(wallBlock, mapping, blockModels.modelOutput);
        var lowModel = ModelTemplates.WALL_LOW_SIDE.create(wallBlock, mapping, blockModels.modelOutput);
        var tallModel = ModelTemplates.WALL_TALL_SIDE.create(wallBlock, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createWall(wallBlock, postModel, lowModel, tallModel));
        ResourceLocation inventoryModel = ModelTemplates.WALL_INVENTORY.create(wallBlock, mapping, blockModels.modelOutput);
        blockModels.registerSimpleItemModel(wallBlock, inventoryModel);
    }
}
