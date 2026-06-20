package com.barion.block_variants.registry;

import com.barion.block_variants.BlockVariants;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockItemTagId;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class BVTags {
    public static final class Blocks {
        public static final TagKey<Block> WOODEN_WALLS = common("wooden_walls");

        public static final TagKey<Block> WOOL_STAIRS = mod("wool/stairs");
        public static final TagKey<Block> WOOL_SLABS = mod("wool/slabs");
        public static final TagKey<Block> WOOL_WALLS = mod("wool/walls");

        private static TagKey<Block> common(String path) {
            return BlockTags.create(Identifier.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Block> mod(String path) {
            return BlockTags.create(BlockVariants.locate(path));
        }
    }

    public static final class Items {
        public static final TagKey<Item> WOODEN_WALLS = common("wooden_walls");
        public static final TagKey<Item> STONE_CRAFTING = mod("stone_crafting");
        public static final TagKey<Item> WOOL_STAIRS = mod("wool/stairs");
        public static final TagKey<Item> WOOL_SLABS = mod("wool/slabs");
        public static final TagKey<Item> WOOL_WALLS = mod("wool/walls");

        private static TagKey<Item> common(String path) {
            return ItemTags.create(Identifier.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Item> mod(String path) {
            return ItemTags.create(BlockVariants.locate(path));
        }
    }

    public static final class BlockItems {
        public static final BlockItemTagId WOODEN_WALLS = new BlockItemTagId(Blocks.WOODEN_WALLS, Items.WOODEN_WALLS);
        public static final BlockItemTagId WOOL_STAIRS = new BlockItemTagId(Blocks.WOOL_STAIRS, Items.WOOL_STAIRS);
        public static final BlockItemTagId WOOL_SLABS = new BlockItemTagId(Blocks.WOOL_SLABS, Items.WOOL_SLABS);
        public static final BlockItemTagId WOOL_WALLS = new BlockItemTagId(Blocks.WOOL_WALLS, Items.WOOL_WALLS);
    }
}