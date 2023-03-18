package com.barion.block_variants.data;

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
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider){
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BVTags.Blocks.WoodenWalls, BVTags.Items.WoodenWalls);
        copy(BlockTags.FENCES, ItemTags.FENCES);

        tag(BVTags.Items.StoneCrafting).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONE);

        tag(ItemTags.STAIRS).addTag(ItemTags.WOODEN_STAIRS);
        tag(ItemTags.SLABS).addTag(ItemTags.WOODEN_SLABS);
        //tag(ItemTags.WALLS).addTag(BVTags.Items.WoodenWalls);

        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                BVBlocks.Crimson_Hyphae_Stairs.get().asItem(),
                BVBlocks.Crimson_Hyphae_Slab.get().asItem(),
                BVBlocks.Crimson_Hyphae_Wall.get().asItem(),
                BVBlocks.Warped_Hyphae_Stairs.get().asItem(),
                BVBlocks.Warped_Hyphae_Slab.get().asItem(),
                BVBlocks.Warped_Hyphae_Wall.get().asItem(),
                BVBlocks.Stripped_Crimson_Hyphae_Wall.get().asItem(),
                BVBlocks.Stripped_Crimson_Hyphae_Slab.get().asItem(),
                BVBlocks.Stripped_Warped_Hyphae_Slab.get().asItem(),
                BVBlocks.Stripped_Crimson_Hyphae_Stairs.get().asItem(),
                BVBlocks.Stripped_Warped_Hyphae_Stairs.get().asItem(),
                BVBlocks.Stripped_Warped_Hyphae_Wall.get().asItem()
        );
    }
}