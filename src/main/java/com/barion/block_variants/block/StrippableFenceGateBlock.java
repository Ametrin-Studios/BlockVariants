package com.barion.block_variants.block;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public class StrippableFenceGateBlock extends FenceGateBlock {
    private final Supplier<FenceGateBlock> stripResult;

    public StrippableFenceGateBlock(Supplier<FenceGateBlock> stripResult, WoodType type, Properties properties) {
        super(type, properties);
        this.stripResult = stripResult;
    }

    @Override @ParametersAreNonnullByDefault
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if(itemAbility == ItemAbilities.AXE_STRIP) {
            return stripResult.get().withPropertiesOf(state);
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}