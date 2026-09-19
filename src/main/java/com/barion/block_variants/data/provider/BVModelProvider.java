package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlockFamilies;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVColoredBlocks;
import com.barion.block_variants.registry.BVOtherBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.*;

public final class BVModelProvider extends ExtendedModelProvider {
    public BVModelProvider(PackOutput output) {
        super(output, BlockVariants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_GRANITE).wall(BVOtherBlocks.POLISHED_GRANITE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_DIORITE).wall(BVOtherBlocks.POLISHED_DIORITE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_ANDESITE).wall(BVOtherBlocks.POLISHED_ANDESITE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.STONE).wall(BVOtherBlocks.STONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.SMOOTH_STONE).wall(BVOtherBlocks.SMOOTH_STONE_WALL.get());
        customStairs(blockModels, BVOtherBlocks.SMOOTH_STONE_STAIRS.get(), TextureMapping.cube(Blocks.SMOOTH_STONE).put(TextureSlot.SIDE, new Material(Identifier.withDefaultNamespace("block/smooth_stone_slab_side"))));

        blockModels.familyWithExistingFullBlock(Blocks.CUT_SANDSTONE).wall(BVBuildingBlocks.CUT_SANDSTONE_WALL.get());
        customStairs(blockModels, BVBuildingBlocks.CUT_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE));
        blockModels.familyWithExistingFullBlock(Blocks.CUT_RED_SANDSTONE).wall(BVBuildingBlocks.CUT_RED_SANDSTONE_WALL.get());
        customStairs(blockModels, BVBuildingBlocks.CUT_RED_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE));

        customWall(blockModels, BVBuildingBlocks.QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, new Material(Identifier.withDefaultNamespace("block/quartz_block_top"))));
        blockModels.familyWithExistingFullBlock(Blocks.QUARTZ_BRICKS).stairs(BVBuildingBlocks.QUARTZ_BRICK_STAIRS.get()).slab(BVBuildingBlocks.QUARTZ_BRICK_SLAB.get()).wall(BVBuildingBlocks.QUARTZ_BRICK_WALL.get());
        customWall(blockModels, BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, new Material(Identifier.withDefaultNamespace("block/quartz_block_bottom"))));
        blockModels.familyWithExistingFullBlock(Blocks.CHISELED_QUARTZ_BLOCK).stairs(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get()).slab(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get()).wall(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.PRISMARINE_BRICKS).wall(BVOtherBlocks.PRISMARINE_BRICK_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.DARK_PRISMARINE).wall(BVOtherBlocks.DARK_PRISMARINE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.NETHERRACK).stairs(BVBuildingBlocks.NETHERRACK_STAIRS.get()).slab(BVBuildingBlocks.NETHERRACK_SLAB.get()).wall(BVBuildingBlocks.NETHERRACK_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.END_STONE).stairs(BVBuildingBlocks.END_STONE_STAIRS.get()).slab(BVBuildingBlocks.END_STONE_SLAB.get()).wall(BVBuildingBlocks.END_STONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.PURPUR_BLOCK).wall(BVOtherBlocks.PURPUR_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).generateFor(BVBlockFamilies.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        blockModels.familyWithExistingFullBlock(Blocks.BASALT, BVModelProvider::columnTopSideTextureMapping).generateFor(BVBlockFamilies.BASALT);
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_BASALT, BVModelProvider::columnTopSideTextureMapping).generateFor(BVBlockFamilies.POLISHED_BASALT);

        blockModels.familyWithExistingFullBlock(Blocks.TERRACOTTA).generateFor(BVBlockFamilies.TERRACOTTA);
        BVBlockFamilies.DYED_TERRACOTTA.forEach(family -> blockModels.familyWithExistingFullBlock(family.getBaseBlock()).generateFor(family));

        blockModels.familyWithExistingFullBlock(Blocks.DRIPSTONE_BLOCK).generateFor(BVBlockFamilies.DRIPSTONE_BLOCK);
        blockModels.familyWithExistingFullBlock(Blocks.AMETHYST_BLOCK).generateFor(BVBlockFamilies.AMETHYST_BLOCK);
        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_STONE_BRICKS).generateFor(BVBlockFamilies.CRACKED_STONE_BRICKS);


        BVBlockFamilies.LOG_FAMILIES.forEach(family -> {
            blockModels.familyWithExistingFullBlock(family.getBaseBlock(), BVModelProvider::logTextureMapping).generateFor(family);
        });

        BVBlockFamilies.WOOD_FAMILIES.forEach(family -> {
            var textureBase = family.get(BlockFamily.Variant.LOG);
            var texture = TextureMapping.getBlockTexture(textureBase);
            var mapping = new TextureMapping()
                    .put(TextureSlot.ALL, texture)
                    .put(TextureSlot.SIDE, texture)
                    .put(TextureSlot.TOP, texture)
                    .put(TextureSlot.BOTTOM, texture);
            blockModels.familyWithExistingFullBlock(family.getBaseBlock(), mapping).generateFor(family);
        });

        blockModels.familyWithExistingFullBlock(BVBlockFamilies.BAMBOO_BLOCK.getBaseBlock(), BVModelProvider::logTextureMapping).generateFor(BVBlockFamilies.BAMBOO_BLOCK);
        blockModels.familyWithExistingFullBlock(BVBlockFamilies.STRIPPED_BAMBOO_BLOCK.getBaseBlock(), BVModelProvider::logTextureMapping).generateFor(BVBlockFamilies.STRIPPED_BAMBOO_BLOCK);

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

        BVBlockFamilies.GLAZED_TERRACOTTA.forEach(family -> blockModels.familyWithExistingFullBlock(family.getBaseBlock()).generateFor(family));

        ColorCollection.VALUES.forEach(color -> blockModels.familyWithExistingFullBlock(Blocks.WOOL.pick(color)).wall(BVColoredBlocks.WOOL_WALL.pick(color).get()));

        stairsSlabWall(blockModels, Blocks.PACKED_MUD, BVBuildingBlocks.PACKED_MUD_STAIRS.get(), BVBuildingBlocks.PACKED_MUD_SLAB.get(), BVBuildingBlocks.PACKED_MUD_WALL.get());

        ColorCollection.VALUES.forEach(color -> blockModels.familyWithExistingFullBlock(Blocks.CONCRETE.pick(color)).wall(BVColoredBlocks.CONCRETE_WALL.pick(color).get()));

        createBarsAndItem(blockModels, BVOtherBlocks.GOLD_BARS.get());
        createChain(blockModels, BVOtherBlocks.GOLD_CHAIN.get());
        blockModels.createTrivialBlock(BVOtherBlocks.GOLD_GRATE.get(), TexturedModel.CUBE);
    }

    public static void createBarsAndItem(BlockModelGenerators blockModels, Block block) {
        var texturemapping = TextureMapping.bars(block);
        blockModels.createBars(
                block,
                ModelTemplates.BARS_POST_ENDS.create(block, texturemapping, blockModels.modelOutput),
                ModelTemplates.BARS_POST.create(block, texturemapping, blockModels.modelOutput),
                ModelTemplates.BARS_CAP.create(block, texturemapping, blockModels.modelOutput),
                ModelTemplates.BARS_CAP_ALT.create(block, texturemapping, blockModels.modelOutput),
                ModelTemplates.BARS_POST_SIDE.create(block, texturemapping, blockModels.modelOutput),
                ModelTemplates.BARS_POST_SIDE_ALT.create(block, texturemapping, blockModels.modelOutput)
        );
        blockModels.registerSimpleFlatItemModel(block);
    }

    public static void createChain(BlockModelGenerators blockModels, Block block) {
        blockModels.createAxisAlignedPillarBlockCustomModel(block, BlockModelGenerators.plainVariant(TexturedModel.CHAIN.create(block, blockModels.modelOutput)));
        blockModels.registerSimpleFlatItemModel(block.asItem());
    }

    private static void stairsSlabWall(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).slab(slab).wall(wall);
    }

    private static void stairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).slab(slab).wall(wall).fence(fence).fenceGate(gate);
    }

    public static void woodStairsSlabWallFenceGate(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, Block doubleSlab, WallBlock wall, FenceBlock fence, FenceGateBlock gate) {
        blockModels.familyWithExistingFullBlock(base).stairs(stair).wall(wall).fence(fence).fenceGate(gate);
        customSlab(blockModels, slab, doubleSlab, new TextureMapping()
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

    private static void columnStairsSlabWall(BlockModelGenerators blockModels, Block base, StairBlock stair, SlabBlock slab, WallBlock wall) {
        var mapping = columnTopSideTextureMapping(base);
        customStairs(blockModels, stair, mapping);
        customSlab(blockModels, slab, base, mapping);
        customWall(blockModels, wall, mapping);
    }

    public static TextureMapping logTextureMapping(Block log) {
        return new TextureMapping()
                .put(TextureSlot.WALL, TextureMapping.getBlockTexture(log))
                .put(TextureSlot.TEXTURE, TextureMapping.getBlockTexture(log))
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

    public static TextureMapping columnTopSideTextureMapping(Block log) {
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
        Identifier inventoryModel = ModelTemplates.WALL_INVENTORY.create(wallBlock, mapping, blockModels.modelOutput);
        blockModels.registerSimpleItemModel(wallBlock, inventoryModel);
    }

    public static void customFence(BlockModelGenerators blockModels, Block fenceBlock, TextureMapping mapping) {
        var post = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_POST.create(fenceBlock, mapping, blockModels.modelOutput));
        var side = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_SIDE.create(fenceBlock, mapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFence(fenceBlock, post, side));
        var identifier = ModelTemplates.FENCE_INVENTORY.create(fenceBlock, mapping, blockModels.modelOutput);
        blockModels.registerSimpleItemModel(fenceBlock, identifier);
    }

    public static void customFenceGate(BlockModelGenerators blockModels, Block fenceGateBlock, TextureMapping mapping) {
        var open = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_OPEN.create(fenceGateBlock, mapping, blockModels.modelOutput));
        var closed = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_CLOSED.create(fenceGateBlock, mapping, blockModels.modelOutput));
        var wall_open = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGateBlock, mapping, blockModels.modelOutput));
        var wall_closed = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGateBlock, mapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFenceGate(fenceGateBlock, open, closed, wall_open, wall_closed, true));
    }
}
