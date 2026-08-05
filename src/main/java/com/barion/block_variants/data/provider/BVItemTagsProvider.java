package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlocks;
import com.barion.block_variants.registry.BVItems;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public final class BVItemTagsProvider extends ExtendedItemTagsProvider {
    public BVItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> provider) {
        super(packOutput, lookupProvider, provider, BlockVariants.MOD_ID);
    }

    {
        registerRule((item, name)-> {
            if(!name.contains("wool")) return;

            if(name.contains("stairs")) {
                tag(BVTags.Items.WOOL_STAIRS).add(item);
            } else if(name.contains("slab")) {
                tag(BVTags.Items.WOOL_SLABS).add(item);
            } else if(name.contains("wall")) {
                tag(BVTags.Items.WOOL_WALLS).add(item);
            }
        });
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider lookupProvider) {
        runRules(BVItems.REGISTER);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);

        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BVTags.Blocks.WOODEN_WALLS, BVTags.Items.WOODEN_WALLS);
        copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);

        tag(BVTags.Items.STONE_CRAFTING).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONES);

        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                BVBlocks.CRIMSON_STEM_STAIRS.asItem(),
                BVBlocks.CRIMSON_STEM_SLAB.asItem(),

                BVBlocks.WARPED_STEM_STAIRS.asItem(),
                BVBlocks.WARPED_STEM_SLAB.asItem(),

                BVBlocks.STRIPPED_CRIMSON_STEM_STAIRS.asItem(),
                BVBlocks.STRIPPED_CRIMSON_STEM_SLAB.asItem(),

                BVBlocks.STRIPPED_WARPED_STEM_STAIRS.asItem(),
                BVBlocks.STRIPPED_WARPED_STEM_SLAB.asItem(),

                BVBlocks.CRIMSON_HYPHAE_STAIRS.asItem(),
                BVBlocks.CRIMSON_HYPHAE_SLAB.asItem(),
                BVBlocks.CRIMSON_HYPHAE_WALL.asItem(),
                BVBlocks.CRIMSON_HYPHAE_FENCE.asItem(),
                BVBlocks.CRIMSON_HYPHAE_FENCE_GATE.asItem(),

                BVBlocks.WARPED_HYPHAE_STAIRS.asItem(),
                BVBlocks.WARPED_HYPHAE_SLAB.asItem(),
                BVBlocks.WARPED_HYPHAE_WALL.asItem(),
                BVBlocks.WARPED_HYPHAE_FENCE.asItem(),
                BVBlocks.WARPED_HYPHAE_FENCE_GATE.asItem(),

                BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.asItem(),

                BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE.asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.asItem(),

                BVBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.asItem(),
                BVBlocks.RED_NETHER_BRICK_FENCE_GATE.asItem(),
                BVBlocks.NETHER_BRICK_FENCE_GATE.asItem()
        );
    }
}