package com.barion.block_variants;

import net.minecraft.block.BlockState;
import net.minecraft.state.Property;

public class BVUtil {
    public static boolean shouldAppendS(String name) {return ((name.contains("brick") && !name.contains("bricks") || (name.contains("tile") && !name.contains("tiles"))));}
    public static boolean isBasalt(String name) {return (name.contains("basalt") && !name.contains("smooth"));}
    public static boolean isWood(String name) {return (name.contains("wood") || name.contains("hyphae"));}
    public static boolean isLog(String name) {return (name.contains("log") || name.contains("stem"));}
    public static boolean isWooden(String name) {return isLog(name) || isWood(name) || name.contains("plank");}
    public static boolean shouldAppendBlock(String name) {return (name.contains("purpur"));}
    public static boolean isCutSandstone(String name) {return (name.contains("cut") && name.contains("sandstone"));}

    public static <T extends Comparable<T>, V extends T> BlockState copyProperties(BlockState from, BlockState to) {

        for(Property<?> property : from.getBlock().getStateDefinition().getProperties()) {
            if (to.hasProperty(property)) {
                to = to.setValue((Property<T>) property, (V)from.getValue(property));
            }
        }

        return to;
    }
}