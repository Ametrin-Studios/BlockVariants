package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVColoredBlocks;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class BVRecipeProvider extends ExtendedRecipeProvider {
    public BVRecipeProvider(HolderLookup.Provider registries, RecipeOutput output, Set<Identifier> recipeSet) {
        super(BlockVariants.MOD_ID, registries, output, recipeSet);
    }

    @Override @ParametersAreNonnullByDefault
    protected void buildRecipes() {
        wall(BVOtherBlocks.POLISHED_GRANITE_WALL.get(), Blocks.POLISHED_GRANITE, Blocks.GRANITE, Blocks.GRANITE_WALL);
        wall(BVOtherBlocks.POLISHED_DIORITE_WALL.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, Blocks.DIORITE_WALL);
        wall(BVOtherBlocks.POLISHED_ANDESITE_WALL.get(), Blocks.POLISHED_ANDESITE, Blocks.ANDESITE, Blocks.ANDESITE_WALL);

        smelting(Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS);
        smelting(Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
        wall(BVOtherBlocks.STONE_WALL.get(), Blocks.STONE, true);
        smelting(BVOtherBlocks.STONE_WALL.get(), Blocks.COBBLESTONE_WALL);
        stairs(BVOtherBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVOtherBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.STONE_STAIRS);
        smelting(Blocks.SMOOTH_STONE_SLAB, Blocks.STONE_SLAB);
        wall(BVOtherBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVOtherBlocks.SMOOTH_STONE_WALL.get(), BVOtherBlocks.STONE_WALL.get());

        stairs(BVBuildingBlocks.CUT_SANDSTONE_STAIRS.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS);
        stairs(BVBuildingBlocks.CUT_RED_SANDSTONE_STAIRS.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS);
        wall(BVBuildingBlocks.CUT_SANDSTONE_WALL.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_WALL);
        wall(BVBuildingBlocks.CUT_RED_SANDSTONE_WALL.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_WALL);

        wall(BVBuildingBlocks.QUARTZ_WALL.get(), Blocks.QUARTZ_BLOCK, true);
        stairs(BVBuildingBlocks.QUARTZ_BRICK_STAIRS.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBuildingBlocks.QUARTZ_BRICK_SLAB.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBuildingBlocks.QUARTZ_BRICK_WALL.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, BVBuildingBlocks.QUARTZ_WALL.get());
        smelting(Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.QUARTZ_STAIRS);
        smelting(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.QUARTZ_SLAB);
        wall(BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(), Blocks.SMOOTH_QUARTZ, true);
        smelting(BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(), BVBuildingBlocks.QUARTZ_WALL.get());
        stairs(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, BVBuildingBlocks.QUARTZ_WALL.get());

        wall(BVOtherBlocks.PRISMARINE_BRICK_WALL.get(), Blocks.PRISMARINE_BRICKS, true);
        wall(BVOtherBlocks.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE, true);
        all(BVBuildingBlocks.NETHERRACK_STAIRS.get(), BVBuildingBlocks.NETHERRACK_SLAB.get(), BVBuildingBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK, true);
        all(BVBuildingBlocks.END_STONE_STAIRS.get(), BVBuildingBlocks.END_STONE_SLAB.get(), BVBuildingBlocks.END_STONE_WALL.get(), Blocks.END_STONE, true);
        wall(BVOtherBlocks.PURPUR_WALL.get(), Blocks.PURPUR_BLOCK, true);

        all(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, true);
        smelting(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        smelting(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
        smelting(BVBuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.POLISHED_BLACKSTONE_STAIRS);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.POLISHED_BLACKSTONE_SLAB);
        stonecutting(RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.POLISHED_BLACKSTONE_WALL);

        all(BVBuildingBlocks.BASALT_STAIRS.get(), BVBuildingBlocks.BASALT_SLAB.get(), BVBuildingBlocks.BASALT_WALL.get(), Blocks.BASALT, true);
        stairs(BVBuildingBlocks.POLISHED_BASALT_STAIRS.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBuildingBlocks.BASALT_STAIRS.get());
        slab(BVBuildingBlocks.POLISHED_BASALT_SLAB.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBuildingBlocks.BASALT_SLAB.get());
        wall(BVBuildingBlocks.POLISHED_BASALT_WALL.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBuildingBlocks.BASALT_WALL.get());

        all(BVColoredBlocks.TERRACOTTA_STAIRS.get(), BVColoredBlocks.TERRACOTTA_SLAB.get(), BVColoredBlocks.TERRACOTTA_WALL.get(), Blocks.TERRACOTTA, true);
        all(BVColoredBlocks.WHITE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.WHITE_TERRACOTTA_SLAB.get(), BVColoredBlocks.WHITE_TERRACOTTA_WALL.get(), Blocks.WHITE_TERRACOTTA, true);
        all(BVColoredBlocks.ORANGE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.ORANGE_TERRACOTTA_SLAB.get(), BVColoredBlocks.ORANGE_TERRACOTTA_WALL.get(), Blocks.ORANGE_TERRACOTTA, true);
        all(BVColoredBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), BVColoredBlocks.MAGENTA_TERRACOTTA_SLAB.get(), BVColoredBlocks.MAGENTA_TERRACOTTA_WALL.get(), Blocks.MAGENTA_TERRACOTTA, true);
        all(BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_TERRACOTTA, true);
        all(BVColoredBlocks.YELLOW_TERRACOTTA_STAIRS.get(), BVColoredBlocks.YELLOW_TERRACOTTA_SLAB.get(), BVColoredBlocks.YELLOW_TERRACOTTA_WALL.get(), Blocks.YELLOW_TERRACOTTA, true);
        all(BVColoredBlocks.LIME_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIME_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIME_TERRACOTTA_WALL.get(), Blocks.LIME_TERRACOTTA, true);
        all(BVColoredBlocks.PINK_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PINK_TERRACOTTA_SLAB.get(), BVColoredBlocks.PINK_TERRACOTTA_WALL.get(), Blocks.PINK_TERRACOTTA, true);
        all(BVColoredBlocks.GRAY_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GRAY_TERRACOTTA_SLAB.get(), BVColoredBlocks.GRAY_TERRACOTTA_WALL.get(), Blocks.GRAY_TERRACOTTA, true);
        all(BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_TERRACOTTA, true);
        all(BVColoredBlocks.CYAN_TERRACOTTA_STAIRS.get(), BVColoredBlocks.CYAN_TERRACOTTA_SLAB.get(), BVColoredBlocks.CYAN_TERRACOTTA_WALL.get(), Blocks.CYAN_TERRACOTTA, true);
        all(BVColoredBlocks.PURPLE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PURPLE_TERRACOTTA_SLAB.get(), BVColoredBlocks.PURPLE_TERRACOTTA_WALL.get(), Blocks.PURPLE_TERRACOTTA, true);
        all(BVColoredBlocks.BLUE_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLUE_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLUE_TERRACOTTA_WALL.get(), Blocks.BLUE_TERRACOTTA, true);
        all(BVColoredBlocks.BROWN_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BROWN_TERRACOTTA_SLAB.get(), BVColoredBlocks.BROWN_TERRACOTTA_WALL.get(), Blocks.BROWN_TERRACOTTA, true);
        all(BVColoredBlocks.GREEN_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GREEN_TERRACOTTA_SLAB.get(), BVColoredBlocks.GREEN_TERRACOTTA_WALL.get(), Blocks.GREEN_TERRACOTTA, true);
        all(BVColoredBlocks.RED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.RED_TERRACOTTA_SLAB.get(), BVColoredBlocks.RED_TERRACOTTA_WALL.get(), Blocks.RED_TERRACOTTA, true);
        all(BVColoredBlocks.BLACK_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLACK_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLACK_TERRACOTTA_WALL.get(), Blocks.BLACK_TERRACOTTA, true);

        all(BVBuildingBlocks.DRIPSTONE_BLOCK_STAIRS.get(), BVBuildingBlocks.DRIPSTONE_BLOCK_SLAB.get(), BVBuildingBlocks.DRIPSTONE_BLOCK_WALL.get(), Blocks.DRIPSTONE_BLOCK, true);
        all(BVBuildingBlocks.AMETHYST_BLOCK_STAIRS.get(), BVBuildingBlocks.AMETHYST_BLOCK_SLAB.get(), BVBuildingBlocks.AMETHYST_BLOCK_WALL.get(), Blocks.AMETHYST_BLOCK, false);

        stairSlab(BVBuildingBlocks.OAK_LOG_STAIRS.get(), BVBuildingBlocks.OAK_LOG_SLAB.get(), Blocks.OAK_LOG, false);
        stairSlab(BVBuildingBlocks.SPRUCE_LOG_STAIRS.get(), BVBuildingBlocks.SPRUCE_LOG_SLAB.get(), Blocks.SPRUCE_LOG, false);
        stairSlab(BVBuildingBlocks.BIRCH_LOG_STAIRS.get(), BVBuildingBlocks.BIRCH_LOG_SLAB.get(), Blocks.BIRCH_LOG, false);
        stairSlab(BVBuildingBlocks.JUNGLE_LOG_STAIRS.get(), BVBuildingBlocks.JUNGLE_LOG_SLAB.get(), Blocks.JUNGLE_LOG, false);
        stairSlab(BVBuildingBlocks.ACACIA_LOG_STAIRS.get(), BVBuildingBlocks.ACACIA_LOG_SLAB.get(), Blocks.ACACIA_LOG, false);
        stairSlab(BVBuildingBlocks.DARK_OAK_LOG_STAIRS.get(), BVBuildingBlocks.DARK_OAK_LOG_SLAB.get(), Blocks.DARK_OAK_LOG, false);
        stairSlab(BVBuildingBlocks.MANGROVE_LOG_STAIRS.get(), BVBuildingBlocks.MANGROVE_LOG_SLAB.get(), Blocks.MANGROVE_LOG, false);
        stairSlab(BVBuildingBlocks.CHERRY_LOG_STAIRS.get(), BVBuildingBlocks.CHERRY_LOG_SLAB.get(), Blocks.CHERRY_LOG, false);
        stairSlab(BVBuildingBlocks.PALE_OAK_LOG_STAIRS.get(), BVBuildingBlocks.PALE_OAK_LOG_SLAB.get(), Blocks.PALE_OAK_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_OAK_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_OAK_LOG_SLAB.get(), Blocks.STRIPPED_OAK_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_SPRUCE_LOG_SLAB.get(), Blocks.STRIPPED_SPRUCE_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_BIRCH_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_BIRCH_LOG_SLAB.get(), Blocks.STRIPPED_BIRCH_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_JUNGLE_LOG_SLAB.get(), Blocks.STRIPPED_JUNGLE_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_ACACIA_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_ACACIA_LOG_SLAB.get(), Blocks.STRIPPED_ACACIA_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get(), Blocks.STRIPPED_DARK_OAK_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_MANGROVE_LOG_SLAB.get(), Blocks.STRIPPED_MANGROVE_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_CHERRY_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_CHERRY_LOG_SLAB.get(), Blocks.STRIPPED_CHERRY_LOG, false);
        stairSlab(BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_STAIRS.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_LOG_SLAB.get(), Blocks.STRIPPED_PALE_OAK_LOG, false);
        stairSlab(BVBuildingBlocks.CRIMSON_STEM_STAIRS.get(), BVBuildingBlocks.CRIMSON_STEM_SLAB.get(), Blocks.CRIMSON_STEM, false);
        stairSlab(BVBuildingBlocks.WARPED_STEM_STAIRS.get(), BVBuildingBlocks.WARPED_STEM_SLAB.get(), Blocks.WARPED_STEM, false);
        stairSlab(BVBuildingBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get(), BVBuildingBlocks.STRIPPED_CRIMSON_STEM_SLAB.get(), Blocks.STRIPPED_CRIMSON_STEM, false);
        stairSlab(BVBuildingBlocks.STRIPPED_WARPED_STEM_STAIRS.get(), BVBuildingBlocks.STRIPPED_WARPED_STEM_SLAB.get(), Blocks.STRIPPED_WARPED_STEM, false);

        recipeWoods(BVBuildingBlocks.OAK_WOOD_STAIRS.get(), BVBuildingBlocks.OAK_WOOD_SLAB.get(), BVBuildingBlocks.OAK_WOOD_WALL.get(), BVBuildingBlocks.OAK_WOOD_FENCE.get(), BVBuildingBlocks.OAK_WOOD_FENCE_GATE.get(), Blocks.OAK_WOOD, Blocks.OAK_LOG);
        recipeWoods(BVBuildingBlocks.SPRUCE_WOOD_STAIRS.get(), BVBuildingBlocks.SPRUCE_WOOD_SLAB.get(), BVBuildingBlocks.SPRUCE_WOOD_WALL.get(), BVBuildingBlocks.SPRUCE_WOOD_FENCE.get(), BVBuildingBlocks.SPRUCE_WOOD_FENCE_GATE.get(), Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG);
        recipeWoods(BVBuildingBlocks.BIRCH_WOOD_STAIRS.get(), BVBuildingBlocks.BIRCH_WOOD_SLAB.get(), BVBuildingBlocks.BIRCH_WOOD_WALL.get(), BVBuildingBlocks.BIRCH_WOOD_FENCE.get(), BVBuildingBlocks.BIRCH_WOOD_FENCE_GATE.get(), Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG);
        recipeWoods(BVBuildingBlocks.JUNGLE_WOOD_STAIRS.get(), BVBuildingBlocks.JUNGLE_WOOD_SLAB.get(), BVBuildingBlocks.JUNGLE_WOOD_WALL.get(), BVBuildingBlocks.JUNGLE_WOOD_FENCE.get(), BVBuildingBlocks.JUNGLE_WOOD_FENCE_GATE.get(), Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG);
        recipeWoods(BVBuildingBlocks.ACACIA_WOOD_STAIRS.get(), BVBuildingBlocks.ACACIA_WOOD_SLAB.get(), BVBuildingBlocks.ACACIA_WOOD_WALL.get(), BVBuildingBlocks.ACACIA_WOOD_FENCE.get(), BVBuildingBlocks.ACACIA_WOOD_FENCE_GATE.get(), Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG);
        recipeWoods(BVBuildingBlocks.DARK_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.DARK_OAK_WOOD_SLAB.get(), BVBuildingBlocks.DARK_OAK_WOOD_WALL.get(), BVBuildingBlocks.DARK_OAK_WOOD_FENCE.get(), BVBuildingBlocks.DARK_OAK_WOOD_FENCE_GATE.get(), Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG);
        recipeWoods(BVBuildingBlocks.MANGROVE_WOOD_STAIRS.get(), BVBuildingBlocks.MANGROVE_WOOD_SLAB.get(), BVBuildingBlocks.MANGROVE_WOOD_WALL.get(), BVBuildingBlocks.MANGROVE_WOOD_FENCE.get(), BVBuildingBlocks.MANGROVE_WOOD_FENCE_GATE.get(), Blocks.MANGROVE_WOOD, Blocks.MANGROVE_LOG);
        recipeWoods(BVBuildingBlocks.CHERRY_WOOD_STAIRS.get(), BVBuildingBlocks.CHERRY_WOOD_SLAB.get(), BVBuildingBlocks.CHERRY_WOOD_WALL.get(), BVBuildingBlocks.CHERRY_WOOD_FENCE.get(), BVBuildingBlocks.CHERRY_WOOD_FENCE_GATE.get(), Blocks.CHERRY_WOOD, Blocks.CHERRY_LOG);
        recipeWoods(BVBuildingBlocks.PALE_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.PALE_OAK_WOOD_SLAB.get(), BVBuildingBlocks.PALE_OAK_WOOD_WALL.get(), BVBuildingBlocks.PALE_OAK_WOOD_FENCE.get(), BVBuildingBlocks.PALE_OAK_WOOD_FENCE_GATE.get(), Blocks.PALE_OAK_WOOD, Blocks.PALE_OAK_LOG);
        recipeWoods(BVBuildingBlocks.BAMBOO_BLOCK_STAIRS.get(), BVBuildingBlocks.BAMBOO_BLOCK_SLAB.get(), BVBuildingBlocks.BAMBOO_BLOCK_WALL.get(), BVBuildingBlocks.BAMBOO_BLOCK_FENCE.get(), BVBuildingBlocks.BAMBOO_BLOCK_FENCE_GATE.get(), Blocks.BAMBOO_BLOCK);
        recipeWoods(BVBuildingBlocks.CRIMSON_HYPHAE_STAIRS.get(), BVBuildingBlocks.CRIMSON_HYPHAE_SLAB.get(), BVBuildingBlocks.CRIMSON_HYPHAE_WALL.get(), BVBuildingBlocks.CRIMSON_HYPHAE_FENCE.get(), BVBuildingBlocks.CRIMSON_HYPHAE_FENCE_GATE.get(), Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
        recipeWoods(BVBuildingBlocks.WARPED_HYPHAE_STAIRS.get(), BVBuildingBlocks.WARPED_HYPHAE_SLAB.get(), BVBuildingBlocks.WARPED_HYPHAE_WALL.get(), BVBuildingBlocks.WARPED_HYPHAE_FENCE.get(), BVBuildingBlocks.WARPED_HYPHAE_FENCE_GATE.get(), Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);
        recipeWoods(BVBuildingBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_OAK_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_OAK_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_BIRCH_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_ACACIA_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_CHERRY_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_CHERRY_WOOD, Blocks.STRIPPED_CHERRY_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_SLAB.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_WALL.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE.get(), BVBuildingBlocks.STRIPPED_PALE_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_PALE_OAK_WOOD, Blocks.STRIPPED_PALE_OAK_LOG);
        recipeWoods(BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(), BVBuildingBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get(), Blocks.STRIPPED_BAMBOO_BLOCK);
        recipeWoods(BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get(), BVBuildingBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM);
        recipeWoods(BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_WALL.get(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get(), BVBuildingBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get(), Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM);

        all(BVBuildingBlocks.CALCITE_STAIRS.get(), BVBuildingBlocks.CALCITE_SLAB.get(), BVBuildingBlocks.CALCITE_WALL.get(), Blocks.CALCITE, true);
        all(BVBuildingBlocks.SMOOTH_BASALT_STAIRS.get(), BVBuildingBlocks.SMOOTH_BASALT_SLAB.get(), BVBuildingBlocks.SMOOTH_BASALT_WALL.get(), Blocks.SMOOTH_BASALT, true);
        smelting(BVBuildingBlocks.SMOOTH_BASALT_STAIRS.get(), BVBuildingBlocks.BASALT_STAIRS.get());
        smelting(BVBuildingBlocks.SMOOTH_BASALT_SLAB.get(), BVBuildingBlocks.BASALT_SLAB.get());
        smelting(BVBuildingBlocks.SMOOTH_BASALT_WALL.get(), BVBuildingBlocks.BASALT_WALL.get());

        all(BVBuildingBlocks.DEEPSLATE_STAIRS.get(), BVBuildingBlocks.DEEPSLATE_SLAB.get(), BVBuildingBlocks.DEEPSLATE_WALL.get(), Blocks.DEEPSLATE, true);
        all(BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), Blocks.CRACKED_DEEPSLATE_BRICKS, true);
        all(BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), BVBuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), Blocks.CRACKED_DEEPSLATE_TILES, true);

        netherFenceGate(BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.get(), Blocks.NETHER_BRICKS);
        all(BVBuildingBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), BVBuildingBlocks.CRACKED_NETHER_BRICK_SLAB.get(), BVBuildingBlocks.CRACKED_NETHER_BRICK_WALL.get(), Blocks.CRACKED_NETHER_BRICKS, true);
        netherFence(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFenceGate(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFence(BVBuildingBlocks.RED_NETHER_BRICK_FENCE.get(), Blocks.RED_NETHER_BRICKS);
        netherFenceGate(BVBuildingBlocks.RED_NETHER_BRICK_FENCE_GATE.get(), Blocks.RED_NETHER_BRICKS);

        all(BVBuildingBlocks.OBSIDIAN_STAIRS.get(), BVBuildingBlocks.OBSIDIAN_SLAB.get(), BVBuildingBlocks.OBSIDIAN_WALL.get(), Blocks.OBSIDIAN, false);
        all(BVBuildingBlocks.CRYING_OBSIDIAN_STAIRS.get(), BVBuildingBlocks.CRYING_OBSIDIAN_SLAB.get(), BVBuildingBlocks.CRYING_OBSIDIAN_WALL.get(), Blocks.CRYING_OBSIDIAN, false);

        all(BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), Blocks.WHITE_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.WHITE_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.WHITE_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.WHITE_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), Blocks.ORANGE_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.ORANGE_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.ORANGE_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.MAGENTA_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.MAGENTA_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), Blocks.YELLOW_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.YELLOW_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.YELLOW_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIME_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIME_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIME_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.LIME_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), Blocks.PINK_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PINK_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.PINK_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.PINK_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.GRAY_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GRAY_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.GRAY_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.GRAY_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), Blocks.CYAN_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.CYAN_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.CYAN_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.CYAN_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), Blocks.PURPLE_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.PURPLE_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.PURPLE_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLUE_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLUE_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLUE_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.BLUE_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), Blocks.BROWN_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BROWN_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BROWN_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.BROWN_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), Blocks.GREEN_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.GREEN_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.GREEN_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.GREEN_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), Blocks.RED_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.RED_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.RED_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.RED_TERRACOTTA_WALL.get());
        all(BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLACK_GLAZED_TERRACOTTA, true);
        smelting(BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVColoredBlocks.BLACK_TERRACOTTA_STAIRS.get());
        smelting(BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVColoredBlocks.BLACK_TERRACOTTA_SLAB.get());
        smelting(BVColoredBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), BVColoredBlocks.BLACK_TERRACOTTA_WALL.get());

        all(BVColoredBlocks.WHITE_WOOL_STAIRS.get(), BVColoredBlocks.WHITE_WOOL_SLAB.get(), BVColoredBlocks.WHITE_WOOL_WALL.get(), Blocks.WHITE_WOOL, false);
        all(BVColoredBlocks.ORANGE_WOOL_STAIRS.get(), BVColoredBlocks.ORANGE_WOOL_SLAB.get(), BVColoredBlocks.ORANGE_WOOL_WALL.get(), Blocks.ORANGE_WOOL, false);
        all(BVColoredBlocks.MAGENTA_WOOL_STAIRS.get(), BVColoredBlocks.MAGENTA_WOOL_SLAB.get(), BVColoredBlocks.MAGENTA_WOOL_WALL.get(), Blocks.MAGENTA_WOOL, false);
        all(BVColoredBlocks.LIGHT_BLUE_WOOL_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_WOOL_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_WOOL_WALL.get(), Blocks.LIGHT_BLUE_WOOL, false);
        all(BVColoredBlocks.YELLOW_WOOL_STAIRS.get(), BVColoredBlocks.YELLOW_WOOL_SLAB.get(), BVColoredBlocks.YELLOW_WOOL_WALL.get(), Blocks.YELLOW_WOOL, false);
        all(BVColoredBlocks.LIME_WOOL_STAIRS.get(), BVColoredBlocks.LIME_WOOL_SLAB.get(), BVColoredBlocks.LIME_WOOL_WALL.get(), Blocks.LIME_WOOL, false);
        all(BVColoredBlocks.PINK_WOOL_STAIRS.get(), BVColoredBlocks.PINK_WOOL_SLAB.get(), BVColoredBlocks.PINK_WOOL_WALL.get(), Blocks.PINK_WOOL, false);
        all(BVColoredBlocks.GRAY_WOOL_STAIRS.get(), BVColoredBlocks.GRAY_WOOL_SLAB.get(), BVColoredBlocks.GRAY_WOOL_WALL.get(), Blocks.GRAY_WOOL, false);
        all(BVColoredBlocks.LIGHT_GRAY_WOOL_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_WOOL_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_WOOL_WALL.get(), Blocks.LIGHT_GRAY_WOOL, false);
        all(BVColoredBlocks.CYAN_WOOL_STAIRS.get(), BVColoredBlocks.CYAN_WOOL_SLAB.get(), BVColoredBlocks.CYAN_WOOL_WALL.get(), Blocks.CYAN_WOOL, false);
        all(BVColoredBlocks.PURPLE_WOOL_STAIRS.get(), BVColoredBlocks.PURPLE_WOOL_SLAB.get(), BVColoredBlocks.PURPLE_WOOL_WALL.get(), Blocks.PURPLE_WOOL, false);
        all(BVColoredBlocks.BLUE_WOOL_STAIRS.get(), BVColoredBlocks.BLUE_WOOL_SLAB.get(), BVColoredBlocks.BLUE_WOOL_WALL.get(), Blocks.BLUE_WOOL, false);
        all(BVColoredBlocks.BROWN_WOOL_STAIRS.get(), BVColoredBlocks.BROWN_WOOL_SLAB.get(), BVColoredBlocks.BROWN_WOOL_WALL.get(), Blocks.BROWN_WOOL, false);
        all(BVColoredBlocks.GREEN_WOOL_STAIRS.get(), BVColoredBlocks.GREEN_WOOL_SLAB.get(), BVColoredBlocks.GREEN_WOOL_WALL.get(), Blocks.GREEN_WOOL, false);
        all(BVColoredBlocks.RED_WOOL_STAIRS.get(), BVColoredBlocks.RED_WOOL_SLAB.get(), BVColoredBlocks.RED_WOOL_WALL.get(), Blocks.RED_WOOL, false);
        all(BVColoredBlocks.BLACK_WOOL_STAIRS.get(), BVColoredBlocks.BLACK_WOOL_SLAB.get(), BVColoredBlocks.BLACK_WOOL_WALL.get(), Blocks.BLACK_WOOL, false);

        dying(BVTags.Items.WOOL_STAIRS, "{color}_wool_stairs", "dye_wool_stairs");
        dying(BVTags.Items.WOOL_SLABS, "{color}_wool_slab", "dye_wool_slabs");
        dying(BVTags.Items.WOOL_WALLS, "{color}_wool_wall", "dye_wool_walls");

        all(BVBuildingBlocks.PACKED_MUD_STAIRS.get(), BVBuildingBlocks.PACKED_MUD_SLAB.get(), BVBuildingBlocks.PACKED_MUD_WALL.get(), Blocks.PACKED_MUD, true);

        all(BVColoredBlocks.WHITE_CONCRETE_STAIRS.get(), BVColoredBlocks.WHITE_CONCRETE_SLAB.get(), BVColoredBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE, true);
        all(BVColoredBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), BVColoredBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), BVColoredBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE, true);
        all(BVColoredBlocks.GRAY_CONCRETE_STAIRS.get(), BVColoredBlocks.GRAY_CONCRETE_SLAB.get(), BVColoredBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE, true);
        all(BVColoredBlocks.BLACK_CONCRETE_STAIRS.get(), BVColoredBlocks.BLACK_CONCRETE_SLAB.get(), BVColoredBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE, true);
        all(BVColoredBlocks.BROWN_CONCRETE_STAIRS.get(), BVColoredBlocks.BROWN_CONCRETE_SLAB.get(), BVColoredBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE, true);
        all(BVColoredBlocks.RED_CONCRETE_STAIRS.get(), BVColoredBlocks.RED_CONCRETE_SLAB.get(), BVColoredBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE, true);
        all(BVColoredBlocks.ORANGE_CONCRETE_STAIRS.get(), BVColoredBlocks.ORANGE_CONCRETE_SLAB.get(), BVColoredBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE, true);
        all(BVColoredBlocks.YELLOW_CONCRETE_STAIRS.get(), BVColoredBlocks.YELLOW_CONCRETE_SLAB.get(), BVColoredBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE, true);
        all(BVColoredBlocks.LIME_CONCRETE_STAIRS.get(), BVColoredBlocks.LIME_CONCRETE_SLAB.get(), BVColoredBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE, true);
        all(BVColoredBlocks.GREEN_CONCRETE_STAIRS.get(), BVColoredBlocks.GREEN_CONCRETE_SLAB.get(), BVColoredBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE, true);
        all(BVColoredBlocks.CYAN_CONCRETE_STAIRS.get(), BVColoredBlocks.CYAN_CONCRETE_SLAB.get(), BVColoredBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE, true);
        all(BVColoredBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), BVColoredBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), BVColoredBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE, true);
        all(BVColoredBlocks.BLUE_CONCRETE_STAIRS.get(), BVColoredBlocks.BLUE_CONCRETE_SLAB.get(), BVColoredBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE, true);
        all(BVColoredBlocks.PURPLE_CONCRETE_STAIRS.get(), BVColoredBlocks.PURPLE_CONCRETE_SLAB.get(), BVColoredBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE, true);
        all(BVColoredBlocks.MAGENTA_CONCRETE_STAIRS.get(), BVColoredBlocks.MAGENTA_CONCRETE_SLAB.get(), BVColoredBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE, true);
        all(BVColoredBlocks.PINK_CONCRETE_STAIRS.get(), BVColoredBlocks.PINK_CONCRETE_SLAB.get(), BVColoredBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE, true);

        shaped(RecipeCategory.DECORATIONS, BVOtherBlocks.GOLD_BARS, 16)
                .define('#', Items.GOLD_INGOT)
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, BVOtherBlocks.GOLD_CHAIN)
                .define('I', Items.GOLD_INGOT)
                .define('N', Items.GOLD_NUGGET)
                .pattern("N")
                .pattern("I")
                .pattern("N")
                .unlockedBy("has_gold_nugget", has(Items.GOLD_NUGGET))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(output);

        grate(BVOtherBlocks.GOLD_GRATE.get(), Blocks.GOLD_BLOCK);

        {
            shaped(RecipeCategory.REDSTONE, Blocks.DROPPER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.REDSTONE)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("#+#")
                    .unlockedBy("has_redstone", has(Items.REDSTONE))
                    .save(output, recipeID(Blocks.DROPPER));

            shaped(RecipeCategory.REDSTONE, Blocks.DISPENSER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.REDSTONE)
                    .define('(', Items.BOW)
                    .pattern("###")
                    .pattern("#(#")
                    .pattern("#+#")
                    .unlockedBy("has_bow", has(Items.BOW))
                    .save(output, recipeID(Blocks.DISPENSER));

            shaped(RecipeCategory.DECORATIONS, Blocks.FURNACE, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.FURNACE));

            shaped(RecipeCategory.DECORATIONS,Blocks.STONECUTTER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.IRON_INGOT)
                    .pattern(" + ")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.STONECUTTER));

            shaped(RecipeCategory.REDSTONE, Blocks.LEVER, 1)
                    .define('|', Items.STICK)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .pattern("|")
                    .pattern("#")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.LEVER));

            shaped(RecipeCategory.REDSTONE, Blocks.PISTON, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('W', ItemTags.PLANKS)
                    .define('N', Items.IRON_INGOT)
                    .define('I', Items.REDSTONE)
                    .pattern("WWW")
                    .pattern("#N#")
                    .pattern("#I#")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.PISTON));
        } // Recipe overrides
    }

    private void all(StairBlock stair, SlabBlock slab, WallBlock wall, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
        wall(wall, material, hasStonecutting);
    }
    private void stairSlab(StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
    }
    private void smelting(ItemLike result, ItemLike ingredient) {
        smelting(RecipeCategory.MISC, result, ingredient, 0.1f, 200);
    }
    private void recipeWoods(StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material) {
        stairs(stairs, material, false);
        slab(slab, material, false);
        wall(wall, material, false);
        fence(fence, material);
        fenceGate(fenceGate, material);
    }
    private void recipeWoods(StairBlock stairs, SlabBlock slab, WallBlock wall, FenceBlock fence, FenceGateBlock fenceGate, ItemLike material, ItemLike altMaterial) {
        stairs(stairs, material, false);
        slab(slab, material, false);
        wall(wall, material, false);
        wall(wall, altMaterial, false);
        fence(fence, material);
        fence(fence, altMaterial);
        fenceGate(fenceGate, material);
        fenceGate(fenceGate, altMaterial);
    }

    private static ResourceKey<Recipe<?>> recipeID(ItemLike item) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(BlockVariants.MOD_ID, getItemName(item)));
    }

    public static class Runner extends ExtendedRecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected ExtendedRecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput, Set<Identifier> set) {
            return new BVRecipeProvider(provider, recipeOutput, set);
        }

        @Override 
        public String getName() {
            return "Block Variants Recipe Provider";
        }
    }
}