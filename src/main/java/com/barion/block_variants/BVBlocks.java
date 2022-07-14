package com.barion.block_variants;

import com.barion.block_variants.block.StrippableSlabBlock;
import com.barion.block_variants.block.StrippableStairBlock;
import com.barion.block_variants.block.StrippableWallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BVBlocks {
    public static final DeferredRegister<Block> BlockRegistry = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockVariants.ModID);
    public static final DeferredRegister<Item> ItemRegistry = DeferredRegister.create(ForgeRegistries.ITEMS, BlockVariants.ModID);

    private static final Item.Properties BuildingBlocks = new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS);
    private static final Item.Properties DecorationBlocks = new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS);


    public static final RegistryObject<WallBlock> Polished_Granite_Wall = register("polished_granite_wall",
            wall(Blocks.POLISHED_GRANITE), DecorationBlocks);
    public static final RegistryObject<WallBlock> Polished_Diorite_Wall = register("polished_diorite_wall",
            wall(Blocks.POLISHED_DIORITE), DecorationBlocks);
    public static final RegistryObject<WallBlock> Polished_Andesite_Wall = register("polished_andesite_wall",
            wall(Blocks.POLISHED_ANDESITE), DecorationBlocks);

    public static final RegistryObject<WallBlock> Stone_Wall = register("stone_wall",
            wall(Material.STONE, 1.5F, 6, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Smooth_Stone_Stairs = register("smooth_stone_stairs",
            stair(Blocks.SMOOTH_STONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> Smooth_Stone_Wall = register("smooth_stone_wall",
            wall(Material.STONE, 2F, 6, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> Cut_Sandstone_Stairs = register("cut_sandstone_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> Cut_Sandstone_Wall = register("cut_sandstone_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Cut_Red_Sandstone_Stairs = register("cut_red_sandstone_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> Cut_Red_Sandstone_Wall = register("cut_red_sandstone_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<WallBlock> Quartz_Wall = register("quartz_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Quartz_Bricks_Stairs = register("quartz_bricks_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.QUARTZ_BRICKS), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Quartz_Bricks_Slab = register("quartz_bricks_slab",
            slab(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Quartz_Bricks_Wall = register("quartz_bricks_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<WallBlock> Smooth_Quartz_Wall = register("smooth_quartz_wall",
            wall(Material.STONE, 2, 6, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Chiseled_Quartz_Block_Stairs = register("chiseled_quartz_block_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CHISELED_QUARTZ_BLOCK), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Chiseled_Quartz_Block_Slab = register("chiseled_quartz_block_slab",
            slab(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Chiseled_Quartz_Block_Wall = register("chiseled_quartz_block_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<WallBlock> Prismarine_Bricks_Wall = register("prismarine_bricks_wall",
            wall(Material.STONE, 1.5F, 6, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<WallBlock> Dark_Prismarine_Wall = register("dark_prismarine_wall",
            wall(Material.STONE, 1.5F, 6, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> Netherrack_Stairs = register("netherrack_stairs",
            stair(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true, Blocks.NETHERRACK), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Netherrack_Slab = register("netherrack_slab",
            slab(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Netherrack_Wall = register("netherrack_wall",
            wall(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> End_Stone_Stairs = register("end_stone_stairs",
            stair(Blocks.END_STONE), BuildingBlocks);
    public static final RegistryObject<SlabBlock> End_Stone_Slab = register("end_stone_slab",
            slab(Blocks.END_STONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> End_Stone_Wall = register("end_stone_wall",
            wall(Blocks.END_STONE), DecorationBlocks);
    public static final RegistryObject<WallBlock> Purpur_Wall = register("purpur_wall",
            wall(Blocks.PURPUR_BLOCK), DecorationBlocks);

    public static final RegistryObject<StairBlock> Cracked_Polished_Blackstone_Brick_Stairs = register("cracked_polished_blackstone_brick_stairs",
            stair(Material.STONE, 1.5F, 6, SoundType.STONE, true, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Cracked_Polished_Blackstone_Brick_Slab = register("cracked_polished_blackstone_brick_slab",
            slab(Material.STONE, 1.5F, 6, SoundType.STONE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Cracked_Polished_Blackstone_Brick_Wall = register("cracked_polished_blackstone_brick_wall",
            wall(Material.STONE, 1.5F, 6, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> Basalt_Stairs = register("basalt_stairs",
            stair(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.BASALT), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Basalt_Slab = register("basalt_slab",
            slab(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Basalt_Wall = register("basalt_wall",
            wall(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> Polished_Basalt_Stairs = register("polished_basalt_stairs",
            stair(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.POLISHED_BASALT), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Polished_Basalt_Slab = register("polished_basalt_slab",
            slab(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Polished_Basalt_Wall = register("polished_basalt_wall",
            wall(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> Terracotta_Stairs = register("terracotta_stairs",
            stair(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true, Blocks.TERRACOTTA), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Terracotta_Slab = register("terracotta_slab",
                    slab(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Terracotta_Wall = register("terracotta_wall",
                    wall(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true), DecorationBlocks);

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

    public static final RegistryObject<StairBlock> Dripstone_Block_Stairs = register("dripstone_block_stairs",
                    stair(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true, Blocks.DRIPSTONE_BLOCK), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Dripstone_Block_Slab = register("dripstone_block_slab",
                    slab(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Dripstone_Block_Wall = register("dripstone_block_wall",
                    wall(Material.STONE, 1.5F, 1F, SoundType.DRIPSTONE_BLOCK, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Amethyst_Block_Stairs = register("amethyst_block_stairs",
                    stair(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true, Blocks.DRIPSTONE_BLOCK), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Amethyst_Block_Slab = register("amethyst_block_slab",
                    slab(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Amethyst_Block_Wall = register("amethyst_block_wall",
                    wall(Material.AMETHYST, 1.5F, 1.5F, SoundType.AMETHYST, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> Cracked_Stone_Brick_Stairs = register("cracked_stone_brick_stairs",
                    stair(Material.STONE, 1.5F, 6F, SoundType.STONE, true, Blocks.CRACKED_STONE_BRICKS), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Cracked_Stone_Brick_Slab = register("cracked_stone_brick_slab",
                    slab(Material.STONE, 1.5F, 6F, SoundType.STONE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Cracked_Stone_Brick_Wall = register("cracked_stone_brick_wall",
                    wall(Material.STONE, 1.5F, 6F, SoundType.STONE, true), DecorationBlocks);

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

    public static final RegistryObject<StairBlock> Stripped_Crimson_Stem_Stairs = register("stripped_crimson_stem_stairs",
            stair(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.STRIPPED_CRIMSON_STEM), BuildingBlocks.fireResistant());
    public static final RegistryObject<SlabBlock> Stripped_Crimson_Stem_Slab = register("stripped_crimson_stem_slab",
            slab(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false), BuildingBlocks.fireResistant());
    public static final RegistryObject<StairBlock> Stripped_Warped_Stem_Stairs = register("stripped_warped_stem_stairs",
            stair(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false, Blocks.STRIPPED_WARPED_STEM), BuildingBlocks.fireResistant());
    public static final RegistryObject<SlabBlock> Stripped_Warped_Stem_Slab = register("stripped_warped_stem_slab",
            slab(Material.NETHER_WOOD, 2F, 5F, SoundType.STEM, false), BuildingBlocks.fireResistant());

    public static final RegistryObject<StrippableStairBlock> Crimson_Stem_Stairs = register("crimson_stem_stairs",
                    stair(Blocks.CRIMSON_STEM, Stripped_Crimson_Stem_Stairs), BuildingBlocks.fireResistant());
    public static final RegistryObject<StrippableSlabBlock> Crimson_Stem_Slab = register("crimson_stem_slab",
                    slab(Blocks.CRIMSON_STEM, Stripped_Crimson_Stem_Slab), BuildingBlocks.fireResistant());
    public static final RegistryObject<StrippableStairBlock> Warped_Stem_Stairs = register("warped_stem_stairs",
                    stair(Blocks.WARPED_STEM, Stripped_Warped_Stem_Stairs), BuildingBlocks.fireResistant());
    public static final RegistryObject<StrippableSlabBlock> Warped_Stem_Slab = register("warped_stem_slab",
                    slab(Blocks.WARPED_STEM, Stripped_Warped_Stem_Slab), BuildingBlocks.fireResistant());

    public static final RegistryObject<StairBlock> Stripped_Oak_Wood_Stairs = woodStairs("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Oak_Wood_Slab = woodSlab("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Oak_Wood_Wall = woodWall("stripped_oak", Blocks.STRIPPED_OAK_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Spruce_Wood_Stairs = woodStairs("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Spruce_Wood_Slab = woodSlab("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Spruce_Wood_Wall = woodWall("stripped_spruce", Blocks.STRIPPED_SPRUCE_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Birch_Wood_Stairs = woodStairs("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Birch_Wood_Slab = woodSlab("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Birch_Wood_Wall = woodWall("stripped_birch", Blocks.STRIPPED_BIRCH_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Jungle_Wood_Stairs = woodStairs("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Jungle_Wood_Slab = woodSlab("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Jungle_Wood_Wall = woodWall("stripped_jungle", Blocks.STRIPPED_JUNGLE_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Acacia_Wood_Stairs = woodStairs("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Acacia_Wood_Slab = woodSlab("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Acacia_Wood_Wall = woodWall("stripped_acacia", Blocks.STRIPPED_ACACIA_WOOD);
    public static final RegistryObject<StairBlock> Stripped_Dark_Oak_Wood_Stairs = woodStairs("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<SlabBlock> Stripped_Dark_Oak_Wood_Slab = woodSlab("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);
    public static final RegistryObject<WallBlock> Stripped_Dark_Oak_Wood_Wall = woodWall("stripped_dark_oak", Blocks.STRIPPED_DARK_OAK_WOOD);

    public static final RegistryObject<StrippableStairBlock> Oak_Wood_Stairs = woodStairs("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Oak_Wood_Slab = woodSlab("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Oak_Wood_Wall = woodWall("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_Wall);
    public static final RegistryObject<StrippableStairBlock> Spruce_Wood_Stairs = woodStairs("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Spruce_Wood_Slab = woodSlab("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Spruce_Wood_Wall = woodWall("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Wall);
    public static final RegistryObject<StrippableStairBlock> Birch_Wood_Stairs = woodStairs("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Birch_Wood_Slab = woodSlab("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Birch_Wood_Wall = woodWall("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Wall);
    public static final RegistryObject<StrippableStairBlock> Jungle_Wood_Stairs = woodStairs("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Jungle_Wood_Slab = woodSlab("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Jungle_Wood_Wall = woodWall("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Wall);
    public static final RegistryObject<StrippableStairBlock> Acacia_Wood_Stairs = woodStairs("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Acacia_Wood_Slab = woodSlab("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Acacia_Wood_Wall = woodWall("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Wall);
    public static final RegistryObject<StrippableStairBlock> Dark_Oak_Wood_Stairs = woodStairs("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Dark_Oak_Wood_Slab = woodSlab("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Dark_Oak_Wood_Wall = woodWall("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Wall);

    public static final RegistryObject<StairBlock> Stripped_Crimson_Hyphae_Stairs = register("stripped_crimson_hyphae_stairs",
            stair(Blocks.STRIPPED_CRIMSON_HYPHAE), BuildingBlocks.fireResistant());
    public static final RegistryObject<SlabBlock> Stripped_Crimson_Hyphae_Slab = register("stripped_crimson_hyphae_slab",
            slab(Blocks.STRIPPED_CRIMSON_HYPHAE), BuildingBlocks.fireResistant());
    public static final RegistryObject<WallBlock> Stripped_Crimson_Hyphae_Wall = register("stripped_crimson_hyphae_wall",
            wall(Blocks.STRIPPED_CRIMSON_HYPHAE), DecorationBlocks.fireResistant());
    public static final RegistryObject<StairBlock> Stripped_Warped_Hyphae_Stairs = register("stripped_warped_hyphae_stairs",
            stair(Blocks.STRIPPED_WARPED_HYPHAE), BuildingBlocks.fireResistant());
    public static final RegistryObject<SlabBlock> Stripped_Warped_Hyphae_Slab = register("stripped_warped_hyphae_slab",
            slab(Blocks.STRIPPED_WARPED_HYPHAE), BuildingBlocks.fireResistant());
    public static final RegistryObject<WallBlock> Stripped_Warped_Hyphae_Wall = register("stripped_warped_hyphae_wall",
            wall(Blocks.STRIPPED_WARPED_HYPHAE), DecorationBlocks.fireResistant());

    public static final RegistryObject<StrippableStairBlock> Crimson_Hyphae_Stairs = register("crimson_hyphae_stairs",
            stair(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Stairs), BuildingBlocks.fireResistant());
    public static final RegistryObject<StrippableSlabBlock> Crimson_Hyphae_Slab = register("crimson_hyphae_slab",
            slab(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Slab), BuildingBlocks.fireResistant());
    public static final RegistryObject<StrippableWallBlock> Crimson_Hyphae_Wall = register("crimson_hyphae_wall",
            wall(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Wall), DecorationBlocks.fireResistant());
    public static final RegistryObject<StrippableStairBlock> Warped_Hyphae_Stairs = register("warped_hyphae_stairs",
            stair(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Stairs), BuildingBlocks.fireResistant());
    public static final RegistryObject<StrippableSlabBlock> Warped_Hyphae_Slab = register("warped_hyphae_slab",
            slab(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Slab), BuildingBlocks.fireResistant());
    public static final RegistryObject<StrippableWallBlock> Warped_Hyphae_Wall = register("warped_hyphae_wall",
            wall(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Wall), DecorationBlocks.fireResistant());

    public static final RegistryObject<StairBlock> Calcite_Stairs = register("calcite_stairs",
            stair(Material.STONE, 0.75F, 0.75F, SoundType.CALCITE, true, Blocks.CALCITE), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Calcite_Slab = register("calcite_slab",
            slab(Material.STONE, 0.75F, 0.75F, SoundType.CALCITE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Calcite_Wall = register("calcite_wall",
            wall(Material.STONE, 0.75F, 0.75F, SoundType.CALCITE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Smooth_Basalt_Stairs = register("smooth_basalt_stairs",
            stair(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true, Blocks.SMOOTH_BASALT), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Smooth_Basalt_Slab = register("smooth_basalt_slab",
            slab(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Smooth_Basalt_Wall = register("smooth_basalt_wall",
            wall(Material.STONE, 1.25F, 4.2F, SoundType.BASALT, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Tuff_Stairs = register("tuff_stairs",
            stair(Material.STONE, 1.5F, 6F, SoundType.TUFF, true, Blocks.TUFF), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Tuff_Slab = register("tuff_slab",
            slab(Material.STONE, 1.5F, 6F, SoundType.TUFF, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Tuff_Wall = register("tuff_wall",
            wall(Material.STONE, 1.5F, 6F, SoundType.TUFF, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> Deepslate_Stairs = register("deepslate_stairs",
            stair(Material.STONE, 3, 6, SoundType.DEEPSLATE, true, Blocks.DEEPSLATE), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Deepslate_Slab = register("deepslate_slab",
            slab(Material.STONE, 3, 6, SoundType.DEEPSLATE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Deepslate_Wall = register("deepslate_wall",
            wall(Material.STONE, 3, 6, SoundType.DEEPSLATE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Cracked_Deepslate_Brick_Stairs = register("cracked_deepslate_brick_stairs",
            stair(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_BRICKS, true, Blocks.CRACKED_DEEPSLATE_BRICKS), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Cracked_Deepslate_Brick_Slab = register("cracked_deepslate_brick_slab",
            slab(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_BRICKS, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Cracked_Deepslate_Brick_Wall = register("cracked_deepslate_brick_wall",
            wall(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_BRICKS, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> Cracked_Deepslate_Tile_Stairs = register("cracked_deepslate_tile_stairs",
            stair(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_TILES, true, Blocks.CRACKED_DEEPSLATE_TILES), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Cracked_Deepslate_Tile_Slab = register("cracked_deepslate_tile_slab",
            slab(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_TILES, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Cracked_Deepslate_Tile_Wall = register("cracked_deepslate_tile_wall",
            wall(Material.STONE, 3.5f, 6, SoundType.DEEPSLATE_TILES, true), DecorationBlocks);

    public static final RegistryObject<FenceGateBlock> Nether_Brick_Fence_Gate = register("nether_brick_fence_gate",
            fenceGate(Blocks.NETHER_BRICK_FENCE), DecorationBlocks);

    public static final RegistryObject<StairBlock> Cracked_Nether_Brick_Stairs = register("cracked_nether_brick_stairs",
            stair(Blocks.CRACKED_NETHER_BRICKS), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Cracked_Nether_Brick_Slab = register("cracked_nether_brick_slab",
            slab(Blocks.CRACKED_NETHER_BRICKS), BuildingBlocks);
    public static final RegistryObject<WallBlock> Cracked_Nether_Brick_Wall = register("cracked_nether_brick_wall",
            wall(Blocks.CRACKED_NETHER_BRICKS), DecorationBlocks);
    public static final RegistryObject<FenceBlock> Cracked_Nether_Brick_Fence = register("cracked_nether_brick_fence",
            fence(Blocks.CRACKED_NETHER_BRICKS), DecorationBlocks);
    public static final RegistryObject<FenceGateBlock> Cracked_Nether_Brick_Fence_Gate = register("cracked_nether_brick_fence_gate",
            fenceGate(Blocks.CRACKED_NETHER_BRICKS), DecorationBlocks);

    public static final RegistryObject<FenceBlock> Red_Nether_Brick_Fence = register("red_nether_brick_fence",
            fence(Blocks.RED_NETHER_BRICKS), DecorationBlocks);
    public static final RegistryObject<FenceGateBlock> Red_Nether_Brick_Fence_Gate = register("red_nether_brick_fence_gate",
            fenceGate(Blocks.RED_NETHER_BRICKS), DecorationBlocks);

    public static final RegistryObject<StairBlock> Obsidian_Stairs = register("obsidian_stairs",
            stair(Blocks.OBSIDIAN), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Obsidian_Slab = register("obsidian_slab",
            slab(Blocks.OBSIDIAN), BuildingBlocks);
    public static final RegistryObject<WallBlock> Obsidian_Wall = register("obsidian_wall",
            wall(Blocks.OBSIDIAN), DecorationBlocks);

    public static final RegistryObject<StairBlock> Crying_Obsidian_Stairs = register("crying_obsidian_stairs",
            stair(Blocks.CRYING_OBSIDIAN), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Crying_Obsidian_Slab = register("crying_obsidian_slab",
            slab(Blocks.CRYING_OBSIDIAN), BuildingBlocks);
    public static final RegistryObject<WallBlock> Crying_Obsidian_Wall = register("crying_obsidian_wall",
            wall(Blocks.CRYING_OBSIDIAN), DecorationBlocks);

    public static final RegistryObject<StairBlock> White_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("white", Blocks.WHITE_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> White_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("white", Blocks.WHITE_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> White_Glazed_Terracotta_Wall = regGlazedTerracottaWall("white", Blocks.WHITE_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Orange_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("orange", Blocks.ORANGE_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Orange_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("orange", Blocks.ORANGE_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Orange_Glazed_Terracotta_Wall = regGlazedTerracottaWall("orange", Blocks.ORANGE_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Magenta_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("magenta", Blocks.MAGENTA_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Magenta_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("magenta", Blocks.MAGENTA_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Magenta_Glazed_Terracotta_Wall = regGlazedTerracottaWall("magenta", Blocks.MAGENTA_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Light_Blue_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("light_blue", Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Light_Blue_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("light_blue", Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Light_Blue_Glazed_Terracotta_Wall = regGlazedTerracottaWall("light_blue", Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Yellow_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("yellow", Blocks.YELLOW_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Yellow_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("yellow", Blocks.YELLOW_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Yellow_Glazed_Terracotta_Wall = regGlazedTerracottaWall("yellow", Blocks.YELLOW_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Lime_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("lime", Blocks.LIME_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Lime_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("lime", Blocks.LIME_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Lime_Glazed_Terracotta_Wall = regGlazedTerracottaWall("lime", Blocks.LIME_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Pink_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("pink", Blocks.PINK_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Pink_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("pink", Blocks.PINK_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Pink_Glazed_Terracotta_Wall = regGlazedTerracottaWall("pink", Blocks.PINK_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Gray_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("gray", Blocks.GRAY_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Gray_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("gray", Blocks.GRAY_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Gray_Glazed_Terracotta_Wall = regGlazedTerracottaWall("gray", Blocks.GRAY_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Light_Gray_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("light_gray", Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Light_Gray_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("light_gray", Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Light_Gray_Glazed_Terracotta_Wall = regGlazedTerracottaWall("light_gray", Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Cyan_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("cyan", Blocks.CYAN_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Cyan_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("cyan", Blocks.CYAN_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Cyan_Glazed_Terracotta_Wall = regGlazedTerracottaWall("cyan", Blocks.CYAN_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Purple_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("purple", Blocks.PURPLE_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Purple_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("purple", Blocks.PURPLE_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Purple_Glazed_Terracotta_Wall = regGlazedTerracottaWall("purple", Blocks.PURPLE_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Blue_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("blue", Blocks.BLUE_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Blue_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("blue", Blocks.BLUE_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Blue_Glazed_Terracotta_Wall = regGlazedTerracottaWall("blue", Blocks.BLUE_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Brown_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("brown", Blocks.BROWN_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Brown_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("brown", Blocks.BROWN_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Brown_Glazed_Terracotta_Wall = regGlazedTerracottaWall("brown", Blocks.BROWN_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Green_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("green", Blocks.GREEN_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Green_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("green", Blocks.GREEN_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Green_Glazed_Terracotta_Wall = regGlazedTerracottaWall("green", Blocks.GREEN_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Red_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("red", Blocks.RED_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Red_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("red", Blocks.RED_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Red_Glazed_Terracotta_Wall = regGlazedTerracottaWall("red", Blocks.RED_GLAZED_TERRACOTTA);

    public static final RegistryObject<StairBlock> Black_Glazed_Terracotta_Stairs = regGlazedTerracottaStairs("black", Blocks.BLACK_GLAZED_TERRACOTTA);
    public static final RegistryObject<SlabBlock> Black_Glazed_Terracotta_Slab = regGlazedTerracottaSlab("black", Blocks.BLACK_GLAZED_TERRACOTTA);
    public static final RegistryObject<WallBlock> Black_Glazed_Terracotta_Wall = regGlazedTerracottaWall("black", Blocks.BLACK_GLAZED_TERRACOTTA);

    private static Supplier<Block> block(Block base) {return ()-> new Block(BlockBehaviour.Properties.copy(base));}

    private static Supplier<StairBlock> stair(Block base) {return ()-> new StairBlock(base::defaultBlockState, BlockBehaviour.Properties.copy(base));}
    private static Supplier<StrippableStairBlock> stair(Block base, Supplier<StairBlock> stripped) {return ()-> new StrippableStairBlock(base::defaultBlockState, stripped, StairBlock.Properties.copy(base));}
    private static Supplier<SlabBlock> slab(Block base) {return ()-> new SlabBlock(SlabBlock.Properties.copy(base));}
    private static Supplier<StrippableSlabBlock> slab(Block base, Supplier<SlabBlock> stripped) {return ()-> new StrippableSlabBlock(stripped, SlabBlock.Properties.copy(base));}
    private static Supplier<WallBlock> wall(Block base) {return ()-> new WallBlock(WallBlock.Properties.copy(base));}
    private static Supplier<StrippableWallBlock> wall(Block base, Supplier<WallBlock> stripped) {return ()-> new StrippableWallBlock(stripped, WallBlock.Properties.copy(base));}
    private static Supplier<FenceBlock> fence(Block base){
        return () -> new FenceBlock(FenceBlock.Properties.copy(base));
    }
    private static Supplier<FenceGateBlock> fenceGate(Block base){
        return ()-> new FenceGateBlock(FenceGateBlock.Properties.copy(base));
    }
    @Deprecated private static Supplier<StairBlock> stair(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool, Block block){
        if(requiresTool)
            return ()-> new StairBlock(block::defaultBlockState, BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return ()-> new StairBlock(block::defaultBlockState, BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }
    @Deprecated private static Supplier<SlabBlock> slab(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return ()-> new SlabBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return ()-> new SlabBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }
    @Deprecated private static Supplier<WallBlock> wall(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return ()-> new WallBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return ()-> new WallBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }
    @Deprecated private static Supplier<FenceBlock> fence(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return ()-> new FenceBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return ()-> new FenceBlock(BlockBehaviour.Properties.of(material).strength(hardness, resistance).sound(soundType));
    }

    private static RegistryObject<StairBlock> regTerracottaStairs(String color, Block base){
        return register(color + "_terracotta_stairs",
                stair(base), BuildingBlocks);
    }
    private static RegistryObject<SlabBlock> regTerracottaSlab(String color){
        return register(color + "_terracotta_slab",
                slab(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true), BuildingBlocks);
    }
    private static RegistryObject<WallBlock> regTerracottaWall(String color){
        return register(color + "_terracotta_wall",
                wall(Material.STONE, 1.25F, 4.2F, SoundType.STONE, true), DecorationBlocks);
    }

    private static RegistryObject<StrippableStairBlock> logStairs(String type, Block base, Supplier<StairBlock> stripped) {
        return register(type + "_log_stairs", stair(base, stripped), BuildingBlocks);
    }

    private static RegistryObject<StairBlock> logStairs(String type, Block base) {
        return register(type + "_log_stairs", stair(base), BuildingBlocks);
    }
    private static RegistryObject<SlabBlock> logSlab(String type, Block base) {
        return register(type + "_log_slab", slab(base), BuildingBlocks);
    }
    private static RegistryObject<StrippableSlabBlock> logSlab(String type, Block base, Supplier<SlabBlock> stripped) {
        return register(type + "_log_slab", slab(base, stripped), BuildingBlocks);
    }

    private static RegistryObject<StairBlock> woodStairs(String type, Block base) {
        return register(type + "_wood_stairs", stair(base), BuildingBlocks);
    }

    private static RegistryObject<StrippableStairBlock> woodStairs(String type, Block base, Supplier<StairBlock> stripped){
        return register(type + "_wood_stairs", stair(base, stripped), BuildingBlocks);
    }
    private static RegistryObject<SlabBlock> woodSlab(String type, Block base){
        return register(type + "_wood_slab", slab(base), BuildingBlocks);
    }
    private static RegistryObject<StrippableSlabBlock> woodSlab(String type, Block base, Supplier<SlabBlock> stripped){
        return register(type + "_wood_slab", slab(base, stripped), BuildingBlocks);
    }
    private static RegistryObject<WallBlock> woodWall(String type, Block base){
        return register(type + "_wood_wall", wall(base), 300, DecorationBlocks);
    }
    private static RegistryObject<StrippableWallBlock> woodWall(String type, Block base, Supplier<WallBlock> stripped) {
        return register(type + "_wood_wall", wall(base, stripped), 300, DecorationBlocks);
    }

    private static RegistryObject<StairBlock> regGlazedTerracottaStairs(String color, Block base){
        return register(color + "_glazed_terracotta_stairs", ()-> new StairBlock(base::defaultBlockState, BlockBehaviour.Properties.copy(base)){
            @Override
            public @NotNull PushReaction getPistonPushReaction(@NotNull BlockState blockState) {return PushReaction.PUSH_ONLY;}
        }, BuildingBlocks);
    }
    private static RegistryObject<SlabBlock> regGlazedTerracottaSlab(String color, Block base){
        return register(color + "_glazed_terracotta_slab", ()-> new SlabBlock(SlabBlock.Properties.copy(base)){
            @Override
            public @NotNull PushReaction getPistonPushReaction(@NotNull BlockState blockState) {return PushReaction.PUSH_ONLY;}
        }, BuildingBlocks);
    }
    private static RegistryObject<WallBlock> regGlazedTerracottaWall(String color, Block base){
        return register(color + "_glazed_terracotta_wall", ()-> new WallBlock(WallBlock.Properties.copy(base)){
            @Override
            public @NotNull PushReaction getPistonPushReaction(@NotNull BlockState blockState) {return PushReaction.PUSH_ONLY;}
        }, DecorationBlocks);
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, Item.Properties ItemProperties){
        RegistryObject<T> ret = registerWithoutItem(name, block);
        ItemRegistry.register(name, ()-> new BlockItem(ret.get(), ItemProperties));
        return ret;
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, int itemBurnTime, Item.Properties ItemProperties){
        RegistryObject<T> ret = registerWithoutItem(name, block);
        ItemRegistry.register(name, ()-> new BlockItem(ret.get(), ItemProperties){
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return itemBurnTime;}
        });
        return ret;
    }
    private static <T extends Block> RegistryObject<T> registerWithoutItem(String name, Supplier<T> block) {return BlockRegistry.register(name, block);}

    public static List<Block> getAllBlocks() {return BlockRegistry.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());}
}