package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWooden;

public abstract class BVBlockItemTagsProvider extends ExtendedBlockItemTagsProvider {
    {
        blockItemTagProviderRules.add((block, name) -> {
            if (block instanceof WallBlock && (isWooden(name) || name.contains("bamboo_block"))) {
                tag(BVTags.Blocks.WOODEN_WALLS, BVTags.Items.WOODEN_WALLS).add(block);
            }
        });

        blockItemTagProviderRules.add((block, name) -> {
            if (name.contains("bamboo_block")) {
                if (block instanceof StairBlock) {
                    tag(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS).add(block);
                }
                if (block instanceof SlabBlock) {
                    tag(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS).add(block);
                }
                if (block instanceof FenceBlock) {
                    tag(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES).add(block);
                }
                if (block instanceof FenceBlock) {
                    tag(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES).add(block);
                }
            }
        });

        blockItemTagProviderRules.add((item, name) -> {
            if (!name.contains("wool")) return;

            if (name.contains("stairs")) {
                tag(BVTags.Blocks.WOOL_STAIRS, BVTags.Items.WOOL_STAIRS).add(item);
            } else if (name.contains("slab")) {
                tag(BVTags.Blocks.WOOL_SLABS, BVTags.Items.WOOL_SLABS).add(item);
            } else if (name.contains("wall")) {
                tag(BVTags.Blocks.WOOL_WALLS, BVTags.Items.WOOL_WALLS).add(item);
            }
        });
    }

    @Override
    protected void run() {
        runRules(BlockVariants.getAllBlocks());

        tag(BlockTags.WALLS, ItemTags.WALLS)
                .addTag(BVTags.Blocks.WOODEN_WALLS)
        ;
    }
}
