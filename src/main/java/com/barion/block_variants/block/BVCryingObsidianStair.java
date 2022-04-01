package com.barion.block_variants.block;

import com.barion.block_variants.BVUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;
import java.util.function.Supplier;

public class BVCryingObsidianStair extends StairBlock {
    public BVCryingObsidianStair(Supplier<BlockState> state, Properties properties) {super(state, properties);}

    @Override @ParametersAreNonnullByDefault
    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        BVUtil.cry(state, level, pos, random);
    }
}