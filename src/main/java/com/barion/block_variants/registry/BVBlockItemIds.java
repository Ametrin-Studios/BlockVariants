package com.barion.block_variants.registry;

import com.barion.block_variants.BlockVariants;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.ColorCollection;

public final class BVBlockItemIds {
    public static final ColorCollection<BlockItemId> WOOL_WALL = ColorCollection.prefixWithColor(ColorCollection.create("wool_wall")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> CONCRETE_WALL = ColorCollection.prefixWithColor(ColorCollection.create("concrete_wall")).map(BVBlockItemIds::create);

    public static final ColorCollection<BlockItemId> DYED_TERRACOTTA_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> DYED_TERRACOTTA_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> DYED_TERRACOTTA_WALL = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_wall")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> GLAZED_TERRACOTTA_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> GLAZED_TERRACOTTA_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> GLAZED_TERRACOTTA_WALL = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_wall")).map(BVBlockItemIds::create);

    public static BlockItemId create(String name) {
        return BlockItemId.create(BlockVariants.locate(name), BlockVariants.locate(name));
    }
}
