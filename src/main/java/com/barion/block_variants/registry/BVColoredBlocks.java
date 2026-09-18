package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.data.DataProviderExtensions;
import com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.BlockFamilies;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.slabProperties;
import static com.ametrinstudios.ametrin.world.block.helper.BlockRegisterHelper.wallProperties;

public final class BVColoredBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(BlockVariants.MOD_ID);

    static {
        for (var woolFamily : BlockFamilies.WOOL.asList()) {
            for (var variant : woolFamily.getVariants().entrySet()) {
                var key = DataProviderExtensions.getBlockKey(variant.getValue());
                REGISTER.addAlias(BlockVariants.locate(key.getPath()), key);
            }
        }
        for (var woolFamily : BlockFamilies.CONCRETE.asList()) {
            for (var variant : woolFamily.getVariants().entrySet()) {
                var key = DataProviderExtensions.getBlockKey(variant.getValue());
                REGISTER.addAlias(BlockVariants.locate(key.getPath()), key);
            }
        }
    }

    public static final ColorCollection<DeferredBlock<WallBlock>> WOOL_WALL = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.WOOL_WALL, (color, id) -> register(id.block().identifier().getPath(), WallBlock::new, () -> wallProperties(Blocks.WOOL.pick(color)), p -> p.cookingFuel(ContextIntProviders.COOKING_TIME_WOOL))
    );

    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIRS = register("terracotta_stairs", StairBlock::new, Blocks.TERRACOTTA, BlockRegisterHelper::stairProperties);
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab", SlabBlock::new, () -> slabProperties(Blocks.TERRACOTTA));
    public static final DeferredBlock<WallBlock> TERRACOTTA_WALL = register("terracotta_wall", WallBlock::new, () -> wallProperties(Blocks.TERRACOTTA));

    public static final ColorCollection<DeferredBlock<WallBlock>> CONCRETE_WALL = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.CONCRETE_WALL, (color, id) -> register(id.block().identifier().getPath(), WallBlock::new, () -> wallProperties(Blocks.CONCRETE.pick(color)))
    );

    public static final ColorCollection<DeferredBlock<StairBlock>> DYED_TERRACOTTA_STAIRS = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.DYED_TERRACOTTA_STAIRS, (color, id) -> register(id.block().identifier().getPath(), StairBlock::new, Blocks.DYED_TERRACOTTA.pick(color), BlockRegisterHelper::slabProperties)
    );
    public static final ColorCollection<DeferredBlock<SlabBlock>> DYED_TERRACOTTA_SLAB = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.DYED_TERRACOTTA_SLAB, (color, id) -> register(id.block().identifier().getPath(), SlabBlock::new, () -> slabProperties(Blocks.DYED_TERRACOTTA.pick(color)))
    );
    public static final ColorCollection<DeferredBlock<WallBlock>> DYED_TERRACOTTA_WALL = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.DYED_TERRACOTTA_WALL, (color, id) -> register(id.block().identifier().getPath(), WallBlock::new, () -> wallProperties(Blocks.DYED_TERRACOTTA.pick(color)))
    );

    public static final ColorCollection<DeferredBlock<StairBlock>> GLAZED_TERRACOTTA_STAIRS = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.GLAZED_TERRACOTTA_STAIRS, (color, id) -> register(id.block().identifier().getPath(), StairBlock::new, Blocks.GLAZED_TERRACOTTA.pick(color), BlockRegisterHelper::slabProperties)
    );
    public static final ColorCollection<DeferredBlock<SlabBlock>> GLAZED_TERRACOTTA_SLAB = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.GLAZED_TERRACOTTA_SLAB, (color, id) -> register(id.block().identifier().getPath(), SlabBlock::new, () -> slabProperties(Blocks.GLAZED_TERRACOTTA.pick(color)))
    );
    public static final ColorCollection<DeferredBlock<WallBlock>> GLAZED_TERRACOTTA_WALL = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.GLAZED_TERRACOTTA_WALL, (color, id) -> register(id.block().identifier().getPath(), WallBlock::new, () -> wallProperties(Blocks.GLAZED_TERRACOTTA.pick(color)))
    );


    private static DeferredBlock<StairBlock> regTerracottaStairs(DyeColor color, Block base) {
        return register(color.getName() + "_terracotta_stairs", StairBlock::new, base, BlockRegisterHelper::stairProperties);
    }

    private static DeferredBlock<SlabBlock> regTerracottaSlab(DyeColor color) {
        return register(color.getName() + "_terracotta_slab", SlabBlock::new, () -> slabProperties(Blocks.TERRACOTTA));
    }

    private static DeferredBlock<WallBlock> regTerracottaWall(DyeColor color) {
        return register(color.getName() + "_terracotta_wall", WallBlock::new, () -> wallProperties(Blocks.TERRACOTTA));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties) {
        return register(name, block, base, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, BiFunction<BlockState, BlockBehaviour.Properties, T> block, Block base, Function<Block, BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        return register(name, prop -> block.apply(base.defaultBlockState(), prop), () -> properties.apply(base), itemProperties);
    }


    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, UnaryOperator<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        return register(name, block, properties, UnaryOperator.identity());
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, UnaryOperator<BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties, UnaryOperator<Item.Properties> itemProperties) {
        var registryObject = REGISTER.registerBlock(name, block, properties);
        BVItems.REGISTER.registerSimpleBlockItem(registryObject, itemProperties);
        return registryObject;
    }
}
