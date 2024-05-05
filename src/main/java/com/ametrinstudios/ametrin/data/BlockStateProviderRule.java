package com.ametrinstudios.ametrin.data;

import net.minecraft.world.level.block.Block;

@FunctionalInterface
public interface BlockStateProviderRule {
    boolean generate(Block block, String name, String texture);
}