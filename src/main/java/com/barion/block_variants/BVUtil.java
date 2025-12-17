package com.barion.block_variants;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Objects;

public final class BVUtil {
    public static Identifier getBlockID(Block block) {
        return Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(block));
    }

    public static Identifier getItemID(Item block) {
        return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(block));
    }
}