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
import static com.barion.block_variants.registry.BVBuildingBlocks.getVanillaBlock;

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

    public static final DeferredBlock<StairBlock> WHITE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.WHITE, Blocks.DYED_TERRACOTTA.white());
    public static final DeferredBlock<SlabBlock> WHITE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_GRAY, Blocks.DYED_TERRACOTTA.lightGray());
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> GRAY_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GRAY, Blocks.DYED_TERRACOTTA.gray());
    public static final DeferredBlock<SlabBlock> GRAY_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> BLACK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLACK, Blocks.DYED_TERRACOTTA.black());
    public static final DeferredBlock<SlabBlock> BLACK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> BROWN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BROWN, Blocks.DYED_TERRACOTTA.brown());
    public static final DeferredBlock<SlabBlock> BROWN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> RED_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.RED, Blocks.DYED_TERRACOTTA.red());
    public static final DeferredBlock<SlabBlock> RED_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_TERRACOTTA_WALL = regTerracottaWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> ORANGE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.ORANGE, Blocks.DYED_TERRACOTTA.orange());
    public static final DeferredBlock<SlabBlock> ORANGE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> YELLOW_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.YELLOW, Blocks.DYED_TERRACOTTA.yellow());
    public static final DeferredBlock<SlabBlock> YELLOW_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_TERRACOTTA_WALL = regTerracottaWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIME, Blocks.DYED_TERRACOTTA.lime());
    public static final DeferredBlock<SlabBlock> LIME_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> GREEN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.GREEN, Blocks.DYED_TERRACOTTA.green());
    public static final DeferredBlock<SlabBlock> GREEN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> CYAN_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.CYAN, Blocks.DYED_TERRACOTTA.cyan());
    public static final DeferredBlock<SlabBlock> CYAN_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_TERRACOTTA_WALL = regTerracottaWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.LIGHT_BLUE, Blocks.DYED_TERRACOTTA.lightBlue());
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> BLUE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.BLUE, Blocks.DYED_TERRACOTTA.blue());
    public static final DeferredBlock<SlabBlock> BLUE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> PURPLE_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PURPLE, Blocks.DYED_TERRACOTTA.purple());
    public static final DeferredBlock<SlabBlock> PURPLE_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> MAGENTA_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.MAGENTA, Blocks.DYED_TERRACOTTA.magenta());
    public static final DeferredBlock<SlabBlock> MAGENTA_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_TERRACOTTA_WALL = regTerracottaWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> PINK_TERRACOTTA_STAIRS = regTerracottaStairs(DyeColor.PINK, Blocks.DYED_TERRACOTTA.pink());
    public static final DeferredBlock<SlabBlock> PINK_TERRACOTTA_SLAB = regTerracottaSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_TERRACOTTA_WALL = regTerracottaWall(DyeColor.PINK);

    public static final ColorCollection<DeferredBlock<WallBlock>> CONCRETE_WALL = ColorCollection.zipMap(
            ColorCollection.VALUES, BVBlockItemIds.CONCRETE_WALL, (color, id) -> register(id.block().identifier().getPath(), WallBlock::new, () -> wallProperties(Blocks.CONCRETE.pick(color)))
    );


    public static final DeferredBlock<StairBlock> WHITE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.WHITE);
    public static final DeferredBlock<SlabBlock> WHITE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.WHITE);
    public static final DeferredBlock<WallBlock> WHITE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.WHITE);

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_GRAY);
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_GRAY);

    public static final DeferredBlock<StairBlock> GRAY_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GRAY);
    public static final DeferredBlock<SlabBlock> GRAY_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GRAY);
    public static final DeferredBlock<WallBlock> GRAY_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GRAY);

    public static final DeferredBlock<StairBlock> BLACK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLACK);
    public static final DeferredBlock<SlabBlock> BLACK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLACK);
    public static final DeferredBlock<WallBlock> BLACK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLACK);

    public static final DeferredBlock<StairBlock> BROWN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BROWN);
    public static final DeferredBlock<SlabBlock> BROWN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BROWN);
    public static final DeferredBlock<WallBlock> BROWN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BROWN);

    public static final DeferredBlock<StairBlock> RED_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.RED);
    public static final DeferredBlock<SlabBlock> RED_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.RED);
    public static final DeferredBlock<WallBlock> RED_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.RED);

    public static final DeferredBlock<StairBlock> ORANGE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.ORANGE);
    public static final DeferredBlock<SlabBlock> ORANGE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.ORANGE);
    public static final DeferredBlock<WallBlock> ORANGE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.ORANGE);

    public static final DeferredBlock<StairBlock> YELLOW_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.YELLOW);
    public static final DeferredBlock<SlabBlock> YELLOW_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.YELLOW);
    public static final DeferredBlock<WallBlock> YELLOW_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.YELLOW);

    public static final DeferredBlock<StairBlock> LIME_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIME);
    public static final DeferredBlock<SlabBlock> LIME_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIME);
    public static final DeferredBlock<WallBlock> LIME_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIME);

    public static final DeferredBlock<StairBlock> GREEN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.GREEN);
    public static final DeferredBlock<SlabBlock> GREEN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.GREEN);
    public static final DeferredBlock<WallBlock> GREEN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.GREEN);

    public static final DeferredBlock<StairBlock> CYAN_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.CYAN);
    public static final DeferredBlock<SlabBlock> CYAN_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.CYAN);
    public static final DeferredBlock<WallBlock> CYAN_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.CYAN);

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.LIGHT_BLUE);
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.LIGHT_BLUE);

    public static final DeferredBlock<StairBlock> BLUE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.BLUE);
    public static final DeferredBlock<SlabBlock> BLUE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.BLUE);
    public static final DeferredBlock<WallBlock> BLUE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.BLUE);

    public static final DeferredBlock<StairBlock> PURPLE_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PURPLE);
    public static final DeferredBlock<SlabBlock> PURPLE_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PURPLE);
    public static final DeferredBlock<WallBlock> PURPLE_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PURPLE);

    public static final DeferredBlock<StairBlock> MAGENTA_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.MAGENTA);
    public static final DeferredBlock<SlabBlock> MAGENTA_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.MAGENTA);
    public static final DeferredBlock<WallBlock> MAGENTA_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.MAGENTA);

    public static final DeferredBlock<StairBlock> PINK_GLAZED_TERRACOTTA_STAIRS = regGlazedTerracottaStairs(DyeColor.PINK);
    public static final DeferredBlock<SlabBlock> PINK_GLAZED_TERRACOTTA_SLAB = regGlazedTerracottaSlab(DyeColor.PINK);
    public static final DeferredBlock<WallBlock> PINK_GLAZED_TERRACOTTA_WALL = regGlazedTerracottaWall(DyeColor.PINK);


    private static DeferredBlock<StairBlock> regTerracottaStairs(DyeColor color, Block base) {
        return register(color.getName() + "_terracotta_stairs", StairBlock::new, base, BlockRegisterHelper::stairProperties);
    }

    private static DeferredBlock<SlabBlock> regTerracottaSlab(DyeColor color) {
        return register(color.getName() + "_terracotta_slab", SlabBlock::new, () -> slabProperties(Blocks.TERRACOTTA));
    }

    private static DeferredBlock<WallBlock> regTerracottaWall(DyeColor color) {
        return register(color.getName() + "_terracotta_wall", WallBlock::new, () -> wallProperties(Blocks.TERRACOTTA));
    }

    private static DeferredBlock<StairBlock> regGlazedTerracottaStairs(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_stairs", StairBlock::new, parent, BlockRegisterHelper::stairProperties);
    }

    private static DeferredBlock<SlabBlock> regGlazedTerracottaSlab(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_slab", SlabBlock::new, () -> slabProperties(parent));
    }

    private static DeferredBlock<WallBlock> regGlazedTerracottaWall(DyeColor color) {
        var parent = getVanillaBlock(color.getName() + "_glazed_terracotta");
        return register(color.getName() + "_glazed_terracotta_wall", WallBlock::new, () -> wallProperties(parent));
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
