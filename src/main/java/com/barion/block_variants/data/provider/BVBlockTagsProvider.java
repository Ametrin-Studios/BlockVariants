package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedBlockTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVColoredBlocks;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public final class BVBlockTagsProvider extends ExtendedBlockTagsProvider {
    public BVBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, BlockVariants.MOD_ID);

        blockTagProviderRules.add((block, name) -> {
            if (name.contains("wool")) {
                tag(BlockTags.OCCLUDES_VIBRATION_SIGNALS).add(block.get());
            }
        });
    }

    @Override
    protected void addTags(HolderLookup.Provider holderLookup) {
        runRules(BlockVariants.getAllBlocks());

        new BVBlockItemTagsProvider() {
            @Override
            protected TagAppender<Block, Block> tag(TagKey<Block> blockTag, TagKey<Item> itemTag) {
                return BVBlockTagsProvider.this.tag(blockTag);
            }
        }.run();

        {
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(
                            BVOtherBlocks.CUT_SANDSTONE_STAIRS.get(),
                            BVOtherBlocks.CUT_RED_SANDSTONE_STAIRS.get(),
                            BVBuildingBlocks.QUARTZ_BRICK_STAIRS.get(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get(),
                            BVBuildingBlocks.NETHERRACK_STAIRS.get(),
                            BVBuildingBlocks.END_STONE_STAIRS.get(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(),
                            BVBuildingBlocks.BASALT_STAIRS.get(),
                            BVBuildingBlocks.POLISHED_BASALT_STAIRS.get(),
                            BVColoredBlocks.TERRACOTTA_STAIRS.get(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_STAIRS.get(),
                            BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.get(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_STAIRS.get(),

                            BVBuildingBlocks.QUARTZ_BRICK_SLAB.get(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get(),
                            BVBuildingBlocks.NETHERRACK_SLAB.get(),
                            BVBuildingBlocks.END_STONE_SLAB.get(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                            BVBuildingBlocks.BASALT_SLAB.get(),
                            BVBuildingBlocks.POLISHED_BASALT_SLAB.get(),
                            BVColoredBlocks.TERRACOTTA_SLAB.get(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_SLAB.get(),
                            BVBuildingBlocks.AMETHYST_BLOCK_SLAB.get(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_SLAB.get(),

                            BVOtherBlocks.POLISHED_DIORITE_WALL.get(),
                            BVOtherBlocks.POLISHED_GRANITE_WALL.get(),
                            BVOtherBlocks.POLISHED_ANDESITE_WALL.get(),
                            BVOtherBlocks.STONE_WALL.get(),
                            BVOtherBlocks.SMOOTH_STONE_STAIRS.get(),
                            BVOtherBlocks.SMOOTH_STONE_WALL.get(),
                            BVOtherBlocks.SMOOTH_SANDSTONE_WALL.get(),
                            BVOtherBlocks.SMOOTH_RED_SANDSTONE_WALL.get(),
                            BVOtherBlocks.CUT_SANDSTONE_WALL.get(),
                            BVOtherBlocks.CUT_RED_SANDSTONE_WALL.get(),
                            BVBuildingBlocks.QUARTZ_WALL.get(),
                            BVBuildingBlocks.QUARTZ_BRICK_WALL.get(),
                            BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(),
                            BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL.get(),
                            BVOtherBlocks.PRISMARINE_BRICK_WALL.get(),
                            BVOtherBlocks.DARK_PRISMARINE_WALL.get(),
                            BVBuildingBlocks.NETHERRACK_WALL.get(),
                            BVBuildingBlocks.END_STONE_WALL.get(),
                            BVOtherBlocks.PURPUR_WALL.get(),
                            BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(),
                            BVBuildingBlocks.BASALT_WALL.get(),
                            BVBuildingBlocks.POLISHED_BASALT_WALL.get(),
                            BVColoredBlocks.TERRACOTTA_WALL.get(),
                            BVBuildingBlocks.DRIPSTONE_BLOCK_WALL.get(),
                            BVBuildingBlocks.AMETHYST_BLOCK_WALL.get(),
                            BVBuildingBlocks.CRACKED_STONE_BRICK_WALL.get(),

                            BVBuildingBlocks.CALCITE_STAIRS.get(),
                            BVBuildingBlocks.CALCITE_SLAB.get(),
                            BVBuildingBlocks.CALCITE_WALL.get(),
                            BVBuildingBlocks.SMOOTH_BASALT_STAIRS.get(),
                            BVBuildingBlocks.SMOOTH_BASALT_SLAB.get(),
                            BVBuildingBlocks.SMOOTH_BASALT_WALL.get(),

                            BVBuildingBlocks.DEEPSLATE_STAIRS.get(),
                            BVBuildingBlocks.DEEPSLATE_SLAB.get(),
                            BVBuildingBlocks.DEEPSLATE_WALL.get(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(),
                            BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(),

                            BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.get(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_STAIRS.get(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_SLAB.get(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_WALL.get(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.get(),
                            BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(),
                            BVBuildingBlocks.RED_NETHER_BRICK_FENCE.get(),
                            BVBuildingBlocks.RED_NETHER_BRICK_FENCE_GATE.get(),

                            BVBuildingBlocks.OBSIDIAN_STAIRS.get(),
                            BVBuildingBlocks.OBSIDIAN_SLAB.get(),
                            BVBuildingBlocks.OBSIDIAN_WALL.get(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.get(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.get(),
                            BVBuildingBlocks.CRYING_OBSIDIAN_WALL.get(),

                            BVBuildingBlocks.PACKED_MUD_STAIRS.get(),
                            BVBuildingBlocks.PACKED_MUD_SLAB.get(),
                            BVBuildingBlocks.PACKED_MUD_WALL.get(),

                            BVOtherBlocks.GOLD_GRATE.get()
                    )
                    .addAll(BVColoredBlocks.DYED_TERRACOTTA_STAIRS.asList().stream().map(Supplier::get))
                    .addAll(BVColoredBlocks.DYED_TERRACOTTA_SLAB.asList().stream().map(Supplier::get))
                    .addAll(BVColoredBlocks.DYED_TERRACOTTA_WALL.asList().stream().map(Supplier::get))
                    .addAll(BVColoredBlocks.GLAZED_TERRACOTTA_STAIRS.asList().stream().map(Supplier::get))
                    .addAll(BVColoredBlocks.GLAZED_TERRACOTTA_SLAB.asList().stream().map(Supplier::get))
                    .addAll(BVColoredBlocks.GLAZED_TERRACOTTA_WALL.asList().stream().map(Supplier::get))
                    // minecraft:walls seems to be part of mineable with pickaxe
                    .remove(BVTags.Blocks.WOOL_WALLS);
        } // needs Pickaxe

        {
            var minableWithAxe = tag(BlockTags.MINEABLE_WITH_AXE).add(
                    BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get(),
                    BVBuildingBlocks.BAMBOO_BLOCK_SLAB.get(),
                    BVBuildingBlocks.BAMBOO_BLOCK_WALL.get(),
                    BVBuildingBlocks.BAMBOO_BLOCK_FENCE.get(),
                    BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.get(),

                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(),
                    BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get()
            );

            for (var collection : BVBuildingBlocks.ALL_WOODEN) {
                minableWithAxe.addAll(collection.stream().map(Supplier::get));
            }
        } // needs Axe

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                BVOtherBlocks.GOLD_BARS.get(),
                BVOtherBlocks.GOLD_CHAIN.get(),
                BVOtherBlocks.GOLD_GRATE.get()
        );

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                BVBuildingBlocks.OBSIDIAN_STAIRS.get(),
                BVBuildingBlocks.OBSIDIAN_SLAB.get(),
                BVBuildingBlocks.OBSIDIAN_WALL.get(),
                BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.get(),
                BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.get(),
                BVBuildingBlocks.CRYING_OBSIDIAN_WALL.get()
        );

        tag(BlockTags.CRYSTAL_SOUND_BLOCKS).add(
                BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.get(),
                BVBuildingBlocks.AMETHYST_BLOCK_SLAB.get(),
                BVBuildingBlocks.AMETHYST_BLOCK_WALL.get()
        );

        tag(BlockTags.VIBRATION_RESONATORS).add(
                BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.get(),
                BVBuildingBlocks.AMETHYST_BLOCK_SLAB.get(),
                BVBuildingBlocks.AMETHYST_BLOCK_WALL.get()
        );

        tag(BlockTags.DRAGON_IMMUNE).add(
                BVBuildingBlocks.END_STONE_STAIRS.get(),
                BVBuildingBlocks.END_STONE_SLAB.get(),
                BVBuildingBlocks.END_STONE_WALL.get()
        );
    }
}