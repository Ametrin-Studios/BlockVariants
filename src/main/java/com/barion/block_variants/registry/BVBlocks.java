package com.barion.block_variants.registry;

import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.block.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
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
import java.util.stream.Stream;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.copyProperties;

public final class BVBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);

    private static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties();
    private static final Item.Properties fireResistanceItemProperties = new Item.Properties().fireResistant();

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

    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIRS = register("terracotta_stairs", StairBlock::new, Blocks.TERRACOTTA);
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab", SlabBlock::new, Blocks.TERRACOTTA);
    public static final DeferredBlock<WallBlock> TERRACOTTA_WALL = register("terracotta_wall", WallBlock::new, Blocks.TERRACOTTA);

    public static final DeferredBlock<StairBlock> WHITE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> WHITE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> ORANGE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> ORANGE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> MAGENTA_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_TERRACOTTA_WALL = regTerracottaWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> YELLOW_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> YELLOW_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_TERRACOTTA_WALL = regTerracottaWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> LIME_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> PINK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> PINK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PINK);

    public static final DeferredBlock<StairBlock> GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> CYAN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> CYAN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> PURPLE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> PURPLE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> BROWN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> BROWN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> GREEN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> GREEN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> RED_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.RED, Blocks.RED_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> RED_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_TERRACOTTA_WALL = regTerracottaWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> BLACK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
    public static final DeferredBlock<SlabBlock> BLACK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLACK);

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

    public static final DeferredBlock<StrippableStairBlock> OAK_LOG_STAIRS = logStairs("oak", Blocks.OAK_WOOD, STRIPPED_OAK_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> OAK_LOG_SLAB = logSlab("oak", Blocks.OAK_WOOD, STRIPPED_OAK_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> SPRUCE_LOG_STAIRS = logStairs("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> SPRUCE_LOG_SLAB = logSlab("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> BIRCH_LOG_STAIRS = logStairs("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> BIRCH_LOG_SLAB = logSlab("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> JUNGLE_LOG_STAIRS = logStairs("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> JUNGLE_LOG_SLAB = logSlab("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> ACACIA_LOG_STAIRS = logStairs("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> ACACIA_LOG_SLAB = logSlab("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> DARK_OAK_LOG_STAIRS = logStairs("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> DARK_OAK_LOG_SLAB = logSlab("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> MANGROVE_LOG_STAIRS = logStairs("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> MANGROVE_LOG_SLAB = logSlab("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> CHERRY_LOG_STAIRS = logStairs("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> CHERRY_LOG_SLAB = logSlab("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_LOG_SLAB);
    public static final DeferredBlock<StrippableStairBlock> PALE_OAK_LOG_STAIRS = logStairs("pale_oak", Blocks.PALE_OAK_WOOD, STRIPPED_PALE_OAK_LOG_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> PALE_OAK_LOG_SLAB = logSlab("pale_oak", Blocks.PALE_OAK_WOOD, STRIPPED_PALE_OAK_LOG_SLAB);

    public static final DeferredBlock<StairBlock> STRIPPED_CRIMSON_STEM_STAIRS = register("stripped_crimson_stem_stairs", StairBlock::new, Blocks.STRIPPED_CRIMSON_STEM);
    public static final DeferredBlock<SlabBlock> STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_stem_slab", SlabBlock::new, Blocks.STRIPPED_CRIMSON_STEM);
    public static final DeferredBlock<StairBlock> STRIPPED_WARPED_STEM_STAIRS = register("stripped_warped_stem_stairs", StairBlock::new, Blocks.STRIPPED_WARPED_STEM);
    public static final DeferredBlock<SlabBlock> STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_stem_slab", SlabBlock::new, Blocks.STRIPPED_WARPED_STEM);

    public static final DeferredBlock<StrippableStairBlock> CRIMSON_STEM_STAIRS = register("crimson_stem_stairs", prop -> new StrippableStairBlock(STRIPPED_CRIMSON_STEM_STAIRS, Blocks.CRIMSON_STEM.defaultBlockState(), prop), Blocks.CRIMSON_STEM);
    public static final DeferredBlock<StrippableSlabBlock> CRIMSON_STEM_SLAB = register("crimson_stem_slab", prop -> new StrippableSlabBlock(STRIPPED_CRIMSON_STEM_SLAB, prop), copyProperties(Blocks.CRIMSON_STEM));
    public static final DeferredBlock<StrippableStairBlock> WARPED_STEM_STAIRS = register("warped_stem_stairs", prop -> new StrippableStairBlock(STRIPPED_WARPED_STEM_STAIRS, Blocks.WARPED_STEM.defaultBlockState(), prop), Blocks.WARPED_STEM);
    public static final DeferredBlock<StrippableSlabBlock> WARPED_STEM_SLAB = register("warped_stem_slab", prop -> new StrippableSlabBlock(STRIPPED_WARPED_STEM_SLAB, prop), copyProperties(Blocks.WARPED_STEM));

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
    public static final DeferredBlock<StairBlock> STRIPPED_BAMBOO_BLOCK_STAIRS = register("stripped_bamboo_block_stairs", prop -> new StairBlock(Blocks.STRIPPED_BAMBOO_BLOCK.defaultBlockState(), prop), copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<SlabBlock> STRIPPED_BAMBOO_BLOCK_SLAB = register("stripped_bamboo_block_slab", SlabBlock::new, copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<WallBlock> STRIPPED_BAMBOO_BLOCK_WALL = register("stripped_bamboo_block_wall", WallBlock::new, copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<FenceBlock> STRIPPED_BAMBOO_BLOCK_FENCE = register("stripped_bamboo_block_fence", FenceBlock::new, copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = register("stripped_bamboo_block_fence_gate", prop -> new FenceGateBlock(WoodType.BAMBOO, prop), copyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));

    public static final DeferredBlock<StrippableStairBlock> OAK_WOOD_STAIRS = woodStairs("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> OAK_WOOD_SLAB = woodSlab("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> OAK_WOOD_WALL = woodWall("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> OAK_WOOD_FENCE = woodFence("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> OAK_WOOD_FENCE_GATE = woodFenceGate(WoodType.OAK, Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> SPRUCE_WOOD_STAIRS = woodStairs("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> SPRUCE_WOOD_SLAB = woodSlab("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> SPRUCE_WOOD_WALL = woodWall("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> SPRUCE_WOOD_FENCE = woodFence("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> SPRUCE_WOOD_FENCE_GATE = woodFenceGate(WoodType.SPRUCE, Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> BIRCH_WOOD_STAIRS = woodStairs("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> BIRCH_WOOD_SLAB = woodSlab("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> BIRCH_WOOD_WALL = woodWall("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> BIRCH_WOOD_FENCE = woodFence("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> BIRCH_WOOD_FENCE_GATE = woodFenceGate(WoodType.BIRCH, Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> JUNGLE_WOOD_STAIRS = woodStairs("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> JUNGLE_WOOD_SLAB = woodSlab("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> JUNGLE_WOOD_WALL = woodWall("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> JUNGLE_WOOD_FENCE = woodFence("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> JUNGLE_WOOD_FENCE_GATE = woodFenceGate(WoodType.JUNGLE, Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> ACACIA_WOOD_STAIRS = woodStairs("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> ACACIA_WOOD_SLAB = woodSlab("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> ACACIA_WOOD_WALL = woodWall("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> ACACIA_WOOD_FENCE = woodFence("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> ACACIA_WOOD_FENCE_GATE = woodFenceGate(WoodType.ACACIA, Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> DARK_OAK_WOOD_STAIRS = woodStairs("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> DARK_OAK_WOOD_SLAB = woodSlab("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> DARK_OAK_WOOD_WALL = woodWall("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> DARK_OAK_WOOD_FENCE = woodFence("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = woodFenceGate(WoodType.DARK_OAK, Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> MANGROVE_WOOD_STAIRS = woodStairs("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> MANGROVE_WOOD_SLAB = woodSlab("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> MANGROVE_WOOD_WALL = woodWall("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> MANGROVE_WOOD_FENCE = woodFence("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> MANGROVE_WOOD_FENCE_GATE = woodFenceGate(WoodType.MANGROVE, Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> CHERRY_WOOD_STAIRS = woodStairs("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> CHERRY_WOOD_SLAB = woodSlab("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> CHERRY_WOOD_WALL = woodWall("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> CHERRY_WOOD_FENCE = woodFence("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> CHERRY_WOOD_FENCE_GATE = woodFenceGate(WoodType.CHERRY, Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> PALE_OAK_WOOD_STAIRS = woodStairs("pale_oak", Blocks.PALE_OAK_WOOD, STRIPPED_PALE_OAK_WOOD_STAIRS);
    public static final DeferredBlock<StrippableSlabBlock> PALE_OAK_WOOD_SLAB = woodSlab("pale_oak", Blocks.PALE_OAK_WOOD, STRIPPED_PALE_OAK_WOOD_SLAB);
    public static final DeferredBlock<StrippableWallBlock> PALE_OAK_WOOD_WALL = woodWall("pale_oak", Blocks.PALE_OAK_WOOD, STRIPPED_PALE_OAK_WOOD_WALL);
    public static final DeferredBlock<StrippableFenceBlock> PALE_OAK_WOOD_FENCE = woodFence("pale_oak", Blocks.PALE_OAK_WOOD, STRIPPED_PALE_OAK_WOOD_FENCE);
    public static final DeferredBlock<StrippableFenceGateBlock> PALE_OAK_WOOD_FENCE_GATE = woodFenceGate(WoodType.PALE_OAK, Blocks.PALE_OAK_WOOD, STRIPPED_PALE_OAK_WOOD_FENCE_GATE);
    public static final DeferredBlock<StrippableStairBlock> BAMBOO_BLOCK_STAIRS = register("bamboo_block_stairs", prop -> new StrippableStairBlock(STRIPPED_BAMBOO_BLOCK_STAIRS, Blocks.BAMBOO_BLOCK.defaultBlockState(), prop), copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<StrippableSlabBlock> BAMBOO_BLOCK_SLAB = register("bamboo_block_slab", prop -> new StrippableSlabBlock(STRIPPED_BAMBOO_BLOCK_SLAB, prop), copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<StrippableWallBlock> BAMBOO_BLOCK_WALL = register("bamboo_block_wall", prop -> new StrippableWallBlock(STRIPPED_BAMBOO_BLOCK_WALL, prop), copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT));
    public static final DeferredBlock<StrippableFenceBlock> BAMBOO_BLOCK_FENCE = register("bamboo_block_fence", prop -> new StrippableFenceBlock(STRIPPED_BAMBOO_BLOCK_FENCE, prop), copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT));
    public static final DeferredBlock<StrippableFenceGateBlock> BAMBOO_BLOCK_FENCE_GATE = register("bamboo_block_fence_gate", prop -> new StrippableFenceGateBlock(STRIPPED_BAMBOO_BLOCK_FENCE_GATE, WoodType.BAMBOO, prop), copyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT));

    public static final DeferredBlock<StairBlock> STRIPPED_CRIMSON_HYPHAE_STAIRS = register("stripped_crimson_hyphae_stairs", prop -> new StairBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.defaultBlockState(), prop), copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab", SlabBlock::new, copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<WallBlock> STRIPPED_CRIMSON_HYPHAE_WALL = register("stripped_crimson_hyphae_wall", WallBlock::new, copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<FenceBlock> STRIPPED_CRIMSON_HYPHAE_FENCE = register("stripped_crimson_hyphae_fence", FenceBlock::new, copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = register("stripped_crimson_hyphae_fence_gate", prop -> new FenceGateBlock(WoodType.CRIMSON, prop), copyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StairBlock> STRIPPED_WARPED_HYPHAE_STAIRS = register("stripped_warped_hyphae_stairs", prop -> new StairBlock(Blocks.STRIPPED_WARPED_HYPHAE.defaultBlockState(), prop), copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab", SlabBlock::new, copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<WallBlock> STRIPPED_WARPED_HYPHAE_WALL = register("stripped_warped_hyphae_wall", WallBlock::new, copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<FenceBlock> STRIPPED_WARPED_HYPHAE_FENCE = register("stripped_warped_hyphae_fence", FenceBlock::new, copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<FenceGateBlock> STRIPPED_WARPED_HYPHAE_FENCE_GATE = register("stripped_warped_hyphae_fence_gate", prop -> new FenceGateBlock(WoodType.WARPED, prop), copyProperties(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);

    public static final DeferredBlock<StrippableStairBlock> CRIMSON_HYPHAE_STAIRS = register("crimson_hyphae_stairs", prop -> new StrippableStairBlock(STRIPPED_CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_HYPHAE.defaultBlockState(), prop), copyProperties(Blocks.CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableSlabBlock> CRIMSON_HYPHAE_SLAB = register("crimson_hyphae_slab", prop -> new StrippableSlabBlock(STRIPPED_CRIMSON_HYPHAE_SLAB, prop), copyProperties(Blocks.CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableWallBlock> CRIMSON_HYPHAE_WALL = register("crimson_hyphae_wall", prop -> new StrippableWallBlock(STRIPPED_CRIMSON_HYPHAE_WALL, prop), copyProperties(Blocks.CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableFenceBlock> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence", prop -> new StrippableFenceBlock(STRIPPED_CRIMSON_HYPHAE_FENCE, prop), copyProperties(Blocks.CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableFenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate", prop -> new StrippableFenceGateBlock(STRIPPED_CRIMSON_HYPHAE_FENCE_GATE, WoodType.CRIMSON, prop), copyProperties(Blocks.CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableStairBlock> WARPED_HYPHAE_STAIRS = register("warped_hyphae_stairs", prop -> new StrippableStairBlock(STRIPPED_WARPED_HYPHAE_STAIRS, Blocks.WARPED_HYPHAE.defaultBlockState(), prop), copyProperties(Blocks.WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableSlabBlock> WARPED_HYPHAE_SLAB = register("warped_hyphae_slab", prop -> new StrippableSlabBlock(STRIPPED_WARPED_HYPHAE_SLAB, prop), copyProperties(Blocks.WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableWallBlock> WARPED_HYPHAE_WALL = register("warped_hyphae_wall", prop -> new StrippableWallBlock(STRIPPED_WARPED_HYPHAE_WALL, prop), copyProperties(Blocks.WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableFenceBlock> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence", prop -> new StrippableFenceBlock(STRIPPED_WARPED_HYPHAE_FENCE, prop), copyProperties(Blocks.WARPED_HYPHAE), fireResistanceItemProperties);
    public static final DeferredBlock<StrippableFenceGateBlock> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate", prop -> new StrippableFenceGateBlock(STRIPPED_WARPED_HYPHAE_FENCE_GATE, WoodType.WARPED, prop), copyProperties(Blocks.WARPED_HYPHAE), fireResistanceItemProperties);

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

    public static final DeferredBlock<FenceGateBlock> NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.CRIMSON, prop), copyProperties(Blocks.NETHER_BRICK_FENCE)); // TODO: fix wood type

    public static final DeferredBlock<StairBlock> CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", prop -> new StairBlock(Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(), prop), Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<SlabBlock> CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", SlabBlock::new, Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<WallBlock> CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", WallBlock::new, Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<FenceBlock> CRACKED_NETHER_BRICK_FENCE = register("cracked_nether_brick_fence", FenceBlock::new, Blocks.CRACKED_NETHER_BRICKS);
    public static final DeferredBlock<FenceGateBlock> CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.OAK, prop), copyProperties(Blocks.CRACKED_NETHER_BRICKS));

    public static final DeferredBlock<FenceBlock> RED_NETHER_BRICK_FENCE = register("red_nether_brick_fence", FenceBlock::new, Blocks.RED_NETHER_BRICKS);
    public static final DeferredBlock<FenceGateBlock> RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", prop -> new FenceGateBlock(WoodType.OAK, prop), copyProperties(Blocks.RED_NETHER_BRICKS));

    public static final DeferredBlock<StairBlock> OBSIDIAN_STAIRS = register("obsidian_stairs", prop -> new StairBlock(Blocks.OBSIDIAN.defaultBlockState(), prop), Blocks.OBSIDIAN);
    public static final DeferredBlock<SlabBlock> OBSIDIAN_SLAB = register("obsidian_slab", SlabBlock::new, Blocks.OBSIDIAN);
    public static final DeferredBlock<WallBlock> OBSIDIAN_WALL = register("obsidian_wall", WallBlock::new, Blocks.OBSIDIAN);

    public static final DeferredBlock<StairBlock> CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", prop -> new StairBlock(Blocks.CRYING_OBSIDIAN.defaultBlockState(), prop), Blocks.CRYING_OBSIDIAN);
    public static final DeferredBlock<SlabBlock> CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", SlabBlock::new, Blocks.CRYING_OBSIDIAN);
    public static final DeferredBlock<WallBlock> CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", WallBlock::new, Blocks.CRYING_OBSIDIAN);

    public static final DeferredBlock<StairBlock> WHITE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.WHITE);
    public static final DeferredBlock<SlabBlock> WHITE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> ORANGE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.ORANGE);
    public static final DeferredBlock<SlabBlock> ORANGE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> MAGENTA_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.MAGENTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> YELLOW_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.YELLOW);
    public static final DeferredBlock<SlabBlock> YELLOW_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIME);
    public static final DeferredBlock<SlabBlock> LIME_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> PINK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PINK);
    public static final DeferredBlock<SlabBlock> PINK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PINK);

    public static final DeferredBlock<StairBlock> GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GRAY);
    public static final DeferredBlock<SlabBlock> GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> CYAN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.CYAN);
    public static final DeferredBlock<SlabBlock> CYAN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> PURPLE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PURPLE);
    public static final DeferredBlock<SlabBlock> PURPLE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLUE);
    public static final DeferredBlock<SlabBlock> BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> BROWN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BROWN);
    public static final DeferredBlock<SlabBlock> BROWN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> GREEN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GREEN);
    public static final DeferredBlock<SlabBlock> GREEN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> RED_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.RED);
    public static final DeferredBlock<SlabBlock> RED_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> BLACK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLACK);
    public static final DeferredBlock<SlabBlock> BLACK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> WHITE_WOOL_STAIRS = regWoolStairs(DyeColor.WHITE);
    public static final DeferredBlock<SlabBlock> WHITE_WOOL_SLAB = regWoolSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_WOOL_WALL = regWoolWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> ORANGE_WOOL_STAIRS = regWoolStairs(DyeColor.ORANGE);
    public static final DeferredBlock<SlabBlock> ORANGE_WOOL_SLAB = regWoolSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_WOOL_WALL = regWoolWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> MAGENTA_WOOL_STAIRS = regWoolStairs(DyeColor.MAGENTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_WOOL_SLAB = regWoolSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_WOOL_WALL = regWoolWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_WOOL_STAIRS = regWoolStairs(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_WOOL_SLAB = regWoolSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_WOOL_WALL = regWoolWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> YELLOW_WOOL_STAIRS = regWoolStairs(DyeColor.YELLOW);
    public static final DeferredBlock<SlabBlock> YELLOW_WOOL_SLAB = regWoolSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_WOOL_WALL = regWoolWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_WOOL_STAIRS = regWoolStairs(DyeColor.LIME);
    public static final DeferredBlock<SlabBlock> LIME_WOOL_SLAB = regWoolSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_WOOL_WALL = regWoolWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> PINK_WOOL_STAIRS = regWoolStairs(DyeColor.PINK);
    public static final DeferredBlock<SlabBlock> PINK_WOOL_SLAB = regWoolSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_WOOL_WALL = regWoolWall(DyeColor.PINK);

    public static final DeferredBlock<StairBlock> GRAY_WOOL_STAIRS = regWoolStairs(DyeColor.GRAY);
    public static final DeferredBlock<SlabBlock> GRAY_WOOL_SLAB = regWoolSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_WOOL_WALL = regWoolWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_WOOL_STAIRS = regWoolStairs(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_WOOL_SLAB = regWoolSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_WOOL_WALL = regWoolWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> CYAN_WOOL_STAIRS = regWoolStairs(DyeColor.CYAN);
    public static final DeferredBlock<SlabBlock> CYAN_WOOL_SLAB = regWoolSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_WOOL_WALL = regWoolWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> PURPLE_WOOL_STAIRS = regWoolStairs(DyeColor.PURPLE);
    public static final DeferredBlock<SlabBlock> PURPLE_WOOL_SLAB = regWoolSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_WOOL_WALL = regWoolWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> BLUE_WOOL_STAIRS = regWoolStairs(DyeColor.BLUE);
    public static final DeferredBlock<SlabBlock> BLUE_WOOL_SLAB = regWoolSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_WOOL_WALL = regWoolWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> BROWN_WOOL_STAIRS = regWoolStairs(DyeColor.BROWN);
    public static final DeferredBlock<SlabBlock> BROWN_WOOL_SLAB = regWoolSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_WOOL_WALL = regWoolWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> GREEN_WOOL_STAIRS = regWoolStairs(DyeColor.GREEN);
    public static final DeferredBlock<SlabBlock> GREEN_WOOL_SLAB = regWoolSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_WOOL_WALL = regWoolWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> RED_WOOL_STAIRS = regWoolStairs(DyeColor.RED);
    public static final DeferredBlock<SlabBlock> RED_WOOL_SLAB = regWoolSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_WOOL_WALL = regWoolWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> BLACK_WOOL_STAIRS = regWoolStairs(DyeColor.BLACK);
    public static final DeferredBlock<SlabBlock> BLACK_WOOL_SLAB = regWoolSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_WOOL_WALL = regWoolWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIRS = register("packed_mud_stairs", prop -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(), prop), Blocks.PACKED_MUD);
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = register("packed_mud_slab", SlabBlock::new, Blocks.PACKED_MUD);
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = register("packed_mud_wall", WallBlock::new, Blocks.PACKED_MUD);

    private static DeferredBlock<StairBlock> regTerracottaStairs(DyeColor color, Block base) {
        return register(color.getName() + "_terracotta_stairs", prop -> new StairBlock(base.defaultBlockState(), prop), copyProperties(base));
    }

    private static DeferredBlock<SlabBlock> regTerracottaSlab(DyeColor color) {
        return register(color.getName() + "_terracotta_slab", SlabBlock::new, copyProperties(Blocks.TERRACOTTA));
    }

    private static DeferredBlock<WallBlock> regTerracottaWall(DyeColor color) {
        return register(color.getName() + "_terracotta_wall", WallBlock::new, copyProperties(Blocks.TERRACOTTA));
    }

    private static DeferredBlock<StrippableStairBlock> logStairs(String type, Block base, Supplier<StairBlock> stripped) {
        return register(type + "_log_stairs", prop -> new StrippableStairBlock(stripped, base.defaultBlockState(), prop), copyProperties(base));
    }

    private static DeferredBlock<StairBlock> logStairs(String type, Block base) {
        return register(type + "_log_stairs", prop -> new StairBlock(base.defaultBlockState(), prop), copyProperties(base));
    }

    private static DeferredBlock<SlabBlock> logSlab(String type, Block base) {
        return register(type + "_log_slab", SlabBlock::new, copyProperties(base));
    }

    private static DeferredBlock<StrippableSlabBlock> logSlab(String type, Block base, Supplier<SlabBlock> stripped) {
        return register(type + "_log_slab", prop -> new StrippableSlabBlock(stripped, prop), copyProperties(base));
    }

    private static DeferredBlock<StairBlock> woodStairs(String type, Block base) {
        return register(type + "_wood_stairs", prop -> new StairBlock(base.defaultBlockState(), prop), copyProperties(base));
    }

    private static DeferredBlock<StrippableStairBlock> woodStairs(String type, Block base, Supplier<StairBlock> stripped) {
        return register(type + "_wood_stairs", prop -> new StrippableStairBlock(stripped, base.defaultBlockState(), prop), copyProperties(base));
    }

    private static DeferredBlock<SlabBlock> woodSlab(String type, Block base) {
        return register(type + "_wood_slab", SlabBlock::new, copyProperties(base));
    }

    private static DeferredBlock<StrippableSlabBlock> woodSlab(String type, Block base, Supplier<SlabBlock> stripped) {
        return register(type + "_wood_slab", prop -> new StrippableSlabBlock(stripped, prop), copyProperties(base));
    }

    private static DeferredBlock<WallBlock> woodWall(String type, Block base) {
        return register(type + "_wood_wall", WallBlock::new, copyProperties(base));
    }

    private static DeferredBlock<StrippableWallBlock> woodWall(String type, Block base, Supplier<WallBlock> stripped) {
        return register(type + "_wood_wall", prop -> new StrippableWallBlock(stripped, prop), copyProperties(base));
    }

    private static DeferredBlock<FenceBlock> woodFence(String type, Block base) {
        return register(type + "_wood_fence", FenceBlock::new, copyProperties(base));
    }

    private static DeferredBlock<StrippableFenceBlock> woodFence(String type, Block base, Supplier<FenceBlock> stripped) {
        return register(type + "_wood_fence", prop -> new StrippableFenceBlock(stripped, prop), copyProperties(base));
    }

    private static DeferredBlock<FenceGateBlock> woodFenceGate(String type, Block base) {
        return register(type + "_wood_fence_gate", prop -> new FenceGateBlock(woodTypeOf(type), prop), copyProperties(base));
    }

    private static DeferredBlock<StrippableFenceGateBlock> woodFenceGate(WoodType type, Block base, Supplier<FenceGateBlock> stripped) {
        return register(type.name() + "_wood_fence_gate", prop -> new StrippableFenceGateBlock(stripped, type, prop), copyProperties(base));
    }

    private static DeferredBlock<StairBlock> regGlazedTerracottaStairs(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_stairs", prop -> new StairBlock(parent.defaultBlockState(), prop), parent);
    }

    private static DeferredBlock<SlabBlock> regGlazedTerracottaSlab(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_slab", SlabBlock::new, parent);
    }

    private static DeferredBlock<WallBlock> regGlazedTerracottaWall(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_wall", WallBlock::new, parent);
    }

    private static DeferredBlock<StairBlock> regWoolStairs(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_stairs", prop -> new StairBlock(parent.defaultBlockState(), prop), parent);
    }

    private static DeferredBlock<SlabBlock> regWoolSlab(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_slab", SlabBlock::new, parent);
    }

    private static DeferredBlock<WallBlock> regWoolWall(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_wall", WallBlock::new, parent);
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

    private static Block getVanillaBlock(String name) {
        return BuiltInRegistries.BLOCK.get(ResourceLocation.withDefaultNamespace(name)).orElseThrow().value();
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base) {
        return register(name, block, copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties) {
        return register(name, block, properties, DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties, Item.Properties itemProperties) {
        var registryObject = registerWithoutItem(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }

    private static <T extends Block> DeferredBlock<T> registerWithoutItem(String name, Function<BlockBehaviour.Properties, T> block, BlockBehaviour.Properties properties) {
        return REGISTER.registerBlock(name, block, properties);
    }

    public static Stream<? extends Block> getAllBlocks() {
        return REGISTER.getEntries().stream().map(Supplier::get);
    }
}