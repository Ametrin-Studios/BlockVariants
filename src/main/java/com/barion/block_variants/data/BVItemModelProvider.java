package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.Objects;

import static com.barion.block_variants.BVUtil.getBlockName;

public class BVItemModelProvider extends ItemModelProvider {
    public BVItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.ModID, fileHelper);
    }

    @Override
    protected void registerModels() {
       blocks(BVBlocks.getAllBlocks());
    }

    protected  <B extends Block> void blocks(List<B> blocks){
        for(B block : blocks) {
            String name = getBlockName(block);
            ResourceLocation texture;
            if(name.contains("wood")) {name = name.replace("wood", "log");}
            if(name.contains("hyphae")) {name = name.replace("hyphae", "stem");}

            if(block instanceof StairBlock){
                //if(BVUtil.needsPlanksTexture(name)) {texture = blockTexture(name.replace("_stairs", "_planks"));}
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_stairs", "s"));}
                else if(name.contains("chiseled_quartz")) {
                    stairs(getBlockName(block), blockTexture("chiseled_quartz_block"), blockTexture("chiseled_quartz_block_top"), blockTexture("chiseled_quartz_block_top"));
                    continue;
                }else if(name.contains("smooth_stone")) {
                    stairs(getBlockName(block), blockTexture("smooth_stone_slab_side"), blockTexture("smooth_stone"), blockTexture("smooth_stone"));
                    continue;
                }else if(BVUtil.isCutSandstone(name)) {
                    texture = blockTexture(name.replace("cut_", "").replace("stairs", "top"));
                    stairs(getBlockName(block), blockTexture(name.replace("_stairs", "")), texture, texture);
                    continue;
                }else if(BVUtil.isBasalt(name)) {
                    texture = blockTexture(name.replace("stairs", "top"));
                    stairs(getBlockName(block), blockTexture(name.replace("stairs", "side")), texture, texture);
                    continue;
                }else if(BVUtil.isLog(getBlockName(block))){
                    texture = blockTexture(name.replace("stairs", "top"));
                    stairs(getBlockName(block), blockTexture(name.replace("_stairs", "")), texture, texture);
                    continue;
                }else {texture = blockTexture(name.replace("_stairs", ""));}
                stairs(getBlockName(block), texture, texture, texture);
            }else if(block instanceof SlabBlock) {
                //if(BVUtil.needsPlanksTexture(name)) {texture = blockTexture(name.replace("_slab", "_planks"));}
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_slab", "s"));}
                else if(name.contains("chiseled_quartz")) {
                    slab(getBlockName(block), blockTexture("chiseled_quartz_block"), blockTexture("chiseled_quartz_block_top"), blockTexture("chiseled_quartz_block_top"));
                    continue;
                }else if(BVUtil.isBasalt(name)) {
                    texture = blockTexture(name.replace("slab", "top"));
                    slab(getBlockName(block), blockTexture(name.replace("slab", "side")), texture, texture);
                    continue;
                }else if(BVUtil.isLog(getBlockName(block))) {
                    texture = blockTexture(name.replace("slab", "top"));
                    slab(getBlockName(block), blockTexture(name.replace("_slab", "")), texture, texture);
                    continue;
                }else {texture = blockTexture(name.replace("_slab", ""));}
                slab(getBlockName(block), texture, texture, texture);
            }else if(block instanceof WallBlock){
                if(Objects.equals(name, "quartz_wall")) {texture = blockTexture(name.replace("_wall", "_block_top"));}
                else if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_wall", "s"));}
                else if(BVUtil.shouldAppendBlock(name)) {texture = blockTexture(name.replace("wall", "block"));}
                else if(Objects.equals(name, "smooth_quartz_wall")) {texture = blockTexture(name.replace("_wall", "_block_bottom").replace("smooth_", ""));}
                else if(BVUtil.isBasalt(name)) {texture = blockTexture(name.replace("wall", "side"));}
                else {texture = blockTexture(name.replace("_wall", ""));}
                wallInventory(getBlockName(block), texture);
            }else if(block instanceof FenceBlock) {
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_fence", "s"));}
                else {texture = blockTexture(name.replace("_fence", "_planks"));}
                fenceInventory(getBlockName(block), texture);
            }else if(block instanceof FenceGateBlock){
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_fence_gate", "s"));}
                else {texture = blockTexture(name.replace("_fence_gate", "_planks"));}
                fenceGate(getBlockName(block), texture);
            }else{
                withExistingParent(name, blockTexture(name));
            }
        }
    }

    protected ResourceLocation blockTexture(String texture) {return mcLoc("block/" + texture);}
}