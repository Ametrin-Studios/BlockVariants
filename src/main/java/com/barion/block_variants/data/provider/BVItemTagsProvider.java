package com.barion.block_variants.data.provider;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public class BVItemTagsProvider extends ItemTagsProvider {
    public BVItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> provider, ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, provider, BlockVariants.ModID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider lookupProvider){
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

        tag(BVTags.Items.STONE_CRAFTING).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONE);

//        tag(ItemTags.STAIRS).addTag(ItemTags.WOODEN_STAIRS);
//        tag(ItemTags.SLABS).addTag(ItemTags.WOODEN_SLABS);
        //tag(ItemTags.WALLS).addTag(BVTags.Items.WoodenWalls);

        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                BVBlocks.CRIMSON_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.CRIMSON_HYPHAE_SLAB.get().asItem(),
                BVBlocks.CRIMSON_HYPHAE_WALL.get().asItem(),
                BVBlocks.WARPED_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.WARPED_HYPHAE_SLAB.get().asItem(),
                BVBlocks.WARPED_HYPHAE_WALL.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get().asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get().asItem(),
                BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get().asItem(),
                BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.get().asItem()
        );
    }
}