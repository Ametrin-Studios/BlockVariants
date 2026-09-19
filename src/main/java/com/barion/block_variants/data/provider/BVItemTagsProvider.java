package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.DataProviderExtensions;
import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlockFamilies;
import com.barion.block_variants.registry.BVItems;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BlockItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public final class BVItemTagsProvider extends ExtendedItemTagsProvider {
    public BVItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, BlockVariants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        runRules(BVItems.REGISTER);

        new BVBlockItemTagsProvider(tags -> BlockItemTagsProvider.wrapForItems(tag(tags.item()))).run();

        tag(BVTags.Items.STONE_CRAFTING).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONES);

        tag(ItemTags.PIGLIN_LOVED).add(
                DataProviderExtensions.getItemResourceKey(BVOtherBlocks.GOLD_BARS),
                DataProviderExtensions.getItemResourceKey(BVOtherBlocks.GOLD_CHAIN),
                DataProviderExtensions.getItemResourceKey(BVOtherBlocks.GOLD_GRATE)
        );

        tag(ItemTags.NON_FLAMMABLE_WOOD)
                .addAll(BVBlockFamilies.CRIMSON_STEM.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
                .addAll(BVBlockFamilies.STRIPPED_CRIMSON_STEM.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
                .addAll(BVBlockFamilies.WARPED_STEM.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
                .addAll(BVBlockFamilies.STRIPPED_WARPED_STEM.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
                .addAll(BVBlockFamilies.CRIMSON_HYPHAE.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
                .addAll(BVBlockFamilies.STRIPPED_CRIMSON_HYPHAE.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
                .addAll(BVBlockFamilies.WARPED_HYPHAE.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
                .addAll(BVBlockFamilies.STRIPPED_WARPED_HYPHAE.getVariants().values().stream().map(DataProviderExtensions::getItemResourceKey).sorted())
        ;
    }
}