package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BlockItemTagsProvider;
import net.minecraft.references.BlockItemId;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public final class BVBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BVBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, BlockVariants.MOD_ID);

        blockTagProviderRules.add((block, name) -> {
            if (name.contains("wool")) {
                tag(BlockTags.OCCLUDES_VIBRATION_SIGNALS).add(block.getKey());
            }
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void addTags(HolderLookup.Provider holderLookup) {
        runRules(BlockVariants.getAllBlocks());

        new BVBlockItemTagsProvider(tags -> BlockItemTagsProvider.wrapForBlocks(tag(tags.block()))).run();

        {
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(
                            BVOtherBlocks.CUT_SANDSTONE_STAIRS.getKey(),
                            BVOtherBlocks.CUT_RED_SANDSTONE_STAIRS.getKey(),
                            BVBuildingBlocks.QUARTZ_BRICK_STAIRS.getKey(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.getKey(),
                            BVBuildingBlocks.NETHERRACK_STAIRS.getKey(),
                            BVBuildingBlocks.END_STONE_STAIRS.getKey(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.getKey(),
                            BVBuildingBlocks.BASALT_STAIRS.getKey(),
                            BVBuildingBlocks.POLISHED_BASALT_STAIRS.getKey(),
                            BVColoredBlocks.TERRACOTTA_STAIRS.getKey(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_STAIRS.getKey(),
                            BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.getKey(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_STAIRS.getKey(),

                            BVBuildingBlocks.QUARTZ_BRICK_SLAB.getKey(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_SLAB.getKey(),
                            BVBuildingBlocks.NETHERRACK_SLAB.getKey(),
                            BVBuildingBlocks.END_STONE_SLAB.getKey(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.getKey(),
                            BVBuildingBlocks.BASALT_SLAB.getKey(),
                            BVBuildingBlocks.POLISHED_BASALT_SLAB.getKey(),
                            BVColoredBlocks.TERRACOTTA_SLAB.getKey(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_SLAB.getKey(),
                            BVBuildingBlocks.AMETHYST_BLOCK_SLAB.getKey(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_SLAB.getKey(),

                            BVOtherBlocks.POLISHED_DIORITE_WALL.getKey(),
                            BVOtherBlocks.POLISHED_GRANITE_WALL.getKey(),
                            BVOtherBlocks.POLISHED_ANDESITE_WALL.getKey(),
                            BVOtherBlocks.STONE_WALL.getKey(),
                            BVOtherBlocks.SMOOTH_STONE_STAIRS.getKey(),
                            BVOtherBlocks.SMOOTH_STONE_WALL.getKey(),
                            BVOtherBlocks.SMOOTH_SANDSTONE_WALL.getKey(),
                            BVOtherBlocks.SMOOTH_RED_SANDSTONE_WALL.getKey(),
                            BVOtherBlocks.CUT_SANDSTONE_WALL.getKey(),
                            BVOtherBlocks.CUT_RED_SANDSTONE_WALL.getKey(),
                            BVBuildingBlocks.QUARTZ_WALL.getKey(),
                            BVBuildingBlocks.QUARTZ_BRICK_WALL.getKey(),
                            BVBuildingBlocks.SMOOTH_QUARTZ_WALL.getKey(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL.getKey(),
                            BVOtherBlocks.PRISMARINE_BRICK_WALL.getKey(),
                            BVOtherBlocks.DARK_PRISMARINE_WALL.getKey(),
                            BVBuildingBlocks.NETHERRACK_WALL.getKey(),
                            BVBuildingBlocks.END_STONE_WALL.getKey(),
                            BVOtherBlocks.PURPUR_WALL.getKey(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.getKey(),
                            BVBuildingBlocks.BASALT_WALL.getKey(),
                            BVBuildingBlocks.POLISHED_BASALT_WALL.getKey(),
                            BVColoredBlocks.TERRACOTTA_WALL.getKey(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_WALL.getKey(),
                            BVBuildingBlocks.AMETHYST_BLOCK_WALL.getKey(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_WALL.getKey(),

                            BVBuildingBlocks.CALCITE_STAIRS.getKey(),
                            BVBuildingBlocks.CALCITE_SLAB.getKey(),
                            BVBuildingBlocks.CALCITE_WALL.getKey(),
                            BVBuildingBlocks.SMOOTH_BASALT_STAIRS.getKey(),
                            BVBuildingBlocks.SMOOTH_BASALT_SLAB.getKey(),
                            BVBuildingBlocks.SMOOTH_BASALT_WALL.getKey(),

                            BVBuildingBlocks.DEEPSLATE_STAIRS.getKey(),
                            BVBuildingBlocks.DEEPSLATE_SLAB.getKey(),
                            BVBuildingBlocks.DEEPSLATE_WALL.getKey(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.getKey(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.getKey(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL.getKey(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.getKey(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB.getKey(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL.getKey(),

                            BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.getKey(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_STAIRS.getKey(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_SLAB.getKey(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_WALL.getKey(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.getKey(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.getKey(),
                            BVBuildingBlocks.RED_NETHER_BRICK_FENCE.getKey(),
                            BVBuildingBlocks.RED_NETHER_BRICK_FENCE_GATE.getKey(),

                            BVBuildingBlocks.OBSIDIAN_STAIRS.getKey(),
                            BVBuildingBlocks.OBSIDIAN_SLAB.getKey(),
                            BVBuildingBlocks.OBSIDIAN_WALL.getKey(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.getKey(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.getKey(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_WALL.getKey(),

                            BVBuildingBlocks.PACKED_MUD_STAIRS.getKey(),
                            BVBuildingBlocks.PACKED_MUD_SLAB.getKey(),
                            BVBuildingBlocks.PACKED_MUD_WALL.getKey(),

                            BVOtherBlocks.GOLD_GRATE.getKey()
                    )
                    .addAll(BVBlockItemIds.DYED_TERRACOTTA_STAIRS.asList().stream().map(BlockItemId::block))
                    .addAll(BVBlockItemIds.DYED_TERRACOTTA_SLAB.asList().stream().map(BlockItemId::block))
                    .addAll(BVBlockItemIds.DYED_TERRACOTTA_WALL.asList().stream().map(BlockItemId::block))
                    .addAll(BVBlockItemIds.GLAZED_TERRACOTTA_STAIRS.asList().stream().map(BlockItemId::block))
                    .addAll(BVBlockItemIds.GLAZED_TERRACOTTA_SLAB.asList().stream().map(BlockItemId::block))
                    .addAll(BVBlockItemIds.GLAZED_TERRACOTTA_WALL.asList().stream().map(BlockItemId::block))
                    // minecraft:walls seems to be part of mineable with pickaxe
                    .remove(BVTags.Blocks.WOOL_WALLS);
        } // needs Pickaxe

        {
            var minableWithAxe = tag(BlockTags.MINEABLE_WITH_AXE).add(
                    BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.getKey(),
                    BVBuildingBlocks.BAMBOO_BLOCK_SLAB.getKey(),
                    BVBuildingBlocks.BAMBOO_BLOCK_WALL.getKey(),
                    BVBuildingBlocks.BAMBOO_BLOCK_FENCE.getKey(),
                    BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.getKey(),

                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.getKey(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.getKey(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.getKey(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.getKey(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.getKey()
            );
            minableWithAxe.addAll(BVBlockItemIds.ALL_WOODEN.stream().flatMap(WoodTypeCollection::stream).map(BlockItemId::block));
        } // needs Axe

        tag(BlockTags.SHEARS_MAJOR_BREAKING_SPEED).addTag(BVTags.Blocks.WOOL_WALLS);

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                BVOtherBlocks.GOLD_BARS.getKey(),
                BVOtherBlocks.GOLD_CHAIN.getKey(),
                BVOtherBlocks.GOLD_GRATE.getKey()
        );

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                BVBuildingBlocks.OBSIDIAN_STAIRS.getKey(),
                BVBuildingBlocks.OBSIDIAN_SLAB.getKey(),
                BVBuildingBlocks.OBSIDIAN_WALL.getKey(),
                BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.getKey(),
                BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.getKey(),
                BVBuildingBlocks.CRYING_OBSIDIAN_WALL.getKey()
        );

        tag(BlockTags.CRYSTAL_SOUND_BLOCKS).add(
                BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.getKey(),
                BVBuildingBlocks.AMETHYST_BLOCK_SLAB.getKey(),
                BVBuildingBlocks.AMETHYST_BLOCK_WALL.getKey()
        );

        tag(BlockTags.VIBRATION_RESONATORS).add(
                BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.getKey(),
                BVBuildingBlocks.AMETHYST_BLOCK_SLAB.getKey(),
                BVBuildingBlocks.AMETHYST_BLOCK_WALL.getKey()
        );

        tag(BlockTags.DRAGON_IMMUNE).add(
                BVBuildingBlocks.END_STONE_STAIRS.getKey(),
                BVBuildingBlocks.END_STONE_SLAB.getKey(),
                BVBuildingBlocks.END_STONE_WALL.getKey()
        );
    }
}