package com.barion.block_variants.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public class StrippableFenceGateBlock extends FenceGateBlock {
    private final Supplier<FenceGateBlock> stripResult;

    public StrippableFenceGateBlock(Supplier<FenceGateBlock> stripResult, Properties properties) {
        super(properties, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);
        this.stripResult = stripResult;
    }

    @Override @ParametersAreNonnullByDefault @NotNull
    public InteractionResult use(BlockState blockState, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if(!(player.getItemInHand(hand).getItem() instanceof AxeItem)) {return super.use(blockState, level, pos, player, hand, hitResult);}

        level.setBlock(pos, stripResult.get().withPropertiesOf(blockState), 2);
        level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1,1);

        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}