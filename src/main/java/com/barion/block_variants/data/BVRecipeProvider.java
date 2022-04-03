package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVTags;
import com.barion.block_variants.BlockVariants;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;
import java.util.function.Consumer;

public class BVRecipeProvider extends RecipeProvider {
    private Consumer<IFinishedRecipe> consumer;
    public BVRecipeProvider(DataGenerator generator) {super(generator);}

    @Override @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer){
        this.consumer = consumer;
        wall(BVBlocks.Polished_Granite_Wall.get(), Blocks.POLISHED_GRANITE, Blocks.GRANITE, Blocks.GRANITE_WALL);
        wall(BVBlocks.Polished_Diorite_Wall.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, Blocks.DIORITE_WALL);
        wall(BVBlocks.Polished_Andesite_Wall.get(), Blocks.POLISHED_ANDESITE, Blocks.ANDESITE, Blocks.ANDESITE_WALL);

        smelting(Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS);
        smelting(Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
        wall(BVBlocks.Stone_Wall.get(), Blocks.STONE, true);
        smelting(BVBlocks.Stone_Wall.get(), Blocks.COBBLESTONE_WALL);
        stair(BVBlocks.Smooth_Stone_Stairs.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVBlocks.Smooth_Stone_Stairs.get(), Blocks.STONE_STAIRS);
        smelting(Blocks.SMOOTH_STONE_SLAB, Blocks.STONE_SLAB);
        wall(BVBlocks.Smooth_Stone_Wall.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVBlocks.Smooth_Stone_Wall.get(), BVBlocks.Stone_Wall.get());

        stair(BVBlocks.Cut_Sandstone_Stairs.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS);
        stair(BVBlocks.Cut_Red_Sandstone_Stairs.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS);
        wall(BVBlocks.Cut_Sandstone_Wall.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_WALL);
        wall(BVBlocks.Cut_Red_Sandstone_Wall.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_WALL);

        wall(BVBlocks.Quartz_Wall.get(), Blocks.QUARTZ_BLOCK, true);
        stair(BVBlocks.Quartz_Bricks_Stairs.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBlocks.Quartz_Bricks_Slab.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.Quartz_Bricks_Wall.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, BVBlocks.Quartz_Wall.get());
        smelting(Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.QUARTZ_STAIRS);
        smelting(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.Smooth_Quartz_Wall.get(), Blocks.SMOOTH_QUARTZ, true);
        smelting(BVBlocks.Smooth_Quartz_Wall.get(), BVBlocks.Quartz_Wall.get());
        stair(BVBlocks.Chiseled_Quartz_Block_Stairs.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBlocks.Chiseled_Quartz_Block_Slab.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBlocks.Chiseled_Quartz_Block_Wall.get(), Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, BVBlocks.Quartz_Wall.get());

        wall(BVBlocks.Prismarine_Bricks_Wall.get(), Blocks.PRISMARINE_BRICKS, true);
        wall(BVBlocks.Dark_Prismarine_Wall.get(), Blocks.DARK_PRISMARINE, true);
        all(BVBlocks.Netherrack_Stairs.get(), BVBlocks.Netherrack_Slab.get(), BVBlocks.Netherrack_Wall.get(), Blocks.NETHERRACK, true);
        all(BVBlocks.End_Stone_Stairs.get(), BVBlocks.End_Stone_Slab.get(), BVBlocks.End_Stone_Wall.get(), Blocks.END_STONE, true);
        wall(BVBlocks.Purpur_Wall.get(), Blocks.PURPUR_BLOCK);

        all(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, true);
        smelting(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS);
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

        stairSlab(BVBlocks.Oak_Log_Stairs.get(), BVBlocks.Oak_Log_Slab.get(), Blocks.OAK_LOG, false);
        stairSlab(BVBlocks.Spruce_Log_Stairs.get(), BVBlocks.Spruce_Log_Slab.get(), Blocks.SPRUCE_LOG, false);
        stairSlab(BVBlocks.Birch_Log_Stairs.get(), BVBlocks.Birch_Log_Slab.get(), Blocks.BIRCH_LOG, false);
        stairSlab(BVBlocks.Jungle_Log_Stairs.get(), BVBlocks.Jungle_Log_Slab.get(), Blocks.JUNGLE_LOG, false);
        stairSlab(BVBlocks.Acacia_Log_Stairs.get(), BVBlocks.Acacia_Log_Slab.get(), Blocks.ACACIA_LOG, false);
        stairSlab(BVBlocks.Dark_Oak_Log_Stairs.get(), BVBlocks.Dark_Oak_Log_Slab.get(), Blocks.DARK_OAK_LOG, false);
        stairSlab(BVBlocks.Stripped_Oak_Log_Stairs.get(), BVBlocks.Stripped_Oak_Log_Slab.get(), Blocks.STRIPPED_OAK_LOG, false);
        stairSlab(BVBlocks.Stripped_Spruce_Log_Stairs.get(), BVBlocks.Stripped_Spruce_Log_Slab.get(), Blocks.STRIPPED_SPRUCE_LOG, false);
        stairSlab(BVBlocks.Stripped_Birch_Log_Stairs.get(), BVBlocks.Stripped_Birch_Log_Slab.get(), Blocks.STRIPPED_BIRCH_LOG, false);
        stairSlab(BVBlocks.Stripped_Jungle_Log_Stairs.get(), BVBlocks.Stripped_Jungle_Log_Slab.get(), Blocks.STRIPPED_JUNGLE_LOG, false);
        stairSlab(BVBlocks.Stripped_Acacia_Log_Stairs.get(), BVBlocks.Stripped_Acacia_Log_Slab.get(), Blocks.STRIPPED_ACACIA_LOG, false);
        stairSlab(BVBlocks.Stripped_Dark_Oak_Log_Stairs.get(), BVBlocks.Stripped_Dark_Oak_Log_Slab.get(), Blocks.STRIPPED_DARK_OAK_LOG, false);
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
        recipeWoods(BVBlocks.Crimson_Hyphae_Stairs.get(), BVBlocks.Crimson_Hyphae_Slab.get(), BVBlocks.Crimson_Hyphae_Wall.get(), Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
        recipeWoods(BVBlocks.Warped_Hyphae_Stairs.get(), BVBlocks.Warped_Hyphae_Slab.get(), BVBlocks.Warped_Hyphae_Wall.get(), Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);
        recipeWoods(BVBlocks.Stripped_Oak_Wood_Stairs.get(), BVBlocks.Stripped_Oak_Wood_Slab.get(), BVBlocks.Stripped_Oak_Wood_Wall.get(), Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG);
        recipeWoods(BVBlocks.Stripped_Spruce_Wood_Stairs.get(), BVBlocks.Stripped_Spruce_Wood_Slab.get(), BVBlocks.Stripped_Spruce_Wood_Wall.get(), Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG);
        recipeWoods(BVBlocks.Stripped_Birch_Wood_Stairs.get(), BVBlocks.Stripped_Birch_Wood_Slab.get(), BVBlocks.Stripped_Birch_Wood_Wall.get(), Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG);
        recipeWoods(BVBlocks.Stripped_Jungle_Wood_Stairs.get(), BVBlocks.Stripped_Jungle_Wood_Slab.get(), BVBlocks.Stripped_Jungle_Wood_Wall.get(), Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG);
        recipeWoods(BVBlocks.Stripped_Acacia_Wood_Stairs.get(), BVBlocks.Stripped_Acacia_Wood_Slab.get(), BVBlocks.Stripped_Acacia_Wood_Wall.get(), Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG);
        recipeWoods(BVBlocks.Stripped_Dark_Oak_Wood_Stairs.get(), BVBlocks.Stripped_Dark_Oak_Wood_Slab.get(), BVBlocks.Stripped_Dark_Oak_Wood_Wall.get(), Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG);
        recipeWoods(BVBlocks.Stripped_Crimson_Hyphae_Stairs.get(), BVBlocks.Stripped_Crimson_Hyphae_Slab.get(), BVBlocks.Stripped_Crimson_Hyphae_Wall.get(), Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM);
        recipeWoods(BVBlocks.Stripped_Warped_Hyphae_Stairs.get(), BVBlocks.Stripped_Warped_Hyphae_Slab.get(), BVBlocks.Stripped_Warped_Hyphae_Wall.get(), Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM);

        netherFenceGate(BVBlocks.Nether_Brick_Fence_Gate.get(), Blocks.NETHER_BRICKS);
        all(BVBlocks.Cracked_Nether_Brick_Stairs.get(), BVBlocks.Cracked_Nether_Brick_Slab.get(), BVBlocks.Cracked_Nether_Brick_Wall.get(), Blocks.CRACKED_NETHER_BRICKS, true);
        netherFence(BVBlocks.Cracked_Nether_Brick_Fence.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.Cracked_Nether_Brick_Fence_Gate.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFence(BVBlocks.Red_Nether_Brick_Fence.get(), Blocks.RED_NETHER_BRICKS);
        netherFenceGate(BVBlocks.Red_Nether_Brick_Fence_Gate.get(), Blocks.RED_NETHER_BRICKS);

        all(BVBlocks.Obsidian_Stairs.get(), BVBlocks.Obsidian_Slab.get(), BVBlocks.Obsidian_Wall.get(), Blocks.OBSIDIAN, false);
        all(BVBlocks.Crying_Obsidian_Stairs.get(), BVBlocks.Crying_Obsidian_Slab.get(), BVBlocks.Crying_Obsidian_Wall.get(), Blocks.CRYING_OBSIDIAN, false);

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
        } //Recipe overrides
    }

    protected void stair(IItemProvider stair, IItemProvider material, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(stair, 4).define('#', material).pattern("#  ").pattern("## ").pattern("###").unlockedBy(getHasName(material), has(material)).save(consumer);
        if(hasStonecutting) {stonecutting(stair, 1, material);}
    }
    protected void stair(IItemProvider stair, IItemProvider material, IItemProvider... addStonecutting){
        stair(stair, material, true);
        for(IItemProvider item : addStonecutting){
            stonecuttingExtraID(stair, 1, item);
        }
    }
    protected void slab(IItemProvider slab, IItemProvider material, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(slab, 6).define('#', material).pattern("###").unlockedBy(getHasName(material), has(material)).save(consumer);
        if(hasStonecutting) {stonecutting(slab, 2, material);}
    }
    protected void slab(IItemProvider slab, IItemProvider material, IItemProvider... addStonecutting){
        slab(slab, material, true);
        for(IItemProvider item : addStonecutting){
            stonecuttingExtraID(slab, (item instanceof SlabBlock) ? 1 : 2, item);
        }
    }
    protected void wall(IItemProvider wall, IItemProvider material, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(wall, 6).define('#', material).pattern("###").pattern("###").unlockedBy(getHasName(material), has(material)).save(consumer);
        if(hasStonecutting) {stonecutting(wall, 1, material);}
    }
    protected void wall(IItemProvider wall, IItemProvider material, IItemProvider... addStonecutting){
        wall(wall, material, true);
        for(IItemProvider item : addStonecutting){
            stonecuttingExtraID(wall, 1, item);
        }
    }
    protected void fence(IItemProvider fence, IItemProvider material){
        ShapedRecipeBuilder.shaped(fence, 3).define('W', material).define('#', Items.STICK).pattern("W#W").pattern("W#W").unlockedBy(getHasName(material), has(material)).save(consumer);
    }
    protected void netherFence(IItemProvider fence, IItemProvider material){
        ShapedRecipeBuilder.shaped(fence, 6).define('W', material).define('#', Items.NETHER_BRICK).pattern("W#W").pattern("W#W").unlockedBy(getHasName(material), has(material)).save(consumer);
    }
    protected void fenceGate(IItemProvider fenceGate, IItemProvider material){
        ShapedRecipeBuilder.shaped(fenceGate).define('#', Items.STICK).define('W', material).pattern("#W#").pattern("#W#").unlockedBy(getHasName(material), has(material)).save(consumer);
    }
    protected void netherFenceGate(IItemProvider fenceGate, IItemProvider material){
        ShapedRecipeBuilder.shaped(fenceGate).define('#', Items.NETHER_BRICK).define('W', material).pattern("#W#").pattern("#W#").unlockedBy(getHasName(material), has(material)).save(consumer);
    }

    protected void stonecutting(IItemProvider result, int amount, IItemProvider material) {SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), result, amount).unlocks(getHasName(material), has(material)).save(consumer, getStonecuttingRecipeID(result));}
    protected void stonecuttingExtraID(IItemProvider result, int amount, IItemProvider material) {SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), result, amount).unlocks(getHasName(material), has(material)).save(consumer, getConversionStonecuttingRecipeID(result, material));}




    protected void all(StairsBlock stair, SlabBlock slab, WallBlock wall, IItemProvider material, boolean hasStonecutting){
        stair(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
        wall(wall, material, hasStonecutting);
    }
    protected void stairSlab(StairsBlock stair, SlabBlock slab, IItemProvider material, boolean hasStonecutting){
        stair(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
    }

    protected void wallExtraID(IItemProvider wall, IItemProvider material, boolean hasStonecutting) {
        ShapedRecipeBuilder.shaped(wall, 6).define('#', material).pattern("###").pattern("###").unlockedBy(getHasName(material), has(material)).save(consumer, recipeID(getConversionRecipeName(wall, material)));
        if(hasStonecutting) {stonecuttingExtraID(wall, 1, material);}
    }

    protected void smelting(IItemProvider result, IItemProvider ingredient) {
        CookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, 0.1F, 200).unlockedBy(getHasName(ingredient), has(ingredient)).save(consumer, getSmeltingRecipeID(result));
    }
    protected void recipeWoods(StairsBlock stairs, SlabBlock slab, WallBlock wall, IItemProvider material, IItemProvider altMaterial){
        stair(stairs, material, false);
        slab(slab, material, false);
        wall(wall, material, false);
        wallExtraID(wall, altMaterial, false);
    }

    protected static ResourceLocation recipeID(IItemProvider item) {return new ResourceLocation(BlockVariants.ModID, getItemName(item));}
    protected static ResourceLocation recipeID(String path) {return new ResourceLocation(BlockVariants.ModID, path);}
    protected static ResourceLocation getStonecuttingRecipeID(IItemProvider item) {return new ResourceLocation(BlockVariants.ModID, "stonecutting/" + getItemName(item));}
    protected static ResourceLocation getConversionStonecuttingRecipeID(IItemProvider result, IItemProvider material) {return new ResourceLocation(BlockVariants.ModID, "stonecutting/" + getConversionRecipeName(result, material));}
    protected static ResourceLocation getSmeltingRecipeID(IItemProvider item) {return new ResourceLocation(BlockVariants.ModID, "smelting/" + getItemName(item));}

    protected static String getConversionRecipeName(IItemProvider result, IItemProvider material) {return getItemName(result) + "_from_" + getItemName(material);}
    protected static String getHasName(IItemProvider itemProvider) {return "has_" + getItemName(itemProvider);}
    protected static String getItemName(IItemProvider item) {return Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.asItem())).getPath();}
}