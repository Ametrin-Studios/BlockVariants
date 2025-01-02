package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedModelProvider;
import com.barion.block_variants.BlockVariants;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

public final class BVModelProvider extends ExtendedModelProvider {
    public BVModelProvider(PackOutput output) {
        super(output, BlockVariants.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {

    }
}
