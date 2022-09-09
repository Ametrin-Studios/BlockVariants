package com.barion.block_variants.data;

import com.ametrinstudios.ametrin.datagen.ExtendedBlockStateProvider;
import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.ametrinstudios.ametrin.AmetrinUtil.isLog;

public class BVBlockStateProvider extends ExtendedBlockStateProvider {
    public BVBlockStateProvider(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.ModID, fileHelper);
    }

    {
        blockStateProviderRules.add((block, name, texture)->{
           if(!name.contains("chiseled_quartz")) {return false;}
           if(block instanceof StairBlock){
               stairsBlock((StairBlock) block, modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block_top"), modBlockLoc("chiseled_quartz_block_top"));
           }else if(block instanceof SlabBlock){
               slabBlock((SlabBlock) block, modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block_top"), modBlockLoc("chiseled_quartz_block_top"));
           }else if(block instanceof WallBlock){
               wallBlock((WallBlock) block, modBlockLoc("chiseled_quartz_block"));
           }else {
               return false;
           }
           return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!(name.contains("smooth_stone") && block instanceof StairBlock)) {return false;}
            stairsBlock((StairBlock) block, modBlockLoc("smooth_stone_slab_side"), modBlockLoc("smooth_stone"), modBlockLoc("smooth_stone"));
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!(BVUtil.isCutSandstone(name) && block instanceof StairBlock)) {return false;}
            ResourceLocation topTexture = modBlockLoc(texture.replace("cut_", "").replace("stairs", "top"));
            stairsBlock((StairBlock) block, modBlockLoc(texture.replace("_stairs", "")), topTexture, topTexture);
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!BVUtil.isBasalt(name)) {return false;}
            if(block instanceof StairBlock){
                ResourceLocation top = modBlockLoc(texture.replace("stairs", "top"));
                stairsBlock((StairBlock) block, modBlockLoc(texture.replace("stairs", "side")), top, top);
            }else if(block instanceof SlabBlock){
                ResourceLocation top = modBlockLoc(texture.replace("slab", "top"));
                slabBlock((SlabBlock) block, modBlockLoc(texture.replace("_slab", "")), modBlockLoc(texture.replace("slab", "side")), top, top);
            }else if(block instanceof WallBlock){
                wallBlock((WallBlock) block, modBlockLoc(texture.replace("wall", "side")));
            }else {
                return false;
            }
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(!isLog(name)) {return false;}
            if(block instanceof StairBlock){
                ResourceLocation top = modBlockLoc(texture.replace("stairs", "top"));
                stairsBlock((StairBlock) block, modBlockLoc(texture.replace("_stairs", "")), top, top);
            }else if(block instanceof SlabBlock){
                ResourceLocation top = modBlockLoc(texture.replace("slab", "top"));
                slabBlock((SlabBlock) block, modBlockLoc(texture.replace("_slab", "")), modBlockLoc(texture.replace("_slab", "")), top, top);
            }else {
                return false;
            }
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(block != BVBlocks.QuartzWall.get()) {return false;}
            wallBlock((WallBlock) block, modBlockLoc(texture.replace("_wall", "_block_top")));
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(block != BVBlocks.SmoothQuartzWall.get()) {return false;}
            wallBlock((WallBlock) block, modBlockLoc(texture.replace("_wall", "_block_bottom").replace("smooth_", "")));
            return true;
        });
        blockStateProviderRules.add((block, name, texture)->{
            if(block != BVBlocks.Purpur_Wall.get()) {return false;}
            wallBlock((WallBlock) block, modBlockLoc(texture.replace("wall", "block")));
            return true;
        });
    }

    @Override
    protected void registerStatesAndModels() {
//        blocks(BVBlocks.getAllBlocks());
        runProviderRules(BVBlocks.getAllBlocks());
    }

    @Override
    protected String getTexture(String name) {
        if(name.contains("wood")) {name = name.replace("wood", "log");}
        if(name.contains("hyphae")) {name = name.replace("hyphae", "stem");}
        return name;
    }

    /*protected  <B extends Block> void blocks(List<B> blocks){
        for(B block : blocks) {
            String textureName = getBlockName(block);
            final String name = getBlockName(block);
            ResourceLocation texture;
            if(textureName.contains("wood")) {textureName = textureName.replace("wood", "log");}
            if(textureName.contains("hyphae")) {textureName = textureName.replace("hyphae", "stem");}

            if(block instanceof StairBlock){
                //if(BVUtil.needsPlanksTexture(name)) {texture = modBlockLoc()(textureName.replace("_stairs", "_planks"));}
                if(AmUtil.shouldAppendS(textureName)) {texture = modBlockLoc(textureName.replace("_stairs", "s"));}
                else if(textureName.contains("chiseled_quartz")) {
                    stairsBlock((StairBlock) block, modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block_top"), modBlockLoc("chiseled_quartz_block_top"));
                    continue;
                }else if(textureName.contains("smooth_stone")) {
                    stairsBlock((StairBlock) block, modBlockLoc("smooth_stone_slab_side"), modBlockLoc("smooth_stone"), modBlockLoc("smooth_stone"));
                    continue;
                }else if(BVUtil.isCutSandstone(textureName)) {
                    texture = modBlockLoc(textureName.replace("cut_", "").replace("stairs", "top"));
                    stairsBlock((StairBlock) block, modBlockLoc(textureName.replace("_stairs", "")), texture, texture);
                    continue;
                }else if(BVUtil.isBasalt(textureName)) {
                    texture = modBlockLoc(textureName.replace("stairs", "top"));
                    stairsBlock((StairBlock) block, modBlockLoc(textureName.replace("stairs", "side")), texture, texture);
                    continue;
                }else if(AmUtil.isLog(name)){
                    texture = modBlockLoc(textureName.replace("stairs", "top"));
                    stairsBlock((StairBlock) block, modBlockLoc(textureName.replace("_stairs", "")), texture, texture);
                    continue;
                }else {texture = modBlockLoc(textureName.replace("_stairs", ""));}
                stairsBlock((StairBlock) block, texture);
            }else if(block instanceof SlabBlock) {
                //if(BVUtil.needsPlanksTexture(name)) {texture = modBlockLoc()(name.replace("_slab", "_planks"));}
                if(AmUtil.shouldAppendS(textureName)) {texture = modBlockLoc(textureName.replace("_slab", "s"));}
                else if(textureName.contains("chiseled_quartz")) {
                    slabBlock((SlabBlock) block, modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block"), modBlockLoc("chiseled_quartz_block_top"), modBlockLoc("chiseled_quartz_block_top"));
                    continue;
                }else if(BVUtil.isBasalt(textureName)) {
                    texture = modBlockLoc(textureName.replace("slab", "top"));
                    slabBlock((SlabBlock) block, modBlockLoc(textureName.replace("_slab", "")), modBlockLoc(textureName.replace("slab", "side")), texture, texture);
                    continue;
                }else if(AmUtil.isLog(name)) {
                    texture = modBlockLoc(textureName.replace("slab", "top"));
                    slabBlock((SlabBlock) block, modBlockLoc(textureName.replace("_slab", "")), modBlockLoc(textureName.replace("_slab", "")), texture, texture);
                    continue;
                }else if(AmUtil.isWood(name)) {
                    slabBlock((SlabBlock) block, modBlockLoc(name.replace("_slab", "")), modBlockLoc(textureName.replace("_slab", "")));
                    continue;
                } else {texture = modBlockLoc(textureName.replace("_slab", ""));}
                slabBlock((SlabBlock) block, texture, texture);
            }else if(block instanceof WallBlock){
                if(Objects.equals(textureName, "quartz_wall")) {texture = modBlockLoc(textureName.replace("_wall", "_block_top"));}
                else if(AmUtil.shouldAppendS(textureName)) {texture = modBlockLoc(textureName.replace("_wall", "s"));}
                else if(BVUtil.shouldAppendBlock(textureName)) {texture = modBlockLoc(textureName.replace("wall", "block"));}
                else if(Objects.equals(textureName, "smooth_quartz_wall")) {texture = modBlockLoc(textureName.replace("_wall", "_block_bottom").replace("smooth_", ""));}
                else if(BVUtil.isBasalt(textureName)) {texture = modBlockLoc(textureName.replace("wall", "side"));}
                else {texture = modBlockLoc(textureName.replace("_wall", ""));}
                wallBlock((WallBlock) block, texture);
            }else if(block instanceof RotatedPillarBlock){
                if(textureName.contains("wood")) {
                    texture = modBlockLoc(textureName.replace("wood", "log"));
                    axisBlock((RotatedPillarBlock)block, texture, texture);
                }else{
                    logBlock((RotatedPillarBlock) block);
                }
            }else if(block instanceof FenceBlock) {
                if(AmUtil.shouldAppendS(textureName)) {texture = modBlockLoc(textureName.replace("_fence", "s"));}
                else {texture = modBlockLoc(textureName.replace("_fence", "_planks"));}
                fenceBlock((FenceBlock) block, texture);
            }else if(block instanceof FenceGateBlock){
                if(AmUtil.shouldAppendS(textureName)) {texture = modBlockLoc(textureName.replace("_fence_gate", "s"));}
                else {texture = modBlockLoc(textureName.replace("_fence_gate", "_planks"));}
                fenceGateBlock((FenceGateBlock) block, texture);
            }else if(block instanceof ButtonBlock){
                buttonBlock((ButtonBlock) block, modBlockLoc(textureName.replace("_button", "_planks")));
            }else if(block instanceof PressurePlateBlock){
                pressurePlateBlock((PressurePlateBlock) block, modBlockLoc(textureName.replace("_pressure_plate", "_planks")));
            }else{
                simpleBlock(block);
            }
        }
    }*/

    @Override
    protected ResourceLocation modBlockLoc(String key) {
        return mcLoc("block/" + key);
    }
}