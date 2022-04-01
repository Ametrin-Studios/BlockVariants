package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BVItemModelProvider extends ItemModelProvider {
    public BVItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.ModID, fileHelper);
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

        regStairsSlabWithTop("oak_log", "oak_log_top");
        regStairsSlabWithTop("spruce_log", "spruce_log_top");
        regStairsSlabWithTop("birch_log", "birch_log_top");
        regStairsSlabWithTop("jungle_log", "jungle_log_top");
        regStairsSlabWithTop("acacia_log", "acacia_log_top");
        regStairsSlabWithTop("dark_oak_log", "dark_oak_log_top");
        regStairsSlabWithTop("stripped_oak_log", "stripped_oak_log_top");
        regStairsSlabWithTop("stripped_spruce_log", "stripped_spruce_log_top");
        regStairsSlabWithTop("stripped_birch_log", "stripped_birch_log_top");
        regStairsSlabWithTop("stripped_jungle_log", "stripped_jungle_log_top");
        regStairsSlabWithTop("stripped_acacia_log", "stripped_acacia_log_top");
        regStairsSlabWithTop("stripped_dark_oak_log", "stripped_dark_oak_log_top");
        regStairsSlabWithTop("crimson_stem", "crimson_stem_top");
        regStairsSlabWithTop("warped_stem", "warped_stem_top");
        regStairsSlabWithTop("stripped_crimson_stem", "stripped_crimson_stem_top");
        regStairsSlabWithTop("stripped_warped_stem", "stripped_warped_stem_top");

        regAllWood("oak", "spruce", "birch", "jungle", "acacia", "dark_oak");
        regAll("crimson_hyphae", "crimson_stem");
        regAll("warped_hyphae", "warped_stem");
        regAll("stripped_crimson_hyphae", "stripped_crimson_stem");
        regAll("stripped_warped_hyphae", "stripped_warped_stem");
        regAll("calcite");
        regAll("smooth_basalt");
        regAll("tuff");
        regAll("deepslate");
        regAll("cracked_deepslate_brick", "cracked_deepslate_bricks");
        regAll("cracked_deepslate_tile", "cracked_deepslate_tiles");

        regFenceGate("nether_brick", "nether_bricks");
        regAll("cracked_nether_brick", "cracked_nether_bricks");
        regFenceAndGate("cracked_nether_brick", "cracked_nether_bricks");
        regFenceAndGate("red_nether_brick", "red_nether_bricks");
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
    private void regStairsSlabWithTop(String name, String top){
        regStairs(name, name, top);
        regSlab(name, name, top);
    }
    private void regStairsSlab(String name, String texture){
        regStairs(name, texture);
        regSlab(name, texture);
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
    private void regFence(String name, String texture){fenceInventory(name + "_fence", mcLoc("block/" + texture));}
    private void regFenceGate(String name, String texture){fenceGate(name + "_fence_gate", mcLoc("block/" + texture));}
    private void regFenceAndGate(String name, String texture){
        regFence(name, texture);
        regFenceGate(name, texture);
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