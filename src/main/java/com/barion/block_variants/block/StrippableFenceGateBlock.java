package com.barion.block_variants.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public class StrippableFenceGateBlock extends FenceGateBlock {
    private final Supplier<FenceGateBlock> stripResult;

    @Deprecated
    public StrippableFenceGateBlock(Supplier<FenceGateBlock> stripResult, Properties properties, WoodType type) {
        super(type, properties);
        this.stripResult = stripResult;
    }

    public StrippableFenceGateBlock(Supplier<FenceGateBlock> stripResult, WoodType type, Properties properties) {
        super(type, properties);
        this.stripResult = stripResult;
    }

    @Override @ParametersAreNonnullByDefault @NotNull
    protected ItemInteractionResult useItemOn(ItemStack itemStack, BlockState blockState, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if(!(player.getItemInHand(hand).getItem() instanceof AxeItem)){
            return super.useItemOn(itemStack, blockState, level, pos, player, hand, hitResult);
        }

        level.setBlock(pos, stripResult.get().withPropertiesOf(blockState), 2);
        level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1,1);

        return ItemInteractionResult.sidedSuccess(level.isClientSide);
    }
}