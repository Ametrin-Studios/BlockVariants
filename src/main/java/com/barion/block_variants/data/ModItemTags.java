package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModItemTags extends ItemTagsProvider {
    public ModItemTags(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper fileHelper) {
        super(generator, provider, BlockVariants.Mod_ID, fileHelper);
    }

    @Override
    protected void addTags() {
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.SLABS);
    }
}