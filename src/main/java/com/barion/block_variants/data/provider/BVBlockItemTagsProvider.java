package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.*;
import net.minecraft.data.BlockFamily;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.*;

import java.util.function.Supplier;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWooden;

public abstract class BVBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {
    {
        blockItemTagProviderRules.add((block, name) -> {
            if (block.get() instanceof WallBlock && isWooden(name)) {
                tag(BVTags.Blocks.WOODEN_WALLS, BVTags.Items.WOODEN_WALLS).add(block.get());
            }
        });

        blockItemTagProviderRules.add((block, id) -> {
            if (id.contains("bamboo_block")) {
                if (block.get() instanceof StairBlock) {
                    tag(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS).add(block.get());
                }
                if (block.get() instanceof SlabBlock) {
                    tag(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS).add(block.get());
                }
                if (block.get() instanceof WallBlock) {
                    tag(BVTags.Blocks.WOODEN_WALLS, BVTags.Items.WOODEN_WALLS).add(block.get());
                }
                if (block.get() instanceof FenceBlock) {
                    tag(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES).add(block.get());
                }
                if (block.get() instanceof FenceGateBlock) {
                    tag(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES).add(block.get());
                }
            }
        });

        blockItemTagProviderRules.add((block, name) -> {
            if (!name.contains("wool")) return;
            if (name.contains("_stairs")) {
                tag(BVTags.Blocks.WOOL_STAIRS, BVTags.Items.WOOL_STAIRS).add(block.get());
            } else if (name.contains("_slab")) {
                tag(BVTags.Blocks.WOOL_SLABS, BVTags.Items.WOOL_SLABS).add(block.get());
            } else if (name.contains("_wall")) {
                tag(BVTags.Blocks.WOOL_WALLS, BVTags.Items.WOOL_WALLS).add(block.get());
            } else {
                throw new RuntimeException("unknown wool type");
            }
        });
    }


    @Override
    protected void run() {
        runRules(BlockVariants.getAllBlocks());
        BVBlockFamilies.MAP.forEach((_, family) -> tagBlockFamily(family));

        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.SMOOTH_SANDSTONE_WALL.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.SMOOTH_RED_SANDSTONE_WALL.get());

        tagVariant(BlockFamily.Variant.STAIRS, BVOtherBlocks.CUT_SANDSTONE_STAIRS.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.CUT_SANDSTONE_WALL.get());
        tagVariant(BlockFamily.Variant.STAIRS, BVOtherBlocks.CUT_RED_SANDSTONE_STAIRS.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.CUT_RED_SANDSTONE_WALL.get());

        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.POLISHED_ANDESITE_WALL.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.POLISHED_DIORITE_WALL.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.POLISHED_GRANITE_WALL.get());

        tagVariant(BlockFamily.Variant.WALL, BVBuildingBlocks.QUARTZ_WALL.get());
        tagVariant(BlockFamily.Variant.WALL, BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.STONE_WALL.get());
        tagVariant(BlockFamily.Variant.STAIRS, BVOtherBlocks.SMOOTH_STONE_STAIRS.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.SMOOTH_STONE_WALL.get());

        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.PRISMARINE_BRICK_WALL.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.DARK_PRISMARINE_WALL.get());
        tagVariant(BlockFamily.Variant.WALL, BVOtherBlocks.PURPUR_WALL.get());

        tagVariant(BlockFamily.Variant.FENCE, BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.get());
        tagVariant(BlockFamily.Variant.FENCE_GATE, BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.get());
        tagVariant(BlockFamily.Variant.FENCE_GATE, BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get());

        tagColorCollection(BVColoredBlocks.WOOL_WALL);
        tagColorCollection(BVColoredBlocks.CONCRETE_WALL);
        tagColorCollection(BVColoredBlocks.DYED_TERRACOTTA_STAIRS);
        tagColorCollection(BVColoredBlocks.DYED_TERRACOTTA_SLAB);
        tagColorCollection(BVColoredBlocks.DYED_TERRACOTTA_WALL);
        tagColorCollection(BVColoredBlocks.GLAZED_TERRACOTTA_STAIRS);
        tagColorCollection(BVColoredBlocks.GLAZED_TERRACOTTA_SLAB);
        tagColorCollection(BVColoredBlocks.GLAZED_TERRACOTTA_WALL);

        tag(BlockTags.WALLS, ItemTags.WALLS)
                .addTag(BVTags.Blocks.WOODEN_WALLS)
                .addTag(BVTags.Blocks.WOOL_WALLS)
                .addTag(BVTags.Blocks.CONCRETE_WALLS)
        ;

        tag(BVTags.Blocks.CONCRETE_WALLS, BVTags.Items.CONCRETE_WALLS)
                .addAll(BVColoredBlocks.CONCRETE_WALL.asList().stream().map(Supplier::get))
        ;

        // this includes mineable with pickaxe
        tag(BlockTags.BARS, ItemTags.BARS).add(
                BVOtherBlocks.GOLD_BARS.get()
        );

        // this includes mineable with pickaxe
        tag(BlockTags.CHAINS, ItemTags.CHAINS).add(
                BVOtherBlocks.GOLD_CHAIN.get()
        );
    }
}
