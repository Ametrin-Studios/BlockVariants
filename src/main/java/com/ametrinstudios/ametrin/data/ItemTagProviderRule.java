package com.ametrinstudios.ametrin.data;

import net.minecraft.world.item.Item;

@FunctionalInterface
public interface ItemTagProviderRule {
    void run(Item block, String name);
}