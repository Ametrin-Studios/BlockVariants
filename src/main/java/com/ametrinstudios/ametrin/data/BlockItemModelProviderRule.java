package com.ametrinstudios.ametrin.data;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

@FunctionalInterface
public interface BlockItemModelProviderRule {
    boolean generate(Item item, Block block, String name, String texture);
}