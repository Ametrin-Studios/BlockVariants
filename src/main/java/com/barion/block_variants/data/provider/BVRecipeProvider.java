package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class BVRecipeProvider extends ExtendedRecipeProvider {
    public BVRecipeProvider(HolderLookup.Provider registries, RecipeOutput output, Set<ResourceLocation> recipeSet) {
        super(BlockVariants.MOD_ID, registries, output, recipeSet);
    }

    @Override @ParametersAreNonnullByDefault
    protected void buildRecipes() {
        wall(BVBlocks.POLISHED_GRANITE_WALL.get(), Blocks.POLISHED_GRANITE, Blocks.GRANITE, Blocks.GRANITE_WALL);
        wall(BVBlocks.POLISHED_DIORITE_WALL.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, Blocks.DIORITE_WALL);
        wall(BVBlocks.POLISHED_ANDESITE_WALL.get(), Blocks.POLISHED_ANDESITE, Blocks.ANDESITE, Blocks.ANDESITE_WALL);

        smelting(Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS);
        smelting(Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
        wall(BVBlocks.STONE_WALL.get(), Blocks.STONE, true);
        smelting(BVBlocks.STONE_WALL.get(), Blocks.COBBLESTONE_WALL);
        stairs(BVBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.STONE_STAIRS);
        smelting(Blocks.SMOOTH_STONE_SLAB, Blocks.STONE_SLAB);
        wall(BVBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVBlocks.SMOOTH_STONE_WALL.get(), BVBlocks.STONE_WALL.get());

        stairs(BVBlocks.CUT_SANDSTONE_STAIRS.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS);
        stairs(BVBlocks.CUT_RED_SANDSTONE_STAIRS.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS);
        wall(BVBlocks.CUT_SANDSTONE_WALL.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_WALL);
        wall(BVBlocks.CUT_RED_SANDSTONE_WALL.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_WALL);

        wall(BVBlocks.QUARTZ_WALL.get(), Blocks.QUARTZ_BLOCK, true);
        stairs(BVBlocks.QUARTZ_BRICK_STAIRS.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBlocks.QUARTZ_BRICK_SLAB.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.QUARTZ_BRICK_WALL.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, BVBlocks.QUARTZ_WALL.get());
        smelting(Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.QUARTZ_STAIRS);
        smelting(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.SMOOTH_QUARTZ_WALL.get(), Blocks.SMOOTH_QUARTZ, true);
        smelting(BVBlocks.SMOOTH_QUARTZ_WALL.get(), BVBlocks.QUARTZ_WALL.get());
        stairs(BVBlocks.CHISELED_QUARTZ_BLOCK_STAIRS.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBlocks.CHISELED_QUARTZ_BLOCK_SLAB.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.CHISELED_QUARTZ_BLOCK_WALL.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, BVBlocks.QUARTZ_WALL.get());

        wall(BVBlocks.PRISMARINE_BRICK_WALL.get(), Blocks.PRISMARINE_BRICKS, true);
        wall(BVBlocks.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE, true);
        all(BVBlocks.NETHERRACK_STAIRS.get(), BVBlocks.NETHERRACK_SLAB.get(), BVBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK, true);
        all(BVBlocks.END_STONE_STAIRS.get(), BVBlocks.END_STONE_SLAB.get(), BVBlocks.END_STONE_WALL.get(), Blocks.END_STONE, true);
        wall(BVBlocks.PURPUR_WALL.get(), Blocks.PURPUR_BLOCK, true);

        all(BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, true);
        smelting(BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
        smelting(BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB);
        smelting(BVBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL.get(), Blocks.POLISHED_BLACKSTONE_BRICK_WALL);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.BLACKSTONE_STAIRS);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Blocks.POLISHED_BLACKSTONE_STAIRS);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.BLACKSTONE_SLAB);
        stonecutting(RecipeCategory.BUILDING_BLOCKS, Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Blocks.POLISHED_BLACKSTONE_SLAB);
        stonecutting(RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.BLACKSTONE_WALL);
        stonecutting(RecipeCategory.DECORATIONS, Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 1, Blocks.POLISHED_BLACKSTONE_WALL);

        all(BVBlocks.BASALT_STAIRS.get(), BVBlocks.BASALT_SLAB.get(), BVBlocks.BASALT_WALL.get(), Blocks.BASALT, true);
        stairs(BVBlocks.POLISHED_BASALT_STAIRS.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.BASALT_STAIRS.get());
        slab(BVBlocks.POLISHED_BASALT_SLAB.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.BASALT_SLAB.get());
        wall(BVBlocks.POLISHED_BASALT_WALL.get(), Blocks.POLISHED_BASALT, Blocks.BASALT, BVBlocks.BASALT_WALL.get());

        all(BVBlocks.TERRACOTTA_STAIRS.get(), BVBlocks.TERRACOTTA_SLAB.get(), BVBlocks.TERRACOTTA_WALL.get(), Blocks.TERRACOTTA, true);
        all(BVBlocks.WHITE_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_TERRACOTTA_WALL.get(), Blocks.WHITE_TERRACOTTA, true);
        all(BVBlocks.ORANGE_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_TERRACOTTA_WALL.get(), Blocks.ORANGE_TERRACOTTA, true);
        all(BVBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_TERRACOTTA_WALL.get(), Blocks.MAGENTA_TERRACOTTA, true);
        all(BVBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_TERRACOTTA, true);
        all(BVBlocks.YELLOW_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_TERRACOTTA_WALL.get(), Blocks.YELLOW_TERRACOTTA, true);
        all(BVBlocks.LIME_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_TERRACOTTA_SLAB.get(), BVBlocks.LIME_TERRACOTTA_WALL.get(), Blocks.LIME_TERRACOTTA, true);
        all(BVBlocks.PINK_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_TERRACOTTA_SLAB.get(), BVBlocks.PINK_TERRACOTTA_WALL.get(), Blocks.PINK_TERRACOTTA, true);
        all(BVBlocks.GRAY_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_TERRACOTTA_WALL.get(), Blocks.GRAY_TERRACOTTA, true);
        all(BVBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_TERRACOTTA, true);
        all(BVBlocks.CYAN_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_TERRACOTTA_WALL.get(), Blocks.CYAN_TERRACOTTA, true);
        all(BVBlocks.PURPLE_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_TERRACOTTA_WALL.get(), Blocks.PURPLE_TERRACOTTA, true);
        all(BVBlocks.BLUE_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_TERRACOTTA_WALL.get(), Blocks.BLUE_TERRACOTTA, true);
        all(BVBlocks.BROWN_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_TERRACOTTA_WALL.get(), Blocks.BROWN_TERRACOTTA, true);
        all(BVBlocks.GREEN_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_TERRACOTTA_WALL.get(), Blocks.GREEN_TERRACOTTA, true);
        all(BVBlocks.RED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_TERRACOTTA_SLAB.get(), BVBlocks.RED_TERRACOTTA_WALL.get(), Blocks.RED_TERRACOTTA, true);
        all(BVBlocks.BLACK_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_TERRACOTTA_WALL.get(), Blocks.BLACK_TERRACOTTA, true);

        all(BVBlocks.DRIPSTONE_BLOCK_STAIRS.get(), BVBlocks.DRIPSTONE_BLOCK_SLAB.get(), BVBlocks.DRIPSTONE_BLOCK_WALL.get(), Blocks.DRIPSTONE_BLOCK, true);
        all(BVBlocks.AMETHYST_BLOCK_STAIRS.get(), BVBlocks.AMETHYST_BLOCK_SLAB.get(), BVBlocks.AMETHYST_BLOCK_WALL.get(), Blocks.AMETHYST_BLOCK, false);

        stairSlab(BVBlocks.OAK_LOG_STAIRS.get(), BVBlocks.OAK_LOG_SLAB.get(), Blocks.OAK_LOG, false);
        stairSlab(BVBlocks.SPRUCE_LOG_STAIRS.get(), BVBlocks.SPRUCE_LOG_SLAB.get(), Blocks.SPRUCE_LOG, false);
        stairSlab(BVBlocks.BIRCH_LOG_STAIRS.get(), BVBlocks.BIRCH_LOG_SLAB.get(), Blocks.BIRCH_LOG, false);
        stairSlab(BVBlocks.JUNGLE_LOG_STAIRS.get(), BVBlocks.JUNGLE_LOG_SLAB.get(), Blocks.JUNGLE_LOG, false);
        stairSlab(BVBlocks.ACACIA_LOG_STAIRS.get(), BVBlocks.ACACIA_LOG_SLAB.get(), Blocks.ACACIA_LOG, false);
        stairSlab(BVBlocks.DARK_OAK_LOG_STAIRS.get(), BVBlocks.DARK_OAK_LOG_SLAB.get(), Blocks.DARK_OAK_LOG, false);
        stairSlab(BVBlocks.MANGROVE_LOG_STAIRS.get(), BVBlocks.MANGROVE_LOG_SLAB.get(), Blocks.MANGROVE_LOG, false);
        stairSlab(BVBlocks.CHERRY_LOG_STAIRS.get(), BVBlocks.CHERRY_LOG_SLAB.get(), Blocks.CHERRY_LOG, false);
        stairSlab(BVBlocks.PALE_OAK_LOG_STAIRS.get(), BVBlocks.PALE_OAK_LOG_SLAB.get(), Blocks.PALE_OAK_LOG, false);
        stairSlab(BVBlocks.STRIPPED_OAK_LOG_STAIRS.get(), BVBlocks.STRIPPED_OAK_LOG_SLAB.get(), Blocks.STRIPPED_OAK_LOG, false);
        stairSlab(BVBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get(), BVBlocks.STRIPPED_SPRUCE_LOG_SLAB.get(), Blocks.STRIPPED_SPRUCE_LOG, false);
        stairSlab(BVBlocks.STRIPPED_BIRCH_LOG_STAIRS.get(), BVBlocks.STRIPPED_BIRCH_LOG_SLAB.get(), Blocks.STRIPPED_BIRCH_LOG, false);
        stairSlab(BVBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get(), BVBlocks.STRIPPED_JUNGLE_LOG_SLAB.get(), Blocks.STRIPPED_JUNGLE_LOG, false);
        stairSlab(BVBlocks.STRIPPED_ACACIA_LOG_STAIRS.get(), BVBlocks.STRIPPED_ACACIA_LOG_SLAB.get(), Blocks.STRIPPED_ACACIA_LOG, false);
        stairSlab(BVBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get(), BVBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get(), Blocks.STRIPPED_DARK_OAK_LOG, false);
        stairSlab(BVBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get(), BVBlocks.STRIPPED_MANGROVE_LOG_SLAB.get(), Blocks.STRIPPED_MANGROVE_LOG, false);
        stairSlab(BVBlocks.STRIPPED_CHERRY_LOG_STAIRS.get(), BVBlocks.STRIPPED_CHERRY_LOG_SLAB.get(), Blocks.STRIPPED_CHERRY_LOG, false);
        stairSlab(BVBlocks.CRIMSON_STEM_STAIRS.get(), BVBlocks.CRIMSON_STEM_SLAB.get(), Blocks.CRIMSON_STEM, false);
        stairSlab(BVBlocks.WARPED_STEM_STAIRS.get(), BVBlocks.WARPED_STEM_SLAB.get(), Blocks.WARPED_STEM, false);
        stairSlab(BVBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get(), BVBlocks.STRIPPED_CRIMSON_STEM_SLAB.get(), Blocks.STRIPPED_CRIMSON_STEM, false);
        stairSlab(BVBlocks.STRIPPED_WARPED_STEM_STAIRS.get(), BVBlocks.STRIPPED_WARPED_STEM_SLAB.get(), Blocks.STRIPPED_WARPED_STEM, false);

        recipeWoods(BVBlocks.OAK_WOOD_STAIRS.get(), BVBlocks.OAK_WOOD_SLAB.get(), BVBlocks.OAK_WOOD_WALL.get(), BVBlocks.OAK_WOOD_FENCE.get(), BVBlocks.OAK_WOOD_FENCE_GATE.get(), Blocks.OAK_WOOD, Blocks.OAK_LOG);
        recipeWoods(BVBlocks.SPRUCE_WOOD_STAIRS.get(), BVBlocks.SPRUCE_WOOD_SLAB.get(), BVBlocks.SPRUCE_WOOD_WALL.get(), BVBlocks.SPRUCE_WOOD_FENCE.get(), BVBlocks.SPRUCE_WOOD_FENCE_GATE.get(), Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG);
        recipeWoods(BVBlocks.BIRCH_WOOD_STAIRS.get(), BVBlocks.BIRCH_WOOD_SLAB.get(), BVBlocks.BIRCH_WOOD_WALL.get(), BVBlocks.BIRCH_WOOD_FENCE.get(), BVBlocks.BIRCH_WOOD_FENCE_GATE.get(), Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG);
        recipeWoods(BVBlocks.JUNGLE_WOOD_STAIRS.get(), BVBlocks.JUNGLE_WOOD_SLAB.get(), BVBlocks.JUNGLE_WOOD_WALL.get(), BVBlocks.JUNGLE_WOOD_FENCE.get(), BVBlocks.JUNGLE_WOOD_FENCE_GATE.get(), Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG);
        recipeWoods(BVBlocks.ACACIA_WOOD_STAIRS.get(), BVBlocks.ACACIA_WOOD_SLAB.get(), BVBlocks.ACACIA_WOOD_WALL.get(), BVBlocks.ACACIA_WOOD_FENCE.get(), BVBlocks.ACACIA_WOOD_FENCE_GATE.get(), Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG);
        recipeWoods(BVBlocks.DARK_OAK_WOOD_STAIRS.get(), BVBlocks.DARK_OAK_WOOD_SLAB.get(), BVBlocks.DARK_OAK_WOOD_WALL.get(), BVBlocks.DARK_OAK_WOOD_FENCE.get(), BVBlocks.DARK_OAK_WOOD_FENCE_GATE.get(), Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG);
        recipeWoods(BVBlocks.MANGROVE_WOOD_STAIRS.get(), BVBlocks.MANGROVE_WOOD_SLAB.get(), BVBlocks.MANGROVE_WOOD_WALL.get(), BVBlocks.MANGROVE_WOOD_FENCE.get(), BVBlocks.MANGROVE_WOOD_FENCE_GATE.get(), Blocks.MANGROVE_WOOD, Blocks.MANGROVE_LOG);
        recipeWoods(BVBlocks.CHERRY_WOOD_STAIRS.get(), BVBlocks.CHERRY_WOOD_SLAB.get(), BVBlocks.CHERRY_WOOD_WALL.get(), BVBlocks.CHERRY_WOOD_FENCE.get(), BVBlocks.CHERRY_WOOD_FENCE_GATE.get(), Blocks.CHERRY_WOOD, Blocks.CHERRY_LOG);
        recipeWoods(BVBlocks.BAMBOO_BLOCK_STAIRS.get(), BVBlocks.BAMBOO_BLOCK_SLAB.get(), BVBlocks.BAMBOO_BLOCK_WALL.get(), BVBlocks.BAMBOO_BLOCK_FENCE.get(), BVBlocks.BAMBOO_BLOCK_FENCE_GATE.get(), Blocks.BAMBOO_BLOCK);
        recipeWoods(BVBlocks.CRIMSON_HYPHAE_STAIRS.get(), BVBlocks.CRIMSON_HYPHAE_SLAB.get(), BVBlocks.CRIMSON_HYPHAE_WALL.get(), BVBlocks.CRIMSON_HYPHAE_FENCE.get(), BVBlocks.CRIMSON_HYPHAE_FENCE_GATE.get(), Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
        recipeWoods(BVBlocks.WARPED_HYPHAE_STAIRS.get(), BVBlocks.WARPED_HYPHAE_SLAB.get(), BVBlocks.WARPED_HYPHAE_WALL.get(), BVBlocks.WARPED_HYPHAE_FENCE.get(), BVBlocks.WARPED_HYPHAE_FENCE_GATE.get(), Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);
        recipeWoods(BVBlocks.STRIPPED_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_OAK_WOOD_SLAB.get(), BVBlocks.STRIPPED_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG);
        recipeWoods(BVBlocks.STRIPPED_SPRUCE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_SLAB.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE.get(), BVBlocks.STRIPPED_SPRUCE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG);
        recipeWoods(BVBlocks.STRIPPED_BIRCH_WOOD_STAIRS.get(), BVBlocks.STRIPPED_BIRCH_WOOD_SLAB.get(), BVBlocks.STRIPPED_BIRCH_WOOD_WALL.get(), BVBlocks.STRIPPED_BIRCH_WOOD_FENCE.get(), BVBlocks.STRIPPED_BIRCH_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG);
        recipeWoods(BVBlocks.STRIPPED_JUNGLE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_SLAB.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE.get(), BVBlocks.STRIPPED_JUNGLE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG);
        recipeWoods(BVBlocks.STRIPPED_ACACIA_WOOD_STAIRS.get(), BVBlocks.STRIPPED_ACACIA_WOOD_SLAB.get(), BVBlocks.STRIPPED_ACACIA_WOOD_WALL.get(), BVBlocks.STRIPPED_ACACIA_WOOD_FENCE.get(), BVBlocks.STRIPPED_ACACIA_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG);
        recipeWoods(BVBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_SLAB.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_DARK_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG);
        recipeWoods(BVBlocks.STRIPPED_MANGROVE_WOOD_STAIRS.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_SLAB.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_WALL.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE.get(), BVBlocks.STRIPPED_MANGROVE_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_LOG);
        recipeWoods(BVBlocks.STRIPPED_CHERRY_WOOD_STAIRS.get(), BVBlocks.STRIPPED_CHERRY_WOOD_SLAB.get(), BVBlocks.STRIPPED_CHERRY_WOOD_WALL.get(), BVBlocks.STRIPPED_CHERRY_WOOD_FENCE.get(), BVBlocks.STRIPPED_CHERRY_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_CHERRY_WOOD, Blocks.STRIPPED_CHERRY_LOG);
        recipeWoods(BVBlocks.STRIPPED_PALE_OAK_WOOD_STAIRS.get(), BVBlocks.STRIPPED_PALE_OAK_WOOD_SLAB.get(), BVBlocks.STRIPPED_PALE_OAK_WOOD_WALL.get(), BVBlocks.STRIPPED_PALE_OAK_WOOD_FENCE.get(), BVBlocks.STRIPPED_PALE_OAK_WOOD_FENCE_GATE.get(), Blocks.STRIPPED_PALE_OAK_WOOD, Blocks.STRIPPED_PALE_OAK_LOG);
        recipeWoods(BVBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(), BVBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get(), Blocks.STRIPPED_BAMBOO_BLOCK);
        recipeWoods(BVBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_WALL.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE.get(), BVBlocks.STRIPPED_CRIMSON_HYPHAE_FENCE_GATE.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM);
        recipeWoods(BVBlocks.STRIPPED_WARPED_HYPHAE_STAIRS.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_SLAB.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_WALL.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE.get(), BVBlocks.STRIPPED_WARPED_HYPHAE_FENCE_GATE.get(), Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM);

        all(BVBlocks.CALCITE_STAIRS.get(), BVBlocks.CALCITE_SLAB.get(), BVBlocks.CALCITE_WALL.get(), Blocks.CALCITE, true);
        all(BVBlocks.SMOOTH_BASALT_STAIRS.get(), BVBlocks.SMOOTH_BASALT_SLAB.get(), BVBlocks.SMOOTH_BASALT_WALL.get(), Blocks.SMOOTH_BASALT, true);
        smelting(BVBlocks.SMOOTH_BASALT_STAIRS.get(), BVBlocks.BASALT_STAIRS.get());
        smelting(BVBlocks.SMOOTH_BASALT_SLAB.get(), BVBlocks.BASALT_SLAB.get());
        smelting(BVBlocks.SMOOTH_BASALT_WALL.get(), BVBlocks.BASALT_WALL.get());

        all(BVBlocks.DEEPSLATE_STAIRS.get(), BVBlocks.DEEPSLATE_SLAB.get(), BVBlocks.DEEPSLATE_WALL.get(), Blocks.DEEPSLATE, true);
        all(BVBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), BVBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), BVBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), Blocks.CRACKED_DEEPSLATE_BRICKS, true);
        all(BVBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), BVBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), BVBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), Blocks.CRACKED_DEEPSLATE_TILES, true);

        netherFenceGate(BVBlocks.NETHER_BRICK_FENCE_GATE.get(), Blocks.NETHER_BRICKS);
        all(BVBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), BVBlocks.CRACKED_NETHER_BRICK_SLAB.get(), BVBlocks.CRACKED_NETHER_BRICK_WALL.get(), Blocks.CRACKED_NETHER_BRICKS, true);
        netherFence(BVBlocks.CRACKED_NETHER_BRICK_FENCE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFence(BVBlocks.RED_NETHER_BRICK_FENCE.get(), Blocks.RED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.RED_NETHER_BRICK_FENCE_GATE.get(), Blocks.RED_NETHER_BRICKS);

        all(BVBlocks.OBSIDIAN_STAIRS.get(), BVBlocks.OBSIDIAN_SLAB.get(), BVBlocks.OBSIDIAN_WALL.get(), Blocks.OBSIDIAN, false);
        all(BVBlocks.CRYING_OBSIDIAN_STAIRS.get(), BVBlocks.CRYING_OBSIDIAN_SLAB.get(), BVBlocks.CRYING_OBSIDIAN_WALL.get(), Blocks.CRYING_OBSIDIAN, false);

        all(BVBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), Blocks.WHITE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.WHITE_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.WHITE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.WHITE_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.WHITE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.WHITE_TERRACOTTA_WALL.get());
        all(BVBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), Blocks.ORANGE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.ORANGE_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.ORANGE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.ORANGE_TERRACOTTA_WALL.get());
        all(BVBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), Blocks.MAGENTA_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.MAGENTA_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.MAGENTA_TERRACOTTA_WALL.get());
        all(BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        all(BVBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), Blocks.YELLOW_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.YELLOW_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.YELLOW_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.YELLOW_TERRACOTTA_WALL.get());
        all(BVBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIME_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.LIME_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIME_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.LIME_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIME_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.LIME_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.LIME_TERRACOTTA_WALL.get());
        all(BVBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), Blocks.PINK_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.PINK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PINK_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.PINK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PINK_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.PINK_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.PINK_TERRACOTTA_WALL.get());
        all(BVBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.GRAY_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GRAY_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GRAY_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.GRAY_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.GRAY_TERRACOTTA_WALL.get());
        all(BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        all(BVBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), Blocks.CYAN_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.CYAN_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.CYAN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.CYAN_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.CYAN_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.CYAN_TERRACOTTA_WALL.get());
        all(BVBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), Blocks.PURPLE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.PURPLE_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.PURPLE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.PURPLE_TERRACOTTA_WALL.get());
        all(BVBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLUE_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLUE_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.BLUE_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLUE_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.BLUE_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.BLUE_TERRACOTTA_WALL.get());
        all(BVBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), Blocks.BROWN_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BROWN_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.BROWN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BROWN_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.BROWN_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.BROWN_TERRACOTTA_WALL.get());
        all(BVBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), Blocks.GREEN_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.GREEN_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.GREEN_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.GREEN_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.GREEN_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.GREEN_TERRACOTTA_WALL.get());
        all(BVBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), Blocks.RED_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.RED_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.RED_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.RED_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.RED_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.RED_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.RED_TERRACOTTA_WALL.get());
        all(BVBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), Blocks.BLACK_GLAZED_TERRACOTTA, true);
        smelting(BVBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS.get(), BVBlocks.BLACK_TERRACOTTA_STAIRS.get());
        smelting(BVBlocks.BLACK_GLAZED_TERRACOTTA_SLAB.get(), BVBlocks.BLACK_TERRACOTTA_SLAB.get());
        smelting(BVBlocks.BLACK_GLAZED_TERRACOTTA_WALL.get(), BVBlocks.BLACK_TERRACOTTA_WALL.get());

        all(BVBlocks.WHITE_WOOL_STAIRS.get(), BVBlocks.WHITE_WOOL_SLAB.get(), BVBlocks.WHITE_WOOL_WALL.get(), Blocks.WHITE_WOOL, false);
        all(BVBlocks.ORANGE_WOOL_STAIRS.get(), BVBlocks.ORANGE_WOOL_SLAB.get(), BVBlocks.ORANGE_WOOL_WALL.get(), Blocks.ORANGE_WOOL, false);
        all(BVBlocks.MagentaWoolStairs.get(), BVBlocks.MagentaWoolSlab.get(), BVBlocks.MagentaWoolWall.get(), Blocks.MAGENTA_WOOL, false);
        all(BVBlocks.LightBlueWoolStairs.get(), BVBlocks.LightBlueWoolSlab.get(), BVBlocks.LightBlueWoolWall.get(), Blocks.LIGHT_BLUE_WOOL, false);
        all(BVBlocks.YellowWoolStairs.get(), BVBlocks.YellowWoolSlab.get(), BVBlocks.YellowWoolWall.get(), Blocks.YELLOW_WOOL, false);
        all(BVBlocks.LimeWoolStairs.get(), BVBlocks.LimeWoolSlab.get(), BVBlocks.LimeWoolWall.get(), Blocks.LIME_WOOL, false);
        all(BVBlocks.PinkWoolStairs.get(), BVBlocks.PinkWoolSlab.get(), BVBlocks.PinkWoolWall.get(), Blocks.PINK_WOOL, false);
        all(BVBlocks.GrayWoolStairs.get(), BVBlocks.GrayWoolSlab.get(), BVBlocks.GrayWoolWall.get(), Blocks.GRAY_WOOL, false);
        all(BVBlocks.LightGrayWoolStairs.get(), BVBlocks.LightGrayWoolSlab.get(), BVBlocks.LightGrayWoolWall.get(), Blocks.LIGHT_GRAY_WOOL, false);
        all(BVBlocks.CYAN_WOOL_STAIRS.get(), BVBlocks.CYAN_WOOL_SLAB.get(), BVBlocks.CYAN_WOOL_WALL.get(), Blocks.CYAN_WOOL, false);
        all(BVBlocks.PURPLE_WOOL_STAIRS.get(), BVBlocks.PURPLE_WOOL_SLAB.get(), BVBlocks.PURPLE_WOOL_WALL.get(), Blocks.PURPLE_WOOL, false);
        all(BVBlocks.BLUE_WOOL_STAIRS.get(), BVBlocks.BLUE_WOOL_SLAB.get(), BVBlocks.BLUE_WOOL_WALL.get(), Blocks.BLUE_WOOL, false);
        all(BVBlocks.BROWN_WOOL_STAIRS.get(), BVBlocks.BROWN_WOOL_SLAB.get(), BVBlocks.BROWN_WOOL_WALL.get(), Blocks.BROWN_WOOL, false);
        all(BVBlocks.GREEN_WOOL_STAIRS.get(), BVBlocks.GREEN_WOOL_SLAB.get(), BVBlocks.GREEN_WOOL_WALL.get(), Blocks.GREEN_WOOL, false);
        all(BVBlocks.RED_WOOL_STAIRS.get(), BVBlocks.RED_WOOL_SLAB.get(), BVBlocks.RED_WOOL_WALL.get(), Blocks.RED_WOOL, false);
        all(BVBlocks.BLACK_WOOL_STAIRS.get(), BVBlocks.BLACK_WOOL_SLAB.get(), BVBlocks.BLACK_WOOL_WALL.get(), Blocks.BLACK_WOOL, false);

        dying(BVTags.Items.WOOL_STAIRS, "{color}_wool_stairs", "dye_wool_stairs");
        dying(BVTags.Items.WOOL_SLABS, "{color}_wool_slab", "dye_wool_slabs");
        dying(BVTags.Items.WOOL_WALLS, "{color}_wool_wall", "dye_wool_walls");

        all(BVBlocks.PACKED_MUD_STAIRS.get(), BVBlocks.PACKED_MUD_SLAB.get(), BVBlocks.PACKED_MUD_WALL.get(), Blocks.PACKED_MUD, true);


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
        } //Recipe overrides
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
        return ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(BlockVariants.MOD_ID, getItemName(item)));
    }

    public static class Runner extends ExtendedRecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected ExtendedRecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput, Set<ResourceLocation> set) {
            return new BVRecipeProvider(provider, recipeOutput, set);
        }

        @Override @NotNull
        public String getName() {
            return "Block Variants Recipe Provider";
        }
    }
}