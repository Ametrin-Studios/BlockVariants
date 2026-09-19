package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedRecipeProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.*;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Set;

public final class BVRecipeProvider extends ExtendedRecipeProvider {
    public BVRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(BlockVariants.MOD_ID, recipeOutput, advancementOutput, BVBlockFamilies.MAP);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildRecipes() {
        wall(BVOtherBlocks.POLISHED_GRANITE_WALL.get(), Blocks.POLISHED_GRANITE, Blocks.GRANITE, Blocks.GRANITE_WALL);
        wall(BVOtherBlocks.POLISHED_DIORITE_WALL.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, Blocks.DIORITE_WALL);
        wall(BVOtherBlocks.POLISHED_ANDESITE_WALL.get(), Blocks.POLISHED_ANDESITE, Blocks.ANDESITE, Blocks.ANDESITE_WALL);

        smelting(Blocks.STONE_STAIRS, Blocks.COBBLESTONE_STAIRS);
        smelting(Blocks.STONE_SLAB, Blocks.COBBLESTONE_SLAB);
        wall(BVOtherBlocks.STONE_WALL.get(), Blocks.STONE, true);
        smelting(BVOtherBlocks.STONE_WALL.get(), Blocks.COBBLESTONE_WALL);
        stairs(BVOtherBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVOtherBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.STONE_STAIRS);
        smelting(Blocks.SMOOTH_STONE_SLAB, Blocks.STONE_SLAB);
        wall(BVOtherBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE, true);
        smelting(BVOtherBlocks.SMOOTH_STONE_WALL.get(), BVOtherBlocks.STONE_WALL.get());

        stairs(BVBuildingBlocks.CUT_SANDSTONE_STAIRS.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_STAIRS);
        stairs(BVBuildingBlocks.CUT_RED_SANDSTONE_STAIRS.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_STAIRS);
        wall(BVBuildingBlocks.CUT_SANDSTONE_WALL.get(), Blocks.CUT_SANDSTONE, Blocks.SANDSTONE, Blocks.SANDSTONE_WALL);
        wall(BVBuildingBlocks.CUT_RED_SANDSTONE_WALL.get(), Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_WALL);

        wall(BVBuildingBlocks.QUARTZ_WALL.get(), Blocks.QUARTZ_BLOCK, true);
        stairs(BVBuildingBlocks.QUARTZ_BRICK_STAIRS.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_STAIRS);
        slab(BVBuildingBlocks.QUARTZ_BRICK_SLAB.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB);
        wall(BVBuildingBlocks.QUARTZ_BRICK_WALL.get(), Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK, BVBuildingBlocks.QUARTZ_WALL.get());
        smelting(Blocks.SMOOTH_QUARTZ_STAIRS, Blocks.QUARTZ_STAIRS);
        smelting(Blocks.SMOOTH_QUARTZ_SLAB, Blocks.QUARTZ_SLAB);
        wall(BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(), Blocks.SMOOTH_QUARTZ, true);
        smelting(BVBuildingBlocks.SMOOTH_QUARTZ_WALL.get(), BVBuildingBlocks.QUARTZ_WALL.get());
        family(BVBlockFamilies.CHISELED_QUARTZ_BLOCK).generate()
                .generateStonecuttingConversions(BlockFamilies.QUARTZ)
        ;
        stonecutting(RecipeCategory.DECORATIONS, BVBuildingBlocks.CHISELED_QUARTZ_BLOCK_WALL, BVBuildingBlocks.QUARTZ_WALL, 1);

        wall(BVOtherBlocks.PRISMARINE_BRICK_WALL.get(), Blocks.PRISMARINE_BRICKS, true);
        wall(BVOtherBlocks.DARK_PRISMARINE_WALL.get(), Blocks.DARK_PRISMARINE, true);
        family(BVBlockFamilies.NETHERRACK).generate();
        family(BVBlockFamilies.END_STONE).generate();
        wall(BVOtherBlocks.PURPUR_WALL.get(), Blocks.PURPUR_BLOCK, true);

        family(BVBlockFamilies.CRACKED_POLISHED_BLACKSTONE_BRICKS).generate()
                .generateSmeltingConversions(BlockFamilies.POLISHED_BLACKSTONE_BRICKS)
        ;
        generateStonecuttingConversionRecipes(BlockFamilies.POLISHED_BLACKSTONE, BlockFamilies.BLACKSTONE, DEFAULT_FEATURE_FLAG_SET);
        generateStonecuttingConversionRecipes(BlockFamilies.POLISHED_BLACKSTONE_BRICKS, BlockFamilies.BLACKSTONE, DEFAULT_FEATURE_FLAG_SET);
        generateStonecuttingConversionRecipes(BlockFamilies.POLISHED_BLACKSTONE_BRICKS, BlockFamilies.POLISHED_BLACKSTONE, DEFAULT_FEATURE_FLAG_SET);


        family(BVBlockFamilies.BASALT).generate();
        family(BVBlockFamilies.POLISHED_BASALT).generate()
                .generateStonecuttingConversions(BVBlockFamilies.BASALT)
        ;
        family(BVBlockFamilies.DRIPSTONE_BLOCK).generate();
        family(BVBlockFamilies.AMETHYST_BLOCK).generate();
        family(BVBlockFamilies.CRACKED_STONE_BRICKS).generate();

        for (var family : BVBlockFamilies.LOG_FAMILIES) {
            family(family).generate();
        }

        for (var family : BVBlockFamilies.WOOD_FAMILIES) {
            family(family).generate();
            wallFenceFenceGate(family.get(BlockFamily.Variant.WALL), family.get(BlockFamily.Variant.FENCE), family.get(BlockFamily.Variant.FENCE_GATE), family.get(BlockFamily.Variant.LOG), false);
        }

        family(BVBlockFamilies.BAMBOO_BLOCK).generate();
        family(BVBlockFamilies.STRIPPED_BAMBOO_BLOCK).generate();

        family(BVBlockFamilies.CALCITE).generate();
        family(BVBlockFamilies.SMOOTH_BASALT).generate()
                .generateSmeltingConversions(BVBlockFamilies.BASALT)
        ;

        family(BVBlockFamilies.DEEPSLATE).generate();
        family(BVBlockFamilies.CRACKED_DEEPSLATE_BRICKS).generate();
        family(BVBlockFamilies.CRACKED_DEEPSLATE_TILES).generate();

        netherFenceGate(BVBuildingBlocks.NETHER_BRICK_FENCE_GATE.get(), Blocks.NETHER_BRICKS);
        family(BVBlockFamilies.CRACKED_NETHER_BRICKS).generate();
        netherFence(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFenceGate(BVBuildingBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(), Blocks.CRACKED_NETHER_BRICKS);
        netherFence(BVBuildingBlocks.RED_NETHER_BRICK_FENCE.get(), Blocks.RED_NETHER_BRICKS);
        netherFenceGate(BVBuildingBlocks.RED_NETHER_BRICK_FENCE_GATE.get(), Blocks.RED_NETHER_BRICKS);

        family(BVBlockFamilies.OBSIDIAN).generate();
        family(BVBlockFamilies.CRYING_OBSIDIAN).generate();

        family(BVBlockFamilies.TERRACOTTA).generate();
        ColorCollection.VALUES.forEach(color -> {
            var dyed = BVBlockFamilies.DYED_TERRACOTTA.pick(color);
            var glazed = BVBlockFamilies.GLAZED_TERRACOTTA.pick(color);
            family(dyed).generate();
            family(glazed).generate()
                    .generateSmeltingConversions(dyed)
            ;
        });

        ColorCollection.VALUES.forEach(color -> wall(BVColoredBlocks.WOOL_WALL.pick(color).get(), Blocks.WOOL.pick(color), false));

        ColorCollection.VALUES.forEach(color -> {
            var dyeItem = Items.DYE.pick(color);
            var result = BVColoredBlocks.WOOL_WALL.pick(color);
            shapeless(RecipeCategory.BUILDING_BLOCKS, result).requires(BVTags.Items.WOOL_WALLS).requires(dyeItem).group("dye_wool_walls").unlockedBy("has_needed_dye", has(dyeItem)).save(output, ResourceKey.create(Registries.RECIPE, this.locate("dye_" + getItemName(result))));
        });

        family(BVBlockFamilies.PACKED_MUD).generate();

        ColorCollection.VALUES.forEach(color -> wall(BVColoredBlocks.CONCRETE_WALL.pick(color).get(), Blocks.CONCRETE.pick(color), true));

        shaped(RecipeCategory.DECORATIONS, BVOtherBlocks.GOLD_BARS, 16)
                .define('#', Items.GOLD_INGOT)
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, BVOtherBlocks.GOLD_CHAIN)
                .define('I', Items.GOLD_INGOT)
                .define('N', Items.GOLD_NUGGET)
                .pattern("N")
                .pattern("I")
                .pattern("N")
                .unlockedBy("has_gold_nugget", has(Items.GOLD_NUGGET))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(output);

        grate(BVOtherBlocks.GOLD_GRATE.get(), Blocks.GOLD_BLOCK);

        {
            shaped(RecipeCategory.REDSTONE, Blocks.DROPPER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.REDSTONE)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("#+#")
                    .unlockedBy("has_redstone", has(Items.REDSTONE))
                    .save(output, recipeID(Blocks.DROPPER));

            shaped(RecipeCategory.REDSTONE, Blocks.DISPENSER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.REDSTONE)
                    .define('(', Items.BOW)
                    .pattern("###")
                    .pattern("#(#")
                    .pattern("#+#")
                    .unlockedBy("has_bow", has(Items.BOW))
                    .save(output, recipeID(Blocks.DISPENSER));

            shaped(RecipeCategory.DECORATIONS, Blocks.FURNACE, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .pattern("###")
                    .pattern("# #")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.FURNACE));

            shaped(RecipeCategory.DECORATIONS, Blocks.STONECUTTER, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('+', Items.IRON_INGOT)
                    .pattern(" + ")
                    .pattern("###")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.STONECUTTER));

