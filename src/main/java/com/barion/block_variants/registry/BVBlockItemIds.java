package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.barion.block_variants.BlockVariants;
import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.ColorCollection;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;

public final class BVBlockItemIds {
    public static final WoodTypeCollection<BlockItemId> LOG_STAIRS = BVBuildingBlocks.LOG_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> LOG_SLAB = BVBuildingBlocks.LOG_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_LOG_STAIRS = BVBuildingBlocks.STRIPPED_LOG_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_LOG_SLAB = BVBuildingBlocks.STRIPPED_LOG_SLAB.map(BVBlockItemIds::create);

    public static final WoodTypeCollection<BlockItemId> WOOD_STAIRS = BVBuildingBlocks.WOOD_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_SLAB = BVBuildingBlocks.WOOD_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_WALL = BVBuildingBlocks.WOOD_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_FENCE = BVBuildingBlocks.WOOD_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> WOOD_FENCE_GATE = BVBuildingBlocks.WOOD_FENCE_GATE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_STAIRS = BVBuildingBlocks.STRIPPED_WOOD_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_SLAB = BVBuildingBlocks.STRIPPED_WOOD_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_WALL = BVBuildingBlocks.STRIPPED_WOOD_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_FENCE = BVBuildingBlocks.STRIPPED_WOOD_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_WOOD_FENCE_GATE = BVBuildingBlocks.STRIPPED_WOOD_FENCE_GATE.map(BVBlockItemIds::create);

    public static final WoodTypeCollection<BlockItemId> STEM_STAIRS = BVBuildingBlocks.STEM_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STEM_SLAB = BVBuildingBlocks.STEM_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_STEM_STAIRS = BVBuildingBlocks.STRIPPED_STEM_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_STEM_SLAB = BVBuildingBlocks.STRIPPED_STEM_SLAB.map(BVBlockItemIds::create);

    public static final WoodTypeCollection<BlockItemId> HYPHAE_STAIRS = BVBuildingBlocks.HYPHAE_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> HYPHAE_SLAB = BVBuildingBlocks.HYPHAE_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> HYPHAE_WALL = BVBuildingBlocks.HYPHAE_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> HYPHAE_FENCE = BVBuildingBlocks.HYPHAE_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> HYPHAE_FENCE_GATE = BVBuildingBlocks.HYPHAE_FENCE_GATE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_HYPHAE_STAIRS = BVBuildingBlocks.STRIPPED_HYPHAE_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_HYPHAE_SLAB = BVBuildingBlocks.STRIPPED_HYPHAE_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_HYPHAE_WALL = BVBuildingBlocks.STRIPPED_HYPHAE_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_HYPHAE_FENCE = BVBuildingBlocks.STRIPPED_HYPHAE_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<BlockItemId> STRIPPED_HYPHAE_FENCE_GATE = BVBuildingBlocks.STRIPPED_HYPHAE_FENCE_GATE.map(BVBlockItemIds::create);

    public static final ColorCollection<BlockItemId> WOOL_WALL = ColorCollection.prefixWithColor(ColorCollection.create("wool_wall")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> CONCRETE_WALL = ColorCollection.prefixWithColor(ColorCollection.create("concrete_wall")).map(BVBlockItemIds::create);

    public static final ColorCollection<BlockItemId> DYED_TERRACOTTA_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> DYED_TERRACOTTA_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> DYED_TERRACOTTA_WALL = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_wall")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> GLAZED_TERRACOTTA_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> GLAZED_TERRACOTTA_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<BlockItemId> GLAZED_TERRACOTTA_WALL = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_wall")).map(BVBlockItemIds::create);

    public static BlockItemId create(String name) {
        var id = BlockVariants.locate(name);
        return BlockItemId.create(id, id);
    }

    public static BlockItemId create(WoodType key, DeferredBlock<?> block) {
        var id = block.getId();
        return BlockItemId.create(id, id);
    }
}
