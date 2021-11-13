package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class BVRecipes extends RecipeProvider {
    private Consumer<FinishedRecipe> consumer;
    public BVRecipes(DataGenerator generator){super(generator);}

    @Override @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
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

        recipeStairs(BVBlocks.Cut_Sandstone_Stairs.get().asItem(), Items.CUT_SANDSTONE, new Item[] {Items.SANDSTONE, Items.SANDSTONE_STAIRS});
        recipeStairs(BVBlocks.Cut_Red_Sandstone_Stairs.get().asItem(), Items.CUT_RED_SANDSTONE, new Item[] {Items.RED_SANDSTONE, Items.RED_SANDSTONE_STAIRS});
        recipeWall(BVBlocks.Cut_Sandstone_Wall.get().asItem(), Items.CUT_SANDSTONE, Items.SANDSTONE, Items.SANDSTONE_WALL);
        recipeWall(BVBlocks.Cut_Red_Sandstone_Wall.get().asItem(), Items.CUT_RED_SANDSTONE, Items.RED_SANDSTONE, Items.RED_SANDSTONE_WALL);

        recipeWall(BVBlocks.Quartz_Wall.get().asItem(), Items.QUARTZ_BLOCK);
        recipeStairs(BVBlocks.Quartz_Bricks_Stairs.get().asItem(), Items.QUARTZ_BRICKS, new  Item[] {Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS});
        recipeSlab(BVBlocks.Quartz_Bricks_Slab.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB);
        recipeWall(BVBlocks.Quartz_Bricks_Wall.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, BVBlocks.Quartz_Wall.get().asItem());
        recipeSmelting(Items.SMOOTH_QUARTZ_STAIRS, Items.QUARTZ_STAIRS);
        recipeSmelting(Items.SMOOTH_QUARTZ_SLAB, Items.QUARTZ_SLAB);
        recipeWall(BVBlocks.Smooth_Quartz_Wall.get().asItem(), Items.SMOOTH_QUARTZ);
        recipeSmelting(BVBlocks.Smooth_Quartz_Wall.get().asItem(), BVBlocks.Quartz_Wall.get().asItem());
        recipeStairs(BVBlocks.Chiseled_Quartz_Block_Stairs.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, new Item[] {Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS});
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
        recipeStairs(BVBlocks.Polished_Basalt_Stairs.get().asItem(), Items.POLISHED_BASALT, new Item[] {Items.BASALT, BVBlocks.Basalt_Stairs.get().asItem()});
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

        recipeWoods(BVBlocks.Oak_Wood_Stairs.get().asItem(), BVBlocks.Oak_Wood_Slab.get().asItem(), BVBlocks.Oak_Wood_Wall.get().asItem(), Items.OAK_WOOD, Items.OAK_LOG);
        recipeWoods(BVBlocks.Spruce_Wood_Stairs.get().asItem(), BVBlocks.Spruce_Wood_Slab.get().asItem(), BVBlocks.Spruce_Wood_Wall.get().asItem(), Items.SPRUCE_WOOD, Items.SPRUCE_LOG);
        recipeWoods(BVBlocks.Birch_Wood_Stairs.get().asItem(), BVBlocks.Birch_Wood_Slab.get().asItem(), BVBlocks.Birch_Wood_Wall.get().asItem(), Items.BIRCH_WOOD, Items.BIRCH_LOG);
        recipeWoods(BVBlocks.Jungle_Wood_Stairs.get().asItem(), BVBlocks.Jungle_Wood_Slab.get().asItem(), BVBlocks.Jungle_Wood_Wall.get().asItem(), Items.JUNGLE_WOOD, Items.JUNGLE_LOG);
        recipeWoods(BVBlocks.Acacia_Wood_Stairs.get().asItem(), BVBlocks.Acacia_Wood_Slab.get().asItem(), BVBlocks.Acacia_Wood_Wall.get().asItem(), Items.ACACIA_WOOD, Items.ACACIA_LOG);
        recipeWoods(BVBlocks.Dark_Oak_Wood_Stairs.get().asItem(), BVBlocks.Dark_Oak_Wood_Slab.get().asItem(), BVBlocks.Dark_Oak_Wood_Wall.get().asItem(), Items.DARK_OAK_WOOD, Items.DARK_OAK_LOG);
        recipeWoods(BVBlocks.Crimson_Hyphae_Stairs.get().asItem(), BVBlocks.Crimson_Hyphae_Slab.get().asItem(), BVBlocks.Crimson_Hyphae_Wall.get().asItem(), Items.CRIMSON_HYPHAE, Items.CRIMSON_STEM);
        recipeWoods(BVBlocks.Warped_Hyphae_Stairs.get().asItem(), BVBlocks.Warped_Hyphae_Slab.get().asItem(), BVBlocks.Warped_Hyphae_Wall.get().asItem(), Items.WARPED_HYPHAE, Items.WARPED_STEM);
        recipeWoods(BVBlocks.Stripped_Oak_Wood_Stairs.get().asItem(), BVBlocks.Stripped_Oak_Wood_Slab.get().asItem(), BVBlocks.Stripped_Oak_Wood_Wall.get().asItem(), Items.STRIPPED_OAK_WOOD, Items.STRIPPED_OAK_LOG);
        recipeWoods(BVBlocks.Stripped_Spruce_Wood_Stairs.get().asItem(), BVBlocks.Stripped_Spruce_Wood_Slab.get().asItem(), BVBlocks.Stripped_Spruce_Wood_Wall.get().asItem(), Items.STRIPPED_SPRUCE_WOOD, Items.STRIPPED_SPRUCE_LOG);
        recipeWoods(BVBlocks.Stripped_Birch_Wood_Stairs.get().asItem(), BVBlocks.Stripped_Birch_Wood_Slab.get().asItem(), BVBlocks.Stripped_Birch_Wood_Wall.get().asItem(), Items.STRIPPED_BIRCH_WOOD, Items.STRIPPED_BIRCH_LOG);
        recipeWoods(BVBlocks.Stripped_Jungle_Wood_Stairs.get().asItem(), BVBlocks.Stripped_Jungle_Wood_Slab.get().asItem(), BVBlocks.Stripped_Jungle_Wood_Wall.get().asItem(), Items.STRIPPED_JUNGLE_WOOD, Items.STRIPPED_JUNGLE_LOG);
        recipeWoods(BVBlocks.Stripped_Acacia_Wood_Stairs.get().asItem(), BVBlocks.Stripped_Acacia_Wood_Slab.get().asItem(), BVBlocks.Stripped_Acacia_Wood_Wall.get().asItem(), Items.STRIPPED_ACACIA_WOOD, Items.STRIPPED_ACACIA_LOG);
        recipeWoods(BVBlocks.Stripped_Dark_Oak_Wood_Stairs.get().asItem(), BVBlocks.Stripped_Dark_Oak_Wood_Slab.get().asItem(), BVBlocks.Stripped_Dark_Oak_Wood_Wall.get().asItem(), Items.STRIPPED_DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_LOG);
        recipeWoods(BVBlocks.Stripped_Crimson_Hyphae_Stairs.get().asItem(), BVBlocks.Stripped_Crimson_Hyphae_Slab.get().asItem(), BVBlocks.Stripped_Crimson_Hyphae_Wall.get().asItem(), Items.STRIPPED_CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_STEM);
        recipeWoods(BVBlocks.Stripped_Warped_Hyphae_Stairs.get().asItem(), BVBlocks.Stripped_Warped_Hyphae_Slab.get().asItem(), BVBlocks.Stripped_Warped_Hyphae_Wall.get().asItem(), Items.STRIPPED_WARPED_HYPHAE, Items.STRIPPED_WARPED_STEM);

        recipeAll(BVBlocks.Calcite_Stairs.get().asItem(), BVBlocks.Calcite_Slab.get().asItem(), BVBlocks.Calcite_Wall.get().asItem(), Items.CALCITE);
        recipeAll(BVBlocks.Smooth_Basalt_Stairs.get().asItem(), BVBlocks.Smooth_Basalt_Slab.get().asItem(), BVBlocks.Smooth_Basalt_Wall.get().asItem(), Items.SMOOTH_BASALT);
        recipeAll(BVBlocks.Tuff_Stairs.get().asItem(), BVBlocks.Tuff_Slab.get().asItem(), BVBlocks.Tuff_Wall.get().asItem(), Items.TUFF);

        ShapedRecipeBuilder.shaped(Items.DROPPER, 1)
                .define('#', ItemTags.STONE_CRAFTING_MATERIALS)
                .define('+', Items.REDSTONE)
                .pattern("###")
                .pattern("# #")
                .pattern("#+#")
                .unlockedBy("has_item", has(ItemTags.STONE_CRAFTING_MATERIALS))
                .save(consumer, recipeID(Items.DROPPER));

        ShapedRecipeBuilder.shaped(Items.DROPPER, 1)
                .define('#', Tags.Items.STONE)
                .define('+', Items.REDSTONE)
                .pattern("###")
                .pattern("# #")
                .pattern("#+#")
                .unlockedBy("has_item", has(Tags.Items.STONE))
                .save(consumer, recipeID(Items.DROPPER, "_from_stone"));

        ShapedRecipeBuilder.shaped(Items.DISPENSER, 1)
                .define('#', ItemTags.STONE_CRAFTING_MATERIALS)
                .define('+', Items.REDSTONE)
                .define('(', Items.BOW)
                .pattern("###")
                .pattern("#(#")
                .pattern("#+#")
                .unlockedBy("has_item", has(ItemTags.STONE_CRAFTING_MATERIALS))
                .save(consumer, recipeID(Items.DISPENSER));

        ShapedRecipeBuilder.shaped(Items.DISPENSER, 1)
                .define('#', Tags.Items.STONE)
                .define('+', Items.REDSTONE)
                .define('(', Items.BOW)
                .pattern("###")
                .pattern("#(#")
                .pattern("#+#")
                .unlockedBy("has_item", has(Tags.Items.STONE))
                .save(consumer, recipeID(Items.DISPENSER, "_from_stone"));

        ShapedRecipeBuilder.shaped(Items.FURNACE, 1)
                .define('#', ItemTags.STONE_CRAFTING_MATERIALS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy("has_item", has(ItemTags.STONE_CRAFTING_MATERIALS))
                .save(consumer, recipeID(Items.FURNACE));

        ShapedRecipeBuilder.shaped(Items.FURNACE, 1)
                .define('#', Tags.Items.STONE)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy("has_item", has(Tags.Items.STONE))
                .save(consumer, recipeID(Items.FURNACE, "_from_stone"));
    }

    private void recipeAll(Item stair, Item slab, Item wall, Item material, boolean hasStonecutting){
        recipeStairs(stair, material, hasStonecutting);
        recipeSlab(slab, material, hasStonecutting);
        recipeWall(wall, material, hasStonecutting);
    }
    private void recipeAll(Item stair, Item slab, Item wall, Item material){
        recipeStairs(stair, material, true);
        recipeSlab(slab, material, true);
        recipeWall(wall, material, true);
    }
    private void recipeStairsSlab(Item stair, Item slab, Item material, boolean hasStonecutting){
        recipeStairs(stair, material, hasStonecutting);
        recipeSlab(slab, material, hasStonecutting);
    }
    protected void recipeStairs(Item stair, Item material, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(stair, 4)
                .define('#', material)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy("has_item", has(material))
                .save(consumer);
        if(hasStonecutting)
            recipeStonecutting(stair, material);
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
    protected void recipeSlab(Item slab, Item material, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(slab, 6)
                .define('#', material)
                .pattern("###")
                .unlockedBy("has_item", has(material))
                .save(consumer);
        if(hasStonecutting)
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
    protected void recipeWall(Item wall, Item material, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(wall, 6)
                .define('#', material)
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(material))
                .save(consumer);
        if(hasStonecutting)
            recipeStonecutting(wall, material);
    }
    protected void recipeWall(Item wall, Item material, boolean hasStonecutting, boolean addToID) {
        ShapedRecipeBuilder.shaped(wall, 6)
                .define('#', material)
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(material))
                .save(consumer, recipeID(wall, "_from_" + material));
        if(hasStonecutting)
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
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result, amount).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting"));
    }
    protected void recipeStonecutting(Item result, Item ingredient, boolean addToID){
        recipeStonecutting(result, ingredient, 1, addToID);
    }
    protected void recipeStonecutting(Item result, Item ingredient, int amount, boolean addToID){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), result, amount).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_stonecutting_" + ingredient));
    }
    protected void recipeSmelting(Item result, Item ingredient) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, 0.1F, 200).unlockedBy("has_item", has(ingredient)).save(consumer, recipeID(result, "_smelting"));
    }
    private void recipeWoods(Item stairs, Item slab, Item wall, Item material, Item altMaterial){
        recipeStairs(stairs, material, false);
        recipeSlab(slab, material, false);
        recipeWall(wall, material, false);
        recipeWall(wall, altMaterial, false, true);
    }

    private static ResourceLocation recipeID(Item item) { return new ResourceLocation(BlockVariants.Mod_ID, item.toString());}
    private static ResourceLocation recipeID(Item item, String add) { return new ResourceLocation(BlockVariants.Mod_ID, item.toString() + add);}
}