package com.ametrin.block_variants.data.provider;

import com.ametrin.block_variants.BlockVariants;
import com.ametrin.block_variants.registry.*;
import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
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
                tag(BlockTags.OCCLUDES_VIBRATION_SIGNALS).add(block.key());
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
                            BVOtherBlocks.CUT_SANDSTONE_STAIRS.key(),
                            BVOtherBlocks.CUT_RED_SANDSTONE_STAIRS.key(),
                            BVBuildingBlocks.QUARTZ_BRICK_STAIRS.key(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.key(),
                            BVBuildingBlocks.NETHERRACK_STAIRS.key(),
                            BVBuildingBlocks.END_STONE_STAIRS.key(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.key(),
                            BVBuildingBlocks.BASALT_STAIRS.key(),
                            BVBuildingBlocks.POLISHED_BASALT_STAIRS.key(),
                            BVColoredBlocks.TERRACOTTA_STAIRS.key(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_STAIRS.key(),
                            BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.key(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_STAIRS.key(),

                            BVBuildingBlocks.QUARTZ_BRICK_SLAB.key(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_SLAB.key(),
                            BVBuildingBlocks.NETHERRACK_SLAB.key(),
                            BVBuildingBlocks.END_STONE_SLAB.key(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.key(),
                            BVBuildingBlocks.BASALT_SLAB.key(),
                            BVBuildingBlocks.POLISHED_BASALT_SLAB.key(),
                            BVColoredBlocks.TERRACOTTA_SLAB.key(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_SLAB.key(),
                            BVBuildingBlocks.AMETHYST_BLOCK_SLAB.key(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_SLAB.key(),

                            BVOtherBlocks.POLISHED_DIORITE_WALL.key(),
                            BVOtherBlocks.POLISHED_GRANITE_WALL.key(),
                            BVOtherBlocks.POLISHED_ANDESITE_WALL.key(),
                            BVOtherBlocks.STONE_WALL.key(),
                            BVOtherBlocks.SMOOTH_STONE_STAIRS.key(),
                            BVOtherBlocks.SMOOTH_STONE_WALL.key(),
                            BVOtherBlocks.SMOOTH_SANDSTONE_WALL.key(),
                            BVOtherBlocks.SMOOTH_RED_SANDSTONE_WALL.key(),
                            BVOtherBlocks.CUT_SANDSTONE_WALL.key(),
                            BVOtherBlocks.CUT_RED_SANDSTONE_WALL.key(),
                            BVBuildingBlocks.QUARTZ_WALL.key(),
                            BVBuildingBlocks.QUARTZ_BRICK_WALL.key(),
                            BVBuildingBlocks.SMOOTH_QUARTZ_WALL.key(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL.key(),
                            BVOtherBlocks.PRISMARINE_BRICK_WALL.key(),
                            BVOtherBlocks.DARK_PRISMARINE_WALL.key(),
                            BVBuildingBlocks.NETHERRACK_WALL.key(),
                            BVBuildingBlocks.END_STONE_WALL.key(),
                            BVOtherBlocks.PURPUR_WALL.key(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.key(),
                            BVBuildingBlocks.BASALT_WALL.key(),
                            BVBuildingBlocks.POLISHED_BASALT_WALL.key(),
                            BVColoredBlocks.TERRACOTTA_WALL.key(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_WALL.key(),
                            BVBuildingBlocks.AMETHYST_BLOCK_WALL.key(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_WALL.key(),

                            BVBuildingBlocks.CALCITE_STAIRS.key(),
                            BVBuildingBlocks.CALCITE_SLAB.key(),
                            BVBuildingBlocks.CALCITE_WALL.key(),
                            BVBuildingBlocks.SMOOTH_BASALT_STAIRS.key(),
                            BVBuildingBlocks.SMOOTH_BASALT_SLAB.key(),
                            BVBuildingBlocks.SMOOTH_BASALT_WALL.key(),

                            BVBuildingBlocks.DEEPSLATE_STAIRS.key(),
                            BVBuildingBlocks.DEEPSLATE_SLAB.key(),
                            BVBuildingBlocks.DEEPSLATE_WALL.key(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.key(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.key(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL.key(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.key(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB.key(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL.key(),

                            BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.key(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_STAIRS.key(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_SLAB.key(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_WALL.key(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.key(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.key(),
                            BVBuildingBlocks.RED_NETHER_BRICK_FENCE.key(),
                            BVBuildingBlocks.RED_NETHER_BRICK_FENCE_GATE.key(),

                            BVBuildingBlocks.OBSIDIAN_STAIRS.key(),
                            BVBuildingBlocks.OBSIDIAN_SLAB.key(),
                            BVBuildingBlocks.OBSIDIAN_WALL.key(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.key(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.key(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_WALL.key(),

                            BVBuildingBlocks.PACKED_MUD_STAIRS.key(),
                            BVBuildingBlocks.PACKED_MUD_SLAB.key(),
                            BVBuildingBlocks.PACKED_MUD_WALL.key(),

                            BVOtherBlocks.GOLD_GRATE.key()
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
                    BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.key(),
                    BVBuildingBlocks.BAMBOO_BLOCK_SLAB.key(),
                    BVBuildingBlocks.BAMBOO_BLOCK_WALL.key(),
                    BVBuildingBlocks.BAMBOO_BLOCK_FENCE.key(),
                    BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.key(),

                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.key(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.key(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.key(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.key(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.key()
            );
            minableWithAxe.addAll(BVBlockItemIds.ALL_WOODEN.stream().flatMap(WoodTypeCollection::stream).map(BlockItemId::block));
        } // needs Axe

        tag(BlockTags.SHEARS_MAJOR_BREAKING_SPEED).addTag(BVTags.Blocks.WOOL_WALLS);

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                BVOtherBlocks.GOLD_BARS.key(),
                BVOtherBlocks.GOLD_CHAIN.key(),
                BVOtherBlocks.GOLD_GRATE.key()
        );

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                BVBuildingBlocks.OBSIDIAN_STAIRS.key(),
                BVBuildingBlocks.OBSIDIAN_SLAB.key(),
                BVBuildingBlocks.OBSIDIAN_WALL.key(),
                BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.key(),
                BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.key(),
                BVBuildingBlocks.CRYING_OBSIDIAN_WALL.key()
        );

        tag(BlockTags.CRYSTAL_SOUND_BLOCKS).add(
                BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.key(),
                BVBuildingBlocks.AMETHYST_BLOCK_SLAB.key(),
                BVBuildingBlocks.AMETHYST_BLOCK_WALL.key()
        );

        tag(BlockTags.VIBRATION_RESONATORS).add(
                BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.key(),
                BVBuildingBlocks.AMETHYST_BLOCK_SLAB.key(),
                BVBuildingBlocks.AMETHYST_BLOCK_WALL.key()
        );

        tag(BlockTags.DRAGON_IMMUNE).add(
                BVBuildingBlocks.END_STONE_STAIRS.key(),
                BVBuildingBlocks.END_STONE_SLAB.key(),
                BVBuildingBlocks.END_STONE_WALL.key()
        );
    }
}