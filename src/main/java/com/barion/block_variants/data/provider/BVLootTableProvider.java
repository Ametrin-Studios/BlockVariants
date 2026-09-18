package com.barion.block_variants.data.provider;

import com.barion.block_variants.data.provider.loot_table.BVBlockLootProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public final class BVLootTableProvider {
    public static LootTableProvider create() {
        return new LootTableProvider(Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(BVBlockLootProvider::new, LootContextParamSets.BLOCK)
        ));
    }
}
