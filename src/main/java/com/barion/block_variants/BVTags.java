package com.barion.block_variants;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class BVTags {
    public static final class Blocks{
        public static final Tags.IOptionalNamedTag<Block> WoodenWalls = forge("wooden_wall");

        private static Tags.IOptionalNamedTag<Block> forge(String path){
            return BlockTags.createOptional(new ResourceLocation("forge", path));
        }
        private static Tags.IOptionalNamedTag<Block> mod(String path){
            return BlockTags.createOptional(new ResourceLocation(BlockVariants.ModID, path));
        }
    }

    public static final class Items{
        public static final Tags.IOptionalNamedTag<Item> WoodenWalls = forge("wooden_wall");
        public static final Tags.IOptionalNamedTag<Item> StoneCrafting = mod("stone_crafting");

        private static Tags.IOptionalNamedTag<Item> forge(String path){
            return ItemTags.createOptional(new ResourceLocation("forge", path));
        }
        private static Tags.IOptionalNamedTag<Item> mod(String path){
            return ItemTags.createOptional(new ResourceLocation(BlockVariants.ModID, path));
        }
    }
}
