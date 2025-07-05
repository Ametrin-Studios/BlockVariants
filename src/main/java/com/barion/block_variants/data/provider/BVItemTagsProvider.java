package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlocks;
import com.barion.block_variants.registry.BVItems;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public final class BVItemTagsProvider extends ExtendedItemTagsProvider {
    public BVItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, BlockVariants.MOD_ID);
    }

    {
        registerRule((item, name) -> {
            if (!name.contains("wool")) return;

            if (name.contains("stairs")) {
                tag(BVTags.Items.WOOL_STAIRS).add(item);
            } else if (name.contains("slab")) {
                tag(BVTags.Items.WOOL_SLABS).add(item);
            } else if (name.contains("wall")) {
                tag(BVTags.Items.WOOL_WALLS).add(item);
            }
        });
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider lookupProvider) {
        runRules(BVItems.REGISTER);

        new BVBlockItemTagsProvider() {

            @Override
            protected @NotNull TagAppender<Block, Block> tag(@NotNull TagKey<Block> blockTag, @NotNull TagKey<Item> itemTag) {
                return new BlockToItemConverter(BVItemTagsProvider.this.tag(itemTag));
            }
        }.run();

        tag(BVTags.Items.STONE_CRAFTING).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONES);

        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                BVBlocks.CRIMSON_STEM_STAIRS.get().asItem(),
                BVBlocks.CRIMSON_STEM_SLAB.get().asItem(),

                BVBlocks.WARPED_STEM_STAIRS.get().asItem(),
                BVBlocks.WARPED_STEM_SLAB.get().asItem(),

                BVBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_STEM_SLAB.get().asItem(),

                BVBlocks.STRIPPED_WARPED_STEM_STAIRS.get().asItem(),
                BVBlocks.STRIPPED_WARPED_STEM_SLAB.get().asItem(),

                BVBlocks.CRIMSON_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.CRIMSON_HYPHAE_SLAB.get().asItem(),
                BVBlocks.CRIMSON_HYPHAE_WALL.get().asItem(),
                BVBlocks.CRIMSON_HYPHAE_FENCE.get().asItem(),
                BVBlocks.CRIMSON_HYPHAE_FENCE_GATE.get().asItem(),

                BVBlocks.WARPED_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.WARPED_HYPHAE_SLAB.get().asItem(),
                BVBlocks.WARPED_HYPHAE_WALL.get().asItem(),
                BVBlocks.WARPED_HYPHAE_FENCE.get().asItem(),
                BVBlocks.WARPED_HYPHAE_FENCE_GATE.get().asItem(),

                BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get().asItem(),

                BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get().asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.get().asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get().asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get().asItem()
        );
    }
}