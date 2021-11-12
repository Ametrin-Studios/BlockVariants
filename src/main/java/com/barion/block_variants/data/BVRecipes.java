package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class BVRecipes extends RecipeProvider {
    private Consumer<IFinishedRecipe> consumer;
    public BVRecipes(DataGenerator generator){super(generator);}

    @Override @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        this.consumer = consumer;
        recipeWall(BVBlocks.Polished_Granite_Wall.get().asItem(), Items.POLISHED_GRANITE, Items.GRANITE, Items.GRANITE_WALL);
        recipeWall(BVBlocks.Polished_Diorite_Wall.get().asItem(), Items.POLISHED_DIORITE, Items.DIORITE, Items.DIORITE_WALL);
        recipeWall(BVBlocks.Polished_Andesite_Wall.get().asItem(), Items.POLISHED_ANDESITE, Items.ANDESITE, Items.ANDESITE_WALL);

        recipeSmelting(Items.STONE_STAIRS, Items.COBBLESTONE_STAIRS);
        recipeSmelting(Items.STONE_SLAB, Items.COBBLESTONE_SLAB);
        recipeWall(BVBlocks.Stone_Wall.get().asItem(), Items.STONE);
        recipeSmelting(BVBlocks.Stone_Wall.get().asItem(), Items.COBBLESTONE_WALL);
        recipeStairs(BVBlocks.Smooth_Stone_Stairs.get().asItem(), Items.SMOOTH_STONE);
        recipeSmelting(BVBlocks.Smooth_Stone_Stairs.get().asItem(), Items.STONE_STAIRS);
        recipeSmelting(Items.SMOOTH_STONE_SLAB, Items.STONE_SLAB);
        recipeWall(BVBlocks.Smooth_Stone_Wall.get().asItem(), Items.SMOOTH_STONE);
        recipeSmelting(BVBlocks.Smooth_Stone_Wall.get().asItem(), BVBlocks.Stone_Wall.get().asItem());

        recipeStairs(BVBlocks.Cut_Sandstone_Stairs.get().asItem(), Items.CUT_SANDSTONE, Items.SANDSTONE, Items.SANDSTONE_STAIRS);
        recipeStairs(BVBlocks.Cut_Red_Sandstone_Stairs.get().asItem(), Items.CUT_RED_SANDSTONE, Items.RED_SANDSTONE, Items.RED_SANDSTONE_STAIRS);
        recipeWall(BVBlocks.Cut_Sandstone_Wall.get().asItem(), Items.CUT_SANDSTONE, Items.SANDSTONE, Items.SANDSTONE_WALL);
        recipeWall(BVBlocks.Cut_Red_Sandstone_Wall.get().asItem(), Items.CUT_RED_SANDSTONE, Items.RED_SANDSTONE, Items.RED_SANDSTONE_WALL);

        recipeWall(BVBlocks.Quartz_Wall.get().asItem(), Items.QUARTZ_BLOCK);
        recipeStairs(BVBlocks.Quartz_Bricks_Stairs.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS);
        recipeSlab(BVBlocks.Quartz_Bricks_Slab.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB);
        recipeWall(BVBlocks.Quartz_Bricks_Wall.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, BVBlocks.Quartz_Wall.get().asItem());
        recipeSmelting(Items.SMOOTH_QUARTZ_STAIRS, Items.QUARTZ_STAIRS);
        recipeSmelting(Items.SMOOTH_QUARTZ_SLAB, Items.QUARTZ_SLAB);
        recipeWall(BVBlocks.Smooth_Quartz_Wall.get().asItem(), Items.SMOOTH_QUARTZ);
        recipeSmelting(BVBlocks.Smooth_Quartz_Wall.get().asItem(), BVBlocks.Quartz_Wall.get().asItem());
        recipeStairs(BVBlocks.Chiseled_Quartz_Block_Stairs.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS);
        recipeSlab(BVBlocks.Chiseled_Quartz_Block_Slab.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB);
        recipeWall(BVBlocks.Chiseled_Quartz_Block_Wall.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_BLOCK, BVBlocks.Quartz_Wall.get().asItem());

        recipeWall(BVBlocks.Prismarine_Bricks_Wall.get().asItem(), Items.PRISMARINE_BRICKS);
        recipeWall(BVBlocks.Dark_Prismarine_Wall.get().asItem(), Items.DARK_PRISMARINE);
        recipeAll(BVBlocks.Netherrack_Stairs.get().asItem(), BVBlocks.Netherrack_Slab.get().asItem(), BVBlocks.Netherrack_Wall.get().asItem(), Items.NETHERRACK);
        recipeAll(BVBlocks.End_Stone_Stairs.get().asItem(), BVBlocks.End_Stone_Slab.get().asItem(), BVBlocks.End_Stone_Wall.get().asItem(), Items.END_STONE);

        recipeAll(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get().asItem(), BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get().asItem(), BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get().asItem(), Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        recipeSmelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_STAIRS);
        recipeSmelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_SLAB);
        recipeSmelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_WALL);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_STAIRS, Items.BLACKSTONE_STAIRS, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.BLACKSTONE_STAIRS, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.POLISHED_BLACKSTONE_STAIRS, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_SLAB, Items.BLACKSTONE_SLAB, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_SLAB, Items.BLACKSTONE_SLAB, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_SLAB, Items.POLISHED_BLACKSTONE_SLAB, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_WALL, Items.BLACKSTONE_WALL, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_WALL, Items.BLACKSTONE_WALL, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_WALL, Items.POLISHED_BLACKSTONE_WALL, true);

        recipeAll(BVBlocks.Basalt_Stairs.get().asItem(), BVBlocks.Basalt_Slab.get().asItem(), BVBlocks.Basalt_Wall.get().asItem(), Items.BASALT);
        recipeStairs(BVBlocks.Polished_Basalt_Stairs.get().asItem(), Items.POLISHED_BASALT, Items.BASALT, BVBlocks.Basalt_Stairs.get().asItem());
        recipeSlab(BVBlocks.Polished_Basalt_Slab.get().asItem(), Items.POLISHED_BASALT, Items.BASALT, BVBlocks.Basalt_Slab.get().asItem());
        recipeWall(BVBlocks.Polished_Basalt_Wall.get().asItem(), Items.POLISHED_BASALT, Items.BASALT, BVBlocks.Basalt_Wall.get().asItem());

        recipeStairsSlab(BVBlocks.Oak_Log_Stairs.get().asItem(), BVBlocks.Oak_Log_Slab.get().asItem(), Items.OAK_LOG, false);
        recipeStairsSlab(BVBlocks.Spruce_Log_Stairs.get().asItem(), BVBlocks.Spruce_Log_Slab.get().asItem(), Items.SPRUCE_LOG, false);
        recipeStairsSlab(BVBlocks.Birch_Log_Stairs.get().asItem(), BVBlocks.Birch_Log_Slab.get().asItem(), Items.BIRCH_LOG, false);
        recipeStairsSlab(BVBlocks.Jungle_Log_Stairs.get().asItem(), BVBlocks.Jungle_Log_Slab.get().asItem(), Items.JUNGLE_LOG, false);
        recipeStairsSlab(BVBlocks.Acacia_Log_Stairs.get().asItem(), BVBlocks.Acacia_Log_Slab.get().asItem(), Items.ACACIA_LOG, false);
        recipeStairsSlab(BVBlocks.Dark_Oak_Log_Stairs.get().asItem(), BVBlocks.Dark_Oak_Log_Slab.get().asItem(), Items.DARK_OAK_LOG, false);
        recipeStairsSlab(BVBlocks.Stripped_Oak_Log_Stairs.get().asItem(), BVBlocks.Stripped_Oak_Log_Slab.get().asItem(), Items.STRIPPED_OAK_LOG, false);
        recipeStairsSlab(BVBlocks.Stripped_Spruce_Log_Stairs.get().asItem(), BVBlocks.Stripped_Spruce_Log_Slab.get().asItem(), Items.STRIPPED_SPRUCE_LOG, false);
        recipeStairsSlab(BVBlocks.Stripped_Birch_Log_Stairs.get().asItem(), BVBlocks.Stripped_Birch_Log_Slab.get().asItem(), Items.STRIPPED_BIRCH_LOG, false);
        recipeStairsSlab(BVBlocks.Stripped_Jungle_Log_Stairs.get().asItem(), BVBlocks.Stripped_Jungle_Log_Slab.get().asItem(), Items.STRIPPED_JUNGLE_LOG, false);
        recipeStairsSlab(BVBlocks.Stripped_Acacia_Log_Stairs.get().asItem(), BVBlocks.Stripped_Acacia_Log_Slab.get().asItem(), Items.STRIPPED_ACACIA_LOG, false);
        recipeStairsSlab(BVBlocks.Stripped_Dark_Oak_Log_Stairs.get().asItem(), BVBlocks.Stripped_Dark_Oak_Log_Slab.get().asItem(), Items.STRIPPED_DARK_OAK_LOG, false);
        recipeStairsSlab(BVBlocks.Crimson_Stem_Stairs.get().asItem(), BVBlocks.Crimson_Stem_Slab.get().asItem(), Items.CRIMSON_STEM, false);
        recipeStairsSlab(BVBlocks.Warped_Stem_Stairs.get().asItem(), BVBlocks.Warped_Stem_Slab.get().asItem(), Items.WARPED_STEM, false);
        recipeStairsSlab(BVBlocks.Stripped_Crimson_Stem_Stairs.get().asItem(), BVBlocks.Stripped_Crimson_Stem_Slab.get().asItem(), Items.STRIPPED_CRIMSON_STEM, false);
        recipeStairsSlab(BVBlocks.Stripped_Warped_Stem_Stairs.get().asItem(), BVBlocks.Stripped_Warped_Stem_Slab.get().asItem(), Items.STRIPPED_WARPED_STEM, false);
    }

    private void recipeAll(Item stairs, Item slab, Item wall, Item material, boolean isStone){
        recipeStairs(stairs, material, isStone);
        recipeSlab(slab, material, isStone);
        recipeWall(wall, material, isStone);
    }
    private void recipeAll(Item stairs, Item slab, Item wall, Item material){
        recipeStairs(stairs, material, true);
        recipeSlab(slab, material, true);
        recipeWall(wall, material, true);
    }
    private void recipeStairsSlab(Item stairs, Item slab, Item material, boolean isStone){
        recipeStairs(stairs, material, isStone);
        recipeSlab(slab, material, isStone);
    }
    protected void recipeStairs(Item stairs, Item material, boolean isStone){
        ShapedRecipeBuilder.shaped(stairs, 4)
                .define('#', material)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy("has_item", has(material))
                .save(consumer);
        if(isStone)
            recipeStonecutting(stairs, material);
    }
    protected void recipeStairs(Item stairs, Item material){
        recipeStairs(stairs, material, true);
    }
    protected void recipeStairs(Item stairs, Item material, Item... addMats){
        recipeStairs(stairs, material);
        for (Item item : addMats) {
            recipeStonecutting(stairs, item, true);
        }
    }
    protected void recipeSlab(Item slab, Item material, boolean isStone){
        ShapedRecipeBuilder.shaped(slab, 6)
                .define('#', material)
                .pattern("###")
                .unlockedBy("has_item", has(material))
                .save(consumer);
        if(isStone)
            recipeStonecutting(slab, material, 2);
    }
    protected void recipeSlab(Item slab, Item material){
        recipeSlab(slab, material, true);
    }
    protected void recipeSlab(Item slab, Item material, Item... addMats){
        recipeSlab(slab, material, true);
        for (Item item : addMats) {
            recipeStonecutting(slab, item, 2, true);
        }
    }
    protected void recipeWall(Item wall, Item material, boolean isStone) {
        ShapedRecipeBuilder.shaped(wall, 6)
                .define('#', material)
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(material))
                .save(consumer);
        if(isStone)
            recipeStonecutting(wall, material);
    }
    protected void recipeWall(Item wall, Item material) {
        recipeWall(wall, material, true);
    }
    protected void recipeWall(Item wall, Item material, Item... addMats) {
        recipeWall(wall, material);
        for (Item item : addMats) {
            recipeStonecutting(wall, item, true);
        }
    }
    protected void recipeStonecutting(Item result, Item ingredient){
        recipeStonecutting(result, ingredient, 1);
    }
    protected void recipeStonecutting(Item result, Item ingredient, int amount){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result, amount).unlocks("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting"));
    }
    protected void recipeStonecutting(Item result, Item ingredient, boolean addToID){
        recipeStonecutting(result, ingredient, 1, addToID);
    }
    protected void recipeStonecutting(Item result, Item ingredient, int amount, boolean addToID){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result, amount).unlocks("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting_" + ingredient));
    }
    protected void recipeSmelting(Item result, Item ingredient) {
        CookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, 0.1F, 200).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_smelting"));
    }
    private static ResourceLocation recipeID(Item item) { return new ResourceLocation(BlockVariants.Mod_ID, item.toString());}
    private static ResourceLocation recipeID(Item item, String add) { return new ResourceLocation(BlockVariants.Mod_ID, item.toString() + add);}
}