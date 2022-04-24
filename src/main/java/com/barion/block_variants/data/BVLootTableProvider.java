package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BVLootTableProvider extends LootTableProvider {
    public BVLootTableProvider(DataGenerator generator) {super(generator);}

    @Override @Nonnull
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(Pair.of(BVBlockLootTables::new, LootParameterSets.BLOCK));
    }

    @Override @ParametersAreNonnullByDefault
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationContext) {
        map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validate(validationContext, p_218436_2_, p_218436_3_));
    }

    public static class BVBlockLootTables extends BlockLootTables {
        @Override
        protected void addTables() {dropSelf(BVBlocks.getAllBlocks());}

        private <T extends Block> void dropSelf(List<T> Blocks){
            for (Block Block : Blocks) {
                dropSelf(Block);
            }
        }

        @Override @Nonnull
        protected Iterable<Block> getKnownBlocks() {
            return BVBlocks.BlockRegistry.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}