package com.ametrinstudios.ametrin.data;

import com.ametrinstudios.ametrin.data.provider.CustomLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class DataProviderHelper {
    public final DataGenerator generator;
    public final PackOutput output;
    public final ExistingFileHelper existingFileHelper;
    public final CompletableFuture<HolderLookup.Provider> lookupProvider;
    public final boolean includeClient;
    public final boolean includeServer;
    public DataProviderHelper(GatherDataEvent event){
        generator = event.getGenerator();
        output = generator.getPackOutput();
        existingFileHelper = event.getExistingFileHelper();
        lookupProvider = event.getLookupProvider();
        includeClient = event.includeClient();
        includeServer = event.includeServer();
    }

    public void add(boolean run, DataProvider provider){
        generator.addProvider(run, provider);
    }

    public void add(DataProvider provider){
        add(includeServer, provider);
    }
    public void add(DataProviderFromOutput provider){
        add(provider.build(output));
    }
    public void add(DataProviderFromOutputFileHelper provider){
        add(provider.build(output, existingFileHelper));
    }
    public void add(DataProviderFromOutputLookup provider){
        add(provider.build(output, lookupProvider));
    }
    public void add(DataProviderFromOutputLookupFileHelper provider){
        add(provider.build(output, lookupProvider, existingFileHelper));
    }
    public void add(CustomLootTableProvider.Builder lootTableBuilder){
        add(lootTableBuilder.Build(output, lookupProvider));
    }
    public void addBlockAndItemTags(BlockTagsProvider blockTagsProvider, ItemTagsProvider itemTagsProvider){
        var blockTags = blockTagsProvider.build(output, lookupProvider, existingFileHelper);
        add(blockTags);
        add(itemTagsProvider.build(output, lookupProvider, blockTags.contentsGetter(), existingFileHelper));
    }
    public void addLootTables(Function<CustomLootTableProvider.Builder, CustomLootTableProvider.Builder> consumer){
        var builder = consumer.apply(CustomLootTableProvider.Builder());
        add(builder);
    }

    @FunctionalInterface
    public interface DataProviderFromOutput{
        DataProvider build(PackOutput output);
    }
    @FunctionalInterface
    public interface DataProviderFromOutputLookup{
        DataProvider build(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider);
    }
    @FunctionalInterface
    public interface DataProviderFromOutputFileHelper{
        DataProvider build(PackOutput output, ExistingFileHelper existingFileHelper);
    }
    @FunctionalInterface
    public interface DataProviderFromOutputLookupFileHelper{
        DataProvider build(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper);
    }

    @FunctionalInterface
    public interface BlockTagsProvider{
        TagsProvider<Block> build(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper);
    }
    @FunctionalInterface
    public interface ItemTagsProvider{
        DataProvider build(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> contentsGetter, ExistingFileHelper existingFileHelper);
    }
}
