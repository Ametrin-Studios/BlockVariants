package com.barion.block_variants;

import com.barion.block_variants.block.*;
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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.function.Supplier;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.CopyProperties;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.fenceGate;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.stair;

public class BVBlocks {
    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockVariants.ModID);
    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, BlockVariants.ModID);

    private static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties();
    private static final Item.Properties fireResistanceItemProperties = new Item.Properties().fireResistant();


    public static final RegistryObject<WallBlock> POLISHED_GRANITE_WALL = register("polished_granite_wall", wall(Blocks.POLISHED_GRANITE));
    public static final RegistryObject<WallBlock> POLISHED_DIORITE_WALL = register("polished_diorite_wall", wall(Blocks.POLISHED_DIORITE));
    public static final RegistryObject<WallBlock> POLISHED_ANDESITE_WALL = register("polished_andesite_wall", wall(Blocks.POLISHED_ANDESITE));

    public static final RegistryObject<WallBlock> STONE_WALL = register("stone_wall", wall(Blocks.STONE));
    public static final RegistryObject<StairBlock> SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", stair(Blocks.SMOOTH_STONE));
    public static final RegistryObject<WallBlock> SMOOTH_STONE_WALL = register("smooth_stone_wall", wall(Blocks.SMOOTH_STONE));

    public static final RegistryObject<StairBlock> CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", stair(Blocks.CUT_SANDSTONE));
    public static final RegistryObject<WallBlock> CUT_SANDSTONE_WALL = register("cut_sandstone_wall", wall(Blocks.CUT_SANDSTONE));
    public static final RegistryObject<StairBlock> CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", stair(Blocks.CUT_RED_SANDSTONE));
    public static final RegistryObject<WallBlock> CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", wall(Blocks.CUT_RED_SANDSTONE));

    public static final RegistryObject<WallBlock> QUARTZ_WALL = register("quartz_wall", wall(Blocks.QUARTZ_BLOCK));
    public static final RegistryObject<StairBlock> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", stair(Blocks.QUARTZ_BRICKS));
    public static final RegistryObject<SlabBlock> QUARTZ_BRICK_SLAB = register("quartz_brick_slab", slab(Blocks.QUARTZ_BRICKS));
    public static final RegistryObject<WallBlock> QUARTZ_BRICK_WALL = register("quartz_brick_wall", wall(Blocks.QUARTZ_BRICKS));
    public static final RegistryObject<WallBlock> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", wall(Blocks.SMOOTH_QUARTZ));
    public static final RegistryObject<StairBlock> CHISELED_QUARTZ_BLOCK_STAIRS = register("chiseled_quartz_block_stairs", stair(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final RegistryObject<SlabBlock> CHISELED_QUARTZ_BLOCK_SLAB = register("chiseled_quartz_block_slab", slab(Blocks.CHISELED_QUARTZ_BLOCK));
    public static final RegistryObject<WallBlock> CHISELED_QUARTZ_BLOCK_WALL = register("chiseled_quartz_block_wall", wall(Blocks.CHISELED_QUARTZ_BLOCK));

    public static final RegistryObject<WallBlock> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", wall(Blocks.PRISMARINE_BRICKS));
    public static final RegistryObject<WallBlock> DARK_PRISMARINE_WALL = register("dark_prismarine_wall", wall(Blocks.PRISMARINE_BRICKS));

    public static final RegistryObject<StairBlock> NETHERRACK_STAIRS = register("netherrack_stairs", stair(Blocks.NETHERRACK));
    public static final RegistryObject<SlabBlock> NETHERRACK_SLAB = register("netherrack_slab", slab(Blocks.NETHERRACK));
    public static final RegistryObject<WallBlock> NETHERRACK_WALL = register("netherrack_wall", wall(Blocks.NETHERRACK));

    public static final RegistryObject<StairBlock> END_STONE_STAIRS = register("end_stone_stairs", stair(Blocks.END_STONE));
    public static final RegistryObject<SlabBlock> END_STONE_SLAB = register("end_stone_slab", slab(Blocks.END_STONE));
    public static final RegistryObject<WallBlock> END_STONE_WALL = register("end_stone_wall", wall(Blocks.END_STONE));
    public static final RegistryObject<WallBlock> PURPUR_WALL = register("purpur_wall", wall(Blocks.PURPUR_BLOCK));

    public static final RegistryObject<StairBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs", stair(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final RegistryObject<SlabBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab", slab(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
    public static final RegistryObject<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall", wall(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    public static final RegistryObject<StairBlock> BASALT_STAIRS = register("basalt_stairs", stair(Blocks.BASALT));
    public static final RegistryObject<SlabBlock> BASALT_SLAB = register("basalt_slab", slab(Blocks.BASALT));
    public static final RegistryObject<WallBlock> BASALT_WALL = register("basalt_wall", wall(Blocks.BASALT));

    public static final RegistryObject<StairBlock> POLISHED_BASALT_STAIRS = register("polished_basalt_stairs", stair(Blocks.POLISHED_BASALT));
    public static final RegistryObject<SlabBlock> POLISHED_BASALT_SLAB = register("polished_basalt_slab", slab(Blocks.POLISHED_BASALT));
    public static final RegistryObject<WallBlock> POLISHED_BASALT_WALL = register("polished_basalt_wall", wall(Blocks.POLISHED_BASALT));

    public static final RegistryObject<StairBlock> TERRACOTTA_STAIRS = register("terracotta_stairs", stair(Blocks.TERRACOTTA));
    public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab", slab(Blocks.TERRACOTTA));
    public static final RegistryObject<WallBlock> TERRACOTTA_WALL = register("terracotta_wall", wall(Blocks.TERRACOTTA));

    public static final RegistryObject<StairBlock> WHITE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> WHITE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.WHITE);
    public static final RegistryObject<WallBlock> WHITE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.WHITE);

    public static final RegistryObject<StairBlock> ORANGE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> ORANGE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.ORANGE);
    public static final RegistryObject<WallBlock> ORANGE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.ORANGE);

    public static final RegistryObject<StairBlock> MAGENTA_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
    public static final RegistryObject<SlabBlock> MAGENTA_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.MAGENTA);
    public static final RegistryObject<WallBlock> MAGENTA_TERRACOTTA_WALL = regTerracottaWall(DyeColor.MAGENTA);

    public static final RegistryObject<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final RegistryObject<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final RegistryObject<StairBlock> YELLOW_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
    public static final RegistryObject<SlabBlock> YELLOW_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.YELLOW);
    public static final RegistryObject<WallBlock> YELLOW_TERRACOTTA_WALL = regTerracottaWall(DyeColor.YELLOW);

    public static final RegistryObject<StairBlock> LIME_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
    public static final RegistryObject<SlabBlock> LIME_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIME);
    public static final RegistryObject<WallBlock> LIME_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIME);

    public static final RegistryObject<StairBlock> PINK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
    public static final RegistryObject<SlabBlock> PINK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PINK);
    public static final RegistryObject<WallBlock> PINK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PINK);

    public static final RegistryObject<StairBlock> GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
    public static final RegistryObject<SlabBlock> GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GRAY);
    public static final RegistryObject<WallBlock> GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GRAY);

    public static final RegistryObject<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final RegistryObject<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final RegistryObject<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final RegistryObject<StairBlock> CYAN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
    public static final RegistryObject<SlabBlock> CYAN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.CYAN);
    public static final RegistryObject<WallBlock> CYAN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.CYAN);

    public static final RegistryObject<StairBlock> PURPLE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> PURPLE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PURPLE);
    public static final RegistryObject<WallBlock> PURPLE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PURPLE);

    public static final RegistryObject<StairBlock> BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLUE);
    public static final RegistryObject<WallBlock> BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLUE);

    public static final RegistryObject<StairBlock> BROWN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
    public static final RegistryObject<SlabBlock> BROWN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BROWN);
    public static final RegistryObject<WallBlock> BROWN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BROWN);

    public static final RegistryObject<StairBlock> GREEN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
    public static final RegistryObject<SlabBlock> GREEN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GREEN);
    public static final RegistryObject<WallBlock> GREEN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GREEN);

    public static final RegistryObject<StairBlock> RED_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.RED, Blocks.RED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> RED_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.RED);
    public static final RegistryObject<WallBlock> RED_TERRACOTTA_WALL = regTerracottaWall(DyeColor.RED);

    public static final RegistryObject<StairBlock> BLACK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
    public static final RegistryObject<SlabBlock> BLACK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLACK);
    public static final RegistryObject<WallBlock> BLACK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLACK);

    public static final RegistryObject<StairBlock> DRIPSTONE_BLOCK_STAIRS = register("dripstone_block_stairs", stair(Blocks.DRIPSTONE_BLOCK));
    public static final RegistryObject<SlabBlock> DRIPSTONE_BLOCK_SLAB = register("dripstone_block_slab", slab(Blocks.DRIPSTONE_BLOCK));
    public static final RegistryObject<WallBlock> DRIPSTONE_BLOCK_WALL = register("dripstone_block_wall", wall(Blocks.DRIPSTONE_BLOCK));
    public static final RegistryObject<StairBlock> AMETHYST_BLOCK_STAIRS = register("amethyst_block_stairs", stair(Blocks.AMETHYST_BLOCK));
    public static final RegistryObject<SlabBlock> AMETHYST_BLOCK_SLAB = register("amethyst_block_slab", slab(Blocks.AMETHYST_BLOCK));
    public static final RegistryObject<WallBlock> AMETHYST_BLOCK_WALL = register("amethyst_block_wall", wall(Blocks.AMETHYST_BLOCK));

    public static final RegistryObject<StairBlock> CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", stair(Blocks.CRACKED_STONE_BRICKS));
    public static final RegistryObject<SlabBlock> CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", slab(Blocks.CRACKED_STONE_BRICKS));
    public static final RegistryObject<WallBlock> CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", wall(Blocks.CRACKED_STONE_BRICKS));

    public static final RegistryObject<StairBlock> STRIPPED_OAK_LOG_STAIRS = logStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD); // log sets its material color based of the AXIS
    public static final RegistryObject<SlabBlock> STRIPPED_OAK_LOG_SLAB = logSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_SPRUCE_LOG_STAIRS = logStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_LOG_SLAB = logSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_BIRCH_LOG_STAIRS = logStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_LOG_SLAB = logSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_JUNGLE_LOG_STAIRS = logStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_LOG_SLAB = logSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_ACACIA_LOG_STAIRS = logStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_LOG_SLAB = logSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_DARK_OAK_LOG_STAIRS = logStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_LOG_SLAB = logSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_MANGROVE_LOG_STAIRS = logStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD); // Stripped Mangrove color maps based on Axis
    public static final RegistryObject<SlabBlock> STRIPPED_MANGROVE_LOG_SLAB = logSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_CHERRY_LOG_STAIRS = logStairs("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_CHERRY_LOG_SLAB = logSlab("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);

    public static final RegistryObject<StrippableStairBlock> OAK_LOG_STAIRS = logStairs("oak", Blocks.OAK_WOOD, STRIPPED_OAK_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> OAK_LOG_SLAB = logSlab("oak", Blocks.OAK_WOOD, STRIPPED_OAK_LOG_SLAB);
    public static final RegistryObject<StrippableStairBlock> SPRUCE_LOG_STAIRS = logStairs("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> SPRUCE_LOG_SLAB = logSlab("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_LOG_SLAB);
    public static final RegistryObject<StrippableStairBlock> BIRCH_LOG_STAIRS = logStairs("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> BIRCH_LOG_SLAB = logSlab("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_LOG_SLAB);
    public static final RegistryObject<StrippableStairBlock> JUNGLE_LOG_STAIRS = logStairs("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> JUNGLE_LOG_SLAB = logSlab("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_LOG_SLAB);
    public static final RegistryObject<StrippableStairBlock> ACACIA_LOG_STAIRS = logStairs("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> ACACIA_LOG_SLAB = logSlab("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_LOG_SLAB);
    public static final RegistryObject<StrippableStairBlock> DARK_OAK_LOG_STAIRS = logStairs("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> DARK_OAK_LOG_SLAB = logSlab("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_LOG_SLAB);
    public static final RegistryObject<StrippableStairBlock> MANGROVE_LOG_STAIRS = logStairs("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> MANGROVE_LOG_SLAB = logSlab("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_LOG_SLAB);
    public static final RegistryObject<StrippableStairBlock> CHERRY_LOG_STAIRS = logStairs("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_LOG_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> CHERRY_LOG_SLAB = logSlab("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_LOG_SLAB);

    public static final RegistryObject<StairBlock> STRIPPED_CRIMSON_STEM_STAIRS = register("stripped_crimson_stem_stairs", stair(Blocks.STRIPPED_CRIMSON_STEM));
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_stem_slab", slab(Blocks.STRIPPED_CRIMSON_STEM));
    public static final RegistryObject<StairBlock> STRIPPED_WARPED_STEM_STAIRS = register("stripped_warped_stem_stairs", stair(Blocks.STRIPPED_WARPED_STEM));
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_stem_slab", slab(Blocks.STRIPPED_WARPED_STEM));

    public static final RegistryObject<StrippableStairBlock> CRIMSON_STEM_STAIRS = register("crimson_stem_stairs", strippableStair(Blocks.CRIMSON_STEM, STRIPPED_CRIMSON_STEM_STAIRS));
    public static final RegistryObject<StrippableSlabBlock> CRIMSON_STEM_SLAB = register("crimson_stem_slab", strippableSlab(Blocks.CRIMSON_STEM, STRIPPED_CRIMSON_STEM_SLAB));
    public static final RegistryObject<StrippableStairBlock> WARPED_STEM_STAIRS = register("warped_stem_stairs", strippableStair(Blocks.WARPED_STEM, STRIPPED_WARPED_STEM_STAIRS));
    public static final RegistryObject<StrippableSlabBlock> WARPED_STEM_SLAB = register("warped_stem_slab", strippableSlab(Blocks.WARPED_STEM, STRIPPED_WARPED_STEM_SLAB));

    public static final RegistryObject<StairBlock> STRIPPED_OAK_WOOD_STAIRS = woodStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_OAK_WOOD_SLAB = woodSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_OAK_WOOD_WALL = woodWall("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_OAK_WOOD_FENCE = woodFence("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_OAK_WOOD_FENCE_GATE = woodFenceGate("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_SPRUCE_WOOD_STAIRS = woodStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_WOOD_SLAB = woodSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_SPRUCE_WOOD_WALL = woodWall("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_SPRUCE_WOOD_FENCE = woodFence("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_SPRUCE_WOOD_FENCE_GATE = woodFenceGate("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_BIRCH_WOOD_STAIRS = woodStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_WOOD_SLAB = woodSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_BIRCH_WOOD_WALL = woodWall("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_BIRCH_WOOD_FENCE = woodFence("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_BIRCH_WOOD_FENCE_GATE = woodFenceGate("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_JUNGLE_WOOD_STAIRS = woodStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_WOOD_SLAB = woodSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_JUNGLE_WOOD_WALL = woodWall("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_JUNGLE_WOOD_FENCE = woodFence("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_JUNGLE_WOOD_FENCE_GATE = woodFenceGate("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_ACACIA_WOOD_STAIRS = woodStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_WOOD_SLAB = woodSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_ACACIA_WOOD_WALL = woodWall("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_ACACIA_WOOD_FENCE = woodFence("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_ACACIA_WOOD_FENCE_GATE = woodFenceGate("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_DARK_OAK_WOOD_STAIRS = woodStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_WOOD_SLAB = woodSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_DARK_OAK_WOOD_WALL = woodWall("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_DARK_OAK_WOOD_FENCE = woodFence("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_DARK_OAK_WOOD_FENCE_GATE = woodFenceGate("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_MANGROVE_WOOD_STAIRS = woodStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD); // Stripped Mangrove color maps based on Axis
    public static final RegistryObject<SlabBlock> STRIPPED_MANGROVE_WOOD_SLAB = woodSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_MANGROVE_WOOD_WALL = woodWall("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_MANGROVE_WOOD_FENCE = woodFence("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_MANGROVE_WOOD_FENCE_GATE = woodFenceGate("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_CHERRY_WOOD_STAIRS = woodStairs("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final RegistryObject<SlabBlock> STRIPPED_CHERRY_WOOD_SLAB = woodSlab("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final RegistryObject<WallBlock> STRIPPED_CHERRY_WOOD_WALL = woodWall("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final RegistryObject<FenceBlock> STRIPPED_CHERRY_WOOD_FENCE = woodFence("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final RegistryObject<FenceGateBlock> STRIPPED_CHERRY_WOOD_FENCE_GATE = woodFenceGate("stripped_cherry", Blocks.STRIPPED_CHERRY_WOOD);
    public static final RegistryObject<StairBlock> STRIPPED_BAMBOO_BLOCK_STAIRS = register("stripped_bamboo_block_stairs", stair(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), Blocks.STRIPPED_BAMBOO_BLOCK::defaultBlockState), 150);
    public static final RegistryObject<SlabBlock> STRIPPED_BAMBOO_BLOCK_SLAB = register("stripped_bamboo_block_slab", slab(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW)), 75);
    public static final RegistryObject<WallBlock> STRIPPED_BAMBOO_BLOCK_WALL = register("stripped_bamboo_block_wall", wall(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW)), 150);
    public static final RegistryObject<FenceBlock> STRIPPED_BAMBOO_BLOCK_FENCE = register("stripped_bamboo_block_fence", fence(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW)), 150);
    public static final RegistryObject<FenceGateBlock> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = register("stripped_bamboo_block_fence_gate", fenceGate(CopyProperties(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), WoodType.BAMBOO), 75);

    public static final RegistryObject<StrippableStairBlock> OAK_WOOD_STAIRS = woodStairs("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> OAK_WOOD_SLAB = woodSlab("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> OAK_WOOD_WALL = woodWall("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> OAK_WOOD_FENCE = woodFence("oak", Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> OAK_WOOD_FENCE_GATE = woodFenceGate(WoodType.OAK, Blocks.OAK_WOOD, STRIPPED_OAK_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> SPRUCE_WOOD_STAIRS = woodStairs("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> SPRUCE_WOOD_SLAB = woodSlab("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> SPRUCE_WOOD_WALL = woodWall("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> SPRUCE_WOOD_FENCE = woodFence("spruce", Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> SPRUCE_WOOD_FENCE_GATE = woodFenceGate(WoodType.SPRUCE, Blocks.SPRUCE_WOOD, STRIPPED_SPRUCE_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> BIRCH_WOOD_STAIRS = woodStairs("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> BIRCH_WOOD_SLAB = woodSlab("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> BIRCH_WOOD_WALL = woodWall("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> BIRCH_WOOD_FENCE = woodFence("birch", Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> BIRCH_WOOD_FENCE_GATE = woodFenceGate(WoodType.BIRCH, Blocks.BIRCH_WOOD, STRIPPED_BIRCH_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> JUNGLE_WOOD_STAIRS = woodStairs("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> JUNGLE_WOOD_SLAB = woodSlab("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> JUNGLE_WOOD_WALL = woodWall("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> JUNGLE_WOOD_FENCE = woodFence("jungle", Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> JUNGLE_WOOD_FENCE_GATE = woodFenceGate(WoodType.JUNGLE, Blocks.JUNGLE_WOOD, STRIPPED_JUNGLE_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> ACACIA_WOOD_STAIRS = woodStairs("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> ACACIA_WOOD_SLAB = woodSlab("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> ACACIA_WOOD_WALL = woodWall("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> ACACIA_WOOD_FENCE = woodFence("acacia", Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> ACACIA_WOOD_FENCE_GATE = woodFenceGate(WoodType.ACACIA, Blocks.ACACIA_WOOD, STRIPPED_ACACIA_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> DARK_OAK_WOOD_STAIRS = woodStairs("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> DARK_OAK_WOOD_SLAB = woodSlab("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> DARK_OAK_WOOD_WALL = woodWall("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> DARK_OAK_WOOD_FENCE = woodFence("dark_oak", Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = woodFenceGate(WoodType.DARK_OAK, Blocks.DARK_OAK_WOOD, STRIPPED_DARK_OAK_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> MANGROVE_WOOD_STAIRS = woodStairs("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> MANGROVE_WOOD_SLAB = woodSlab("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> MANGROVE_WOOD_WALL = woodWall("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> MANGROVE_WOOD_FENCE = woodFence("mangrove", Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> MANGROVE_WOOD_FENCE_GATE = woodFenceGate(WoodType.MANGROVE, Blocks.MANGROVE_WOOD, STRIPPED_MANGROVE_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> CHERRY_WOOD_STAIRS = woodStairs("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_STAIRS);
    public static final RegistryObject<StrippableSlabBlock> CHERRY_WOOD_SLAB = woodSlab("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_SLAB);
    public static final RegistryObject<StrippableWallBlock> CHERRY_WOOD_WALL = woodWall("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_WALL);
    public static final RegistryObject<StrippableFenceBlock> CHERRY_WOOD_FENCE = woodFence("cherry", Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_FENCE);
    public static final RegistryObject<StrippableFenceGateBlock> CHERRY_WOOD_FENCE_GATE = woodFenceGate(WoodType.CHERRY, Blocks.CHERRY_WOOD, STRIPPED_CHERRY_WOOD_FENCE_GATE);
    public static final RegistryObject<StrippableStairBlock> BAMBOO_BLOCK_STAIRS = register("bamboo_block_stairs", strippableStair(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), Blocks.BAMBOO_BLOCK, STRIPPED_BAMBOO_BLOCK_STAIRS), 150);
    public static final RegistryObject<StrippableSlabBlock> BAMBOO_BLOCK_SLAB = register("bamboo_block_slab", strippableSlab(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.COLOR_YELLOW), STRIPPED_BAMBOO_BLOCK_SLAB), 75);
    public static final RegistryObject<StrippableWallBlock> BAMBOO_BLOCK_WALL = register("bamboo_block_wall", strippableWall(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), STRIPPED_BAMBOO_BLOCK_WALL), 150);
    public static final RegistryObject<StrippableFenceBlock> BAMBOO_BLOCK_FENCE = register("bamboo_block_fence", strippableFence(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), STRIPPED_BAMBOO_BLOCK_FENCE), 150);
    public static final RegistryObject<StrippableFenceGateBlock> BAMBOO_BLOCK_FENCE_GATE = register("bamboo_block_fence_gate", strippableFenceGate(CopyProperties(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PLANT), WoodType.BAMBOO,  STRIPPED_BAMBOO_BLOCK_FENCE_GATE), 150);

    public static final RegistryObject<StairBlock> STRIPPED_CRIMSON_HYPHAE_STAIRS = register("stripped_crimson_hyphae_stairs", stair(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab", slab(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<WallBlock> STRIPPED_CRIMSON_HYPHAE_WALL = register("stripped_crimson_hyphae_wall", wall(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceBlock> STRIPPED_CRIMSON_HYPHAE_FENCE = register("stripped_crimson_hyphae_fence", fence(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceGateBlock> STRIPPED_CRIMSON_HYPHAE_FENCE_GATE = register("stripped_crimson_hyphae_fence_gate", fenceGate(CopyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), WoodType.CRIMSON), fireResistanceItemProperties);
    public static final RegistryObject<StairBlock> STRIPPED_WARPED_HYPHAE_STAIRS = register("stripped_warped_hyphae_stairs", stair(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab", slab(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<WallBlock> STRIPPED_WARPED_HYPHAE_WALL = register("stripped_warped_hyphae_wall", wall(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceBlock> STRIPPED_WARPED_HYPHAE_FENCE = register("stripped_warped_hyphae_fence", fence(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceGateBlock> STRIPPED_WARPED_HYPHAE_FENCE_GATE = register("stripped_warped_hyphae_fence_gate", fenceGate(CopyProperties(Blocks.STRIPPED_WARPED_HYPHAE), WoodType.WARPED), fireResistanceItemProperties);

    public static final RegistryObject<StrippableStairBlock> CRIMSON_HYPHAE_STAIRS = register("crimson_hyphae_stairs", strippableStair(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_STAIRS), fireResistanceItemProperties);
    public static final RegistryObject<StrippableSlabBlock> CRIMSON_HYPHAE_SLAB = register("crimson_hyphae_slab", strippableSlab(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_SLAB), fireResistanceItemProperties);
    public static final RegistryObject<StrippableWallBlock> CRIMSON_HYPHAE_WALL = register("crimson_hyphae_wall", strippableWall(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_WALL), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceBlock> CRIMSON_HYPHAE_FENCE = register("crimson_hyphae_fence", strippableFence(Blocks.CRIMSON_HYPHAE, STRIPPED_CRIMSON_HYPHAE_FENCE), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = register("crimson_hyphae_fence_gate", strippableFenceGate(Blocks.CRIMSON_HYPHAE, WoodType.CRIMSON, STRIPPED_CRIMSON_HYPHAE_FENCE_GATE), fireResistanceItemProperties);
    public static final RegistryObject<StrippableStairBlock> WARPED_HYPHAE_STAIRS = register("warped_hyphae_stairs", strippableStair(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_STAIRS), fireResistanceItemProperties);
    public static final RegistryObject<StrippableSlabBlock> WARPED_HYPHAE_SLAB = register("warped_hyphae_slab", strippableSlab(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_SLAB), fireResistanceItemProperties);
    public static final RegistryObject<StrippableWallBlock> WARPED_HYPHAE_WALL = register("warped_hyphae_wall", strippableWall(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_WALL), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceBlock> WARPED_HYPHAE_FENCE = register("warped_hyphae_fence", strippableFence(Blocks.WARPED_HYPHAE, STRIPPED_WARPED_HYPHAE_FENCE), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceGateBlock> WARPED_HYPHAE_FENCE_GATE = register("warped_hyphae_fence_gate", strippableFenceGate(Blocks.WARPED_HYPHAE, WoodType.WARPED, STRIPPED_WARPED_HYPHAE_FENCE_GATE), fireResistanceItemProperties);

    public static final RegistryObject<StairBlock> CALCITE_STAIRS = register("calcite_stairs", stair(Blocks.CALCITE));
    public static final RegistryObject<SlabBlock> CALCITE_SLAB = register("calcite_slab", slab(Blocks.CALCITE));
    public static final RegistryObject<WallBlock> CALCITE_WALL = register("calcite_wall", wall(Blocks.CALCITE));
    public static final RegistryObject<StairBlock> SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", stair(Blocks.SMOOTH_BASALT));
    public static final RegistryObject<SlabBlock> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", slab(Blocks.SMOOTH_BASALT));
    public static final RegistryObject<WallBlock> SMOOTH_BASALT_WALL = register("smooth_basalt_wall", wall(Blocks.SMOOTH_BASALT));
    public static final RegistryObject<StairBlock> TUFF_STAIRS = register("tuff_stairs", stair(Blocks.TUFF));
    public static final RegistryObject<SlabBlock> TUFF_SLAB = register("tuff_slab", slab(Blocks.TUFF));
    public static final RegistryObject<WallBlock> TUFF_WALL = register("tuff_wall", wall(Blocks.TUFF));

    public static final RegistryObject<StairBlock> DEEPSLATE_STAIRS = register("deepslate_stairs", stair(Blocks.DEEPSLATE));
    public static final RegistryObject<SlabBlock> DEEPSLATE_SLAB = register("deepslate_slab", slab(Blocks.DEEPSLATE));
    public static final RegistryObject<WallBlock> DEEPSLATE_WALL = register("deepslate_wall", wall(Blocks.DEEPSLATE));
    public static final RegistryObject<StairBlock> CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", stair(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final RegistryObject<SlabBlock> CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", slab(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final RegistryObject<WallBlock> CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", wall(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final RegistryObject<StairBlock> CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", stair(Blocks.CRACKED_DEEPSLATE_TILES));
    public static final RegistryObject<SlabBlock> CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", slab(Blocks.CRACKED_DEEPSLATE_TILES));
    public static final RegistryObject<WallBlock> CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", wall(Blocks.CRACKED_DEEPSLATE_TILES));

    public static final RegistryObject<FenceGateBlock> NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", fenceGate(CopyProperties(Blocks.NETHER_BRICK_FENCE))); // TODO: fix wood type

    public static final RegistryObject<StairBlock> Cracked_Nether_Brick_Stairs = register("cracked_nether_brick_stairs", stair(Blocks.CRACKED_NETHER_BRICKS));
    public static final RegistryObject<SlabBlock> Cracked_Nether_Brick_Slab = register("cracked_nether_brick_slab", slab(Blocks.CRACKED_NETHER_BRICKS));
    public static final RegistryObject<WallBlock> Cracked_Nether_Brick_Wall = register("cracked_nether_brick_wall", wall(Blocks.CRACKED_NETHER_BRICKS));
    public static final RegistryObject<FenceBlock> Cracked_Nether_Brick_Fence = register("cracked_nether_brick_fence", fence(Blocks.CRACKED_NETHER_BRICKS));
    public static final RegistryObject<FenceGateBlock> Cracked_Nether_Brick_Fence_Gate = register("cracked_nether_brick_fence_gate", fenceGate(CopyProperties(Blocks.CRACKED_NETHER_BRICKS)));

    public static final RegistryObject<FenceBlock> Red_Nether_Brick_Fence = register("red_nether_brick_fence", fence(Blocks.RED_NETHER_BRICKS));
    public static final RegistryObject<FenceGateBlock> Red_Nether_Brick_Fence_Gate = register("red_nether_brick_fence_gate", fenceGate(CopyProperties(Blocks.RED_NETHER_BRICKS)));

    public static final RegistryObject<StairBlock> Obsidian_Stairs = register("obsidian_stairs", stair(Blocks.OBSIDIAN));
    public static final RegistryObject<SlabBlock> Obsidian_Slab = register("obsidian_slab", slab(Blocks.OBSIDIAN));
    public static final RegistryObject<WallBlock> Obsidian_Wall = register("obsidian_wall", wall(Blocks.OBSIDIAN));

    public static final RegistryObject<StairBlock> Crying_Obsidian_Stairs = register("crying_obsidian_stairs", stair(Blocks.CRYING_OBSIDIAN));
    public static final RegistryObject<SlabBlock> Crying_Obsidian_Slab = register("crying_obsidian_slab", slab(Blocks.CRYING_OBSIDIAN));
    public static final RegistryObject<WallBlock> Crying_Obsidian_Wall = register("crying_obsidian_wall", wall(Blocks.CRYING_OBSIDIAN));

    public static final RegistryObject<StairBlock> White_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.WHITE);
    public static final RegistryObject<SlabBlock> White_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.WHITE);
    public static final RegistryObject<WallBlock> White_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.WHITE);

    public static final RegistryObject<StairBlock> Orange_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.ORANGE);
    public static final RegistryObject<SlabBlock> Orange_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.ORANGE);
    public static final RegistryObject<WallBlock> Orange_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.ORANGE);

    public static final RegistryObject<StairBlock> Magenta_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.MAGENTA);
    public static final RegistryObject<SlabBlock> Magenta_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.MAGENTA);
    public static final RegistryObject<WallBlock> Magenta_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.MAGENTA);

    public static final RegistryObject<StairBlock> Light_Blue_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.LIGHT_BLUE);
    public static final RegistryObject<SlabBlock> Light_Blue_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final RegistryObject<WallBlock> Light_Blue_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final RegistryObject<StairBlock> Yellow_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.YELLOW);
    public static final RegistryObject<SlabBlock> Yellow_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.YELLOW);
    public static final RegistryObject<WallBlock> Yellow_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.YELLOW);

    public static final RegistryObject<StairBlock> Lime_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.LIME);
    public static final RegistryObject<SlabBlock> Lime_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.LIME);
    public static final RegistryObject<WallBlock> Lime_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.LIME);

    public static final RegistryObject<StairBlock> Pink_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.PINK);
    public static final RegistryObject<SlabBlock> Pink_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.PINK);
    public static final RegistryObject<WallBlock> Pink_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.PINK);

    public static final RegistryObject<StairBlock> Gray_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.GRAY);
    public static final RegistryObject<SlabBlock> Gray_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.GRAY);
    public static final RegistryObject<WallBlock> Gray_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.GRAY);

    public static final RegistryObject<StairBlock> Light_Gray_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.LIGHT_GRAY);
    public static final RegistryObject<SlabBlock> Light_Gray_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final RegistryObject<WallBlock> Light_Gray_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final RegistryObject<StairBlock> Cyan_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.CYAN);
    public static final RegistryObject<SlabBlock> Cyan_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.CYAN);
    public static final RegistryObject<WallBlock> Cyan_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.CYAN);

    public static final RegistryObject<StairBlock> Purple_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.PURPLE);
    public static final RegistryObject<SlabBlock> Purple_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.PURPLE);
    public static final RegistryObject<WallBlock> Purple_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.PURPLE);

    public static final RegistryObject<StairBlock> Blue_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.BLUE);
    public static final RegistryObject<SlabBlock> Blue_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.BLUE);
    public static final RegistryObject<WallBlock> Blue_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.BLUE);

    public static final RegistryObject<StairBlock> Brown_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.BROWN);
    public static final RegistryObject<SlabBlock> Brown_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.BROWN);
    public static final RegistryObject<WallBlock> Brown_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.BROWN);

    public static final RegistryObject<StairBlock> Green_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.GREEN);
    public static final RegistryObject<SlabBlock> Green_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.GREEN);
    public static final RegistryObject<WallBlock> Green_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.GREEN);

    public static final RegistryObject<StairBlock> Red_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.RED);
    public static final RegistryObject<SlabBlock> Red_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.RED);
    public static final RegistryObject<WallBlock> Red_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.RED);

    public static final RegistryObject<StairBlock> Black_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs(DyeColor.BLACK);
    public static final RegistryObject<SlabBlock> Black_Glazed_Terracotta_Slab = regGlazedTerracottaSlab(DyeColor.BLACK);
    public static final RegistryObject<WallBlock> Black_Glazed_Terracotta_Wall = regGlazedTerracottaWall(DyeColor.BLACK);

    public static final RegistryObject<StairBlock> WhiteWoolStairs = regWoolStairs(DyeColor.WHITE);
    public static final RegistryObject<SlabBlock> WhiteWoolSlab = regWoolSlab(DyeColor.WHITE);
    public static final RegistryObject<WallBlock> WhiteWoolWall = regWoolWall(DyeColor.WHITE);

    public static final RegistryObject<StairBlock> OrangeWoolStairs = regWoolStairs(DyeColor.ORANGE);
    public static final RegistryObject<SlabBlock> OrangeWoolSlab = regWoolSlab(DyeColor.ORANGE);
    public static final RegistryObject<WallBlock> OrangeWoolWall = regWoolWall(DyeColor.ORANGE);

    public static final RegistryObject<StairBlock> MagentaWoolStairs = regWoolStairs(DyeColor.MAGENTA);
    public static final RegistryObject<SlabBlock> MagentaWoolSlab = regWoolSlab(DyeColor.MAGENTA);
    public static final RegistryObject<WallBlock> MagentaWoolWall = regWoolWall(DyeColor.MAGENTA);

    public static final RegistryObject<StairBlock> LightBlueWoolStairs = regWoolStairs(DyeColor.LIGHT_BLUE);
    public static final RegistryObject<SlabBlock> LightBlueWoolSlab = regWoolSlab(DyeColor.LIGHT_BLUE);
    public static final RegistryObject<WallBlock> LightBlueWoolWall = regWoolWall(DyeColor.LIGHT_BLUE);

    public static final RegistryObject<StairBlock> YellowWoolStairs = regWoolStairs(DyeColor.YELLOW);
    public static final RegistryObject<SlabBlock> YellowWoolSlab = regWoolSlab(DyeColor.YELLOW);
    public static final RegistryObject<WallBlock> YellowWoolWall = regWoolWall(DyeColor.YELLOW);

    public static final RegistryObject<StairBlock> LimeWoolStairs = regWoolStairs(DyeColor.LIME);
    public static final RegistryObject<SlabBlock> LimeWoolSlab = regWoolSlab(DyeColor.LIME);
    public static final RegistryObject<WallBlock> LimeWoolWall = regWoolWall(DyeColor.LIME);

    public static final RegistryObject<StairBlock> PinkWoolStairs = regWoolStairs(DyeColor.PINK);
    public static final RegistryObject<SlabBlock> PinkWoolSlab = regWoolSlab(DyeColor.PINK);
    public static final RegistryObject<WallBlock> PinkWoolWall = regWoolWall(DyeColor.PINK);

    public static final RegistryObject<StairBlock> GrayWoolStairs = regWoolStairs(DyeColor.GRAY);
    public static final RegistryObject<SlabBlock> GrayWoolSlab = regWoolSlab(DyeColor.GRAY);
    public static final RegistryObject<WallBlock> GrayWoolWall = regWoolWall(DyeColor.GRAY);

    public static final RegistryObject<StairBlock> LightGrayWoolStairs = regWoolStairs(DyeColor.LIGHT_GRAY);
    public static final RegistryObject<SlabBlock> LightGrayWoolSlab = regWoolSlab(DyeColor.LIGHT_GRAY);
    public static final RegistryObject<WallBlock> LightGrayWoolWall = regWoolWall(DyeColor.LIGHT_GRAY);

    public static final RegistryObject<StairBlock> CyanWoolStairs = regWoolStairs(DyeColor.CYAN);
    public static final RegistryObject<SlabBlock> CyanWoolSlab = regWoolSlab(DyeColor.CYAN);
    public static final RegistryObject<WallBlock> CyanWoolWall = regWoolWall(DyeColor.CYAN);

    public static final RegistryObject<StairBlock> PurpleWoolStairs = regWoolStairs(DyeColor.PURPLE);
    public static final RegistryObject<SlabBlock> PurpleWoolSlab = regWoolSlab(DyeColor.PURPLE);
    public static final RegistryObject<WallBlock> PurpleWoolWall = regWoolWall(DyeColor.PURPLE);

    public static final RegistryObject<StairBlock> BlueWoolStairs = regWoolStairs(DyeColor.BLUE);
    public static final RegistryObject<SlabBlock> BlueWoolSlab = regWoolSlab(DyeColor.BLUE);
    public static final RegistryObject<WallBlock> BlueWoolWall = regWoolWall(DyeColor.BLUE);

    public static final RegistryObject<StairBlock> BrownWoolStairs = regWoolStairs(DyeColor.BROWN);
    public static final RegistryObject<SlabBlock> BrownWoolSlab = regWoolSlab(DyeColor.BROWN);
    public static final RegistryObject<WallBlock> BrownWoolWall = regWoolWall(DyeColor.BROWN);

    public static final RegistryObject<StairBlock> GreenWoolStairs = regWoolStairs(DyeColor.GREEN);
    public static final RegistryObject<SlabBlock> GreenWoolSlab = regWoolSlab(DyeColor.GREEN);
    public static final RegistryObject<WallBlock> GreenWoolWall = regWoolWall(DyeColor.GREEN);

    public static final RegistryObject<StairBlock> RedWoolStairs = regWoolStairs(DyeColor.RED);
    public static final RegistryObject<SlabBlock> RedWoolSlab = regWoolSlab(DyeColor.RED);
    public static final RegistryObject<WallBlock> RedWoolWall = regWoolWall(DyeColor.RED);

    public static final RegistryObject<StairBlock> BlackWoolStairs = regWoolStairs(DyeColor.BLACK);
    public static final RegistryObject<SlabBlock> BlackWoolSlab = regWoolSlab(DyeColor.BLACK);
    public static final RegistryObject<WallBlock> BlackWoolWall = regWoolWall(DyeColor.BLACK);

    public static final RegistryObject<StairBlock> PackedMudStairs = register("packed_mud_stairs", stair(Blocks.PACKED_MUD));
    public static final RegistryObject<SlabBlock> PackedMudSlab = register("packed_mud_slab", slab(Blocks.PACKED_MUD));
    public static final RegistryObject<WallBlock> PackedMudWall = register("packed_mud_wall", wall(Blocks.PACKED_MUD));

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

    private static RegistryObject<StairBlock> regTerracottaStairs(DyeColor color, Block base){
        return register(color.getName() + "_terracotta_stairs", stair(base));
    }
    private static RegistryObject<SlabBlock> regTerracottaSlab(DyeColor color){
        return register(color.getName() + "_terracotta_slab", slab(Blocks.TERRACOTTA));
    }
    private static RegistryObject<WallBlock> regTerracottaWall(DyeColor color){
        return register(color.getName() + "_terracotta_wall", wall(Blocks.TERRACOTTA));
    }

    private static RegistryObject<StrippableStairBlock> logStairs(String type, Block base, Supplier<StairBlock> stripped) {
        return register(type + "_log_stairs", strippableStair(base, stripped), 300);
    }

    private static RegistryObject<StairBlock> logStairs(String type, Block base) {
        return register(type + "_log_stairs", stair(base), 300);
    }
    private static RegistryObject<SlabBlock> logSlab(String type, Block base) {
        return register(type + "_log_slab", slab(base), 300);
    }
    private static RegistryObject<StrippableSlabBlock> logSlab(String type, Block base, Supplier<SlabBlock> stripped) {
        return register(type + "_log_slab", strippableSlab(base, stripped), 300);
    }

    private static RegistryObject<StairBlock> woodStairs(String type, Block base) {
        return register(type + "_wood_stairs", stair(base), 300);
    }

    private static RegistryObject<StrippableStairBlock> woodStairs(String type, Block base, Supplier<StairBlock> stripped){
        return register(type + "_wood_stairs", strippableStair(base, stripped), 300);
    }
    private static RegistryObject<SlabBlock> woodSlab(String type, Block base){
        return register(type + "_wood_slab", slab(base), 150);
    }
    private static RegistryObject<StrippableSlabBlock> woodSlab(String type, Block base, Supplier<SlabBlock> stripped){
        return register(type + "_wood_slab", strippableSlab(base, stripped), 150);
    }
    private static RegistryObject<WallBlock> woodWall(String type, Block base){
        return register(type + "_wood_wall", wall(base), 300);
    }
    private static RegistryObject<StrippableWallBlock> woodWall(String type, Block base, Supplier<WallBlock> stripped) {
        return register(type + "_wood_wall", strippableWall(base, stripped), 300);
    }
    private static RegistryObject<FenceBlock> woodFence(String type, Block base) {
        return register(type + "_wood_fence", fence(base), 300);
    }
    private static RegistryObject<StrippableFenceBlock> woodFence(String type, Block base, Supplier<FenceBlock> stripped) {
        return register(type + "_wood_fence", strippableFence(base, stripped), 300);
    }
    private static RegistryObject<FenceGateBlock> woodFenceGate(String type, Block base) {
        return register(type + "_wood_fence_gate", fenceGate(CopyProperties(base), WoodTypeOf(type)), 300);
    }
    private static RegistryObject<StrippableFenceGateBlock> woodFenceGate(WoodType type, Block base, Supplier<FenceGateBlock> stripped) {
        return register(type.name() + "_wood_fence_gate", strippableFenceGate(base, type, stripped), 300);
    }

    private static RegistryObject<StairBlock> regGlazedTerracottaStairs(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_stairs", ()-> new StairBlock(parent::defaultBlockState, CopyProperties(parent)));
    }
    private static RegistryObject<SlabBlock> regGlazedTerracottaSlab(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_slab", ()-> new SlabBlock(CopyProperties(parent)));
    }
    private static RegistryObject<WallBlock> regGlazedTerracottaWall(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_wall", ()-> new WallBlock(CopyProperties(parent)));
    }

    private static RegistryObject<StairBlock> regWoolStairs(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_stairs", stair(parent));
    }
    private static RegistryObject<SlabBlock> regWoolSlab(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_slab", slab(parent));
    }
    private static RegistryObject<WallBlock> regWoolWall(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_wall", wall(parent));
    }

    protected static Supplier<SlabBlock> slab(SlabBlock.Properties properties) {return ()-> new SlabBlock(properties);}
    protected static Supplier<SlabBlock> slab(Block parent) {return slab(CopyProperties(parent));}
    protected static Supplier<WallBlock> wall(WallBlock.Properties properties) {return ()-> new WallBlock(properties);}
    protected static Supplier<WallBlock> wall(Block parent) {return wall(CopyProperties(parent));}
    protected static Supplier<FenceBlock> fence(FenceBlock.Properties properties) {return ()-> new FenceBlock(properties);}
    protected static Supplier<FenceBlock> fence(Block parent) {return fence(CopyProperties(parent));}

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
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(name));
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {
        return  register(name, block, DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, int itemBurnTime) {
        return  register(name, block, itemBurnTime, DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, Item.Properties itemProperties){
        var registryObject = registerWithoutItem(name, block);
        ITEM_REGISTER.register(name, ()-> new BlockItem(registryObject.get(), itemProperties));
        return registryObject;
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, int itemBurnTime, Item.Properties itemProperties){
        var registryObject = registerWithoutItem(name, block);
        ITEM_REGISTER.register(name, ()-> new BlockItem(registryObject.get(), itemProperties){
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return itemBurnTime;}
        });
        return registryObject;
    }
    private static <T extends Block> RegistryObject<T> registerWithoutItem(String name, Supplier<T> block) {return BLOCK_REGISTER.register(name, block);}

    public static Iterator<Block> getAllBlocks() {return BLOCK_REGISTER.getEntries().stream().map(RegistryObject::get).iterator();}
}