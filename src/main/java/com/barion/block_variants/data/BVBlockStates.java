package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BlockVariants;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BVBlockStates extends BlockStateProvider {
    public BVBlockStates(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.Mod_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        regWall(BVBlocks.Polished_Granite_Wall.get(), "polished_granite");
        regWall(BVBlocks.Polished_Diorite_Wall.get(), "polished_diorite");
        regWall(BVBlocks.Polished_Andesite_Wall.get(), "polished_andesite");

        regWall(BVBlocks.Stone_Wall.get(), "stone");
        regStairs(BVBlocks.Smooth_Stone_Stairs.get(), "smooth_stone_slab_side", "smooth_stone");
        regWall(BVBlocks.Smooth_Stone_Wall.get(), "smooth_stone");

        regStairs(BVBlocks.Cut_Sandstone_Stairs.get(), "cut_sandstone", "sandstone_top");
        regWall(BVBlocks.Cut_Sandstone_Wall.get(), "cut_sandstone");
        regStairs(BVBlocks.Cut_Red_Sandstone_Stairs.get(), "cut_red_sandstone", "red_sandstone_top");
        regWall(BVBlocks.Cut_Red_Sandstone_Wall.get(), "cut_red_sandstone");

        regWall(BVBlocks.Quartz_Wall.get(), "quartz_block_top");
        regAll(BVBlocks.Quartz_Bricks_Stairs.get(), BVBlocks.Quartz_Bricks_Slab.get(), BVBlocks.Quartz_Bricks_Wall.get(), "quartz_bricks");
        regWall(BVBlocks.Smooth_Quartz_Wall.get(), "quartz_block_bottom");
        regAll(BVBlocks.Chiseled_Quartz_Block_Stairs.get(), BVBlocks.Chiseled_Quartz_Block_Slab.get(), BVBlocks.Chiseled_Quartz_Block_Wall.get(), "chiseled_quartz_block", "chiseled_quartz_block_top");

        regWall(BVBlocks.Prismarine_Bricks_Wall.get(), "prismarine_bricks");
        regWall(BVBlocks.Dark_Prismarine_Wall.get(), "dark_prismarine");

        regAll(BVBlocks.Netherrack_Stairs.get(), BVBlocks.Netherrack_Slab.get(), BVBlocks.Netherrack_Wall.get(), "netherrack");
        regAll(BVBlocks.End_Stone_Stairs.get(), BVBlocks.End_Stone_Slab.get(), BVBlocks.End_Stone_Wall.get(), "end_stone");
        regAll(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(), BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(), "cracked_polished_blackstone_bricks");
        regAll(BVBlocks.Basalt_Stairs.get(), BVBlocks.Basalt_Slab.get(), BVBlocks.Basalt_Wall.get(), "basalt_side", "basalt_top", "basalt");
        regAll(BVBlocks.Polished_Basalt_Stairs.get(), BVBlocks.Polished_Basalt_Slab.get(), BVBlocks.Polished_Basalt_Wall.get(), "polished_basalt_side", "polished_basalt_top", "polished_basalt");

        regAll(BVBlocks.Terracotta_Stairs.get(), BVBlocks.Terracotta_Slab.get(), BVBlocks.Terracotta_Wall.get(), "terracotta");
        regAll(BVBlocks.White_Terracotta_Stairs.get(), BVBlocks.White_Terracotta_Slab.get(), BVBlocks.White_Terracotta_Wall.get(), "white_terracotta");
        regAll(BVBlocks.Orange_Terracotta_Stairs.get(), BVBlocks.Orange_Terracotta_Slab.get(), BVBlocks.Orange_Terracotta_Wall.get(), "orange_terracotta");
        regAll(BVBlocks.Magenta_Terracotta_Stairs.get(), BVBlocks.Magenta_Terracotta_Slab.get(), BVBlocks.Magenta_Terracotta_Wall.get(), "magenta_terracotta");
        regAll(BVBlocks.Light_Blue_Terracotta_Stairs.get(), BVBlocks.Light_Blue_Terracotta_Slab.get(), BVBlocks.Light_Blue_Terracotta_Wall.get(), "light_blue_terracotta");
        regAll(BVBlocks.Yellow_Terracotta_Stairs.get(), BVBlocks.Yellow_Terracotta_Slab.get(), BVBlocks.Yellow_Terracotta_Wall.get(), "yellow_terracotta");
        regAll(BVBlocks.Lime_Terracotta_Stairs.get(), BVBlocks.Lime_Terracotta_Slab.get(), BVBlocks.Lime_Terracotta_Wall.get(), "lime_terracotta");
        regAll(BVBlocks.Pink_Terracotta_Stairs.get(), BVBlocks.Pink_Terracotta_Slab.get(), BVBlocks.Pink_Terracotta_Wall.get(), "pink_terracotta");
        regAll(BVBlocks.Gray_Terracotta_Stairs.get(), BVBlocks.Gray_Terracotta_Slab.get(), BVBlocks.Gray_Terracotta_Wall.get(), "gray_terracotta");
        regAll(BVBlocks.Light_Gray_Terracotta_Stairs.get(), BVBlocks.Light_Gray_Terracotta_Slab.get(), BVBlocks.Light_Gray_Terracotta_Wall.get(), "light_gray_terracotta");
        regAll(BVBlocks.Cyan_Terracotta_Stairs.get(), BVBlocks.Cyan_Terracotta_Slab.get(), BVBlocks.Cyan_Terracotta_Wall.get(), "cyan_terracotta");
        regAll(BVBlocks.Purple_Terracotta_Stairs.get(), BVBlocks.Purple_Terracotta_Slab.get(), BVBlocks.Purple_Terracotta_Wall.get(), "purple_terracotta");
        regAll(BVBlocks.Blue_Terracotta_Stairs.get(), BVBlocks.Blue_Terracotta_Slab.get(), BVBlocks.Blue_Terracotta_Wall.get(), "blue_terracotta");
        regAll(BVBlocks.Brown_Terracotta_Stairs.get(), BVBlocks.Brown_Terracotta_Slab.get(), BVBlocks.Brown_Terracotta_Wall.get(), "brown_terracotta");
        regAll(BVBlocks.Green_Terracotta_Stairs.get(), BVBlocks.Green_Terracotta_Slab.get(), BVBlocks.Green_Terracotta_Wall.get(), "green_terracotta");
        regAll(BVBlocks.Red_Terracotta_Stairs.get(), BVBlocks.Red_Terracotta_Slab.get(), BVBlocks.Red_Terracotta_Wall.get(), "red_terracotta");
        regAll(BVBlocks.Black_Terracotta_Stairs.get(), BVBlocks.Black_Terracotta_Slab.get(), BVBlocks.Black_Terracotta_Wall.get(), "black_terracotta");

        regAll(BVBlocks.Cracked_Stone_Brick_Stairs.get(), BVBlocks.Cracked_Stone_Brick_Slab.get(), BVBlocks.Cracked_Stone_Brick_Wall.get(), "cracked_stone_bricks");

        regStairsSlab(BVBlocks.Oak_Log_Stairs.get(), BVBlocks.Oak_Log_Slab.get(), "oak_log", "stripped_oak_log_top");
        regStairsSlab(BVBlocks.Spruce_Log_Stairs.get(), BVBlocks.Spruce_Log_Slab.get(), "spruce_log", "stripped_spruce_log_top");
        regStairsSlab(BVBlocks.Birch_Log_Stairs.get(), BVBlocks.Birch_Log_Slab.get(), "birch_log", "stripped_birch_log_top");
        regStairsSlab(BVBlocks.Jungle_Log_Stairs.get(), BVBlocks.Jungle_Log_Slab.get(), "jungle_log", "stripped_jungle_log_top");
        regStairsSlab(BVBlocks.Acacia_Log_Stairs.get(), BVBlocks.Acacia_Log_Slab.get(), "acacia_log", "stripped_acacia_log_top");
        regStairsSlab(BVBlocks.Dark_Oak_Log_Stairs.get(), BVBlocks.Dark_Oak_Log_Slab.get(), "dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlab(BVBlocks.Stripped_Oak_Log_Stairs.get(), BVBlocks.Stripped_Oak_Log_Slab.get(), "stripped_oak_log", "stripped_oak_log_top");
        regStairsSlab(BVBlocks.Stripped_Spruce_Log_Stairs.get(), BVBlocks.Stripped_Spruce_Log_Slab.get(), "stripped_spruce_log", "stripped_spruce_log_top");
        regStairsSlab(BVBlocks.Stripped_Birch_Log_Stairs.get(), BVBlocks.Stripped_Birch_Log_Slab.get(), "stripped_birch_log", "stripped_birch_log_top");
        regStairsSlab(BVBlocks.Stripped_Jungle_Log_Stairs.get(), BVBlocks.Stripped_Jungle_Log_Slab.get(), "stripped_jungle_log", "stripped_jungle_log_top");
        regStairsSlab(BVBlocks.Stripped_Acacia_Log_Stairs.get(), BVBlocks.Stripped_Acacia_Log_Slab.get(), "stripped_acacia_log", "stripped_acacia_log_top");
        regStairsSlab(BVBlocks.Stripped_Dark_Oak_Log_Stairs.get(), BVBlocks.Stripped_Dark_Oak_Log_Slab.get(), "stripped_dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlab(BVBlocks.Crimson_Stem_Stairs.get(), BVBlocks.Crimson_Stem_Slab.get(), "crimson_stem", "crimson_stem_top");
        regStairsSlab(BVBlocks.Warped_Stem_Stairs.get(), BVBlocks.Warped_Stem_Slab.get(), "warped_stem", "warped_stem_top");
        regStairsSlab(BVBlocks.Stripped_Crimson_Stem_Stairs.get(), BVBlocks.Stripped_Crimson_Stem_Slab.get(), "stripped_crimson_stem", "stripped_crimson_stem_top");
        regStairsSlab(BVBlocks.Stripped_Warped_Stem_Stairs.get(), BVBlocks.Stripped_Warped_Stem_Slab.get(), "stripped_warped_stem", "stripped_warped_stem_top");

    }
    protected void regAll(StairsBlock stairs, SlabBlock slab, WallBlock wall, String texture){
        regStairs(stairs, texture);
        regSlab(slab, texture);
        regWall(wall, texture);
    }
    protected void regAll(StairsBlock stairs, SlabBlock slab, WallBlock wall, String texture, String topTexture){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, texture);
        regWall(wall, texture);
    }
    protected void regAll(StairsBlock stairs, SlabBlock slab, WallBlock wall, String texture, String topTexture, String doubleSlab){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, doubleSlab);
        regWall(wall, texture);
    }
    protected void regStairsSlab(StairsBlock stairs, SlabBlock slab, String texture, String topTexture){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, texture);
    }
    protected void regStairs(StairsBlock stairs, String texture){
        stairsBlock(stairs, mcLoc("block/" + texture));
    }
    protected void regStairs(StairsBlock stairs, String texture, String topTexture){
        ResourceLocation topResource = mcLoc("block/" + topTexture);
        stairsBlock(stairs, mcLoc("block/" + texture), topResource, topResource);
    }
    protected void regSlab(SlabBlock slab, String texture) {
        regSlab(slab, texture, texture, texture);
    }
    protected void regSlab(SlabBlock slab, String texture, String doubleSlab, boolean toIdentifyThisMethod){
        regSlab(slab, texture, texture, doubleSlab);
    }
    protected void regSlab(SlabBlock slab, String texture, String topTexture){
        regSlab(slab,texture, topTexture, texture);
    }
    protected void regSlab(SlabBlock slab, String texture, String topTexture, String doubleSlab){
        ResourceLocation resource = mcLoc("block/" + texture);
        ResourceLocation topResource = mcLoc("block/" + topTexture);
        slabBlock(slab, mcLoc("block/" + doubleSlab), mcLoc("block/" + texture), topResource, topResource);
    }
    protected void regWall(WallBlock wall, String texture){
        wallBlock(wall, mcLoc("block/" + texture));
    }
}