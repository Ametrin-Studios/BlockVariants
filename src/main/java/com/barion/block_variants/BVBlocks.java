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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.function.Supplier;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.CopyProperties;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegistryHelper.fenceGate;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegistryHelper.stair;

public class BVBlocks {
    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockVariants.ModID);
    public static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, BlockVariants.ModID);

    private static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties();
    private static final Item.Properties fireResistanceItemProperties = new Item.Properties().fireResistant();


    public static final RegistryObject<WallBlock> POLISHED_GRANITE_WALL = register("polished_granite_wall",
            wall(Blocks.POLISHED_GRANITE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> POLISHED_DIORITE_WALL = register("polished_diorite_wall",
            wall(Blocks.POLISHED_DIORITE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> POLISHED_ANDESITE_WALL = register("polished_andesite_wall",
            wall(Blocks.POLISHED_ANDESITE), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<WallBlock> STONE_WALL = register("stone_wall",
            wallOld(Material.STONE, 1.5F, 6, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> SMOOTH_STONE_STAIRS = register("smooth_stone_stairs",
            stair(Blocks.SMOOTH_STONE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> SMOOTH_STONE_WALL = register("smooth_stone_wall",
            wallOld(Material.STONE, 2F, 6, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs",
            stairOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> CUT_SANDSTONE_WALL = register("cut_sandstone_wall",
            wallOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs",
            stairOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall",
            wallOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<WallBlock> QUARTZ_WALL = register("quartz_wall",
            wallOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs",
            stairOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.QUARTZ_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> QUARTZ_BRICK_SLAB = register("quartz_brick_slab",
            slabOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> QUARTZ_BRICK_WALL = register("quartz_brick_wall",
            wallOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall",
            wallOld(Material.STONE, 2, 6, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> CHISELED_QUARTZ_BLOCK_STAIRS = register("chiseled_quartz_block_stairs",
            stairOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CHISELED_QUARTZ_BLOCK), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> CHISELED_QUARTZ_BLOCK_SLAB = register("chiseled_quartz_block_slab",
            slabOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> CHISELED_QUARTZ_BLOCK_WALL = register("chiseled_quartz_block_wall",
            wallOld(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<WallBlock> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall",
            wallOld(Material.STONE, 1.5F, 6, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> DARK_PRISMARINE_WALL = register("dark_prismarine_wall",
            wallOld(Material.STONE, 1.5F, 6, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> NETHERRACK_STAIRS = register("netherrack_stairs",
            stairOld(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true, Blocks.NETHERRACK), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> NETHERRACK_SLAB = register("netherrack_slab",
            slabOld(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> NETHERRACK_WALL = register("netherrack_wall",
            wallOld(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> END_STONE_STAIRS = register("end_stone_stairs",
            stair(Blocks.END_STONE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> END_STONE_SLAB = register("end_stone_slab",
            slab(Blocks.END_STONE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> END_STONE_WALL = register("end_stone_wall",
            wall(Blocks.END_STONE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> PURPUR_WALL = register("purpur_wall",
            wall(Blocks.PURPUR_BLOCK), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs",
            stairOld(Material.STONE, 1.5F, 6, SoundType.STONE, true, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab",
            slabOld(Material.STONE, 1.5F, 6, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall",
            wallOld(Material.STONE, 1.5F, 6, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> BASALT_STAIRS = register("basalt_stairs",
            stairOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.BASALT), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> BASALT_SLAB = register("basalt_slab",
            slabOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> BASALT_WALL = register("basalt_wall",
            wallOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> POLISHED_BASALT_STAIRS = register("polished_basalt_stairs",
            stairOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.POLISHED_BASALT), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> POLISHED_BASALT_SLAB = register("polished_basalt_slab",
            slabOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> POLISHED_BASALT_WALL = register("polished_basalt_wall",
            wallOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> TERRACOTTA_STAIRS = register("terracotta_stairs",
            stairOld(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true, Blocks.TERRACOTTA), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab",
                    slabOld(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> TERRACOTTA_WALL = register("terracotta_wall",
                    wallOld(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> White_Terracotta_Stairs = regTerracottaStairs(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
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

    public static final RegistryObject<StairBlock> DRIPSTONE_BLOCK_STAIRS = register("dripstone_block_stairs",
                    stairOld(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true, Blocks.DRIPSTONE_BLOCK), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> DRIPSTONE_BLOCK_SLAB = register("dripstone_block_slab",
                    slabOld(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> DRIPSTONE_BLOCK_WALL = register("dripstone_block_wall",
                    wallOld(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> AMETHYST_BLOCK_STAIRS = register("amethyst_block_stairs",
                    stairOld(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true, Blocks.DRIPSTONE_BLOCK), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> AMETHYST_BLOCK_SLAB = register("amethyst_block_slab",
                    slabOld(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> AMETHYST_BLOCK_WALL = register("amethyst_block_wall",
                    wallOld(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> Cracked_Stone_Brick_Stairs = register("cracked_stone_brick_stairs",
                    stairOld(Material.STONE, 1.5F, 6F, SoundType.STONE, true, Blocks.CRACKED_STONE_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Cracked_Stone_Brick_Slab = register("cracked_stone_brick_slab",
                    slabOld(Material.STONE, 1.5F, 6F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Cracked_Stone_Brick_Wall = register("cracked_stone_brick_wall",
                    wallOld(Material.STONE, 1.5F, 6F, SoundType.STONE, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> Stripped_Oak_Log_Stairs = logStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD); // log sets its material color based of the AXIS
    public static final RegistryObject<SlabBlock> Stripped_Oak_Log_Slab = logSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Spruce_Log_Stairs = logStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Spruce_Log_Slab = logSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Birch_Log_Stairs = logStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Birch_Log_Slab = logSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Jungle_Log_Stairs = logStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Jungle_Log_Slab = logSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Acacia_Log_Stairs = logStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Acacia_Log_Slab = logSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Dark_Oak_Log_Stairs = logStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Dark_Oak_Log_Slab = logSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Mangrove_Log_Stairs = logStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Mangrove_Log_Slab = logSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);

    public static final RegistryObject<StrippableStairBlock> Oak_Log_Stairs = logStairs("oak", Blocks.OAK_WOOD, Stripped_Oak_Log_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Oak_Log_Slab = logSlab("oak", Blocks.OAK_WOOD, Stripped_Oak_Log_Slab);
    public static final RegistryObject<StrippableStairBlock> Spruce_Log_Stairs = logStairs("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Log_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Spruce_Log_Slab = logSlab("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Log_Slab);
    public static final RegistryObject<StrippableStairBlock> Birch_Log_Stairs = logStairs("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Log_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Birch_Log_Slab = logSlab("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Log_Slab);
    public static final RegistryObject<StrippableStairBlock> Jungle_Log_Stairs = logStairs("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Log_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Jungle_Log_Slab = logSlab("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Log_Slab);
    public static final RegistryObject<StrippableStairBlock> Acacia_Log_Stairs = logStairs("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Log_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Acacia_Log_Slab = logSlab("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Log_Slab);
    public static final RegistryObject<StrippableStairBlock> Dark_Oak_Log_Stairs = logStairs("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Log_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Dark_Oak_Log_Slab = logSlab("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Log_Slab);
    public static final RegistryObject<StrippableStairBlock> Mangrove_Log_Stairs = logStairs("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Log_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Mangrove_Log_Slab = logSlab("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Log_Slab);

    public static final RegistryObject<StairBlock> Stripped_Crimson_Stem_Stairs = register("stripped_crimson_stem_stairs",
            stairOld(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.STRIPPED_CRIMSON_STEM), DEFAULT_ITEM_PROPERTIES.fireResistant());
    public static final RegistryObject<SlabBlock> Stripped_Crimson_Stem_Slab = register("stripped_crimson_stem_slab",
            slabOld(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false), DEFAULT_ITEM_PROPERTIES.fireResistant());
    public static final RegistryObject<StairBlock> Stripped_Warped_Stem_Stairs = register("stripped_warped_stem_stairs",
            stairOld(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.STRIPPED_WARPED_STEM), DEFAULT_ITEM_PROPERTIES.fireResistant());
    public static final RegistryObject<SlabBlock> Stripped_Warped_Stem_Slab = register("stripped_warped_stem_slab",
            slabOld(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false), DEFAULT_ITEM_PROPERTIES.fireResistant());

    public static final RegistryObject<StrippableStairBlock> Crimson_Stem_Stairs = register("crimson_stem_stairs",
                    strippableStair(Blocks.CRIMSON_STEM, Stripped_Crimson_Stem_Stairs), DEFAULT_ITEM_PROPERTIES.fireResistant());
    public static final RegistryObject<StrippableSlabBlock> Crimson_Stem_Slab = register("crimson_stem_slab",
                    strippableSlab(Blocks.CRIMSON_STEM, Stripped_Crimson_Stem_Slab), DEFAULT_ITEM_PROPERTIES.fireResistant());
    public static final RegistryObject<StrippableStairBlock> Warped_Stem_Stairs = register("warped_stem_stairs",
                    strippableStair(Blocks.WARPED_STEM, Stripped_Warped_Stem_Stairs), DEFAULT_ITEM_PROPERTIES.fireResistant());
    public static final RegistryObject<StrippableSlabBlock> Warped_Stem_Slab = register("warped_stem_slab",
                    strippableSlab(Blocks.WARPED_STEM, Stripped_Warped_Stem_Slab), DEFAULT_ITEM_PROPERTIES.fireResistant());

    public static final RegistryObject<StairBlock> Stripped_Oak_Wood_Stairs = woodStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Oak_Wood_Slab = woodSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Oak_Wood_Wall = woodWall("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<FenceBlock> Stripped_Oak_Wood_Fence = woodFence("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<FenceGateBlock> Stripped_Oak_Wood_FenceGate = woodFenceGate("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Spruce_Wood_Stairs = woodStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Spruce_Wood_Slab = woodSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Spruce_Wood_Wall = woodWall("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<FenceBlock> Stripped_Spruce_Wood_Fence = woodFence("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<FenceGateBlock> Stripped_Spruce_Wood_FenceGate = woodFenceGate("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Birch_Wood_Stairs = woodStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Birch_Wood_Slab = woodSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Birch_Wood_Wall = woodWall("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<FenceBlock> Stripped_Birch_Wood_Fence = woodFence("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<FenceGateBlock> Stripped_Birch_Wood_FenceGate = woodFenceGate("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Jungle_Wood_Stairs = woodStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Jungle_Wood_Slab = woodSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Jungle_Wood_Wall = woodWall("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<FenceBlock> Stripped_Jungle_Wood_Fence = woodFence("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<FenceGateBlock> Stripped_Jungle_Wood_FenceGate = woodFenceGate("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Acacia_Wood_Stairs = woodStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Acacia_Wood_Slab = woodSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Acacia_Wood_Wall = woodWall("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<FenceBlock> Stripped_Acacia_Wood_Fence = woodFence("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<FenceGateBlock> Stripped_Acacia_Wood_FenceGate = woodFenceGate("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Dark_Oak_Wood_Stairs = woodStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Dark_Oak_Wood_Slab = woodSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Dark_Oak_Wood_Wall = woodWall("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceBlock> Stripped_Dark_Oak_Wood_Fence = woodFence("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceGateBlock> Stripped_Dark_Oak_Wood_FenceGate = woodFenceGate("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Mangrove_Wood_Stairs = woodStairs("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Mangrove_Wood_Slab = woodSlab("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Mangrove_Wood_Wall = woodWall("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceBlock> Stripped_Mangrove_Wood_Fence = woodFence("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<FenceGateBlock> Stripped_Mangrove_Wood_FenceGate = woodFenceGate("stripped_mangrove", Blocks.STRIPPED_DARK_OAK_WOOD);

    public static final RegistryObject<StrippableStairBlock> Oak_Wood_Stairs = woodStairs("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Oak_Wood_Slab = woodSlab("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Oak_Wood_Wall = woodWall("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Oak_Wood_Fence = woodFence("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Oak_Wood_FenceGate = woodFenceGate(WoodType.OAK, Blocks.OAK_WOOD, Stripped_Oak_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Spruce_Wood_Stairs = woodStairs("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Spruce_Wood_Slab = woodSlab("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Spruce_Wood_Wall = woodWall("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Spruce_Wood_Fence = woodFence("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Spruce_Wood_FenceGate = woodFenceGate(WoodType.SPRUCE, Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Birch_Wood_Stairs = woodStairs("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Birch_Wood_Slab = woodSlab("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Birch_Wood_Wall = woodWall("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Birch_Wood_Fence = woodFence("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Birch_Wood_FenceGate = woodFenceGate(WoodType.BIRCH, Blocks.BIRCH_WOOD, Stripped_Birch_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Jungle_Wood_Stairs = woodStairs("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Jungle_Wood_Slab = woodSlab("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Jungle_Wood_Wall = woodWall("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Jungle_Wood_Fence = woodFence("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Jungle_Wood_FenceGate = woodFenceGate(WoodType.JUNGLE, Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Acacia_Wood_Stairs = woodStairs("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Acacia_Wood_Slab = woodSlab("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Acacia_Wood_Wall = woodWall("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Acacia_Wood_Fence = woodFence("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Acacia_Wood_FenceGate = woodFenceGate(WoodType.ACACIA, Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Dark_Oak_Wood_Stairs = woodStairs("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Dark_Oak_Wood_Slab = woodSlab("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Dark_Oak_Wood_Wall = woodWall("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Dark_Oak_Wood_Fence = woodFence("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Dark_Oak_Wood_FenceGate = woodFenceGate(WoodType.DARK_OAK, Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Mangrove_Wood_Stairs = woodStairs("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Mangrove_Wood_Slab = woodSlab("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Mangrove_Wood_Wall = woodWall("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Mangrove_Wood_Fence = woodFence("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Mangrove_Wood_FenceGate = woodFenceGate(WoodType.MANGROVE, Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_FenceGate);

    public static final RegistryObject<StairBlock> Stripped_Crimson_Hyphae_Stairs = register("stripped_crimson_hyphae_stairs", stair(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<SlabBlock> Stripped_Crimson_Hyphae_Slab = register("stripped_crimson_hyphae_slab", slab(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<WallBlock> Stripped_Crimson_Hyphae_Wall = register("stripped_crimson_hyphae_wall", wall(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceBlock> Stripped_Crimson_Hyphae_Fence = register("stripped_crimson_hyphae_fence", fence(Blocks.STRIPPED_CRIMSON_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceGateBlock> Stripped_Crimson_Hyphae_FenceGate = register("stripped_crimson_hyphae_fence_gate", fenceGate(CopyProperties(Blocks.STRIPPED_CRIMSON_HYPHAE), WoodType.CRIMSON), fireResistanceItemProperties);
    public static final RegistryObject<StairBlock> Stripped_Warped_Hyphae_Stairs = register("stripped_warped_hyphae_stairs", stair(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<SlabBlock> Stripped_Warped_Hyphae_Slab = register("stripped_warped_hyphae_slab", slab(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<WallBlock> Stripped_Warped_Hyphae_Wall = register("stripped_warped_hyphae_wall", wall(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceBlock> Stripped_Warped_Hyphae_Fence = register("stripped_warped_hyphae_fence", fence(Blocks.STRIPPED_WARPED_HYPHAE), fireResistanceItemProperties);
    public static final RegistryObject<FenceGateBlock> Stripped_Warped_Hyphae_FenceGate = register("stripped_warped_hyphae_fence_gate", fenceGate(CopyProperties(Blocks.STRIPPED_WARPED_HYPHAE), WoodType.WARPED), fireResistanceItemProperties);

    public static final RegistryObject<StrippableStairBlock> Crimson_Hyphae_Stairs = register("crimson_hyphae_stairs", strippableStair(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Stairs), fireResistanceItemProperties);
    public static final RegistryObject<StrippableSlabBlock> Crimson_Hyphae_Slab = register("crimson_hyphae_slab", strippableSlab(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Slab), fireResistanceItemProperties);
    public static final RegistryObject<StrippableWallBlock> Crimson_Hyphae_Wall = register("crimson_hyphae_wall", strippableWall(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Wall), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceBlock> Crimson_Hyphae_Fence = register("crimson_hyphae_fence", strippableFence(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Fence), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceGateBlock> Crimson_Hyphae_FenceGate = register("crimson_hyphae_fence_gate", strippableFenceGate(Blocks.CRIMSON_HYPHAE, WoodType.CRIMSON, Stripped_Crimson_Hyphae_FenceGate), fireResistanceItemProperties);
    public static final RegistryObject<StrippableStairBlock> Warped_Hyphae_Stairs = register("warped_hyphae_stairs", strippableStair(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Stairs), fireResistanceItemProperties);
    public static final RegistryObject<StrippableSlabBlock> Warped_Hyphae_Slab = register("warped_hyphae_slab", strippableSlab(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Slab), fireResistanceItemProperties);
    public static final RegistryObject<StrippableWallBlock> Warped_Hyphae_Wall = register("warped_hyphae_wall", strippableWall(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Wall), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceBlock> Warped_Hyphae_Fence = register("warped_hyphae_fence", strippableFence(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Fence), fireResistanceItemProperties);
    public static final RegistryObject<StrippableFenceGateBlock> Warped_Hyphae_FenceGate = register("warped_hyphae_fence_gate", strippableFenceGate(Blocks.WARPED_HYPHAE, WoodType.WARPED, Stripped_Warped_Hyphae_FenceGate), fireResistanceItemProperties);

    public static final RegistryObject<StairBlock> Calcite_Stairs = register("calcite_stairs",
            stairOld(Material.STONE, 0.75F, 0.75F, SoundType.CALCITE, true, Blocks.CALCITE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Calcite_Slab = register("calcite_slab",
            slabOld(Material.STONE, 0.75F, 0.75F, SoundType.CALCITE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Calcite_Wall = register("calcite_wall",
            wallOld(Material.STONE, 0.75F, 0.75F, SoundType.CALCITE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> Smooth_Basalt_Stairs = register("smooth_basalt_stairs",
            stairOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.SMOOTH_BASALT), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Smooth_Basalt_Slab = register("smooth_basalt_slab",
            slabOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Smooth_Basalt_Wall = register("smooth_basalt_wall",
            wallOld(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> Tuff_Stairs = register("tuff_stairs",
            stairOld(Material.STONE, 1.5F, 6F, SoundType.TUFF, true, Blocks.TUFF), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Tuff_Slab = register("tuff_slab",
            slabOld(Material.STONE, 1.5F, 6F, SoundType.TUFF, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Tuff_Wall = register("tuff_wall",
            wallOld(Material.STONE, 1.5F, 6F, SoundType.TUFF, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> Deepslate_Stairs = register("deepslate_stairs",
            stairOld(Material.STONE, 3, 6, SoundType.DEEPSLATE, true, Blocks.DEEPSLATE), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Deepslate_Slab = register("deepslate_slab",
            slabOld(Material.STONE, 3, 6, SoundType.DEEPSLATE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Deepslate_Wall = register("deepslate_wall",
            wallOld(Material.STONE, 3, 6, SoundType.DEEPSLATE, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> Cracked_Deepslate_Brick_Stairs = register("cracked_deepslate_brick_stairs",
            stairOld(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_BRICKS, true, Blocks.CRACKED_DEEPSLATE_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Cracked_Deepslate_Brick_Slab = register("cracked_deepslate_brick_slab",
            slabOld(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_BRICKS, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Cracked_Deepslate_Brick_Wall = register("cracked_deepslate_brick_wall",
            wallOld(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_BRICKS, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<StairBlock> Cracked_Deepslate_Tile_Stairs = register("cracked_deepslate_tile_stairs",
            stairOld(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_TILES, true, Blocks.CRACKED_DEEPSLATE_TILES), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Cracked_Deepslate_Tile_Slab = register("cracked_deepslate_tile_slab",
            slabOld(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_TILES, true), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Cracked_Deepslate_Tile_Wall = register("cracked_deepslate_tile_wall",
            wallOld(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_TILES, true), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<FenceGateBlock> Nether_Brick_Fence_Gate = register("nether_brick_fence_gate",
            fenceGate(CopyProperties(Blocks.NETHER_BRICK_FENCE)), DEFAULT_ITEM_PROPERTIES); // TODO: fix wood type

    public static final RegistryObject<StairBlock> Cracked_Nether_Brick_Stairs = register("cracked_nether_brick_stairs",
            stair(Blocks.CRACKED_NETHER_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Cracked_Nether_Brick_Slab = register("cracked_nether_brick_slab",
            slab(Blocks.CRACKED_NETHER_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Cracked_Nether_Brick_Wall = register("cracked_nether_brick_wall",
            wall(Blocks.CRACKED_NETHER_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<FenceBlock> Cracked_Nether_Brick_Fence = register("cracked_nether_brick_fence",
            fence(Blocks.CRACKED_NETHER_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<FenceGateBlock> Cracked_Nether_Brick_Fence_Gate = register("cracked_nether_brick_fence_gate",
            fenceGate(CopyProperties(Blocks.CRACKED_NETHER_BRICKS)), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<FenceBlock> Red_Nether_Brick_Fence = register("red_nether_brick_fence",
            fence(Blocks.RED_NETHER_BRICKS), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<FenceGateBlock> Red_Nether_Brick_Fence_Gate = register("red_nether_brick_fence_gate",
            fenceGate(CopyProperties(Blocks.RED_NETHER_BRICKS)), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> Obsidian_Stairs = register("obsidian_stairs",
            stair(Blocks.OBSIDIAN), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Obsidian_Slab = register("obsidian_slab",
            slab(Blocks.OBSIDIAN), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Obsidian_Wall = register("obsidian_wall",
            wall(Blocks.OBSIDIAN), DEFAULT_ITEM_PROPERTIES);

    public static final RegistryObject<StairBlock> Crying_Obsidian_Stairs = register("crying_obsidian_stairs",
            stair(Blocks.CRYING_OBSIDIAN), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> Crying_Obsidian_Slab = register("crying_obsidian_slab",
            slab(Blocks.CRYING_OBSIDIAN), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> Crying_Obsidian_Wall = register("crying_obsidian_wall",
            wall(Blocks.CRYING_OBSIDIAN), DEFAULT_ITEM_PROPERTIES);

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

    public static final RegistryObject<StairBlock> PackedMudStairs = register("packed_mud_stairs", stair(Blocks.PACKED_MUD), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<SlabBlock> PackedMudSlab = register("packed_mud_slab", slab(Blocks.PACKED_MUD), DEFAULT_ITEM_PROPERTIES);
    public static final RegistryObject<WallBlock> PackedMudWall = register("packed_mud_wall", wall(Blocks.PACKED_MUD), DEFAULT_ITEM_PROPERTIES);

    private static Supplier<StrippableStairBlock> strippableStair(Block base, Supplier<StairBlock> stripped) {return ()-> new StrippableStairBlock(base::defaultBlockState, stripped, StairBlock.Properties.copy(base));}
    private static Supplier<StrippableSlabBlock> strippableSlab(Block base, Supplier<SlabBlock> stripped) {return ()-> new StrippableSlabBlock(stripped, SlabBlock.Properties.copy(base));}
    private static Supplier<StrippableWallBlock> strippableWall(Block base, Supplier<WallBlock> stripped) {return ()-> new StrippableWallBlock(stripped, WallBlock.Properties.copy(base));}
    private static Supplier<StrippableFenceBlock> strippableFence(Block base, Supplier<FenceBlock> stripped) {return ()-> new StrippableFenceBlock(stripped, WallBlock.Properties.copy(base));}
    private static Supplier<StrippableFenceGateBlock> strippableFenceGate(Block base, WoodType type, Supplier<FenceGateBlock> stripped) {return ()-> new StrippableFenceGateBlock(stripped, FenceGateBlock.Properties.copy(base), type);}

    @Deprecated private static Supplier<StairBlock> stairOld(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool, Block block){
        if(requiresTool)
            return stair(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops(), block::defaultBlockState);
        else
            return stair(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType), block::defaultBlockState);
    }
    @Deprecated private static Supplier<SlabBlock> slabOld(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return slab(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return slab(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }
    @Deprecated private static Supplier<WallBlock> wallOld(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return wall(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return wall(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }

    @Deprecated(forRemoval = true)
    private static RegistryObject<StairBlock> regTerracottaStairs(String color, Block base){
        return register(color + "_terracotta_stairs", stair(base), DEFAULT_ITEM_PROPERTIES);
    }
    @Deprecated(forRemoval = true)
    private static RegistryObject<SlabBlock> regTerracottaSlab(String color){
        return register(color + "_terracotta_slab", slab(Blocks.TERRACOTTA), DEFAULT_ITEM_PROPERTIES);
    }
    @Deprecated(forRemoval = true)
    private static RegistryObject<WallBlock> regTerracottaWall(String color){
        return register(color + "_terracotta_wall", wall(Blocks.TERRACOTTA), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<StairBlock> regTerracottaStairs(DyeColor color, Block base){
        return register(color.getName() + "_terracotta_stairs", stair(base), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<SlabBlock> regTerracottaSlab(DyeColor color){
        return register(color.getName() + "_terracotta_slab", slab(Blocks.TERRACOTTA), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<WallBlock> regTerracottaWall(DyeColor color){
        return register(color.getName() + "_terracotta_wall", wall(Blocks.TERRACOTTA), DEFAULT_ITEM_PROPERTIES);
    }

    private static RegistryObject<StrippableStairBlock> logStairs(String type, Block base, Supplier<StairBlock> stripped) {
        return register(type + "_log_stairs", strippableStair(base, stripped), DEFAULT_ITEM_PROPERTIES);
    }

    private static RegistryObject<StairBlock> logStairs(String type, Block base) {
        return register(type + "_log_stairs", stair(base), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<SlabBlock> logSlab(String type, Block base) {
        return register(type + "_log_slab", slab(base), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<StrippableSlabBlock> logSlab(String type, Block base, Supplier<SlabBlock> stripped) {
        return register(type + "_log_slab", strippableSlab(base, stripped), DEFAULT_ITEM_PROPERTIES);
    }

    private static RegistryObject<StairBlock> woodStairs(String type, Block base) {
        return register(type + "_wood_stairs", stair(base), DEFAULT_ITEM_PROPERTIES);
    }

    private static RegistryObject<StrippableStairBlock> woodStairs(String type, Block base, Supplier<StairBlock> stripped){
        return register(type + "_wood_stairs", strippableStair(base, stripped), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<SlabBlock> woodSlab(String type, Block base){
        return register(type + "_wood_slab", slab(base), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<StrippableSlabBlock> woodSlab(String type, Block base, Supplier<SlabBlock> stripped){
        return register(type + "_wood_slab", strippableSlab(base, stripped), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<WallBlock> woodWall(String type, Block base){
        return register(type + "_wood_wall", wall(base), 300, DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<StrippableWallBlock> woodWall(String type, Block base, Supplier<WallBlock> stripped) {
        return register(type + "_wood_wall", strippableWall(base, stripped), 300, DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<FenceBlock> woodFence(String type, Block base) {
        return register(type + "_wood_fence", fence(base), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<StrippableFenceBlock> woodFence(String type, Block base, Supplier<FenceBlock> stripped) {
        return register(type + "_wood_fence", strippableFence(base, stripped), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<FenceGateBlock> woodFenceGate(String type, Block base) {
        return register(type + "_wood_fence_gate", fenceGate(CopyProperties(base), WoodTypeOf(type)), 300, DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<StrippableFenceGateBlock> woodFenceGate(WoodType type, Block base, Supplier<FenceGateBlock> stripped) {
        return register(type.name() + "_wood_fence_gate", strippableFenceGate(base, type, stripped), 300, DEFAULT_ITEM_PROPERTIES);
    }

    private static RegistryObject<StairBlock> regGlazedTerracottaStairs(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_stairs", ()-> new StairBlock(parent::defaultBlockState, CopyProperties(parent)){
            @Override
            public @NotNull PushReaction getPistonPushReaction(@NotNull BlockState blockState) {return PushReaction.PUSH_ONLY;}
        }, DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<SlabBlock> regGlazedTerracottaSlab(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_slab", ()-> new SlabBlock(CopyProperties(parent)){
            @Override
            public @NotNull PushReaction getPistonPushReaction(@NotNull BlockState blockState) {return PushReaction.PUSH_ONLY;}
        }, DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<WallBlock> regGlazedTerracottaWall(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_wall", ()-> new WallBlock(CopyProperties(parent)){
            @Override
            public @NotNull PushReaction getPistonPushReaction(@NotNull BlockState blockState) {return PushReaction.PUSH_ONLY;}
        }, DEFAULT_ITEM_PROPERTIES);
    }

    private static RegistryObject<StairBlock> regWoolStairs(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_stairs", stair(parent), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<SlabBlock> regWoolSlab(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_slab", slab(parent), DEFAULT_ITEM_PROPERTIES);
    }
    private static RegistryObject<WallBlock> regWoolWall(DyeColor color){
        var parent = GetVanillaBlock(color.getName() + "_wool");
        return register(color.getName() + "_wool_wall", wall(parent), DEFAULT_ITEM_PROPERTIES);
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
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation("key"));
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