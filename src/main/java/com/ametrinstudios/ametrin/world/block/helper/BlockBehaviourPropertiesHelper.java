package com.ametrinstudios.ametrin.world.block.helper;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockBehaviourPropertiesHelper {
    private BlockBehaviourPropertiesHelper() {}
//    public static BlockBehaviour.Properties CopyProperties(BlockBehaviour.Properties properties) {return ((IMixinBlockBehaviorProperties) properties).copy();}
    public static BlockBehaviour.Properties CopyProperties(BlockBehaviour parent) {return BlockBehaviour.Properties.ofFullCopy(parent);}
    public static BlockBehaviour.Properties Properties() {return BlockBehaviour.Properties.of();}
}
