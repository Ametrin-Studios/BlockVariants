package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.barion.block_variants.registry.BVBuildingBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.component.BlockTransformers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.CopyPropertiesProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.datamaps.builtin.BlockTransformAppender;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class BVDataMapProvider extends DataMapProvider {
    public BVDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        var strippables = RuleBasedStateProvider.builder()
                .ifTrueThenProvide(BlockPredicate.matchesBlocks(BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get()), new CopyPropertiesProvider(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get()))
                .ifTrueThenProvide(BlockPredicate.matchesBlocks(BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get()), new CopyPropertiesProvider(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get()))
                .ifTrueThenProvide(BlockPredicate.matchesBlocks(BVBuildingBlocks.BAMBOO_BLOCK_SLAB.get()), new CopyPropertiesProvider(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get()))
                .ifTrueThenProvide(BlockPredicate.matchesBlocks(BVBuildingBlocks.BAMBOO_BLOCK_WALL.get()), new CopyPropertiesProvider(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get()))
                .ifTrueThenProvide(BlockPredicate.matchesBlocks(BVBuildingBlocks.BAMBOO_BLOCK_FENCE.get()), new CopyPropertiesProvider(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get()))
                .ifTrueThenProvide(BlockPredicate.matchesBlocks(BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.get()), new CopyPropertiesProvider(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get()));

        add(strippables, BVBuildingBlocks.LOG_STAIRS, BVBuildingBlocks.STRIPPED_LOG_STAIRS);
        add(strippables, BVBuildingBlocks.LOG_SLAB, BVBuildingBlocks.STRIPPED_LOG_SLAB);
        add(strippables, BVBuildingBlocks.WOOD_STAIRS, BVBuildingBlocks.STRIPPED_WOOD_STAIRS);
        add(strippables, BVBuildingBlocks.WOOD_SLAB, BVBuildingBlocks.STRIPPED_WOOD_SLAB);
        add(strippables, BVBuildingBlocks.WOOD_WALL, BVBuildingBlocks.STRIPPED_WOOD_WALL);
        add(strippables, BVBuildingBlocks.WOOD_FENCE, BVBuildingBlocks.STRIPPED_WOOD_FENCE);
        add(strippables, BVBuildingBlocks.WOOD_FENCE_GATE, BVBuildingBlocks.STRIPPED_WOOD_FENCE_GATE);

        add(strippables, BVBuildingBlocks.STEM_STAIRS, BVBuildingBlocks.STRIPPED_STEM_STAIRS);
        add(strippables, BVBuildingBlocks.STEM_SLAB, BVBuildingBlocks.STRIPPED_STEM_SLAB);
        add(strippables, BVBuildingBlocks.HYPHAE_STAIRS, BVBuildingBlocks.STRIPPED_HYPHAE_STAIRS);
        add(strippables, BVBuildingBlocks.HYPHAE_SLAB, BVBuildingBlocks.STRIPPED_HYPHAE_SLAB);
        add(strippables, BVBuildingBlocks.HYPHAE_WALL, BVBuildingBlocks.STRIPPED_HYPHAE_WALL);
        add(strippables, BVBuildingBlocks.HYPHAE_FENCE, BVBuildingBlocks.STRIPPED_HYPHAE_FENCE);
        add(strippables, BVBuildingBlocks.HYPHAE_FENCE_GATE, BVBuildingBlocks.STRIPPED_HYPHAE_FENCE_GATE);

        builder(NeoForgeDataMaps.BLOCK_TRANSFORM_APPENDERS)
                .add(BlockTransformers.AXE, new BlockTransformAppender(List.of(BlockTransformer.BlockTransformData.builder(strippables.build()).sound(SoundEvents.AXE_STRIP).build())), false);
    }

    public static void add(RuleBasedStateProvider.Builder builder, WoodTypeCollection<? extends DeferredBlock<? extends Block>> bases, WoodTypeCollection<? extends DeferredBlock<? extends Block>> stripped) {
        WoodTypeCollection.zipCommonApply(bases, stripped, (_, base, s) -> builder.ifTrueThenProvide(BlockPredicate.matchesBlocks(base.get()), new CopyPropertiesProvider(s.get())));
    }
}
