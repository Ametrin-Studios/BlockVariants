package com.barion.block_variants.block;

import com.barion.block_variants.BVUtil;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

public class StrippableWallBlock extends WallBlock {
    private final Supplier<WallBlock> stripResult;

    public StrippableWallBlock(Supplier<WallBlock> stripResult, Properties properties) {
        super(properties);
        this.stripResult = stripResult;
    }

    @Override @ParametersAreNonnullByDefault @Nonnull
    public ActionResultType use(BlockState blockState, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hitResult) {
        if(!(player.getItemInHand(hand).getItem() instanceof AxeItem)) {return super.use(blockState, level, pos, player, hand, hitResult);}

        level.setBlock(pos, BVUtil.copyProperties(blockState, stripResult.get().defaultBlockState()), 3);
        level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundCategory.BLOCKS, 1,1);

        return ActionResultType.sidedSuccess(level.isClientSide);
    }
}