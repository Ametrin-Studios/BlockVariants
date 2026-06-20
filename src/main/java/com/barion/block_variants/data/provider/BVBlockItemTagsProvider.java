package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.references.BlockItemId;
import net.minecraft.tags.BlockItemTagId;
import net.minecraft.tags.BlockItemTags;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.common.Tags;

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

            if (name.contains("stairs")) {
                tag(BVTags.BlockItems.WOOL_STAIRS).add(id);
            } else if (name.contains("slab")) {
                tag(BVTags.BlockItems.WOOL_SLABS).add(id);
            } else if (name.contains("wall")) {
                tag(BVTags.BlockItems.WOOL_WALLS).add(id);
            }
        });

        blockItemTagProviderRules.add((block, id) -> {
            final var name = id.block().identifier().getPath();
            if (name.contains("white")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_WHITE, Tags.Items.DYED_WHITE)).add(id);
            } else if (name.contains("light_gray")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_LIGHT_GRAY, Tags.Items.DYED_LIGHT_GRAY)).add(id);
            } else if (name.contains("gray")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_GRAY, Tags.Items.DYED_GRAY)).add(id);
            } else if (name.contains("black_")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_BLACK, Tags.Items.DYED_BLACK)).add(id);
            } else if (name.contains("brown")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_BROWN, Tags.Items.DYED_BROWN)).add(id);
            } else if (name.contains("red") && !name.contains("sandstone") && !name.contains("nether")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_RED, Tags.Items.DYED_RED)).add(id);
            } else if (name.contains("orange")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_ORANGE, Tags.Items.DYED_ORANGE)).add(id);
            } else if (name.contains("yellow")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_YELLOW, Tags.Items.DYED_YELLOW)).add(id);
            } else if (name.contains("lime")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_LIME, Tags.Items.DYED_LIME)).add(id);
            } else if (name.contains("green")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_GREEN, Tags.Items.DYED_GREEN)).add(id);
            } else if (name.contains("cyan")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_CYAN, Tags.Items.DYED_CYAN)).add(id);
            } else if (name.contains("light_blue")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_LIGHT_BLUE, Tags.Items.DYED_LIGHT_BLUE)).add(id);
            } else if (name.contains("blue")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_BLUE, Tags.Items.DYED_BLUE)).add(id);
            } else if (name.contains("purple")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_PURPLE, Tags.Items.DYED_PURPLE)).add(id);
            } else if (name.contains("magenta")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_MAGENTA, Tags.Items.DYED_MAGENTA)).add(id);
            } else if (name.contains("pink")) {
                tag(new BlockItemTagId(Tags.Blocks.DYED_PINK, Tags.Items.DYED_PINK)).add(id);
            }
        });
    }

    protected BVBlockItemTagsProvider(Function<BlockItemTagId, CombinedAppender> tagSupplier) {
        super(tagSupplier);
    }

    @Override
    protected void run() {
        runRules(BlockVariants.getAllBlocks());

        tag(BlockItemTags.WALLS)
                .addTag(BVTags.BlockItems.WOODEN_WALLS)
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
