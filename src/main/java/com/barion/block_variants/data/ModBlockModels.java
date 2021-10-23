package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.stuff.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockModels extends BlockStateProvider {
    public ModBlockModels(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.Mod_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        regWall(ModBlocks.Polished_Granite_Wall.get(), "polished_granite");
        regWall(ModBlocks.Polished_Diorite_Wall.get(), "polished_diorite");
        regWall(ModBlocks.Polished_Andesite_Wall.get(), "polished_andesite");

        regWall(ModBlocks.Stone_Wall.get(), "stone");
        regStairs(ModBlocks.Smooth_Stone_Stairs.get(), "smooth_stone_slab_side", "smooth_stone");
        regWall(ModBlocks.Smooth_Stone_Wall.get(), "smooth_stone");

        regStairs(ModBlocks.Cut_Sandstone_Stairs.get(), "cut_sandstone", "sandstone_top");
        regWall(ModBlocks.Cut_Sandstone_Wall.get(), "cut_sandstone");
        regStairs(ModBlocks.Cut_Red_Sandstone_Stairs.get(), "cut_red_sandstone", "red_sandstone_top");
        regWall(ModBlocks.Cut_Red_Sandstone_Wall.get(), "cut_red_sandstone");

        regWall(ModBlocks.Quartz_Wall.get(), "quartz_block_top");
        regAll(ModBlocks.Quartz_Bricks_Stairs.get(), ModBlocks.Quartz_Bricks_Slab.get(), ModBlocks.Quartz_Bricks_Wall.get(), "quartz_bricks");
        regWall(ModBlocks.Smooth_Quartz_Wall.get(), "quartz_block_bottom");
        regAll(ModBlocks.Chiseled_Quartz_Block_Stairs.get(), ModBlocks.Chiseled_Quartz_Block_Slab.get(), ModBlocks.Chiseled_Quartz_Block_Wall.get(), "chiseled_quartz_block", "chiseled_quartz_block_top");

        regWall(ModBlocks.Prismarine_Bricks_Wall.get(), "prismarine_bricks");
        regWall(ModBlocks.Dark_Prismarine_Wall.get(), "dark_prismarine");

        regAll(ModBlocks.Netherrack_Stairs.get(), ModBlocks.Netherrack_Slab.get(), ModBlocks.Netherrack_Wall.get(), "netherrack");
        regAll(ModBlocks.End_Stone_Stairs.get(), ModBlocks.End_Stone_Slab.get(), ModBlocks.End_Stone_Wall.get(), "end_stone");
        regAll(ModBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get(), ModBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(), ModBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(), "cracked_polished_blackstone_bricks");
        regAll(ModBlocks.Basalt_Stairs.get(), ModBlocks.Basalt_Slab.get(), ModBlocks.Basalt_Wall.get(), "basalt_side", "basalt_top", "basalt");
        regAll(ModBlocks.Polished_Basalt_Stairs.get(), ModBlocks.Polished_Basalt_Slab.get(), ModBlocks.Polished_Basalt_Wall.get(), "polished_basalt_side", "polished_basalt_top", "polished_basalt");

        regAll(ModBlocks.Terracotta_Stairs.get(), ModBlocks.Terracotta_Slab.get(), ModBlocks.Terracotta_Wall.get(), "terracotta");
        regAll(ModBlocks.White_Terracotta_Stairs.get(), ModBlocks.White_Terracotta_Slab.get(), ModBlocks.White_Terracotta_Wall.get(), "white_terracotta");
        regAll(ModBlocks.Orange_Terracotta_Stairs.get(), ModBlocks.Orange_Terracotta_Slab.get(), ModBlocks.Orange_Terracotta_Wall.get(), "orange_terracotta");
        regAll(ModBlocks.Magenta_Terracotta_Stairs.get(), ModBlocks.Magenta_Terracotta_Slab.get(), ModBlocks.Magenta_Terracotta_Wall.get(), "magenta_terracotta");
        regAll(ModBlocks.Light_Blue_Terracotta_Stairs.get(), ModBlocks.Light_Blue_Terracotta_Slab.get(), ModBlocks.Light_Blue_Terracotta_Wall.get(), "light_blue_terracotta");
        regAll(ModBlocks.Yellow_Terracotta_Stairs.get(), ModBlocks.Yellow_Terracotta_Slab.get(), ModBlocks.Yellow_Terracotta_Wall.get(), "yellow_terracotta");
        regAll(ModBlocks.Lime_Terracotta_Stairs.get(), ModBlocks.Lime_Terracotta_Slab.get(), ModBlocks.Lime_Terracotta_Wall.get(), "lime_terracotta");
        regAll(ModBlocks.Pink_Terracotta_Stairs.get(), ModBlocks.Pink_Terracotta_Slab.get(), ModBlocks.Pink_Terracotta_Wall.get(), "pink_terracotta");
        regAll(ModBlocks.Gray_Terracotta_Stairs.get(), ModBlocks.Gray_Terracotta_Slab.get(), ModBlocks.Gray_Terracotta_Wall.get(), "gray_terracotta");
        regAll(ModBlocks.Light_Gray_Terracotta_Stairs.get(), ModBlocks.Light_Gray_Terracotta_Slab.get(), ModBlocks.Light_Gray_Terracotta_Wall.get(), "light_gray_terracotta");
        regAll(ModBlocks.Cyan_Terracotta_Stairs.get(), ModBlocks.Cyan_Terracotta_Slab.get(), ModBlocks.Cyan_Terracotta_Wall.get(), "cyan_terracotta");
        regAll(ModBlocks.Purple_Terracotta_Stairs.get(), ModBlocks.Purple_Terracotta_Slab.get(), ModBlocks.Purple_Terracotta_Wall.get(), "purple_terracotta");
        regAll(ModBlocks.Blue_Terracotta_Stairs.get(), ModBlocks.Blue_Terracotta_Slab.get(), ModBlocks.Blue_Terracotta_Wall.get(), "blue_terracotta");
        regAll(ModBlocks.Brown_Terracotta_Stairs.get(), ModBlocks.Brown_Terracotta_Slab.get(), ModBlocks.Brown_Terracotta_Wall.get(), "brown_terracotta");
        regAll(ModBlocks.Green_Terracotta_Stairs.get(), ModBlocks.Green_Terracotta_Slab.get(), ModBlocks.Green_Terracotta_Wall.get(), "green_terracotta");
        regAll(ModBlocks.Red_Terracotta_Stairs.get(), ModBlocks.Red_Terracotta_Slab.get(), ModBlocks.Red_Terracotta_Wall.get(), "red_terracotta");
        regAll(ModBlocks.Black_Terracotta_Stairs.get(), ModBlocks.Black_Terracotta_Slab.get(), ModBlocks.Black_Terracotta_Wall.get(), "black_terracotta");

        regAll(ModBlocks.Dripstone_Block_Stairs.get(), ModBlocks.Dripstone_Block_Slab.get(), ModBlocks.Dripstone_Block_Wall.get(), "dripstone_block");
        regAll(ModBlocks.Amethyst_Block_Stairs.get(), ModBlocks.Amethyst_Block_Slab.get(), ModBlocks.Amethyst_Block_Wall.get(), "amethyst_block");
        regAll(ModBlocks.Cracked_Stone_Brick_Stairs.get(), ModBlocks.Cracked_Stone_Brick_Slab.get(), ModBlocks.Cracked_Stone_Brick_Wall.get(), "cracked_stone_bricks");

        regStairsSlab(ModBlocks.Oak_Log_Stairs.get(), ModBlocks.Oak_Log_Slab.get(), "oak_log", "stripped_oak_log_top");
        regStairsSlab(ModBlocks.Spruce_Log_Stairs.get(), ModBlocks.Spruce_Log_Slab.get(), "spruce_log", "stripped_spruce_log_top");
        regStairsSlab(ModBlocks.Birch_Log_Stairs.get(), ModBlocks.Birch_Log_Slab.get(), "birch_log", "stripped_birch_log_top");
        regStairsSlab(ModBlocks.Jungle_Log_Stairs.get(), ModBlocks.Jungle_Log_Slab.get(), "jungle_log", "stripped_jungle_log_top");
        regStairsSlab(ModBlocks.Acacia_Log_Stairs.get(), ModBlocks.Acacia_Log_Slab.get(), "acacia_log", "stripped_acacia_log_top");
        regStairsSlab(ModBlocks.Dark_Oak_Log_Stairs.get(), ModBlocks.Dark_Oak_Log_Slab.get(), "dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlab(ModBlocks.Stripped_Oak_Log_Stairs.get(), ModBlocks.Stripped_Oak_Log_Slab.get(), "stripped_oak_log", "stripped_oak_log_top");
        regStairsSlab(ModBlocks.Stripped_Spruce_Log_Stairs.get(), ModBlocks.Stripped_Spruce_Log_Slab.get(), "stripped_spruce_log", "stripped_spruce_log_top");
        regStairsSlab(ModBlocks.Stripped_Birch_Log_Stairs.get(), ModBlocks.Stripped_Birch_Log_Slab.get(), "stripped_birch_log", "stripped_birch_log_top");
        regStairsSlab(ModBlocks.Stripped_Jungle_Log_Stairs.get(), ModBlocks.Stripped_Jungle_Log_Slab.get(), "stripped_jungle_log", "stripped_jungle_log_top");
        regStairsSlab(ModBlocks.Stripped_Acacia_Log_Stairs.get(), ModBlocks.Stripped_Acacia_Log_Slab.get(), "stripped_acacia_log", "stripped_acacia_log_top");
        regStairsSlab(ModBlocks.Stripped_Dark_Oak_Log_Stairs.get(), ModBlocks.Stripped_Dark_Oak_Log_Slab.get(), "stripped_dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlab(ModBlocks.Crimson_Stem_Stairs.get(), ModBlocks.Crimson_Stem_Slab.get(), "crimson_stem", "crimson_stem_top");
        regStairsSlab(ModBlocks.Warped_Stem_Stairs.get(), ModBlocks.Warped_Stem_Slab.get(), "warped_stem", "warped_stem_top");
        regStairsSlab(ModBlocks.Stripped_Crimson_Stem_Stairs.get(), ModBlocks.Stripped_Crimson_Stem_Slab.get(), "stripped_crimson_stem", "stripped_crimson_stem_top");
        regStairsSlab(ModBlocks.Stripped_Warped_Stem_Stairs.get(), ModBlocks.Stripped_Warped_Stem_Slab.get(), "stripped_warped_stem", "stripped_warped_stem_top");

    }
    protected void regAll(StairBlock stairs, SlabBlock slab, WallBlock wall, String texture){
        regStairs(stairs, texture);
        regSlab(slab, texture);
        regWall(wall, texture);
    }
    protected void regAll(StairBlock stairs, SlabBlock slab, WallBlock wall, String texture, String topTexture){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, texture);
        regWall(wall, texture);
    }
    protected void regAll(StairBlock stairs, SlabBlock slab, WallBlock wall, String texture, String topTexture, String doubleSlab){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, doubleSlab);
        regWall(wall, texture);
    }
    protected void regStairsSlab(StairBlock stairs, SlabBlock slab, String texture, String topTexture){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, texture);
    }
    protected void regStairs(StairBlock stairs, String texture){
        stairsBlock(stairs, mcLoc("block/" + texture));
    }
    protected void regStairs(StairBlock stairs, String texture, String topTexture){
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