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
            String textureName = getBlockName(block);
            String name = getBlockName(block);
            ResourceLocation texture;
            if(textureName.contains("wood")) {textureName = textureName.replace("wood", "log");}
            if(textureName.contains("hyphae")) {textureName = textureName.replace("hyphae", "stem");}

            if(block instanceof StairBlock){
                //if(BVUtil.needsPlanksTexture(name)) {texture = blockTexture(name.replace("_stairs", "_planks"));}
                if(BVUtil.shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_stairs", "s"));}
                else if(textureName.contains("chiseled_quartz")) {
                    stairs(name, blockTexture("chiseled_quartz_block"), blockTexture("chiseled_quartz_block_top"), blockTexture("chiseled_quartz_block_top"));
                    continue;
                }else if(textureName.contains("smooth_stone")) {
                    stairs(name, blockTexture("smooth_stone_slab_side"), blockTexture("smooth_stone"), blockTexture("smooth_stone"));
                    continue;
                }else if(BVUtil.isCutSandstone(textureName)) {
                    texture = blockTexture(textureName.replace("cut_", "").replace("stairs", "top"));
                    stairs(name, blockTexture(textureName.replace("_stairs", "")), texture, texture);
                    continue;
                }else if(BVUtil.isBasalt(textureName)) {
                    texture = blockTexture(textureName.replace("stairs", "top"));
                    stairs(name, blockTexture(textureName.replace("stairs", "side")), texture, texture);
                    continue;
                }else if(BVUtil.isLog(name)){
                    texture = blockTexture(textureName.replace("stairs", "top"));
                    stairs(name, blockTexture(textureName.replace("_stairs", "")), texture, texture);
                    continue;
                }else {texture = blockTexture(textureName.replace("_stairs", ""));}
                stairs(name, texture, texture, texture);
            }else if(block instanceof SlabBlock) {
                //if(BVUtil.needsPlanksTexture(name)) {texture = blockTexture(name.replace("_slab", "_planks"));}
                if(BVUtil.shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_slab", "s"));}
                else if(textureName.contains("chiseled_quartz")) {
                    slab(name, blockTexture("chiseled_quartz_block"), blockTexture("chiseled_quartz_block_top"), blockTexture("chiseled_quartz_block_top"));
                    continue;
                }else if(BVUtil.isBasalt(textureName)) {
                    texture = blockTexture(textureName.replace("slab", "top"));
                    slab(name, blockTexture(textureName.replace("slab", "side")), texture, texture);
                    continue;
                }else if(BVUtil.isLog(name)) {
                    texture = blockTexture(textureName.replace("slab", "top"));
                    slab(name, blockTexture(textureName.replace("_slab", "")), texture, texture);
                    continue;
                }else {texture = blockTexture(textureName.replace("_slab", ""));}
                slab(name, texture, texture, texture);
            }else if(block instanceof WallBlock){
                if(Objects.equals(textureName, "quartz_wall")) {texture = blockTexture(textureName.replace("_wall", "_block_top"));}
                else if(BVUtil.shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_wall", "s"));}
                else if(BVUtil.shouldAppendBlock(textureName)) {texture = blockTexture(textureName.replace("wall", "block"));}
                else if(Objects.equals(textureName, "smooth_quartz_wall")) {texture = blockTexture(textureName.replace("_wall", "_block_bottom").replace("smooth_", ""));}
                else if(BVUtil.isBasalt(textureName)) {texture = blockTexture(textureName.replace("wall", "side"));}
                else {texture = blockTexture(textureName.replace("_wall", ""));}
                wallInventory(name, texture);
            }else if(block instanceof FenceBlock) {
                if(BVUtil.shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_fence", "s"));}
                else {texture = blockTexture(textureName.replace("_fence", "_planks"));}
                fenceInventory(name, texture);
            }else if(block instanceof FenceGateBlock){
                if(BVUtil.shouldAppendS(textureName)) {texture = blockTexture(textureName.replace("_fence_gate", "s"));}
                else {texture = blockTexture(textureName.replace("_fence_gate", "_planks"));}
                fenceGate(name, texture);
            }else{
                withExistingParent(textureName, blockTexture(textureName));
            }
        }
    }

    protected ResourceLocation blockTexture(String texture) {return mcLoc("block/" + texture);}
}