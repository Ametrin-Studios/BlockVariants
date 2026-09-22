package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.DataProviderExtensions;
import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlockFamilies;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVOtherBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public final class BVModelProvider extends ExtendedModelProvider {
    public static final ModelTemplate LOG_STAIRS_STRAIGHT = ModelTemplates.create("block_variants:log_stairs", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate LOG_STAIRS_INNER = ModelTemplates.create("block_variants:inner_log_stairs", "_inner", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate LOG_STAIRS_OUTER = ModelTemplates.create("block_variants:outer_log_stairs", "_outer", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);

    static {
        BlockModelGenerators.SHAPE_CONSUMERS.put(BlockFamily.Variant.STAIRS, BVModelProvider::stairsOverwrite);
    }

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

        blockModels.familyWithExistingFullBlock(Blocks.SMOOTH_SANDSTONE, new TextureMapping().put(TextureSlot.ALL, TextureMapping.getBlockTexture(Blocks.SANDSTONE, "_top"))).wall(BVOtherBlocks.SMOOTH_SANDSTONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.SMOOTH_RED_SANDSTONE, new TextureMapping().put(TextureSlot.ALL, TextureMapping.getBlockTexture(Blocks.RED_SANDSTONE, "_top"))).wall(BVOtherBlocks.SMOOTH_RED_SANDSTONE_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.CUT_SANDSTONE).wall(BVOtherBlocks.CUT_SANDSTONE_WALL.get());
        customStairs(blockModels, BVOtherBlocks.CUT_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE));
        blockModels.familyWithExistingFullBlock(Blocks.CUT_RED_SANDSTONE).wall(BVOtherBlocks.CUT_RED_SANDSTONE_WALL.get());
        customStairs(blockModels, BVOtherBlocks.CUT_RED_SANDSTONE_STAIRS.get(), sandstoneTextureMapping(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE));

        customWall(blockModels, BVBuildingBlocks.QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, new Material(Identifier.withDefaultNamespace("block/quartz_block_top"))));
        blockModels.familyWithExistingFullBlock(Blocks.QUARTZ_BRICKS).generateFor(BVBlockFamilies.QUARTZ_BRICKS);
        customWall(blockModels, BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(), new TextureMapping().put(TextureSlot.WALL, new Material(Identifier.withDefaultNamespace("block/quartz_block_bottom"))));
        blockModels.familyWithExistingFullBlock(Blocks.CHISELED_QUARTZ_BLOCK).generateFor(BVBlockFamilies.CHISELED_QUARTZ_BLOCK);

        blockModels.familyWithExistingFullBlock(Blocks.PRISMARINE_BRICKS).wall(BVOtherBlocks.PRISMARINE_BRICK_WALL.get());
        blockModels.familyWithExistingFullBlock(Blocks.DARK_PRISMARINE).wall(BVOtherBlocks.DARK_PRISMARINE_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.NETHERRACK).generateFor(BVBlockFamilies.NETHERRACK);
        blockModels.familyWithExistingFullBlock(Blocks.END_STONE).generateFor(BVBlockFamilies.END_STONE);
        blockModels.familyWithExistingFullBlock(Blocks.PURPUR_BLOCK).wall(BVOtherBlocks.PURPUR_WALL.get());

        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).generateFor(BVBlockFamilies.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        blockModels.familyWithExistingFullBlock(Blocks.BASALT, BVModelProvider::columnTopSideTextureMapping).generateFor(BVBlockFamilies.BASALT);
        blockModels.familyWithExistingFullBlock(Blocks.POLISHED_BASALT, BVModelProvider::columnTopSideTextureMapping).generateFor(BVBlockFamilies.POLISHED_BASALT);

        blockModels.familyWithExistingFullBlock(Blocks.TERRACOTTA).generateFor(BVBlockFamilies.TERRACOTTA);
        BVBlockFamilies.DYED_TERRACOTTA.forEach(family -> blockModels.familyWithExistingFullBlock(family.getBaseBlock()).generateFor(family));

        blockModels.familyWithExistingFullBlock(Blocks.DRIPSTONE_BLOCK).generateFor(BVBlockFamilies.DRIPSTONE_BLOCK);
        blockModels.familyWithExistingFullBlock(Blocks.AMETHYST_BLOCK).generateFor(BVBlockFamilies.AMETHYST_BLOCK);
        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_STONE_BRICKS).generateFor(BVBlockFamilies.CRACKED_STONE_BRICKS);

        createWoodenExisting(blockModels, BVBlockFamilies.LOG, BVBlockFamilies.WOOD);
        createWoodenExisting(blockModels, BVBlockFamilies.STRIPPED_LOG, BVBlockFamilies.STRIPPED_WOOD);
        createWoodenExisting(blockModels, BVBlockFamilies.STEM, BVBlockFamilies.HYPHAE);
        createWoodenExisting(blockModels, BVBlockFamilies.STRIPPED_STEM, BVBlockFamilies.STRIPPED_HYPHAE);

        blockModels.familyWithExistingFullBlock(BVBlockFamilies.BAMBOO_BLOCK.getBaseBlock(), ExtendedModelProvider::logTextureMapping).generateFor(BVBlockFamilies.BAMBOO_BLOCK);
        blockModels.familyWithExistingFullBlock(BVBlockFamilies.STRIPPED_BAMBOO_BLOCK.getBaseBlock(), ExtendedModelProvider::logTextureMapping).generateFor(BVBlockFamilies.STRIPPED_BAMBOO_BLOCK);

        blockModels.familyWithExistingFullBlock(Blocks.CALCITE).generateFor(BVBlockFamilies.CALCITE);
        blockModels.familyWithExistingFullBlock(Blocks.SMOOTH_BASALT).generateFor(BVBlockFamilies.SMOOTH_BASALT);

        blockModels.familyWithExistingFullBlock(Blocks.DEEPSLATE).generateFor(BVBlockFamilies.DEEPSLATE);
        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_DEEPSLATE_BRICKS).generateFor(BVBlockFamilies.CRACKED_DEEPSLATE_BRICKS);
        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_DEEPSLATE_TILES).generateFor(BVBlockFamilies.CRACKED_DEEPSLATE_TILES);

        blockModels.familyWithExistingFullBlock(Blocks.NETHER_BRICKS).fenceGate(BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.get());
        blockModels.familyWithExistingFullBlock(Blocks.CRACKED_NETHER_BRICKS).generateFor(BVBlockFamilies.CRACKED_NETHER_BRICKS).fence(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.get()).fenceGate(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get());
        blockModels.familyWithExistingFullBlock(Blocks.RED_NETHER_BRICKS).generateFor(BVBlockFamilies.RED_NETHER_BRICKS);

        blockModels.familyWithExistingFullBlock(Blocks.OBSIDIAN).generateFor(BVBlockFamilies.OBSIDIAN);
        blockModels.familyWithExistingFullBlock(Blocks.CRYING_OBSIDIAN).generateFor(BVBlockFamilies.CRYING_OBSIDIAN);

        BVBlockFamilies.GLAZED_TERRACOTTA.forEach(family -> blockModels.familyWithExistingFullBlock(family.getBaseBlock()).generateFor(family));

        BVBlockFamilies.WOOL.forEach(family -> blockModels.familyWithExistingFullBlock(family.getBaseBlock()).generateFor(family));

        blockModels.familyWithExistingFullBlock(Blocks.PACKED_MUD).generateFor(BVBlockFamilies.PACKED_MUD);

        BVBlockFamilies.CONCRETE.forEach(family -> blockModels.familyWithExistingFullBlock(family.getBaseBlock()).generateFor(family));

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

    public static void createWoodenExisting(BlockModelGenerators blockModels, WoodTypeCollection<BlockFamily> logs, WoodTypeCollection<BlockFamily> woods) {
        WoodTypeCollection.zipCommonApply(logs, woods, (_, log, wood) -> createWoodenExisting(blockModels, log, wood));
    }

    public static void createWoodenExisting(BlockModelGenerators blockModels, BlockFamily log, BlockFamily wood) {
        blockModels.familyWithExistingFullBlock(log.getBaseBlock(), ExtendedModelProvider::logTextureMapping).generateFor(log);
        var mapping = TextureMapping.cube(log.getBaseBlock());
        blockModels.familyWithExistingFullBlock(wood.getBaseBlock(), mapping).generateFor(wood);
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

    public static void stairsOverwrite(BlockModelGenerators.BlockFamilyProvider provider, Block stairs) {
        var name = DataProviderExtensions.getBlockName(stairs);
        if (name.contains("_log_") || name.contains("_stem_")) {
            logStairs(provider.blockModels(), provider, stairs);
        } else {
            provider.stairs(stairs);
        }
    }

    public static void logStairs(BlockModelGenerators blockModels, BlockModelGenerators.BlockFamilyProvider provider, Block stairs) {
        var inner = BlockModelGenerators.plainVariant(provider.getOrCreateModel(LOG_STAIRS_INNER, stairs));
        var straight = provider.getOrCreateModel(LOG_STAIRS_STRAIGHT, stairs);
        var outer = BlockModelGenerators.plainVariant(provider.getOrCreateModel(LOG_STAIRS_OUTER, stairs));
        blockModels.blockStateOutput
                .accept(BlockModelGenerators.createStairs(stairs, inner, BlockModelGenerators.plainVariant(straight), outer));
        blockModels.registerSimpleItemModel(stairs, straight);
    }

    public static void customWall(BlockModelGenerators blockModels, Block wallBlock, TextureMapping mapping) {
        var postModel = ModelTemplates.WALL_POST.create(wallBlock, mapping, blockModels.modelOutput);
        var lowModel = ModelTemplates.WALL_LOW_SIDE.create(wallBlock, mapping, blockModels.modelOutput);
        var tallModel = ModelTemplates.WALL_TALL_SIDE.create(wallBlock, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createWall(wallBlock, BlockModelGenerators.plainVariant(postModel), BlockModelGenerators.plainVariant(lowModel), BlockModelGenerators.plainVariant(tallModel)));
        Identifier inventoryModel = ModelTemplates.WALL_INVENTORY.create(wallBlock, mapping, blockModels.modelOutput);
        blockModels.registerSimpleItemModel(wallBlock, inventoryModel);
    }
}
