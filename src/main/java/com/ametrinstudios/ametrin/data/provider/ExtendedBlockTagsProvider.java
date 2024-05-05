package com.ametrinstudios.ametrin.data.provider;

import com.ametrinstudios.ametrin.data.BlockTagProviderRule;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import static com.ametrinstudios.ametrin.data.DataProviderExtensions.getBlockName;
import static com.ametrinstudios.ametrin.data.DataProviderExtensions.isWooden;

public abstract class ExtendedBlockTagsProvider extends BlockTagsProvider {
    public ArrayList<Block> excludedBlocks = new ArrayList<>();
    public ArrayList<BlockTagProviderRule> blockTagProviderRules = new ArrayList<>();

    public ExtendedBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String modID, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, registries, modID, existingFileHelper);
    }

    protected void runRules(DeferredRegister.Blocks blockRegistry){
        runRules(blockRegistry.getEntries().stream().map(Supplier::get).iterator());
    }

    protected void runRules(Iterator<? extends Block> blocks){
        blocks.forEachRemaining(block -> {
            if(excludedBlocks.contains(block)) {return;}
            final String name = getBlockName(block);

            for(BlockTagProviderRule provider : blockTagProviderRules){
                provider.generate(block, name);
            }

            if(block instanceof StairBlock){
                if(isWooden(name)){
                    tag(BlockTags.WOODEN_STAIRS).add(block);
                } else {
                    tag(BlockTags.STAIRS).add(block);
                }
            }
            if(block instanceof SlabBlock){
                if(isWooden(name)){
                    tag(BlockTags.WOODEN_SLABS).add(block);
                } else {
                    tag(BlockTags.SLABS).add(block);
                }
            }
            if(block instanceof WallBlock) {
                tag(BlockTags.WALLS).add(block);
            }
            if(block instanceof FenceBlock){
                if(isWooden(name)){
                    tag(BlockTags.WOODEN_FENCES).add(block);
                    tag(Tags.Blocks.FENCES_WOODEN).add(block);
                } else {
                    tag(BlockTags.FENCES).add(block);
                    tag(Tags.Blocks.FENCES).add(block);
                }
            }
            if(block instanceof FenceGateBlock){
                if(isWooden(name)){
                    tag(Tags.Blocks.FENCE_GATES_WOODEN).add(block);
                } else {
                    tag(BlockTags.FENCE_GATES).add(block);
                    tag(Tags.Blocks.FENCE_GATES).add(block);
                }
            }
            if(block instanceof ButtonBlock){
                if(isWooden(name)){
                    tag(BlockTags.WOODEN_BUTTONS).add(block);
                } else{
                    tag(BlockTags.BUTTONS).add(block);
                }
            }
            if(block instanceof PressurePlateBlock){
                if(isWooden(name)){
                    tag(BlockTags.WOODEN_PRESSURE_PLATES).add(block);
                } else{
                    tag(BlockTags.STONE_PRESSURE_PLATES).add(block);
                }
            }
            if(block instanceof DoorBlock){
                if(isWooden(name)){
                    tag(BlockTags.WOODEN_DOORS).add(block);
                } else{
                    tag(BlockTags.DOORS).add(block);
                }
            }
            if(block instanceof TrapDoorBlock){
                if(isWooden(name)){
                    tag(BlockTags.WOODEN_TRAPDOORS).add(block);
                } else{
                    tag(BlockTags.TRAPDOORS).add(block);
                }
            }
            if(block instanceof FlowerPotBlock){
                tag(BlockTags.FLOWER_POTS).add(block);
            }
            if(block instanceof LeavesBlock){
                tag(BlockTags.LEAVES).add(block);
            }
            if(block instanceof SaplingBlock){
                tag(BlockTags.SAPLINGS).add(block);
            }
            if(block instanceof FireBlock){
                tag(BlockTags.FIRE).add(block);
            }
            if(block instanceof FlowerBlock){
                tag(BlockTags.SMALL_FLOWERS).add(block);
            }
            if(block instanceof CampfireBlock){
                tag(BlockTags.CAMPFIRES).add(block);
            }
            if(name.contains("planks")){
                tag(BlockTags.PLANKS).add(block);
            }
            if(block instanceof StandingSignBlock){
                tag(BlockTags.STANDING_SIGNS).add(block);
            }
            if(block instanceof WallSignBlock){
                tag(BlockTags.WALL_SIGNS).add(block);
            }
            if(block instanceof CeilingHangingSignBlock){
                tag(BlockTags.CEILING_HANGING_SIGNS).add(block);
            }
            if(block instanceof WallHangingSignBlock){
                tag(BlockTags.WALL_HANGING_SIGNS).add(block);
            }
            if(block instanceof CauldronBlock){
                tag(BlockTags.CAULDRONS).add(block);
            }
            if(block.defaultBlockState().canBeReplaced()){
                tag(BlockTags.REPLACEABLE).add(block);
            }
        });
    }

    @SafeVarargs
    protected final void tag(ResourceKey<Block> block, TagKey<Block>... tags){
        for(TagKey<Block> key : tags){
            tag(key).add(block);
        }
    }
}