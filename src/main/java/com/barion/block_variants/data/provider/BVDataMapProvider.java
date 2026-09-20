package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.barion.block_variants.registry.BVBuildingBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.concurrent.CompletableFuture;

public final class BVDataMapProvider extends DataMapProvider {
    public BVDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        var strippables = builder(NeoForgeDataMaps.STRIPPABLES)
                .add(BVBuildingBlocks.BAMBOO_BLOCK_STAIRS, new Strippable(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get()), false)
                .add(BVBuildingBlocks.BAMBOO_BLOCK_SLAB, new Strippable(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get()), false)
                .add(BVBuildingBlocks.BAMBOO_BLOCK_WALL, new Strippable(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get()), false)
                .add(BVBuildingBlocks.BAMBOO_BLOCK_FENCE, new Strippable(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get()), false)
                .add(BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE, new Strippable(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get()), false);

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
    }

    public static void add(DataMapProvider.Builder<Strippable, Block> builder, WoodTypeCollection<? extends DeferredBlock<? extends Block>> bases, WoodTypeCollection<? extends DeferredBlock<? extends Block>> stripped) {
        WoodTypeCollection.zipCommonApply(bases, stripped, (_, base, s) -> builder.add(base, new Strippable(s.get()), false));
    }
}
