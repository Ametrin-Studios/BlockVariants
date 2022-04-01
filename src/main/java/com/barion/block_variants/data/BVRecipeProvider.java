package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.SlabBlock;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class BVRecipeProvider extends RecipeProvider {
    private Consumer<FinishedRecipe> consumer;
    public BVRecipeProvider(DataGenerator generator){super(generator);}

    @Override @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer){
        this.consumer = consumer;
        wall(BVBlocks.Polished_Granite_Wall.get().asItem(), Items.POLISHED_GRANITE, Items.GRANITE, Items.GRANITE_WALL);
        wall(BVBlocks.Polished_Diorite_Wall.get().asItem(), Items.POLISHED_DIORITE, Items.DIORITE, Items.DIORITE_WALL);
        wall(BVBlocks.Polished_Andesite_Wall.get().asItem(), Items.POLISHED_ANDESITE, Items.ANDESITE, Items.ANDESITE_WALL);

        smelting(Items.STONE_STAIRS, Items.COBBLESTONE_STAIRS);
        smelting(Items.STONE_SLAB, Items.COBBLESTONE_SLAB);
        wall(BVBlocks.Stone_Wall.get().asItem(), Items.STONE, true);
        smelting(BVBlocks.Stone_Wall.get().asItem(), Items.COBBLESTONE_WALL);
        stair(BVBlocks.Smooth_Stone_Stairs.get().asItem(), Items.SMOOTH_STONE, true);
        smelting(BVBlocks.Smooth_Stone_Stairs.get().asItem(), Items.STONE_STAIRS);
        smelting(Items.SMOOTH_STONE_SLAB, Items.STONE_SLAB);
        wall(BVBlocks.Smooth_Stone_Wall.get().asItem(), Items.SMOOTH_STONE, true);
        smelting(BVBlocks.Smooth_Stone_Wall.get().asItem(), BVBlocks.Stone_Wall.get().asItem());

        stair(BVBlocks.Cut_Sandstone_Stairs.get().asItem(), Items.CUT_SANDSTONE, Items.SANDSTONE, Items.SANDSTONE_STAIRS);
        stair(BVBlocks.Cut_Red_Sandstone_Stairs.get().asItem(), Items.CUT_RED_SANDSTONE, Items.RED_SANDSTONE, Items.RED_SANDSTONE_STAIRS);
        wall(BVBlocks.Cut_Sandstone_Wall.get().asItem(), Items.CUT_SANDSTONE, Items.SANDSTONE, Items.SANDSTONE_WALL);
        wall(BVBlocks.Cut_Red_Sandstone_Wall.get().asItem(), Items.CUT_RED_SANDSTONE, Items.RED_SANDSTONE, Items.RED_SANDSTONE_WALL);

        wall(BVBlocks.Quartz_Wall.get().asItem(), Items.QUARTZ_BLOCK, true);
        stair(BVBlocks.Quartz_Bricks_Stairs.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS);
        slab(BVBlocks.Quartz_Bricks_Slab.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB);
        wall(BVBlocks.Quartz_Bricks_Wall.get().asItem(), Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, BVBlocks.Quartz_Wall.get().asItem());
        smelting(Items.SMOOTH_QUARTZ_STAIRS, Items.QUARTZ_STAIRS);
        smelting(Items.SMOOTH_QUARTZ_SLAB, Items.QUARTZ_SLAB);
        wall(BVBlocks.Smooth_Quartz_Wall.get().asItem(), Items.SMOOTH_QUARTZ, true);
        smelting(BVBlocks.Smooth_Quartz_Wall.get().asItem(), BVBlocks.Quartz_Wall.get().asItem());
        stair(BVBlocks.Chiseled_Quartz_Block_Stairs.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS);
        slab(BVBlocks.Chiseled_Quartz_Block_Slab.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_BLOCK, Items.QUARTZ_SLAB);
        wall(BVBlocks.Chiseled_Quartz_Block_Wall.get().asItem(), Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_BLOCK, BVBlocks.Quartz_Wall.get().asItem());

        wall(BVBlocks.Prismarine_Bricks_Wall.get().asItem(), Items.PRISMARINE_BRICKS, true);
        wall(BVBlocks.Dark_Prismarine_Wall.get().asItem(), Items.DARK_PRISMARINE, true);
        all(BVBlocks.Netherrack_Stairs.get().asItem(), BVBlocks.Netherrack_Slab.get().asItem(), BVBlocks.Netherrack_Wall.get().asItem(), Items.NETHERRACK, true);
        all(BVBlocks.End_Stone_Stairs.get().asItem(), BVBlocks.End_Stone_Slab.get().asItem(), BVBlocks.End_Stone_Wall.get().asItem(), Items.END_STONE, true);

        all(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get().asItem(), BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get().asItem(), BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get().asItem(), Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, true);
        smelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_STAIRS);
        smelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_SLAB);
        smelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get().asItem(), Items.POLISHED_BLACKSTONE_BRICK_WALL);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_STAIRS, 1, Items.BLACKSTONE_STAIRS);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Items.BLACKSTONE_STAIRS);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_BRICK_STAIRS, 1, Items.POLISHED_BLACKSTONE_STAIRS);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_SLAB, 1, Items.BLACKSTONE_SLAB);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Items.BLACKSTONE_SLAB);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_BRICK_SLAB, 1, Items.POLISHED_BLACKSTONE_SLAB);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_WALL, 1, Items.BLACKSTONE_WALL);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_BRICK_WALL, 1, Items.BLACKSTONE_WALL);
        stonecuttingExtraID(Items.POLISHED_BLACKSTONE_BRICK_WALL, 1, Items.POLISHED_BLACKSTONE_WALL);

        all(BVBlocks.Basalt_Stairs.get().asItem(), BVBlocks.Basalt_Slab.get().asItem(), BVBlocks.Basalt_Wall.get().asItem(), Items.BASALT, true);
        stair(BVBlocks.Polished_Basalt_Stairs.get().asItem(), Items.POLISHED_BASALT, Items.BASALT, BVBlocks.Basalt_Stairs.get().asItem());
        slab(BVBlocks.Polished_Basalt_Slab.get().asItem(), Items.POLISHED_BASALT, Items.BASALT, BVBlocks.Basalt_Slab.get().asItem());
        wall(BVBlocks.Polished_Basalt_Wall.get().asItem(), Items.POLISHED_BASALT, Items.BASALT, BVBlocks.Basalt_Wall.get().asItem());

        stairSlab(BVBlocks.Oak_Log_Stairs.get().asItem(), BVBlocks.Oak_Log_Slab.get().asItem(), Items.OAK_LOG, false);
        stairSlab(BVBlocks.Spruce_Log_Stairs.get().asItem(), BVBlocks.Spruce_Log_Slab.get().asItem(), Items.SPRUCE_LOG, false);
        stairSlab(BVBlocks.Birch_Log_Stairs.get().asItem(), BVBlocks.Birch_Log_Slab.get().asItem(), Items.BIRCH_LOG, false);
        stairSlab(BVBlocks.Jungle_Log_Stairs.get().asItem(), BVBlocks.Jungle_Log_Slab.get().asItem(), Items.JUNGLE_LOG, false);
        stairSlab(BVBlocks.Acacia_Log_Stairs.get().asItem(), BVBlocks.Acacia_Log_Slab.get().asItem(), Items.ACACIA_LOG, false);
        stairSlab(BVBlocks.Dark_Oak_Log_Stairs.get().asItem(), BVBlocks.Dark_Oak_Log_Slab.get().asItem(), Items.DARK_OAK_LOG, false);
        stairSlab(BVBlocks.Stripped_Oak_Log_Stairs.get().asItem(), BVBlocks.Stripped_Oak_Log_Slab.get().asItem(), Items.STRIPPED_OAK_LOG, false);
        stairSlab(BVBlocks.Stripped_Spruce_Log_Stairs.get().asItem(), BVBlocks.Stripped_Spruce_Log_Slab.get().asItem(), Items.STRIPPED_SPRUCE_LOG, false);
        stairSlab(BVBlocks.Stripped_Birch_Log_Stairs.get().asItem(), BVBlocks.Stripped_Birch_Log_Slab.get().asItem(), Items.STRIPPED_BIRCH_LOG, false);
        stairSlab(BVBlocks.Stripped_Jungle_Log_Stairs.get().asItem(), BVBlocks.Stripped_Jungle_Log_Slab.get().asItem(), Items.STRIPPED_JUNGLE_LOG, false);
        stairSlab(BVBlocks.Stripped_Acacia_Log_Stairs.get().asItem(), BVBlocks.Stripped_Acacia_Log_Slab.get().asItem(), Items.STRIPPED_ACACIA_LOG, false);
        stairSlab(BVBlocks.Stripped_Dark_Oak_Log_Stairs.get().asItem(), BVBlocks.Stripped_Dark_Oak_Log_Slab.get().asItem(), Items.STRIPPED_DARK_OAK_LOG, false);
        stairSlab(BVBlocks.Crimson_Stem_Stairs.get().asItem(), BVBlocks.Crimson_Stem_Slab.get().asItem(), Items.CRIMSON_STEM, false);
        stairSlab(BVBlocks.Warped_Stem_Stairs.get().asItem(), BVBlocks.Warped_Stem_Slab.get().asItem(), Items.WARPED_STEM, false);
        stairSlab(BVBlocks.Stripped_Crimson_Stem_Stairs.get().asItem(), BVBlocks.Stripped_Crimson_Stem_Slab.get().asItem(), Items.STRIPPED_CRIMSON_STEM, false);
        stairSlab(BVBlocks.Stripped_Warped_Stem_Stairs.get().asItem(), BVBlocks.Stripped_Warped_Stem_Slab.get().asItem(), Items.STRIPPED_WARPED_STEM, false);

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

        all(BVBlocks.Calcite_Stairs.get().asItem(), BVBlocks.Calcite_Slab.get().asItem(), BVBlocks.Calcite_Wall.get().asItem(), Items.CALCITE, true);
        all(BVBlocks.Smooth_Basalt_Stairs.get().asItem(), BVBlocks.Smooth_Basalt_Slab.get().asItem(), BVBlocks.Smooth_Basalt_Wall.get().asItem(), Items.SMOOTH_BASALT, true);
        smelting(BVBlocks.Smooth_Basalt_Stairs.get().asItem(), BVBlocks.Basalt_Stairs.get().asItem());
        smelting(BVBlocks.Smooth_Basalt_Slab.get().asItem(), BVBlocks.Basalt_Slab.get().asItem());
        smelting(BVBlocks.Smooth_Basalt_Wall.get().asItem(), BVBlocks.Basalt_Wall.get().asItem());
        all(BVBlocks.Tuff_Stairs.get().asItem(), BVBlocks.Tuff_Slab.get().asItem(), BVBlocks.Tuff_Wall.get().asItem(), Items.TUFF, true);

        all(BVBlocks.Deepslate_Stairs.get().asItem(), BVBlocks.Deepslate_Slab.get().asItem(), BVBlocks.Deepslate_Wall.get().asItem(), Items.DEEPSLATE, true);
        all(BVBlocks.Cracked_Deepslate_Brick_Stairs.get().asItem(), BVBlocks.Cracked_Deepslate_Brick_Slab.get().asItem(), BVBlocks.Cracked_Deepslate_Brick_Wall.get().asItem(), Items.CRACKED_DEEPSLATE_BRICKS, true);
        all(BVBlocks.Cracked_Deepslate_Tile_Stairs.get().asItem(), BVBlocks.Cracked_Deepslate_Tile_Slab.get().asItem(), BVBlocks.Cracked_Deepslate_Tile_Wall.get().asItem(), Items.CRACKED_DEEPSLATE_TILES, true);

        fenceGate(BVBlocks.Nether_Brick_Fence_Gate.get().asItem(), Items.NETHER_BRICKS);
        all(BVBlocks.Cracked_Nether_Brick_Stairs.get().asItem(), BVBlocks.Cracked_Nether_Brick_Slab.get().asItem(), BVBlocks.Cracked_Nether_Brick_Wall.get().asItem(), Items.CRACKED_NETHER_BRICKS, true);
        netherFence(BVBlocks.Cracked_Nether_Brick_Fence.get(), Items.CRACKED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.Cracked_Nether_Brick_Fence_Gate.get(), Items.CRACKED_NETHER_BRICKS);
        netherFence(BVBlocks.Red_Nether_Brick_Fence.get(), Items.RED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.Red_Nether_Brick_Fence_Gate.get(), Items.RED_NETHER_BRICKS);

        {
            ShapedRecipeBuilder.shaped(Items.DROPPER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.REDSTONE)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("#+#")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Items.DROPPER));

            ShapedRecipeBuilder.shaped(Items.DISPENSER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.REDSTONE)
                    .define('(', Items.BOW)
                    .pattern("###")
                    .pattern("#(#")
                    .pattern("#+#")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Items.DISPENSER));

            ShapedRecipeBuilder.shaped(Items.FURNACE, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Items.FURNACE));

            ShapedRecipeBuilder.shaped(Items.STONECUTTER, 1)
                    .define('#', BVTags.Items.StoneCrafting)
                    .define('+', Items.IRON_INGOT)
                    .pattern(" + ")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.StoneCrafting))
                    .save(consumer, recipeID(Items.STONECUTTER));
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

    protected void stonecutting(ItemLike result, int amount, ItemLike material) {SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), result, amount).unlockedBy(getHasName(material), has(material)).save(consumer, getStonecuttingRecipeName(result));}
    protected void stonecuttingExtraID(ItemLike result, int amount, ItemLike material) {SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), result, amount).unlockedBy(getHasName(material), has(material)).save(consumer, getStonecuttingConversionRecipeName(result, material));}




    private void all(Item stair, Item slab, Item wall, Item material, boolean hasStonecutting){
        stair(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
        wall(wall, material, hasStonecutting);
    }
    private void stairSlab(Item stair, Item slab, Item material, boolean hasStonecutting){
        stair(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
    }

    protected void wallExtraID(Item wall, Item material, boolean hasStonecutting) {
        wallBuilder(wall, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(consumer, recipeID(getConversionRecipeName(wall, material)));
        if(hasStonecutting) {stonecuttingExtraID(wall, 1, material);}
    }

    protected void smelting(Item result, Item ingredient) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, 0.1F, 200).unlockedBy(getHasName(ingredient), has(ingredient)).save(consumer, recipeID(getSmeltingRecipeName(result)));
    }
    private void recipeWoods(Item stairs, Item slab, Item wall, Item material, Item altMaterial){
        stair(stairs, material, false);
        slab(slab, material, false);
        wall(wall, material, false);
        wallExtraID(wall, altMaterial, false);
    }

    private static ResourceLocation recipeID(ItemLike item) {return new ResourceLocation(BlockVariants.ModID, getItemName(item));}
    private static ResourceLocation recipeID(String path) {return new ResourceLocation(BlockVariants.ModID, path);}
    private static ResourceLocation getStonecuttingRecipeName(ItemLike item) {return new ResourceLocation(BlockVariants.ModID, "stonecutting/" + getItemName(item));}
    private static ResourceLocation getStonecuttingConversionRecipeName(ItemLike result, ItemLike material) {return new ResourceLocation(BlockVariants.ModID, "stonecutting/" + getConversionRecipeName(result, material));}

    protected static String getSmeltingRecipeName(ItemLike item) {return "smelting/" + getItemName(item);}
}