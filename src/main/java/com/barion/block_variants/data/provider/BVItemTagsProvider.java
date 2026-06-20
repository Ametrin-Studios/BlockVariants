package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVItems;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BlockItemTagsProvider;
import net.minecraft.resources.ResourceKey;
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
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVOtherBlocks.GOLD_BARS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVOtherBlocks.GOLD_CHAIN.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVOtherBlocks.GOLD_GRATE.getKey().identifier())
        );

        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.CRIMSON_STEM_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.CRIMSON_STEM_SLAB.getKey().identifier()),

                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.WARPED_STEM_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.WARPED_STEM_SLAB.getKey().identifier()),

                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_CRIMSON_STEM_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_CRIMSON_STEM_SLAB.getKey().identifier()),

                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_WARPED_STEM_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_WARPED_STEM_SLAB.getKey().identifier()),

                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.CRIMSON_HYPHAE_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.CRIMSON_HYPHAE_SLAB.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.CRIMSON_HYPHAE_WALL.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.CRIMSON_HYPHAE_FENCE.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.CRIMSON_HYPHAE_FENCE_GATE.getKey().identifier()),

                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.WARPED_HYPHAE_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.WARPED_HYPHAE_SLAB.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.WARPED_HYPHAE_WALL.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.WARPED_HYPHAE_FENCE.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.WARPED_HYPHAE_FENCE_GATE.getKey().identifier()),

                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.getKey().identifier()),

                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_SLAB.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_WALL.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE.getKey().identifier()),
                ResourceKey.create(BuiltInRegistries.ITEM.key(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.getKey().identifier())
        );
    }
}