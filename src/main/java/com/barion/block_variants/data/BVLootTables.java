package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BVRegister;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BVLootTables extends LootTableProvider {
    public BVLootTables(DataGenerator generator) {super(generator);}


    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(Pair.of(ModBlockLootTables::new, LootContextParamSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
        map.forEach((p_218436_2_, p_218436_3_) -> LootTables.validate(validationContext, p_218436_2_, p_218436_3_));
    }

    public static class ModBlockLootTables extends BlockLoot {
        @Override
        protected void addTables() {
            dropSelf(BVBlocks.Polished_Granite_Wall.get(),
                    BVBlocks.Polished_Diorite_Wall.get(),
                    BVBlocks.Polished_Andesite_Wall.get(),
                    BVBlocks.Stone_Wall.get(),
                    BVBlocks.Smooth_Stone_Stairs.get(),
                    BVBlocks.Smooth_Stone_Wall.get(),
                    BVBlocks.Cut_Sandstone_Stairs.get(),
                    BVBlocks.Cut_Sandstone_Wall.get(),
                    BVBlocks.Cut_Red_Sandstone_Stairs.get(),
                    BVBlocks.Cut_Red_Sandstone_Wall.get(),
                    BVBlocks.Quartz_Wall.get(),
                    BVBlocks.Quartz_Bricks_Stairs.get(),
                    BVBlocks.Quartz_Bricks_Slab.get(),
                    BVBlocks.Quartz_Bricks_Wall.get(),
                    BVBlocks.Smooth_Quartz_Wall.get(),
                    BVBlocks.Chiseled_Quartz_Block_Stairs.get(),
                    BVBlocks.Chiseled_Quartz_Block_Slab.get(),
                    BVBlocks.Chiseled_Quartz_Block_Wall.get(),
                    BVBlocks.Prismarine_Bricks_Wall.get(),
                    BVBlocks.Dark_Prismarine_Wall.get(),
                    BVBlocks.Netherrack_Stairs.get(),
                    BVBlocks.Netherrack_Slab.get(),
                    BVBlocks.Netherrack_Wall.get(),
                    BVBlocks.End_Stone_Stairs.get(),
                    BVBlocks.End_Stone_Slab.get(),
                    BVBlocks.End_Stone_Wall.get(),
                    BVBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get(),
                    BVBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(),
                    BVBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(),
                    BVBlocks.Basalt_Stairs.get(),
                    BVBlocks.Basalt_Slab.get(),
                    BVBlocks.Basalt_Wall.get(),
                    BVBlocks.Polished_Basalt_Stairs.get(),
                    BVBlocks.Polished_Basalt_Slab.get(),
                    BVBlocks.Polished_Basalt_Wall.get(),
                    BVBlocks.Terracotta_Stairs.get(),
                    BVBlocks.Terracotta_Slab.get(),
                    BVBlocks.Terracotta_Wall.get(),
                    BVBlocks.White_Terracotta_Stairs.get(),
                    BVBlocks.White_Terracotta_Slab.get(),
                    BVBlocks.White_Terracotta_Wall.get(),
                    BVBlocks.Orange_Terracotta_Stairs.get(),
                    BVBlocks.Orange_Terracotta_Slab.get(),
                    BVBlocks.Orange_Terracotta_Wall.get(),
                    BVBlocks.Magenta_Terracotta_Stairs.get(),
                    BVBlocks.Magenta_Terracotta_Slab.get(),
                    BVBlocks.Magenta_Terracotta_Wall.get(),
                    BVBlocks.Light_Blue_Terracotta_Stairs.get(),
                    BVBlocks.Light_Blue_Terracotta_Slab.get(),
                    BVBlocks.Light_Blue_Terracotta_Wall.get(),
                    BVBlocks.Yellow_Terracotta_Stairs.get(),
                    BVBlocks.Yellow_Terracotta_Slab.get(),
                    BVBlocks.Yellow_Terracotta_Wall.get(),
                    BVBlocks.Lime_Terracotta_Stairs.get(),
                    BVBlocks.Lime_Terracotta_Slab.get(),
                    BVBlocks.Lime_Terracotta_Wall.get(),
                    BVBlocks.Pink_Terracotta_Stairs.get(),
                    BVBlocks.Pink_Terracotta_Slab.get(),
                    BVBlocks.Pink_Terracotta_Wall.get(),
                    BVBlocks.Gray_Terracotta_Stairs.get(),
                    BVBlocks.Gray_Terracotta_Slab.get(),
                    BVBlocks.Gray_Terracotta_Wall.get(),
                    BVBlocks.Light_Gray_Terracotta_Stairs.get(),
                    BVBlocks.Light_Gray_Terracotta_Slab.get(),
                    BVBlocks.Light_Gray_Terracotta_Wall.get(),
                    BVBlocks.Cyan_Terracotta_Stairs.get(),
                    BVBlocks.Cyan_Terracotta_Slab.get(),
                    BVBlocks.Cyan_Terracotta_Wall.get(),
                    BVBlocks.Purple_Terracotta_Stairs.get(),
                    BVBlocks.Purple_Terracotta_Slab.get(),
                    BVBlocks.Purple_Terracotta_Wall.get(),
                    BVBlocks.Blue_Terracotta_Stairs.get(),
                    BVBlocks.Blue_Terracotta_Slab.get(),
                    BVBlocks.Blue_Terracotta_Wall.get(),
                    BVBlocks.Brown_Terracotta_Stairs.get(),
                    BVBlocks.Brown_Terracotta_Slab.get(),
                    BVBlocks.Brown_Terracotta_Wall.get(),
                    BVBlocks.Green_Terracotta_Stairs.get(),
                    BVBlocks.Green_Terracotta_Slab.get(),
                    BVBlocks.Green_Terracotta_Wall.get(),
                    BVBlocks.Red_Terracotta_Stairs.get(),
                    BVBlocks.Red_Terracotta_Slab.get(),
                    BVBlocks.Red_Terracotta_Wall.get(),
                    BVBlocks.Black_Terracotta_Stairs.get(),
                    BVBlocks.Black_Terracotta_Slab.get(),
                    BVBlocks.Black_Terracotta_Wall.get(),
                    BVBlocks.Dripstone_Block_Stairs.get(),
                    BVBlocks.Dripstone_Block_Slab.get(),
                    BVBlocks.Dripstone_Block_Wall.get(),
                    BVBlocks.Amethyst_Block_Stairs.get(),
                    BVBlocks.Amethyst_Block_Slab.get(),
                    BVBlocks.Amethyst_Block_Wall.get(),
                    BVBlocks.Cracked_Stone_Brick_Stairs.get(),
                    BVBlocks.Cracked_Stone_Brick_Slab.get(),
                    BVBlocks.Cracked_Stone_Brick_Wall.get(),
                    BVBlocks.Oak_Log_Stairs.get(),
                    BVBlocks.Oak_Log_Slab.get(),
                    BVBlocks.Spruce_Log_Stairs.get(),
                    BVBlocks.Spruce_Log_Slab.get(),
                    BVBlocks.Birch_Log_Stairs.get(),
                    BVBlocks.Birch_Log_Slab.get(),
                    BVBlocks.Jungle_Log_Stairs.get(),
                    BVBlocks.Jungle_Log_Slab.get(),
                    BVBlocks.Acacia_Log_Stairs.get(),
                    BVBlocks.Acacia_Log_Slab.get(),
                    BVBlocks.Dark_Oak_Log_Stairs.get(),
                    BVBlocks.Dark_Oak_Log_Slab.get(),
                    BVBlocks.Stripped_Oak_Log_Stairs.get(),
                    BVBlocks.Stripped_Oak_Log_Slab.get(),
                    BVBlocks.Stripped_Spruce_Log_Stairs.get(),
                    BVBlocks.Stripped_Spruce_Log_Slab.get(),
                    BVBlocks.Stripped_Birch_Log_Stairs.get(),
                    BVBlocks.Stripped_Birch_Log_Slab.get(),
                    BVBlocks.Stripped_Jungle_Log_Stairs.get(),
                    BVBlocks.Stripped_Jungle_Log_Slab.get(),
                    BVBlocks.Stripped_Acacia_Log_Stairs.get(),
                    BVBlocks.Stripped_Acacia_Log_Slab.get(),
                    BVBlocks.Stripped_Dark_Oak_Log_Stairs.get(),
                    BVBlocks.Stripped_Dark_Oak_Log_Slab.get(),
                    BVBlocks.Crimson_Stem_Stairs.get(),
                    BVBlocks.Crimson_Stem_Slab.get(),
                    BVBlocks.Warped_Stem_Stairs.get(),
                    BVBlocks.Warped_Stem_Slab.get(),
                    BVBlocks.Stripped_Crimson_Stem_Stairs.get(),
                    BVBlocks.Stripped_Crimson_Stem_Slab.get(),
                    BVBlocks.Stripped_Warped_Stem_Stairs.get(),
                    BVBlocks.Stripped_Warped_Stem_Slab.get(),
                    BVBlocks.Oak_Wood_Stairs.get(),
                    BVBlocks.Oak_Wood_Slab.get(),
                    BVBlocks.Oak_Wood_Wall.get(),
                    BVBlocks.Spruce_Wood_Stairs.get(),
                    BVBlocks.Spruce_Wood_Slab.get(),
                    BVBlocks.Spruce_Wood_Wall.get(),
                    BVBlocks.Birch_Wood_Stairs.get(),
                    BVBlocks.Birch_Wood_Slab.get(),
                    BVBlocks.Birch_Wood_Wall.get(),
                    BVBlocks.Jungle_Wood_Stairs.get(),
                    BVBlocks.Jungle_Wood_Slab.get(),
                    BVBlocks.Jungle_Wood_Wall.get(),
                    BVBlocks.Acacia_Wood_Stairs.get(),
                    BVBlocks.Acacia_Wood_Slab.get(),
                    BVBlocks.Acacia_Wood_Wall.get(),
                    BVBlocks.Dark_Oak_Wood_Stairs.get(),
                    BVBlocks.Dark_Oak_Wood_Slab.get(),
                    BVBlocks.Dark_Oak_Wood_Wall.get(),
                    BVBlocks.Stripped_Oak_Wood_Stairs.get(),
                    BVBlocks.Stripped_Oak_Wood_Slab.get(),
                    BVBlocks.Stripped_Oak_Wood_Wall.get(),
                    BVBlocks.Stripped_Spruce_Wood_Stairs.get(),
                    BVBlocks.Stripped_Spruce_Wood_Slab.get(),
                    BVBlocks.Stripped_Spruce_Wood_Wall.get(),
                    BVBlocks.Stripped_Birch_Wood_Stairs.get(),
                    BVBlocks.Stripped_Birch_Wood_Slab.get(),
                    BVBlocks.Stripped_Birch_Wood_Wall.get(),
                    BVBlocks.Stripped_Jungle_Wood_Stairs.get(),
                    BVBlocks.Stripped_Jungle_Wood_Slab.get(),
                    BVBlocks.Stripped_Jungle_Wood_Wall.get(),
                    BVBlocks.Stripped_Acacia_Wood_Stairs.get(),
                    BVBlocks.Stripped_Acacia_Wood_Slab.get(),
                    BVBlocks.Stripped_Acacia_Wood_Wall.get(),
                    BVBlocks.Stripped_Dark_Oak_Wood_Stairs.get(),
                    BVBlocks.Stripped_Dark_Oak_Wood_Slab.get(),
                    BVBlocks.Stripped_Dark_Oak_Wood_Wall.get(),

                    BVBlocks.Crimson_Hyphae_Stairs.get(),
                    BVBlocks.Crimson_Hyphae_Slab.get(),
                    BVBlocks.Crimson_Hyphae_Wall.get(),
                    BVBlocks.Warped_Hyphae_Stairs.get(),
                    BVBlocks.Warped_Hyphae_Slab.get(),
                    BVBlocks.Warped_Hyphae_Wall.get(),
                    BVBlocks.Stripped_Crimson_Hyphae_Stairs.get(),
                    BVBlocks.Stripped_Crimson_Hyphae_Slab.get(),
                    BVBlocks.Stripped_Crimson_Hyphae_Wall.get(),
                    BVBlocks.Stripped_Warped_Hyphae_Stairs.get(),
                    BVBlocks.Stripped_Warped_Hyphae_Slab.get(),
                    BVBlocks.Stripped_Warped_Hyphae_Wall.get(),

                    BVBlocks.Calcite_Stairs.get(),
                    BVBlocks.Calcite_Slab.get(),
                    BVBlocks.Calcite_Wall.get(),
                    BVBlocks.Smooth_Basalt_Stairs.get(),
                    BVBlocks.Smooth_Basalt_Slab.get(),
                    BVBlocks.Smooth_Basalt_Wall.get(),
                    BVBlocks.Tuff_Stairs.get(),
                    BVBlocks.Tuff_Slab.get(),
                    BVBlocks.Tuff_Wall.get());
        }

        @SafeVarargs
        private <T extends Block> void dropSelf(T... Blocks){
            for (Block Block : Blocks){
                dropSelf(Block);
            }
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return BVRegister.Blocks.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}