package com.barion.block_variants.data;

import com.ametrinstudios.ametrin.datagen.ExtendedLootTableProvider;
import com.barion.block_variants.BVBlocks;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Map;

public class BVLootTableProvider extends ExtendedLootTableProvider {
    private static List<SubProviderEntry> tables;

    public BVLootTableProvider(PackOutput packOutput) {
        super(packOutput, BlockVariants.ModID, null);
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

    public class ModBlockLootTableProvider extends ExtendedBlockLootSubProvider {
        @Override
        protected void generate() {dropSelf(BVBlocks.getAllBlocks());}

        @Override @Nonnull
        protected Iterable<Block> getKnownBlocks() {return BVBlocks.BlockRegistry.getEntries().stream().map(RegistryObject::get).toList();}
    }
}