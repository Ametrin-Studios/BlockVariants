package com.barion.block_variants.data;

import com.barion.block_variants.Registration;
import com.barion.block_variants.stuff.ModBlocks;
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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTables extends LootTableProvider {
    public ModLootTables(DataGenerator generator) {super(generator);}


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
            dropSelf(ModBlocks.Polished_Granite_Wall.get(),
                    ModBlocks.Polished_Diorite_Wall.get(),
                    ModBlocks.Polished_Andesite_Wall.get(),
                    ModBlocks.Stone_Wall.get(),
                    ModBlocks.Smooth_Stone_Stairs.get(),
                    ModBlocks.Smooth_Stone_Wall.get(),
                    ModBlocks.Cut_Sandstone_Stairs.get(),
                    ModBlocks.Cut_Sandstone_Wall.get(),
                    ModBlocks.Cut_Red_Sandstone_Stairs.get(),
                    ModBlocks.Cut_Red_Sandstone_Wall.get(),
                    ModBlocks.Quartz_Wall.get(),
                    ModBlocks.Quartz_Bricks_Stairs.get(),
                    ModBlocks.Quartz_Bricks_Slab.get(),
                    ModBlocks.Quartz_Bricks_Wall.get(),
                    ModBlocks.Smooth_Quartz_Wall.get(),
                    ModBlocks.Chiseled_Quartz_Block_Stairs.get(),
                    ModBlocks.Chiseled_Quartz_Block_Slab.get(),
                    ModBlocks.Chiseled_Quartz_Block_Wall.get(),
                    ModBlocks.Prismarine_Bricks_Wall.get(),
                    ModBlocks.Dark_Prismarine_Wall.get(),
                    ModBlocks.Netherrack_Stairs.get(),
                    ModBlocks.Netherrack_Slab.get(),
                    ModBlocks.Netherrack_Wall.get(),
                    ModBlocks.End_Stone_Stairs.get(),
                    ModBlocks.End_Stone_Slab.get(),
                    ModBlocks.End_Stone_Wall.get(),
                    ModBlocks.Cracked_Polished_Blackstone_Brick_Stairs.get(),
                    ModBlocks.Cracked_Polished_Blackstone_Brick_Slab.get(),
                    ModBlocks.Cracked_Polished_Blackstone_Brick_Wall.get(),
                    ModBlocks.Basalt_Stairs.get(),
                    ModBlocks.Basalt_Slab.get(),
                    ModBlocks.Basalt_Wall.get(),
                    ModBlocks.Polished_Basalt_Stairs.get(),
                    ModBlocks.Polished_Basalt_Slab.get(),
                    ModBlocks.Polished_Basalt_Wall.get(),
                    ModBlocks.Terracotta_Stairs.get(),
                    ModBlocks.Terracotta_Slab.get(),
                    ModBlocks.Terracotta_Wall.get(),
                    ModBlocks.White_Terracotta_Stairs.get(),
                    ModBlocks.White_Terracotta_Slab.get(),
                    ModBlocks.White_Terracotta_Wall.get(),
                    ModBlocks.Orange_Terracotta_Stairs.get(),
                    ModBlocks.Orange_Terracotta_Slab.get(),
                    ModBlocks.Orange_Terracotta_Wall.get(),
                    ModBlocks.Magenta_Terracotta_Stairs.get(),
                    ModBlocks.Magenta_Terracotta_Slab.get(),
                    ModBlocks.Magenta_Terracotta_Wall.get(),
                    ModBlocks.Light_Blue_Terracotta_Stairs.get(),
                    ModBlocks.Light_Blue_Terracotta_Slab.get(),
                    ModBlocks.Light_Blue_Terracotta_Wall.get(),
                    ModBlocks.Yellow_Terracotta_Stairs.get(),
                    ModBlocks.Yellow_Terracotta_Slab.get(),
                    ModBlocks.Yellow_Terracotta_Wall.get(),
                    ModBlocks.Lime_Terracotta_Stairs.get(),
                    ModBlocks.Lime_Terracotta_Slab.get(),
                    ModBlocks.Lime_Terracotta_Wall.get(),
                    ModBlocks.Pink_Terracotta_Stairs.get(),
                    ModBlocks.Pink_Terracotta_Slab.get(),
                    ModBlocks.Pink_Terracotta_Wall.get(),
                    ModBlocks.Gray_Terracotta_Stairs.get(),
                    ModBlocks.Gray_Terracotta_Slab.get(),
                    ModBlocks.Gray_Terracotta_Wall.get(),
                    ModBlocks.Light_Gray_Terracotta_Stairs.get(),
                    ModBlocks.Light_Gray_Terracotta_Slab.get(),
                    ModBlocks.Light_Gray_Terracotta_Wall.get(),
                    ModBlocks.Cyan_Terracotta_Stairs.get(),
                    ModBlocks.Cyan_Terracotta_Slab.get(),
                    ModBlocks.Cyan_Terracotta_Wall.get(),
                    ModBlocks.Purple_Terracotta_Stairs.get(),
                    ModBlocks.Purple_Terracotta_Slab.get(),
                    ModBlocks.Purple_Terracotta_Wall.get(),
                    ModBlocks.Blue_Terracotta_Stairs.get(),
                    ModBlocks.Blue_Terracotta_Slab.get(),
                    ModBlocks.Blue_Terracotta_Wall.get(),
                    ModBlocks.Brown_Terracotta_Stairs.get(),
                    ModBlocks.Brown_Terracotta_Slab.get(),
                    ModBlocks.Brown_Terracotta_Wall.get(),
                    ModBlocks.Green_Terracotta_Stairs.get(),
                    ModBlocks.Green_Terracotta_Slab.get(),
                    ModBlocks.Green_Terracotta_Wall.get(),
                    ModBlocks.Red_Terracotta_Stairs.get(),
                    ModBlocks.Red_Terracotta_Slab.get(),
                    ModBlocks.Red_Terracotta_Wall.get(),
                    ModBlocks.Black_Terracotta_Stairs.get(),
                    ModBlocks.Black_Terracotta_Slab.get(),
                    ModBlocks.Black_Terracotta_Wall.get(),
                    ModBlocks.Dripstone_Block_Stairs.get(),
                    ModBlocks.Dripstone_Block_Slab.get(),
                    ModBlocks.Dripstone_Block_Wall.get(),
                    ModBlocks.Amethyst_Block_Stairs.get(),
                    ModBlocks.Amethyst_Block_Slab.get(),
                    ModBlocks.Amethyst_Block_Wall.get(),
                    ModBlocks.Cracked_Stone_Brick_Stairs.get(),
                    ModBlocks.Cracked_Stone_Brick_Slab.get(),
                    ModBlocks.Cracked_Stone_Brick_Wall.get(),
                    ModBlocks.Oak_Log_Stairs.get(),
                    ModBlocks.Oak_Log_Slab.get(),
                    ModBlocks.Spruce_Log_Stairs.get(),
                    ModBlocks.Spruce_Log_Slab.get(),
                    ModBlocks.Birch_Log_Stairs.get(),
                    ModBlocks.Birch_Log_Slab.get(),
                    ModBlocks.Jungle_Log_Stairs.get(),
                    ModBlocks.Jungle_Log_Slab.get(),
                    ModBlocks.Acacia_Log_Stairs.get(),
                    ModBlocks.Acacia_Log_Slab.get(),
                    ModBlocks.Dark_Oak_Log_Stairs.get(),
                    ModBlocks.Dark_Oak_Log_Slab.get(),
                    ModBlocks.Stripped_Oak_Log_Stairs.get(),
                    ModBlocks.Stripped_Oak_Log_Slab.get(),
                    ModBlocks.Stripped_Spruce_Log_Stairs.get(),
                    ModBlocks.Stripped_Spruce_Log_Slab.get(),
                    ModBlocks.Stripped_Birch_Log_Stairs.get(),
                    ModBlocks.Stripped_Birch_Log_Slab.get(),
                    ModBlocks.Stripped_Jungle_Log_Stairs.get(),
                    ModBlocks.Stripped_Jungle_Log_Slab.get(),
                    ModBlocks.Stripped_Acacia_Log_Stairs.get(),
                    ModBlocks.Stripped_Acacia_Log_Slab.get(),
                    ModBlocks.Stripped_Dark_Oak_Log_Stairs.get(),
                    ModBlocks.Stripped_Dark_Oak_Log_Slab.get(),
                    ModBlocks.Crimson_Stem_Stairs.get(),
                    ModBlocks.Crimson_Stem_Slab.get(),
                    ModBlocks.Warped_Stem_Stairs.get(),
                    ModBlocks.Warped_Stem_Slab.get(),
                    ModBlocks.Stripped_Crimson_Stem_Stairs.get(),
                    ModBlocks.Stripped_Crimson_Stem_Slab.get(),
                    ModBlocks.Stripped_Warped_Stem_Stairs.get(),
                    ModBlocks.Stripped_Warped_Stem_Slab.get());
        }

        private <T extends Block> void dropSelf(T... Blocks){
            for (Block Block : Blocks){
                dropSelf(Block);
            }
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.Blocks.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}