package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.data.DataProviderExtensions;
import com.ametrinstudios.ametrin.util.WoodTypeCollection;
import com.ametrinstudios.ametrin.world.block.HorizontalAxisAlignedSlabBlock;
import com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper;
import com.barion.block_variants.BlockVariants;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.*;

public final class BVBuildingBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);

    static {
        REGISTER.addAlias(BlockVariants.locate("tuff_stairs"), DataProviderExtensions.getBlockKey(Blocks.TUFF_STAIRS));
        REGISTER.addAlias(BlockVariants.locate("tuff_slab"), DataProviderExtensions.getBlockKey(Blocks.TUFF_SLAB));
        REGISTER.addAlias(BlockVariants.locate("tuff_wall"), DataProviderExtensions.getBlockKey(Blocks.TUFF_WALL));
    }

    public static final DeferredBlock<WallBlock> QUARTZ_WALL = register("quartz_wall", WallBlock::new, () -> wallProperties(Blocks.QUARTZ_BLOCK));
    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", StairBlock::new, Blocks.QUARTZ_BRICKS, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", SlabBlock::new, () -> slabProperties(Blocks.QUARTZ_BRICKS));
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = register("quartz_brick_wall", WallBlock::new, () -> wallProperties(Blocks.QUARTZ_BRICKS));
    public static final DeferredBlock<WallBlock> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", WallBlock::new, () -> wallProperties(Blocks.SMOOTH_QUARTZ));
    public static final DeferredBlock<StairBlock> CHISELED_QUARTZ_BLOCK_STAIRS = register("chiseled_quartz_block_stairs", StairBlock::new, Blocks.CHISELED_QUARTZ_BLOCK, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CHISELED_QUARTZ_BLOCK_SLAB = register("chiseled_quartz_block_slab", SlabBlock::new, () -> slabProperties(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final DeferredBlock<WallBlock> CHISELED_QUARTZ_BLOCK_WALL = register("chiseled_quartz_block_wall", WallBlock::new, () -> wallProperties(Blocks.CHISELED_QUARTZ_BLOCK));

    public static final DeferredBlock<StairBlock> NETHERRACK_STAIRS = register("netherrack_stairs", StairBlock::new, Blocks.NETHERRACK, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> NETHERRACK_SLAB = register("netherrack_slab", SlabBlock::new, () -> slabProperties(Blocks.NETHERRACK));
    public static final DeferredBlock<WallBlock> NETHERRACK_WALL = register("netherrack_wall", WallBlock::new, () -> wallProperties(Blocks.NETHERRACK));

    public static final DeferredBlock<StairBlock> END_STONE_STAIRS = register("end_stone_stairs", StairBlock::new, Blocks.END_STONE, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> END_STONE_SLAB = register("end_stone_slab", SlabBlock::new, () -> slabProperties(Blocks.END_STONE));
    public static final DeferredBlock<WallBlock> END_STONE_WALL = register("end_stone_wall", WallBlock::new, () -> wallProperties(Blocks.END_STONE));

    public static final DeferredBlock<StairBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs", StairBlock::new, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab", SlabBlock::new, () -> slabProperties(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final DeferredBlock<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall", WallBlock::new, () -> wallProperties(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    public static final DeferredBlock<StairBlock> BASALT_STAIRS = register("basalt_stairs", StairBlock::new, Blocks.BASALT, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> BASALT_SLAB = register("basalt_slab", SlabBlock::new, () -> slabProperties(Blocks.BASALT));
    public static final DeferredBlock<WallBlock> BASALT_WALL = register("basalt_wall", WallBlock::new, () -> wallProperties(Blocks.BASALT));

    public static final DeferredBlock<StairBlock> POLISHED_BASALT_STAIRS = register("polished_basalt_stairs", StairBlock::new, Blocks.POLISHED_BASALT, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> POLISHED_BASALT_SLAB = register("polished_basalt_slab", SlabBlock::new, () -> slabProperties(Blocks.POLISHED_BASALT));
    public static final DeferredBlock<WallBlock> POLISHED_BASALT_WALL = register("polished_basalt_wall", WallBlock::new, () -> wallProperties(Blocks.POLISHED_BASALT));

    public static final DeferredBlock<StairBlock> DRIPSTONE_BLOCK_STAIRS = register("dripstone_block_stairs", StairBlock::new, Blocks.DRIPSTONE_BLOCK, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> DRIPSTONE_BLOCK_SLAB = register("dripstone_block_slab", SlabBlock::new, () -> slabProperties(Blocks.DRIPSTONE_BLOCK));
    public static final DeferredBlock<WallBlock> DRIPSTONE_BLOCK_WALL = register("dripstone_block_wall", WallBlock::new, () -> wallProperties(Blocks.DRIPSTONE_BLOCK));
    public static final DeferredBlock<StairBlock> AMETHYST_BLOCK_STAIRS = register("amethyst_block_stairs", StairBlock::new, Blocks.AMETHYST_BLOCK, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> AMETHYST_BLOCK_SLAB = register("amethyst_block_slab", SlabBlock::new, () -> slabProperties(Blocks.AMETHYST_BLOCK));
    public static final DeferredBlock<WallBlock> AMETHYST_BLOCK_WALL = register("amethyst_block_wall", WallBlock::new, () -> wallProperties(Blocks.AMETHYST_BLOCK));

    public static final DeferredBlock<StairBlock> CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", StairBlock::new, Blocks.CRACKED_STONE_BRICKS, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", SlabBlock::new, () -> slabProperties(Blocks.CRACKED_STONE_BRICKS));
    public static final DeferredBlock<WallBlock> CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", WallBlock::new, () -> wallProperties(Blocks.CRACKED_STONE_BRICKS));

    // log sets its map color based of the AXIS, so I have to ask it for its default map color
    public static final WoodTypeCollection<DeferredBlock<StairBlock>> LOG_STAIRS = WoodTypeCollection.VANILLA_OVERWORLD_LOGS.map((type, log) -> {
        return register(type.name() + "_log_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> LOG_SLAB = WoodTypeCollection.VANILLA_OVERWORLD_LOGS.map((type, log) -> {
        return register(type.name() + "_log_slab", SlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> STRIPPED_LOG_STAIRS = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_LOGS.map((type, log) -> {
        return register("stripped_" + type.name() + "_log_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> STRIPPED_LOG_SLAB = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_LOGS.map((type, log) -> {
        return register("stripped_" + type.name() + "_log_slab", SlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> STEM_STAIRS = WoodTypeCollection.VANILLA_NETHER_STEMS.map((type, log) -> {
        return register(type.name() + "_stem_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> STEM_SLAB = WoodTypeCollection.VANILLA_NETHER_STEMS.map((type, log) -> {
        return register(type.name() + "_stem_slab", SlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> STRIPPED_STEM_STAIRS = WoodTypeCollection.VANILLA_NETHER_STRIPPED_STEMS.map((type, log) -> {
        return register("stripped_" + type.name() + "_stem_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> STRIPPED_STEM_SLAB = WoodTypeCollection.VANILLA_NETHER_STRIPPED_STEMS.map((type, log) -> {
        return register("stripped_" + type.name() + "_stem_slab", SlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> WOOD_STAIRS = WoodTypeCollection.VANILLA_OVERWORLD_WOODS.map((type, log) -> {
        return register(type.name() + "_wood_stairs", StairBlock::new, log, BlockRegisterHelper::stairProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> WOOD_SLAB = WoodTypeCollection.VANILLA_OVERWORLD_WOODS.map((type, log) -> {
        return register(type.name() + "_wood_slab", HorizontalAxisAlignedSlabBlock::new, log, BlockRegisterHelper::slabProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });
    public static final WoodTypeCollection<DeferredBlock<WallBlock>> WOOD_WALL = WoodTypeCollection.VANILLA_OVERWORLD_WOODS.map((type, log) -> {
        return register(type.name() + "_wood_wall", WallBlock::new, log, BlockRegisterHelper::wallProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceBlock>> WOOD_FENCE = WoodTypeCollection.VANILLA_OVERWORLD_WOODS.map((type, log) -> {
        return register(type.name() + "_wood_fence", FenceBlock::new, log, BlockRegisterHelper::fenceProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceGateBlock>> WOOD_FENCE_GATE = WoodTypeCollection.VANILLA_OVERWORLD_WOODS.map((type, log) -> {
        return register(type.name() + "_wood_fence_gate", p -> new FenceGateBlock(type, p), log, BlockRegisterHelper::fenceGateProperties, p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });

    // for some reason STRIPPED_MANGROVE_WOOD bases its mapColor choice on AXIS (but with the same result anyway) so we do the same here
    public static final WoodTypeCollection<DeferredBlock<StairBlock>> STRIPPED_WOOD_STAIRS = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name() + "_wood_stairs", StairBlock::new, log, base -> BlockRegisterHelper.stairProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> STRIPPED_WOOD_SLAB = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name() + "_wood_slab", HorizontalAxisAlignedSlabBlock::new, log, base -> BlockRegisterHelper.slabProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    });
    public static final WoodTypeCollection<DeferredBlock<WallBlock>> STRIPPED_WOOD_WALL = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name() + "_wood_wall", WallBlock::new, log, base -> BlockRegisterHelper.wallProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceBlock>> STRIPPED_WOOD_FENCE = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name() + "_wood_fence", FenceBlock::new, log, base -> BlockRegisterHelper.fenceProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });
    public static final WoodTypeCollection<DeferredBlock<FenceGateBlock>> STRIPPED_WOOD_FENCE_GATE = WoodTypeCollection.VANILLA_OVERWORLD_STRIPPED_WOODS.map((type, log) -> {
        return register("stripped_" + type.name() + "_wood_fence_gate", p -> new FenceGateBlock(type, p), log, base -> BlockRegisterHelper.fenceGateProperties(base).mapColor(base.defaultMapColor()), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> HYPHAE_STAIRS = WoodTypeCollection.VANILLA_NETHER_HYPHAES.map((type, log) -> {
        return register(type.name() + "_hyphae_stairs", StairBlock::new, log, BlockRegisterHelper::stairProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> HYPHAE_SLAB = WoodTypeCollection.VANILLA_NETHER_HYPHAES.map((type, log) -> {
        return register(type.name() + "_hyphae_slab", HorizontalAxisAlignedSlabBlock::new, log, BlockRegisterHelper::slabProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<WallBlock>> HYPHAE_WALL = WoodTypeCollection.VANILLA_NETHER_HYPHAES.map((type, log) -> {
        return register(type.name() + "_hyphae_wall", WallBlock::new, log, BlockRegisterHelper::wallProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<FenceBlock>> HYPHAE_FENCE = WoodTypeCollection.VANILLA_NETHER_HYPHAES.map((type, log) -> {
        return register(type.name() + "_hyphae_fence", FenceBlock::new, log, BlockRegisterHelper::fenceProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<FenceGateBlock>> HYPHAE_FENCE_GATE = WoodTypeCollection.VANILLA_NETHER_HYPHAES.map((type, log) -> {
        return register(type.name() + "_hyphae_fence_gate", p -> new FenceGateBlock(type, p), log, BlockRegisterHelper::fenceGateProperties);
    });

    public static final WoodTypeCollection<DeferredBlock<StairBlock>> STRIPPED_HYPHAE_STAIRS = WoodTypeCollection.VANILLA_NETHER_STRIPPED_HYPHAES.map((type, log) -> {
        return register("stripped_" + type.name() + "_hyphae_stairs", StairBlock::new, log, BlockRegisterHelper::stairProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<SlabBlock>> STRIPPED_HYPHAE_SLAB = WoodTypeCollection.VANILLA_NETHER_STRIPPED_HYPHAES.map((type, log) -> {
        return register("stripped_" + type.name() + "_hyphae_slab", HorizontalAxisAlignedSlabBlock::new, log, BlockRegisterHelper::slabProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<WallBlock>> STRIPPED_HYPHAE_WALL = WoodTypeCollection.VANILLA_NETHER_STRIPPED_HYPHAES.map((type, log) -> {
        return register("stripped_" + type.name() + "_hyphae_wall", WallBlock::new, log, BlockRegisterHelper::wallProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<FenceBlock>> STRIPPED_HYPHAE_FENCE = WoodTypeCollection.VANILLA_NETHER_STRIPPED_HYPHAES.map((type, log) -> {
        return register("stripped_" + type.name() + "_hyphae_fence", FenceBlock::new, log, BlockRegisterHelper::fenceProperties);
    });
    public static final WoodTypeCollection<DeferredBlock<FenceGateBlock>> STRIPPED_HYPHAE_FENCE_GATE = WoodTypeCollection.VANILLA_NETHER_STRIPPED_HYPHAES.map((type, log) -> {
        return register("stripped_" + type.name() + "_hyphae_fence_gate", p -> new FenceGateBlock(type, p), log, BlockRegisterHelper::fenceGateProperties);
    });

    public static final DeferredBlock<StairBlock> BAMBOO_BLOCK_STAIRS = register("bamboo_block_stairs", prop -> new StairBlock(Blocks.BAMBOO_BLOCK.defaultBlockState(), prop), () -> stairProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    public static final DeferredBlock<SlabBlock> BAMBOO_BLOCK_SLAB = register("bamboo_block_slab", SlabBlock::new, () -> slabProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    public static final DeferredBlock<WallBlock> BAMBOO_BLOCK_WALL = register("bamboo_block_wall", WallBlock::new, () -> wallProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    public static final DeferredBlock<FenceBlock> BAMBOO_BLOCK_FENCE = register("bamboo_block_fence", FenceBlock::new, () -> fenceGateProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    public static final DeferredBlock<FenceGateBlock> BAMBOO_BLOCK_FENCE_GATE = register("bamboo_block_fence_gate", prop -> new FenceGateBlock(WoodType.BAMBOO, prop), () -> fenceGateProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    public static final DeferredBlock<StairBlock> STRIPPED_BAMBOO_BLOCK_STAIRS = register("stripped_bamboo_block_stairs", StairBlock::new, Blocks.STRIPPED_BAMBOO_BLOCK, b -> stairProperties(b).mapColor(MapColor.COLOR_YELLOW), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    public static final DeferredBlock<SlabBlock> STRIPPED_BAMBOO_BLOCK_SLAB = register("stripped_bamboo_block_slab", SlabBlock::new, () -> slabProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS));
    public static final DeferredBlock<WallBlock> STRIPPED_BAMBOO_BLOCK_WALL = register("stripped_bamboo_block_wall", WallBlock::new, () -> wallProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    public static final DeferredBlock<FenceBlock> STRIPPED_BAMBOO_BLOCK_FENCE = register("stripped_bamboo_block_fence", FenceBlock::new, () -> fenceProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = register("stripped_bamboo_block_fence_gate", prop -> new FenceGateBlock(WoodType.BAMBOO, prop), () -> fenceGateProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW).forceSolidOn(), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS));

    public static final DeferredBlock<StairBlock> CALCITE_STAIRS = register("calcite_stairs", StairBlock::new, Blocks.CALCITE, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CALCITE_SLAB = register("calcite_slab", SlabBlock::new, () -> slabProperties(Blocks.CALCITE));
    public static final DeferredBlock<WallBlock> CALCITE_WALL = register("calcite_wall", WallBlock::new, () -> wallProperties(Blocks.CALCITE));
    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", StairBlock::new, Blocks.SMOOTH_BASALT, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", SlabBlock::new, () -> slabProperties(Blocks.SMOOTH_BASALT));
    public static final DeferredBlock<WallBlock> SMOOTH_BASALT_WALL = register("smooth_basalt_wall", WallBlock::new, () -> wallProperties(Blocks.SMOOTH_BASALT));

    public static final DeferredBlock<StairBlock> DEEPSLATE_STAIRS = register("deepslate_stairs", StairBlock::new, Blocks.DEEPSLATE, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> DEEPSLATE_SLAB = register("deepslate_slab", SlabBlock::new, () -> slabProperties(Blocks.DEEPSLATE));
    public static final DeferredBlock<WallBlock> DEEPSLATE_WALL = register("deepslate_wall", WallBlock::new, () -> wallProperties(Blocks.DEEPSLATE));
    public static final DeferredBlock<StairBlock> CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", StairBlock::new, Blocks.CRACKED_DEEPSLATE_BRICKS, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", SlabBlock::new, () -> slabProperties(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final DeferredBlock<WallBlock> CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", WallBlock::new, () -> wallProperties(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final DeferredBlock<StairBlock> CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", StairBlock::new, Blocks.CRACKED_DEEPSLATE_TILES, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", SlabBlock::new, () -> slabProperties(Blocks.CRACKED_DEEPSLATE_TILES));
    public static final DeferredBlock<WallBlock> CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", WallBlock::new, () -> wallProperties(Blocks.CRACKED_DEEPSLATE_TILES));

    public static final DeferredBlock<FenceGateBlock> NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.CRIMSON, prop), () -> fenceGateProperties(Blocks.NETHER_BRICK_FENCE).forceSolidOn()); // TODO: fix wood type

    public static final DeferredBlock<StairBlock> CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", StairBlock::new, Blocks.CRACKED_NETHER_BRICKS, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", SlabBlock::new, () -> slabProperties(Blocks.CRACKED_NETHER_BRICKS));
    public static final DeferredBlock<WallBlock> CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", WallBlock::new, () -> wallProperties(Blocks.CRACKED_NETHER_BRICKS));
    public static final DeferredBlock<FenceBlock> CRACKED_NETHER_BRICK_FENCE = register("cracked_nether_brick_fence", FenceBlock::new, () -> fenceProperties(Blocks.CRACKED_NETHER_BRICKS));
    public static final DeferredBlock<FenceGateBlock> CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.OAK, prop), () -> fenceGateProperties(Blocks.CRACKED_NETHER_BRICKS));

    public static final DeferredBlock<FenceBlock> RED_NETHER_BRICK_FENCE = register("red_nether_brick_fence", FenceBlock::new, () -> fenceProperties(Blocks.RED_NETHER_BRICKS));
    public static final DeferredBlock<FenceGateBlock> RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.OAK, prop), () -> fenceGateProperties(Blocks.RED_NETHER_BRICKS));

    public static final DeferredBlock<StairBlock> OBSIDIAN_STAIRS = register("obsidian_stairs", StairBlock::new, Blocks.OBSIDIAN, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> OBSIDIAN_SLAB = register("obsidian_slab", SlabBlock::new, () -> slabProperties(Blocks.OBSIDIAN));
    public static final DeferredBlock<WallBlock> OBSIDIAN_WALL = register("obsidian_wall", WallBlock::new, () -> wallProperties(Blocks.OBSIDIAN));

    public static final DeferredBlock<StairBlock> CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", StairBlock::new, Blocks.CRYING_OBSIDIAN, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", SlabBlock::new, () -> slabProperties(Blocks.CRYING_OBSIDIAN));
    public static final DeferredBlock<WallBlock> CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", WallBlock::new, () -> wallProperties(Blocks.CRYING_OBSIDIAN));

    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIRS = register("packed_mud_stairs", StairBlock::new, Blocks.PACKED_MUD, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = register("packed_mud_slab", SlabBlock::new, () -> slabProperties(Blocks.PACKED_MUD));
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = register("packed_mud_wall", WallBlock::new, () -> wallProperties(Blocks.PACKED_MUD));

    public static final List<WoodTypeCollection<? extends DeferredBlock<? extends Block>>> ALL_WOODEN = List.of(
            LOG_STAIRS, LOG_SLAB, STRIPPED_LOG_STAIRS, STRIPPED_LOG_SLAB,

            WOOD_STAIRS, WOOD_SLAB, STRIPPED_WOOD_STAIRS, STRIPPED_WOOD_SLAB,
            WOOD_WALL, WOOD_FENCE, WOOD_FENCE_GATE, STRIPPED_WOOD_WALL, STRIPPED_WOOD_FENCE, STRIPPED_WOOD_FENCE_GATE,

            STEM_STAIRS, STEM_SLAB, STRIPPED_STEM_STAIRS, STRIPPED_STEM_SLAB,
            HYPHAE_STAIRS, HYPHAE_SLAB, STRIPPED_HYPHAE_STAIRS, STRIPPED_HYPHAE_SLAB,
            HYPHAE_WALL, HYPHAE_FENCE, HYPHAE_FENCE_GATE, STRIPPED_HYPHAE_WALL, STRIPPED_HYPHAE_FENCE, STRIPPED_HYPHAE_FENCE_GATE
    );

    public static Stream<DeferredBlock<? extends Block>> queryWooden(Set<WoodType> types) {
        return ALL_WOODEN.stream().mapMulti((node, yield)
                -> node.forEach((type, block) -> {
            if (types.contains(type)) {
                yield.accept(block);
            }
        }));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties) {
        return register(name, block, base, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), () -> properties.apply(base), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties) {
        return register(name, block, base, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, block, () -> properties.apply(base), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }
}