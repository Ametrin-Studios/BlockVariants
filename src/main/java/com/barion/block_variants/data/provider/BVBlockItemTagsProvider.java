package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlockItemIds;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.references.BlockItemId;
import net.minecraft.tags.BlockItemTagId;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import java.util.function.Function;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWooden;

public class BVBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {
    {
        blockItemTagProviderRules.add((block, id) -> {
            final var name = id.block().identifier().getPath();
            if (block.get() instanceof WallBlock && (isWooden(name) || name.contains("bamboo_block"))) {
                tag(BVTags.BlockItems.WOODEN_WALLS).add(id);
            }
        });

        blockItemTagProviderRules.add((block, id) -> {
            if (id.block().identifier().getPath().contains("bamboo_block")) {
                if (block.get() instanceof StairBlock) {
                    tag(BlockItemTags.WOODEN_STAIRS).add(id);
                }
                if (block.get() instanceof SlabBlock) {
                    tag(BlockItemTags.WOODEN_SLABS).add(id);
                }
                if (block.get() instanceof FenceBlock) {
                    tag(BlockItemTags.WOODEN_FENCES).add(id);
                }
                if (block.get() instanceof FenceBlock) {
                    tag(BlockItemTags.WOODEN_FENCES).add(id);
                }
            }
        });

        blockItemTagProviderRules.add((block, id) -> {
            final var name = id.block().identifier().getPath();
            if (!name.contains("wool")) return;
            tag(BlockItemTags.DAMPENS_VIBRATIONS).add(id);

            if (name.contains("wall")) {
                tag(BVTags.BlockItems.WOOL_WALLS).add(id);
            } else {
                throw new RuntimeException("unknown wool time");
            }
        });
    }

    protected BVBlockItemTagsProvider(Function<BlockItemTagId, CombinedAppender> tagSupplier) {
        super(tagSupplier);
    }

    @Override
    protected void run() {
        runRules(BlockVariants.getAllBlocks());

        tagColorCollection(BVBlockItemIds.WOOL_WALL);
        tagColorCollection(BVBlockItemIds.CONCRETE_WALL);
        tagColorCollection(BVBlockItemIds.DYED_TERRACOTTA_STAIRS);
        tagColorCollection(BVBlockItemIds.DYED_TERRACOTTA_SLAB);
        tagColorCollection(BVBlockItemIds.DYED_TERRACOTTA_WALL);
        tagColorCollection(BVBlockItemIds.GLAZED_TERRACOTTA_STAIRS);
        tagColorCollection(BVBlockItemIds.GLAZED_TERRACOTTA_SLAB);
        tagColorCollection(BVBlockItemIds.GLAZED_TERRACOTTA_WALL);

        tag(BlockItemTags.WALLS)
                .addTag(BVTags.BlockItems.WOODEN_WALLS)
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
