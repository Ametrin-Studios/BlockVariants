package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.data.DataProviderExtensions;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.google.common.collect.Maps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ColorCollection;

import java.util.Comparator;
import java.util.Map;

public final class BVBlockFamilies {
    public static final Map<Block, BlockFamily> MAP = Maps.newTreeMap(Comparator.comparing(DataProviderExtensions::getBlockKey));

    public static final BlockFamily QUARTZ_BRICKS = familyBuilder(Blocks.QUARTZ_BRICKS)
            .stairs(BVBuildingBlocks.QUARTZ_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.QUARTZ_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.QUARTZ_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily CHISELED_QUARTZ_BLOCK = familyBuilder(Blocks.CHISELED_QUARTZ_BLOCK)
            .stairs(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily NETHERRACK = familyBuilder(Blocks.NETHERRACK)
            .stairs(BVBuildingBlocks.NETHERRACK_STAIRS.get())
            .slab(BVBuildingBlocks.NETHERRACK_SLAB.get())
            .wall(BVBuildingBlocks.NETHERRACK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily END_STONE = familyBuilder(Blocks.END_STONE)
            .stairs(BVBuildingBlocks.END_STONE_STAIRS.get())
            .slab(BVBuildingBlocks.END_STONE_SLAB.get())
            .wall(BVBuildingBlocks.END_STONE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily CRACKED_POLISHED_BLACKSTONE_BRICKS = familyBuilder(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily BASALT = familyBuilder(Blocks.BASALT)
            .stairs(BVBuildingBlocks.BASALT_STAIRS.get())
            .slab(BVBuildingBlocks.BASALT_SLAB.get())
            .wall(BVBuildingBlocks.BASALT_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily POLISHED_BASALT = familyBuilder(Blocks.POLISHED_BASALT)
            .stairs(BVBuildingBlocks.POLISHED_BASALT_STAIRS.get())
            .slab(BVBuildingBlocks.POLISHED_BASALT_SLAB.get())
            .wall(BVBuildingBlocks.POLISHED_BASALT_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily DRIPSTONE_BLOCK = familyBuilder(Blocks.DRIPSTONE_BLOCK)
            .stairs(BVBuildingBlocks.DRIPSTONE_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.DRIPSTONE_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.DRIPSTONE_BLOCK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily AMETHYST_BLOCK = familyBuilder(Blocks.AMETHYST_BLOCK)
            .stairs(BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.AMETHYST_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.AMETHYST_BLOCK_WALL.get())
            .getFamily();
    public static final BlockFamily CRACKED_STONE_BRICKS = familyBuilder(Blocks.CRACKED_STONE_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_STONE_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_STONE_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_STONE_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final WoodTypeCollection<BlockFamily> LOG = WoodTypeCollection.VANILLA_OVERWORLD_LOGS.map((type, base) ->
            logFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.LOG_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.LOG_SLAB.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> STRIPPED_LOG = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_LOGS.map((type, base) ->
            logFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.STRIPPED_LOG_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.STRIPPED_LOG_SLAB.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> WOOD = WoodTypeCollection.VANILLA_OVERWORLD_WOODS.map((type, base) ->
            woodFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.WOOD_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.WOOD_SLAB.pick(type).orElseThrow().get())
                    .wall(BVBuildingBlocks.WOOD_WALL.pick(type).orElseThrow().get())
                    .fence(BVBuildingBlocks.WOOD_FENCE.pick(type).orElseThrow().get())
                    .fenceGate(BVBuildingBlocks.WOOD_FENCE_GATE.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> STRIPPED_WOOD = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_WOODS.map((type, base) ->
            woodFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.STRIPPED_WOOD_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.STRIPPED_WOOD_SLAB.pick(type).orElseThrow().get())
                    .wall(BVBuildingBlocks.STRIPPED_WOOD_WALL.pick(type).orElseThrow().get())
                    .fence(BVBuildingBlocks.STRIPPED_WOOD_FENCE.pick(type).orElseThrow().get())
                    .fenceGate(BVBuildingBlocks.STRIPPED_WOOD_FENCE_GATE.pick(type).orElseThrow().get())
            )
    );

    // BAMBOO_BLOCK
    public static final BlockFamily BAMBOO_BLOCK = familyBuilder(Blocks.BAMBOO_BLOCK)
            .stairs(BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.BAMBOO_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.BAMBOO_BLOCK_WALL.get())
            .fence(BVBuildingBlocks.BAMBOO_BLOCK_FENCE.get())
            .fenceGate(BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.get())
            .getFamily();
    public static final BlockFamily STRIPPED_BAMBOO_BLOCK = familyBuilder(Blocks.STRIPPED_BAMBOO_BLOCK)
            .stairs(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get())
            .getFamily();

    public static final WoodTypeCollection<BlockFamily> STEM = WoodTypeCollection.VANILLA_NETHER_STEMS.map((type, base) ->
            logFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.STEM_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.STEM_SLAB.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> STRIPPED_STEM = WoodTypeCollection.VANILLA_NETHER_STRIPPED_STEMS.map((type, base) ->
            logFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.STRIPPED_STEM_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.STRIPPED_STEM_SLAB.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> HYPHAE = WoodTypeCollection.VANILLA_NETHER_HYPHAES.map((type, base) ->
            woodFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.HYPHAE_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.HYPHAE_SLAB.pick(type).orElseThrow().get())
                    .wall(BVBuildingBlocks.HYPHAE_WALL.pick(type).orElseThrow().get())
                    .fence(BVBuildingBlocks.HYPHAE_FENCE.pick(type).orElseThrow().get())
                    .fenceGate(BVBuildingBlocks.HYPHAE_FENCE_GATE.pick(type).orElseThrow().get())
            )
    );

    public static final WoodTypeCollection<BlockFamily> STRIPPED_HYPHAE = WoodTypeCollection.VANILLA_NETHER_STRIPPED_HYPHAES.map((type, base) ->
            woodFamily(familyBuilder(base)
                    .stairs(BVBuildingBlocks.STRIPPED_HYPHAE_STAIRS.pick(type).orElseThrow().get())
                    .slab(BVBuildingBlocks.STRIPPED_HYPHAE_SLAB.pick(type).orElseThrow().get())
                    .wall(BVBuildingBlocks.STRIPPED_HYPHAE_WALL.pick(type).orElseThrow().get())
                    .fence(BVBuildingBlocks.STRIPPED_HYPHAE_FENCE.pick(type).orElseThrow().get())
                    .fenceGate(BVBuildingBlocks.STRIPPED_HYPHAE_FENCE_GATE.pick(type).orElseThrow().get())
            )
    );


    public static final BlockFamily CALCITE = familyBuilder(Blocks.CALCITE)
            .stairs(BVBuildingBlocks.CALCITE_STAIRS.get())
            .slab(BVBuildingBlocks.CALCITE_SLAB.get())
            .wall(BVBuildingBlocks.CALCITE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily SMOOTH_BASALT = familyBuilder(Blocks.SMOOTH_BASALT)
            .stairs(BVBuildingBlocks.SMOOTH_BASALT_STAIRS.get())
            .slab(BVBuildingBlocks.SMOOTH_BASALT_SLAB.get())
            .wall(BVBuildingBlocks.SMOOTH_BASALT_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily DEEPSLATE = familyBuilder(Blocks.DEEPSLATE)
            .stairs(BVBuildingBlocks.DEEPSLATE_STAIRS.get())
            .slab(BVBuildingBlocks.DEEPSLATE_SLAB.get())
            .wall(BVBuildingBlocks.DEEPSLATE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily CRACKED_DEEPSLATE_BRICKS = familyBuilder(Blocks.CRACKED_DEEPSLATE_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily CRACKED_DEEPSLATE_TILES = familyBuilder(Blocks.CRACKED_DEEPSLATE_TILES)
            .stairs(BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final BlockFamily CRACKED_NETHER_BRICKS = familyBuilder(Blocks.CRACKED_NETHER_BRICKS)
            .stairs(BVBuildingBlocks.CRACKED_NETHER_BRICK_STAIRS.get())
            .slab(BVBuildingBlocks.CRACKED_NETHER_BRICK_SLAB.get())
            .wall(BVBuildingBlocks.CRACKED_NETHER_BRICK_WALL.get())
//            .fence(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.get())
//            .fenceGate(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get())
            .generateStonecutterRecipe()
            .getFamily();
    public static final BlockFamily RED_NETHER_BRICKS = familyBuilder(Blocks.RED_NETHER_BRICKS)
            .fence(BVBuildingBlocks.RED_NETHER_BRICK_FENCE.get())
            .fenceGate(BVBuildingBlocks.RED_NETHER_BRICK_FENCE_GATE.get())
            .getFamily();


    public static final BlockFamily OBSIDIAN = familyBuilder(Blocks.OBSIDIAN)
            .stairs(BVBuildingBlocks.OBSIDIAN_STAIRS.get())
            .slab(BVBuildingBlocks.OBSIDIAN_SLAB.get())
            .wall(BVBuildingBlocks.OBSIDIAN_WALL.get())
            .getFamily();
    public static final BlockFamily CRYING_OBSIDIAN = familyBuilder(Blocks.CRYING_OBSIDIAN)
            .stairs(BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.get())
            .slab(BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.get())
            .wall(BVBuildingBlocks.CRYING_OBSIDIAN_WALL.get())
            .getFamily();

    public static final BlockFamily TERRACOTTA = familyBuilder(Blocks.TERRACOTTA)
            .stairs(BVColoredBlocks.TERRACOTTA_STAIRS.get())
            .slab(BVColoredBlocks.TERRACOTTA_SLAB.get())
            .wall(BVColoredBlocks.TERRACOTTA_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    public static final ColorCollection<BlockFamily> DYED_TERRACOTTA = ColorCollection.VALUES
            .map(
                    color -> familyBuilder(Blocks.DYED_TERRACOTTA.pick(color))
                            .stairs(BVColoredBlocks.DYED_TERRACOTTA_STAIRS.pick(color).get())
                            .slab(BVColoredBlocks.DYED_TERRACOTTA_SLAB.pick(color).get())
                            .wall(BVColoredBlocks.DYED_TERRACOTTA_WALL.pick(color).get())
                            .generateStonecutterRecipe()
                            .getFamily()
            );

    public static final ColorCollection<BlockFamily> GLAZED_TERRACOTTA = ColorCollection.VALUES
            .map(
                    color -> familyBuilder(Blocks.GLAZED_TERRACOTTA.pick(color))
                            .stairs(BVColoredBlocks.GLAZED_TERRACOTTA_STAIRS.pick(color).get())
                            .slab(BVColoredBlocks.GLAZED_TERRACOTTA_SLAB.pick(color).get())
                            .wall(BVColoredBlocks.GLAZED_TERRACOTTA_WALL.pick(color).get())
                            .generateStonecutterRecipe()
                            .getFamily()
            );

    public static final BlockFamily PACKED_MUD = familyBuilder(Blocks.PACKED_MUD)
            .stairs(BVBuildingBlocks.PACKED_MUD_STAIRS.get())
            .slab(BVBuildingBlocks.PACKED_MUD_SLAB.get())
            .wall(BVBuildingBlocks.PACKED_MUD_WALL.get())
            .generateStonecutterRecipe()
            .getFamily();

    private static BlockFamily logFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();
        validateLogFamily(family);
        return family;
    }

    private static BlockFamily woodFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();
        validateWoodFamily(family);
        return family;
    }

    private static BlockFamily.Builder familyBuilder(Block base) {
        var builder = new BlockFamily.Builder(base);
        var blockFamily = MAP.put(base, builder.getFamily());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + BuiltInRegistries.BLOCK.getKey(base));
        } else {
            return builder;
        }
    }

    public static void validateLogFamily(BlockFamily family) {
        var variants = family.getVariants();
        if (!variants.containsKey(BlockFamily.Variant.STAIRS)) {
            throw new UnsupportedOperationException("missing stairs");
        }
        if (!variants.containsKey(BlockFamily.Variant.SLAB)) {
            throw new UnsupportedOperationException("missing slab");
        }
    }

    public static void validateWoodFamily(BlockFamily family) {
        var variants = family.getVariants();
        if (!variants.containsKey(BlockFamily.Variant.STAIRS)) {
            throw new UnsupportedOperationException("missing stairs");
        }
        if (!variants.containsKey(BlockFamily.Variant.SLAB)) {
            throw new UnsupportedOperationException("missing slab");
        }
        if (!variants.containsKey(BlockFamily.Variant.WALL)) {
            throw new UnsupportedOperationException("missing wall");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE)) {
            throw new UnsupportedOperationException("missing fence");
        }
        if (!variants.containsKey(BlockFamily.Variant.FENCE_GATE)) {
            throw new UnsupportedOperationException("missing fence gate");
        }
    }
}
