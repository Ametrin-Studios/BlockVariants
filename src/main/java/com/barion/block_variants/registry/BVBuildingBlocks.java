package com.barion.block_variants.registry;

import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.copyProperties;

public final class BVBuildingBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);

    static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties();
    static final Item.Properties fireResistanceItemProperties = new Item.Properties().fireResistant();

    static {
        REGISTER.addAlias(BlockVariants.locate("tuff_stairs"), BVUtil.getBlockID(Blocks.TUFF_STAIRS));
        REGISTER.addAlias(BlockVariants.locate("tuff_slab"), BVUtil.getBlockID(Blocks.TUFF_SLAB));
        REGISTER.addAlias(BlockVariants.locate("tuff_wall"), BVUtil.getBlockID(Blocks.TUFF_WALL));
    }

    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_WALL = register("polished_granite_wall", WallBlock::new, Blocks.POLISHED_GRANITE);
    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_WALL = register("polished_diorite_wall", WallBlock::new, Blocks.POLISHED_DIORITE);
    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_WALL = register("polished_andesite_wall", WallBlock::new, Blocks.POLISHED_ANDESITE);

    public static final DeferredBlock<WallBlock> STONE_WALL = register("stone_wall", WallBlock::new, Blocks.STONE);
    public static final DeferredBlock<StairBlock> SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", StairBlock::new, Blocks.SMOOTH_STONE);
    public static final DeferredBlock<WallBlock> SMOOTH_STONE_WALL = register("smooth_stone_wall", WallBlock::new, Blocks.SMOOTH_STONE);

    public static final DeferredBlock<StairBlock> CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", StairBlock::new, Blocks.CUT_SANDSTONE);
    public static final DeferredBlock<WallBlock> CUT_SANDSTONE_WALL = register("cut_sandstone_wall", WallBlock::new, Blocks.CUT_SANDSTONE);
    public static final DeferredBlock<StairBlock> CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", StairBlock::new, Blocks.CUT_RED_SANDSTONE);
    public static final DeferredBlock<WallBlock> CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", WallBlock::new, Blocks.CUT_RED_SANDSTONE);

    public static final DeferredBlock<WallBlock> QUARTZ_WALL = register("quartz_wall", WallBlock::new, Blocks.QUARTZ_BLOCK);
    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", StairBlock::new, Blocks.QUARTZ_BRICKS);
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", SlabBlock::new, Blocks.QUARTZ_BRICKS);
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = register("quartz_brick_wall", WallBlock::new, Blocks.QUARTZ_BRICKS);
    public static final DeferredBlock<WallBlock> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", WallBlock::new, Blocks.SMOOTH_QUARTZ);
    public static final DeferredBlock<StairBlock> CHISELED_QUARTZ_BLOCK_STAIRS = register("chiseled_quartz_block_stairs", StairBlock::new, Blocks.CHISELED_QUARTZ_BLOCK);
    public static final DeferredBlock<SlabBlock> CHISELED_QUARTZ_BLOCK_SLAB = register("chiseled_quartz_block_slab", SlabBlock::new, Blocks.CHISELED_QUARTZ_BLOCK);
    public static final DeferredBlock<WallBlock> CHISELED_QUARTZ_BLOCK_WALL = register("chiseled_quartz_block_wall", WallBlock::new, Blocks.CHISELED_QUARTZ_BLOCK);

    public static final DeferredBlock<WallBlock> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", WallBlock::new, Blocks.PRISMARINE_BRICKS);
    public static final DeferredBlock<WallBlock> DARK_PRISMARINE_WALL = register("dark_prismarine_wall", WallBlock::new, Blocks.PRISMARINE_BRICKS);

    public static final DeferredBlock<StairBlock> NETHERRACK_STAIRS = register("netherrack_stairs", StairBlock::new, Blocks.NETHERRACK);
    public static final DeferredBlock<SlabBlock> NETHERRACK_SLAB = register("netherrack_slab", SlabBlock::new, Blocks.NETHERRACK);
    public static final DeferredBlock<WallBlock> NETHERRACK_WALL = register("netherrack_wall", WallBlock::new, Blocks.NETHERRACK);

    public static final DeferredBlock<StairBlock> END_STONE_STAIRS = register("end_stone_stairs", StairBlock::new, Blocks.END_STONE);
    public static final DeferredBlock<SlabBlock> END_STONE_SLAB = register("end_stone_slab", SlabBlock::new, Blocks.END_STONE);
    public static final DeferredBlock<WallBlock> END_STONE_WALL = register("end_stone_wall", WallBlock::new, Blocks.END_STONE);
    public static final DeferredBlock<WallBlock> PURPUR_WALL = register("purpur_wall", WallBlock::new, Blocks.PURPUR_BLOCK);

    public static final DeferredBlock<StairBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs", StairBlock::new, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final DeferredBlock<SlabBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab", SlabBlock::new, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final DeferredBlock<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall", WallBlock::new, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

    public static final DeferredBlock<StairBlock> BASALT_STAIRS = register("basalt_stairs", StairBlock::new, Blocks.BASALT);
    public static final DeferredBlock<SlabBlock> BASALT_SLAB = register("basalt_slab", SlabBlock::new, Blocks.BASALT);
    public static final DeferredBlock<WallBlock> BASALT_WALL = register("basalt_wall", WallBlock::new, Blocks.BASALT);

    public static final DeferredBlock<StairBlock> POLISHED_BASALT_STAIRS = register("polished_basalt_stairs", StairBlock::new, Blocks.POLISHED_BASALT);
    public static final DeferredBlock<SlabBlock> POLISHED_BASALT_SLAB = register("polished_basalt_slab", SlabBlock::new, Blocks.POLISHED_BASALT);
    public static final DeferredBlock<WallBlock> POLISHED_BASALT_WALL = register("polished_basalt_wall", WallBlock::new, Blocks.POLISHED_BASALT);

    public static final DeferredBlock<StairBlock> DRIPSTONE_BLOCK_STAIRS = register("dripstone_block_stairs", StairBlock::new, Blocks.DRIPSTONE_BLOCK);
    public static final DeferredBlock<SlabBlock> DRIPSTONE_BLOCK_SLAB = register("dripstone_block_slab", SlabBlock::new, Blocks.DRIPSTONE_BLOCK);
    public static final DeferredBlock<WallBlock> DRIPSTONE_BLOCK_WALL = register("dripstone_block_wall", WallBlock::new, Blocks.DRIPSTONE_BLOCK);
    public static final DeferredBlock<StairBlock> AMETHYST_BLOCK_STAIRS = register("amethyst_block_stairs", StairBlock::new, Blocks.AMETHYST_BLOCK);
    public static final DeferredBlock<SlabBlock> AMETHYST_BLOCK_SLAB = register("amethyst_block_slab", SlabBlock::new, Blocks.AMETHYST_BLOCK);
    public static final DeferredBlock<WallBlock> AMETHYST_BLOCK_WALL = register("amethyst_block_wall", WallBlock::new, Blocks.AMETHYST_BLOCK);

    public static final DeferredBlock<StairBlock> CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", StairBlock::new, Blocks.CRACKED_STONE_BRICKS);
    public static final DeferredBlock<SlabBlock> CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", SlabBlock::new, Blocks.CRACKED_STONE_BRICKS);
    public static final DeferredBlock<WallBlock> CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", WallBlock::new, Blocks.CRACKED_STONE_BRICKS);

    // log sets its material color based of the AXIS which is why I use wood for the properties because the other blocks don't have that property
    public static final DeferredBlock<StairBlock> OAK_LOG_STAIRS = logStairs("oak", Blocks.OAK_WOOD);
    public static final DeferredBlock<SlabBlock> OAK_LOG_SLAB = logSlab("oak", Blocks.OAK_WOOD);
    public static final DeferredBlock<StairBlock> SPRUCE_LOG_STAIRS = logStairs("spruce", Blocks.SPRUCE_WOOD);
    public static final DeferredBlock<SlabBlock> SPRUCE_LOG_SLAB = logSlab("spruce", Blocks.SPRUCE_WOOD);
    public static final DeferredBlock<StairBlock> BIRCH_LOG_STAIRS = logStairs("birch", Blocks.BIRCH_WOOD);
    public static final DeferredBlock<SlabBlock> BIRCH_LOG_SLAB = logSlab("birch", Blocks.BIRCH_WOOD);
    public static final DeferredBlock<StairBlock> JUNGLE_LOG_STAIRS = logStairs("jungle", Blocks.JUNGLE_WOOD);
    public static final DeferredBlock<SlabBlock> JUNGLE_LOG_SLAB = logSlab("jungle", Blocks.JUNGLE_WOOD);
    public static final DeferredBlock<StairBlock> ACACIA_LOG_STAIRS = logStairs("acacia", Blocks.ACACIA_WOOD);
    public static final DeferredBlock<SlabBlock> ACACIA_LOG_SLAB = logSlab("acacia", Blocks.ACACIA_WOOD);
    public static final DeferredBlock<StairBlock> DARK_OAK_LOG_STAIRS = logStairs("dark_oak", Blocks.DARK_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> DARK_OAK_LOG_SLAB = logSlab("dark_oak", Blocks.DARK_OAK_WOOD);
    public static final DeferredBlock<StairBlock> MANGROVE_LOG_STAIRS = logStairs("mangrove", Blocks.MANGROVE_WOOD);
    public static final DeferredBlock<SlabBlock> MANGROVE_LOG_SLAB = logSlab("mangrove", Blocks.MANGROVE_WOOD);
    public static final DeferredBlock<StairBlock> CHERRY_LOG_STAIRS = logStairs("cherry", Blocks.CHERRY_WOOD);
    public static final DeferredBlock<SlabBlock> CHERRY_LOG_SLAB = logSlab("cherry", Blocks.CHERRY_WOOD);
    public static final DeferredBlock<StairBlock> PALE_OAK_LOG_STAIRS = logStairs("pale_oak", Blocks.PALE_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> PALE_OAK_LOG_SLAB = logSlab("pale_oak", Blocks.PALE_OAK_WOOD);

    public static final DeferredBlock<StairBlock> STRIPPED_OAK_LOG_STAIRS = logStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_OAK_LOG_SLAB = logSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_SPRUCE_LOG_STAIRS = logStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_SPRUCE_LOG_SLAB = logSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_BIRCH_LOG_STAIRS = logStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_BIRCH_LOG_SLAB = logSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_JUNGLE_LOG_STAIRS = logStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_JUNGLE_LOG_SLAB = logSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_ACACIA_LOG_STAIRS = logStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_ACACIA_LOG_SLAB = logSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_DARK_OAK_LOG_STAIRS = logStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_DARK_OAK_LOG_SLAB = logSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_MANGROVE_LOG_STAIRS = logStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD); // Stripped Mangrove color maps based on Axis
    public static final DeferredBlock<SlabBlock> STRIPPED_MANGROVE_LOG_SLAB = logSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_CHERRY_LOG_STAIRS = logStairs("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_CHERRY_LOG_SLAB = logSlab("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_PALE_OAK_LOG_STAIRS = logStairs("stripped_pale_oak", Blocks.STRIPPED_PALE_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_PALE_OAK_LOG_SLAB = logSlab("stripped_pale_oak", Blocks.STRIPPED_PALE_OAK_WOOD);

    public static final DeferredBlock<StairBlock> CRIMSON_STEM_STAIRS = register("crimson_stem_stairs", prop -> new StairBlock(Blocks.CRIMSON_STEM.defaultBlockState(), prop), Blocks.CRIMSON_STEM);
    public static final DeferredBlock<SlabBlock> CRIMSON_STEM_SLAB = register("crimson_stem_slab", SlabBlock::new, ()-> copyProperties(Blocks.CRIMSON_STEM));
    public static final DeferredBlock<StairBlock> WARPED_STEM_STAIRS = register("warped_stem_stairs", prop -> new StairBlock(Blocks.WARPED_STEM.defaultBlockState(), prop), Blocks.WARPED_STEM);
    public static final DeferredBlock<SlabBlock> WARPED_STEM_SLAB = register("warped_stem_slab", SlabBlock::new, ()-> copyProperties(Blocks.WARPED_STEM));

    public static final DeferredBlock<StairBlock> STRIPPED_CRIMSON_STEM_STAIRS = register("stripped_crimson_stem_stairs", StairBlock::new, Blocks.STRIPPED_CRIMSON_STEM);
    public static final DeferredBlock<SlabBlock> STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_stem_slab", SlabBlock::new, Blocks.STRIPPED_CRIMSON_STEM);
    public static final DeferredBlock<StairBlock> STRIPPED_WARPED_STEM_STAIRS = register("stripped_warped_stem_stairs", StairBlock::new, Blocks.STRIPPED_WARPED_STEM);
    public static final DeferredBlock<SlabBlock> STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_stem_slab", SlabBlock::new, Blocks.STRIPPED_WARPED_STEM);

    public static final DeferredBlock<StairBlock> OAK_WOOD_STAIRS = woodStairs("oak", Blocks.OAK_WOOD);
    public static final DeferredBlock<SlabBlock> OAK_WOOD_SLAB = woodSlab("oak", Blocks.OAK_WOOD);
    public static final DeferredBlock<WallBlock> OAK_WOOD_WALL = woodWall("oak", Blocks.OAK_WOOD);
    public static final DeferredBlock<FenceBlock> OAK_WOOD_FENCE = woodFence("oak", Blocks.OAK_WOOD);
    public static final DeferredBlock<FenceGateBlock> OAK_WOOD_FENCE_GATE = woodFenceGate("oak", Blocks.OAK_WOOD);
    public static final DeferredBlock<StairBlock> SPRUCE_WOOD_STAIRS = woodStairs("spruce", Blocks.SPRUCE_WOOD);
    public static final DeferredBlock<SlabBlock> SPRUCE_WOOD_SLAB = woodSlab("spruce", Blocks.SPRUCE_WOOD);
    public static final DeferredBlock<WallBlock> SPRUCE_WOOD_WALL = woodWall("spruce", Blocks.SPRUCE_WOOD);
    public static final DeferredBlock<FenceBlock> SPRUCE_WOOD_FENCE = woodFence("spruce", Blocks.SPRUCE_WOOD);
    public static final DeferredBlock<FenceGateBlock> SPRUCE_WOOD_FENCE_GATE = woodFenceGate("spruce", Blocks.SPRUCE_WOOD);
    public static final DeferredBlock<StairBlock> BIRCH_WOOD_STAIRS = woodStairs("birch", Blocks.BIRCH_WOOD);
    public static final DeferredBlock<SlabBlock> BIRCH_WOOD_SLAB = woodSlab("birch", Blocks.BIRCH_WOOD);
    public static final DeferredBlock<WallBlock> BIRCH_WOOD_WALL = woodWall("birch", Blocks.BIRCH_WOOD);
    public static final DeferredBlock<FenceBlock> BIRCH_WOOD_FENCE = woodFence("birch", Blocks.BIRCH_WOOD);
    public static final DeferredBlock<FenceGateBlock> BIRCH_WOOD_FENCE_GATE = woodFenceGate("birch", Blocks.BIRCH_WOOD);
    public static final DeferredBlock<StairBlock> JUNGLE_WOOD_STAIRS = woodStairs("jungle", Blocks.JUNGLE_WOOD);
    public static final DeferredBlock<SlabBlock> JUNGLE_WOOD_SLAB = woodSlab("jungle", Blocks.JUNGLE_WOOD);
    public static final DeferredBlock<WallBlock> JUNGLE_WOOD_WALL = woodWall("jungle", Blocks.JUNGLE_WOOD);
    public static final DeferredBlock<FenceBlock> JUNGLE_WOOD_FENCE = woodFence("jungle", Blocks.JUNGLE_WOOD);
    public static final DeferredBlock<FenceGateBlock> JUNGLE_WOOD_FENCE_GATE = woodFenceGate("jungle", Blocks.JUNGLE_WOOD);
    public static final DeferredBlock<StairBlock> ACACIA_WOOD_STAIRS = woodStairs("acacia", Blocks.ACACIA_WOOD);
    public static final DeferredBlock<SlabBlock> ACACIA_WOOD_SLAB = woodSlab("acacia", Blocks.ACACIA_WOOD);
    public static final DeferredBlock<WallBlock> ACACIA_WOOD_WALL = woodWall("acacia", Blocks.ACACIA_WOOD);
    public static final DeferredBlock<FenceBlock> ACACIA_WOOD_FENCE = woodFence("acacia", Blocks.ACACIA_WOOD);
    public static final DeferredBlock<FenceGateBlock> ACACIA_WOOD_FENCE_GATE = woodFenceGate("acacia", Blocks.ACACIA_WOOD);
    public static final DeferredBlock<StairBlock> DARK_OAK_WOOD_STAIRS = woodStairs("dark_oak", Blocks.DARK_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> DARK_OAK_WOOD_SLAB = woodSlab("dark_oak", Blocks.DARK_OAK_WOOD);
    public static final DeferredBlock<WallBlock> DARK_OAK_WOOD_WALL = woodWall("dark_oak", Blocks.DARK_OAK_WOOD);
    public static final DeferredBlock<FenceBlock> DARK_OAK_WOOD_FENCE = woodFence("dark_oak", Blocks.DARK_OAK_WOOD);
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = woodFenceGate("dark_oak", Blocks.DARK_OAK_WOOD);
    public static final DeferredBlock<StairBlock> MANGROVE_WOOD_STAIRS = woodStairs("mangrove", Blocks.MANGROVE_WOOD);
    public static final DeferredBlock<SlabBlock> MANGROVE_WOOD_SLAB = woodSlab("mangrove", Blocks.MANGROVE_WOOD);
    public static final DeferredBlock<WallBlock> MANGROVE_WOOD_WALL = woodWall("mangrove", Blocks.MANGROVE_WOOD);
    public static final DeferredBlock<FenceBlock> MANGROVE_WOOD_FENCE = woodFence("mangrove", Blocks.MANGROVE_WOOD);
    public static final DeferredBlock<FenceGateBlock> MANGROVE_WOOD_FENCE_GATE = woodFenceGate("mangrove", Blocks.MANGROVE_WOOD);
    public static final DeferredBlock<StairBlock> CHERRY_WOOD_STAIRS = woodStairs("cherry", Blocks.CHERRY_WOOD);
    public static final DeferredBlock<SlabBlock> CHERRY_WOOD_SLAB = woodSlab("cherry", Blocks.CHERRY_WOOD);
    public static final DeferredBlock<WallBlock> CHERRY_WOOD_WALL = woodWall("cherry", Blocks.CHERRY_WOOD);
    public static final DeferredBlock<FenceBlock> CHERRY_WOOD_FENCE = woodFence("cherry", Blocks.CHERRY_WOOD);
    public static final DeferredBlock<FenceGateBlock> CHERRY_WOOD_FENCE_GATE = woodFenceGate("cherry", Blocks.CHERRY_WOOD);
    public static final DeferredBlock<StairBlock> PALE_OAK_WOOD_STAIRS = woodStairs("pale_oak", Blocks.PALE_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> PALE_OAK_WOOD_SLAB = woodSlab("pale_oak", Blocks.PALE_OAK_WOOD);
    public static final DeferredBlock<WallBlock> PALE_OAK_WOOD_WALL = woodWall("pale_oak", Blocks.PALE_OAK_WOOD);
    public static final DeferredBlock<FenceBlock> PALE_OAK_WOOD_FENCE = woodFence("pale_oak", Blocks.PALE_OAK_WOOD);
    public static final DeferredBlock<FenceGateBlock> PALE_OAK_WOOD_FENCE_GATE = woodFenceGate("pale_oak", Blocks.PALE_OAK_WOOD);
    public static final DeferredBlock<StairBlock> BAMBOO_BLOCK_STAIRS = register("bamboo_block_stairs", prop -> new StairBlock(Blocks.BAMBOO_BLOCK.defaultBlockState(), prop), ()-> copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<SlabBlock> BAMBOO_BLOCK_SLAB = register("bamboo_block_slab", SlabBlock::new, ()-> copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<WallBlock> BAMBOO_BLOCK_WALL = register("bamboo_block_wall", WallBlock::new, ()-> copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT));
    public static final DeferredBlock<FenceBlock> BAMBOO_BLOCK_FENCE = register("bamboo_block_fence", FenceBlock::new, ()-> copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT));
    public static final DeferredBlock<FenceGateBlock> BAMBOO_BLOCK_FENCE_GATE = register("bamboo_block_fence_gate", prop -> new FenceGateBlock(WoodType.BAMBOO, prop), ()-> copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT));

    public static final DeferredBlock<StairBlock> STRIPPED_OAK_WOOD_STAIRS = woodStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_OAK_WOOD_SLAB = woodSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_OAK_WOOD_WALL = woodWall("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_OAK_WOOD_FENCE = woodFence("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_OAK_WOOD_FENCE_GATE = woodFenceGate("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_SPRUCE_WOOD_STAIRS = woodStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_SPRUCE_WOOD_SLAB = woodSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_SPRUCE_WOOD_WALL = woodWall("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_SPRUCE_WOOD_FENCE = woodFence("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_SPRUCE_WOOD_FENCE_GATE = woodFenceGate("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_BIRCH_WOOD_STAIRS = woodStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_BIRCH_WOOD_SLAB = woodSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_BIRCH_WOOD_WALL = woodWall("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_BIRCH_WOOD_FENCE = woodFence("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BIRCH_WOOD_FENCE_GATE = woodFenceGate("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_JUNGLE_WOOD_STAIRS = woodStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_JUNGLE_WOOD_SLAB = woodSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_JUNGLE_WOOD_WALL = woodWall("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_JUNGLE_WOOD_FENCE = woodFence("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_JUNGLE_WOOD_FENCE_GATE = woodFenceGate("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_ACACIA_WOOD_STAIRS = woodStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_ACACIA_WOOD_SLAB = woodSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_ACACIA_WOOD_WALL = woodWall("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_ACACIA_WOOD_FENCE = woodFence("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_ACACIA_WOOD_FENCE_GATE = woodFenceGate("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_DARK_OAK_WOOD_STAIRS = woodStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_DARK_OAK_WOOD_SLAB = woodSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_DARK_OAK_WOOD_WALL = woodWall("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_DARK_OAK_WOOD_FENCE = woodFence("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_DARK_OAK_WOOD_FENCE_GATE = woodFenceGate("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_MANGROVE_WOOD_STAIRS = woodStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD); // Stripped Mangrove color maps based on Axis
    public static final DeferredBlock<SlabBlock> STRIPPED_MANGROVE_WOOD_SLAB = woodSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_MANGROVE_WOOD_WALL = woodWall("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_MANGROVE_WOOD_FENCE = woodFence("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_MANGROVE_WOOD_FENCE_GATE = woodFenceGate("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_CHERRY_WOOD_STAIRS = woodStairs("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_CHERRY_WOOD_SLAB = woodSlab("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_CHERRY_WOOD_WALL = woodWall("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_CHERRY_WOOD_FENCE = woodFence("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CHERRY_WOOD_FENCE_GATE = woodFenceGate("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_PALE_OAK_WOOD_STAIRS = woodStairs("stripped_pale_oak", Blocks.STRIPPED_PALE_OAK_WOOD);
    public static final DeferredBlock<SlabBlock> STRIPPED_PALE_OAK_WOOD_SLAB = woodSlab("stripped_pale_oak", Blocks.STRIPPED_PALE_OAK_WOOD);
    public static final DeferredBlock<WallBlock> STRIPPED_PALE_OAK_WOOD_WALL = woodWall("stripped_pale_oak", Blocks.STRIPPED_PALE_OAK_WOOD);
    public static final DeferredBlock<FenceBlock> STRIPPED_PALE_OAK_WOOD_FENCE = woodFence("stripped_pale_oak", Blocks.STRIPPED_PALE_OAK_WOOD);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_PALE_OAK_WOOD_FENCE_GATE = woodFenceGate("stripped_pale_oak", Blocks.STRIPPED_PALE_OAK_WOOD);
    public static final DeferredBlock<StairBlock> STRIPPED_BAMBOO_BLOCK_STAIRS = register("stripped_bamboo_block_stairs", prop -> new StairBlock(Blocks.STRIPPED_BAMBOO_BLOCK.defaultBlockState(), prop), ()-> copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<SlabBlock> STRIPPED_BAMBOO_BLOCK_SLAB = register("stripped_bamboo_block_slab", SlabBlock::new, ()-> copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<WallBlock> STRIPPED_BAMBOO_BLOCK_WALL = register("stripped_bamboo_block_wall", WallBlock::new, ()-> copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<FenceBlock> STRIPPED_BAMBOO_BLOCK_FENCE = register("stripped_bamboo_block_fence", FenceBlock::new, ()-> copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = register("stripped_bamboo_block_fence_gate", prop -> new FenceGateBlock(WoodType.BAMBOO, prop), ()-> copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));

    public static final DeferredBlock<StairBlock> CRIMSON_HYPHAE_STAIRS = register("crimson_hyphae_stairs", prop -> new StairBlock(Blocks.CRIMSON_HYPHAE.defaultBlockState(), prop), ()-> copyProperties(Blocks.CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<SlabBlock> CRIMSON_HYPHAE_SLAB = register("crimson_hyphae_slab", SlabBlock::new, ()-> copyProperties(Blocks.CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<WallBlock> CRIMSON_HYPHAE_WALL = register("crimson_hyphae_wall", WallBlock::new, ()-> copyProperties(Blocks.CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceBlock> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence", FenceBlock::new, ()-> copyProperties(Blocks.CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate", prop -> new FenceGateBlock(WoodType.CRIMSON, prop), ()-> copyProperties(Blocks.CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<StairBlock> WARPED_HYPHAE_STAIRS = register("warped_hyphae_stairs", prop -> new StairBlock(Blocks.WARPED_HYPHAE.defaultBlockState(), prop), ()-> copyProperties(Blocks.WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<SlabBlock> WARPED_HYPHAE_SLAB = register("warped_hyphae_slab", SlabBlock::new, ()-> copyProperties(Blocks.WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<WallBlock> WARPED_HYPHAE_WALL = register("warped_hyphae_wall", WallBlock::new, ()-> copyProperties(Blocks.WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceBlock> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence", FenceBlock::new, ()-> copyProperties(Blocks.WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceGateBlock> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate", prop -> new FenceGateBlock(WoodType.WARPED, prop), ()-> copyProperties(Blocks.WARPED_HYPHAE), ()-> fireResistanceItemProperties);

    public static final DeferredBlock<StairBlock> STRIPPED_CRIMSON_HYPHAE_STAIRS = register("stripped_crimson_hyphae_stairs", prop -> new StairBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.defaultBlockState(), prop), ()-> copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab", SlabBlock::new, ()-> copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<WallBlock> STRIPPED_CRIMSON_HYPHAE_WALL = register("stripped_crimson_hyphae_wall", WallBlock::new, ()-> copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceBlock> STRIPPED_CRIMSON_HYPHAE_FENCE = register("stripped_crimson_hyphae_fence", FenceBlock::new, ()-> copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = register("stripped_crimson_hyphae_fence_gate", prop -> new FenceGateBlock(WoodType.CRIMSON, prop), ()-> copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<StairBlock> STRIPPED_WARPED_HYPHAE_STAIRS = register("stripped_warped_hyphae_stairs", prop -> new StairBlock(Blocks.STRIPPED_WARPED_HYPHAE.defaultBlockState(), prop), ()-> copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab", SlabBlock::new, ()-> copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<WallBlock> STRIPPED_WARPED_HYPHAE_WALL = register("stripped_warped_hyphae_wall", WallBlock::new, ()-> copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceBlock> STRIPPED_WARPED_HYPHAE_FENCE = register("stripped_warped_hyphae_fence", FenceBlock::new, ()-> copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), ()-> fireResistanceItemProperties);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_WARPED_HYPHAE_FENCE_GATE = register("stripped_warped_hyphae_fence_gate", prop -> new FenceGateBlock(WoodType.WARPED, prop), ()-> copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), ()-> fireResistanceItemProperties);

    public static final DeferredBlock<StairBlock> CALCITE_STAIRS = register("calcite_stairs", prop -> new StairBlock(Blocks.CALCITE.defaultBlockState(), prop), Blocks.CALCITE);
    public static final DeferredBlock<SlabBlock> CALCITE_SLAB = register("calcite_slab", SlabBlock::new, Blocks.CALCITE);
    public static final DeferredBlock<WallBlock> CALCITE_WALL = register("calcite_wall", WallBlock::new, Blocks.CALCITE);
    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", prop -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), prop), Blocks.SMOOTH_BASALT);
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", SlabBlock::new, Blocks.SMOOTH_BASALT);
    public static final DeferredBlock<WallBlock> SMOOTH_BASALT_WALL = register("smooth_basalt_wall", WallBlock::new, Blocks.SMOOTH_BASALT);

    public static final DeferredBlock<StairBlock> DEEPSLATE_STAIRS = register("deepslate_stairs", prop -> new StairBlock(Blocks.DEEPSLATE.defaultBlockState(), prop), Blocks.DEEPSLATE);
    public static final DeferredBlock<SlabBlock> DEEPSLATE_SLAB = register("deepslate_slab", SlabBlock::new, Blocks.DEEPSLATE);
    public static final DeferredBlock<WallBlock> DEEPSLATE_WALL = register("deepslate_wall", WallBlock::new, Blocks.DEEPSLATE);
    public static final DeferredBlock<StairBlock> CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", prop -> new StairBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), prop), Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final DeferredBlock<SlabBlock> CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", SlabBlock::new, Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final DeferredBlock<WallBlock> CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", WallBlock::new, Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final DeferredBlock<StairBlock> CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", prop -> new StairBlock(Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), prop), Blocks.CRACKED_DEEPSLATE_TILES);
    public static final DeferredBlock<SlabBlock> CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", SlabBlock::new, Blocks.CRACKED_DEEPSLATE_TILES);
    public static final DeferredBlock<WallBlock> CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", WallBlock::new, Blocks.CRACKED_DEEPSLATE_TILES);

    public static final DeferredBlock<FenceGateBlock> NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.CRIMSON, prop), ()-> copyProperties(Blocks.NETHER_BRICK_FENCE)); // TODO: fix wood type

    public static final DeferredBlock<StairBlock> CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", prop -> new StairBlock(Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(), prop), Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<SlabBlock> CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", SlabBlock::new, Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<WallBlock> CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", WallBlock::new, Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<FenceBlock> CRACKED_NETHER_BRICK_FENCE = register("cracked_nether_brick_fence", FenceBlock::new, Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<FenceGateBlock> CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.OAK, prop), ()-> copyProperties(Blocks.CRACKED_NETHER_BRICKS));

    public static final DeferredBlock<FenceBlock> RED_NETHER_BRICK_FENCE = register("red_nether_brick_fence", FenceBlock::new, Blocks.RED_NETHER_BRICKS);
    public static final DeferredBlock<FenceGateBlock> RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.OAK, prop), ()-> copyProperties(Blocks.RED_NETHER_BRICKS));

    public static final DeferredBlock<StairBlock> OBSIDIAN_STAIRS = register("obsidian_stairs", prop -> new StairBlock(Blocks.OBSIDIAN.defaultBlockState(), prop), Blocks.OBSIDIAN);
    public static final DeferredBlock<SlabBlock> OBSIDIAN_SLAB = register("obsidian_slab", SlabBlock::new, Blocks.OBSIDIAN);
    public static final DeferredBlock<WallBlock> OBSIDIAN_WALL = register("obsidian_wall", WallBlock::new, Blocks.OBSIDIAN);

    public static final DeferredBlock<StairBlock> CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", prop -> new StairBlock(Blocks.CRYING_OBSIDIAN.defaultBlockState(), prop), Blocks.CRYING_OBSIDIAN);
    public static final DeferredBlock<SlabBlock> CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", SlabBlock::new, Blocks.CRYING_OBSIDIAN);
    public static final DeferredBlock<WallBlock> CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", WallBlock::new, Blocks.CRYING_OBSIDIAN);

    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIRS = register("packed_mud_stairs", prop -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(), prop), Blocks.PACKED_MUD);
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = register("packed_mud_slab", SlabBlock::new, Blocks.PACKED_MUD);
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = register("packed_mud_wall", WallBlock::new, Blocks.PACKED_MUD);


    private static DeferredBlock<StairBlock> logStairs(String type, Block base) {
        return register(type + "_log_stairs", prop -> new StairBlock(base.defaultBlockState(), prop), ()-> copyProperties(base));
    }

    private static DeferredBlock<SlabBlock> logSlab(String type, Block base) {
        return register(type + "_log_slab", SlabBlock::new, ()-> copyProperties(base));
    }

    private static DeferredBlock<StairBlock> woodStairs(String type, Block base) {
        return register(type + "_wood_stairs", prop -> new StairBlock(base.defaultBlockState(), prop), ()-> copyProperties(base));
    }

    private static DeferredBlock<SlabBlock> woodSlab(String type, Block base) {
        return register(type + "_wood_slab", SlabBlock::new, ()-> copyProperties(base));
    }

    private static DeferredBlock<WallBlock> woodWall(String type, Block base) {
        return register(type + "_wood_wall", WallBlock::new, ()-> copyProperties(base));
    }

    private static DeferredBlock<FenceBlock> woodFence(String type, Block base) {
        return register(type + "_wood_fence", FenceBlock::new, ()-> copyProperties(base));
    }

    private static DeferredBlock<FenceGateBlock> woodFenceGate(String type, Block base) {
        return register(type + "_wood_fence_gate", prop -> new FenceGateBlock(woodTypeOf(type), prop), ()-> copyProperties(base));
    }


    private static WoodType woodTypeOf(String key) {
        key = key.replace("stripped_", "");
        var iterator = WoodType.values().iterator();
        while (iterator.hasNext()) {
            var type = iterator.next();
            if (type.name().contains(key)) return type;
        }
        throw new IllegalArgumentException("No wood type with key: " + key);
    }

    static Block getVanillaBlock(String name) {
        return BuiltInRegistries.BLOCK.get(Identifier.withDefaultNamespace(name)).orElseThrow().value();
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), ()-> copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base) {
        return register(name, block, ()-> copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, ()-> DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, Supplier<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }
}