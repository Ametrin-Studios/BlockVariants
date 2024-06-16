package com.ametrinstudios.ametrin.data.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public final class CustomLootTableProvider extends LootTableProvider {
    public CustomLootTableProvider(PackOutput packOutput, List<SubProviderEntry> subProviders, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, Set.of(), subProviders, registries);
    }

    public static Builder Builder(){
        return new Builder();
    }

    public static class Builder{
        private final List<SubProviderEntry> _subProviders;

        public Builder(){
             _subProviders = new ArrayList<>();
        }

        public Builder AddBlockProvider(Function<HolderLookup.Provider, LootTableSubProvider> subProviderSupplier){
            return AddProvider(subProviderSupplier, LootContextParamSets.BLOCK);
        }
        public Builder AddChestProvider(Function<HolderLookup.Provider, LootTableSubProvider> subProviderSupplier){
            return AddProvider(subProviderSupplier, LootContextParamSets.CHEST);
        }
        public Builder AddEntityProvider(Function<HolderLookup.Provider, LootTableSubProvider> subProviderSupplier){
            return AddProvider(subProviderSupplier, LootContextParamSets.ENTITY);
        }
        public Builder AddArcheologyProvider(Function<HolderLookup.Provider, LootTableSubProvider> subProviderSupplier){
            return AddProvider(subProviderSupplier, LootContextParamSets.ARCHAEOLOGY);
        }
        public Builder AddFishingProvider(Function<HolderLookup.Provider, LootTableSubProvider> subProviderSupplier){
            return AddProvider(subProviderSupplier, LootContextParamSets.FISHING);
        }
        public Builder AddProvider(Function<HolderLookup.Provider, LootTableSubProvider> subProviderSupplier, LootContextParamSet paramSet){
            return AddProvider(new SubProviderEntry(subProviderSupplier, paramSet));
        }

        public Builder AddProvider(SubProviderEntry subProviderEntry){
            _subProviders.add(subProviderEntry);
            return this;
        }

        public CustomLootTableProvider Build(PackOutput output, CompletableFuture<HolderLookup.Provider> registries){
            if(_subProviders.isEmpty()) throw new IllegalStateException("Cannot run an empty LootTableProvider");
            return new CustomLootTableProvider(output, _subProviders, registries);
        }
    }
}