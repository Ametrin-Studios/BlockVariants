package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BVItemModels extends ItemModelProvider {
    public BVItemModels(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.Mod_ID, fileHelper);
    }

    @Override
    protected void registerModels() {
        regWall("polished_diorite");
        regWall("polished_granite");
        regWall("polished_andesite");

        regWall("stone");
        regStairs("smooth_stone", "smooth_stone_slab_side", "smooth_stone");
        regWall("smooth_stone");

        regWall("cut_sandstone");
        regStairs("cut_sandstone", "cut_sandstone", "sandstone_top");
        regWall("cut_red_sandstone");
        regStairs("cut_red_sandstone", "cut_red_sandstone", "red_sandstone_top");

        regWall("quartz", "quartz_block_top");
        regAll("quartz_bricks");
        regWall("smooth_quartz", "quartz_block_bottom");
        regAllWithTop("chiseled_quartz_block", "chiseled_quartz_block_top");

        regWall("dark_prismarine");
        regWall("prismarine_bricks");

        regAll("netherrack");
        regAll("end_stone");
        regAll("cracked_polished_blackstone_brick", "cracked_polished_blackstone_bricks");
        regAll("basalt", "basalt_side", "basalt_top");
        regAll("polished_basalt", "polished_basalt_side", "polished_basalt_top");

        regAll("terracotta");
        regAllTerra("white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black");

        regAll("dripstone_block");
        regAll("amethyst_block");
        regAll("cracked_stone_brick", "cracked_stone_bricks");

        regStairsSlab("oak_log", "oak_log_top");
        regStairsSlab("spruce_log", "spruce_log_top");
        regStairsSlab("birch_log", "birch_log_top");
        regStairsSlab("jungle_log", "jungle_log_top");
        regStairsSlab("acacia_log", "acacia_log_top");
        regStairsSlab("dark_oak_log", "dark_oak_log_top");
        regStairsSlab("stripped_oak_log", "stripped_oak_log_top");
        regStairsSlab("stripped_spruce_log", "stripped_spruce_log_top");
        regStairsSlab("stripped_birch_log", "stripped_birch_log_top");
        regStairsSlab("stripped_jungle_log", "stripped_jungle_log_top");
        regStairsSlab("stripped_acacia_log", "stripped_acacia_log_top");
        regStairsSlab("stripped_dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlab("crimson_stem", "crimson_stem_top");
        regStairsSlab("warped_stem", "warped_stem_top");
        regStairsSlab("stripped_crimson_stem", "stripped_crimson_stem_top");
        regStairsSlab("stripped_warped_stem", "stripped_warped_stem_top");

        regAllWood("oak", "spruce", "birch", "jungle", "acacia", "dark_oak");
        regAll("crimson_hyphae", "crimson_stem");
        regAll("warped_hyphae", "warped_stem");
        regAll("stripped_crimson_hyphae", "stripped_crimson_stem");
        regAll("stripped_warped_hyphae", "stripped_warped_stem");
        regAll("calcite");
        regAll("smooth_basalt");
    }

    private void regAll(String name){
        regStairs(name);
        regSlab(name);
        regWall(name);
    }
    private void regAll(String name, String texture){
        regStairs(name, texture);
        regSlab(name, texture);
        regWall(name, texture);
    }
    private void regAll(String name, String texture, String top){
        regStairs(name, texture, top);
        regSlab(name, texture, top);
        regWall(name, texture);
    }
    private void regAllWithTop(String name, String top){
        regStairs(name, name, top);
        regSlab(name, name, top);
        regWall(name);
    }
    private void regStairsSlab(String name, String top){
        regStairs(name, name, top);
        regSlab(name, name, top);
    }
    private void regStairs(String name){
        regStairs(name, name, name);
    }
    private void regStairs(String name, String texture){
        regStairs(name, texture, texture);
    }
    private void regStairs(String name, String texture, String topTexture){
        ResourceLocation resource = mcLoc("block/" + texture);
        ResourceLocation topResource = mcLoc("block/" + topTexture);
        stairs(name + "_stairs", resource, topResource, topResource);
    }
    private void regSlab(String name) {
        regSlab(name, name, name);
    }
    private void regSlab(String name, String texture){
        regSlab(name, texture, texture);
    }
    private void regSlab(String name, String texture, String topTexture){
        ResourceLocation resource = mcLoc("block/" + texture);
        ResourceLocation topResource = mcLoc("block/" + topTexture);
        slab(name + "_slab", resource, topResource, topResource);
    }
    private void regWall(String name){
        regWall(name, name);
    }
    private void regWall(String name, String texture){
        wallInventory(name + "_wall", mcLoc("block/" + texture));
    }

    private void regAllTerra(String... colors){
        for(String color : colors) {
            regAll(color + "_terracotta");
        }
    }
    private void regAllWood(String... types){
        for(String type : types) {
            regAll(type + "_wood", type + "_log");
        }
        for(String type : types) {
            regAll("stripped_" + type + "_wood", "stripped_" + type + "_log");
        }
        for(String type : types) {
            regAll(type + "_log", type + "_log", type + "_log_top");
        }
        for(String type : types) {
            regAll("stripped_" + type + "_log", "stripped_" + type + "_log", "stripped_" + type + "_log_top");
        }
    }
}