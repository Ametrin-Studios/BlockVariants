package com.barion.block_variants;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;

public class BVBlocks {

    public static final RegistryObject<WallBlock> Polished_Granite_Wall = register("polished_granite_wall", () ->
            WallProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<WallBlock> Polished_Diorite_Wall = register("polished_diorite_wall", () ->
            WallProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<WallBlock> Polished_Andesite_Wall = register("polished_andesite_wall", () ->
            WallProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<WallBlock> Stone_Wall = register("stone_wall", () ->
            WallProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<StairBlock> Smooth_Stone_Stairs = register("smooth_stone_stairs", () ->
            StairProperties(Material.STONE, 2, 6, SoundType.STONE, true, Blocks.SMOOTH_STONE),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Smooth_Stone_Wall = register("smooth_stone_wall", () ->
            WallProperties(Material.STONE, 2F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> Cut_Sandstone_Stairs = register("cut_sandstone_stairs", () ->
            StairProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Cut_Sandstone_Wall = register("cut_sandstone_wall", () ->
            WallProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<StairBlock> Cut_Red_Sandstone_Stairs = register("cut_red_sandstone_stairs", () ->
            StairProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Cut_Red_Sandstone_Wall = register("cut_red_sandstone_wall", () ->
            WallProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<WallBlock> Quartz_Wall = register("quartz_wall", ()->
            WallProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<StairBlock> Quartz_Bricks_Stairs = register("quartz_bricks_stairs", ()->
            StairProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.QUARTZ_BRICKS),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Quartz_Bricks_Slab = register("quartz_bricks_slab", ()->
            SlabProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Quartz_Bricks_Wall = register("quartz_bricks_wall", ()->
            WallProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<WallBlock> Smooth_Quartz_Wall = register("smooth_quartz_wall", ()->
            WallProperties(Material.STONE, 2, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<StairBlock> Chiseled_Quartz_Block_Stairs = register("chiseled_quartz_block_stairs", ()->
            StairProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CHISELED_QUARTZ_BLOCK),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Chiseled_Quartz_Block_Slab = register("chiseled_quartz_block_slab", ()->
            SlabProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Chiseled_Quartz_Block_Wall = register("chiseled_quartz_block_wall", ()->
            WallProperties(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<WallBlock> Prismarine_Bricks_Wall = register("prismarine_bricks_wall", ()->
            WallProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<WallBlock> Dark_Prismarine_Wall = register("dark_prismarine_wall", ()->
            WallProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> Netherrack_Stairs = register("netherrack_stairs", ()->
            StairProperties(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true, Blocks.NETHERRACK),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Netherrack_Slab = register("netherrack_slab", ()->
            SlabProperties(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Netherrack_Wall = register("netherrack_wall", ()->
            WallProperties(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> End_Stone_Stairs = register("end_stone_stairs", ()->
            StairProperties(Material.STONE, 3, 9, SoundType.STONE, true, Blocks.END_STONE),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> End_Stone_Slab = register("end_stone_slab", ()->
            SlabProperties(Material.STONE, 3, 9, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> End_Stone_Wall = register("end_stone_wall", ()->
            WallProperties(Material.STONE, 3, 9, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> Cracked_Polished_Blackstone_Brick_Stairs = register("cracked_polished_blackstone_brick_stairs", ()->
            StairProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Cracked_Polished_Blackstone_Brick_Slab = register("cracked_polished_blackstone_brick_slab", ()->
            SlabProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Cracked_Polished_Blackstone_Brick_Wall = register("cracked_polished_blackstone_brick_wall", ()->
            WallProperties(Material.STONE, 1.5F, 6, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> Basalt_Stairs = register("basalt_stairs", ()->
            StairProperties(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.BASALT),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Basalt_Slab = register("basalt_slab", ()->
            SlabProperties(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Basalt_Wall = register("basalt_wall", ()->
            WallProperties(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> Polished_Basalt_Stairs = register("polished_basalt_stairs", ()->
            StairProperties(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.POLISHED_BASALT),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Polished_Basalt_Slab = register("polished_basalt_slab", ()->
            SlabProperties(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Polished_Basalt_Wall = register("polished_basalt_wall", ()->
            WallProperties(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> Terracotta_Stairs = register("terracotta_stairs", () ->
            StairProperties(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true, Blocks.TERRACOTTA),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Terracotta_Slab = register("terracotta_slab", () ->
                    SlabProperties(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Terracotta_Wall = register("terracotta_wall", () ->
                    WallProperties(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> White_Terracotta_Stairs = regTerracottaStairs("white", Blocks.WHITE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> White_Terracotta_Slab = regTerracottaSlab("white");
    public static final RegistryObject<WallBlock> White_Terracotta_Wall = regTerracottaWall("white");

    public static final RegistryObject<StairBlock> Orange_Terracotta_Stairs = regTerracottaStairs("orange", Blocks.ORANGE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Orange_Terracotta_Slab = regTerracottaSlab("orange");
    public static final RegistryObject<WallBlock> Orange_Terracotta_Wall = regTerracottaWall("orange");

    public static final RegistryObject<StairBlock> Magenta_Terracotta_Stairs = regTerracottaStairs("magenta", Blocks.MAGENTA_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Magenta_Terracotta_Slab = regTerracottaSlab("magenta");
    public static final RegistryObject<WallBlock> Magenta_Terracotta_Wall = regTerracottaWall("magenta");

    public static final RegistryObject<StairBlock> Light_Blue_Terracotta_Stairs = regTerracottaStairs("light_blue", Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Light_Blue_Terracotta_Slab = regTerracottaSlab("light_blue");
    public static final RegistryObject<WallBlock> Light_Blue_Terracotta_Wall = regTerracottaWall("light_blue");

    public static final RegistryObject<StairBlock> Yellow_Terracotta_Stairs = regTerracottaStairs("yellow", Blocks.YELLOW_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Yellow_Terracotta_Slab = regTerracottaSlab("yellow");
    public static final RegistryObject<WallBlock> Yellow_Terracotta_Wall = regTerracottaWall("yellow");

    public static final RegistryObject<StairBlock> Lime_Terracotta_Stairs = regTerracottaStairs("lime", Blocks.LIME_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Lime_Terracotta_Slab = regTerracottaSlab("lime");
    public static final RegistryObject<WallBlock> Lime_Terracotta_Wall = regTerracottaWall("lime");

    public static final RegistryObject<StairBlock> Pink_Terracotta_Stairs = regTerracottaStairs("pink", Blocks.PINK_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Pink_Terracotta_Slab = regTerracottaSlab("pink");
    public static final RegistryObject<WallBlock> Pink_Terracotta_Wall = regTerracottaWall("pink");

    public static final RegistryObject<StairBlock> Gray_Terracotta_Stairs = regTerracottaStairs("gray", Blocks.GRAY_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Gray_Terracotta_Slab = regTerracottaSlab("gray");
    public static final RegistryObject<WallBlock> Gray_Terracotta_Wall = regTerracottaWall("gray");

    public static final RegistryObject<StairBlock> Light_Gray_Terracotta_Stairs = regTerracottaStairs("light_gray", Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Light_Gray_Terracotta_Slab = regTerracottaSlab("light_gray");
    public static final RegistryObject<WallBlock> Light_Gray_Terracotta_Wall = regTerracottaWall("light_gray");

    public static final RegistryObject<StairBlock> Cyan_Terracotta_Stairs = regTerracottaStairs("cyan", Blocks.CYAN_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Cyan_Terracotta_Slab = regTerracottaSlab("cyan");
    public static final RegistryObject<WallBlock> Cyan_Terracotta_Wall = regTerracottaWall("cyan");

    public static final RegistryObject<StairBlock> Purple_Terracotta_Stairs = regTerracottaStairs("purple", Blocks.PURPLE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Purple_Terracotta_Slab = regTerracottaSlab("purple");
    public static final RegistryObject<WallBlock> Purple_Terracotta_Wall = regTerracottaWall("purple");

    public static final RegistryObject<StairBlock> Blue_Terracotta_Stairs = regTerracottaStairs("blue", Blocks.BLUE_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Blue_Terracotta_Slab = regTerracottaSlab("blue");
    public static final RegistryObject<WallBlock> Blue_Terracotta_Wall = regTerracottaWall("blue");

    public static final RegistryObject<StairBlock> Brown_Terracotta_Stairs = regTerracottaStairs("brown", Blocks.BROWN_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Brown_Terracotta_Slab = regTerracottaSlab("brown");
    public static final RegistryObject<WallBlock> Brown_Terracotta_Wall = regTerracottaWall("brown");

    public static final RegistryObject<StairBlock> Green_Terracotta_Stairs = regTerracottaStairs("green", Blocks.GREEN_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Green_Terracotta_Slab = regTerracottaSlab("green");
    public static final RegistryObject<WallBlock> Green_Terracotta_Wall = regTerracottaWall("green");

    public static final RegistryObject<StairBlock> Red_Terracotta_Stairs = regTerracottaStairs("red", Blocks.RED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Red_Terracotta_Slab = regTerracottaSlab("red");
    public static final RegistryObject<WallBlock> Red_Terracotta_Wall = regTerracottaWall("red");

    public static final RegistryObject<StairBlock> Black_Terracotta_Stairs = regTerracottaStairs("black", Blocks.BLACK_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Black_Terracotta_Slab = regTerracottaSlab("black");
    public static final RegistryObject<WallBlock> Black_Terracotta_Wall = regTerracottaWall("black");

    public static final RegistryObject<StairBlock> Dripstone_Block_Stairs = register("dripstone_block_stairs", () ->
                    StairProperties(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true, Blocks.DRIPSTONE_BLOCK),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Dripstone_Block_Slab = register("dripstone_block_slab", () ->
                    SlabProperties(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Dripstone_Block_Wall = register("dripstone_block_wall", () ->
                    WallProperties(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final RegistryObject<StairBlock> Amethyst_Block_Stairs = register("amethyst_block_stairs", () ->
                    StairProperties(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true, Blocks.DRIPSTONE_BLOCK),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Amethyst_Block_Slab = register("amethyst_block_slab", () ->
                    SlabProperties(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Amethyst_Block_Wall = register("amethyst_block_wall", () ->
                    WallProperties(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    // new

    public static final RegistryObject<StairBlock> Cracked_Stone_Brick_Stairs = register("cracked_stone_brick_stairs", () ->
                    StairProperties(Material.STONE, 1.5F, 6F, SoundType.STONE, true, Blocks.CRACKED_STONE_BRICKS),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Cracked_Stone_Brick_Slab = register("cracked_stone_brick_slab", () ->
                    SlabProperties(Material.STONE, 1.5F, 6F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<WallBlock> Cracked_Stone_Brick_Wall = register("cracked_stone_brick_wall", () ->
                    WallProperties(Material.STONE, 1.5F, 6F, SoundType.STONE, true),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<StairBlock> Oak_Log_Stairs = regLogStairs("oak", Blocks.OAK_LOG);
    public static final RegistryObject<SlabBlock> Oak_Log_Slab = regLogSlab("oak");
    public static final RegistryObject<StairBlock> Spruce_Log_Stairs = regLogStairs("spruce", Blocks.SPRUCE_LOG);
    public static final RegistryObject<SlabBlock> Spruce_Log_Slab = regLogSlab("spruce");
    public static final RegistryObject<StairBlock> Birch_Log_Stairs = regLogStairs("birch", Blocks.BIRCH_LOG);
    public static final RegistryObject<SlabBlock> Birch_Log_Slab = regLogSlab("birch");
    public static final RegistryObject<StairBlock> Jungle_Log_Stairs = regLogStairs("jungle", Blocks.JUNGLE_LOG);
    public static final RegistryObject<SlabBlock> Jungle_Log_Slab = regLogSlab("jungle");
    public static final RegistryObject<StairBlock> Acacia_Log_Stairs = regLogStairs("acacia", Blocks.ACACIA_LOG);
    public static final RegistryObject<SlabBlock> Acacia_Log_Slab = regLogSlab("acacia");
    public static final RegistryObject<StairBlock> Dark_Oak_Log_Stairs = regLogStairs("dark_oak", Blocks.DARK_OAK_LOG);
    public static final RegistryObject<SlabBlock> Dark_Oak_Log_Slab = regLogSlab("dark_oak");

    public static final RegistryObject<StairBlock> Stripped_Oak_Log_Stairs = regLogStairs("stripped_oak", Blocks.STRIPPED_OAK_LOG);
    public static final RegistryObject<SlabBlock> Stripped_Oak_Log_Slab = regLogSlab("stripped_oak");
    public static final RegistryObject<StairBlock> Stripped_Spruce_Log_Stairs = regLogStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_LOG);
    public static final RegistryObject<SlabBlock> Stripped_Spruce_Log_Slab = regLogSlab("stripped_spruce");
    public static final RegistryObject<StairBlock> Stripped_Birch_Log_Stairs = regLogStairs("stripped_birch", Blocks.STRIPPED_BIRCH_LOG);
    public static final RegistryObject<SlabBlock> Stripped_Birch_Log_Slab = regLogSlab("stripped_birch");
    public static final RegistryObject<StairBlock> Stripped_Jungle_Log_Stairs = regLogStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_LOG);
    public static final RegistryObject<SlabBlock> Stripped_Jungle_Log_Slab = regLogSlab("stripped_jungle");
    public static final RegistryObject<StairBlock> Stripped_Acacia_Log_Stairs = regLogStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_LOG);
    public static final RegistryObject<SlabBlock> Stripped_Acacia_Log_Slab = regLogSlab("stripped_acacia");
    public static final RegistryObject<StairBlock> Stripped_Dark_Oak_Log_Stairs = regLogStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_LOG);
    public static final RegistryObject<SlabBlock> Stripped_Dark_Oak_Log_Slab = regLogSlab("stripped_dark_oak");

    public static final RegistryObject<StairBlock> Crimson_Stem_Stairs = register("crimson_stem_stairs", () ->
                    StairProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.CRIMSON_STEM),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Crimson_Stem_Slab = register("crimson_stem_slab", () ->
                    SlabProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<StairBlock> Warped_Stem_Stairs = register("warped_stem_stairs", () ->
                    StairProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.WARPED_STEM),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Warped_Stem_Slab = register("warped_stem_slab", () ->
                    SlabProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<StairBlock> Stripped_Crimson_Stem_Stairs = register("stripped_crimson_stem_stairs", () ->
                    StairProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.STRIPPED_CRIMSON_STEM),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Stripped_Crimson_Stem_Slab = register("stripped_crimson_stem_slab", () ->
                    SlabProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<StairBlock> Stripped_Warped_Stem_Stairs = register("stripped_warped_stem_stairs", () ->
                    StairProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.STRIPPED_WARPED_STEM),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final RegistryObject<SlabBlock> Stripped_Warped_Stem_Slab = register("stripped_warped_stem_slab", () ->
                    SlabProperties(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));


    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, Item.Properties ItemProperties){
        RegistryObject<T> ret = register(name, block);
        BVRegister.Items.register(name, ()-> new BlockItem(ret.get(), ItemProperties));
        return ret;
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        return BVRegister.Blocks.register(name, block);
    }

    private static Block BlockProperties(Material material, float hardness, float resistance, SoundType soundType){
        return new Block(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }
    private static StairBlock StairProperties(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool, Block block){
        if(requiresTool)
            return new StairBlock(() -> block.defaultBlockState(), BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return new StairBlock(() -> block.defaultBlockState(), BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }
    private static SlabBlock SlabProperties(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return new SlabBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return new SlabBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }
    private static WallBlock WallProperties(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return new WallBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return new WallBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }

    private static RegistryObject<StairBlock> regTerracottaStairs(String color, Block base){
        return register(color + "_terracotta_stairs", () ->
                StairProperties(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true, base),
                new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }
    private static RegistryObject<SlabBlock> regTerracottaSlab(String color){
        return register(color + "_terracotta_slab", () ->
                SlabProperties(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true),
                new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }
    private static RegistryObject<WallBlock> regTerracottaWall(String color){
        return register(color + "_terracotta_wall", () ->
                WallProperties(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true),
                new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    }

    private static RegistryObject<StairBlock> regLogStairs(String type, Block base){
        return register(type + "_log_stairs", () ->
                StairProperties(Material.WOOD, 2F, 5F, SoundType.WOOD, false, base),
                new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }
    private static RegistryObject<SlabBlock> regLogSlab(String type){
        return register(type + "_log_slab", () ->
                SlabProperties(Material.WOOD, 2F, 5F, SoundType.WOOD, false),
                new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }

    public static void register() {}
}