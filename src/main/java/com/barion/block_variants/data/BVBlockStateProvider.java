package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.Objects;

public class BVBlockStateProvider extends BlockStateProvider {
    public BVBlockStateProvider(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.ModID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blocks(BVBlocks.getAllBlocks());
    }

    protected  <B extends Block> void blocks(List<B> blocks){
        for(B block : blocks) {
            String name = getName(block);
            ResourceLocation texture;
            if(name.contains("wood")) {name = name.replace("wood", "log");}
            if(name.contains("hyphae")) {name = name.replace("hyphae", "stem");}

            if(block instanceof StairBlock){
                //if(BVUtil.needsPlanksTexture(name)) {texture = blockTexture(name.replace("_stairs", "_planks"));}
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_stairs", "s"));}
                else if(name.contains("chiseled_quartz")) {
                    stairsBlock((StairBlock) block, blockTexture("chiseled_quartz_block"), blockTexture("chiseled_quartz_block_top"), blockTexture("chiseled_quartz_block_top"));
                    continue;
                }else if(name.contains("smooth_stone")) {
                    stairsBlock((StairBlock) block, blockTexture("smooth_stone_slab_side"), blockTexture("smooth_stone"), blockTexture("smooth_stone"));
                    continue;
                }else if(BVUtil.isCutSandstone(name)) {
                    texture = blockTexture(name.replace("cut_", "").replace("stairs", "top"));
                    stairsBlock((StairBlock) block, blockTexture(name.replace("_stairs", "")), texture, texture);
                    continue;
                }else if(BVUtil.isBasalt(name)) {
                    texture = blockTexture(name.replace("stairs", "top"));
                    stairsBlock((StairBlock) block, blockTexture(name.replace("stairs", "side")), texture, texture);
                    continue;
                }else if(BVUtil.isLog(getName(block))){
                    texture = blockTexture(name.replace("stairs", "top"));
                    stairsBlock((StairBlock) block, blockTexture(name.replace("_stairs", "")), texture, texture);
                    continue;
                }else {texture = blockTexture(name.replace("_stairs", ""));}
                stairsBlock((StairBlock) block, texture);
            }else if(block instanceof SlabBlock) {
                //if(BVUtil.needsPlanksTexture(name)) {texture = blockTexture(name.replace("_slab", "_planks"));}
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_slab", "s"));}
                else if(name.contains("chiseled_quartz")) {
                    slabBlock((SlabBlock) block, blockTexture("chiseled_quartz_block"), blockTexture("chiseled_quartz_block"), blockTexture("chiseled_quartz_block_top"), blockTexture("chiseled_quartz_block_top"));
                    continue;
                }else if(BVUtil.isBasalt(name)) {
                    texture = blockTexture(name.replace("slab", "top"));
                    slabBlock((SlabBlock) block, blockTexture(name.replace("_slab", "")), blockTexture(name.replace("slab", "side")), texture, texture);
                    continue;
                }else if(BVUtil.isLog(getName(block))) {
                    texture = blockTexture(name.replace("slab", "top"));
                    slabBlock((SlabBlock) block, blockTexture(name.replace("_slab", "")), blockTexture(name.replace("_slab", "")), texture, texture);
                    continue;
                }else if(BVUtil.isWood(getName(block))) {
                    slabBlock((SlabBlock) block, blockTexture(getName(block).replace("_slab", "")), blockTexture(name.replace("_slab", "")));
                    continue;
                } else {texture = blockTexture(name.replace("_slab", ""));}
                slabBlock((SlabBlock) block, texture, texture);
            }else if(block instanceof WallBlock){
                if(Objects.equals(name, "quartz_wall")) {texture = blockTexture(name.replace("_wall", "_block_top"));}
                else if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_wall", "s"));}
                else if(Objects.equals(name, "smooth_quartz_wall")) {texture = blockTexture(name.replace("_wall", "_block_bottom").replace("smooth_", ""));}
                else if(BVUtil.isBasalt(name)) {texture = blockTexture(name.replace("wall", "side"));}
                else {texture = blockTexture(name.replace("_wall", ""));}
                wallBlock((WallBlock) block, texture);
            }else if(block instanceof RotatedPillarBlock){
                if(name.contains("wood")) {
                    texture = blockTexture(name.replace("wood", "log"));
                    axisBlock((RotatedPillarBlock)block, texture, texture);
                }else{
                    logBlock((RotatedPillarBlock) block);
                }
            }else if(block instanceof FenceBlock) {
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_fence", "s"));}
                else {texture = blockTexture(name.replace("_fence", "_planks"));}
                fenceBlock((FenceBlock) block, texture);
            }else if(block instanceof FenceGateBlock){
                if(BVUtil.shouldAppendS(name)) {texture = blockTexture(name.replace("_fence_gate", "s"));}
                else {texture = blockTexture(name.replace("_fence_gate", "_planks"));}
                fenceGateBlock((FenceGateBlock) block, texture);
            }else if(block instanceof ButtonBlock){
                buttonBlock((ButtonBlock) block, blockTexture(name.replace("_button", "_planks")));
            }else if(block instanceof PressurePlateBlock){
                pressurePlateBlock((PressurePlateBlock) block, blockTexture(name.replace("_pressure_plate", "_planks")));
            }else if(block instanceof TrapDoorBlock){
                trapdoorBlock((TrapDoorBlock) block, blockTexture(name), true);
            }else if(block instanceof DoorBlock){
                doorBlock((DoorBlock) block, blockTexture(name + "_bottom"), blockTexture(name + "_top"));
            }else{
                simpleBlock(block);
            }
        }
    }

    protected ResourceLocation blockTexture(String texture) {return mcLoc("block/" + texture);}
    protected String getName(Block block) {return Objects.requireNonNull(block.getRegistryName()).getPath();}
}