package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.stuff.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ModRecipes extends RecipeProvider {
    private Consumer<FinishedRecipe> consumer;
    public ModRecipes(DataGenerator generator){super(generator);}

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        this.consumer = consumer;
        recipeWall(ModBlocks.Polished_Granite_Wall.get().asItem(), Items.POLISHED_GRANITE, new Item[] {Items.GRANITE, Items.GRANITE_WALL});
        recipeWall(ModBlocks.Polished_Diorite_Wall.get().asItem(), Items.POLISHED_DIORITE, new Item[] {Items.DIORITE, Items.DIORITE_WALL});
        recipeWall(ModBlocks.Polished_Andesite_Wall.get().asItem(), Items.POLISHED_ANDESITE, new Item[] {Items.ANDESITE, Items.ANDESITE_WALL});

        recipeSmelting(Items.STONE_STAIRS, Items.COBBLESTONE_STAIRS);
        recipeSmelting(Items.STONE_SLAB, Items.COBBLESTONE_SLAB);
        recipeWall(ModBlocks.Stone_Wall.get().asItem(), Items.STONE);
        recipeSmelting(ModBlocks.Stone_Wall.get().asItem(), Items.COBBLESTONE_WALL);
        recipeStairs(ModBlocks.Smooth_Stone_Stairs.get().asItem(), Items.SMOOTH_STONE);
        recipeSmelting(ModBlocks.Smooth_Stone_Stairs.get().asItem(), Items.STONE_STAIRS);
        recipeSmelting(Items.SMOOTH_STONE_SLAB, Items.STONE_SLAB);
        recipeWall(ModBlocks.Smooth_Stone_Wall.get().asItem(), Items.SMOOTH_STONE);
        recipeSmelting(ModBlocks.Smooth_Stone_Wall.get().asItem(), ModBlocks.Stone_Wall.get().asItem());

        recipeStairs(ModBlocks.Cut_Sandstone_Stairs.get().asItem(), Items.CUT_SANDSTONE, new Item[] {Items.SANDSTONE, Items.SANDSTONE_STAIRS});
        recipeStairs(ModBlocks.Cut_Red_Sandstone_Stairs.get().asItem(), Items.CUT_RED_SANDSTONE, new Item[] {Items.RED_SANDSTONE, Items.RED_SANDSTONE_STAIRS});
        recipeWall(ModBlocks.Cut_Sandstone_Wall.get().asItem(), Items.CUT_SANDSTONE, new Item[] {Items.SANDSTONE, Items.SANDSTONE_WALL});
        recipeWall(ModBlocks.Cut_Red_Sandstone_Wall.get().asItem(), Items.CUT_RED_SANDSTONE, new Item[] {Items.RED_SANDSTONE, Items.RED_SANDSTONE_WALL});

        recipeWall(ModBlocks.Quartz_Wall.get().asItem(), Items.QUARTZ_BLOCK);
        recipeStairs(ModBlocks.Quartz_Bricks_Stairs.get().asItem(), Items.QUARTZ_BRICKS, new  Item[] {Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS});
        recipeSlab(ModBlocks.Quartz_Bricks_Slab.get().asItem(), Items.QUARTZ_BRICKS, new  Item[] {Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB});
        recipeWall(ModBlocks.Quartz_Bricks_Wall.get().asItem(), Items.QUARTZ_BRICKS, new Item[] {Items.QUARTZ_BLOCK, ModBlocks.Quartz_Wall.get().asItem()});
        recipeSmelting(Items.SMOOTH_QUARTZ_STAIRS, Items.QUARTZ_STAIRS);
        recipeSmelting(Items.SMOOTH_QUARTZ_SLAB, Items.QUARTZ_SLAB);
        recipeWall(ModBlocks.Smooth_Quartz_Wall.get().asItem(), Items.SMOOTH_QUARTZ);
        recipeSmelting(ModBlocks.Smooth_Quartz_Wall.get().asItem(), ModBlocks.Quartz_Wall.get().asItem());
        recipeStairs(ModBlocks.Chiseled_Quartz_Block_Stairs.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, new Item[] {Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS});
        recipeSlab(ModBlocks.Chiseled_Quartz_Block_Slab.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, new Item[] {Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB});
        recipeWall(ModBlocks.Chiseled_Quartz_Block_Wall.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, new Item[] {Items.QUARTZ_BLOCK, ModBlocks.Quartz_Wall.get().asItem()});

        recipeWall(ModBlocks.Prismarine_Bricks_Wall.get().asItem(), Items.PRISMARINE_BRICKS);
        recipeWall(ModBlocks.Dark_Prismarine_Wall.get().asItem(), Items.DARK_PRISMARINE);
        recipeAll(ModBlocks.Netherrack_Stairs.get().asItem(), ModBlocks.Netherrack_Slab.get().asItem(), ModBlocks.Netherrack_Wall.get().asItem(), Items.NETHERRACK);
        recipeAll(ModBlocks.End_Stone_Stairs.get().asItem(), ModBlocks.End_Stone_Slab.get().asItem(), ModBlocks.End_Stone_Wall.get().asItem(), Items.END_STONE);

        recipeAll(ModBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get().asItem(), ModBlocks.Cracked_Polished_Blackstone_Brick_Slab.get().asItem(), ModBlocks.Cracked_Polished_Blackstone_Brick_Wall.get().asItem(), Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        recipeSmelting(ModBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_STAIRS);
        recipeSmelting(ModBlocks.Cracked_Polished_Blackstone_Brick_Slab.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_SLAB);
        recipeSmelting(ModBlocks.Cracked_Polished_Blackstone_Brick_Wall.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_WALL);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_STAIRS, Items.BLACKSTONE_STAIRS, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.BLACKSTONE_STAIRS, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.POLISHED_BLACKSTONE_STAIRS, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_SLAB, Items.BLACKSTONE_SLAB, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_SLAB, Items.BLACKSTONE_SLAB, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_SLAB, Items.POLISHED_BLACKSTONE_SLAB, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_WALL, Items.BLACKSTONE_WALL, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_WALL, Items.BLACKSTONE_WALL, true);
        recipeStonecutting(Items.POLISHED_BLACKSTONE_BRICK_WALL, Items.POLISHED_BLACKSTONE_WALL, true);

        recipeAll(ModBlocks.Basalt_Stairs.get().asItem(), ModBlocks.Basalt_Slab.get().asItem(), ModBlocks.Basalt_Wall.get().asItem(), Items.BASALT);
        recipeStairs(ModBlocks.Polished_Basalt_Stairs.get().asItem(), Items.POLISHED_BASALT, new Item[] {Items.BASALT, ModBlocks.Basalt_Stairs.get().asItem()});
        recipeSlab(ModBlocks.Polished_Basalt_Slab.get().asItem(), Items.POLISHED_BASALT, new Item[] {Items.BASALT, ModBlocks.Basalt_Slab.get().asItem()});
        recipeWall(ModBlocks.Polished_Basalt_Wall.get().asItem(), Items.POLISHED_BASALT, new Item[] {Items.BASALT, ModBlocks.Basalt_Wall.get().asItem()});

        recipeStairsSlab(ModBlocks.Oak_Log_Stairs.get().asItem(), ModBlocks.Oak_Log_Slab.get().asItem(), Items.OAK_LOG, false);
        recipeStairsSlab(ModBlocks.Spruce_Log_Stairs.get().asItem(), ModBlocks.Spruce_Log_Slab.get().asItem(), Items.SPRUCE_LOG, false);
        recipeStairsSlab(ModBlocks.Birch_Log_Stairs.get().asItem(), ModBlocks.Birch_Log_Slab.get().asItem(), Items.BIRCH_LOG, false);
        recipeStairsSlab(ModBlocks.Jungle_Log_Stairs.get().asItem(), ModBlocks.Jungle_Log_Slab.get().asItem(), Items.JUNGLE_LOG, false);
        recipeStairsSlab(ModBlocks.Acacia_Log_Stairs.get().asItem(), ModBlocks.Acacia_Log_Slab.get().asItem(), Items.ACACIA_LOG, false);
        recipeStairsSlab(ModBlocks.Dark_Oak_Log_Stairs.get().asItem(), ModBlocks.Dark_Oak_Log_Slab.get().asItem(), Items.DARK_OAK_LOG, false);
        recipeStairsSlab(ModBlocks.Stripped_Oak_Log_Stairs.get().asItem(), ModBlocks.Stripped_Oak_Log_Slab.get().asItem(), Items.STRIPPED_OAK_LOG, false);
        recipeStairsSlab(ModBlocks.Stripped_Spruce_Log_Stairs.get().asItem(), ModBlocks.Stripped_Spruce_Log_Slab.get().asItem(), Items.STRIPPED_SPRUCE_LOG, false);
        recipeStairsSlab(ModBlocks.Stripped_Birch_Log_Stairs.get().asItem(), ModBlocks.Stripped_Birch_Log_Slab.get().asItem(), Items.STRIPPED_BIRCH_LOG, false);
        recipeStairsSlab(ModBlocks.Stripped_Jungle_Log_Stairs.get().asItem(), ModBlocks.Stripped_Jungle_Log_Slab.get().asItem(), Items.STRIPPED_JUNGLE_LOG, false);
        recipeStairsSlab(ModBlocks.Stripped_Acacia_Log_Stairs.get().asItem(), ModBlocks.Stripped_Acacia_Log_Slab.get().asItem(), Items.STRIPPED_ACACIA_LOG, false);
        recipeStairsSlab(ModBlocks.Stripped_Dark_Oak_Log_Stairs.get().asItem(), ModBlocks.Stripped_Dark_Oak_Log_Slab.get().asItem(), Items.STRIPPED_DARK_OAK_LOG, false);
        recipeStairsSlab(ModBlocks.Crimson_Stem_Stairs.get().asItem(), ModBlocks.Crimson_Stem_Slab.get().asItem(), Items.CRIMSON_STEM, false);
        recipeStairsSlab(ModBlocks.Warped_Stem_Stairs.get().asItem(), ModBlocks.Warped_Stem_Slab.get().asItem(), Items.WARPED_STEM, false);
        recipeStairsSlab(ModBlocks.Stripped_Crimson_Stem_Stairs.get().asItem(), ModBlocks.Stripped_Crimson_Stem_Slab.get().asItem(), Items.STRIPPED_CRIMSON_STEM, false);
        recipeStairsSlab(ModBlocks.Stripped_Warped_Stem_Stairs.get().asItem(), ModBlocks.Stripped_Warped_Stem_Slab.get().asItem(), Items.STRIPPED_WARPED_STEM, false);
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
    protected void recipeStairs(Item stairs, Item material, Item[] addMats){
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
    protected void recipeSlab(Item slab, Item material, Item[] addMats){
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
    protected void recipeWall(Item wall, Item material, Item[] addMats) {
        recipeWall(wall, material);
        for (Item item : addMats) {
            recipeStonecutting(wall, item, true);
        }
    }
    protected void recipeStonecutting(Item result, Item ingredient){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting"));
    }
    protected void recipeStonecutting(Item result, Item ingredient, int amount){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result, amount).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting"));
    }
    protected void recipeStonecutting(Item result, Item ingredient, boolean addToID){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting_" + ingredient.toString()));
    }
    protected void recipeStonecutting(Item result, Item ingredient, int amount, boolean addToID){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result, amount).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting_" + ingredient.toString()));
    }
    protected void recipeSmelting(Item result, Item ingredient) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, 0.1F, 200).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_smelting"));
    }
    private static ResourceLocation recipeID(Item item) { return new ResourceLocation(BlockVariants.Mod_ID, item.toString());}
    private static ResourceLocation recipeID(Item item, String add) { return new ResourceLocation(BlockVariants.Mod_ID, item.toString() + add);}
}