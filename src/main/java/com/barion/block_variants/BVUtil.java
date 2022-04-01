package com.barion.block_variants;

public class BVUtil {
    public static boolean shouldAppendS(String name) {return ((name.contains("brick") && !name.contains("bricks") || (name.contains("tile") && !name.contains("tiles"))));}
    public static boolean isBasalt(String name) {return (name.contains("basalt") && !name.contains("smooth"));}
    public static boolean isWood(String name) {return (name.contains("wood") || name.contains("hyphae"));}
    public static boolean isLog(String name) {return (name.contains("log") || name.contains("stem"));}
    public static boolean isCutSandstone(String name) {return (name.contains("cut") && name.contains("sandstone"));}
}