package com.barion.block_variants.data.provider.loot_table;

import com.ametrinstudios.ametrin.data.provider.loot_table.ExtendedBlockLootSubProvider;
import com.barion.block_variants.registry.BVBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public final class BVBlockLootProvider extends ExtendedBlockLootSubProvider {
    public BVBlockLootProvider(HolderLookup.Provider registries) {
        super(registries);
    }

    @Override
    protected void generate() {
        dropSelf(BVBlocks.getAllBlocks());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BVBlocks.REGISTER.getEntries().stream().map(s->(Block)s.get()).toList();
    }
}
