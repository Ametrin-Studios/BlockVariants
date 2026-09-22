package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.util.ColorCollection;
import com.ametrinstudios.ametrin.world.block.HorizontalRotatedSlabBlock;
import com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper;
import com.barion.block_variants.BlockVariants;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public final class BVColoredBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);

    public static final List<DyeColor> GAMEPLAY_COLOR_ORDER = List.of(
            DyeColor.WHITE,
            DyeColor.LIGHT_GRAY,
            DyeColor.GRAY,
            DyeColor.BLACK,
            DyeColor.BROWN,
            DyeColor.RED,
            DyeColor.ORANGE,
            DyeColor.YELLOW,
            DyeColor.LIME,
            DyeColor.GREEN,
            DyeColor.CYAN,
            DyeColor.LIGHT_BLUE,
            DyeColor.BLUE,
            DyeColor.PURPLE,
            DyeColor.MAGENTA,
            DyeColor.PINK
    );

    public static final ColorCollection<DeferredBlock<StairBlock>> WOOL_STAIRS = ColorCollection.zipMap(
            ColorCollection.WOOL, BVBlockItemIds.WOOL_STAIRS, (base, id) -> register(id, StairBlock::new, base, BlockRegisterHelper::wallProperties)
    );
    public static final ColorCollection<DeferredBlock<SlabBlock>> WOOL_SLAB = ColorCollection.zipMap(
            ColorCollection.WOOL, BVBlockItemIds.WOOL_SLAB, (base, id) -> register(id, SlabBlock::new, base, BlockRegisterHelper::wallProperties)
    );
    public static final ColorCollection<DeferredBlock<WallBlock>> WOOL_WALL = ColorCollection.zipMap(
            ColorCollection.WOOL, BVBlockItemIds.WOOL_WALL, (base, id) -> register(id, WallBlock::new, base, BlockRegisterHelper::wallProperties)
    );

    public static final ColorCollection<DeferredBlock<StairBlock>> CONCRETE_STAIRS = ColorCollection.zipMap(
            ColorCollection.CONCRETE, BVBlockItemIds.CONCRETE_STAIRS, (base, id) -> register(id, StairBlock::new, base, BlockRegisterHelper::wallProperties)
    );
    public static final ColorCollection<DeferredBlock<SlabBlock>> CONCRETE_SLAB = ColorCollection.zipMap(
            ColorCollection.CONCRETE, BVBlockItemIds.CONCRETE_SLAB, (base, id) -> register(id, SlabBlock::new, base, BlockRegisterHelper::wallProperties)
    );
    public static final ColorCollection<DeferredBlock<WallBlock>> CONCRETE_WALL = ColorCollection.zipMap(
            ColorCollection.CONCRETE, BVBlockItemIds.CONCRETE_WALL, (base, id) -> register(id, WallBlock::new, base, BlockRegisterHelper::wallProperties)
    );

    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIRS = register("terracotta_stairs", StairBlock::new, Blocks.TERRACOTTA, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab", SlabBlock::new, Blocks.TERRACOTTA, BlockRegisterHelper::slabProperties);
    public static final DeferredBlock<WallBlock> TERRACOTTA_WALL = register("terracotta_wall", WallBlock::new, Blocks.TERRACOTTA, BlockRegisterHelper::wallProperties);

    public static final ColorCollection<DeferredBlock<StairBlock>> DYED_TERRACOTTA_STAIRS = ColorCollection.zipMap(
            ColorCollection.DYED_TERRACOTTA, BVBlockItemIds.DYED_TERRACOTTA_STAIRS, (base, id) -> register(id, StairBlock::new, base, BlockRegisterHelper::slabProperties)
    );
    public static final ColorCollection<DeferredBlock<SlabBlock>> DYED_TERRACOTTA_SLAB = ColorCollection.zipMap(
            ColorCollection.DYED_TERRACOTTA, BVBlockItemIds.DYED_TERRACOTTA_SLAB, (base, id) -> register(id, SlabBlock::new, base, BlockRegisterHelper::slabProperties)
    );
    public static final ColorCollection<DeferredBlock<WallBlock>> DYED_TERRACOTTA_WALL = ColorCollection.zipMap(
            ColorCollection.DYED_TERRACOTTA, BVBlockItemIds.DYED_TERRACOTTA_WALL, (base, id) -> register(id, WallBlock::new, base, BlockRegisterHelper::wallProperties)
    );

    public static final ColorCollection<DeferredBlock<StairBlock>> GLAZED_TERRACOTTA_STAIRS = ColorCollection.zipMap(
            ColorCollection.GLAZED_TERRACOTTA, BVBlockItemIds.GLAZED_TERRACOTTA_STAIRS, (base, id) -> register(id, StairBlock::new, base, BlockRegisterHelper::slabProperties)
    );
    public static final ColorCollection<DeferredBlock<SlabBlock>> GLAZED_TERRACOTTA_SLAB = ColorCollection.zipMap(
            ColorCollection.GLAZED_TERRACOTTA, BVBlockItemIds.GLAZED_TERRACOTTA_SLAB, (base, id) -> register(id, HorizontalRotatedSlabBlock::new, base, BlockRegisterHelper::slabProperties)
    );
    public static final ColorCollection<DeferredBlock<WallBlock>> GLAZED_TERRACOTTA_WALL = ColorCollection.zipMap(
            ColorCollection.GLAZED_TERRACOTTA, BVBlockItemIds.GLAZED_TERRACOTTA_WALL, (base, id) -> register(id, WallBlock::new, base, BlockRegisterHelper::wallProperties)
    );


    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties) {
        return register(name, block, base, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), () -> properties.apply(base), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties) {
        return register(name, block, base, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, block, () -> properties.apply(base), itemProperties);
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }
}
