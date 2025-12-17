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
import net.neoforged.neoforge.common.Tags;

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

        blockItemTagProviderRules.add((block, name) -> {
            if (!name.contains("wool")) return;
            tag(BlockTags.DAMPENS_VIBRATIONS, ItemTags.DAMPENS_VIBRATIONS).add(block);

            if (name.contains("stairs")) {
                tag(BVTags.Blocks.WOOL_STAIRS, BVTags.Items.WOOL_STAIRS).add(block);
            } else if (name.contains("slab")) {
                tag(BVTags.Blocks.WOOL_SLABS, BVTags.Items.WOOL_SLABS).add(block);
            } else if (name.contains("wall")) {
                tag(BVTags.Blocks.WOOL_WALLS, BVTags.Items.WOOL_WALLS).add(block);
            }
        });

        blockItemTagProviderRules.add((block, name) -> {
            if (name.contains("white")) {
                tag(Tags.Blocks.DYED_WHITE, Tags.Items.DYED_WHITE).add(block);
            } else if (name.contains("light_gray")) {
                tag(Tags.Blocks.DYED_LIGHT_GRAY, Tags.Items.DYED_LIGHT_GRAY).add(block);
            } else if (name.contains("gray")) {
                tag(Tags.Blocks.DYED_GRAY, Tags.Items.DYED_GRAY).add(block);
            } else if (name.contains("black_")) {
                tag(Tags.Blocks.DYED_BLACK, Tags.Items.DYED_BLACK).add(block);
            } else if (name.contains("brown")) {
                tag(Tags.Blocks.DYED_BROWN, Tags.Items.DYED_BROWN).add(block);
            } else if (name.contains("red") && !name.contains("sandstone") && !name.contains("nether")) {
                tag(Tags.Blocks.DYED_RED, Tags.Items.DYED_RED).add(block);
            } else if (name.contains("orange")) {
                tag(Tags.Blocks.DYED_ORANGE, Tags.Items.DYED_ORANGE).add(block);
            } else if (name.contains("yellow")) {
                tag(Tags.Blocks.DYED_YELLOW, Tags.Items.DYED_YELLOW).add(block);
            } else if (name.contains("lime")) {
                tag(Tags.Blocks.DYED_LIME, Tags.Items.DYED_LIME).add(block);
            } else if (name.contains("green")) {
                tag(Tags.Blocks.DYED_GREEN, Tags.Items.DYED_GREEN).add(block);
            } else if (name.contains("cyan")) {
                tag(Tags.Blocks.DYED_CYAN, Tags.Items.DYED_CYAN).add(block);
            } else if (name.contains("light_blue")) {
                tag(Tags.Blocks.DYED_LIGHT_BLUE, Tags.Items.DYED_LIGHT_BLUE).add(block);
            } else if (name.contains("blue")) {
                tag(Tags.Blocks.DYED_BLUE, Tags.Items.DYED_BLUE).add(block);
            } else if (name.contains("purple")) {
                tag(Tags.Blocks.DYED_PURPLE, Tags.Items.DYED_PURPLE).add(block);
            } else if (name.contains("magenta")) {
                tag(Tags.Blocks.DYED_MAGENTA, Tags.Items.DYED_MAGENTA).add(block);
            } else if (name.contains("pink")) {
                tag(Tags.Blocks.DYED_PINK, Tags.Items.DYED_PINK).add(block);
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
