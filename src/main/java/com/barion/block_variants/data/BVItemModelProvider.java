package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Iterator;
import java.util.Objects;

public class BVItemModelProvider extends ItemModelProvider {
    public BVItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper){
        super(generator, BlockVariants.ModID, fileHelper);
    }

    @Override
    protected void registerModels() {
       blocks(BVBlocks.getAllBlocks());
    }

    protected  <B extends Block> void blocks(Iterator<B> blocks){
        while (blocks.hasNext()) {
            B block = blocks.next();
            String name = getName(block);
            ResourceLocation texture;
            if(name.contains("wood")) {name = name.replace("wood", "log");}
            if(name.contains("hyphae")) {name = name.replace("hyphae", "stem");}

            if(block instanceof WallBlock){
                if(Objects.equals(name, "quartz_wall")) {texture = mcBlockLoc(name.replace("_wall", "_block_top"));}
                else if(BVUtil.shouldAppendS(name)) {texture = mcBlockLoc(name.replace("_wall", "s"));}
                else if(BVUtil.shouldAppendBlock(name)) {texture = mcBlockLoc(name.replace("wall", "block"));}
                else if(Objects.equals(name, "smooth_quartz_wall")) {texture = mcBlockLoc(name.replace("_wall", "_block_bottom").replace("smooth_", ""));}
                else if(BVUtil.isBasalt(name)) {texture = mcBlockLoc(name.replace("wall", "side"));}
                else {texture = mcBlockLoc(name.replace("_wall", ""));}
                wallInventory(getName(block), texture);
            }else if(block instanceof FenceBlock) {
                if(BVUtil.shouldAppendS(name)) {texture = mcBlockLoc(name.replace("_fence", "s"));}
                else {texture = mcBlockLoc(name.replace("_fence", ""));}
                fenceInventory(getName(block), texture);
            }else if(block instanceof FenceGateBlock){
                if(BVUtil.shouldAppendS(name)) {texture = mcBlockLoc(name.replace("_fence_gate", "s"));}
                else {texture = mcBlockLoc(name.replace("_fence_gate", ""));}
                fenceGate(getName(block), texture);
            }else{
                withExistingParent(getName(block), modBlockLoc(name));
            }
        }
    }

    protected ResourceLocation mcBlockLoc(String texture) {return mcLoc("block/" + texture);}
    protected ResourceLocation modBlockLoc(String texture) {return modLoc("block/" + texture);}
    protected String getName(Block block) {return Objects.requireNonNull(block.getRegistryName()).getPath();}
}