package com.ametrinstudios.ametrin.world.block.helper;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.CopyProperties;

@SuppressWarnings("unused")
public class BlockRegisterHelper {
    private BlockRegisterHelper() {}

    public static Supplier<StairBlock> stair(StairBlock.Properties properties, Supplier<BlockState> base) {return ()-> new StairBlock(base.get(), properties);}
    public static Supplier<StairBlock> stair(Block parent) {return stair(CopyProperties(parent), parent::defaultBlockState);}

//    public static Supplier<FlowerPotBlock> potted(Supplier<Block> main) {return ()-> new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, main, CopyProperties(Blocks.POTTED_OAK_SAPLING));}

    public static Supplier<ButtonBlock> woodenButton() {return woodenButton(BlockSetType.OAK);}
    public static Supplier<ButtonBlock> woodenButton(BlockSetType type) {return button(type, 30, true);}
    public static Supplier<ButtonBlock> stoneButton() {return stoneButton(BlockSetType.STONE);}
    public static Supplier<ButtonBlock> stoneButton(BlockSetType type) {return button(type, 20, false);}
    public static Supplier<ButtonBlock> button(BlockSetType type, int ticksStayPressed, boolean arrowsCanPress){
        return ()-> new ButtonBlock(type, ticksStayPressed, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
    }

    public static Supplier<FenceGateBlock> fenceGate(WoodType type, BlockBehaviour.Properties properties){
        return ()-> new FenceGateBlock(type, properties);
    }
    public static Supplier<FenceGateBlock> fenceGate(BlockBehaviour.Properties properties, SoundEvent openSound, SoundEvent closeSound){
        return ()-> new FenceGateBlock(properties, openSound, closeSound);
    }

    public static Supplier<DoorBlock> door(BlockBehaviour.Properties properties, BlockSetType type){
        return ()-> new DoorBlock(type, properties);
    }
    public static Supplier<TrapDoorBlock> trapDoor(BlockBehaviour.Properties properties, BlockSetType type){
        return ()-> new TrapDoorBlock(type, properties);
    }

    public static Supplier<PressurePlateBlock> woodenPressurePlate(MapColor mapColor, BlockSetType type) {return pressurePlate(basePressurePlateProperties(mapColor, NoteBlockInstrument.BASS).ignitedByLava(), type);}
    public static Supplier<PressurePlateBlock> stonePressurePlate(MapColor mapColor, BlockSetType type) {return pressurePlate(basePressurePlateProperties(mapColor, NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops(), type);}

    public static BlockBehaviour.Properties basePressurePlateProperties(DyeColor mapColor, NoteBlockInstrument instrument){
        return internalPressurePlateProperties(instrument).mapColor(mapColor);
    }
    public static BlockBehaviour.Properties basePressurePlateProperties(MapColor  mapColor, NoteBlockInstrument instrument){
        return internalPressurePlateProperties(instrument).mapColor(mapColor);
    }
    public static BlockBehaviour.Properties basePressurePlateProperties(Function<BlockState, MapColor>  mapColor, NoteBlockInstrument instrument){
        return internalPressurePlateProperties(instrument).mapColor(mapColor);
    }
    private static BlockBehaviour.Properties internalPressurePlateProperties(NoteBlockInstrument instrument){
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(instrument).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY);
    }
    public static Supplier<PressurePlateBlock> pressurePlate(BlockBehaviour.Properties properties, BlockSetType type){
        return ()-> new PressurePlateBlock(type, properties);
    }

    public static ToIntFunction<BlockState> litEmission(int lightLevel) {return (state)-> state.getValue(BlockStateProperties.LIT) ? lightLevel : 0;}
    public static ToIntFunction<BlockState> litEmission(ToIntFunction<BlockState> lightLevel) {return (state)-> state.getValue(BlockStateProperties.LIT) ? lightLevel.applyAsInt(state) : 0;}
    public static ToIntFunction<BlockState> emission(int lightLevel) {return (state)-> lightLevel;}
}
