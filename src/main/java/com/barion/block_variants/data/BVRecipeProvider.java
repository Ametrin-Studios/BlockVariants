package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class BVRecipeProvider extends RecipeProvider {
    private Consumer<FinishedRecipe> consumer;
    public BVRecipeProvider(DataGenerator generator) {super(generator);}

    @Override @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer){
        this.consumer = consumer;
        wall(BVBlocks.PolishedGraniteWall.get(), Blocks.POLISHED_GRANITE, Blocks.GRANITE, Blocks.GRANITE_WALL);
        wall(BVBlocks.PolishedDioriteWall.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, Blocks.DIORITE_WALL);
        wall(BVBlocks.PolishedAndesiteWall.get(), Blocks.POLISHED_ANDESITE, Blocks.ANDESITE, Blocks.ANDESITE_WALL);

        smelting(Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS);
        smelting(Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
        wall(BVBlocks.StoneWall.get(), Blocks.STONE, true);
        smelting(BVBlocks.StoneWall.get(), Blocks.COBBLESTONE_WALL);
        stair(BVBlocks.SmoothStoneStairs.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVBlocks.SmoothStoneStairs.get(), Blocks.STONE_STAIRS);
        smelting(Blocks.SMOOTH_STONE_SLAB, Blocks.STONE_SLAB);
        wall(BVBlocks.SmoothStoneWall.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVBlocks.SmoothStoneWall.get(), BVBlocks.StoneWall.get());

        stair(BVBlocks.CutSandstoneStairs.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS);
        stair(BVBlocks.CutRedSandstoneStairs.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS);
        wall(BVBlocks.CutSandstoneWall.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_WALL);
        wall(BVBlocks.CutRedSandstoneWall.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_WALL);

        wall(BVBlocks.QuartzWall.get(), Blocks.QUARTZ_BLOCK, true);
        stair(BVBlocks.QuartzBrickStairs.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBlocks.QuartzBrickSlab.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.QuartzBrickWall.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, BVBlocks.QuartzWall.get());
        smelting(Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.QUARTZ_STAIRS);
        smelting(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.SmoothQuartzWall.get(), Blocks.SMOOTH_QUARTZ, true);
        smelting(BVBlocks.SmoothQuartzWall.get(), BVBlocks.QuartzWall.get());
        stair(BVBlocks.ChiseledQuartzBlockStairs.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBlocks.Chiseled_Quartz_Block_Slab.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.Chiseled_Quartz_Block_Wall.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, BVBlocks.QuartzWall.get());

        wall(BVBlocks.Prismarine_Brick_Wall.get(), Blocks.PRISMARINE_BRICKS, true);
        wall(BVBlocks.Dark_Prismarine_Wall.get(), Blocks.DARK_PRISMARINE, true);
        all(BVBlocks.NetherrackStairs.get(), BVBlocks.Netherrack_Slab.get(), BVBlocks.Netherrack_Wall.get(), Blocks.NETHERRACK, true);
        all(BVBlocks.EndStoneStairs.get(), BVBlocks.End_Stone_Slab.get(), BVBlocks.End_Stone_Wall.get(), Blocks.END_STONE, true);
        wall(BVBlocks.Purpur_Wall.get(), Blocks.PURPUR_BLOCK);

        all(BVBlocks.CrackedPolishedBlackstoneBrickStairs.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, true);
        smelting(BVBlocks.CrackedPolishedBlackstoneBrickStairs.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        smelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
        smelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(), Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.POLISHED_BLACKSTONE_STAIRS);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.POLISHED_BLACKSTONE_SLAB);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecuttingExtraID(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.POLISHED_BLACKSTONE_WALL);

        all(BVBlocks.Basalt_Stairs.get(), BVBlocks.Basalt_Slab.get(), BVBlocks.Basalt_Wall.get(), Blocks.BASALT, true);
        stair(BVBlocks.Polished_Basalt_Stairs.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.Basalt_Stairs.get());
        slab(BVBlocks.Polished_Basalt_Slab.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.Basalt_Slab.get());
        wall(BVBlocks.Polished_Basalt_Wall.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.Basalt_Wall.get());

        all(BVBlocks.Terracotta_Stairs.get(), BVBlocks.Terracotta_Slab.get(), BVBlocks.Terracotta_Wall.get(), Blocks.TERRACOTTA, true);
        all(BVBlocks.White_Terracotta_Stairs.get(), BVBlocks.White_Terracotta_Slab.get(), BVBlocks.White_Terracotta_Wall.get(), Blocks.WHITE_TERRACOTTA, true);
        all(BVBlocks.Orange_Terracotta_Stairs.get(), BVBlocks.Orange_Terracotta_Slab.get(), BVBlocks.Orange_Terracotta_Wall.get(), Blocks.ORANGE_TERRACOTTA, true);
        all(BVBlocks.Magenta_Terracotta_Stairs.get(), BVBlocks.Magenta_Terracotta_Slab.get(), BVBlocks.Magenta_Terracotta_Wall.get(), Blocks.MAGENTA_TERRACOTTA, true);
        all(BVBlocks.Light_Blue_Terracotta_Stairs.get(), BVBlocks.Light_Blue_Terracotta_Slab.get(), BVBlocks.Light_Blue_Terracotta_Wall.get(), Blocks.LIGHT_BLUE_TERRACOTTA, true);
        all(BVBlocks.Yellow_Terracotta_Stairs.get(), BVBlocks.Yellow_Terracotta_Slab.get(), BVBlocks.Yellow_Terracotta_Wall.get(), Blocks.YELLOW_TERRACOTTA, true);
        all(BVBlocks.Lime_Terracotta_Stairs.get(), BVBlocks.Lime_Terracotta_Slab.get(), BVBlocks.Lime_Terracotta_Wall.get(), Blocks.LIME_TERRACOTTA, true);
        all(BVBlocks.Pink_Terracotta_Stairs.get(), BVBlocks.Pink_Terracotta_Slab.get(), BVBlocks.Pink_Terracotta_Wall.get(), Blocks.PINK_TERRACOTTA, true);
        all(BVBlocks.Gray_Terracotta_Stairs.get(), BVBlocks.Gray_Terracotta_Slab.get(), BVBlocks.Gray_Terracotta_Wall.get(), Blocks.GRAY_TERRACOTTA, true);
        all(BVBlocks.Light_Gray_Terracotta_Stairs.get(), BVBlocks.Light_Gray_Terracotta_Slab.get(), BVBlocks.Light_Gray_Terracotta_Wall.get(), Blocks.LIGHT_GRAY_TERRACOTTA, true);
        all(BVBlocks.Cyan_Terracotta_Stairs.get(), BVBlocks.Cyan_Terracotta_Slab.get(), BVBlocks.Cyan_Terracotta_Wall.get(), Blocks.CYAN_TERRACOTTA, true);
        all(BVBlocks.Purple_Terracotta_Stairs.get(), BVBlocks.Purple_Terracotta_Slab.get(), BVBlocks.Purple_Terracotta_Wall.get(), Blocks.PURPLE_TERRACOTTA, true);
        all(BVBlocks.Blue_Terracotta_Stairs.get(), BVBlocks.Blue_Terracotta_Slab.get(), BVBlocks.Blue_Terracotta_Wall.get(), Blocks.BLUE_TERRACOTTA, true);
        all(BVBlocks.Brown_Terracotta_Stairs.get(), BVBlocks.Brown_Terracotta_Slab.get(), BVBlocks.Brown_Terracotta_Wall.get(), Blocks.BROWN_TERRACOTTA, true);
        all(BVBlocks.Green_Terracotta_Stairs.get(), BVBlocks.Green_Terracotta_Slab.get(), BVBlocks.Green_Terracotta_Wall.get(), Blocks.GREEN_TERRACOTTA, true);
        all(BVBlocks.Red_Terracotta_Stairs.get(), BVBlocks.Red_Terracotta_Slab.get(), BVBlocks.Red_Terracotta_Wall.get(), Blocks.RED_TERRACOTTA, true);
        all(BVBlocks.Black_Terracotta_Stairs.get(), BVBlocks.Black_Terracotta_Slab.get(), BVBlocks.Black_Terracotta_Wall.get(), Blocks.BLACK_TERRACOTTA, true);

        all(BVBlocks.Dripstone_Block_Stairs.get(), BVBlocks.Dripstone_Block_Slab.get(), BVBlocks.Dripstone_Block_Wall.get(), Blocks.DRIPSTONE_BLOCK, true);
        all(BVBlocks.Amethyst_Block_Stairs.get(), BVBlocks.Amethyst_Block_Slab.get(), BVBlocks.Amethyst_Block_Wall.get(), Blocks.AMETHYST_BLOCK, false);

        stairSlab(BVBlocks.Oak_Log_Stairs.get(), BVBlocks.Oak_Log_Slab.get(), Blocks.OAK_LOG, false);
        stairSlab(BVBlocks.Spruce_Log_Stairs.get(), BVBlocks.Spruce_Log_Slab.get(), Blocks.SPRUCE_LOG, false);
        stairSlab(BVBlocks.Birch_Log_Stairs.get(), BVBlocks.Birch_Log_Slab.get(), Blocks.BIRCH_LOG, false);
        stairSlab(BVBlocks.Jungle_Log_Stairs.get(), BVBlocks.Jungle_Log_Slab.get(), Blocks.JUNGLE_LOG, false);
        stairSlab(BVBlocks.Acacia_Log_Stairs.get(), BVBlocks.Acacia_Log_Slab.get(), Blocks.ACACIA_LOG, false);
        stairSlab(BVBlocks.Dark_Oak_Log_Stairs.get(), BVBlocks.Dark_Oak_Log_Slab.get(), Blocks.DARK_OAK_LOG, false);
        stairSlab(BVBlocks.Mangrove_Log_Stairs.get(), BVBlocks.Mangrove_Log_Slab.get(), Blocks.MANGROVE_LOG, false);
        stairSlab(BVBlocks.Stripped_Oak_Log_Stairs.get(), BVBlocks.Stripped_Oak_Log_Slab.get(), Blocks.STRIPPED_OAK_LOG, false);
        stairSlab(BVBlocks.Stripped_Spruce_Log_Stairs.get(), BVBlocks.Stripped_Spruce_Log_Slab.get(), Blocks.STRIPPED_SPRUCE_LOG, false);
        stairSlab(BVBlocks.Stripped_Birch_Log_Stairs.get(), BVBlocks.Stripped_Birch_Log_Slab.get(), Blocks.STRIPPED_BIRCH_LOG, false);
        stairSlab(BVBlocks.Stripped_Jungle_Log_Stairs.get(), BVBlocks.Stripped_Jungle_Log_Slab.get(), Blocks.STRIPPED_JUNGLE_LOG, false);
        stairSlab(BVBlocks.Stripped_Acacia_Log_Stairs.get(), BVBlocks.Stripped_Acacia_Log_Slab.get(), Blocks.STRIPPED_ACACIA_LOG, false);
        stairSlab(BVBlocks.Stripped_Dark_Oak_Log_Stairs.get(), BVBlocks.Stripped_Dark_Oak_Log_Slab.get(), Blocks.STRIPPED_DARK_OAK_LOG, false);
        stairSlab(BVBlocks.Stripped_Mangrove_Log_Stairs.get(), BVBlocks.Stripped_Mangrove_Log_Slab.get(), Blocks.STRIPPED_MANGROVE_LOG, false);
        stairSlab(BVBlocks.Crimson_Stem_Stairs.get(), BVBlocks.Crimson_Stem_Slab.get(), Blocks.CRIMSON_STEM, false);
        stairSlab(BVBlocks.Warped_Stem_Stairs.get(), BVBlocks.Warped_Stem_Slab.get(), Blocks.WARPED_STEM, false);
        stairSlab(BVBlocks.Stripped_Crimson_Stem_Stairs.get(), BVBlocks.Stripped_Crimson_Stem_Slab.get(), Blocks.STRIPPED_CRIMSON_STEM, false);
        stairSlab(BVBlocks.Stripped_Warped_Stem_Stairs.get(), BVBlocks.Stripped_Warped_Stem_Slab.get(), Blocks.STRIPPED_WARPED_STEM, false);

        recipeWoods(BVBlocks.Oak_Wood_Stairs.get(), BVBlocks.Oak_Wood_Slab.get(), BVBlocks.Oak_Wood_Wall.get(), Blocks.OAK_WOOD, Blocks.OAK_LOG);
        recipeWoods(BVBlocks.Spruce_Wood_Stairs.get(), BVBlocks.Spruce_Wood_Slab.get(), BVBlocks.Spruce_Wood_Wall.get(), Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG);
        recipeWoods(BVBlocks.Birch_Wood_Stairs.get(), BVBlocks.Birch_Wood_Slab.get(), BVBlocks.Birch_Wood_Wall.get(), Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG);
        recipeWoods(BVBlocks.Jungle_Wood_Stairs.get(), BVBlocks.Jungle_Wood_Slab.get(), BVBlocks.Jungle_Wood_Wall.get(), Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG);
        recipeWoods(BVBlocks.Acacia_Wood_Stairs.get(), BVBlocks.Acacia_Wood_Slab.get(), BVBlocks.Acacia_Wood_Wall.get(), Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG);
        recipeWoods(BVBlocks.Dark_Oak_Wood_Stairs.get(), BVBlocks.Dark_Oak_Wood_Slab.get(), BVBlocks.Dark_Oak_Wood_Wall.get(), Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG);
        recipeWoods(BVBlocks.Mangrove_Wood_Stairs.get(), BVBlocks.Mangrove_Wood_Slab.get(), BVBlocks.Mangrove_Wood_Wall.get(), Blocks.MANGROVE_WOOD, Blocks.MANGROVE_LOG);
        recipeWoods(BVBlocks.Crimson_Hyphae_Stairs.get(), BVBlocks.Crimson_Hyphae_Slab.get(), BVBlocks.Crimson_Hyphae_Wall.get(), Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
        recipeWoods(BVBlocks.Warped_Hyphae_Stairs.get(), BVBlocks.Warped_Hyphae_Slab.get(), BVBlocks.Warped_Hyphae_Wall.get(), Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);
        recipeWoods(BVBlocks.Stripped_Oak_Wood_Stairs.get(), BVBlocks.Stripped_Oak_Wood_Slab.get(), BVBlocks.Stripped_Oak_Wood_Wall.get(), Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG);
        recipeWoods(BVBlocks.Stripped_Spruce_Wood_Stairs.get(), BVBlocks.Stripped_Spruce_Wood_Slab.get(), BVBlocks.Stripped_Spruce_Wood_Wall.get(), Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG);
        recipeWoods(BVBlocks.Stripped_Birch_Wood_Stairs.get(), BVBlocks.Stripped_Birch_Wood_Slab.get(), BVBlocks.Stripped_Birch_Wood_Wall.get(), Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG);
        recipeWoods(BVBlocks.Stripped_Jungle_Wood_Stairs.get(), BVBlocks.Stripped_Jungle_Wood_Slab.get(), BVBlocks.Stripped_Jungle_Wood_Wall.get(), Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG);
        recipeWoods(BVBlocks.Stripped_Acacia_Wood_Stairs.get(), BVBlocks.Stripped_Acacia_Wood_Slab.get(), BVBlocks.Stripped_Acacia_Wood_Wall.get(), Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG);
        recipeWoods(BVBlocks.Stripped_Dark_Oak_Wood_Stairs.get(), BVBlocks.Stripped_Dark_Oak_Wood_Slab.get(), BVBlocks.Stripped_Dark_Oak_Wood_Wall.get(), Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG);
        recipeWoods(BVBlocks.Stripped_Mangrove_Wood_Stairs.get(), BVBlocks.Stripped_Mangrove_Wood_Slab.get(), BVBlocks.Stripped_Mangrove_Wood_Wall.get(), Blocks.STRIPPED_MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_LOG);
        recipeWoods(BVBlocks.Stripped_Crimson_Hyphae_Stairs.get(), BVBlocks.Stripped_Crimson_Hyphae_Slab.get(), BVBlocks.Stripped_Crimson_Hyphae_Wall.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM);
        recipeWoods(BVBlocks.Stripped_Warped_Hyphae_Stairs.get(), BVBlocks.Stripped_Warped_Hyphae_Slab.get(), BVBlocks.Stripped_Warped_Hyphae_Wall.get(), Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM);

        all(BVBlocks.Calcite_Stairs.get(), BVBlocks.Calcite_Slab.get(), BVBlocks.Calcite_Wall.get(), Blocks.CALCITE, true);
        all(BVBlocks.Smooth_Basalt_Stairs.get(), BVBlocks.Smooth_Basalt_Slab.get(), BVBlocks.Smooth_Basalt_Wall.get(), Blocks.SMOOTH_BASALT, true);
        smelting(BVBlocks.Smooth_Basalt_Stairs.get(), BVBlocks.Basalt_Stairs.get());
        smelting(BVBlocks.Smooth_Basalt_Slab.get(), BVBlocks.Basalt_Slab.get());
        smelting(BVBlocks.Smooth_Basalt_Wall.get(), BVBlocks.Basalt_Wall.get());
        all(BVBlocks.Tuff_Stairs.get(), BVBlocks.Tuff_Slab.get(), BVBlocks.Tuff_Wall.get(), Blocks.TUFF, true);

        all(BVBlocks.Deepslate_Stairs.get(), BVBlocks.Deepslate_Slab.get(), BVBlocks.Deepslate_Wall.get(), Blocks.DEEPSLATE, true);
        all(BVBlocks.Cracked_Deepslate_Brick_Stairs.get(), BVBlocks.Cracked_Deepslate_Brick_Slab.get(), BVBlocks.Cracked_Deepslate_Brick_Wall.get(), Blocks.CRACKED_DEEPSLATE_BRICKS, true);
        all(BVBlocks.Cracked_Deepslate_Tile_Stairs.get(), BVBlocks.Cracked_Deepslate_Tile_Slab.get(), BVBlocks.Cracked_Deepslate_Tile_Wall.get(), Blocks.CRACKED_DEEPSLATE_TILES, true);

        netherFenceGate(BVBlocks.Nether_Brick_Fence_Gate.get(), Blocks.NETHER_BRICKS);
        all(BVBlocks.Cracked_Nether_Brick_Stairs.get(), BVBlocks.Cracked_Nether_Brick_Slab.get(), BVBlocks.Cracked_Nether_Brick_Wall.get(), Blocks.CRACKED_NETHER_BRICKS, true);
        netherFence(BVBlocks.Cracked_Nether_Brick_Fence.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.Cracked_Nether_Brick_Fence_Gate.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFence(BVBlocks.Red_Nether_Brick_Fence.get(), Blocks.RED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.Red_Nether_Brick_Fence_Gate.get(), Blocks.RED_NETHER_BRICKS);

        all(BVBlocks.Obsidian_Stairs.get(), BVBlocks.Obsidian_Slab.get(), BVBlocks.Obsidian_Wall.get(), Blocks.OBSIDIAN, false);
        all(BVBlocks.Crying_Obsidian_Stairs.get(), BVBlocks.Crying_Obsidian_Slab.get(), BVBlocks.Crying_Obsidian_Wall.get(), Blocks.CRYING_OBSIDIAN, false);

        all(BVBlocks.White_Glazed_Terracotta_Stairs.get(), BVBlocks.White_Glazed_Terracotta_Slab.get(), BVBlocks.White_Glazed_Terracotta_Wall.get(), Blocks.WHITE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.White_Glazed_Terracotta_Stairs.get(), BVBlocks.White_Terracotta_Stairs.get());
        smelting(BVBlocks.White_Glazed_Terracotta_Slab.get(), BVBlocks.White_Terracotta_Slab.get());
        smelting(BVBlocks.White_Glazed_Terracotta_Wall.get(), BVBlocks.White_Terracotta_Wall.get());
        all(BVBlocks.Orange_Glazed_Terracotta_Stairs.get(), BVBlocks.Orange_Glazed_Terracotta_Slab.get(), BVBlocks.Orange_Glazed_Terracotta_Wall.get(), Blocks.ORANGE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Orange_Glazed_Terracotta_Stairs.get(), BVBlocks.Orange_Terracotta_Stairs.get());
        smelting(BVBlocks.Orange_Glazed_Terracotta_Slab.get(), BVBlocks.Orange_Terracotta_Slab.get());
        smelting(BVBlocks.Orange_Glazed_Terracotta_Wall.get(), BVBlocks.Orange_Terracotta_Wall.get());
        all(BVBlocks.Magenta_Glazed_Terracotta_Stairs.get(), BVBlocks.Magenta_Glazed_Terracotta_Slab.get(), BVBlocks.Magenta_Glazed_Terracotta_Wall.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Magenta_Glazed_Terracotta_Stairs.get(), BVBlocks.Magenta_Terracotta_Stairs.get());
        smelting(BVBlocks.Magenta_Glazed_Terracotta_Slab.get(), BVBlocks.Magenta_Terracotta_Slab.get());
        smelting(BVBlocks.Magenta_Glazed_Terracotta_Wall.get(), BVBlocks.Magenta_Terracotta_Wall.get());
        all(BVBlocks.Light_Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Blue_Glazed_Terracotta_Wall.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Light_Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Blue_Terracotta_Stairs.get());
        smelting(BVBlocks.Light_Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Blue_Terracotta_Slab.get());
        smelting(BVBlocks.Light_Blue_Glazed_Terracotta_Wall.get(), BVBlocks.Light_Blue_Terracotta_Wall.get());
        all(BVBlocks.Yellow_Glazed_Terracotta_Stairs.get(), BVBlocks.Yellow_Glazed_Terracotta_Slab.get(), BVBlocks.Yellow_Glazed_Terracotta_Wall.get(), Blocks.YELLOW_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Yellow_Glazed_Terracotta_Stairs.get(), BVBlocks.Yellow_Terracotta_Stairs.get());
        smelting(BVBlocks.Yellow_Glazed_Terracotta_Slab.get(), BVBlocks.Yellow_Terracotta_Slab.get());
        smelting(BVBlocks.Yellow_Glazed_Terracotta_Wall.get(), BVBlocks.Yellow_Terracotta_Wall.get());
        all(BVBlocks.Lime_Glazed_Terracotta_Stairs.get(), BVBlocks.Lime_Glazed_Terracotta_Slab.get(), BVBlocks.Lime_Glazed_Terracotta_Wall.get(), Blocks.LIME_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Lime_Glazed_Terracotta_Stairs.get(), BVBlocks.Lime_Terracotta_Stairs.get());
        smelting(BVBlocks.Lime_Glazed_Terracotta_Slab.get(), BVBlocks.Lime_Terracotta_Slab.get());
        smelting(BVBlocks.Lime_Glazed_Terracotta_Wall.get(), BVBlocks.Lime_Terracotta_Wall.get());
        all(BVBlocks.Pink_Glazed_Terracotta_Stairs.get(), BVBlocks.Pink_Glazed_Terracotta_Slab.get(), BVBlocks.Pink_Glazed_Terracotta_Wall.get(), Blocks.PINK_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Pink_Glazed_Terracotta_Stairs.get(), BVBlocks.Pink_Terracotta_Stairs.get());
        smelting(BVBlocks.Pink_Glazed_Terracotta_Slab.get(), BVBlocks.Pink_Terracotta_Slab.get());
        smelting(BVBlocks.Pink_Glazed_Terracotta_Wall.get(), BVBlocks.Pink_Terracotta_Wall.get());
        all(BVBlocks.Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Gray_Glazed_Terracotta_Wall.get(), Blocks.GRAY_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Gray_Terracotta_Stairs.get());
        smelting(BVBlocks.Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Gray_Terracotta_Slab.get());
        smelting(BVBlocks.Gray_Glazed_Terracotta_Wall.get(), BVBlocks.Gray_Terracotta_Wall.get());
        all(BVBlocks.Light_Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Gray_Glazed_Terracotta_Wall.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Light_Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Gray_Terracotta_Stairs.get());
        smelting(BVBlocks.Light_Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Gray_Terracotta_Slab.get());
        smelting(BVBlocks.Light_Gray_Glazed_Terracotta_Wall.get(), BVBlocks.Light_Gray_Terracotta_Wall.get());
        all(BVBlocks.Cyan_Glazed_Terracotta_Stairs.get(), BVBlocks.Cyan_Glazed_Terracotta_Slab.get(), BVBlocks.Cyan_Glazed_Terracotta_Wall.get(), Blocks.CYAN_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Cyan_Glazed_Terracotta_Stairs.get(), BVBlocks.Cyan_Terracotta_Stairs.get());
        smelting(BVBlocks.Cyan_Glazed_Terracotta_Slab.get(), BVBlocks.Cyan_Terracotta_Slab.get());
        smelting(BVBlocks.Cyan_Glazed_Terracotta_Wall.get(), BVBlocks.Cyan_Terracotta_Wall.get());
        all(BVBlocks.Purple_Glazed_Terracotta_Stairs.get(), BVBlocks.Purple_Glazed_Terracotta_Slab.get(), BVBlocks.Purple_Glazed_Terracotta_Wall.get(), Blocks.PURPLE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Purple_Glazed_Terracotta_Stairs.get(), BVBlocks.Purple_Terracotta_Stairs.get());
        smelting(BVBlocks.Purple_Glazed_Terracotta_Slab.get(), BVBlocks.Purple_Terracotta_Slab.get());
        smelting(BVBlocks.Purple_Glazed_Terracotta_Wall.get(), BVBlocks.Purple_Terracotta_Wall.get());
        all(BVBlocks.Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Blue_Glazed_Terracotta_Wall.get(), Blocks.BLUE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Blue_Terracotta_Stairs.get());
        smelting(BVBlocks.Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Blue_Terracotta_Slab.get());
        smelting(BVBlocks.Blue_Glazed_Terracotta_Wall.get(), BVBlocks.Blue_Terracotta_Wall.get());
        all(BVBlocks.Brown_Glazed_Terracotta_Stairs.get(), BVBlocks.Brown_Glazed_Terracotta_Slab.get(), BVBlocks.Brown_Glazed_Terracotta_Wall.get(), Blocks.BROWN_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Brown_Glazed_Terracotta_Stairs.get(), BVBlocks.Brown_Terracotta_Stairs.get());
        smelting(BVBlocks.Brown_Glazed_Terracotta_Slab.get(), BVBlocks.Brown_Terracotta_Slab.get());
        smelting(BVBlocks.Brown_Glazed_Terracotta_Wall.get(), BVBlocks.Brown_Terracotta_Wall.get());
        all(BVBlocks.Green_Glazed_Terracotta_Stairs.get(), BVBlocks.Green_Glazed_Terracotta_Slab.get(), BVBlocks.Green_Glazed_Terracotta_Wall.get(), Blocks.GREEN_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Green_Glazed_Terracotta_Stairs.get(), BVBlocks.Green_Terracotta_Stairs.get());
        smelting(BVBlocks.Green_Glazed_Terracotta_Slab.get(), BVBlocks.Green_Terracotta_Slab.get());
        smelting(BVBlocks.Green_Glazed_Terracotta_Wall.get(), BVBlocks.Green_Terracotta_Wall.get());
        all(BVBlocks.Red_Glazed_Terracotta_Stairs.get(), BVBlocks.Red_Glazed_Terracotta_Slab.get(), BVBlocks.Red_Glazed_Terracotta_Wall.get(), Blocks.RED_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Red_Glazed_Terracotta_Stairs.get(), BVBlocks.Red_Terracotta_Stairs.get());
        smelting(BVBlocks.Red_Glazed_Terracotta_Slab.get(), BVBlocks.Red_Terracotta_Slab.get());
        smelting(BVBlocks.Red_Glazed_Terracotta_Wall.get(), BVBlocks.Red_Terracotta_Wall.get());
        all(BVBlocks.Black_Glazed_Terracotta_Stairs.get(), BVBlocks.Black_Glazed_Terracotta_Slab.get(), BVBlocks.Black_Glazed_Terracotta_Wall.get(), Blocks.BLACK_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.Black_Glazed_Terracotta_Stairs.get(), BVBlocks.Black_Terracotta_Stairs.get());
        smelting(BVBlocks.Black_Glazed_Terracotta_Slab.get(), BVBlocks.Black_Terracotta_Slab.get());
        smelting(BVBlocks.Black_Glazed_Terracotta_Wall.get(), BVBlocks.Black_Terracotta_Wall.get());

        all(BVBlocks.PackedMudStairs.get(), BVBlocks.PackedMudSlab.get(), BVBlocks.PackedMudWall.get(), Blocks.PACKED_MUD, true);

        {
            ShapedRecipeBuilder.shaped(Blocks.DROPPER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.REDSTONE)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("#+#")
                    .unlockedBy("has_redstone", has(Items.REDSTONE))
                    .save(consumer, recipeID(Blocks.DROPPER));

            ShapedRecipeBuilder.shaped(Blocks.DISPENSER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.REDSTONE)
                    .define('(', Items.BOW)
                    .pattern("###")
                    .pattern("#(#")
                    .pattern("#+#")
                    .unlockedBy("has_bow", has(Items.BOW))
                    .save(consumer, recipeID(Blocks.DISPENSER));

            ShapedRecipeBuilder.shaped(Blocks.FURNACE, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Blocks.FURNACE));

            ShapedRecipeBuilder.shaped(Blocks.STONECUTTER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.IRON_INGOT)
                    .pattern(" + ")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Blocks.STONECUTTER));

            ShapedRecipeBuilder.shaped(Blocks.LEVER, 1)
                    .define('|', Items.STICK)
                    .define('#', BVTags.Items.StoneCrafting)
                    .pattern("|")
                    .pattern("#")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer);

            ShapedRecipeBuilder.shaped(Blocks.PISTON, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('W', ItemTags.PLANKS)
                    .define('N', Items.IRON_INGOT)
                    .define('I', Items.REDSTONE)
                    .pattern("WWW")
                    .pattern("#N#")
                    .pattern("#I#")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer);
        } //Recipe overrides
    }

    protected void stair(ItemLike stair, ItemLike material, boolean hasStonecutting){
        stairBuilder(stair, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(consumer);
        if(hasStonecutting) {stonecutting(stair, 1, material);}
    }
    protected void stair(ItemLike stair, ItemLike material, ItemLike... addStonecutting){
        stair(stair, material, true);
        for(ItemLike item : addStonecutting){
            stonecuttingExtraID(stair, 1, item);
        }
    }
    protected void slab(ItemLike slab, ItemLike material, boolean hasStonecutting){
        slab(consumer, slab, material);
        if(hasStonecutting) {stonecutting(slab, 2, material);}
    }
    protected void slab(ItemLike slab, ItemLike material, ItemLike... addStonecutting){
        slab(slab, material, true);
        for(ItemLike item : addStonecutting){
            stonecuttingExtraID(slab, (item instanceof SlabBlock) ? 1 : 2, item);
        }
    }
    protected void wall(ItemLike wall, ItemLike material, boolean hasStonecutting){
        wall(consumer, wall, material);
        if(hasStonecutting) {stonecutting(wall, 1, material);}
    }
    protected void wall(ItemLike wall, ItemLike material, ItemLike... addStonecutting){
        wall(wall, material, true);
        for(ItemLike item : addStonecutting){
            stonecuttingExtraID(wall, 1, item);
        }
    }
    protected void fence(ItemLike fence, ItemLike material){
        fenceBuilder(fence, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(consumer);
    }
    protected void netherFence(ItemLike fence, ItemLike material){
        ShapedRecipeBuilder.shaped(fence, 6).define('W', material).define('#', Items.NETHER_BRICK).pattern("W#W").pattern("W#W").unlockedBy(getHasName(material), has(material)).save(consumer);
    }
    protected void fenceGate(ItemLike fenceGate, ItemLike material){
        fenceGateBuilder(fenceGate, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(consumer);
    }
    protected void netherFenceGate(ItemLike fenceGate, ItemLike material){
        ShapedRecipeBuilder.shaped(fenceGate).define('#', Items.NETHER_BRICK).define('W', material).pattern("#W#").pattern("#W#").unlockedBy(getHasName(material), has(material)).save(consumer);
    }

    protected void stonecutting(ItemLike result, int amount, ItemLike material) {SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), result, amount).unlockedBy(getHasName(material), has(material)).save(consumer, getStonecuttingRecipeID(result));}
    protected void stonecuttingExtraID(ItemLike result, int amount, ItemLike material) {SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), result, amount).unlockedBy(getHasName(material), has(material)).save(consumer, getConversionStonecuttingRecipeID(result, material));}


    protected void all(StairBlock stair, SlabBlock slab, WallBlock wall, ItemLike material, boolean hasStonecutting){
        stair(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
        wall(wall, material, hasStonecutting);
    }
    protected void stairSlab(StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting){
        stair(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
    }

    protected void wallExtraID(ItemLike wall, ItemLike material, boolean hasStonecutting) {
        wallBuilder(wall, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(consumer, recipeID(getConversionRecipeName(wall, material)));
        if(hasStonecutting) {stonecuttingExtraID(wall, 1, material);}
    }

    protected void smelting(ItemLike result, ItemLike ingredient) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, 0.1f, 200).unlockedBy(getHasName(ingredient), has(ingredient)).save(consumer, getSmeltingRecipeID(result));
    }
    protected void recipeWoods(StairBlock stairs, SlabBlock slab, WallBlock wall, ItemLike material, ItemLike altMaterial){
        stair(stairs, material, false);
        slab(slab, material, false);
        wall(wall, material, false);
        wallExtraID(wall, altMaterial, false);
    }

    protected static ResourceLocation recipeID(ItemLike item) {return new ResourceLocation(BlockVariants.ModID, getItemName(item));}
    protected static ResourceLocation recipeID(String path) {return new ResourceLocation(BlockVariants.ModID, path);}
    protected static ResourceLocation getStonecuttingRecipeID(ItemLike item) {return new ResourceLocation(BlockVariants.ModID, "stonecutting/" + getItemName(item));}
    protected static ResourceLocation getConversionStonecuttingRecipeID(ItemLike result, ItemLike material) {return new ResourceLocation(BlockVariants.ModID, "stonecutting/" + getConversionRecipeName(result, material));}
    protected static ResourceLocation getSmeltingRecipeID(ItemLike item) {return new ResourceLocation(BlockVariants.ModID, "smelting/" + getItemName(item));}
}