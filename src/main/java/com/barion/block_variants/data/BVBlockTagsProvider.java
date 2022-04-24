package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.block.*;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.Objects;

public class BVBlockTagsProvider extends BlockTagsProvider {
    public BVBlockTagsProvider(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.ModID, fileHelper);
    }

    @Override
    protected void addTags() {
        handleDefaults(BVBlocks.getAllBlocks());

        tag(BlockTags.NON_FLAMMABLE_WOOD).add(
                BVBlocks.Crimson_Hyphae_Stairs.get(),
                BVBlocks.Crimson_Hyphae_Slab.get(),
                BVBlocks.Crimson_Hyphae_Wall.get(),
                BVBlocks.Warped_Hyphae_Stairs.get(),
                BVBlocks.Warped_Hyphae_Slab.get(),
                BVBlocks.Warped_Hyphae_Wall.get(),
                BVBlocks.Stripped_Crimson_Hyphae_Wall.get(),
                BVBlocks.Stripped_Crimson_Hyphae_Slab.get(),
                BVBlocks.Stripped_Warped_Hyphae_Slab.get(),
                BVBlocks.Stripped_Crimson_Hyphae_Stairs.get(),
                BVBlocks.Stripped_Warped_Hyphae_Stairs.get(),
                BVBlocks.Stripped_Warped_Hyphae_Wall.get());

        tag(BlockTags.FENCES).addTag(BlockTags.WOODEN_FENCES);
        tag(BlockTags.WALLS).addTag(BVTags.Blocks.WoodenWalls);
    }

    private void handleDefaults(List<Block> allBlocks) {
        for(Block block : allBlocks) {
            String name = getName(block);

            if(block instanceof StairsBlock){
                if(BVUtil.isWooden(name)){
                    tag(BlockTags.WOODEN_STAIRS).add(block);
                } else {
                    tag(BlockTags.STAIRS).add(block);
                }
            }
            if(block instanceof SlabBlock){
                if(BVUtil.isWooden(name)){
                    tag(BlockTags.WOODEN_SLABS).add(block);
                } else {
                    tag(BlockTags.SLABS).add(block);
                }
            }
            if(block instanceof WallBlock) {
                if(BVUtil.isWooden(name)){
                    tag(BVTags.Blocks.WoodenWalls).add(block);
                } else {
                    tag(BlockTags.WALLS).add(block);
                }
            }
            if(block instanceof FenceBlock){
                tag(BlockTags.FENCES).add(block);
            }
            if(block instanceof FenceGateBlock){
                tag(BlockTags.FENCE_GATES).add(block);
            }
        }
    }

    protected String getName(Block block) {return Objects.requireNonNull(block.getRegistryName()).getPath();}
}