            shaped(RecipeCategory.REDSTONE, Blocks.LEVER, 1)
                    .define('|', Items.STICK)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .pattern("|")
                    .pattern("#")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.LEVER));

            shaped(RecipeCategory.REDSTONE, Blocks.PISTON, 1)
                    .define('#', BVTags.Items.STONE_CRAFTING)
                    .define('W', ItemTags.PLANKS)
                    .define('N', Items.IRON_INGOT)
                    .define('I', Items.REDSTONE)
                    .pattern("WWW")
                    .pattern("#N#")
                    .pattern("#I#")
                    .unlockedBy("has_stone", has(BVTags.Items.STONE_CRAFTING))
                    .save(output, recipeID(Blocks.PISTON));
        } // Recipe overrides
    }

    private void all(StairBlock stair, SlabBlock slab, WallBlock wall, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
        wall(wall, material, hasStonecutting);
    }

    private void stairSlab(StairBlock stair, SlabBlock slab, ItemLike material, boolean hasStonecutting) {
        stairs(stair, material, hasStonecutting);
        slab(slab, material, hasStonecutting);
    }

    public void wallFenceFenceGate(ItemLike wall, ItemLike fence, ItemLike fenceGate, ItemLike material, boolean hasStonecutting) {
        wall(wall, material, hasStonecutting);
        fence(fence, material);
        fenceGate(fenceGate, material);
    }

    private void smelting(ItemLike result, ItemLike ingredient) {
        smelting(RecipeCategory.MISC, result, ingredient, 0.1f, 200);
    }

    private static ResourceKey<Recipe<?>> recipeID(ItemLike item) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(BlockVariants.MOD_ID, getItemName(item)));
    }

    public static MultiRegistryBootstrap create() {
        return new MultiRegistryBootstrap() {
            @Override
            public Set<ResourceKey<? extends Registry<?>>> requestedRegistries() {
                return Set.of(Registries.RECIPE, Registries.ADVANCEMENT);
            }

            @Override
            public void run(MultiRegistryBootstrap.BootstrapGetter registries) {
                new BVRecipeProvider(registries.get(Registries.RECIPE), registries.get(Registries.ADVANCEMENT)).buildRecipes();
            }
        };
    }
}