package com.barion.block_variants.registry;

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

        public static final TagKey<Block> WOOL_WALLS = mod("wool/walls");
        public static final TagKey<Block> CONCRETE_WALLS = mod("concrete/walls");

        private static TagKey<Block> common(String path) {
            return BlockTags.create(Identifier.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Block> mod(String path) {
            return BVOtherBlocks.REGISTER.createTagKey(path);
        }
    }

    public static final class Items {
        public static final TagKey<Item> WOODEN_WALLS = common("wooden_walls");
        public static final TagKey<Item> STONE_CRAFTING = mod("stone_crafting");
        public static final TagKey<Item> WOOL_WALLS = mod("wool/walls");
        public static final TagKey<Item> CONCRETE_WALLS = mod("concrete/walls");

        private static TagKey<Item> common(String path) {
            return ItemTags.create(Identifier.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Item> mod(String path) {
            return BVItems.REGISTER.createTagKey(path);
        }
    }

    public static final class BlockItems {
        public static final BlockItemTagId WOODEN_WALLS = new BlockItemTagId(Blocks.WOODEN_WALLS, Items.WOODEN_WALLS);
        public static final BlockItemTagId WOOL_WALLS = new BlockItemTagId(Blocks.WOOL_WALLS, Items.WOOL_WALLS);
        public static final BlockItemTagId CONCRETE_WALLS = new BlockItemTagId(Blocks.CONCRETE_WALLS, Items.CONCRETE_WALLS);
    }
}