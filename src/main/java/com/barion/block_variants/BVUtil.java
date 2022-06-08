package com.barion.block_variants;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class BVUtil {
    public static boolean shouldAppendS(String name) {return ((name.contains("brick") && !name.contains("bricks") || (name.contains("tile") && !name.contains("tiles"))));}
    public static boolean isBasalt(String name) {return (name.contains("basalt") && !name.contains("smooth"));}
    public static boolean isWood(String name) {return (name.contains("wood") || name.contains("hyphae"));}
    public static boolean isLog(String name) {return (name.contains("log") || name.contains("stem"));}
    public static boolean isWooden(String name) {return isLog(name) || isWood(name) || name.contains("plank");}
    public static boolean shouldAppendBlock(String name) {return (name.contains("purpur"));}
    public static boolean isCutSandstone(String name) {return (name.contains("cut") && name.contains("sandstone"));}

    public static String getBlockName(Block block) {return Registry.BLOCK.getKey(block).getPath();}

    public static void cry(BlockState state, Level level, BlockPos pos, RandomSource random) {
        Blocks.CRYING_OBSIDIAN.animateTick(state, level, pos, random);
    }
}