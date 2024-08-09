package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedItemModelProvider;
import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBlocks;
import com.barion.block_variants.registry.BVItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Iterator;
import java.util.Objects;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWood;
import static com.ametrinstudios.ametrin.data.DataProviderExtensions.shouldAppendS;
import static com.barion.block_variants.BVUtil.getBlockName;

public final class BVItemModelProvider extends ExtendedItemModelProvider {
    public BVItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, BlockVariants.MOD_ID, existingFileHelper);
    }

    {
        excludedClasses.add(BlockItem.class);
    }

    @Override
    protected void registerModels() {
       runProviderRules(BVItems.REGISTER);
       blocks(BVBlocks.getAllBlocks());
    }

    private <B extends Block> void blocks(Iterator<B> blocks){
        while(blocks.hasNext()) {
            var block = blocks.next();
            String textureName = getBlockName(block);
            String name = getBlockName(block);
            ResourceLocation texture;
            if(textureName.contains("wood")) {textureName = textureName.replace("wood", "log");}
            if(textureName.contains("hyphae")) {textureName = textureName.replace("hyphae", "stem");}

            switch (block) {
                case WallBlock wallBlock -> {
                    if (Objects.equals(textureName, "quartz_wall")) {
                        texture = blockTexture(textureName.replace("_wall", "_block_top"));
                    } else if (shouldAppendS(textureName)) {
                        texture = blockTexture(textureName.replace("_wall", "s"));
                    } else if (BVUtil.shouldAppendBlock(textureName)) {
                        texture = blockTexture(textureName.replace("wall", "block"));
                    } else if (Objects.equals(textureName, "smooth_quartz_wall")) {
                        texture = blockTexture(textureName.replace("_wall", "_block_bottom").replace("smooth_", ""));
                    } else if (BVUtil.isBasalt(textureName)) {
                        texture = blockTexture(textureName.replace("wall", "side"));
                    } else {
                        texture = blockTexture(textureName.replace("_wall", ""));
                    }
                    wallInventory(name, texture);
                }
                case FenceBlock fenceBlock -> {
                    if (shouldAppendS(textureName)) {
                        texture = blockTexture(textureName.replace("_fence", "s"));
                    } else if (isWood(name) || name.contains("bamboo")) {
                        texture = blockTexture(textureName.replace("_fence", ""));
                    } else {
                        texture = blockTexture(textureName.replace("_fence", "_planks"));
                    }
                    fenceInventory(name, texture);
                }
                case FenceGateBlock fenceGateBlock -> {
                    if (shouldAppendS(textureName)) {
                        texture = blockTexture(textureName.replace("_fence_gate", "s"));
                    } else if (isWood(name) || name.contains("bamboo")) {
                        texture = blockTexture(textureName.replace("_fence_gate", ""));
                    } else {
                        texture = blockTexture(textureName.replace("_fence_gate", "_planks"));
                    }
                    fenceGate(name, texture);
                }
                case null, default -> withExistingParent(name, modBlockLoc(name));
            }
        }
    }

    private ResourceLocation blockTexture(String texture) {return mcLoc("block/" + texture);}
}