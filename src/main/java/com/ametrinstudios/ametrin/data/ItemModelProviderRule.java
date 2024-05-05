package com.ametrinstudios.ametrin.data;

import net.minecraft.world.item.Item;

@FunctionalInterface
public interface ItemModelProviderRule {
    boolean generate(Item block, String name, String texture);
}