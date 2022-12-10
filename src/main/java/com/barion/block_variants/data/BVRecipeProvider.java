package com.barion.block_variants.data;

import com.ametrinstudios.ametrin.datagen.ExtendedRecipeProvider;
import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class BVRecipeProvider extends ExtendedRecipeProvider {
    public BVRecipeProvider(PackOutput packOutput) {super(packOutput, BlockVariants.ModID);}

    @Override @ParametersAreNonnullByDefault
    protected void buildRecipes(Consumer<FinishedRecipe> consumer){
        wall(consumer, BVBlocks.PolishedGraniteWall.get(), Blocks.POLISHED_GRANITE, Blocks.GRANITE, Blocks.GRANITE_WALL);
        wall(consumer, BVBlocks.PolishedDioriteWall.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, Blocks.DIORITE_WALL);
        wall(consumer, BVBlocks.PolishedAndesiteWall.get(), Blocks.POLISHED_ANDESITE, Blocks.ANDESITE, Blocks.ANDESITE_WALL);

        smelting(consumer, Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS);
        smelting(consumer, Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
        wall(consumer, BVBlocks.StoneWall.get(), Blocks.STONE, true);
        smelting(consumer, BVBlocks.StoneWall.get(), Blocks.COBBLESTONE_WALL);
        stairs(consumer, BVBlocks.SmoothStoneStairs.get(), Blocks.SMOOTH_STONE, true);
        smelting(consumer, BVBlocks.SmoothStoneStairs.get(), Blocks.STONE_STAIRS);
        smelting(consumer, Blocks.SMOOTH_STONE_SLAB, Blocks.STONE_SLAB);
        wall(consumer, BVBlocks.SmoothStoneWall.get(), Blocks.SMOOTH_STONE, true);
        smelting(consumer, BVBlocks.SmoothStoneWall.get(), BVBlocks.StoneWall.get());

        stairs(consumer, BVBlocks.CutSandstoneStairs.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS);
        stairs(consumer, BVBlocks.CutRedSandstoneStairs.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS);
        wall(consumer, BVBlocks.CutSandstoneWall.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_WALL);
        wall(consumer, BVBlocks.CutRedSandstoneWall.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_WALL);

        wall(consumer, BVBlocks.QuartzWall.get(), Blocks.QUARTZ_BLOCK, true);
        stairs(consumer, BVBlocks.QuartzBrickStairs.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(consumer, BVBlocks.QuartzBrickSlab.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(consumer, BVBlocks.QuartzBrickWall.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, BVBlocks.QuartzWall.get());
        smelting(consumer, Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.QUARTZ_STAIRS);
        smelting(consumer, Blocks.SMOOTH_QUARTZ_SLAB, Blocks.QUARTZ_SLAB);
        wall(consumer, BVBlocks.SmoothQuartzWall.get(), Blocks.SMOOTH_QUARTZ, true);
        smelting(consumer, BVBlocks.SmoothQuartzWall.get(), BVBlocks.QuartzWall.get());
        stairs(consumer, BVBlocks.ChiseledQuartzBlockStairs.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(consumer, BVBlocks.Chiseled_Quartz_Block_Slab.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(consumer, BVBlocks.Chiseled_Quartz_Block_Wall.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, BVBlocks.QuartzWall.get());

        wall(consumer, BVBlocks.Prismarine_Brick_Wall.get(), Blocks.PRISMARINE_BRICKS, true);
        wall(consumer, BVBlocks.Dark_Prismarine_Wall.get(), Blocks.DARK_PRISMARINE, true);
        all(consumer, BVBlocks.NetherrackStairs.get(), BVBlocks.Netherrack_Slab.get(), BVBlocks.Netherrack_Wall.get(), Blocks.NETHERRACK, true);
        all(consumer, BVBlocks.EndStoneStairs.get(), BVBlocks.End_Stone_Slab.get(), BVBlocks.End_Stone_Wall.get(), Blocks.END_STONE, true);
        wall(consumer, BVBlocks.Purpur_Wall.get(), Blocks.PURPUR_BLOCK, true);

        all(consumer, BVBlocks.CrackedPolishedBlackstoneBrickStairs.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, true);
        smelting(consumer, BVBlocks.CrackedPolishedBlackstoneBrickStairs.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        smelting(consumer, BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
        smelting(consumer, BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(), Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.POLISHED_BLACKSTONE_STAIRS);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.POLISHED_BLACKSTONE_SLAB);
        stonecutting(consumer, RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(consumer, RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(consumer, RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.POLISHED_BLACKSTONE_WALL);

        all(consumer, BVBlocks.Basalt_Stairs.get(), BVBlocks.Basalt_Slab.get(), BVBlocks.Basalt_Wall.get(), Blocks.BASALT, true);
        stairs(consumer, BVBlocks.Polished_Basalt_Stairs.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.Basalt_Stairs.get());
        slab(consumer, BVBlocks.Polished_Basalt_Slab.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.Basalt_Slab.get());
        wall(consumer, BVBlocks.Polished_Basalt_Wall.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.Basalt_Wall.get());

        all(consumer, BVBlocks.Terracotta_Stairs.get(), BVBlocks.Terracotta_Slab.get(), BVBlocks.Terracotta_Wall.get(), Blocks.TERRACOTTA, true);
        all(consumer, BVBlocks.White_Terracotta_Stairs.get(), BVBlocks.White_Terracotta_Slab.get(), BVBlocks.White_Terracotta_Wall.get(), Blocks.WHITE_TERRACOTTA, true);
        all(consumer, BVBlocks.Orange_Terracotta_Stairs.get(), BVBlocks.Orange_Terracotta_Slab.get(), BVBlocks.Orange_Terracotta_Wall.get(), Blocks.ORANGE_TERRACOTTA, true);
        all(consumer, BVBlocks.Magenta_Terracotta_Stairs.get(), BVBlocks.Magenta_Terracotta_Slab.get(), BVBlocks.Magenta_Terracotta_Wall.get(), Blocks.MAGENTA_TERRACOTTA, true);
        all(consumer, BVBlocks.Light_Blue_Terracotta_Stairs.get(), BVBlocks.Light_Blue_Terracotta_Slab.get(), BVBlocks.Light_Blue_Terracotta_Wall.get(), Blocks.LIGHT_BLUE_TERRACOTTA, true);
        all(consumer, BVBlocks.Yellow_Terracotta_Stairs.get(), BVBlocks.Yellow_Terracotta_Slab.get(), BVBlocks.Yellow_Terracotta_Wall.get(), Blocks.YELLOW_TERRACOTTA, true);
        all(consumer, BVBlocks.Lime_Terracotta_Stairs.get(), BVBlocks.Lime_Terracotta_Slab.get(), BVBlocks.Lime_Terracotta_Wall.get(), Blocks.LIME_TERRACOTTA, true);
        all(consumer, BVBlocks.Pink_Terracotta_Stairs.get(), BVBlocks.Pink_Terracotta_Slab.get(), BVBlocks.Pink_Terracotta_Wall.get(), Blocks.PINK_TERRACOTTA, true);
        all(consumer, BVBlocks.Gray_Terracotta_Stairs.get(), BVBlocks.Gray_Terracotta_Slab.get(), BVBlocks.Gray_Terracotta_Wall.get(), Blocks.GRAY_TERRACOTTA, true);
        all(consumer, BVBlocks.Light_Gray_Terracotta_Stairs.get(), BVBlocks.Light_Gray_Terracotta_Slab.get(), BVBlocks.Light_Gray_Terracotta_Wall.get(), Blocks.LIGHT_GRAY_TERRACOTTA, true);
        all(consumer, BVBlocks.Cyan_Terracotta_Stairs.get(), BVBlocks.Cyan_Terracotta_Slab.get(), BVBlocks.Cyan_Terracotta_Wall.get(), Blocks.CYAN_TERRACOTTA, true);
        all(consumer, BVBlocks.Purple_Terracotta_Stairs.get(), BVBlocks.Purple_Terracotta_Slab.get(), BVBlocks.Purple_Terracotta_Wall.get(), Blocks.PURPLE_TERRACOTTA, true);
        all(consumer, BVBlocks.Blue_Terracotta_Stairs.get(), BVBlocks.Blue_Terracotta_Slab.get(), BVBlocks.Blue_Terracotta_Wall.get(), Blocks.BLUE_TERRACOTTA, true);
        all(consumer, BVBlocks.Brown_Terracotta_Stairs.get(), BVBlocks.Brown_Terracotta_Slab.get(), BVBlocks.Brown_Terracotta_Wall.get(), Blocks.BROWN_TERRACOTTA, true);
        all(consumer, BVBlocks.Green_Terracotta_Stairs.get(), BVBlocks.Green_Terracotta_Slab.get(), BVBlocks.Green_Terracotta_Wall.get(), Blocks.GREEN_TERRACOTTA, true);
        all(consumer, BVBlocks.Red_Terracotta_Stairs.get(), BVBlocks.Red_Terracotta_Slab.get(), BVBlocks.Red_Terracotta_Wall.get(), Blocks.RED_TERRACOTTA, true);
        all(consumer, BVBlocks.Black_Terracotta_Stairs.get(), BVBlocks.Black_Terracotta_Slab.get(), BVBlocks.Black_Terracotta_Wall.get(), Blocks.BLACK_TERRACOTTA, true);

        all(consumer, BVBlocks.Dripstone_Block_Stairs.get(), BVBlocks.Dripstone_Block_Slab.get(), BVBlocks.Dripstone_Block_Wall.get(), Blocks.DRIPSTONE_BLOCK, true);
        all(consumer, BVBlocks.Amethyst_Block_Stairs.get(), BVBlocks.Amethyst_Block_Slab.get(), BVBlocks.Amethyst_Block_Wall.get(), Blocks.AMETHYST_BLOCK, false);

        stairSlab(consumer, BVBlocks.Oak_Log_Stairs.get(), BVBlocks.Oak_Log_Slab.get(), Blocks.OAK_LOG, false);
        stairSlab(consumer, BVBlocks.Spruce_Log_Stairs.get(), BVBlocks.Spruce_Log_Slab.get(), Blocks.SPRUCE_LOG, false);
        stairSlab(consumer, BVBlocks.Birch_Log_Stairs.get(), BVBlocks.Birch_Log_Slab.get(), Blocks.BIRCH_LOG, false);
        stairSlab(consumer, BVBlocks.Jungle_Log_Stairs.get(), BVBlocks.Jungle_Log_Slab.get(), Blocks.JUNGLE_LOG, false);
        stairSlab(consumer, BVBlocks.Acacia_Log_Stairs.get(), BVBlocks.Acacia_Log_Slab.get(), Blocks.ACACIA_LOG, false);
        stairSlab(consumer, BVBlocks.Dark_Oak_Log_Stairs.get(), BVBlocks.Dark_Oak_Log_Slab.get(), Blocks.DARK_OAK_LOG, false);
        stairSlab(consumer, BVBlocks.Mangrove_Log_Stairs.get(), BVBlocks.Mangrove_Log_Slab.get(), Blocks.MANGROVE_LOG, false);
        stairSlab(consumer, BVBlocks.Stripped_Oak_Log_Stairs.get(), BVBlocks.Stripped_Oak_Log_Slab.get(), Blocks.STRIPPED_OAK_LOG, false);
        stairSlab(consumer, BVBlocks.Stripped_Spruce_Log_Stairs.get(), BVBlocks.Stripped_Spruce_Log_Slab.get(), Blocks.STRIPPED_SPRUCE_LOG, false);
        stairSlab(consumer, BVBlocks.Stripped_Birch_Log_Stairs.get(), BVBlocks.Stripped_Birch_Log_Slab.get(), Blocks.STRIPPED_BIRCH_LOG, false);
        stairSlab(consumer, BVBlocks.Stripped_Jungle_Log_Stairs.get(), BVBlocks.Stripped_Jungle_Log_Slab.get(), Blocks.STRIPPED_JUNGLE_LOG, false);
        stairSlab(consumer, BVBlocks.Stripped_Acacia_Log_Stairs.get(), BVBlocks.Stripped_Acacia_Log_Slab.get(), Blocks.STRIPPED_ACACIA_LOG, false);
        stairSlab(consumer, BVBlocks.Stripped_Dark_Oak_Log_Stairs.get(), BVBlocks.Stripped_Dark_Oak_Log_Slab.get(), Blocks.STRIPPED_DARK_OAK_LOG, false);
        stairSlab(consumer, BVBlocks.Stripped_Mangrove_Log_Stairs.get(), BVBlocks.Stripped_Mangrove_Log_Slab.get(), Blocks.STRIPPED_MANGROVE_LOG, false);
        stairSlab(consumer, BVBlocks.Crimson_Stem_Stairs.get(), BVBlocks.Crimson_Stem_Slab.get(), Blocks.CRIMSON_STEM, false);
        stairSlab(consumer, BVBlocks.Warped_Stem_Stairs.get(), BVBlocks.Warped_Stem_Slab.get(), Blocks.WARPED_STEM, false);
        stairSlab(consumer, BVBlocks.Stripped_Crimson_Stem_Stairs.get(), BVBlocks.Stripped_Crimson_Stem_Slab.get(), Blocks.STRIPPED_CRIMSON_STEM, false);
        stairSlab(consumer, BVBlocks.Stripped_Warped_Stem_Stairs.get(), BVBlocks.Stripped_Warped_Stem_Slab.get(), Blocks.STRIPPED_WARPED_STEM, false);

        recipeWoods(consumer, BVBlocks.Oak_Wood_Stairs.get(), BVBlocks.Oak_Wood_Slab.get(), BVBlocks.Oak_Wood_Wall.get(), BVBlocks.Oak_Wood_Fence.get(), BVBlocks.Oak_Wood_FenceGate.get(), Blocks.OAK_WOOD, Blocks.OAK_LOG);
        recipeWoods(consumer, BVBlocks.Spruce_Wood_Stairs.get(), BVBlocks.Spruce_Wood_Slab.get(), BVBlocks.Spruce_Wood_Wall.get(), BVBlocks.Spruce_Wood_Fence.get(), BVBlocks.Spruce_Wood_FenceGate.get(), Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG);
        recipeWoods(consumer, BVBlocks.Birch_Wood_Stairs.get(), BVBlocks.Birch_Wood_Slab.get(), BVBlocks.Birch_Wood_Wall.get(), BVBlocks.Birch_Wood_Fence.get(), BVBlocks.Birch_Wood_FenceGate.get(), Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG);
        recipeWoods(consumer, BVBlocks.Jungle_Wood_Stairs.get(), BVBlocks.Jungle_Wood_Slab.get(), BVBlocks.Jungle_Wood_Wall.get(), BVBlocks.Jungle_Wood_Fence.get(), BVBlocks.Jungle_Wood_FenceGate.get(), Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG);
        recipeWoods(consumer, BVBlocks.Acacia_Wood_Stairs.get(), BVBlocks.Acacia_Wood_Slab.get(), BVBlocks.Acacia_Wood_Wall.get(), BVBlocks.Acacia_Wood_Fence.get(), BVBlocks.Acacia_Wood_FenceGate.get(), Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG);
        recipeWoods(consumer, BVBlocks.Dark_Oak_Wood_Stairs.get(), BVBlocks.Dark_Oak_Wood_Slab.get(), BVBlocks.Dark_Oak_Wood_Wall.get(), BVBlocks.Dark_Oak_Wood_Fence.get(), BVBlocks.Dark_Oak_Wood_FenceGate.get(), Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG);
        recipeWoods(consumer, BVBlocks.Mangrove_Wood_Stairs.get(), BVBlocks.Mangrove_Wood_Slab.get(), BVBlocks.Mangrove_Wood_Wall.get(), BVBlocks.Mangrove_Wood_Fence.get(), BVBlocks.Mangrove_Wood_FenceGate.get(), Blocks.MANGROVE_WOOD, Blocks.MANGROVE_LOG);
        recipeWoods(consumer, BVBlocks.Crimson_Hyphae_Stairs.get(), BVBlocks.Crimson_Hyphae_Slab.get(), BVBlocks.Crimson_Hyphae_Wall.get(), BVBlocks.Crimson_Hyphae_Fence.get(), BVBlocks.Crimson_Hyphae_FenceGate.get(), Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
        recipeWoods(consumer, BVBlocks.Warped_Hyphae_Stairs.get(), BVBlocks.Warped_Hyphae_Slab.get(), BVBlocks.Warped_Hyphae_Wall.get(), BVBlocks.Warped_Hyphae_Fence.get(), BVBlocks.Warped_Hyphae_FenceGate.get(), Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);
        recipeWoods(consumer, BVBlocks.Stripped_Oak_Wood_Stairs.get(), BVBlocks.Stripped_Oak_Wood_Slab.get(), BVBlocks.Stripped_Oak_Wood_Wall.get(), BVBlocks.Stripped_Oak_Wood_Fence.get(), BVBlocks.Stripped_Oak_Wood_FenceGate.get(), Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG);
        recipeWoods(consumer, BVBlocks.Stripped_Spruce_Wood_Stairs.get(), BVBlocks.Stripped_Spruce_Wood_Slab.get(), BVBlocks.Stripped_Spruce_Wood_Wall.get(), BVBlocks.Stripped_Spruce_Wood_Fence.get(), BVBlocks.Stripped_Spruce_Wood_FenceGate.get(), Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG);
        recipeWoods(consumer, BVBlocks.Stripped_Birch_Wood_Stairs.get(), BVBlocks.Stripped_Birch_Wood_Slab.get(), BVBlocks.Stripped_Birch_Wood_Wall.get(), BVBlocks.Stripped_Birch_Wood_Fence.get(), BVBlocks.Stripped_Birch_Wood_FenceGate.get(), Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG);
        recipeWoods(consumer, BVBlocks.Stripped_Jungle_Wood_Stairs.get(), BVBlocks.Stripped_Jungle_Wood_Slab.get(), BVBlocks.Stripped_Jungle_Wood_Wall.get(), BVBlocks.Stripped_Jungle_Wood_Fence.get(), BVBlocks.Stripped_Jungle_Wood_FenceGate.get(), Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG);
        recipeWoods(consumer, BVBlocks.Stripped_Acacia_Wood_Stairs.get(), BVBlocks.Stripped_Acacia_Wood_Slab.get(), BVBlocks.Stripped_Acacia_Wood_Wall.get(), BVBlocks.Stripped_Acacia_Wood_Fence.get(), BVBlocks.Stripped_Acacia_Wood_FenceGate.get(), Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG);
        recipeWoods(consumer, BVBlocks.Stripped_Dark_Oak_Wood_Stairs.get(), BVBlocks.Stripped_Dark_Oak_Wood_Slab.get(), BVBlocks.Stripped_Dark_Oak_Wood_Wall.get(), BVBlocks.Stripped_Dark_Oak_Wood_Fence.get(), BVBlocks.Stripped_Dark_Oak_Wood_FenceGate.get(), Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG);
        recipeWoods(consumer, BVBlocks.Stripped_Mangrove_Wood_Stairs.get(), BVBlocks.Stripped_Mangrove_Wood_Slab.get(), BVBlocks.Stripped_Mangrove_Wood_Wall.get(), BVBlocks.Stripped_Mangrove_Wood_Fence.get(), BVBlocks.Stripped_Mangrove_Wood_FenceGate.get(), Blocks.STRIPPED_MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_LOG);
        recipeWoods(consumer, BVBlocks.Stripped_Crimson_Hyphae_Stairs.get(), BVBlocks.Stripped_Crimson_Hyphae_Slab.get(), BVBlocks.Stripped_Crimson_Hyphae_Wall.get(), BVBlocks.Stripped_Crimson_Hyphae_Fence.get(), BVBlocks.Stripped_Crimson_Hyphae_FenceGate.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM);
        recipeWoods(consumer, BVBlocks.Stripped_Warped_Hyphae_Stairs.get(), BVBlocks.Stripped_Warped_Hyphae_Slab.get(), BVBlocks.Stripped_Warped_Hyphae_Wall.get(), BVBlocks.Stripped_Warped_Hyphae_Fence.get(), BVBlocks.Stripped_Warped_Hyphae_FenceGate.get(), Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM);

        all(consumer, BVBlocks.Calcite_Stairs.get(), BVBlocks.Calcite_Slab.get(), BVBlocks.Calcite_Wall.get(), Blocks.CALCITE, true);
        all(consumer, BVBlocks.Smooth_Basalt_Stairs.get(), BVBlocks.Smooth_Basalt_Slab.get(), BVBlocks.Smooth_Basalt_Wall.get(), Blocks.SMOOTH_BASALT, true);
        smelting(consumer, BVBlocks.Smooth_Basalt_Stairs.get(), BVBlocks.Basalt_Stairs.get());
        smelting(consumer, BVBlocks.Smooth_Basalt_Slab.get(), BVBlocks.Basalt_Slab.get());
        smelting(consumer, BVBlocks.Smooth_Basalt_Wall.get(), BVBlocks.Basalt_Wall.get());
        all(consumer, BVBlocks.Tuff_Stairs.get(), BVBlocks.Tuff_Slab.get(), BVBlocks.Tuff_Wall.get(), Blocks.TUFF, true);

        all(consumer, BVBlocks.Deepslate_Stairs.get(), BVBlocks.Deepslate_Slab.get(), BVBlocks.Deepslate_Wall.get(), Blocks.DEEPSLATE, true);
        all(consumer, BVBlocks.Cracked_Deepslate_Brick_Stairs.get(), BVBlocks.Cracked_Deepslate_Brick_Slab.get(), BVBlocks.Cracked_Deepslate_Brick_Wall.get(), Blocks.CRACKED_DEEPSLATE_BRICKS, true);
        all(consumer, BVBlocks.Cracked_Deepslate_Tile_Stairs.get(), BVBlocks.Cracked_Deepslate_Tile_Slab.get(), BVBlocks.Cracked_Deepslate_Tile_Wall.get(), Blocks.CRACKED_DEEPSLATE_TILES, true);

        netherFenceGate(consumer, BVBlocks.Nether_Brick_Fence_Gate.get(), Blocks.NETHER_BRICKS);
        all(consumer, BVBlocks.Cracked_Nether_Brick_Stairs.get(), BVBlocks.Cracked_Nether_Brick_Slab.get(), BVBlocks.Cracked_Nether_Brick_Wall.get(), Blocks.CRACKED_NETHER_BRICKS, true);
        netherFence(consumer, BVBlocks.Cracked_Nether_Brick_Fence.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFenceGate(consumer, BVBlocks.Cracked_Nether_Brick_Fence_Gate.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFence(consumer, BVBlocks.Red_Nether_Brick_Fence.get(), Blocks.RED_NETHER_BRICKS);
        netherFenceGate(consumer, BVBlocks.Red_Nether_Brick_Fence_Gate.get(), Blocks.RED_NETHER_BRICKS);

        all(consumer, BVBlocks.Obsidian_Stairs.get(), BVBlocks.Obsidian_Slab.get(), BVBlocks.Obsidian_Wall.get(), Blocks.OBSIDIAN, false);
        all(consumer, BVBlocks.Crying_Obsidian_Stairs.get(), BVBlocks.Crying_Obsidian_Slab.get(), BVBlocks.Crying_Obsidian_Wall.get(), Blocks.CRYING_OBSIDIAN, false);

        all(consumer, BVBlocks.White_Glazed_Terracotta_Stairs.get(), BVBlocks.White_Glazed_Terracotta_Slab.get(), BVBlocks.White_Glazed_Terracotta_Wall.get(), Blocks.WHITE_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.White_Glazed_Terracotta_Stairs.get(), BVBlocks.White_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.White_Glazed_Terracotta_Slab.get(), BVBlocks.White_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.White_Glazed_Terracotta_Wall.get(), BVBlocks.White_Terracotta_Wall.get());
        all(consumer, BVBlocks.Orange_Glazed_Terracotta_Stairs.get(), BVBlocks.Orange_Glazed_Terracotta_Slab.get(), BVBlocks.Orange_Glazed_Terracotta_Wall.get(), Blocks.ORANGE_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Orange_Glazed_Terracotta_Stairs.get(), BVBlocks.Orange_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Orange_Glazed_Terracotta_Slab.get(), BVBlocks.Orange_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Orange_Glazed_Terracotta_Wall.get(), BVBlocks.Orange_Terracotta_Wall.get());
        all(consumer, BVBlocks.Magenta_Glazed_Terracotta_Stairs.get(), BVBlocks.Magenta_Glazed_Terracotta_Slab.get(), BVBlocks.Magenta_Glazed_Terracotta_Wall.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Magenta_Glazed_Terracotta_Stairs.get(), BVBlocks.Magenta_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Magenta_Glazed_Terracotta_Slab.get(), BVBlocks.Magenta_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Magenta_Glazed_Terracotta_Wall.get(), BVBlocks.Magenta_Terracotta_Wall.get());
        all(consumer, BVBlocks.Light_Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Blue_Glazed_Terracotta_Wall.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Light_Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Blue_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Light_Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Blue_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Light_Blue_Glazed_Terracotta_Wall.get(), BVBlocks.Light_Blue_Terracotta_Wall.get());
        all(consumer, BVBlocks.Yellow_Glazed_Terracotta_Stairs.get(), BVBlocks.Yellow_Glazed_Terracotta_Slab.get(), BVBlocks.Yellow_Glazed_Terracotta_Wall.get(), Blocks.YELLOW_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Yellow_Glazed_Terracotta_Stairs.get(), BVBlocks.Yellow_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Yellow_Glazed_Terracotta_Slab.get(), BVBlocks.Yellow_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Yellow_Glazed_Terracotta_Wall.get(), BVBlocks.Yellow_Terracotta_Wall.get());
        all(consumer, BVBlocks.Lime_Glazed_Terracotta_Stairs.get(), BVBlocks.Lime_Glazed_Terracotta_Slab.get(), BVBlocks.Lime_Glazed_Terracotta_Wall.get(), Blocks.LIME_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Lime_Glazed_Terracotta_Stairs.get(), BVBlocks.Lime_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Lime_Glazed_Terracotta_Slab.get(), BVBlocks.Lime_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Lime_Glazed_Terracotta_Wall.get(), BVBlocks.Lime_Terracotta_Wall.get());
        all(consumer, BVBlocks.Pink_Glazed_Terracotta_Stairs.get(), BVBlocks.Pink_Glazed_Terracotta_Slab.get(), BVBlocks.Pink_Glazed_Terracotta_Wall.get(), Blocks.PINK_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Pink_Glazed_Terracotta_Stairs.get(), BVBlocks.Pink_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Pink_Glazed_Terracotta_Slab.get(), BVBlocks.Pink_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Pink_Glazed_Terracotta_Wall.get(), BVBlocks.Pink_Terracotta_Wall.get());
        all(consumer, BVBlocks.Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Gray_Glazed_Terracotta_Wall.get(), Blocks.GRAY_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Gray_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Gray_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Gray_Glazed_Terracotta_Wall.get(), BVBlocks.Gray_Terracotta_Wall.get());
        all(consumer, BVBlocks.Light_Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Gray_Glazed_Terracotta_Wall.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Light_Gray_Glazed_Terracotta_Stairs.get(), BVBlocks.Light_Gray_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Light_Gray_Glazed_Terracotta_Slab.get(), BVBlocks.Light_Gray_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Light_Gray_Glazed_Terracotta_Wall.get(), BVBlocks.Light_Gray_Terracotta_Wall.get());
        all(consumer, BVBlocks.Cyan_Glazed_Terracotta_Stairs.get(), BVBlocks.Cyan_Glazed_Terracotta_Slab.get(), BVBlocks.Cyan_Glazed_Terracotta_Wall.get(), Blocks.CYAN_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Cyan_Glazed_Terracotta_Stairs.get(), BVBlocks.Cyan_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Cyan_Glazed_Terracotta_Slab.get(), BVBlocks.Cyan_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Cyan_Glazed_Terracotta_Wall.get(), BVBlocks.Cyan_Terracotta_Wall.get());
        all(consumer, BVBlocks.Purple_Glazed_Terracotta_Stairs.get(), BVBlocks.Purple_Glazed_Terracotta_Slab.get(), BVBlocks.Purple_Glazed_Terracotta_Wall.get(), Blocks.PURPLE_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Purple_Glazed_Terracotta_Stairs.get(), BVBlocks.Purple_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Purple_Glazed_Terracotta_Slab.get(), BVBlocks.Purple_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Purple_Glazed_Terracotta_Wall.get(), BVBlocks.Purple_Terracotta_Wall.get());
        all(consumer, BVBlocks.Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Blue_Glazed_Terracotta_Wall.get(), Blocks.BLUE_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Blue_Glazed_Terracotta_Stairs.get(), BVBlocks.Blue_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Blue_Glazed_Terracotta_Slab.get(), BVBlocks.Blue_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Blue_Glazed_Terracotta_Wall.get(), BVBlocks.Blue_Terracotta_Wall.get());
        all(consumer, BVBlocks.Brown_Glazed_Terracotta_Stairs.get(), BVBlocks.Brown_Glazed_Terracotta_Slab.get(), BVBlocks.Brown_Glazed_Terracotta_Wall.get(), Blocks.BROWN_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Brown_Glazed_Terracotta_Stairs.get(), BVBlocks.Brown_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Brown_Glazed_Terracotta_Slab.get(), BVBlocks.Brown_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Brown_Glazed_Terracotta_Wall.get(), BVBlocks.Brown_Terracotta_Wall.get());
        all(consumer, BVBlocks.Green_Glazed_Terracotta_Stairs.get(), BVBlocks.Green_Glazed_Terracotta_Slab.get(), BVBlocks.Green_Glazed_Terracotta_Wall.get(), Blocks.GREEN_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Green_Glazed_Terracotta_Stairs.get(), BVBlocks.Green_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Green_Glazed_Terracotta_Slab.get(), BVBlocks.Green_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Green_Glazed_Terracotta_Wall.get(), BVBlocks.Green_Terracotta_Wall.get());
        all(consumer, BVBlocks.Red_Glazed_Terracotta_Stairs.get(), BVBlocks.Red_Glazed_Terracotta_Slab.get(), BVBlocks.Red_Glazed_Terracotta_Wall.get(), Blocks.RED_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Red_Glazed_Terracotta_Stairs.get(), BVBlocks.Red_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Red_Glazed_Terracotta_Slab.get(), BVBlocks.Red_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Red_Glazed_Terracotta_Wall.get(), BVBlocks.Red_Terracotta_Wall.get());
        all(consumer, BVBlocks.Black_Glazed_Terracotta_Stairs.get(), BVBlocks.Black_Glazed_Terracotta_Slab.get(), BVBlocks.Black_Glazed_Terracotta_Wall.get(), Blocks.BLACK_GLAZED_TERRACOTTA, true);
        smelting(consumer, BVBlocks.Black_Glazed_Terracotta_Stairs.get(), BVBlocks.Black_Terracotta_Stairs.get());
        smelting(consumer, BVBlocks.Black_Glazed_Terracotta_Slab.get(), BVBlocks.Black_Terracotta_Slab.get());
        smelting(consumer, BVBlocks.Black_Glazed_Terracotta_Wall.get(), BVBlocks.Black_Terracotta_Wall.get());

        all(consumer, BVBlocks.WhiteWoolStairs.get(), BVBlocks.WhiteWoolSlab.get(), BVBlocks.WhiteWoolWall.get(), Blocks.WHITE_WOOL, false);
        all(consumer, BVBlocks.OrangeWoolStairs.get(), BVBlocks.OrangeWoolSlab.get(), BVBlocks.OrangeWoolWall.get(), Blocks.ORANGE_WOOL, false);
        all(consumer, BVBlocks.MagentaWoolStairs.get(), BVBlocks.MagentaWoolSlab.get(), BVBlocks.MagentaWoolWall.get(), Blocks.MAGENTA_WOOL, false);
        all(consumer, BVBlocks.LightBlueWoolStairs.get(), BVBlocks.LightBlueWoolSlab.get(), BVBlocks.LightBlueWoolWall.get(), Blocks.LIGHT_BLUE_WOOL, false);
        all(consumer, BVBlocks.YellowWoolStairs.get(), BVBlocks.YellowWoolSlab.get(), BVBlocks.YellowWoolWall.get(), Blocks.YELLOW_WOOL, false);
        all(consumer, BVBlocks.LimeWoolStairs.get(), BVBlocks.LimeWoolSlab.get(), BVBlocks.LimeWoolWall.get(), Blocks.LIME_WOOL, false);
        all(consumer, BVBlocks.PinkWoolStairs.get(), BVBlocks.PinkWoolSlab.get(), BVBlocks.PinkWoolWall.get(), Blocks.PINK_WOOL, false);
        all(consumer, BVBlocks.GrayWoolStairs.get(), BVBlocks.GrayWoolSlab.get(), BVBlocks.GrayWoolWall.get(), Blocks.GRAY_WOOL, false);
        all(consumer, BVBlocks.LightGrayWoolStairs.get(), BVBlocks.LightGrayWoolSlab.get(), BVBlocks.LightGrayWoolWall.get(), Blocks.LIGHT_GRAY_WOOL, false);
        all(consumer, BVBlocks.CyanWoolStairs.get(), BVBlocks.CyanWoolSlab.get(), BVBlocks.CyanWoolWall.get(), Blocks.CYAN_WOOL, false);
        all(consumer, BVBlocks.PurpleWoolStairs.get(), BVBlocks.PurpleWoolSlab.get(), BVBlocks.PurpleWoolWall.get(), Blocks.PURPLE_WOOL, false);
        all(consumer, BVBlocks.BlueWoolStairs.get(), BVBlocks.BlueWoolSlab.get(), BVBlocks.BlueWoolWall.get(), Blocks.BLUE_WOOL, false);
        all(consumer, BVBlocks.BrownWoolStairs.get(), BVBlocks.BrownWoolSlab.get(), BVBlocks.BrownWoolWall.get(), Blocks.BROWN_WOOL, false);
        all(consumer, BVBlocks.GreenWoolStairs.get(), BVBlocks.GreenWoolSlab.get(), BVBlocks.GreenWoolWall.get(), Blocks.GREEN_WOOL, false);
        all(consumer, BVBlocks.RedWoolStairs.get(), BVBlocks.RedWoolSlab.get(), BVBlocks.RedWoolWall.get(), Blocks.RED_WOOL, false);
        all(consumer, BVBlocks.BlackWoolStairs.get(), BVBlocks.BlackWoolSlab.get(), BVBlocks.BlackWoolWall.get(), Blocks.BLACK_WOOL, false);

        all(consumer, BVBlocks.PackedMudStairs.get(), BVBlocks.PackedMudSlab.get(), BVBlocks.PackedMudWall.get(), Blocks.PACKED_MUD, true);

        {
            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.DROPPER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.REDSTONE)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("#+#")
                    .unlockedBy("has_redstone", has(Items.REDSTONE))
                    .save(consumer, recipeID(Blocks.DROPPER));

            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.DISPENSER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.REDSTONE)
                    .define('(', Items.BOW)
                    .pattern("###")
                    .pattern("#(#")
                    .pattern("#+#")
                    .unlockedBy("has_bow", has(Items.BOW))
                    .save(consumer, recipeID(Blocks.DISPENSER));

            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.FURNACE, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Blocks.FURNACE));

            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,Blocks.STONECUTTER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.IRON_INGOT)
                    .pattern(" + ")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Blocks.STONECUTTER));

            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.LEVER, 1)
                    .define('|', Items.STICK)
                    .define('#', BVTags.Items.StoneCrafting)
                    .pattern("|")
                    .pattern("#")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Blocks.LEVER));

            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.PISTON, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('W', ItemTags.PLANKS)
                    .define('N', Items.IRON_INGOT)
                    .define('I', Items.REDSTONE)
                    .pattern("WWW")
                    .pattern("#N#")
                    .pattern("#I#")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Blocks.PISTON));
        } //Recipe overrides
    }

    protected void all(Consumer<FinishedRecipe> consumer, StairBlock stair, SlabBlock slab, WallBlock wall, ItemLike material, boolean hasStonecutting){
        stairs(consumer, stair, material, hasStonecutting);
        slab(consumer, slab, material, hasStonecutting);
        wall(consumer, wall, material, hasStonecutting);
    }
    protected void stairSlab(Consumer<FinishedRecipe> consumer, StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting){
        stairs(consumer, stair, material, hasStonecutting);
        slab(consumer, slab, material, hasStonecutting);
    }
    protected void smelting(Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingredient) {
        smelting(consumer, RecipeCategory.MISC, result, ingredient, 0.1f, 200);
    }
    protected void recipeWoods(Consumer<FinishedRecipe> consumer, StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material, ItemLike altMaterial){
        stairs(consumer, stairs, material, false);
        slab(consumer, slab, material, false);
        wall(consumer, wall, material, false);
        wall(consumer, wall, altMaterial, false);
        fence(consumer, fence, material);
        fence(consumer, fence, altMaterial);
        fenceGate(consumer, fenceGate, material);
        fenceGate(consumer, fenceGate, altMaterial);
    }

    protected static ResourceLocation recipeID(ItemLike item) {return new ResourceLocation(BlockVariants.ModID, getItemName(item));}
}