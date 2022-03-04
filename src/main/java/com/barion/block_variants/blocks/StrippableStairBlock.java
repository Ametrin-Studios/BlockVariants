package com.barion.block_variants.blocks;

/*
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Map;
import java.util.function.Supplier;

public class StrippableStairBlock extends StairBlock{
    private final Supplier<StairBlock> stripResult;

    public StrippableStairBlock(Supplier<BlockState> state, Supplier<StairBlock> stripResult, Properties properties) {
        super(state, properties);
        this.stripResult = stripResult;
    }

    @Override @ParametersAreNonnullByDefault @NotNull
    public InteractionResult use(BlockState blockState, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if(player.getItemInHand(hand).getItem().getClass() == PickaxeItem.class){
            */
/*BlockState toPlaceBlockState = stripResult.get().defaultBlockState();

            for (Map.Entry<Property<?>, Comparable<?>> entry : blockState.getValues().entrySet()) {
                Property<?> _property = toPlaceBlockState.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                if (_property != null) {
                    toPlaceBlockState.getValue(_property);
                    try {
                        toPlaceBlockState = toPlaceBlockState.setValue(_property, entry.getValue());
                    } catch (Exception ignored) {}
                }
            }

            level.setBlock(pos, stripResult.get().defaultBlockState(), 3);*//*

            execute(level, pos, blockState);

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    private void execute(LevelAccessor levelAccessor, BlockPos pos, BlockState currentBlock) {
        BlockState toPlace = stripResult.get().defaultBlockState();
        for (Map.Entry<Property<?>, Comparable<?>> entry : currentBlock.getValues().entrySet()) {
            Property property = toPlace.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (property != null) {
                toPlace.getValue(property);
                try {
                    toPlace = toPlace.setValue(property, (Comparable)entry.getValue());
                } catch (Exception ignored) {
                }
            }
        }
        levelAccessor.setBlock(pos, toPlace, 3);
    }
}*/
