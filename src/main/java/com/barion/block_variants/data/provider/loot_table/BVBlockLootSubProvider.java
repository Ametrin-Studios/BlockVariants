package com.barion.block_variants.data.provider.loot_table;

import com.ametrinstudios.ametrin.data.provider.loot_table.ExtendedBlockLootSubProvider;
import com.barion.block_variants.BVBlocks;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class BVBlockLootSubProvider extends ExtendedBlockLootSubProvider {
    @Override
    protected void generate() {
        dropSelf(BVBlocks.getAllBlocks());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BVBlocks.BLOCK_REGISTER.getEntries().stream().map(s->(Block)s.get()).toList();
    }
}
