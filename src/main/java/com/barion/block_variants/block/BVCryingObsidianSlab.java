package com.barion.block_variants.block;

import com.barion.block_variants.BVUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;

public class BVCryingObsidianSlab extends SlabBlock {
    public BVCryingObsidianSlab(Properties properties) {super(properties);}

    @Override @ParametersAreNonnullByDefault
    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        BVUtil.cry(state, level, pos, random);
    }
}