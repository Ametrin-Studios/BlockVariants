package com.barion.block_variants;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BVTags {
    public static final class Blocks{
        public static final TagKey<Block> WOODEN_WALLS = forge("wooden_wall");

        private static TagKey<Block> forge(String path){
            return BlockTags.create(new ResourceLocation("forge", path));
        }
        private static TagKey<Block> mod(String path){
            return BlockTags.create(new ResourceLocation(BlockVariants.ModID, path));
        }
    }

    public static final class Items{
        public static final TagKey<Item> WOODEN_WALLS = forge("wooden_wall");
        public static final TagKey<Item> STONE_CRAFTING = mod("stone_crafting");
        public static final TagKey<Item> WOOL_STAIRS = mod("wool/stairs");
        public static final TagKey<Item> WOOL_SLABS = mod("wool/slabs");
        public static final TagKey<Item> WOOL_WALLS = mod("wool/walls");

        private static TagKey<Item> forge(String path){
            return ItemTags.create(new ResourceLocation("forge", path));
        }
        private static TagKey<Item> mod(String path){
            return ItemTags.create(new ResourceLocation(BlockVariants.ModID, path));
        }
    }
}