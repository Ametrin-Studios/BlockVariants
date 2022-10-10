package com.barion.block_variants.data;

import com.barion.block_variants.BVBlocks;
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
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BVLootTableProvider extends LootTableProvider {
    public BVLootTableProvider(DataGenerator generator) {super(generator);}


    @Override @Nonnull
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(Pair.of(ModBlockLootTables::new, LootContextParamSets.BLOCK));
    }

    @Override @ParametersAreNonnullByDefault
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
        map.forEach((resourceLocation, lootTable) -> LootTables.validate(validationContext, resourceLocation, lootTable));
    }

    public static class ModBlockLootTables extends BlockLoot {
        @Override
        protected void addTables() {dropSelf(BVBlocks.getAllBlocks());}

        private <T extends Block> void dropSelf(Iterator<T> blocks){
            blocks.forEachRemaining(this::dropSelf);
        }

        @Override @Nonnull
        protected Iterable<Block> getKnownBlocks() {
            return BVBlocks.BlockRegistry.getEntries().stream().map(RegistryObject::get).toList();
        }
    }
}