package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.*;
import net.minecraft.data.BlockFamily;
import net.minecraft.references.BlockItemId;
import net.minecraft.tags.BlockItemTagId;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.world.level.block.*;

import java.util.function.Function;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.getBlockItemId;

public class BVBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {
    {
        blockItemTagProviderRules.add((block, id) -> {
            if (id.block().identifier().getPath().contains("bamboo_block")) {
                if (block.get() instanceof StairBlock) {
                    tag(BlockItemTags.WOODEN_STAIRS).add(id);
                }
                if (block.get() instanceof SlabBlock) {
                    tag(BlockItemTags.WOODEN_SLABS).add(id);
                }
                if (block.get() instanceof WallBlock) {
                    tag(BVTags.BlockItems.WOODEN_WALLS).add(id);
                }
                if (block.get() instanceof FenceBlock) {
                    tag(BlockItemTags.WOODEN_FENCES).add(id);
                }
                if (block.get() instanceof FenceGateBlock) {
                    tag(BlockItemTags.FENCE_GATES).add(id);
                }
            }
        });
    }

    protected BVBlockItemTagsProvider(Function<BlockItemTagId, CombinedAppender> tagSupplier) {
        super(tagSupplier);
    }

    @Override
    protected void run() {
        runRules(BlockVariants.getAllBlocks());
        BVBlockFamilies.MAP.values().forEach(this::tagBlockFamily);

        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.SMOOTH_SANDSTONE_WALL));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.SMOOTH_RED_SANDSTONE_WALL));

        tagVariant(BlockFamily.Variant.STAIRS, getBlockItemId(BVOtherBlocks.CUT_SANDSTONE_STAIRS));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.CUT_SANDSTONE_WALL));
        tagVariant(BlockFamily.Variant.STAIRS, getBlockItemId(BVOtherBlocks.CUT_RED_SANDSTONE_STAIRS));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.CUT_RED_SANDSTONE_WALL));

        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.POLISHED_ANDESITE_WALL));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.POLISHED_DIORITE_WALL));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.POLISHED_GRANITE_WALL));

        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVBuildingBlocks.QUARTZ_WALL));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVBuildingBlocks.SMOOTH_QUARTZ_WALL));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.STONE_WALL));
        tagVariant(BlockFamily.Variant.STAIRS, getBlockItemId(BVOtherBlocks.SMOOTH_STONE_STAIRS));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.SMOOTH_STONE_WALL));

        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.PRISMARINE_BRICK_WALL));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.DARK_PRISMARINE_WALL));
        tagVariant(BlockFamily.Variant.WALL, getBlockItemId(BVOtherBlocks.PURPUR_WALL));

        tagVariant(BlockFamily.Variant.FENCE, getBlockItemId(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE));
        tagVariant(BlockFamily.Variant.FENCE_GATE, getBlockItemId(BVBuildingBlocks.NETHER_BRICK_FENCE_GATE));
        tagVariant(BlockFamily.Variant.FENCE_GATE, getBlockItemId(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE));

        tag(BVTags.BlockItems.WOOL_WALLS).addAll(BVBlockItemIds.WOOL_WALL.asList());
        tagColorCollection(BVBlockItemIds.WOOL_WALL);
        tagColorCollection(BVBlockItemIds.CONCRETE_WALL);
        tagColorCollection(BVBlockItemIds.DYED_TERRACOTTA_STAIRS);
        tagColorCollection(BVBlockItemIds.DYED_TERRACOTTA_SLAB);
        tagColorCollection(BVBlockItemIds.DYED_TERRACOTTA_WALL);
        tagColorCollection(BVBlockItemIds.GLAZED_TERRACOTTA_STAIRS);
        tagColorCollection(BVBlockItemIds.GLAZED_TERRACOTTA_SLAB);
        tagColorCollection(BVBlockItemIds.GLAZED_TERRACOTTA_WALL);

        tag(BVTags.BlockItems.WOODEN_WALLS).addAll(BVBlockItemIds.ALL_WOODEN.stream().filter(c -> c.stream().findFirst().orElseThrow().item().identifier().getPath().contains("_wall")).flatMap(WoodTypeCollection::stream));

        tag(BlockItemTags.WALLS)
                .addTag(BVTags.BlockItems.WOODEN_WALLS)
                .addTag(BVTags.BlockItems.WOOL_WALLS)
                .addTag(BVTags.BlockItems.CONCRETE_WALLS)
        ;

        tag(BVTags.BlockItems.CONCRETE_WALLS)
                .addAll(BVBlockItemIds.CONCRETE_WALL.asList())
        ;

        // this includes mineable with pickaxe
        tag(BlockItemTags.BARS).add(
                BlockItemId.create(BVOtherBlocks.GOLD_BARS.getKey().identifier(), BVOtherBlocks.GOLD_BARS.getKey().identifier())
        );

        // this includes mineable with pickaxe
        tag(BlockItemTags.CHAINS).add(
                BlockItemId.create(BVOtherBlocks.GOLD_CHAIN.getKey().identifier(), BVOtherBlocks.GOLD_CHAIN.getKey().identifier())
        );
    }
}
