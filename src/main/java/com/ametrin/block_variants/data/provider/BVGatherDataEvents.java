package com.ametrin.block_variants.data.provider;

import com.ametrin.block_variants.data.provider.loot_table.BVBlockLootProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;

@SuppressWarnings("unused")
@EventBusSubscriber(value = Dist.CLIENT)
public final class BVGatherDataEvents {
    @SubscribeEvent
    static void gatherRegistryEntries(final GatherDataRegistryEntriesEvent event) {
        event.lootTable(new LootTableProvider.SubProviderEntry(BVBlockLootProvider::new, LootContextParamSets.BLOCK));
        event.recipe(BVRecipeProvider::new);
    }

    @SubscribeEvent
    static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(BVModelProvider::new);
        event.createProvider(BVDataMapProvider::new);
        event.createProvider(BVBlockTagsProvider::new);
        event.createProvider(BVItemTagsProvider::new);
        event.createProvider(BVLanguageProvider::new);
    }
}
