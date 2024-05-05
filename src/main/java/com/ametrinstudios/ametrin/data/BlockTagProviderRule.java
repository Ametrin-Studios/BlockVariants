package com.ametrinstudios.ametrin.data;

import net.minecraft.world.level.block.Block;

@FunctionalInterface
public interface BlockTagProviderRule {
    void generate(Block block, String name);
}