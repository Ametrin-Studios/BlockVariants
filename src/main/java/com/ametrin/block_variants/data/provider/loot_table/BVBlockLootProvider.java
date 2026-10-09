package com.ametrin.block_variants.data.provider.loot_table;

import com.ametrin.block_variants.BlockVariants;
import com.ametrinstudios.ametrin.data.provider.loot_table.ExtendedBlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public final class BVBlockLootProvider extends ExtendedBlockLootSubProvider {
    public BVBlockLootProvider(LootTableSubProvider.Context output) {
        super(output);
    }

    @Override
    protected void generate() {
        dropSelf(BlockVariants.getAllBlocks().map(Supplier::get));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockVariants.getAllBlocks().map(h -> (Block) h.get()).toList();
    }
}
