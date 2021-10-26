package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

public class BVBlockStates extends BlockStateProvider {
    public BVBlockStates(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.Mod_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        regWall(BVBlocks.Polished_Granite_Wall, "polished_granite");
        regWall(BVBlocks.Polished_Diorite_Wall, "polished_diorite");
        regWall(BVBlocks.Polished_Andesite_Wall, "polished_andesite");

        regWall(BVBlocks.Stone_Wall, "stone");
        regStairs(BVBlocks.Smooth_Stone_Stairs, "smooth_stone_slab_side", "smooth_stone");
        regWall(BVBlocks.Smooth_Stone_Wall, "smooth_stone");

        regStairs(BVBlocks.Cut_Sandstone_Stairs, "cut_sandstone", "sandstone_top");
        regWall(BVBlocks.Cut_Sandstone_Wall, "cut_sandstone");
        regStairs(BVBlocks.Cut_Red_Sandstone_Stairs, "cut_red_sandstone", "red_sandstone_top");
        regWall(BVBlocks.Cut_Red_Sandstone_Wall, "cut_red_sandstone");

        regWall(BVBlocks.Quartz_Wall, "quartz_block_top");
        regAll(BVBlocks.Quartz_Bricks_Stairs, BVBlocks.Quartz_Bricks_Slab, BVBlocks.Quartz_Bricks_Wall, "quartz_bricks");
        regWall(BVBlocks.Smooth_Quartz_Wall, "quartz_block_bottom");
        regAll(BVBlocks.Chiseled_Quartz_Block_Stairs, BVBlocks.Chiseled_Quartz_Block_Slab, BVBlocks.Chiseled_Quartz_Block_Wall, "chiseled_quartz_block", "chiseled_quartz_block_top");

        regWall(BVBlocks.Prismarine_Bricks_Wall, "prismarine_bricks");
        regWall(BVBlocks.Dark_Prismarine_Wall, "dark_prismarine");

        regAll(BVBlocks.Netherrack_Stairs, BVBlocks.Netherrack_Slab, BVBlocks.Netherrack_Wall, "netherrack");
        regAll(BVBlocks.End_Stone_Stairs, BVBlocks.End_Stone_Slab, BVBlocks.End_Stone_Wall, "end_stone");
        regAll(BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs, BVBlocks.Cracked_Polished_Blackstone_Brick_Slab, BVBlocks.Cracked_Polished_Blackstone_Brick_Wall, "cracked_polished_blackstone_bricks");
        regAll(BVBlocks.Basalt_Stairs, BVBlocks.Basalt_Slab, BVBlocks.Basalt_Wall, "basalt_side", "basalt_top", "basalt");
        regAll(BVBlocks.Polished_Basalt_Stairs, BVBlocks.Polished_Basalt_Slab, BVBlocks.Polished_Basalt_Wall, "polished_basalt_side", "polished_basalt_top", "polished_basalt");

        regAll(BVBlocks.Terracotta_Stairs, BVBlocks.Terracotta_Slab, BVBlocks.Terracotta_Wall, "terracotta");
        regAll(BVBlocks.White_Terracotta_Stairs, BVBlocks.White_Terracotta_Slab, BVBlocks.White_Terracotta_Wall, "white_terracotta");
        regAll(BVBlocks.Orange_Terracotta_Stairs, BVBlocks.Orange_Terracotta_Slab, BVBlocks.Orange_Terracotta_Wall, "orange_terracotta");
        regAll(BVBlocks.Magenta_Terracotta_Stairs, BVBlocks.Magenta_Terracotta_Slab, BVBlocks.Magenta_Terracotta_Wall, "magenta_terracotta");
        regAll(BVBlocks.Light_Blue_Terracotta_Stairs, BVBlocks.Light_Blue_Terracotta_Slab, BVBlocks.Light_Blue_Terracotta_Wall, "light_blue_terracotta");
        regAll(BVBlocks.Yellow_Terracotta_Stairs, BVBlocks.Yellow_Terracotta_Slab, BVBlocks.Yellow_Terracotta_Wall, "yellow_terracotta");
        regAll(BVBlocks.Lime_Terracotta_Stairs, BVBlocks.Lime_Terracotta_Slab, BVBlocks.Lime_Terracotta_Wall, "lime_terracotta");
        regAll(BVBlocks.Pink_Terracotta_Stairs, BVBlocks.Pink_Terracotta_Slab, BVBlocks.Pink_Terracotta_Wall, "pink_terracotta");
        regAll(BVBlocks.Gray_Terracotta_Stairs, BVBlocks.Gray_Terracotta_Slab, BVBlocks.Gray_Terracotta_Wall, "gray_terracotta");
        regAll(BVBlocks.Light_Gray_Terracotta_Stairs, BVBlocks.Light_Gray_Terracotta_Slab, BVBlocks.Light_Gray_Terracotta_Wall, "light_gray_terracotta");
        regAll(BVBlocks.Cyan_Terracotta_Stairs, BVBlocks.Cyan_Terracotta_Slab, BVBlocks.Cyan_Terracotta_Wall, "cyan_terracotta");
        regAll(BVBlocks.Purple_Terracotta_Stairs, BVBlocks.Purple_Terracotta_Slab, BVBlocks.Purple_Terracotta_Wall, "purple_terracotta");
        regAll(BVBlocks.Blue_Terracotta_Stairs, BVBlocks.Blue_Terracotta_Slab, BVBlocks.Blue_Terracotta_Wall, "blue_terracotta");
        regAll(BVBlocks.Brown_Terracotta_Stairs, BVBlocks.Brown_Terracotta_Slab, BVBlocks.Brown_Terracotta_Wall, "brown_terracotta");
        regAll(BVBlocks.Green_Terracotta_Stairs, BVBlocks.Green_Terracotta_Slab, BVBlocks.Green_Terracotta_Wall, "green_terracotta");
        regAll(BVBlocks.Red_Terracotta_Stairs, BVBlocks.Red_Terracotta_Slab, BVBlocks.Red_Terracotta_Wall, "red_terracotta");
        regAll(BVBlocks.Black_Terracotta_Stairs, BVBlocks.Black_Terracotta_Slab, BVBlocks.Black_Terracotta_Wall, "black_terracotta");

        regAll(BVBlocks.Dripstone_Block_Stairs, BVBlocks.Dripstone_Block_Slab, BVBlocks.Dripstone_Block_Wall, "dripstone_block");
        regAll(BVBlocks.Amethyst_Block_Stairs, BVBlocks.Amethyst_Block_Slab, BVBlocks.Amethyst_Block_Wall, "amethyst_block");
        regAll(BVBlocks.Cracked_Stone_Brick_Stairs, BVBlocks.Cracked_Stone_Brick_Slab, BVBlocks.Cracked_Stone_Brick_Wall, "cracked_stone_bricks");

        regStairsSlab(BVBlocks.Oak_Log_Stairs, BVBlocks.Oak_Log_Slab, "oak_log", "stripped_oak_log_top");
        regStairsSlab(BVBlocks.Spruce_Log_Stairs, BVBlocks.Spruce_Log_Slab, "spruce_log", "stripped_spruce_log_top");
        regStairsSlab(BVBlocks.Birch_Log_Stairs, BVBlocks.Birch_Log_Slab, "birch_log", "stripped_birch_log_top");
        regStairsSlab(BVBlocks.Jungle_Log_Stairs, BVBlocks.Jungle_Log_Slab, "jungle_log", "stripped_jungle_log_top");
        regStairsSlab(BVBlocks.Acacia_Log_Stairs, BVBlocks.Acacia_Log_Slab, "acacia_log", "stripped_acacia_log_top");
        regStairsSlab(BVBlocks.Dark_Oak_Log_Stairs, BVBlocks.Dark_Oak_Log_Slab, "dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlab(BVBlocks.Stripped_Oak_Log_Stairs, BVBlocks.Stripped_Oak_Log_Slab, "stripped_oak_log", "stripped_oak_log_top");
        regStairsSlab(BVBlocks.Stripped_Spruce_Log_Stairs, BVBlocks.Stripped_Spruce_Log_Slab, "stripped_spruce_log", "stripped_spruce_log_top");
        regStairsSlab(BVBlocks.Stripped_Birch_Log_Stairs, BVBlocks.Stripped_Birch_Log_Slab, "stripped_birch_log", "stripped_birch_log_top");
        regStairsSlab(BVBlocks.Stripped_Jungle_Log_Stairs, BVBlocks.Stripped_Jungle_Log_Slab, "stripped_jungle_log", "stripped_jungle_log_top");
        regStairsSlab(BVBlocks.Stripped_Acacia_Log_Stairs, BVBlocks.Stripped_Acacia_Log_Slab, "stripped_acacia_log", "stripped_acacia_log_top");
        regStairsSlab(BVBlocks.Stripped_Dark_Oak_Log_Stairs, BVBlocks.Stripped_Dark_Oak_Log_Slab, "stripped_dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlab(BVBlocks.Crimson_Stem_Stairs, BVBlocks.Crimson_Stem_Slab, "crimson_stem", "crimson_stem_top");
        regStairsSlab(BVBlocks.Warped_Stem_Stairs, BVBlocks.Warped_Stem_Slab, "warped_stem", "warped_stem_top");
        regStairsSlab(BVBlocks.Stripped_Crimson_Stem_Stairs, BVBlocks.Stripped_Crimson_Stem_Slab, "stripped_crimson_stem", "stripped_crimson_stem_top");
        regStairsSlab(BVBlocks.Stripped_Warped_Stem_Stairs, BVBlocks.Stripped_Warped_Stem_Slab, "stripped_warped_stem", "stripped_warped_stem_top");

        regAll(BVBlocks.Oak_Wood_Stairs, BVBlocks.Oak_Wood_Slab, BVBlocks.Oak_Wood_Wall, "oak_log");
        regAll(BVBlocks.Spruce_Wood_Stairs, BVBlocks.Spruce_Wood_Slab, BVBlocks.Spruce_Wood_Wall, "spruce_log");
        regAll(BVBlocks.Birch_Wood_Stairs, BVBlocks.Birch_Wood_Slab, BVBlocks.Birch_Wood_Wall, "birch_log");
        regAll(BVBlocks.Jungle_Wood_Stairs, BVBlocks.Jungle_Wood_Slab, BVBlocks.Jungle_Wood_Wall, "jungle_log");
        regAll(BVBlocks.Acacia_Wood_Stairs, BVBlocks.Acacia_Wood_Slab, BVBlocks.Acacia_Wood_Wall, "acacia_log");
        regAll(BVBlocks.Dark_Oak_Wood_Stairs, BVBlocks.Dark_Oak_Wood_Slab, BVBlocks.Dark_Oak_Wood_Wall, "dark_oak_log");
        regAll(BVBlocks.Stripped_Oak_Wood_Stairs, BVBlocks.Stripped_Oak_Wood_Slab, BVBlocks.Stripped_Oak_Wood_Wall, "stripped_oak_log");
        regAll(BVBlocks.Stripped_Spruce_Wood_Stairs, BVBlocks.Stripped_Spruce_Wood_Slab, BVBlocks.Stripped_Spruce_Wood_Wall, "stripped_spruce_log");
        regAll(BVBlocks.Stripped_Birch_Wood_Stairs, BVBlocks.Stripped_Birch_Wood_Slab, BVBlocks.Stripped_Birch_Wood_Wall, "stripped_birch_log");
        regAll(BVBlocks.Stripped_Jungle_Wood_Stairs, BVBlocks.Stripped_Jungle_Wood_Slab, BVBlocks.Stripped_Jungle_Wood_Wall, "stripped_jungle_log");
        regAll(BVBlocks.Stripped_Acacia_Wood_Stairs, BVBlocks.Stripped_Acacia_Wood_Slab, BVBlocks.Stripped_Acacia_Wood_Wall, "stripped_acacia_log");
        regAll(BVBlocks.Stripped_Dark_Oak_Wood_Stairs, BVBlocks.Stripped_Dark_Oak_Wood_Slab, BVBlocks.Stripped_Dark_Oak_Wood_Wall, "stripped_dark_oak_log");

        regAll(BVBlocks.Crimson_Hyphae_Stairs, BVBlocks.Crimson_Hyphae_Slab, BVBlocks.Crimson_Hyphae_Wall, "crimson_stem");
        regAll(BVBlocks.Warped_Hyphae_Stairs, BVBlocks.Warped_Hyphae_Slab, BVBlocks.Warped_Hyphae_Wall, "warped_stem");
        regAll(BVBlocks.Stripped_Crimson_Hyphae_Stairs, BVBlocks.Stripped_Crimson_Hyphae_Slab, BVBlocks.Stripped_Crimson_Hyphae_Wall, "stripped_crimson_stem");
        regAll(BVBlocks.Stripped_Warped_Hyphae_Stairs, BVBlocks.Stripped_Warped_Hyphae_Slab, BVBlocks.Stripped_Warped_Hyphae_Wall, "stripped_warped_stem");
    }
    protected void regAll(RegistryObject<StairBlock> stairs, RegistryObject<SlabBlock> slab, RegistryObject<WallBlock> wall, String texture){
        regStairs(stairs, texture);
        regSlab(slab, texture);
        regWall(wall, texture);
    }
    protected void regAll(RegistryObject<StairBlock> stairs, RegistryObject<SlabBlock> slab, RegistryObject<WallBlock> wall, String texture, String topTexture){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, texture);
        regWall(wall, texture);
    }
    protected void regAll(RegistryObject<StairBlock> stairs, RegistryObject<SlabBlock> slab, RegistryObject<WallBlock> wall, String texture, String topTexture, String doubleSlab){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, doubleSlab);
        regWall(wall, texture);
    }
    protected void regStairsSlab(RegistryObject<StairBlock> stairs, RegistryObject<SlabBlock> slab, String texture, String topTexture){
        regStairs(stairs, texture, topTexture);
        regSlab(slab, texture, topTexture, texture);
    }
    protected void regStairs(RegistryObject<StairBlock> stairs, String texture){
        stairsBlock(stairs.get(), mcLoc("block/" + texture));
    }
    protected void regStairs(RegistryObject<StairBlock> stairs, String texture, String topTexture){
        ResourceLocation topResource = mcLoc("block/" + topTexture);
        stairsBlock(stairs.get(), mcLoc("block/" + texture), topResource, topResource);
    }
    protected void regSlab(RegistryObject<SlabBlock> slab, String texture) {
        regSlab(slab, texture, texture, texture);
    }
    protected void regSlab(RegistryObject<SlabBlock> slab, String texture, String doubleSlab, boolean toIdentifyThisMethod){
        regSlab(slab, texture, texture, doubleSlab);
    }
    protected void regSlab(RegistryObject<SlabBlock> slab, String texture, String topTexture){
        regSlab(slab,texture, topTexture, texture);
    }
    protected void regSlab(RegistryObject<SlabBlock> slab, String texture, String topTexture, String doubleSlab){
        ResourceLocation resource = mcLoc("block/" + texture);
        ResourceLocation topResource = mcLoc("block/" + topTexture);
        slabBlock(slab.get(), mcLoc("block/" + doubleSlab), mcLoc("block/" + texture), topResource, topResource);
    }
    protected void regWall(RegistryObject<WallBlock> wall, String texture){
        wallBlock(wall.get(), mcLoc("block/" + texture));
    }
}