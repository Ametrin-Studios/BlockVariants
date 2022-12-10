package com.barion.block_variants.data;

import com.ametrinstudios.ametrin.datagen.ExtendedLootTableProvider;
import com.barion.block_variants.BVBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BVLootTableProvider extends ExtendedLootTableProvider {
    private static List<SubProviderEntry> tables;

    public BVLootTableProvider(PackOutput packOutput) {
        super(packOutput);
        tables = List.of(new SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK));
    }

    @Override @ParametersAreNonnullByDefault
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
        map.forEach((resourceLocation, lootTable) -> LootTables.validate(validationContext, resourceLocation, lootTable));
    }

    @Override
    public @NotNull List<SubProviderEntry> getTables() {
        return tables;
    }

    public static class ModBlockLootTableProvider extends BlockLootSubProvider {

        protected ModBlockLootTableProvider() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        private <T extends Block> void dropSelf(Iterator<T> blocks) {
            blocks.forEachRemaining(this::dropSelf);
        }

        @Override
        protected void generate() {dropSelf(BVBlocks.getAllBlocks());}

        @Override @Nonnull
        protected Iterable<Block> getKnownBlocks() {return BVBlocks.BlockRegistry.getEntries().stream().map(RegistryObject::get).toList();}
    }
}