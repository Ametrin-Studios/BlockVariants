package com.barion.block_variants.data.provider;

import com.barion.block_variants.registry.BVBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class BVDataMapProvider extends DataMapProvider {
    public BVDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(@NotNull HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(BVTags.Items.WOODEN_WALLS, new FurnaceFuel(AbstractFurnaceBlockEntity.BURN_TIME_STANDARD * 3 / 2), false)
        ;

        builder(NeoForgeDataMaps.STRIPPABLES)
                .add(BVBlocks.OAK_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_OAK_LOG_STAIRS.get()), false)
                .add(BVBlocks.OAK_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_OAK_LOG_SLAB.get()), false)
                .add(BVBlocks.SPRUCE_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get()), false)
                .add(BVBlocks.SPRUCE_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_SPRUCE_LOG_SLAB.get()), false)
                .add(BVBlocks.BIRCH_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_BIRCH_LOG_STAIRS.get()), false)
                .add(BVBlocks.BIRCH_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_BIRCH_LOG_SLAB.get()), false)
                .add(BVBlocks.JUNGLE_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get()), false)
                .add(BVBlocks.JUNGLE_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_JUNGLE_LOG_SLAB.get()), false)
                .add(BVBlocks.ACACIA_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_ACACIA_LOG_STAIRS.get()), false)
                .add(BVBlocks.ACACIA_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_ACACIA_LOG_SLAB.get()), false)
                .add(BVBlocks.DARK_OAK_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get()), false)
                .add(BVBlocks.DARK_OAK_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get()), false)
                .add(BVBlocks.MANGROVE_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get()), false)
                .add(BVBlocks.MANGROVE_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_MANGROVE_LOG_SLAB.get()), false)
                .add(BVBlocks.CHERRY_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_CHERRY_LOG_STAIRS.get()), false)
                .add(BVBlocks.CHERRY_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_CHERRY_LOG_SLAB.get()), false)
                .add(BVBlocks.PALE_OAK_LOG_STAIRS, new Strippable(BVBlocks.STRIPPED_PALE_OAK_LOG_STAIRS.get()), false)
                .add(BVBlocks.PALE_OAK_LOG_SLAB, new Strippable(BVBlocks.STRIPPED_PALE_OAK_LOG_SLAB.get()), false)

                .add(BVBlocks.OAK_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_OAK_WOOD_STAIRS.get()), false)
                .add(BVBlocks.OAK_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_OAK_WOOD_SLAB.get()), false)
                .add(BVBlocks.OAK_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_OAK_WOOD_WALL.get()), false)
                .add(BVBlocks.OAK_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_OAK_WOOD_FENCE.get()), false)
                .add(BVBlocks.OAK_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.SPRUCE_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get()), false)
                .add(BVBlocks.SPRUCE_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get()), false)
                .add(BVBlocks.SPRUCE_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_SPRUCE_WOOD_WALL.get()), false)
                .add(BVBlocks.SPRUCE_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get()), false)
                .add(BVBlocks.SPRUCE_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.BIRCH_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get()), false)
                .add(BVBlocks.BIRCH_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_BIRCH_WOOD_SLAB.get()), false)
                .add(BVBlocks.BIRCH_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_BIRCH_WOOD_WALL.get()), false)
                .add(BVBlocks.BIRCH_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_BIRCH_WOOD_FENCE.get()), false)
                .add(BVBlocks.BIRCH_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.JUNGLE_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get()), false)
                .add(BVBlocks.JUNGLE_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get()), false)
                .add(BVBlocks.JUNGLE_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_JUNGLE_WOOD_WALL.get()), false)
                .add(BVBlocks.JUNGLE_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get()), false)
                .add(BVBlocks.JUNGLE_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.ACACIA_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get()), false)
                .add(BVBlocks.ACACIA_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_ACACIA_WOOD_SLAB.get()), false)
                .add(BVBlocks.ACACIA_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_ACACIA_WOOD_WALL.get()), false)
                .add(BVBlocks.ACACIA_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_ACACIA_WOOD_FENCE.get()), false)
                .add(BVBlocks.ACACIA_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.DARK_OAK_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get()), false)
                .add(BVBlocks.DARK_OAK_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get()), false)
                .add(BVBlocks.DARK_OAK_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get()), false)
                .add(BVBlocks.DARK_OAK_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get()), false)
                .add(BVBlocks.DARK_OAK_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.MANGROVE_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get()), false)
                .add(BVBlocks.MANGROVE_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get()), false)
                .add(BVBlocks.MANGROVE_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_MANGROVE_WOOD_WALL.get()), false)
                .add(BVBlocks.MANGROVE_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get()), false)
                .add(BVBlocks.MANGROVE_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.CHERRY_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get()), false)
                .add(BVBlocks.CHERRY_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_CHERRY_WOOD_SLAB.get()), false)
                .add(BVBlocks.CHERRY_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_CHERRY_WOOD_WALL.get()), false)
                .add(BVBlocks.CHERRY_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_CHERRY_WOOD_FENCE.get()), false)
                .add(BVBlocks.CHERRY_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.PALE_OAK_WOOD_STAIRS, new Strippable(BVBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS.get()), false)
                .add(BVBlocks.PALE_OAK_WOOD_SLAB, new Strippable(BVBlocks.STRIPPED_PALE_OAK_WOOD_SLAB.get()), false)
                .add(BVBlocks.PALE_OAK_WOOD_WALL, new Strippable(BVBlocks.STRIPPED_PALE_OAK_WOOD_WALL.get()), false)
                .add(BVBlocks.PALE_OAK_WOOD_FENCE, new Strippable(BVBlocks.STRIPPED_PALE_OAK_WOOD_FENCE.get()), false)
                .add(BVBlocks.PALE_OAK_WOOD_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_PALE_OAK_WOOD_FENCE_GATE.get()), false)
                .add(BVBlocks.BAMBOO_BLOCK_STAIRS, new Strippable(BVBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get()), false)
                .add(BVBlocks.BAMBOO_BLOCK_SLAB, new Strippable(BVBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get()), false)
                .add(BVBlocks.BAMBOO_BLOCK_WALL, new Strippable(BVBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get()), false)
                .add(BVBlocks.BAMBOO_BLOCK_FENCE, new Strippable(BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get()), false)
                .add(BVBlocks.BAMBOO_BLOCK_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get()), false)

                .add(BVBlocks.CRIMSON_STEM_STAIRS, new Strippable(BVBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get()), false)
                .add(BVBlocks.CRIMSON_STEM_SLAB, new Strippable(BVBlocks.STRIPPED_CRIMSON_STEM_SLAB.get()), false)
                .add(BVBlocks.WARPED_STEM_STAIRS, new Strippable(BVBlocks.STRIPPED_WARPED_STEM_STAIRS.get()), false)
                .add(BVBlocks.WARPED_STEM_SLAB, new Strippable(BVBlocks.STRIPPED_WARPED_STEM_SLAB.get()), false)

                .add(BVBlocks.CRIMSON_HYPHAE_STAIRS, new Strippable(BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get()), false)
                .add(BVBlocks.CRIMSON_HYPHAE_SLAB, new Strippable(BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get()), false)
                .add(BVBlocks.CRIMSON_HYPHAE_WALL, new Strippable(BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get()), false)
                .add(BVBlocks.CRIMSON_HYPHAE_FENCE, new Strippable(BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get()), false)
                .add(BVBlocks.CRIMSON_HYPHAE_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get()), false)
                .add(BVBlocks.WARPED_HYPHAE_STAIRS, new Strippable(BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get()), false)
                .add(BVBlocks.WARPED_HYPHAE_SLAB, new Strippable(BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get()), false)
                .add(BVBlocks.WARPED_HYPHAE_WALL, new Strippable(BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.get()), false)
                .add(BVBlocks.WARPED_HYPHAE_FENCE, new Strippable(BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get()), false)
                .add(BVBlocks.WARPED_HYPHAE_FENCE_GATE, new Strippable(BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get()), false)
        ;
    }
}
