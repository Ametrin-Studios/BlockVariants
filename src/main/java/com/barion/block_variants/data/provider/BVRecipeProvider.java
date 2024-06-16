package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

public final class BVRecipeProvider extends ExtendedRecipeProvider {
    public BVRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {super(packOutput, BlockVariants.MOD_ID, lookupProvider);}

    @Override @ParametersAreNonnullByDefault
    protected void buildRecipes(RecipeOutput output){
        wall(output, BVBlocks.POLISHED_GRANITE_WALL.get(), Blocks.POLISHED_GRANITE, Blocks.GRANITE, Blocks.GRANITE_WALL);
        wall(output, BVBlocks.POLISHED_DIORITE_WALL.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, Blocks.DIORITE_WALL);
        wall(output, BVBlocks.POLISHED_ANDESITE_WALL.get(), Blocks.POLISHED_ANDESITE, Blocks.ANDESITE, Blocks.ANDESITE_WALL);

        smelting(output, Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS);
        smelting(output, Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
        wall(output, BVBlocks.STONE_WALL.get(), Blocks.STONE, true);
        smelting(output, BVBlocks.STONE_WALL.get(), Blocks.COBBLESTONE_WALL);
        stairs(output, BVBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE, true);
        smelting(output, BVBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.STONE_STAIRS);
        smelting(output, Blocks.SMOOTH_STONE_SLAB, Blocks.STONE_SLAB);
        wall(output, BVBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE, true);
        smelting(output, BVBlocks.SMOOTH_STONE_WALL.get(), BVBlocks.STONE_WALL.get());

        stairs(output, BVBlocks.CUT_SANDSTONE_STAIRS.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS);
        stairs(output, BVBlocks.CUT_RED_SANDSTONE_STAIRS.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS);
        wall(output, BVBlocks.CUT_SANDSTONE_WALL.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_WALL);
        wall(output, BVBlocks.CUT_RED_SANDSTONE_WALL.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_WALL);

        wall(output, BVBlocks.QUARTZ_WALL.get(), Blocks.QUARTZ_BLOCK, true);
        stairs(output, BVBlocks.QUARTZ_BRICK_STAIRS.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(output, BVBlocks.QUARTZ_BRICK_SLAB.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(output, BVBlocks.QUARTZ_BRICK_WALL.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, BVBlocks.QUARTZ_WALL.get());
        smelting(output, Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.QUARTZ_STAIRS);
        smelting(output, Blocks.SMOOTH_QUARTZ_SLAB, Blocks.QUARTZ_SLAB);
        wall(output, BVBlocks.SMOOTH_QUARTZ_WALL.get(), Blocks.SMOOTH_QUARTZ, true);
        smelting(output, BVBlocks.SMOOTH_QUARTZ_WALL.get(), BVBlocks.QUARTZ_WALL.get());
        stairs(output, BVBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(output, BVBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(output, BVBlocks.CHISELED_QUARTZ_BLOCK_WALL.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, BVBlocks.QUARTZ_WALL.get());

        wall(output, BVBlocks.PRISMARINE_BRICK_WALL.get(), Blocks.PRISMARINE_BRICKS, true);
        wall(output, BVBlocks.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE, true);
        all(output, BVBlocks.NETHERRACK_STAIRS.get(), BVBlocks.NETHERRACK_SLAB.get(), BVBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK, true);
        all(output, BVBlocks.END_STONE_STAIRS.get(), BVBlocks.END_STONE_SLAB.get(), BVBlocks.END_STONE_WALL.get(), Blocks.END_STONE, true);
        wall(output, BVBlocks.PURPUR_WALL.get(), Blocks.PURPUR_BLOCK, true);

        all(output, BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, true);
        smelting(output, BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        smelting(output, BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
        smelting(output, BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
        stonecutting(output, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(output, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(output, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.POLISHED_BLACKSTONE_STAIRS);
        stonecutting(output, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(output, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(output, RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.POLISHED_BLACKSTONE_SLAB);
        stonecutting(output, RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(output, RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(output, RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.POLISHED_BLACKSTONE_WALL);

        all(output, BVBlocks.BASALT_STAIRS.get(), BVBlocks.BASALT_SLAB.get(), BVBlocks.BASALT_WALL.get(), Blocks.BASALT, true);
        stairs(output, BVBlocks.POLISHED_BASALT_STAIRS.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.BASALT_STAIRS.get());
        slab(output, BVBlocks.POLISHED_BASALT_SLAB.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.BASALT_SLAB.get());
        wall(output, BVBlocks.POLISHED_BASALT_WALL.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.BASALT_WALL.get());

        all(output, BVBlocks.TERRACOTTA_STAIRS.get(), BVBlocks.TERRACOTTA_SLAB.get(), BVBlocks.TERRACOTTA_WALL.get(), Blocks.TERRACOTTA, true);
        all(output, BVBlocks.WHITE_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_TERRACOTTA_WALL.get(), Blocks.WHITE_TERRACOTTA, true);
        all(output, BVBlocks.ORANGE_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_TERRACOTTA_WALL.get(), Blocks.ORANGE_TERRACOTTA, true);
        all(output, BVBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_TERRACOTTA_WALL.get(), Blocks.MAGENTA_TERRACOTTA, true);
        all(output, BVBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_TERRACOTTA, true);
        all(output, BVBlocks.YELLOW_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_TERRACOTTA_WALL.get(), Blocks.YELLOW_TERRACOTTA, true);
        all(output, BVBlocks.LIME_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_TERRACOTTA_SLAB.get(), BVBlocks.LIME_TERRACOTTA_WALL.get(), Blocks.LIME_TERRACOTTA, true);
        all(output, BVBlocks.PINK_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_TERRACOTTA_SLAB.get(), BVBlocks.PINK_TERRACOTTA_WALL.get(), Blocks.PINK_TERRACOTTA, true);
        all(output, BVBlocks.GRAY_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_TERRACOTTA_WALL.get(), Blocks.GRAY_TERRACOTTA, true);
        all(output, BVBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_TERRACOTTA, true);
        all(output, BVBlocks.CYAN_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_TERRACOTTA_WALL.get(), Blocks.CYAN_TERRACOTTA, true);
        all(output, BVBlocks.PURPLE_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_TERRACOTTA_WALL.get(), Blocks.PURPLE_TERRACOTTA, true);
        all(output, BVBlocks.BLUE_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_TERRACOTTA_WALL.get(), Blocks.BLUE_TERRACOTTA, true);
        all(output, BVBlocks.BROWN_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_TERRACOTTA_WALL.get(), Blocks.BROWN_TERRACOTTA, true);
        all(output, BVBlocks.GREEN_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_TERRACOTTA_WALL.get(), Blocks.GREEN_TERRACOTTA, true);
        all(output, BVBlocks.RED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_TERRACOTTA_SLAB.get(), BVBlocks.RED_TERRACOTTA_WALL.get(), Blocks.RED_TERRACOTTA, true);
        all(output, BVBlocks.BLACK_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_TERRACOTTA_WALL.get(), Blocks.BLACK_TERRACOTTA, true);

        all(output, BVBlocks.DRIPSTONE_BLOCK_STAIRS.get(), BVBlocks.DRIPSTONE_BLOCK_SLAB.get(), BVBlocks.DRIPSTONE_BLOCK_WALL.get(), Blocks.DRIPSTONE_BLOCK, true);
        all(output, BVBlocks.AMETHYST_BLOCK_STAIRS.get(), BVBlocks.AMETHYST_BLOCK_SLAB.get(), BVBlocks.AMETHYST_BLOCK_WALL.get(), Blocks.AMETHYST_BLOCK, false);

        stairSlab(output, BVBlocks.OAK_LOG_STAIRS.get(), BVBlocks.OAK_LOG_SLAB.get(), Blocks.OAK_LOG, false);
        stairSlab(output, BVBlocks.SPRUCE_LOG_STAIRS.get(), BVBlocks.SPRUCE_LOG_SLAB.get(), Blocks.SPRUCE_LOG, false);
        stairSlab(output, BVBlocks.BIRCH_LOG_STAIRS.get(), BVBlocks.BIRCH_LOG_SLAB.get(), Blocks.BIRCH_LOG, false);
        stairSlab(output, BVBlocks.JUNGLE_LOG_STAIRS.get(), BVBlocks.JUNGLE_LOG_SLAB.get(), Blocks.JUNGLE_LOG, false);
        stairSlab(output, BVBlocks.ACACIA_LOG_STAIRS.get(), BVBlocks.ACACIA_LOG_SLAB.get(), Blocks.ACACIA_LOG, false);
        stairSlab(output, BVBlocks.DARK_OAK_LOG_STAIRS.get(), BVBlocks.DARK_OAK_LOG_SLAB.get(), Blocks.DARK_OAK_LOG, false);
        stairSlab(output, BVBlocks.MANGROVE_LOG_STAIRS.get(), BVBlocks.MANGROVE_LOG_SLAB.get(), Blocks.MANGROVE_LOG, false);
        stairSlab(output, BVBlocks.CHERRY_LOG_STAIRS.get(), BVBlocks.CHERRY_LOG_SLAB.get(), Blocks.CHERRY_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_OAK_LOG_STAIRS.get(), BVBlocks.STRIPPED_OAK_LOG_SLAB.get(), Blocks.STRIPPED_OAK_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get(), BVBlocks.STRIPPED_SPRUCE_LOG_SLAB.get(), Blocks.STRIPPED_SPRUCE_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_BIRCH_LOG_STAIRS.get(), BVBlocks.STRIPPED_BIRCH_LOG_SLAB.get(), Blocks.STRIPPED_BIRCH_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get(), BVBlocks.STRIPPED_JUNGLE_LOG_SLAB.get(), Blocks.STRIPPED_JUNGLE_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_ACACIA_LOG_STAIRS.get(), BVBlocks.STRIPPED_ACACIA_LOG_SLAB.get(), Blocks.STRIPPED_ACACIA_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get(), BVBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get(), Blocks.STRIPPED_DARK_OAK_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get(), BVBlocks.STRIPPED_MANGROVE_LOG_SLAB.get(), Blocks.STRIPPED_MANGROVE_LOG, false);
        stairSlab(output, BVBlocks.STRIPPED_CHERRY_LOG_STAIRS.get(), BVBlocks.STRIPPED_CHERRY_LOG_SLAB.get(), Blocks.STRIPPED_CHERRY_LOG, false);
        stairSlab(output, BVBlocks.CRIMSON_STEM_STAIRS.get(), BVBlocks.CRIMSON_STEM_SLAB.get(), Blocks.CRIMSON_STEM, false);
        stairSlab(output, BVBlocks.WARPED_STEM_STAIRS.get(), BVBlocks.WARPED_STEM_SLAB.get(), Blocks.WARPED_STEM, false);
        stairSlab(output, BVBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get(), BVBlocks.STRIPPED_CRIMSON_STEM_SLAB.get(), Blocks.STRIPPED_CRIMSON_STEM, false);
        stairSlab(output, BVBlocks.STRIPPED_WARPED_STEM_STAIRS.get(), BVBlocks.STRIPPED_WARPED_STEM_SLAB.get(), Blocks.STRIPPED_WARPED_STEM, false);

        recipeWoods(output, BVBlocks.OAK_WOOD_STAIRS.get(), BVBlocks.OAK_WOOD_SLAB.get(), BVBlocks.OAK_WOOD_WALL.get(), BVBlocks.OAK_WOOD_FENCE.get(), BVBlocks.OAK_WOOD_FENCE_GATE.get(), Blocks.OAK_WOOD, Blocks.OAK_LOG);
        recipeWoods(output, BVBlocks.SPRUCE_WOOD_STAIRS.get(), BVBlocks.SPRUCE_WOOD_SLAB.get(), BVBlocks.SPRUCE_WOOD_WALL.get(), BVBlocks.SPRUCE_WOOD_FENCE.get(), BVBlocks.SPRUCE_WOOD_FENCE_GATE.get(), Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG);
        recipeWoods(output, BVBlocks.BIRCH_WOOD_STAIRS.get(), BVBlocks.BIRCH_WOOD_SLAB.get(), BVBlocks.BIRCH_WOOD_WALL.get(), BVBlocks.BIRCH_WOOD_FENCE.get(), BVBlocks.BIRCH_WOOD_FENCE_GATE.get(), Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG);
        recipeWoods(output, BVBlocks.JUNGLE_WOOD_STAIRS.get(), BVBlocks.JUNGLE_WOOD_SLAB.get(), BVBlocks.JUNGLE_WOOD_WALL.get(), BVBlocks.JUNGLE_WOOD_FENCE.get(), BVBlocks.JUNGLE_WOOD_FENCE_GATE.get(), Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG);
        recipeWoods(output, BVBlocks.ACACIA_WOOD_STAIRS.get(), BVBlocks.ACACIA_WOOD_SLAB.get(), BVBlocks.ACACIA_WOOD_WALL.get(), BVBlocks.ACACIA_WOOD_FENCE.get(), BVBlocks.ACACIA_WOOD_FENCE_GATE.get(), Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG);
        recipeWoods(output, BVBlocks.DARK_OAK_WOOD_STAIRS.get(), BVBlocks.DARK_OAK_WOOD_SLAB.get(), BVBlocks.DARK_OAK_WOOD_WALL.get(), BVBlocks.DARK_OAK_WOOD_FENCE.get(), BVBlocks.DARK_OAK_WOOD_FENCE_GATE.get(), Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG);
        recipeWoods(output, BVBlocks.MANGROVE_WOOD_STAIRS.get(), BVBlocks.MANGROVE_WOOD_SLAB.get(), BVBlocks.MANGROVE_WOOD_WALL.get(), BVBlocks.MANGROVE_WOOD_FENCE.get(), BVBlocks.MANGROVE_WOOD_FENCE_GATE.get(), Blocks.MANGROVE_WOOD, Blocks.MANGROVE_LOG);
        recipeWoods(output, BVBlocks.CHERRY_WOOD_STAIRS.get(), BVBlocks.CHERRY_WOOD_SLAB.get(), BVBlocks.CHERRY_WOOD_WALL.get(), BVBlocks.CHERRY_WOOD_FENCE.get(), BVBlocks.CHERRY_WOOD_FENCE_GATE.get(), Blocks.CHERRY_WOOD, Blocks.CHERRY_LOG);
        recipeWoods(output, BVBlocks.BAMBOO_BLOCK_STAIRS.get(), BVBlocks.BAMBOO_BLOCK_SLAB.get(), BVBlocks.BAMBOO_BLOCK_WALL.get(), BVBlocks.BAMBOO_BLOCK_FENCE.get(), BVBlocks.BAMBOO_BLOCK_FENCE_GATE.get(), Blocks.BAMBOO_BLOCK);
        recipeWoods(output, BVBlocks.CRIMSON_HYPHAE_STAIRS.get(), BVBlocks.CRIMSON_HYPHAE_SLAB.get(), BVBlocks.CRIMSON_HYPHAE_WALL.get(), BVBlocks.CRIMSON_HYPHAE_FENCE.get(), BVBlocks.CRIMSON_HYPHAE_FENCE_GATE.get(), Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
        recipeWoods(output, BVBlocks.WARPED_HYPHAE_STAIRS.get(), BVBlocks.WARPED_HYPHAE_SLAB.get(), BVBlocks.WARPED_HYPHAE_WALL.get(), BVBlocks.WARPED_HYPHAE_FENCE.get(), BVBlocks.WARPED_HYPHAE_FENCE_GATE.get(), Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);
        recipeWoods(output, BVBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_OAK_WOOD_SLAB.get(), BVBlocks.STRIPPED_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), BVBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), BVBlocks.STRIPPED_BIRCH_WOOD_WALL.get(), BVBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(), BVBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), BVBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), BVBlocks.STRIPPED_ACACIA_WOOD_WALL.get(), BVBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(), BVBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_WALL.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(), BVBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), BVBlocks.STRIPPED_CHERRY_WOOD_WALL.get(), BVBlocks.STRIPPED_CHERRY_WOOD_FENCE.get(), BVBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_CHERRY_WOOD, Blocks.STRIPPED_CHERRY_LOG);
        recipeWoods(output, BVBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get(), Blocks.STRIPPED_BAMBOO_BLOCK);
        recipeWoods(output, BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM);
        recipeWoods(output, BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get(), Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM);

        all(output, BVBlocks.CALCITE_STAIRS.get(), BVBlocks.CALCITE_SLAB.get(), BVBlocks.CALCITE_WALL.get(), Blocks.CALCITE, true);
        all(output, BVBlocks.SMOOTH_BASALT_STAIRS.get(), BVBlocks.SMOOTH_BASALT_SLAB.get(), BVBlocks.SMOOTH_BASALT_WALL.get(), Blocks.SMOOTH_BASALT, true);
        smelting(output, BVBlocks.SMOOTH_BASALT_STAIRS.get(), BVBlocks.BASALT_STAIRS.get());
        smelting(output, BVBlocks.SMOOTH_BASALT_SLAB.get(), BVBlocks.BASALT_SLAB.get());
        smelting(output, BVBlocks.SMOOTH_BASALT_WALL.get(), BVBlocks.BASALT_WALL.get());
        all(output, BVBlocks.TUFF_STAIRS.get(), BVBlocks.TUFF_SLAB.get(), BVBlocks.TUFF_WALL.get(), Blocks.TUFF, true);

        all(output, BVBlocks.DEEPSLATE_STAIRS.get(), BVBlocks.DEEPSLATE_SLAB.get(), BVBlocks.DEEPSLATE_WALL.get(), Blocks.DEEPSLATE, true);
        all(output, BVBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), BVBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), BVBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), Blocks.CRACKED_DEEPSLATE_BRICKS, true);
        all(output, BVBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), BVBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), BVBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), Blocks.CRACKED_DEEPSLATE_TILES, true);

        netherFenceGate(output, BVBlocks.NETHER_BRICK_FENCE_GATE.get(), Blocks.NETHER_BRICKS);
        all(output, BVBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), BVBlocks.CRACKED_NETHER_BRICK_SLAB.get(), BVBlocks.CRACKED_NETHER_BRICK_WALL.get(), Blocks.CRACKED_NETHER_BRICKS, true);
        netherFence(output, BVBlocks.CRACKED_NETHER_BRICK_FENCE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFenceGate(output, BVBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFence(output, BVBlocks.RED_NETHER_BRICK_FENCE.get(), Blocks.RED_NETHER_BRICKS);
        netherFenceGate(output, BVBlocks.RED_NETHER_BRICK_FENCE_GATE.get(), Blocks.RED_NETHER_BRICKS);

        all(output, BVBlocks.OBSIDIAN_STAIRS.get(), BVBlocks.OBSIDIAN_SLAB.get(), BVBlocks.OBSIDIAN_WALL.get(), Blocks.OBSIDIAN, false);
        all(output, BVBlocks.CRYING_OBSIDIAN_STAIRS.get(), BVBlocks.CRYING_OBSIDIAN_SLAB.get(), BVBlocks.CRYING_OBSIDIAN_WALL.get(), Blocks.CRYING_OBSIDIAN, false);

        all(output, BVBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), Blocks.WHITE_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.WHITE_TERRACOTTA_WALL.get());
        all(output, BVBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), Blocks.ORANGE_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.ORANGE_TERRACOTTA_WALL.get());
        all(output, BVBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.MAGENTA_TERRACOTTA_WALL.get());
        all(output, BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        all(output, BVBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), Blocks.YELLOW_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.YELLOW_TERRACOTTA_WALL.get());
        all(output, BVBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIME_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIME_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.LIME_TERRACOTTA_WALL.get());
        all(output, BVBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), Blocks.PINK_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PINK_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.PINK_TERRACOTTA_WALL.get());
        all(output, BVBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.GRAY_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.GRAY_TERRACOTTA_WALL.get());
        all(output, BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        all(output, BVBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), Blocks.CYAN_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.CYAN_TERRACOTTA_WALL.get());
        all(output, BVBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), Blocks.PURPLE_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.PURPLE_TERRACOTTA_WALL.get());
        all(output, BVBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLUE_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.BLUE_TERRACOTTA_WALL.get());
        all(output, BVBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), Blocks.BROWN_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.BROWN_TERRACOTTA_WALL.get());
        all(output, BVBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), Blocks.GREEN_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.GREEN_TERRACOTTA_WALL.get());
        all(output, BVBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), Blocks.RED_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.RED_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.RED_TERRACOTTA_WALL.get());
        all(output, BVBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLACK_GLAZED_TERRACOTTA, true);
        smelting(output, BVBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_TERRACOTTA_STAIRS.get());
        smelting(output, BVBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_TERRACOTTA_SLAB.get());
        smelting(output, BVBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.BLACK_TERRACOTTA_WALL.get());

        all(output, BVBlocks.WhiteWoolStairs.get(), BVBlocks.WhiteWoolSlab.get(), BVBlocks.WhiteWoolWall.get(), Blocks.WHITE_WOOL, false);
        all(output, BVBlocks.OrangeWoolStairs.get(), BVBlocks.OrangeWoolSlab.get(), BVBlocks.OrangeWoolWall.get(), Blocks.ORANGE_WOOL, false);
        all(output, BVBlocks.MagentaWoolStairs.get(), BVBlocks.MagentaWoolSlab.get(), BVBlocks.MagentaWoolWall.get(), Blocks.MAGENTA_WOOL, false);
        all(output, BVBlocks.LightBlueWoolStairs.get(), BVBlocks.LightBlueWoolSlab.get(), BVBlocks.LightBlueWoolWall.get(), Blocks.LIGHT_BLUE_WOOL, false);
        all(output, BVBlocks.YellowWoolStairs.get(), BVBlocks.YellowWoolSlab.get(), BVBlocks.YellowWoolWall.get(), Blocks.YELLOW_WOOL, false);
        all(output, BVBlocks.LimeWoolStairs.get(), BVBlocks.LimeWoolSlab.get(), BVBlocks.LimeWoolWall.get(), Blocks.LIME_WOOL, false);
        all(output, BVBlocks.PinkWoolStairs.get(), BVBlocks.PinkWoolSlab.get(), BVBlocks.PinkWoolWall.get(), Blocks.PINK_WOOL, false);
        all(output, BVBlocks.GrayWoolStairs.get(), BVBlocks.GrayWoolSlab.get(), BVBlocks.GrayWoolWall.get(), Blocks.GRAY_WOOL, false);
        all(output, BVBlocks.LightGrayWoolStairs.get(), BVBlocks.LightGrayWoolSlab.get(), BVBlocks.LightGrayWoolWall.get(), Blocks.LIGHT_GRAY_WOOL, false);
        all(output, BVBlocks.CyanWoolStairs.get(), BVBlocks.CyanWoolSlab.get(), BVBlocks.CyanWoolWall.get(), Blocks.CYAN_WOOL, false);
        all(output, BVBlocks.PurpleWoolStairs.get(), BVBlocks.PurpleWoolSlab.get(), BVBlocks.PurpleWoolWall.get(), Blocks.PURPLE_WOOL, false);
        all(output, BVBlocks.BlueWoolStairs.get(), BVBlocks.BlueWoolSlab.get(), BVBlocks.BlueWoolWall.get(), Blocks.BLUE_WOOL, false);
        all(output, BVBlocks.BrownWoolStairs.get(), BVBlocks.BrownWoolSlab.get(), BVBlocks.BrownWoolWall.get(), Blocks.BROWN_WOOL, false);
        all(output, BVBlocks.GreenWoolStairs.get(), BVBlocks.GreenWoolSlab.get(), BVBlocks.GreenWoolWall.get(), Blocks.GREEN_WOOL, false);
        all(output, BVBlocks.RedWoolStairs.get(), BVBlocks.RedWoolSlab.get(), BVBlocks.RedWoolWall.get(), Blocks.RED_WOOL, false);
        all(output, BVBlocks.BlackWoolStairs.get(), BVBlocks.BlackWoolSlab.get(), BVBlocks.BlackWoolWall.get(), Blocks.BLACK_WOOL, false);

        dying(output, BVTags.Items.WOOL_STAIRS, "{color}_wool_stairs", "dye_wool_stairs");
        dying(output, BVTags.Items.WOOL_SLABS, "{color}_wool_slab", "dye_wool_slabs");
        dying(output, BVTags.Items.WOOL_WALLS, "{color}_wool_wall", "dye_wool_walls");

        all(output, BVBlocks.PackedMudStairs.get(), BVBlocks.PackedMudSlab.get(), BVBlocks.PackedMudWall.get(), Blocks.PACKED_MUD, true);


        {
            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.DROPPER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.REDSTONE)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("#+#")
                    .unlockedBy("has_redstone", has(Items.REDSTONE))
                    .save(output, recipeID(Blocks.DROPPER));

            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.DISPENSER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.REDSTONE)
                    .define('(', Items.BOW)
                    .pattern("###")
                    .pattern("#(#")
                    .pattern("#+#")
                    .unlockedBy("has_bow", has(Items.BOW))
                    .save(output, recipeID(Blocks.DISPENSER));

            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.FURNACE, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.FURNACE));

            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS,Blocks.STONECUTTER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.IRON_INGOT)
                    .pattern(" + ")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.STONECUTTER));

            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.LEVER, 1)
                    .define('|', Items.STICK)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .pattern("|")
                    .pattern("#")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.LEVER));

            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.PISTON, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('W', ItemTags.PLANKS)
                    .define('N', Items.IRON_INGOT)
                    .define('I', Items.REDSTONE)
                    .pattern("WWW")
                    .pattern("#N#")
                    .pattern("#I#")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.PISTON));
        } //Recipe overrides
    }

    private void all(RecipeOutput output, StairBlock stair, SlabBlock slab, WallBlock wall, ItemLike material, boolean hasStonecutting){
        stairs(output, stair, material, hasStonecutting);
        slab(output, slab, material, hasStonecutting);
        wall(output, wall, material, hasStonecutting);
    }
    private void stairSlab(RecipeOutput output, StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting){
        stairs(output, stair, material, hasStonecutting);
        slab(output, slab, material, hasStonecutting);
    }
    private void smelting(RecipeOutput output, ItemLike result, ItemLike ingredient) {
        smelting(output, RecipeCategory.MISC, result, ingredient, 0.1f, 200);
    }
    private void recipeWoods(RecipeOutput output, StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material){
        stairs(output, stairs, material, false);
        slab(output, slab, material, false);
        wall(output, wall, material, false);
        fence(output, fence, material);
        fenceGate(output, fenceGate, material);
    }
    private void recipeWoods(RecipeOutput output, StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material, ItemLike altMaterial){
        stairs(output, stairs, material, false);
        slab(output, slab, material, false);
        wall(output, wall, material, false);
        wall(output, wall, altMaterial, false);
        fence(output, fence, material);
        fence(output, fence, altMaterial);
        fenceGate(output, fenceGate, material);
        fenceGate(output, fenceGate, altMaterial);
    }

    private static ResourceLocation recipeID(ItemLike item) {return ResourceLocation.fromNamespaceAndPath(BlockVariants.MOD_ID, getItemName(item));}
}