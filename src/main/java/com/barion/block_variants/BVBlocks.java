package com.barion.block_variants;

import com.barion.block_variants.block.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.function.Supplier;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.CopyProperties;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.fenceGate;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.stair;

public final class BVBlocks {
    public static final DeferredRegister.Blocks BLOCK_REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);
    public static final DeferredRegister.Items ITEM_REGISTER = DeferredRegister.createItems(BlockVariants.MOD_ID);

    private static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties();
    private static final Item.Properties fireResistanceItemProperties = new Item.Properties().fireResistant();


    public static final Supplier<WallBlock> POLISHED_GRANITE_WALL = register("polished_granite_wall", wall(Blocks.POLISHED_GRANITE));
    public static final Supplier<WallBlock> POLISHED_DIORITE_WALL = register("polished_diorite_wall", wall(Blocks.POLISHED_DIORITE));
    public static final Supplier<WallBlock> POLISHED_ANDESITE_WALL = register("polished_andesite_wall", wall(Blocks.POLISHED_ANDESITE));

    public static final Supplier<WallBlock> STONE_WALL = register("stone_wall", wall(Blocks.STONE));
    public static final Supplier<StairBlock> SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", stair(Blocks.SMOOTH_STONE));
    public static final Supplier<WallBlock> SMOOTH_STONE_WALL = register("smooth_stone_wall", wall(Blocks.SMOOTH_STONE));

    public static final Supplier<StairBlock> CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", stair(Blocks.CUT_SANDSTONE));
    public static final Supplier<WallBlock> CUT_SANDSTONE_WALL = register("cut_sandstone_wall", wall(Blocks.CUT_SANDSTONE));
    public static final Supplier<StairBlock> CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", stair(Blocks.CUT_RED_SANDSTONE));
    public static final Supplier<WallBlock> CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", wall(Blocks.CUT_RED_SANDSTONE));

    public static final Supplier<WallBlock> QUARTZ_WALL = register("quartz_wall", wall(Blocks.QUARTZ_BLOCK));
    public static final Supplier<StairBlock> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", stair(Blocks.QUARTZ_BRICKS));
    public static final Supplier<SlabBlock> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", slab(Blocks.QUARTZ_BRICKS));
    public static final Supplier<WallBlock> QUARTZ_BRICK_WALL = register("quartz_brick_wall", wall(Blocks.QUARTZ_BRICKS));
    public static final Supplier<WallBlock> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", wall(Blocks.SMOOTH_QUARTZ));
    public static final Supplier<StairBlock> CHISELED_QUARTZ_BLOCK_STAIRS = register("chiseled_quartz_block_stairs", stair(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final Supplier<SlabBlock> CHISELED_QUARTZ_BLOCK_SLAB = register("chiseled_quartz_block_slab", slab(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final Supplier<WallBlock> CHISELED_QUARTZ_BLOCK_WALL = register("chiseled_quartz_block_wall", wall(Blocks.CHISELED_QUARTZ_BLOCK));

    public static final Supplier<WallBlock> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", wall(Blocks.PRISMARINE_BRICKS));
    public static final Supplier<WallBlock> DARK_PRISMARINE_WALL = register("dark_prismarine_wall", wall(Blocks.PRISMARINE_BRICKS));

    public static final Supplier<StairBlock> NETHERRACK_STAIRS = register("netherrack_stairs", stair(Blocks.NETHERRACK));
    public static final Supplier<SlabBlock> NETHERRACK_SLAB = register("netherrack_slab", slab(Blocks.NETHERRACK));
    public static final Supplier<WallBlock> NETHERRACK_WALL = register("netherrack_wall", wall(Blocks.NETHERRACK));

    public static final Supplier<StairBlock> END_STONE_STAIRS = register("end_stone_stairs", stair(Blocks.END_STONE));
    public static final Supplier<SlabBlock> END_STONE_SLAB = register("end_stone_slab", slab(Blocks.END_STONE));
    public static final Supplier<WallBlock> END_STONE_WALL = register("end_stone_wall", wall(Blocks.END_STONE));
    public static final Supplier<WallBlock> PURPUR_WALL = register("purpur_wall", wall(Blocks.PURPUR_BLOCK));

    public static final Supplier<StairBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs", stair(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Supplier<SlabBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab", slab(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final Supplier<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall", wall(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    public static final Supplier<StairBlock> BASALT_STAIRS = register("basalt_stairs", stair(Blocks.BASALT));
    public static final Supplier<SlabBlock> BASALT_SLAB = register("basalt_slab", slab(Blocks.BASALT));
    public static final Supplier<WallBlock> BASALT_WALL = register("basalt_wall", wall(Blocks.BASALT));

    public static final Supplier<StairBlock> POLISHED_BASALT_STAIRS = register("polished_basalt_stairs", stair(Blocks.POLISHED_BASALT));
    public static final Supplier<SlabBlock> POLISHED_BASALT_SLAB = register("polished_basalt_slab", slab(Blocks.POLISHED_BASALT));
    public static final Supplier<WallBlock> POLISHED_BASALT_WALL = register("polished_basalt_wall", wall(Blocks.POLISHED_BASALT));

    public static final Supplier<StairBlock> TERRACOTTA_STAIRS = register("terracotta_stairs", stair(Blocks.TERRACOTTA));
    public static final Supplier<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab", slab(Blocks.TERRACOTTA));
    public static final Supplier<WallBlock> TERRACOTTA_WALL = register("terracotta_wall", wall(Blocks.TERRACOTTA));

    public static final Supplier<StairBlock> WHITE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
    public static final Supplier<SlabBlock> WHITE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.WHITE);
    public static final Supplier<WallBlock> WHITE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.WHITE);

    public static final Supplier<StairBlock> ORANGE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
    public static final Supplier<SlabBlock> ORANGE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.ORANGE);
    public static final Supplier<WallBlock> ORANGE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.ORANGE);

    public static final Supplier<StairBlock> MAGENTA_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
    public static final Supplier<SlabBlock> MAGENTA_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.MAGENTA);
    public static final Supplier<WallBlock> MAGENTA_TERRACOTTA_WALL = regTerracottaWall(DyeColor.MAGENTA);

    public static final Supplier<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Supplier<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final Supplier<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final Supplier<StairBlock> YELLOW_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
    public static final Supplier<SlabBlock> YELLOW_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.YELLOW);
    public static final Supplier<WallBlock> YELLOW_TERRACOTTA_WALL = regTerracottaWall(DyeColor.YELLOW);

    public static final Supplier<StairBlock> LIME_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
    public static final Supplier<SlabBlock> LIME_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIME);
    public static final Supplier<WallBlock> LIME_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIME);

    public static final Supplier<StairBlock> PINK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
    public static final Supplier<SlabBlock> PINK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PINK);
    public static final Supplier<WallBlock> PINK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PINK);

    public static final Supplier<StairBlock> GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
    public static final Supplier<SlabBlock> GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GRAY);
    public static final Supplier<WallBlock> GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GRAY);

    public static final Supplier<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Supplier<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final Supplier<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final Supplier<StairBlock> CYAN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
    public static final Supplier<SlabBlock> CYAN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.CYAN);
    public static final Supplier<WallBlock> CYAN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.CYAN);

    public static final Supplier<StairBlock> PURPLE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
    public static final Supplier<SlabBlock> PURPLE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PURPLE);
    public static final Supplier<WallBlock> PURPLE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PURPLE);

    public static final Supplier<StairBlock> BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
    public static final Supplier<SlabBlock> BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLUE);
    public static final Supplier<WallBlock> BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLUE);

    public static final Supplier<StairBlock> BROWN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
    public static final Supplier<SlabBlock> BROWN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BROWN);
    public static final Supplier<WallBlock> BROWN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BROWN);

    public static final Supplier<StairBlock> GREEN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
    public static final Supplier<SlabBlock> GREEN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GREEN);
    public static final Supplier<WallBlock> GREEN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GREEN);

    public static final Supplier<StairBlock> RED_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.RED, Blocks.RED_TERRACOTTA);
    public static final Supplier<SlabBlock> RED_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.RED);
    public static final Supplier<WallBlock> RED_TERRACOTTA_WALL = regTerracottaWall(DyeColor.RED);

    public static final Supplier<StairBlock> BLACK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
    public static final Supplier<SlabBlock> BLACK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLACK);
    public static final Supplier<WallBlock> BLACK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLACK);

    public static final Supplier<StairBlock> DRIPSTONE_BLOCK_STAIRS = register("dripstone_block_stairs", stair(Blocks.DRIPSTONE_BLOCK));
    public static final Supplier<SlabBlock> DRIPSTONE_BLOCK_SLAB = register("dripstone_block_slab", slab(Blocks.DRIPSTONE_BLOCK));
    public static final Supplier<WallBlock> DRIPSTONE_BLOCK_WALL = register("dripstone_block_wall", wall(Blocks.DRIPSTONE_BLOCK));
    public static final Supplier<StairBlock> AMETHYST_BLOCK_STAIRS = register("amethyst_block_stairs", stair(Blocks.AMETHYST_BLOCK));
    public static final Supplier<SlabBlock> AMETHYST_BLOCK_SLAB = register("amethyst_block_slab", slab(Blocks.AMETHYST_BLOCK));
    public static final Supplier<WallBlock> AMETHYST_BLOCK_WALL = register("amethyst_block_wall", wall(Blocks.AMETHYST_BLOCK));

    public static final Supplier<StairBlock> CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", stair(Blocks.CRACKED_STONE_BRICKS));
    public static final Supplier<SlabBlock> CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", slab(Blocks.CRACKED_STONE_BRICKS));
    public static final Supplier<WallBlock> CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", wall(Blocks.CRACKED_STONE_BRICKS));

    public static final Supplier<StairBlock> STRIPPED_OAK_LOG_STAIRS = logStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD); // log sets its material color based of the AXIS
    public static final Supplier<SlabBlock> STRIPPED_OAK_LOG_SLAB = logSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final Supplier<StairBlock> STRIPPED_SPRUCE_LOG_STAIRS = logStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_SPRUCE_LOG_SLAB = logSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Supplier<StairBlock> STRIPPED_BIRCH_LOG_STAIRS = logStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_BIRCH_LOG_SLAB = logSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final Supplier<StairBlock> STRIPPED_JUNGLE_LOG_STAIRS = logStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_JUNGLE_LOG_SLAB = logSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Supplier<StairBlock> STRIPPED_ACACIA_LOG_STAIRS = logStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_ACACIA_LOG_SLAB = logSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final Supplier<StairBlock> STRIPPED_DARK_OAK_LOG_STAIRS = logStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_DARK_OAK_LOG_SLAB = logSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<StairBlock> STRIPPED_MANGROVE_LOG_STAIRS = logStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD); // Stripped Mangrove color maps based on Axis
    public static final Supplier<SlabBlock> STRIPPED_MANGROVE_LOG_SLAB = logSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<StairBlock> STRIPPED_CHERRY_LOG_STAIRS = logStairs("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_CHERRY_LOG_SLAB = logSlab("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);

    public static final Supplier<StrippableStairBlock> OAK_LOG_STAIRS = logStairs("oak", Blocks.OAK_WOOD, STRIPPED_OAK_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> OAK_LOG_SLAB = logSlab("oak", Blocks.OAK_WOOD, STRIPPED_OAK_LOG_SLAB);
    public static final Supplier<StrippableStairBlock> SPRUCE_LOG_STAIRS = logStairs("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> SPRUCE_LOG_SLAB = logSlab("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_SLAB);
    public static final Supplier<StrippableStairBlock> BIRCH_LOG_STAIRS = logStairs("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> BIRCH_LOG_SLAB = logSlab("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_LOG_SLAB);
    public static final Supplier<StrippableStairBlock> JUNGLE_LOG_STAIRS = logStairs("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> JUNGLE_LOG_SLAB = logSlab("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_SLAB);
    public static final Supplier<StrippableStairBlock> ACACIA_LOG_STAIRS = logStairs("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> ACACIA_LOG_SLAB = logSlab("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_LOG_SLAB);
    public static final Supplier<StrippableStairBlock> DARK_OAK_LOG_STAIRS = logStairs("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> DARK_OAK_LOG_SLAB = logSlab("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_SLAB);
    public static final Supplier<StrippableStairBlock> MANGROVE_LOG_STAIRS = logStairs("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> MANGROVE_LOG_SLAB = logSlab("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_LOG_SLAB);
    public static final Supplier<StrippableStairBlock> CHERRY_LOG_STAIRS = logStairs("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_LOG_STAIRS);
    public static final Supplier<StrippableSlabBlock> CHERRY_LOG_SLAB = logSlab("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_LOG_SLAB);

    public static final Supplier<StairBlock> STRIPPED_CRIMSON_STEM_STAIRS = register("stripped_crimson_stem_stairs", stair(Blocks.STRIPPED_CRIMSON_STEM));
    public static final Supplier<SlabBlock> STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_stem_slab", slab(Blocks.STRIPPED_CRIMSON_STEM));
    public static final Supplier<StairBlock> STRIPPED_WARPED_STEM_STAIRS = register("stripped_warped_stem_stairs", stair(Blocks.STRIPPED_WARPED_STEM));
    public static final Supplier<SlabBlock> STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_stem_slab", slab(Blocks.STRIPPED_WARPED_STEM));

    public static final Supplier<StrippableStairBlock> CRIMSON_STEM_STAIRS = register("crimson_stem_stairs", strippableStair(Blocks.CRIMSON_STEM, STRIPPED_CRIMSON_STEM_STAIRS));
    public static final Supplier<StrippableSlabBlock> CRIMSON_STEM_SLAB = register("crimson_stem_slab", strippableSlab(Blocks.CRIMSON_STEM, STRIPPED_CRIMSON_STEM_SLAB));
    public static final Supplier<StrippableStairBlock> WARPED_STEM_STAIRS = register("warped_stem_stairs", strippableStair(Blocks.WARPED_STEM, STRIPPED_WARPED_STEM_STAIRS));
    public static final Supplier<StrippableSlabBlock> WARPED_STEM_SLAB = register("warped_stem_slab", strippableSlab(Blocks.WARPED_STEM, STRIPPED_WARPED_STEM_SLAB));

    public static final Supplier<StairBlock> STRIPPED_OAK_WOOD_STAIRS = woodStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_OAK_WOOD_SLAB = woodSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final Supplier<WallBlock> STRIPPED_OAK_WOOD_WALL = woodWall("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_OAK_WOOD_FENCE = woodFence("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_OAK_WOOD_FENCE_GATE = woodFenceGate("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final Supplier<StairBlock> STRIPPED_SPRUCE_WOOD_STAIRS = woodStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_SPRUCE_WOOD_SLAB = woodSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Supplier<WallBlock> STRIPPED_SPRUCE_WOOD_WALL = woodWall("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_SPRUCE_WOOD_FENCE = woodFence("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_SPRUCE_WOOD_FENCE_GATE = woodFenceGate("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final Supplier<StairBlock> STRIPPED_BIRCH_WOOD_STAIRS = woodStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_BIRCH_WOOD_SLAB = woodSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final Supplier<WallBlock> STRIPPED_BIRCH_WOOD_WALL = woodWall("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_BIRCH_WOOD_FENCE = woodFence("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_BIRCH_WOOD_FENCE_GATE = woodFenceGate("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final Supplier<StairBlock> STRIPPED_JUNGLE_WOOD_STAIRS = woodStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_JUNGLE_WOOD_SLAB = woodSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Supplier<WallBlock> STRIPPED_JUNGLE_WOOD_WALL = woodWall("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_JUNGLE_WOOD_FENCE = woodFence("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_JUNGLE_WOOD_FENCE_GATE = woodFenceGate("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final Supplier<StairBlock> STRIPPED_ACACIA_WOOD_STAIRS = woodStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_ACACIA_WOOD_SLAB = woodSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final Supplier<WallBlock> STRIPPED_ACACIA_WOOD_WALL = woodWall("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_ACACIA_WOOD_FENCE = woodFence("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_ACACIA_WOOD_FENCE_GATE = woodFenceGate("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final Supplier<StairBlock> STRIPPED_DARK_OAK_WOOD_STAIRS = woodStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_DARK_OAK_WOOD_SLAB = woodSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<WallBlock> STRIPPED_DARK_OAK_WOOD_WALL = woodWall("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_DARK_OAK_WOOD_FENCE = woodFence("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_DARK_OAK_WOOD_FENCE_GATE = woodFenceGate("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<StairBlock> STRIPPED_MANGROVE_WOOD_STAIRS = woodStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD); // Stripped Mangrove color maps based on Axis
    public static final Supplier<SlabBlock> STRIPPED_MANGROVE_WOOD_SLAB = woodSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<WallBlock> STRIPPED_MANGROVE_WOOD_WALL = woodWall("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_MANGROVE_WOOD_FENCE = woodFence("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_MANGROVE_WOOD_FENCE_GATE = woodFenceGate("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final Supplier<StairBlock> STRIPPED_CHERRY_WOOD_STAIRS = woodStairs("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final Supplier<SlabBlock> STRIPPED_CHERRY_WOOD_SLAB = woodSlab("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final Supplier<WallBlock> STRIPPED_CHERRY_WOOD_WALL = woodWall("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final Supplier<FenceBlock> STRIPPED_CHERRY_WOOD_FENCE = woodFence("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final Supplier<FenceGateBlock> STRIPPED_CHERRY_WOOD_FENCE_GATE = woodFenceGate("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final Supplier<StairBlock> STRIPPED_BAMBOO_BLOCK_STAIRS = register("stripped_bamboo_block_stairs", stair(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), Blocks.STRIPPED_BAMBOO_BLOCK::defaultBlockState), 150);
    public static final Supplier<SlabBlock> STRIPPED_BAMBOO_BLOCK_SLAB = register("stripped_bamboo_block_slab", slab(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW)), 75);
    public static final Supplier<WallBlock> STRIPPED_BAMBOO_BLOCK_WALL = register("stripped_bamboo_block_wall", wall(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW)), 150);
    public static final Supplier<FenceBlock> STRIPPED_BAMBOO_BLOCK_FENCE = register("stripped_bamboo_block_fence", fence(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW)), 150);
    public static final Supplier<FenceGateBlock> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = register("stripped_bamboo_block_fence_gate", fenceGate(WoodType.BAMBOO, CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW)), 75);

    public static final Supplier<StrippableStairBlock> OAK_WOOD_STAIRS = woodStairs("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> OAK_WOOD_SLAB = woodSlab("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> OAK_WOOD_WALL = woodWall("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> OAK_WOOD_FENCE = woodFence("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> OAK_WOOD_FENCE_GATE = woodFenceGate(WoodType.OAK, Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> SPRUCE_WOOD_STAIRS = woodStairs("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> SPRUCE_WOOD_SLAB = woodSlab("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> SPRUCE_WOOD_WALL = woodWall("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> SPRUCE_WOOD_FENCE = woodFence("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> SPRUCE_WOOD_FENCE_GATE = woodFenceGate(WoodType.SPRUCE, Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> BIRCH_WOOD_STAIRS = woodStairs("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> BIRCH_WOOD_SLAB = woodSlab("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> BIRCH_WOOD_WALL = woodWall("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> BIRCH_WOOD_FENCE = woodFence("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> BIRCH_WOOD_FENCE_GATE = woodFenceGate(WoodType.BIRCH, Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> JUNGLE_WOOD_STAIRS = woodStairs("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> JUNGLE_WOOD_SLAB = woodSlab("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> JUNGLE_WOOD_WALL = woodWall("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> JUNGLE_WOOD_FENCE = woodFence("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> JUNGLE_WOOD_FENCE_GATE = woodFenceGate(WoodType.JUNGLE, Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> ACACIA_WOOD_STAIRS = woodStairs("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> ACACIA_WOOD_SLAB = woodSlab("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> ACACIA_WOOD_WALL = woodWall("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> ACACIA_WOOD_FENCE = woodFence("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> ACACIA_WOOD_FENCE_GATE = woodFenceGate(WoodType.ACACIA, Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> DARK_OAK_WOOD_STAIRS = woodStairs("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> DARK_OAK_WOOD_SLAB = woodSlab("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> DARK_OAK_WOOD_WALL = woodWall("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> DARK_OAK_WOOD_FENCE = woodFence("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = woodFenceGate(WoodType.DARK_OAK, Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> MANGROVE_WOOD_STAIRS = woodStairs("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> MANGROVE_WOOD_SLAB = woodSlab("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> MANGROVE_WOOD_WALL = woodWall("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> MANGROVE_WOOD_FENCE = woodFence("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> MANGROVE_WOOD_FENCE_GATE = woodFenceGate(WoodType.MANGROVE, Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> CHERRY_WOOD_STAIRS = woodStairs("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_STAIRS);
    public static final Supplier<StrippableSlabBlock> CHERRY_WOOD_SLAB = woodSlab("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_SLAB);
    public static final Supplier<StrippableWallBlock> CHERRY_WOOD_WALL = woodWall("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_WALL);
    public static final Supplier<StrippableFenceBlock> CHERRY_WOOD_FENCE = woodFence("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_FENCE);
    public static final Supplier<StrippableFenceGateBlock> CHERRY_WOOD_FENCE_GATE = woodFenceGate(WoodType.CHERRY, Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_FENCE_GATE);
    public static final Supplier<StrippableStairBlock> BAMBOO_BLOCK_STAIRS = register("bamboo_block_stairs", strippableStair(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), Blocks.BAMBOO_BLOCK, STRIPPED_BAMBOO_BLOCK_STAIRS), 150);
    public static final Supplier<StrippableSlabBlock> BAMBOO_BLOCK_SLAB = register("bamboo_block_slab", strippableSlab(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), STRIPPED_BAMBOO_BLOCK_SLAB), 75);
    public static final Supplier<StrippableWallBlock> BAMBOO_BLOCK_WALL = register("bamboo_block_wall", strippableWall(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), STRIPPED_BAMBOO_BLOCK_WALL), 150);
    public static final Supplier<StrippableFenceBlock> BAMBOO_BLOCK_FENCE = register("bamboo_block_fence", strippableFence(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), STRIPPED_BAMBOO_BLOCK_FENCE), 150);
    public static final Supplier<StrippableFenceGateBlock> BAMBOO_BLOCK_FENCE_GATE = register("bamboo_block_fence_gate", strippableFenceGate(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), WoodType.BAMBOO,  STRIPPED_BAMBOO_BLOCK_FENCE_GATE), 150);

    public static final Supplier<StairBlock> STRIPPED_CRIMSON_HYPHAE_STAIRS = register("stripped_crimson_hyphae_stairs", stair(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab", slab(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<WallBlock> STRIPPED_CRIMSON_HYPHAE_WALL = register("stripped_crimson_hyphae_wall", wall(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<FenceBlock> STRIPPED_CRIMSON_HYPHAE_FENCE = register("stripped_crimson_hyphae_fence", fence(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<FenceGateBlock> STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = register("stripped_crimson_hyphae_fence_gate", fenceGate(WoodType.CRIMSON, CopyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE)), fireResistanceItemProperties);
    public static final Supplier<StairBlock> STRIPPED_WARPED_HYPHAE_STAIRS = register("stripped_warped_hyphae_stairs", stair(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab", slab(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<WallBlock> STRIPPED_WARPED_HYPHAE_WALL = register("stripped_warped_hyphae_wall", wall(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<FenceBlock> STRIPPED_WARPED_HYPHAE_FENCE = register("stripped_warped_hyphae_fence", fence(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final Supplier<FenceGateBlock> STRIPPED_WARPED_HYPHAE_FENCE_GATE = register("stripped_warped_hyphae_fence_gate", fenceGate(WoodType.WARPED, CopyProperties(Blocks.STRIPPED_WARPED_HYPHAE)), fireResistanceItemProperties);

    public static final Supplier<StrippableStairBlock> CRIMSON_HYPHAE_STAIRS = register("crimson_hyphae_stairs", strippableStair(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_STAIRS), fireResistanceItemProperties);
    public static final Supplier<StrippableSlabBlock> CRIMSON_HYPHAE_SLAB = register("crimson_hyphae_slab", strippableSlab(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_SLAB), fireResistanceItemProperties);
    public static final Supplier<StrippableWallBlock> CRIMSON_HYPHAE_WALL = register("crimson_hyphae_wall", strippableWall(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_WALL), fireResistanceItemProperties);
    public static final Supplier<StrippableFenceBlock> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence", strippableFence(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_FENCE), fireResistanceItemProperties);
    public static final Supplier<StrippableFenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate", strippableFenceGate(Blocks.CRIMSON_HYPHAE, WoodType.CRIMSON, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE), fireResistanceItemProperties);
    public static final Supplier<StrippableStairBlock> WARPED_HYPHAE_STAIRS = register("warped_hyphae_stairs", strippableStair(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_STAIRS), fireResistanceItemProperties);
    public static final Supplier<StrippableSlabBlock> WARPED_HYPHAE_SLAB = register("warped_hyphae_slab", strippableSlab(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_SLAB), fireResistanceItemProperties);
    public static final Supplier<StrippableWallBlock> WARPED_HYPHAE_WALL = register("warped_hyphae_wall", strippableWall(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_WALL), fireResistanceItemProperties);
    public static final Supplier<StrippableFenceBlock> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence", strippableFence(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_FENCE), fireResistanceItemProperties);
    public static final Supplier<StrippableFenceGateBlock> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate", strippableFenceGate(Blocks.WARPED_HYPHAE, WoodType.WARPED, STRIPPED_WARPED_HYPHAE_FENCE_GATE), fireResistanceItemProperties);

    public static final Supplier<StairBlock> CALCITE_STAIRS = register("calcite_stairs", stair(Blocks.CALCITE));
    public static final Supplier<SlabBlock> CALCITE_SLAB = register("calcite_slab", slab(Blocks.CALCITE));
    public static final Supplier<WallBlock> CALCITE_WALL = register("calcite_wall", wall(Blocks.CALCITE));
    public static final Supplier<StairBlock> SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", stair(Blocks.SMOOTH_BASALT));
    public static final Supplier<SlabBlock> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", slab(Blocks.SMOOTH_BASALT));
    public static final Supplier<WallBlock> SMOOTH_BASALT_WALL = register("smooth_basalt_wall", wall(Blocks.SMOOTH_BASALT));
    public static final Supplier<StairBlock> TUFF_STAIRS = register("tuff_stairs", stair(Blocks.TUFF));
    public static final Supplier<SlabBlock> TUFF_SLAB = register("tuff_slab", slab(Blocks.TUFF));
    public static final Supplier<WallBlock> TUFF_WALL = register("tuff_wall", wall(Blocks.TUFF));

    public static final Supplier<StairBlock> DEEPSLATE_STAIRS = register("deepslate_stairs", stair(Blocks.DEEPSLATE));
    public static final Supplier<SlabBlock> DEEPSLATE_SLAB = register("deepslate_slab", slab(Blocks.DEEPSLATE));
    public static final Supplier<WallBlock> DEEPSLATE_WALL = register("deepslate_wall", wall(Blocks.DEEPSLATE));
    public static final Supplier<StairBlock> CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", stair(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Supplier<SlabBlock> CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", slab(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Supplier<WallBlock> CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", wall(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Supplier<StairBlock> CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", stair(Blocks.CRACKED_DEEPSLATE_TILES));
    public static final Supplier<SlabBlock> CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", slab(Blocks.CRACKED_DEEPSLATE_TILES));
    public static final Supplier<WallBlock> CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", wall(Blocks.CRACKED_DEEPSLATE_TILES));

    public static final Supplier<FenceGateBlock> NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", fenceGate(WoodType.OAK, CopyProperties(Blocks.NETHER_BRICK_FENCE))); // TODO: fix wood type

    public static final Supplier<StairBlock> CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", stair(Blocks.CRACKED_NETHER_BRICKS));
    public static final Supplier<SlabBlock> CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", slab(Blocks.CRACKED_NETHER_BRICKS));
    public static final Supplier<WallBlock> CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", wall(Blocks.CRACKED_NETHER_BRICKS));
    public static final Supplier<FenceBlock> CRACKED_NETHER_BRICK_FENCE = register("cracked_nether_brick_fence", fence(Blocks.CRACKED_NETHER_BRICKS));
    public static final Supplier<FenceGateBlock> CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", fenceGate(WoodType.OAK, CopyProperties(Blocks.CRACKED_NETHER_BRICKS)));

    public static final Supplier<FenceBlock> RED_NETHER_BRICK_FENCE = register("red_nether_brick_fence", fence(Blocks.RED_NETHER_BRICKS));
    public static final Supplier<FenceGateBlock> RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", fenceGate(WoodType.OAK, CopyProperties(Blocks.RED_NETHER_BRICKS)));

    public static final Supplier<StairBlock> OBSIDIAN_STAIRS = register("obsidian_stairs", stair(Blocks.OBSIDIAN));
    public static final Supplier<SlabBlock> OBSIDIAN_SLAB = register("obsidian_slab", slab(Blocks.OBSIDIAN));
    public static final Supplier<WallBlock> OBSIDIAN_WALL = register("obsidian_wall", wall(Blocks.OBSIDIAN));

    public static final Supplier<StairBlock> CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", stair(Blocks.CRYING_OBSIDIAN));
    public static final Supplier<SlabBlock> CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", slab(Blocks.CRYING_OBSIDIAN));
    public static final Supplier<WallBlock> CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", wall(Blocks.CRYING_OBSIDIAN));

    public static final Supplier<StairBlock> WHITE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.WHITE);
    public static final Supplier<SlabBlock> WHITE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.WHITE);
    public static final Supplier<WallBlock> WHITE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.WHITE);

    public static final Supplier<StairBlock> ORANGE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.ORANGE);
    public static final Supplier<SlabBlock> ORANGE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.ORANGE);
    public static final Supplier<WallBlock> ORANGE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.ORANGE);

    public static final Supplier<StairBlock> MAGENTA_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.MAGENTA);
    public static final Supplier<SlabBlock> MAGENTA_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.MAGENTA);
    public static final Supplier<WallBlock> MAGENTA_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.MAGENTA);

    public static final Supplier<StairBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_BLUE);
    public static final Supplier<SlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final Supplier<WallBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final Supplier<StairBlock> YELLOW_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.YELLOW);
    public static final Supplier<SlabBlock> YELLOW_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.YELLOW);
    public static final Supplier<WallBlock> YELLOW_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.YELLOW);

    public static final Supplier<StairBlock> LIME_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIME);
    public static final Supplier<SlabBlock> LIME_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIME);
    public static final Supplier<WallBlock> LIME_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIME);

    public static final Supplier<StairBlock> PINK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PINK);
    public static final Supplier<SlabBlock> PINK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PINK);
    public static final Supplier<WallBlock> PINK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PINK);

    public static final Supplier<StairBlock> GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GRAY);
    public static final Supplier<SlabBlock> GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GRAY);
    public static final Supplier<WallBlock> GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GRAY);

    public static final Supplier<StairBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_GRAY);
    public static final Supplier<SlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final Supplier<WallBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final Supplier<StairBlock> CYAN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.CYAN);
    public static final Supplier<SlabBlock> CYAN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.CYAN);
    public static final Supplier<WallBlock> CYAN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.CYAN);

    public static final Supplier<StairBlock> PURPLE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PURPLE);
    public static final Supplier<SlabBlock> PURPLE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PURPLE);
    public static final Supplier<WallBlock> PURPLE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PURPLE);

    public static final Supplier<StairBlock> BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLUE);
    public static final Supplier<SlabBlock> BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLUE);
    public static final Supplier<WallBlock> BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLUE);

    public static final Supplier<StairBlock> BROWN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BROWN);
    public static final Supplier<SlabBlock> BROWN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BROWN);
    public static final Supplier<WallBlock> BROWN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BROWN);

    public static final Supplier<StairBlock> GREEN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GREEN);
    public static final Supplier<SlabBlock> GREEN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GREEN);
    public static final Supplier<WallBlock> GREEN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GREEN);

    public static final Supplier<StairBlock> RED_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.RED);
    public static final Supplier<SlabBlock> RED_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.RED);
    public static final Supplier<WallBlock> RED_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.RED);

    public static final Supplier<StairBlock> BLACK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLACK);
    public static final Supplier<SlabBlock> BLACK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLACK);
    public static final Supplier<WallBlock> BLACK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLACK);

    public static final Supplier<StairBlock> WhiteWoolStairs = regWoolStairs(DyeColor.WHITE);
    public static final Supplier<SlabBlock> WhiteWoolSlab = regWoolSlab(DyeColor.WHITE);
    public static final Supplier<WallBlock> WhiteWoolWall = regWoolWall(DyeColor.WHITE);

    public static final Supplier<StairBlock> OrangeWoolStairs = regWoolStairs(DyeColor.ORANGE);
    public static final Supplier<SlabBlock> OrangeWoolSlab = regWoolSlab(DyeColor.ORANGE);
    public static final Supplier<WallBlock> OrangeWoolWall = regWoolWall(DyeColor.ORANGE);

    public static final Supplier<StairBlock> MagentaWoolStairs = regWoolStairs(DyeColor.MAGENTA);
    public static final Supplier<SlabBlock> MagentaWoolSlab = regWoolSlab(DyeColor.MAGENTA);
    public static final Supplier<WallBlock> MagentaWoolWall = regWoolWall(DyeColor.MAGENTA);

    public static final Supplier<StairBlock> LightBlueWoolStairs = regWoolStairs(DyeColor.LIGHT_BLUE);
    public static final Supplier<SlabBlock> LightBlueWoolSlab = regWoolSlab(DyeColor.LIGHT_BLUE);
    public static final Supplier<WallBlock> LightBlueWoolWall = regWoolWall(DyeColor.LIGHT_BLUE);

    public static final Supplier<StairBlock> YellowWoolStairs = regWoolStairs(DyeColor.YELLOW);
    public static final Supplier<SlabBlock> YellowWoolSlab = regWoolSlab(DyeColor.YELLOW);
    public static final Supplier<WallBlock> YellowWoolWall = regWoolWall(DyeColor.YELLOW);

    public static final Supplier<StairBlock> LimeWoolStairs = regWoolStairs(DyeColor.LIME);
    public static final Supplier<SlabBlock> LimeWoolSlab = regWoolSlab(DyeColor.LIME);
    public static final Supplier<WallBlock> LimeWoolWall = regWoolWall(DyeColor.LIME);

    public static final Supplier<StairBlock> PinkWoolStairs = regWoolStairs(DyeColor.PINK);
    public static final Supplier<SlabBlock> PinkWoolSlab = regWoolSlab(DyeColor.PINK);
    public static final Supplier<WallBlock> PinkWoolWall = regWoolWall(DyeColor.PINK);

    public static final Supplier<StairBlock> GrayWoolStairs = regWoolStairs(DyeColor.GRAY);
    public static final Supplier<SlabBlock> GrayWoolSlab = regWoolSlab(DyeColor.GRAY);
    public static final Supplier<WallBlock> GrayWoolWall = regWoolWall(DyeColor.GRAY);

    public static final Supplier<StairBlock> LightGrayWoolStairs = regWoolStairs(DyeColor.LIGHT_GRAY);
    public static final Supplier<SlabBlock> LightGrayWoolSlab = regWoolSlab(DyeColor.LIGHT_GRAY);
    public static final Supplier<WallBlock> LightGrayWoolWall = regWoolWall(DyeColor.LIGHT_GRAY);

    public static final Supplier<StairBlock> CyanWoolStairs = regWoolStairs(DyeColor.CYAN);
    public static final Supplier<SlabBlock> CyanWoolSlab = regWoolSlab(DyeColor.CYAN);
    public static final Supplier<WallBlock> CyanWoolWall = regWoolWall(DyeColor.CYAN);

    public static final Supplier<StairBlock> PurpleWoolStairs = regWoolStairs(DyeColor.PURPLE);
    public static final Supplier<SlabBlock> PurpleWoolSlab = regWoolSlab(DyeColor.PURPLE);
    public static final Supplier<WallBlock> PurpleWoolWall = regWoolWall(DyeColor.PURPLE);

    public static final Supplier<StairBlock> BlueWoolStairs = regWoolStairs(DyeColor.BLUE);
    public static final Supplier<SlabBlock> BlueWoolSlab = regWoolSlab(DyeColor.BLUE);
    public static final Supplier<WallBlock> BlueWoolWall = regWoolWall(DyeColor.BLUE);

    public static final Supplier<StairBlock> BrownWoolStairs = regWoolStairs(DyeColor.BROWN);
    public static final Supplier<SlabBlock> BrownWoolSlab = regWoolSlab(DyeColor.BROWN);
    public static final Supplier<WallBlock> BrownWoolWall = regWoolWall(DyeColor.BROWN);

    public static final Supplier<StairBlock> GreenWoolStairs = regWoolStairs(DyeColor.GREEN);
    public static final Supplier<SlabBlock> GreenWoolSlab = regWoolSlab(DyeColor.GREEN);
    public static final Supplier<WallBlock> GreenWoolWall = regWoolWall(DyeColor.GREEN);

    public static final Supplier<StairBlock> RedWoolStairs = regWoolStairs(DyeColor.RED);
    public static final Supplier<SlabBlock> RedWoolSlab = regWoolSlab(DyeColor.RED);
    public static final Supplier<WallBlock> RedWoolWall = regWoolWall(DyeColor.RED);

    public static final Supplier<StairBlock> BlackWoolStairs = regWoolStairs(DyeColor.BLACK);
    public static final Supplier<SlabBlock> BlackWoolSlab = regWoolSlab(DyeColor.BLACK);
    public static final Supplier<WallBlock> BlackWoolWall = regWoolWall(DyeColor.BLACK);

    public static final Supplier<StairBlock> PackedMudStairs = register("packed_mud_stairs", stair(Blocks.PACKED_MUD));
    public static final Supplier<SlabBlock> PackedMudSlab = register("packed_mud_slab", slab(Blocks.PACKED_MUD));
    public static final Supplier<WallBlock> PackedMudWall = register("packed_mud_wall", wall(Blocks.PACKED_MUD));

    private static Supplier<StrippableStairBlock> strippableStair(Block base, Supplier<StairBlock> stripped) {return ()-> new StrippableStairBlock(base::defaultBlockState, stripped, CopyProperties(base));}
    private static Supplier<StrippableStairBlock> strippableStair(BlockBehaviour.Properties properties, Block base, Supplier<StairBlock> stripped) {return ()-> new StrippableStairBlock(base::defaultBlockState, stripped, properties);}
    private static Supplier<StrippableSlabBlock> strippableSlab(Block base, Supplier<SlabBlock> stripped) {return ()-> new StrippableSlabBlock(stripped, CopyProperties(base));}
    private static Supplier<StrippableSlabBlock> strippableSlab(BlockBehaviour.Properties properties, Supplier<SlabBlock> stripped) {return ()-> new StrippableSlabBlock(stripped, properties);}
    private static Supplier<StrippableWallBlock> strippableWall(Block base, Supplier<WallBlock> stripped) {return ()-> new StrippableWallBlock(stripped, CopyProperties(base));}
    private static Supplier<StrippableWallBlock> strippableWall(BlockBehaviour.Properties properties, Supplier<WallBlock> stripped) {return ()-> new StrippableWallBlock(stripped, properties);}
    private static Supplier<StrippableFenceBlock> strippableFence(Block base, Supplier<FenceBlock> stripped) {return ()-> new StrippableFenceBlock(stripped, CopyProperties(base));}
    private static Supplier<StrippableFenceBlock> strippableFence(BlockBehaviour.Properties properties, Supplier<FenceBlock> stripped) {return ()-> new StrippableFenceBlock(stripped, properties);}
    private static Supplier<StrippableFenceGateBlock> strippableFenceGate(Block base, WoodType type, Supplier<FenceGateBlock> stripped) {return ()-> new StrippableFenceGateBlock(stripped, CopyProperties(base), type);}
    private static Supplier<StrippableFenceGateBlock> strippableFenceGate(BlockBehaviour.Properties properties, WoodType type, Supplier<FenceGateBlock> stripped) {return ()-> new StrippableFenceGateBlock(stripped, properties, type);}

    private static Supplier<StairBlock> regTerracottaStairs(DyeColor color, Block base){
        return register(color.getName() + "_terracotta_stairs", stair(base));
    }
    private static Supplier<SlabBlock> regTerracottaSlab(DyeColor color){
        return register(color.getName() + "_terracotta_slab", slab(Blocks.TERRACOTTA));
    }
    private static Supplier<WallBlock> regTerracottaWall(DyeColor color){
        return register(color.getName() + "_terracotta_wall", wall(Blocks.TERRACOTTA));
    }

    private static Supplier<StrippableStairBlock> logStairs(String type, Block base, Supplier<StairBlock> stripped) {
        return register(type + "_log_stairs", strippableStair(base, stripped), 300);
    }

    private static Supplier<StairBlock> logStairs(String type, Block base) {
        return register(type + "_log_stairs", stair(base), 300);
    }
    private static Supplier<SlabBlock> logSlab(String type, Block base) {
        return register(type + "_log_slab", slab(base), 300);
    }
    private static Supplier<StrippableSlabBlock> logSlab(String type, Block base, Supplier<SlabBlock> stripped) {
        return register(type + "_log_slab", strippableSlab(base, stripped), 300);
    }

    private static Supplier<StairBlock> woodStairs(String type, Block base) {
        return register(type + "_wood_stairs", stair(base), 300);
    }

    private static Supplier<StrippableStairBlock> woodStairs(String type, Block base, Supplier<StairBlock> stripped){
        return register(type + "_wood_stairs", strippableStair(base, stripped), 300);
    }
    private static Supplier<SlabBlock> woodSlab(String type, Block base){
        return register(type + "_wood_slab", slab(base), 150);
    }
    private static Supplier<StrippableSlabBlock> woodSlab(String type, Block base, Supplier<SlabBlock> stripped){
        return register(type + "_wood_slab", strippableSlab(base, stripped), 150);
    }
    private static Supplier<WallBlock> woodWall(String type, Block base){
        return register(type + "_wood_wall", wall(base), 300);
    }
    private static Supplier<StrippableWallBlock> woodWall(String type, Block base, Supplier<WallBlock> stripped) {
        return register(type + "_wood_wall", strippableWall(base, stripped), 300);
    }
    private static Supplier<FenceBlock> woodFence(String type, Block base) {
        return register(type + "_wood_fence", fence(base), 300);
    }
    private static Supplier<StrippableFenceBlock> woodFence(String type, Block base, Supplier<FenceBlock> stripped) {
        return register(type + "_wood_fence", strippableFence(base, stripped), 300);
    }
    private static Supplier<FenceGateBlock> woodFenceGate(String type, Block base) {
        return register(type + "_wood_fence_gate", fenceGate(WoodTypeOf(type), CopyProperties(base)), 300);
    }
    private static Supplier<StrippableFenceGateBlock> woodFenceGate(WoodType type, Block base, Supplier<FenceGateBlock> stripped) {
        return register(type.name() + "_wood_fence_gate", strippableFenceGate(base, type, stripped), 300);
    }

    private static Supplier<StairBlock> regGlazedTerracottaStairs(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_stairs", ()-> new StairBlock(parent.defaultBlockState(), CopyProperties(parent)));
    }
    private static Supplier<SlabBlock> regGlazedTerracottaSlab(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_slab", ()-> new SlabBlock(CopyProperties(parent)));
    }
    private static Supplier<WallBlock> regGlazedTerracottaWall(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_wall", ()-> new WallBlock(CopyProperties(parent)));
    }

    private static Supplier<StairBlock> regWoolStairs(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_stairs", stair(parent));
    }
    private static Supplier<SlabBlock> regWoolSlab(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_slab", slab(parent));
    }
    private static Supplier<WallBlock> regWoolWall(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_wall", wall(parent));
    }

    private static Supplier<SlabBlock> slab(SlabBlock.Properties properties) {return ()-> new SlabBlock(properties);}
    private static Supplier<SlabBlock> slab(Block parent) {return slab(CopyProperties(parent));}
    private static Supplier<WallBlock> wall(WallBlock.Properties properties) {return ()-> new WallBlock(properties);}
    private static Supplier<WallBlock> wall(Block parent) {return wall(CopyProperties(parent));}
    private static Supplier<FenceBlock> fence(FenceBlock.Properties properties) {return ()-> new FenceBlock(properties);}
    private static Supplier<FenceBlock> fence(Block parent) {return fence(CopyProperties(parent));}

    private static WoodType WoodTypeOf(String key){
        key = key.replace("stripped_", "");
        var iterator = WoodType.values().iterator();
        while(iterator.hasNext()){
            var type = iterator.next();
            if(type.name().contains(key)) return type;
        }
        throw new IllegalArgumentException("No wood type with key: " + key);
    }

    private static Block GetVanillaBlock(String name){
        return BuiltInRegistries.BLOCK.get(ResourceLocation.withDefaultNamespace(name));
    }

    private static <T extends Block>Supplier<T> register(String name, Supplier<T> block) {
        return  register(name, block, DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block>Supplier<T> register(String name, Supplier<T> block, int itemBurnTime) {
        return  register(name, block, itemBurnTime, DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block>Supplier<T> register(String name, Supplier<T> block, Item.Properties itemProperties){
        var registryObject = registerWithoutItem(name, block);
        ITEM_REGISTER.register(name, ()-> new BlockItem(registryObject.get(), itemProperties));
        return registryObject;
    }

    private static <T extends Block>Supplier<T> register(String name, Supplier<T> block, int itemBurnTime, Item.Properties itemProperties){
        var registryObject = registerWithoutItem(name, block);
        ITEM_REGISTER.register(name, ()-> new BlockItem(registryObject.get(), itemProperties){
            @Override
            public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return itemBurnTime;}
        });
        return registryObject;
    }
    private static <T extends Block> Supplier<T> registerWithoutItem(String name, Supplier<T> block) {return BLOCK_REGISTER.register(name, block);}

    public static Iterator<? extends Block> getAllBlocks() {return BLOCK_REGISTER.getEntries().stream().map(Supplier::get).iterator();}
}