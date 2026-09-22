package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.util.ColorCollection;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;

public final class BVBlockItemIds {
    public static final WoodTypeCollection<String> LOG_STAIRS = BVBuildingBlocks.LOG_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> LOG_SLAB = BVBuildingBlocks.LOG_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_LOG_STAIRS = BVBuildingBlocks.STRIPPED_LOG_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_LOG_SLAB = BVBuildingBlocks.STRIPPED_LOG_SLAB.map(BVBlockItemIds::create);

    public static final WoodTypeCollection<String> WOOD_STAIRS = BVBuildingBlocks.WOOD_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> WOOD_SLAB = BVBuildingBlocks.WOOD_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> WOOD_WALL = BVBuildingBlocks.WOOD_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> WOOD_FENCE = BVBuildingBlocks.WOOD_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> WOOD_FENCE_GATE = BVBuildingBlocks.WOOD_FENCE_GATE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_WOOD_STAIRS = BVBuildingBlocks.STRIPPED_WOOD_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_WOOD_SLAB = BVBuildingBlocks.STRIPPED_WOOD_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_WOOD_WALL = BVBuildingBlocks.STRIPPED_WOOD_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_WOOD_FENCE = BVBuildingBlocks.STRIPPED_WOOD_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_WOOD_FENCE_GATE = BVBuildingBlocks.STRIPPED_WOOD_FENCE_GATE.map(BVBlockItemIds::create);

    public static final WoodTypeCollection<String> STEM_STAIRS = BVBuildingBlocks.STEM_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STEM_SLAB = BVBuildingBlocks.STEM_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_STEM_STAIRS = BVBuildingBlocks.STRIPPED_STEM_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_STEM_SLAB = BVBuildingBlocks.STRIPPED_STEM_SLAB.map(BVBlockItemIds::create);

    public static final WoodTypeCollection<String> HYPHAE_STAIRS = BVBuildingBlocks.HYPHAE_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> HYPHAE_SLAB = BVBuildingBlocks.HYPHAE_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> HYPHAE_WALL = BVBuildingBlocks.HYPHAE_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> HYPHAE_FENCE = BVBuildingBlocks.HYPHAE_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> HYPHAE_FENCE_GATE = BVBuildingBlocks.HYPHAE_FENCE_GATE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_HYPHAE_STAIRS = BVBuildingBlocks.STRIPPED_HYPHAE_STAIRS.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_HYPHAE_SLAB = BVBuildingBlocks.STRIPPED_HYPHAE_SLAB.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_HYPHAE_WALL = BVBuildingBlocks.STRIPPED_HYPHAE_WALL.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_HYPHAE_FENCE = BVBuildingBlocks.STRIPPED_HYPHAE_FENCE.map(BVBlockItemIds::create);
    public static final WoodTypeCollection<String> STRIPPED_HYPHAE_FENCE_GATE = BVBuildingBlocks.STRIPPED_HYPHAE_FENCE_GATE.map(BVBlockItemIds::create);

    public static final ColorCollection<String> WOOL_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("wool_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> WOOL_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("wool_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> WOOL_WALL = ColorCollection.prefixWithColor(ColorCollection.create("wool_wall")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> CONCRETE_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("concrete_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> CONCRETE_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("concrete_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> CONCRETE_WALL = ColorCollection.prefixWithColor(ColorCollection.create("concrete_wall")).map(BVBlockItemIds::create);

    public static final ColorCollection<String> DYED_TERRACOTTA_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> DYED_TERRACOTTA_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> DYED_TERRACOTTA_WALL = ColorCollection.prefixWithColor(ColorCollection.create("terracotta_wall")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> GLAZED_TERRACOTTA_STAIRS = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_stairs")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> GLAZED_TERRACOTTA_SLAB = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_slab")).map(BVBlockItemIds::create);
    public static final ColorCollection<String> GLAZED_TERRACOTTA_WALL = ColorCollection.prefixWithColor(ColorCollection.create("glazed_terracotta_wall")).map(BVBlockItemIds::create);

    public static String create(String name) {
        return name;
//        var id = BlockVariants.locate(name);
//        return String.create(id, id);
    }

    public static String create(WoodType key, DeferredBlock<?> block) {
        var id = block.getId();
        return id.getPath();
//        return String.create(id, id);
    }
}
