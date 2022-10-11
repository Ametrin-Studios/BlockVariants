package com.barion.block_variants;

import com.barion.block_variants.block.*;
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

import java.util.Iterator;
import java.util.function.Supplier;

public class BVBlocks extends com.ametrinstudios.ametrin.world.BlockRegistry {
    public static final DeferredRegister<Block> BlockRegistry = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockVariants.ModID);
    public static final DeferredRegister<Item> ItemRegistry = DeferredRegister.create(ForgeRegistries.ITEMS, BlockVariants.ModID);

    private static final Item.Properties BuildingBlocks = new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS);
    private static final Item.Properties DecorationBlocks = new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS);
    private static final Item.Properties FireResistanceBuildingBlocks = new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).fireResistant();
    private static final Item.Properties FireResistanceDecorationBlocks = new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).fireResistant();


    public static final RegistryObject<WallBlock> PolishedGraniteWall = register("polished_granite_wall",
            wall(Blocks.POLISHED_GRANITE), DecorationBlocks);
    public static final RegistryObject<WallBlock> PolishedDioriteWall = register("polished_diorite_wall",
            wall(Blocks.POLISHED_DIORITE), DecorationBlocks);
    public static final RegistryObject<WallBlock> PolishedAndesiteWall = register("polished_andesite_wall",
            wall(Blocks.POLISHED_ANDESITE), DecorationBlocks);

    public static final RegistryObject<WallBlock> StoneWall = register("stone_wall",
            wall(Material.STONE, 1.5F, 6, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> SmoothStoneStairs = register("smooth_stone_stairs",
            stair(Blocks.SMOOTH_STONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> SmoothStoneWall = register("smooth_stone_wall",
            wall(Material.STONE, 2F, 6, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> CutSandstoneStairs = register("cut_sandstone_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> CutSandstoneWall = register("cut_sandstone_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> CutRedSandstoneStairs = register("cut_red_sandstone_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CUT_SANDSTONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> CutRedSandstoneWall = register("cut_red_sandstone_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<WallBlock> QuartzWall = register("quartz_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> QuartzBrickStairs = register("quartz_brick_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.QUARTZ_BRICKS), BuildingBlocks);
    public static final RegistryObject<SlabBlock> QuartzBrickSlab = register("quartz_brick_slab",
            slab(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> QuartzBrickWall = register("quartz_brick_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<WallBlock> SmoothQuartzWall = register("smooth_quartz_wall",
            wall(Material.STONE, 2, 6, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<StairBlock> ChiseledQuartzBlockStairs = register("chiseled_quartz_block_stairs",
            stair(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true, Blocks.CHISELED_QUARTZ_BLOCK), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Chiseled_Quartz_Block_Slab = register("chiseled_quartz_block_slab",
            slab(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Chiseled_Quartz_Block_Wall = register("chiseled_quartz_block_wall",
            wall(Material.STONE, 0.8F, 0.8F, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<WallBlock> Prismarine_Brick_Wall = register("prismarine_brick_wall",
            wall(Material.STONE, 1.5F, 6, SoundType.STONE, true), DecorationBlocks);
    public static final RegistryObject<WallBlock> Dark_Prismarine_Wall = register("dark_prismarine_wall",
            wall(Material.STONE, 1.5F, 6, SoundType.STONE, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> NetherrackStairs = register("netherrack_stairs",
            stair(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true, Blocks.NETHERRACK), BuildingBlocks);
    public static final RegistryObject<SlabBlock> Netherrack_Slab = register("netherrack_slab",
            slab(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true), BuildingBlocks);
    public static final RegistryObject<WallBlock> Netherrack_Wall = register("netherrack_wall",
            wall(Material.STONE, 0.4F, 0.4F, SoundType.NETHERRACK, true), DecorationBlocks);

    public static final RegistryObject<StairBlock> EndStoneStairs = register("end_stone_stairs",
            stair(Blocks.END_STONE), BuildingBlocks);
    public static final RegistryObject<SlabBlock> End_Stone_Slab = register("end_stone_slab",
            slab(Blocks.END_STONE), BuildingBlocks);
    public static final RegistryObject<WallBlock> End_Stone_Wall = register("end_stone_wall",
            wall(Blocks.END_STONE), DecorationBlocks);
    public static final RegistryObject<WallBlock> Purpur_Wall = register("purpur_wall",
            wall(Blocks.PURPUR_BLOCK), DecorationBlocks);

    public static final RegistryObject<StairBlock> CrackedPolishedBlackstoneBrickStairs = register("cracked_polished_blackstone_brick_stairs",
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
    public static final RegistryObject<StrippableFenceGateBlock> Oak_Wood_FenceGate = woodFenceGate("oak", Blocks.OAK_WOOD, Stripped_Oak_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Spruce_Wood_Stairs = woodStairs("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Spruce_Wood_Slab = woodSlab("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Spruce_Wood_Wall = woodWall("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Spruce_Wood_Fence = woodFence("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Spruce_Wood_FenceGate = woodFenceGate("spruce", Blocks.SPRUCE_WOOD, Stripped_Spruce_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Birch_Wood_Stairs = woodStairs("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Birch_Wood_Slab = woodSlab("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Birch_Wood_Wall = woodWall("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Birch_Wood_Fence = woodFence("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Birch_Wood_FenceGate = woodFenceGate("birch", Blocks.BIRCH_WOOD, Stripped_Birch_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Jungle_Wood_Stairs = woodStairs("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Jungle_Wood_Slab = woodSlab("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Jungle_Wood_Wall = woodWall("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Jungle_Wood_Fence = woodFence("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Jungle_Wood_FenceGate = woodFenceGate("jungle", Blocks.JUNGLE_WOOD, Stripped_Jungle_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Acacia_Wood_Stairs = woodStairs("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Acacia_Wood_Slab = woodSlab("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Acacia_Wood_Wall = woodWall("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Acacia_Wood_Fence = woodFence("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Acacia_Wood_FenceGate = woodFenceGate("acacia", Blocks.ACACIA_WOOD, Stripped_Acacia_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Dark_Oak_Wood_Stairs = woodStairs("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Dark_Oak_Wood_Slab = woodSlab("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Dark_Oak_Wood_Wall = woodWall("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Dark_Oak_Wood_Fence = woodFence("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Dark_Oak_Wood_FenceGate = woodFenceGate("dark_oak", Blocks.DARK_OAK_WOOD, Stripped_Dark_Oak_Wood_FenceGate);
    public static final RegistryObject<StrippableStairBlock> Mangrove_Wood_Stairs = woodStairs("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Stairs);
    public static final RegistryObject<StrippableSlabBlock> Mangrove_Wood_Slab = woodSlab("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Slab);
    public static final RegistryObject<StrippableWallBlock> Mangrove_Wood_Wall = woodWall("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Wall);
    public static final RegistryObject<StrippableFenceBlock> Mangrove_Wood_Fence = woodFence("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_Fence);
    public static final RegistryObject<StrippableFenceGateBlock> Mangrove_Wood_FenceGate = woodFenceGate("mangrove", Blocks.DARK_OAK_WOOD, Stripped_Mangrove_Wood_FenceGate);

    public static final RegistryObject<StairBlock> Stripped_Crimson_Hyphae_Stairs = register("stripped_crimson_hyphae_stairs", stair(Blocks.STRIPPED_CRIMSON_HYPHAE), FireResistanceBuildingBlocks);
    public static final RegistryObject<SlabBlock> Stripped_Crimson_Hyphae_Slab = register("stripped_crimson_hyphae_slab", slab(Blocks.STRIPPED_CRIMSON_HYPHAE), FireResistanceBuildingBlocks);
    public static final RegistryObject<WallBlock> Stripped_Crimson_Hyphae_Wall = register("stripped_crimson_hyphae_wall", wall(Blocks.STRIPPED_CRIMSON_HYPHAE), FireResistanceDecorationBlocks);
    public static final RegistryObject<FenceBlock> Stripped_Crimson_Hyphae_Fence = register("stripped_crimson_hyphae_fence", fence(Blocks.STRIPPED_CRIMSON_HYPHAE), FireResistanceDecorationBlocks);
    public static final RegistryObject<FenceGateBlock> Stripped_Crimson_Hyphae_FenceGate = register("stripped_crimson_hyphae_fence_gate", fenceGate(Blocks.STRIPPED_CRIMSON_HYPHAE), FireResistanceDecorationBlocks);
    public static final RegistryObject<StairBlock> Stripped_Warped_Hyphae_Stairs = register("stripped_warped_hyphae_stairs", stair(Blocks.STRIPPED_WARPED_HYPHAE), FireResistanceBuildingBlocks);
    public static final RegistryObject<SlabBlock> Stripped_Warped_Hyphae_Slab = register("stripped_warped_hyphae_slab", slab(Blocks.STRIPPED_WARPED_HYPHAE), FireResistanceBuildingBlocks);
    public static final RegistryObject<WallBlock> Stripped_Warped_Hyphae_Wall = register("stripped_warped_hyphae_wall", wall(Blocks.STRIPPED_WARPED_HYPHAE), FireResistanceDecorationBlocks);
    public static final RegistryObject<FenceBlock> Stripped_Warped_Hyphae_Fence = register("stripped_warped_hyphae_fence", fence(Blocks.STRIPPED_WARPED_HYPHAE), FireResistanceDecorationBlocks);
    public static final RegistryObject<FenceGateBlock> Stripped_Warped_Hyphae_FenceGate = register("stripped_warped_hyphae_fence_gate", fenceGate(Blocks.STRIPPED_WARPED_HYPHAE), FireResistanceDecorationBlocks);

    public static final RegistryObject<StrippableStairBlock> Crimson_Hyphae_Stairs = register("crimson_hyphae_stairs", stair(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Stairs), FireResistanceBuildingBlocks);
    public static final RegistryObject<StrippableSlabBlock> Crimson_Hyphae_Slab = register("crimson_hyphae_slab", slab(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Slab), FireResistanceBuildingBlocks);
    public static final RegistryObject<StrippableWallBlock> Crimson_Hyphae_Wall = register("crimson_hyphae_wall", wall(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Wall), FireResistanceDecorationBlocks);
    public static final RegistryObject<StrippableFenceBlock> Crimson_Hyphae_Fence = register("crimson_hyphae_fence", fence(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_Fence), FireResistanceDecorationBlocks);
    public static final RegistryObject<StrippableFenceGateBlock> Crimson_Hyphae_FenceGate = register("crimson_hyphae_fence_gate", fenceGate(Blocks.CRIMSON_HYPHAE, Stripped_Crimson_Hyphae_FenceGate), FireResistanceDecorationBlocks);
    public static final RegistryObject<StrippableStairBlock> Warped_Hyphae_Stairs = register("warped_hyphae_stairs", stair(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Stairs), FireResistanceBuildingBlocks);
    public static final RegistryObject<StrippableSlabBlock> Warped_Hyphae_Slab = register("warped_hyphae_slab", slab(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Slab), FireResistanceBuildingBlocks);
    public static final RegistryObject<StrippableWallBlock> Warped_Hyphae_Wall = register("warped_hyphae_wall", wall(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Wall), FireResistanceDecorationBlocks);
    public static final RegistryObject<StrippableFenceBlock> Warped_Hyphae_Fence = register("warped_hyphae_fence", fence(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_Fence), FireResistanceDecorationBlocks);
    public static final RegistryObject<StrippableFenceGateBlock> Warped_Hyphae_FenceGate = register("warped_hyphae_fence_gate", fenceGate(Blocks.WARPED_HYPHAE, Stripped_Warped_Hyphae_FenceGate), FireResistanceDecorationBlocks);

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

    public static final RegistryObject<StairBlock> WhiteWoolStairs = regWoolStairs("white", Blocks.WHITE_WOOL);
    public static final RegistryObject<SlabBlock> WhiteWoolSlab = regWoolSlab("white", Blocks.WHITE_WOOL);
    public static final RegistryObject<WallBlock> WhiteWoolWall = regWoolWall("white", Blocks.WHITE_WOOL);

    public static final RegistryObject<StairBlock> OrangeWoolStairs = regWoolStairs("orange", Blocks.ORANGE_WOOL);
    public static final RegistryObject<SlabBlock> OrangeWoolSlab = regWoolSlab("orange", Blocks.ORANGE_WOOL);
    public static final RegistryObject<WallBlock> OrangeWoolWall = regWoolWall("orange", Blocks.ORANGE_WOOL);

    public static final RegistryObject<StairBlock> MagentaWoolStairs = regWoolStairs("magenta", Blocks.MAGENTA_WOOL);
    public static final RegistryObject<SlabBlock> MagentaWoolSlab = regWoolSlab("magenta", Blocks.MAGENTA_WOOL);
    public static final RegistryObject<WallBlock> MagentaWoolWall = regWoolWall("magenta", Blocks.MAGENTA_WOOL);

    public static final RegistryObject<StairBlock> LightBlueWoolStairs = regWoolStairs("light_blue", Blocks.LIGHT_BLUE_WOOL);
    public static final RegistryObject<SlabBlock> LightBlueWoolSlab = regWoolSlab("light_blue", Blocks.LIGHT_BLUE_WOOL);
    public static final RegistryObject<WallBlock> LightBlueWoolWall = regWoolWall("light_blue", Blocks.LIGHT_BLUE_WOOL);

    public static final RegistryObject<StairBlock> YellowWoolStairs = regWoolStairs("yellow", Blocks.YELLOW_WOOL);
    public static final RegistryObject<SlabBlock> YellowWoolSlab = regWoolSlab("yellow", Blocks.YELLOW_WOOL);
    public static final RegistryObject<WallBlock> YellowWoolWall = regWoolWall("yellow", Blocks.YELLOW_WOOL);

    public static final RegistryObject<StairBlock> LimeWoolStairs = regWoolStairs("lime", Blocks.LIME_WOOL);
    public static final RegistryObject<SlabBlock> LimeWoolSlab = regWoolSlab("lime", Blocks.LIME_WOOL);
    public static final RegistryObject<WallBlock> LimeWoolWall = regWoolWall("lime", Blocks.LIME_WOOL);

    public static final RegistryObject<StairBlock> PinkWoolStairs = regWoolStairs("pink", Blocks.PINK_WOOL);
    public static final RegistryObject<SlabBlock> PinkWoolSlab = regWoolSlab("pink", Blocks.PINK_WOOL);
    public static final RegistryObject<WallBlock> PinkWoolWall = regWoolWall("pink", Blocks.PINK_WOOL);

    public static final RegistryObject<StairBlock> GrayWoolStairs = regWoolStairs("gray", Blocks.GRAY_WOOL);
    public static final RegistryObject<SlabBlock> GrayWoolSlab = regWoolSlab("gray", Blocks.GRAY_WOOL);
    public static final RegistryObject<WallBlock> GrayWoolWall = regWoolWall("gray", Blocks.GRAY_WOOL);

    public static final RegistryObject<StairBlock> LightGrayWoolStairs = regWoolStairs("light_gray", Blocks.LIGHT_GRAY_WOOL);
    public static final RegistryObject<SlabBlock> LightGrayWoolSlab = regWoolSlab("light_gray", Blocks.LIGHT_GRAY_WOOL);
    public static final RegistryObject<WallBlock> LightGrayWoolWall = regWoolWall("light_gray", Blocks.LIGHT_GRAY_WOOL);

    public static final RegistryObject<StairBlock> CyanWoolStairs = regWoolStairs("cyan", Blocks.CYAN_WOOL);
    public static final RegistryObject<SlabBlock> CyanWoolSlab = regWoolSlab("cyan", Blocks.CYAN_WOOL);
    public static final RegistryObject<WallBlock> CyanWoolWall = regWoolWall("cyan", Blocks.CYAN_WOOL);

    public static final RegistryObject<StairBlock> PurpleWoolStairs = regWoolStairs("purple", Blocks.PURPLE_WOOL);
    public static final RegistryObject<SlabBlock> PurpleWoolSlab = regWoolSlab("purple", Blocks.PURPLE_WOOL);
    public static final RegistryObject<WallBlock> PurpleWoolWall = regWoolWall("purple", Blocks.PURPLE_WOOL);

    public static final RegistryObject<StairBlock> BlueWoolStairs = regWoolStairs("blue", Blocks.BLUE_WOOL);
    public static final RegistryObject<SlabBlock> BlueWoolSlab = regWoolSlab("blue", Blocks.BLUE_WOOL);
    public static final RegistryObject<WallBlock> BlueWoolWall = regWoolWall("blue", Blocks.BLUE_WOOL);

    public static final RegistryObject<StairBlock> BrownWoolStairs = regWoolStairs("brown", Blocks.BROWN_WOOL);
    public static final RegistryObject<SlabBlock> BrownWoolSlab = regWoolSlab("brown", Blocks.BROWN_WOOL);
    public static final RegistryObject<WallBlock> BrownWoolWall = regWoolWall("brown", Blocks.BROWN_WOOL);

    public static final RegistryObject<StairBlock> GreenWoolStairs = regWoolStairs("green", Blocks.GREEN_WOOL);
    public static final RegistryObject<SlabBlock> GreenWoolSlab = regWoolSlab("green", Blocks.GREEN_WOOL);
    public static final RegistryObject<WallBlock> GreenWoolWall = regWoolWall("green", Blocks.GREEN_WOOL);

    public static final RegistryObject<StairBlock> RedWoolStairs = regWoolStairs("red", Blocks.RED_WOOL);
    public static final RegistryObject<SlabBlock> RedWoolSlab = regWoolSlab("red", Blocks.RED_WOOL);
    public static final RegistryObject<WallBlock> RedWoolWall = regWoolWall("red", Blocks.RED_WOOL);

    public static final RegistryObject<StairBlock> BlackWoolStairs = regWoolStairs("black", Blocks.BLACK_WOOL);
    public static final RegistryObject<SlabBlock> BlackWoolSlab = regWoolSlab("black", Blocks.BLACK_WOOL);
    public static final RegistryObject<WallBlock> BlackWoolWall = regWoolWall("black", Blocks.BLACK_WOOL);

    public static final RegistryObject<StairBlock> PackedMudStairs = register("packed_mud_stairs", stair(Blocks.PACKED_MUD), BuildingBlocks);
    public static final RegistryObject<SlabBlock> PackedMudSlab = register("packed_mud_slab", slab(Blocks.PACKED_MUD), BuildingBlocks);
    public static final RegistryObject<WallBlock> PackedMudWall = register("packed_mud_wall", wall(Blocks.PACKED_MUD), DecorationBlocks);

    private static Supplier<StrippableStairBlock> stair(Block base, Supplier<StairBlock> stripped) {return ()-> new StrippableStairBlock(base::defaultBlockState, stripped, StairBlock.Properties.copy(base));}
    private static Supplier<StrippableSlabBlock> slab(Block base, Supplier<SlabBlock> stripped) {return ()-> new StrippableSlabBlock(stripped, SlabBlock.Properties.copy(base));}
    private static Supplier<StrippableWallBlock> wall(Block base, Supplier<WallBlock> stripped) {return ()-> new StrippableWallBlock(stripped, WallBlock.Properties.copy(base));}
    private static Supplier<StrippableFenceBlock> fence(Block base, Supplier<FenceBlock> stripped) {return ()-> new StrippableFenceBlock(stripped, WallBlock.Properties.copy(base));}
    private static Supplier<StrippableFenceGateBlock> fenceGate(Block base, Supplier<FenceGateBlock> stripped) {return ()-> new StrippableFenceGateBlock(stripped, WallBlock.Properties.copy(base));}

    @Deprecated private static Supplier<StairBlock> stair(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool, Block block){
        if(requiresTool)
            return stair(properties(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops(), block::defaultBlockState);
        else
            return stair(properties(material).strength(hardness, resistance).sound(soundType), block::defaultBlockState);
    }
    @Deprecated private static Supplier<SlabBlock> slab(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return slab(properties(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return slab(properties(material).strength(hardness, resistance).sound(soundType));
    }
    @Deprecated private static Supplier<WallBlock> wall(Material material, float hardness, float resistance, SoundType soundType, boolean requiresTool){
        if(requiresTool)
            return wall(properties(material).strength(hardness, resistance).sound(soundType).requiresCorrectToolForDrops());
        else
            return wall(properties(material).strength(hardness, resistance).sound(soundType));
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
    private static RegistryObject<FenceBlock> woodFence(String type, Block base) {
        return register(type + "_wood_fence", fence(base), DecorationBlocks);
    }
    private static RegistryObject<StrippableFenceBlock> woodFence(String type, Block base, Supplier<FenceBlock> stripped) {
        return register(type + "_wood_fence", fence(base, stripped), DecorationBlocks);
    }
    private static RegistryObject<FenceGateBlock> woodFenceGate(String type, Block base) {
        return register(type + "_wood_fence_gate", fenceGate(base), DecorationBlocks);
    }
    private static RegistryObject<StrippableFenceGateBlock> woodFenceGate(String type, Block base, Supplier<FenceGateBlock> stripped) {
        return register(type + "_wood_fence_gate", fenceGate(base, stripped), DecorationBlocks);
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

    private static RegistryObject<StairBlock> regWoolStairs(String color, Block parent){
        return register(color + "_wool_stairs",
                stair(parent), BuildingBlocks);
    }
    private static RegistryObject<SlabBlock> regWoolSlab(String color, Block parent){
        return register(color + "_wool_slab",
                slab(parent), BuildingBlocks);
    }
    private static RegistryObject<WallBlock> regWoolWall(String color, Block parent){
        return register(color + "_wool_wall",
                wall(parent), DecorationBlocks);
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, Item.Properties ItemProperties){
        RegistryObject<T> ret = registerWithoutItem(name, block);
        ItemRegistry.register(name, ()-> new BlockItem(ret.get(), ItemProperties));
        return ret;
    }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block, int itemBurnTime, Item.Properties itemPorperties){
        RegistryObject<T> ret = registerWithoutItem(name, block);
        ItemRegistry.register(name, ()-> new BlockItem(ret.get(), itemPorperties){
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return itemBurnTime;}
        });
        return ret;
    }
    private static <T extends Block> RegistryObject<T> registerWithoutItem(String name, Supplier<T> block) {return BlockRegistry.register(name, block);}

    public static Iterator<Block> getAllBlocks() {return BlockRegistry.getEntries().stream().map(RegistryObject::get).iterator();}
}