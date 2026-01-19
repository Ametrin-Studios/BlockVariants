package com.barion.block_variants.registry;

import com.barion.block_variants.BlockVariants;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.copyProperties;

public final class BVOtherBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);


    public static final DeferredBlock<IronBarsBlock> GOLD_BARS = register("gold_bars", IronBarsBlock::new, () -> copyProperties(Blocks.IRON_BARS));
    public static final DeferredBlock<ChainBlock> GOLD_CHAIN = register("gold_chain", ChainBlock::new, () -> copyProperties(Blocks.IRON_CHAIN));
    public static final DeferredBlock<WaterloggedTransparentBlock> GOLD_GRATE = register("gold_grate", WaterloggedTransparentBlock::new, () -> copyProperties(Blocks.COPPER_GRATE).mapColor(MapColor.GOLD));


    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), ()-> copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base) {
        return register(name, block, ()-> copyProperties(base));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, ()-> BVBuildingBlocks.DEFAULT_ITEM_PROPERTIES);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, Supplier<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }
}
