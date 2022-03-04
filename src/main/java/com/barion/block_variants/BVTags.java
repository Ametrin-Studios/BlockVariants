package com.barion.block_variants;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BVTags {
    public static final class Blocks{
        public static final TagKey<Block> WoodenWalls = forge("wooden_wall");

        private static TagKey<Block> forge(String path){
            return BlockTags.create(new ResourceLocation("forge", path));
        }
        private static TagKey<Block> mod(String path){
            return BlockTags.create(new ResourceLocation(BlockVariants.Mod_ID, path));
        }
    }

    public static final class Items{
        public static final TagKey<Item> WoodenWalls = forge("wooden_wall");
        public static final TagKey<Item> StoneCrafting = mod("stone_crafting");

        private static TagKey<Item> forge(String path){
            return ItemTags.create(new ResourceLocation("forge", path));
        }
        private static TagKey<Item> mod(String path){
            return ItemTags.create(new ResourceLocation(BlockVariants.Mod_ID, path));
        }
    }
}