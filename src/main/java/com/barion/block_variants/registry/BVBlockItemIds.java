package com.barion.block_variants.registry;

import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.ColorCollection;

public final class BVBlockItemIds {
    public static final ColorCollection<BlockItemId> WOOL_WALL = ColorCollection.prefixWithColor(ColorCollection.create("wool_wall")).map(BlockItemId::create);

}
