package com.barion.block_variants.registry;

import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public final class BVBlockFamilies {
    public static List<BlockFamily> LOG_FAMILIES = new ArrayList<>();
    public static List<BlockFamily> WOOD_FAMILIES = new ArrayList<>();

    // OAK
    public static final BlockFamily OAK_LOG = logFamily(new BlockFamily.Builder(Blocks.OAK_LOG)
            .stairs(BVBuildingBlocks.OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.OAK_LOG_SLAB.get()));
    public static final BlockFamily OAK_WOOD = woodFamily(new BlockFamily.Builder(Blocks.OAK_WOOD)
            .stairs(BVBuildingBlocks.OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.OAK_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_OAK_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_OAK_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_OAK_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_OAK_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get()));

    // SPRUCE
    public static final BlockFamily SPRUCE_LOG = logFamily(new BlockFamily.Builder(Blocks.SPRUCE_LOG)
            .stairs(BVBuildingBlocks.SPRUCE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.SPRUCE_LOG_SLAB.get()));
    public static final BlockFamily SPRUCE_WOOD = woodFamily(new BlockFamily.Builder(Blocks.SPRUCE_WOOD)
            .stairs(BVBuildingBlocks.SPRUCE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.SPRUCE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.SPRUCE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.SPRUCE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.SPRUCE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_SPRUCE_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_SPRUCE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_SPRUCE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_SPRUCE_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_SPRUCE_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get()));

    // BIRCH
    public static final BlockFamily BIRCH_LOG = logFamily(new BlockFamily.Builder(Blocks.BIRCH_LOG)
            .stairs(BVBuildingBlocks.BIRCH_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.BIRCH_LOG_SLAB.get()));
    public static final BlockFamily BIRCH_WOOD = woodFamily(new BlockFamily.Builder(Blocks.BIRCH_WOOD)
            .stairs(BVBuildingBlocks.BIRCH_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.BIRCH_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.BIRCH_WOOD_WALL.get())
            .fence(BVBuildingBlocks.BIRCH_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.BIRCH_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_BIRCH_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_BIRCH_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_BIRCH_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_BIRCH_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_BIRCH_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_BIRCH_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get()));

    // JUNGLE
    public static final BlockFamily JUNGLE_LOG = logFamily(new BlockFamily.Builder(Blocks.JUNGLE_LOG)
            .stairs(BVBuildingBlocks.JUNGLE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.JUNGLE_LOG_SLAB.get()));
    public static final BlockFamily JUNGLE_WOOD = woodFamily(new BlockFamily.Builder(Blocks.JUNGLE_WOOD)
            .stairs(BVBuildingBlocks.JUNGLE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.JUNGLE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.JUNGLE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.JUNGLE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.JUNGLE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_JUNGLE_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_JUNGLE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_JUNGLE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_JUNGLE_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_JUNGLE_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get()));

    // ACACIA
    public static final BlockFamily ACACIA_LOG = logFamily(new BlockFamily.Builder(Blocks.ACACIA_LOG)
            .stairs(BVBuildingBlocks.ACACIA_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.ACACIA_LOG_SLAB.get()));
    public static final BlockFamily ACACIA_WOOD = woodFamily(new BlockFamily.Builder(Blocks.ACACIA_WOOD)
            .stairs(BVBuildingBlocks.ACACIA_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.ACACIA_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.ACACIA_WOOD_WALL.get())
            .fence(BVBuildingBlocks.ACACIA_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.ACACIA_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_ACACIA_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_ACACIA_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_ACACIA_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_ACACIA_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_ACACIA_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_ACACIA_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get()));

    // DARK_OAK
    public static final BlockFamily DARK_OAK_LOG = logFamily(new BlockFamily.Builder(Blocks.DARK_OAK_LOG)
            .stairs(BVBuildingBlocks.DARK_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.DARK_OAK_LOG_SLAB.get()));
    public static final BlockFamily DARK_OAK_WOOD = woodFamily(new BlockFamily.Builder(Blocks.DARK_OAK_WOOD)
            .stairs(BVBuildingBlocks.DARK_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.DARK_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.DARK_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.DARK_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.DARK_OAK_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_DARK_OAK_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_DARK_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_DARK_OAK_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_DARK_OAK_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get()));

    // MANGROVE
    public static final BlockFamily MANGROVE_LOG = logFamily(new BlockFamily.Builder(Blocks.MANGROVE_LOG)
            .stairs(BVBuildingBlocks.MANGROVE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.MANGROVE_LOG_SLAB.get()));
    public static final BlockFamily MANGROVE_WOOD = woodFamily(new BlockFamily.Builder(Blocks.MANGROVE_WOOD)
            .stairs(BVBuildingBlocks.MANGROVE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.MANGROVE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.MANGROVE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.MANGROVE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.MANGROVE_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_MANGROVE_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_MANGROVE_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_MANGROVE_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_MANGROVE_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_MANGROVE_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get()));

    // CHERRY
    public static final BlockFamily CHERRY_LOG = logFamily(new BlockFamily.Builder(Blocks.CHERRY_LOG)
            .stairs(BVBuildingBlocks.CHERRY_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.CHERRY_LOG_SLAB.get()));
    public static final BlockFamily CHERRY_WOOD = woodFamily(new BlockFamily.Builder(Blocks.CHERRY_WOOD)
            .stairs(BVBuildingBlocks.CHERRY_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.CHERRY_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.CHERRY_WOOD_WALL.get())
            .fence(BVBuildingBlocks.CHERRY_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.CHERRY_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_CHERRY_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_CHERRY_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_CHERRY_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CHERRY_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_CHERRY_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_CHERRY_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get()));

    // PALE_OAK
    public static final BlockFamily PALE_OAK_LOG = logFamily(new BlockFamily.Builder(Blocks.PALE_OAK_LOG)
            .stairs(BVBuildingBlocks.PALE_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.PALE_OAK_LOG_SLAB.get()));
    public static final BlockFamily PALE_OAK_WOOD = woodFamily(new BlockFamily.Builder(Blocks.PALE_OAK_WOOD)
            .stairs(BVBuildingBlocks.PALE_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.PALE_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.PALE_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.PALE_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.PALE_OAK_WOOD_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_PALE_OAK_LOG = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_PALE_OAK_LOG)
            .stairs(BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_SLAB.get()));
    public static final BlockFamily STRIPPED_PALE_OAK_WOOD = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_PALE_OAK_WOOD)
            .stairs(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE_GATE.get()));

    // BAMBOO_BLOCK
    public static final BlockFamily BAMBOO_BLOCK = woodFamily(new BlockFamily.Builder(Blocks.BAMBOO_BLOCK)
            .stairs(BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.BAMBOO_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.BAMBOO_BLOCK_WALL.get())
            .fence(BVBuildingBlocks.BAMBOO_BLOCK_FENCE.get())
            .fenceGate(BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_BAMBOO_BLOCK = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_BAMBOO_BLOCK)
            .stairs(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get()));

    // CRIMSON
    public static final BlockFamily CRIMSON_STEM = logFamily(new BlockFamily.Builder(Blocks.CRIMSON_STEM)
            .stairs(BVBuildingBlocks.CRIMSON_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.CRIMSON_STEM_SLAB.get()));
    public static final BlockFamily CRIMSON_HYPHAE = woodFamily(new BlockFamily.Builder(Blocks.CRIMSON_HYPHAE)
            .stairs(BVBuildingBlocks.CRIMSON_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.CRIMSON_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.CRIMSON_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.CRIMSON_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.CRIMSON_HYPHAE_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_CRIMSON_STEM = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_CRIMSON_STEM)
            .stairs(BVBuildingBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CRIMSON_STEM_SLAB.get()));
    public static final BlockFamily STRIPPED_CRIMSON_HYPHAE = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_CRIMSON_HYPHAE)
            .stairs(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get()));

    // WARPED
    public static final BlockFamily WARPED_STEM = logFamily(new BlockFamily.Builder(Blocks.WARPED_STEM)
            .stairs(BVBuildingBlocks.WARPED_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.WARPED_STEM_SLAB.get()));
    public static final BlockFamily WARPED_HYPHAE = woodFamily(new BlockFamily.Builder(Blocks.WARPED_HYPHAE)
            .stairs(BVBuildingBlocks.WARPED_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.WARPED_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.WARPED_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.WARPED_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.WARPED_HYPHAE_FENCE_GATE.get()));
    public static final BlockFamily STRIPPED_WARPED_STEM = logFamily(new BlockFamily.Builder(Blocks.STRIPPED_WARPED_STEM)
            .stairs(BVBuildingBlocks.STRIPPED_WARPED_STEM_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_WARPED_STEM_SLAB.get()));
    public static final BlockFamily STRIPPED_WARPED_HYPHAE = woodFamily(new BlockFamily.Builder(Blocks.STRIPPED_WARPED_HYPHAE)
            .stairs(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get())
            .slab(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get())
            .wall(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_WALL.get())
            .fence(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get())
            .fenceGate(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get()));

    private static BlockFamily logFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();

        validateLogFamily(family);

        LOG_FAMILIES.add(family);
        return family;
    }

    private static BlockFamily woodFamily(BlockFamily.Builder builder) {
        var family = builder.getFamily();

        validateWoodFamily(family);

        WOOD_FAMILIES.add(family);
        return family;
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
