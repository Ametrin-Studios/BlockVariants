package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVColoredBlocks;
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
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_GRANITE).wall(BVBuildingBlocks.POLISHED_GRANITE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_DIORITE).wall(BVBuildingBlocks.POLISHED_DIORITE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_ANDESITE).wall(BVBuildingBlocks.POLISHED_ANDESITE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.STONE).wall(BVBuildingBlocks.STONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.SMOOTH_STONE).wall(BVBuildingBlocks.SMOOTH_STONE_WALL.get());
        customStairs(blockModels, BVBuildingBlocks.SMOOTH_STONE_STAIRS.get(), TextureMapping.cube(Blocks.SMOOTH_STONE).put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/smooth_stone_slab_side")));

        blockModels.familyWithExistingFullBlock(Blocks.CUT_SANDSTONE).wall(BVBuildingBlocks.CUT_SANDSTONE_WALL.get());
        customStairs(blockModels, BVBuildingBlocks.CUT_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE));
        blockModels.familyWithExistingFullBlock(Blocks.CUT_RED_SANDSTONE).wall(BVBuildingBlocks.CUT_RED_SANDSTONE_WALL.get());
        customStairs(blockModels, BVBuildingBlocks.CUT_RED_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE));

        customWall(blockModels, BVBuildingBlocks.QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, ResourceLocation.withDefaultNamespace("block/quartz_block_top")));
        blockModels.familyWithExistingFullBlock(Blocks.QUARTZ_BRICKS).stairs(BVBuildingBlocks.QUARTZ_BRICK_STAIRS.get()).slab(BVBuildingBlocks.QUARTZ_BRICK_SLAB.get()).wall(BVBuildingBlocks.QUARTZ_BRICK_WALL.get());
        customWall(blockModels, BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, ResourceLocation.withDefaultNamespace("block/quartz_block_bottom")));
        blockModels.familyWithExistingFullBlock(Blocks.CHISELED_QUARTZ_BLOCK).stairs(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get()).slab(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get()).wall(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.PRISMARINE_BRICKS).wall(BVBuildingBlocks.PRISMARINE_BRICK_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.DARK_PRISMARINE).wall(BVBuildingBlocks.DARK_PRISMARINE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.NETHERRACK).stairs(BVBuildingBlocks.NETHERRACK_STAIRS.get()).slab(BVBuildingBlocks.NETHERRACK_SLAB.get()).wall(BVBuildingBlocks.NETHERRACK_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.END_STONE).stairs(BVBuildingBlocks.END_STONE_STAIRS.get()).slab(BVBuildingBlocks.END_STONE_SLAB.get()).wall(BVBuildingBlocks.END_STONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.PURPUR_BLOCK).wall(BVBuildingBlocks.PURPUR_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).stairs(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get()).slab(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get()).wall(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get());
        columnStairsSlabWall(blockModels, Blocks.BASALT, BVBuildingBlocks.BASALT_STAIRS.get(), BVBuildingBlocks.BASALT_SLAB.get(), BVBuildingBlocks.BASALT_WALL.get());
        columnStairsSlabWall(blockModels, Blocks.POLISHED_BASALT, BVBuildingBlocks.POLISHED_BASALT_STAIRS.get(), BVBuildingBlocks.POLISHED_BASALT_SLAB.get(), BVBuildingBlocks.POLISHED_BASALT_WALL.get());

        stairsSlabWall(blockModels, Blocks.TERRACOTTA, BVColoredBlocks.TERRACOTTA_STAIRS.get(), BVColoredBlocks.TERRACOTTA_SLAB.get(), BVColoredBlocks.TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.WHITE_TERRACOTTA, BVColoredBlocks.WHITE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.WHITE_TERRACOTTA_SLAB.get(), BVColoredBlocks.WHITE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.ORANGE_TERRACOTTA, BVColoredBlocks.ORANGE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.ORANGE_TERRACOTTA_SLAB.get(), BVColoredBlocks.ORANGE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.MAGENTA_TERRACOTTA, BVColoredBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), BVColoredBlocks.MAGENTA_TERRACOTTA_SLAB.get(), BVColoredBlocks.MAGENTA_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_BLUE_TERRACOTTA, BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.YELLOW_TERRACOTTA, BVColoredBlocks.YELLOW_TERRACOTTA_STAIRS.get(), BVColoredBlocks.YELLOW_TERRACOTTA_SLAB.get(), BVColoredBlocks.YELLOW_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIME_TERRACOTTA, BVColoredBlocks.LIME_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIME_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIME_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PINK_TERRACOTTA, BVColoredBlocks.PINK_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PINK_TERRACOTTA_SLAB.get(), BVColoredBlocks.PINK_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GRAY_TERRACOTTA, BVColoredBlocks.GRAY_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GRAY_TERRACOTTA_SLAB.get(), BVColoredBlocks.GRAY_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_GRAY_TERRACOTTA, BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.CYAN_TERRACOTTA, BVColoredBlocks.CYAN_TERRACOTTA_STAIRS.get(), BVColoredBlocks.CYAN_TERRACOTTA_SLAB.get(), BVColoredBlocks.CYAN_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PURPLE_TERRACOTTA, BVColoredBlocks.PURPLE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PURPLE_TERRACOTTA_SLAB.get(), BVColoredBlocks.PURPLE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLUE_TERRACOTTA, BVColoredBlocks.BLUE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLUE_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLUE_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BROWN_TERRACOTTA, BVColoredBlocks.BROWN_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BROWN_TERRACOTTA_SLAB.get(), BVColoredBlocks.BROWN_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GREEN_TERRACOTTA, BVColoredBlocks.GREEN_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GREEN_TERRACOTTA_SLAB.get(), BVColoredBlocks.GREEN_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.RED_TERRACOTTA, BVColoredBlocks.RED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.RED_TERRACOTTA_SLAB.get(), BVColoredBlocks.RED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLACK_TERRACOTTA, BVColoredBlocks.BLACK_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLACK_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLACK_TERRACOTTA_WALL.get());

        stairsSlabWall(blockModels, Blocks.DRIPSTONE_BLOCK, BVBuildingBlocks.DRIPSTONE_BLOCK_STAIRS.get(), BVBuildingBlocks.DRIPSTONE_BLOCK_SLAB.get(), BVBuildingBlocks.DRIPSTONE_BLOCK_WALL.get());
        stairsSlabWall(blockModels, Blocks.AMETHYST_BLOCK, BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.get(), BVBuildingBlocks.AMETHYST_BLOCK_SLAB.get(), BVBuildingBlocks.AMETHYST_BLOCK_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRACKED_STONE_BRICKS, BVBuildingBlocks.CRACKED_STONE_BRICK_STAIRS.get(), BVBuildingBlocks.CRACKED_STONE_BRICK_SLAB.get(), BVBuildingBlocks.CRACKED_STONE_BRICK_WALL.get());

        logStairsSlab(blockModels, Blocks.STRIPPED_OAK_LOG, BVBuildingBlocks.STRIPPED_OAK_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_SPRUCE_LOG, BVBuildingBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_SPRUCE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_BIRCH_LOG, BVBuildingBlocks.STRIPPED_BIRCH_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_BIRCH_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_JUNGLE_LOG, BVBuildingBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_JUNGLE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_ACACIA_LOG, BVBuildingBlocks.STRIPPED_ACACIA_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_ACACIA_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_DARK_OAK_LOG, BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_MANGROVE_LOG, BVBuildingBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_MANGROVE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_CHERRY_LOG, BVBuildingBlocks.STRIPPED_CHERRY_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_CHERRY_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_PALE_OAK_LOG, BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_SLAB.get());

        logStairsSlab(blockModels, Blocks.OAK_LOG, BVBuildingBlocks.OAK_LOG_STAIRS.get(), BVBuildingBlocks.OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.SPRUCE_LOG, BVBuildingBlocks.SPRUCE_LOG_STAIRS.get(), BVBuildingBlocks.SPRUCE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.BIRCH_LOG, BVBuildingBlocks.BIRCH_LOG_STAIRS.get(), BVBuildingBlocks.BIRCH_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.JUNGLE_LOG, BVBuildingBlocks.JUNGLE_LOG_STAIRS.get(), BVBuildingBlocks.JUNGLE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.ACACIA_LOG, BVBuildingBlocks.ACACIA_LOG_STAIRS.get(), BVBuildingBlocks.ACACIA_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.DARK_OAK_LOG, BVBuildingBlocks.DARK_OAK_LOG_STAIRS.get(), BVBuildingBlocks.DARK_OAK_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.MANGROVE_LOG, BVBuildingBlocks.MANGROVE_LOG_STAIRS.get(), BVBuildingBlocks.MANGROVE_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.CHERRY_LOG, BVBuildingBlocks.CHERRY_LOG_STAIRS.get(), BVBuildingBlocks.CHERRY_LOG_SLAB.get());
        logStairsSlab(blockModels, Blocks.PALE_OAK_LOG, BVBuildingBlocks.PALE_OAK_LOG_STAIRS.get(), BVBuildingBlocks.PALE_OAK_LOG_SLAB.get());

        logStairsSlab(blockModels, Blocks.STRIPPED_CRIMSON_STEM, BVBuildingBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get(), BVBuildingBlocks.STRIPPED_CRIMSON_STEM_SLAB.get());
        logStairsSlab(blockModels, Blocks.STRIPPED_WARPED_STEM, BVBuildingBlocks.STRIPPED_WARPED_STEM_STAIRS.get(), BVBuildingBlocks.STRIPPED_WARPED_STEM_SLAB.get());
        logStairsSlab(blockModels, Blocks.CRIMSON_STEM, BVBuildingBlocks.CRIMSON_STEM_STAIRS.get(), BVBuildingBlocks.CRIMSON_STEM_SLAB.get());
        logStairsSlab(blockModels, Blocks.WARPED_STEM, BVBuildingBlocks.WARPED_STEM_STAIRS.get(), BVBuildingBlocks.WARPED_STEM_SLAB.get());


        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_OAK_LOG, BVBuildingBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_OAK_WOOD, BVBuildingBlocks.STRIPPED_OAK_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_SPRUCE_LOG, BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), Blocks.STRIPPED_SPRUCE_WOOD, BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_BIRCH_LOG, BVBuildingBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), Blocks.STRIPPED_BIRCH_WOOD, BVBuildingBlocks.STRIPPED_BIRCH_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_JUNGLE_LOG, BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), Blocks.STRIPPED_JUNGLE_WOOD, BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_ACACIA_LOG, BVBuildingBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), Blocks.STRIPPED_ACACIA_WOOD, BVBuildingBlocks.STRIPPED_ACACIA_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_DARK_OAK_LOG, BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_DARK_OAK_WOOD, BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_MANGROVE_LOG, BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), Blocks.STRIPPED_MANGROVE_WOOD, BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_CHERRY_LOG, BVBuildingBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), Blocks.STRIPPED_CHERRY_WOOD, BVBuildingBlocks.STRIPPED_CHERRY_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_PALE_OAK_LOG, BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_SLAB.get(), Blocks.STRIPPED_PALE_OAK_WOOD, BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE_GATE.get());
        logStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_BAMBOO_BLOCK, BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get());

        woodStairsSlabWallFenceGate(blockModels, Blocks.OAK_LOG, BVBuildingBlocks.OAK_WOOD_STAIRS.get(), BVBuildingBlocks.OAK_WOOD_SLAB.get(), Blocks.OAK_WOOD, BVBuildingBlocks.OAK_WOOD_WALL.get(), BVBuildingBlocks.OAK_WOOD_FENCE.get(), BVBuildingBlocks.OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.SPRUCE_LOG, BVBuildingBlocks.SPRUCE_WOOD_STAIRS.get(), BVBuildingBlocks.SPRUCE_WOOD_SLAB.get(), Blocks.SPRUCE_WOOD, BVBuildingBlocks.SPRUCE_WOOD_WALL.get(), BVBuildingBlocks.SPRUCE_WOOD_FENCE.get(), BVBuildingBlocks.SPRUCE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.BIRCH_LOG, BVBuildingBlocks.BIRCH_WOOD_STAIRS.get(), BVBuildingBlocks.BIRCH_WOOD_SLAB.get(), Blocks.BIRCH_WOOD, BVBuildingBlocks.BIRCH_WOOD_WALL.get(), BVBuildingBlocks.BIRCH_WOOD_FENCE.get(), BVBuildingBlocks.BIRCH_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.JUNGLE_LOG, BVBuildingBlocks.JUNGLE_WOOD_STAIRS.get(), BVBuildingBlocks.JUNGLE_WOOD_SLAB.get(), Blocks.JUNGLE_WOOD, BVBuildingBlocks.JUNGLE_WOOD_WALL.get(), BVBuildingBlocks.JUNGLE_WOOD_FENCE.get(), BVBuildingBlocks.JUNGLE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.ACACIA_LOG, BVBuildingBlocks.ACACIA_WOOD_STAIRS.get(), BVBuildingBlocks.ACACIA_WOOD_SLAB.get(), Blocks.ACACIA_WOOD, BVBuildingBlocks.ACACIA_WOOD_WALL.get(), BVBuildingBlocks.ACACIA_WOOD_FENCE.get(), BVBuildingBlocks.ACACIA_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.DARK_OAK_LOG, BVBuildingBlocks.DARK_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.DARK_OAK_WOOD_SLAB.get(), Blocks.DARK_OAK_WOOD, BVBuildingBlocks.DARK_OAK_WOOD_WALL.get(), BVBuildingBlocks.DARK_OAK_WOOD_FENCE.get(), BVBuildingBlocks.DARK_OAK_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.MANGROVE_LOG, BVBuildingBlocks.MANGROVE_WOOD_STAIRS.get(), BVBuildingBlocks.MANGROVE_WOOD_SLAB.get(), Blocks.MANGROVE_WOOD, BVBuildingBlocks.MANGROVE_WOOD_WALL.get(), BVBuildingBlocks.MANGROVE_WOOD_FENCE.get(), BVBuildingBlocks.MANGROVE_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.CHERRY_LOG, BVBuildingBlocks.CHERRY_WOOD_STAIRS.get(), BVBuildingBlocks.CHERRY_WOOD_SLAB.get(), Blocks.CHERRY_WOOD, BVBuildingBlocks.CHERRY_WOOD_WALL.get(), BVBuildingBlocks.CHERRY_WOOD_FENCE.get(), BVBuildingBlocks.CHERRY_WOOD_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.PALE_OAK_LOG, BVBuildingBlocks.PALE_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.PALE_OAK_WOOD_SLAB.get(), Blocks.PALE_OAK_WOOD, BVBuildingBlocks.PALE_OAK_WOOD_WALL.get(), BVBuildingBlocks.PALE_OAK_WOOD_FENCE.get(), BVBuildingBlocks.PALE_OAK_WOOD_FENCE_GATE.get());
        logStairsSlabWallFenceGate(blockModels, Blocks.BAMBOO_BLOCK, BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get(), BVBuildingBlocks.BAMBOO_BLOCK_SLAB.get(), BVBuildingBlocks.BAMBOO_BLOCK_WALL.get(), BVBuildingBlocks.BAMBOO_BLOCK_FENCE.get(), BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.get());

        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_CRIMSON_STEM, BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.STRIPPED_WARPED_STEM, BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), Blocks.STRIPPED_WARPED_HYPHAE, BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_WALL.get(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.CRIMSON_STEM, BVBuildingBlocks.CRIMSON_HYPHAE_STAIRS.get(), BVBuildingBlocks.CRIMSON_HYPHAE_SLAB.get(), Blocks.CRIMSON_HYPHAE, BVBuildingBlocks.CRIMSON_HYPHAE_WALL.get(), BVBuildingBlocks.CRIMSON_HYPHAE_FENCE.get(), BVBuildingBlocks.CRIMSON_HYPHAE_FENCE_GATE.get());
        woodStairsSlabWallFenceGate(blockModels, Blocks.WARPED_STEM, BVBuildingBlocks.WARPED_HYPHAE_STAIRS.get(), BVBuildingBlocks.WARPED_HYPHAE_SLAB.get(), Blocks.WARPED_HYPHAE, BVBuildingBlocks.WARPED_HYPHAE_WALL.get(), BVBuildingBlocks.WARPED_HYPHAE_FENCE.get(), BVBuildingBlocks.WARPED_HYPHAE_FENCE_GATE.get());

        stairsSlabWall(blockModels, Blocks.CALCITE, BVBuildingBlocks.CALCITE_STAIRS.get(), BVBuildingBlocks.CALCITE_SLAB.get(), BVBuildingBlocks.CALCITE_WALL.get());
        stairsSlabWall(blockModels, Blocks.SMOOTH_BASALT, BVBuildingBlocks.SMOOTH_BASALT_STAIRS.get(), BVBuildingBlocks.SMOOTH_BASALT_SLAB.get(), BVBuildingBlocks.SMOOTH_BASALT_WALL.get());

        stairsSlabWall(blockModels, Blocks.DEEPSLATE, BVBuildingBlocks.DEEPSLATE_STAIRS.get(), BVBuildingBlocks.DEEPSLATE_SLAB.get(), BVBuildingBlocks.DEEPSLATE_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRACKED_DEEPSLATE_BRICKS, BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRACKED_DEEPSLATE_TILES, BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.NETHER_BRICKS).fenceGate(BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.get());
        stairsSlabWallFenceGate(blockModels, Blocks.CRACKED_NETHER_BRICKS, BVBuildingBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), BVBuildingBlocks.CRACKED_NETHER_BRICK_SLAB.get(), BVBuildingBlocks.CRACKED_NETHER_BRICK_WALL.get(), BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.get(), BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get());
        blockModels.familyWithExistingFullBlock(Blocks.RED_NETHER_BRICKS).fence(BVBuildingBlocks.RED_NETHER_BRICK_FENCE.get()).fenceGate(BVBuildingBlocks.RED_NETHER_BRICK_FENCE_GATE.get());

        stairsSlabWall(blockModels, Blocks.OBSIDIAN, BVBuildingBlocks.OBSIDIAN_STAIRS.get(), BVBuildingBlocks.OBSIDIAN_SLAB.get(), BVBuildingBlocks.OBSIDIAN_WALL.get());
        stairsSlabWall(blockModels, Blocks.CRYING_OBSIDIAN, BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.get(), BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.get(), BVBuildingBlocks.CRYING_OBSIDIAN_WALL.get());

        stairsSlabWall(blockModels, Blocks.WHITE_GLAZED_TERRACOTTA, BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.ORANGE_GLAZED_TERRACOTTA, BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.MAGENTA_GLAZED_TERRACOTTA, BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.YELLOW_GLAZED_TERRACOTTA, BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIME_GLAZED_TERRACOTTA, BVColoredBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIME_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PINK_GLAZED_TERRACOTTA, BVColoredBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.PINK_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GRAY_GLAZED_TERRACOTTA, BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.CYAN_GLAZED_TERRACOTTA, BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.PURPLE_GLAZED_TERRACOTTA, BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLUE_GLAZED_TERRACOTTA, BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BROWN_GLAZED_TERRACOTTA, BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.GREEN_GLAZED_TERRACOTTA, BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.RED_GLAZED_TERRACOTTA, BVColoredBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.RED_GLAZED_TERRACOTTA_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLACK_GLAZED_TERRACOTTA, BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get());

        stairsSlabWall(blockModels, Blocks.WHITE_WOOL, BVColoredBlocks.WHITE_WOOL_STAIRS.get(), BVColoredBlocks.WHITE_WOOL_SLAB.get(), BVColoredBlocks.WHITE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.ORANGE_WOOL, BVColoredBlocks.ORANGE_WOOL_STAIRS.get(), BVColoredBlocks.ORANGE_WOOL_SLAB.get(), BVColoredBlocks.ORANGE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.MAGENTA_WOOL, BVColoredBlocks.MAGENTA_WOOL_STAIRS.get(), BVColoredBlocks.MAGENTA_WOOL_SLAB.get(), BVColoredBlocks.MAGENTA_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_BLUE_WOOL, BVColoredBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_WOOL_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.YELLOW_WOOL, BVColoredBlocks.YELLOW_WOOL_STAIRS.get(), BVColoredBlocks.YELLOW_WOOL_SLAB.get(), BVColoredBlocks.YELLOW_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIME_WOOL, BVColoredBlocks.LIME_WOOL_STAIRS.get(), BVColoredBlocks.LIME_WOOL_SLAB.get(), BVColoredBlocks.LIME_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.PINK_WOOL, BVColoredBlocks.PINK_WOOL_STAIRS.get(), BVColoredBlocks.PINK_WOOL_SLAB.get(), BVColoredBlocks.PINK_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.GRAY_WOOL, BVColoredBlocks.GRAY_WOOL_STAIRS.get(), BVColoredBlocks.GRAY_WOOL_SLAB.get(), BVColoredBlocks.GRAY_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_GRAY_WOOL, BVColoredBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_WOOL_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.CYAN_WOOL, BVColoredBlocks.CYAN_WOOL_STAIRS.get(), BVColoredBlocks.CYAN_WOOL_SLAB.get(), BVColoredBlocks.CYAN_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.PURPLE_WOOL, BVColoredBlocks.PURPLE_WOOL_STAIRS.get(), BVColoredBlocks.PURPLE_WOOL_SLAB.get(), BVColoredBlocks.PURPLE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLUE_WOOL, BVColoredBlocks.BLUE_WOOL_STAIRS.get(), BVColoredBlocks.BLUE_WOOL_SLAB.get(), BVColoredBlocks.BLUE_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.BROWN_WOOL, BVColoredBlocks.BROWN_WOOL_STAIRS.get(), BVColoredBlocks.BROWN_WOOL_SLAB.get(), BVColoredBlocks.BROWN_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.GREEN_WOOL, BVColoredBlocks.GREEN_WOOL_STAIRS.get(), BVColoredBlocks.GREEN_WOOL_SLAB.get(), BVColoredBlocks.GREEN_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.RED_WOOL, BVColoredBlocks.RED_WOOL_STAIRS.get(), BVColoredBlocks.RED_WOOL_SLAB.get(), BVColoredBlocks.RED_WOOL_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLACK_WOOL, BVColoredBlocks.BLACK_WOOL_STAIRS.get(), BVColoredBlocks.BLACK_WOOL_SLAB.get(), BVColoredBlocks.BLACK_WOOL_WALL.get());

        stairsSlabWall(blockModels, Blocks.PACKED_MUD, BVBuildingBlocks.PACKED_MUD_STAIRS.get(), BVBuildingBlocks.PACKED_MUD_SLAB.get(), BVBuildingBlocks.PACKED_MUD_WALL.get());

        stairsSlabWall(blockModels, Blocks.WHITE_CONCRETE, BVColoredBlocks.WHITE_CONCRETE_STAIRS.get(), BVColoredBlocks.WHITE_CONCRETE_SLAB.get(), BVColoredBlocks.WHITE_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_GRAY_CONCRETE, BVColoredBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.GRAY_CONCRETE, BVColoredBlocks.GRAY_CONCRETE_STAIRS.get(), BVColoredBlocks.GRAY_CONCRETE_SLAB.get(), BVColoredBlocks.GRAY_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLACK_CONCRETE, BVColoredBlocks.BLACK_CONCRETE_STAIRS.get(), BVColoredBlocks.BLACK_CONCRETE_SLAB.get(), BVColoredBlocks.BLACK_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.BROWN_CONCRETE, BVColoredBlocks.BROWN_CONCRETE_STAIRS.get(), BVColoredBlocks.BROWN_CONCRETE_SLAB.get(), BVColoredBlocks.BROWN_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.RED_CONCRETE, BVColoredBlocks.RED_CONCRETE_STAIRS.get(), BVColoredBlocks.RED_CONCRETE_SLAB.get(), BVColoredBlocks.RED_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.ORANGE_CONCRETE, BVColoredBlocks.ORANGE_CONCRETE_STAIRS.get(), BVColoredBlocks.ORANGE_CONCRETE_SLAB.get(), BVColoredBlocks.ORANGE_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.YELLOW_CONCRETE, BVColoredBlocks.YELLOW_CONCRETE_STAIRS.get(), BVColoredBlocks.YELLOW_CONCRETE_SLAB.get(), BVColoredBlocks.YELLOW_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIME_CONCRETE, BVColoredBlocks.LIME_CONCRETE_STAIRS.get(), BVColoredBlocks.LIME_CONCRETE_SLAB.get(), BVColoredBlocks.LIME_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.GREEN_CONCRETE, BVColoredBlocks.GREEN_CONCRETE_STAIRS.get(), BVColoredBlocks.GREEN_CONCRETE_SLAB.get(), BVColoredBlocks.GREEN_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.CYAN_CONCRETE, BVColoredBlocks.CYAN_CONCRETE_STAIRS.get(), BVColoredBlocks.CYAN_CONCRETE_SLAB.get(), BVColoredBlocks.CYAN_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.LIGHT_BLUE_CONCRETE, BVColoredBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.BLUE_CONCRETE, BVColoredBlocks.BLUE_CONCRETE_STAIRS.get(), BVColoredBlocks.BLUE_CONCRETE_SLAB.get(), BVColoredBlocks.BLUE_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.PURPLE_CONCRETE, BVColoredBlocks.PURPLE_CONCRETE_STAIRS.get(), BVColoredBlocks.PURPLE_CONCRETE_SLAB.get(), BVColoredBlocks.PURPLE_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.MAGENTA_CONCRETE, BVColoredBlocks.MAGENTA_CONCRETE_STAIRS.get(), BVColoredBlocks.MAGENTA_CONCRETE_SLAB.get(), BVColoredBlocks.MAGENTA_CONCRETE_WALL.get());
        stairsSlabWall(blockModels, Blocks.PINK_CONCRETE, BVColoredBlocks.PINK_CONCRETE_STAIRS.get(), BVColoredBlocks.PINK_CONCRETE_SLAB.get(), BVColoredBlocks.PINK_CONCRETE_WALL.get());
    }

    private static void stairsSlabWall(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).slab(slab).wall(wall);
    }

    private static void stairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).slab(slab).wall(wall).fence(fence).fenceGate(gate);
    }

    public static void woodStairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, Block doubleSlap, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
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

    public static void logStairsSlab(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab) {
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

    public static TextureMapping logTextureMapping(Block log) {
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
        blockModels.blockStateOutput.accept(BlockModelGenerators.createStairs(stairsBlock, BlockModelGenerators.plainVariant(innerModel), BlockModelGenerators.plainVariant(straightModel), BlockModelGenerators.plainVariant(outerModel)));
        blockModels.registerSimpleItemModel(stairsBlock, straightModel);
    }

    public static void customSlab(BlockModelGenerators blockModels, Block slabBlock, Block doubleSlab, TextureMapping mapping) {
        var bottomModel = ModelTemplates.SLAB_BOTTOM.create(slabBlock, mapping, blockModels.modelOutput);
        var topModel = ModelTemplates.SLAB_TOP.create(slabBlock, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSlab(slabBlock, BlockModelGenerators.plainVariant(bottomModel), BlockModelGenerators.plainVariant(topModel), BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(doubleSlab))));
        blockModels.registerSimpleItemModel(slabBlock, bottomModel);
    }

    public static void customWall(BlockModelGenerators blockModels, Block wallBlock, TextureMapping mapping) {
        var postModel = ModelTemplates.WALL_POST.create(wallBlock, mapping, blockModels.modelOutput);
        var lowModel = ModelTemplates.WALL_LOW_SIDE.create(wallBlock, mapping, blockModels.modelOutput);
        var tallModel = ModelTemplates.WALL_TALL_SIDE.create(wallBlock, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createWall(wallBlock, BlockModelGenerators.plainVariant(postModel), BlockModelGenerators.plainVariant(lowModel), BlockModelGenerators.plainVariant(tallModel)));
        ResourceLocation inventoryModel = ModelTemplates.WALL_INVENTORY.create(wallBlock, mapping, blockModels.modelOutput);
        blockModels.registerSimpleItemModel(wallBlock, inventoryModel);
    }
}
