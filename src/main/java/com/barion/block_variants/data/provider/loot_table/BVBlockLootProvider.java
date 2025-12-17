package com.barion.block_variants.data.provider.loot_table;

import com.ametrinstudios.ametrin.data.provider.loot_table.ExtendedBlockLootSubProvider;
import com.barion.block_variants.BlockVariants;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;

public final class BVBlockLootProvider extends ExtendedBlockLootSubProvider {
    public BVBlockLootProvider(HolderLookup.Provider registries) {
        super(registries);
    }

    @Override
    protected void generate() {
        dropSelf(BlockVariants.getAllBlocks());
    }

    @Override
    protected  Iterable<Block> getKnownBlocks() {
        return BlockVariants.getAllBlocks().toList();
    }
}
