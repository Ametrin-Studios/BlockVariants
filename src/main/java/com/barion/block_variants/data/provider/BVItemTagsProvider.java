package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVItems;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public final class BVItemTagsProvider extends ExtendedItemTagsProvider {
    public BVItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, BlockVariants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        runRules(BVItems.REGISTER);

        new BVBlockItemTagsProvider() {

            @Override
            protected TagAppender<Block, Block> tag(TagKey<Block> blockTag, TagKey<Item> itemTag) {
                return new BlockToItemConverter(BVItemTagsProvider.this.tag(itemTag));
            }
        }.run();

        tag(BVTags.Items.STONE_CRAFTING).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONES);

        tag(ItemTags.PIGLIN_LOVED).add(
                BVOtherBlocks.GOLD_BARS.asItem(),
                BVOtherBlocks.GOLD_CHAIN.asItem(),
                BVOtherBlocks.GOLD_GRATE.asItem()
        );

        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                BVBuildingBlocks.CRIMSON_STEM_STAIRS.asItem(),
                BVBuildingBlocks.CRIMSON_STEM_SLAB.asItem(),

                BVBuildingBlocks.WARPED_STEM_STAIRS.asItem(),
                BVBuildingBlocks.WARPED_STEM_SLAB.asItem(),

                BVBuildingBlocks.STRIPPED_CRIMSON_STEM_STAIRS.asItem(),
                BVBuildingBlocks.STRIPPED_CRIMSON_STEM_SLAB.asItem(),

                BVBuildingBlocks.STRIPPED_WARPED_STEM_STAIRS.asItem(),
                BVBuildingBlocks.STRIPPED_WARPED_STEM_SLAB.asItem(),

                BVBuildingBlocks.CRIMSON_HYPHAE_STAIRS.asItem(),
                BVBuildingBlocks.CRIMSON_HYPHAE_SLAB.asItem(),
                BVBuildingBlocks.CRIMSON_HYPHAE_WALL.asItem(),
                BVBuildingBlocks.CRIMSON_HYPHAE_FENCE.asItem(),
                BVBuildingBlocks.CRIMSON_HYPHAE_FENCE_GATE.asItem(),

                BVBuildingBlocks.WARPED_HYPHAE_STAIRS.asItem(),
                BVBuildingBlocks.WARPED_HYPHAE_SLAB.asItem(),
                BVBuildingBlocks.WARPED_HYPHAE_WALL.asItem(),
                BVBuildingBlocks.WARPED_HYPHAE_FENCE.asItem(),
                BVBuildingBlocks.WARPED_HYPHAE_FENCE_GATE.asItem(),

                BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.asItem(),
                BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.asItem(),
                BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.asItem(),
                BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.asItem(),
                BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.asItem(),

                BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.asItem(),
                BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_SLAB.asItem(),
                BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_WALL.asItem(),
                BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE.asItem(),
                BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.asItem()
        );
    }
}