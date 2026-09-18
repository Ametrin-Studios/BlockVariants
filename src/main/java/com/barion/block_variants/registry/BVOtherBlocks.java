package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper;
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
import java.util.function.UnaryOperator;

import static com.ametrinstudios.ametrin.world.block.helper.BlockBehaviourPropertiesHelper.copyProperties;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.wallProperties;

public final class BVOtherBlocks {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);

    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_WALL = register("polished_granite_wall", WallBlock::new, () -> wallProperties(Blocks.POLISHED_GRANITE));
    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_WALL = register("polished_diorite_wall", WallBlock::new, () -> wallProperties(Blocks.POLISHED_DIORITE));
    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_WALL = register("polished_andesite_wall", WallBlock::new, () -> wallProperties(Blocks.POLISHED_ANDESITE));

    public static final DeferredBlock<WallBlock> STONE_WALL = register("stone_wall", WallBlock::new, () -> wallProperties(Blocks.STONE));
    public static final DeferredBlock<StairBlock> SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", StairBlock::new, Blocks.SMOOTH_STONE, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<WallBlock> SMOOTH_STONE_WALL = register("smooth_stone_wall", WallBlock::new, () -> wallProperties(Blocks.SMOOTH_STONE));

    public static final DeferredBlock<WallBlock> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", WallBlock::new, () -> wallProperties(Blocks.PRISMARINE_BRICKS));
    public static final DeferredBlock<WallBlock> DARK_PRISMARINE_WALL = register("dark_prismarine_wall", WallBlock::new, () -> wallProperties(Blocks.PRISMARINE_BRICKS));

    public static final DeferredBlock<WallBlock> PURPUR_WALL = register("purpur_wall", WallBlock::new, () -> wallProperties(Blocks.PURPUR_BLOCK));

    public static final DeferredBlock<IronBarsBlock> GOLD_BARS = register("gold_bars", IronBarsBlock::new, () -> copyProperties(Blocks.IRON_BARS));
    public static final DeferredBlock<ChainBlock> GOLD_CHAIN = register("gold_chain", ChainBlock::new, () -> copyProperties(Blocks.IRON_CHAIN));
    public static final DeferredBlock<WaterloggedTransparentBlock> GOLD_GRATE = register("gold_grate", WaterloggedTransparentBlock::new, () -> copyProperties(Blocks.COPPER_GRATE.weathering().unaffected()).mapColor(MapColor.GOLD));


    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties) {
        return register(name, block, base, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), () -> properties.apply(base), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, p -> p);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }
}
