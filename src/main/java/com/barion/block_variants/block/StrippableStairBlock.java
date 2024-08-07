package com.barion.block_variants.block;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public class StrippableStairBlock extends StairBlock {
    private final Supplier<StairBlock> stripResult;

    public StrippableStairBlock(Supplier<StairBlock> stripResult, BlockState baseState, Properties properties) {
        super(baseState, properties);
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