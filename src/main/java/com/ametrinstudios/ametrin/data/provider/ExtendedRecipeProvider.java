package com.ametrinstudios.ametrin.data.provider;

import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.common.conditions.WithConditions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public abstract class ExtendedRecipeProvider extends RecipeProvider {
    protected static final Logger LOGGER = LogUtils.getLogger();
    protected static Set<ResourceLocation> _recipes = Sets.newHashSet();

    protected static String currentModID;
    protected String modID;

    public ExtendedRecipeProvider(PackOutput packOutput, String modID, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
        this.modID = modID;
    }

    @Override @NotNull @ParametersAreNonnullByDefault
    protected CompletableFuture<?> run(CachedOutput output, final HolderLookup.Provider lookupProvider){
        currentModID = modID;
        final var list = new ArrayList<CompletableFuture<?>>();
        buildRecipes(new RecipeOutput() {
            @Override @ParametersAreNonnullByDefault
            public void accept(ResourceLocation resourceLocation, Recipe<?> recipe, @Nullable AdvancementHolder advancementHolder, ICondition... conditions) {
                if (!_recipes.add(resourceLocation)) {throw new IllegalStateException("Duplicate recipe " + resourceLocation);}

                list.add(DataProvider.saveStable(output, lookupProvider, Recipe.CONDITIONAL_CODEC, Optional.of(new WithConditions<>(recipe, conditions)), recipePathProvider.json(resourceLocation)));
                if(advancementHolder != null){
                    list.add(DataProvider.saveStable(output, lookupProvider, Advancement.CONDITIONAL_CODEC, Optional.of(new WithConditions<>(advancementHolder.value(), conditions)), advancementPathProvider.json(advancementHolder.id())));
                }
            }

            @Override @NotNull
            public Advancement.Builder advancement() {
                return Advancement.Builder.recipeAdvancement().parent(RecipeBuilder.ROOT_RECIPE_ADVANCEMENT);
            }
        });
        return CompletableFuture.allOf(list.toArray(CompletableFuture[]::new));
    }

    @Override
    protected abstract void buildRecipes(@NotNull RecipeOutput output);

    protected static void stairSlabWallButton(RecipeOutput output, @Nullable ItemLike stair, @Nullable ItemLike slab, @Nullable ItemLike wall, @Nullable ItemLike button, ItemLike material, boolean hasStonecutting){
        if(stair != null) {stairs(output, stair, material, hasStonecutting);}
        if(slab != null) {slab(output, slab, material, hasStonecutting);}
        if(wall != null) {wall(output, wall, material, hasStonecutting);}
        if(button != null) {button(output, button, material, hasStonecutting);}
    }
    protected static void stairSlabWallButton(RecipeOutput output, @Nullable ItemLike stair, @Nullable ItemLike slab, @Nullable ItemLike wall, @Nullable ItemLike button, ItemLike material, ItemLike... additionalStonecuttingMaterials){
        if(stair != null) {stairs(output, stair, material, additionalStonecuttingMaterials);}
        if(slab != null) {slab(output, slab, material, additionalStonecuttingMaterials);}
        if(wall != null) {wall(output, wall, material, additionalStonecuttingMaterials);}
        if(button != null) {button(output, button, material, additionalStonecuttingMaterials);}
    }

    protected static void stairs(RecipeOutput output, ItemLike stair, ItemLike material, boolean hasStonecutting){
        stairBuilder(stair, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(output, recipeID(stair, material));
        if(hasStonecutting) {stonecutting(output, RecipeCategory.BUILDING_BLOCKS, stair, 1, material);}
    }
    protected static void stairs(RecipeOutput output, ItemLike stair, ItemLike material, ItemLike... additionalStonecuttingMaterials){
        stairs(output, stair, material, true);
        for(ItemLike mat : additionalStonecuttingMaterials){
            stonecutting(output, RecipeCategory.BUILDING_BLOCKS, stair, 1, mat);
        }
    }

    protected static void slab(RecipeOutput output, ItemLike slab, ItemLike material, boolean hasStonecutting){
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, slab, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(output, recipeID(slab, material));
        if(hasStonecutting) {stonecutting(output, RecipeCategory.BUILDING_BLOCKS, slab, 2, material);}
    }
    protected static void slab(RecipeOutput output, ItemLike slab, ItemLike material, ItemLike... additionalStonecuttingMaterials){
        slab(output, slab, material, true);
        for(ItemLike mat : additionalStonecuttingMaterials){
            stonecutting(output, RecipeCategory.BUILDING_BLOCKS, slab, mat instanceof SlabBlock ? 1 : 2, mat);
        }
    }

    protected static void wall(RecipeOutput output, ItemLike wall, ItemLike material, boolean hasStonecutting){
        wallBuilder(RecipeCategory.DECORATIONS, wall, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(output, recipeID(wall, material));
        if(hasStonecutting) {stonecutting(output, RecipeCategory.DECORATIONS, wall, 1, material);}
    }
    protected static void wall(RecipeOutput output, ItemLike wall, ItemLike material, ItemLike... additionalStonecuttingMaterials){
        wall(output, wall, material, true);
        for(ItemLike mat : additionalStonecuttingMaterials){
            stonecutting(output, RecipeCategory.DECORATIONS, wall, 1, mat);
        }
    }

    protected static void button(RecipeOutput output, ItemLike button, ItemLike material, boolean hasStonecutting){
        buttonBuilder(button, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(output, recipeID(button, material));
        if(hasStonecutting) {stonecutting(output, RecipeCategory.REDSTONE, button, 1, material);}
    }
    protected static void button(RecipeOutput output, ItemLike button, ItemLike material, ItemLike... additionalStonecuttingMaterials) {
        button(output, button, material, true);
        for(ItemLike item : additionalStonecuttingMaterials) {stonecutting(output, RecipeCategory.REDSTONE, button, 1, item);}
    }

    protected static void chiseled(RecipeOutput output, ItemLike chiseled, ItemLike material, boolean hasStonecutting){
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, chiseled, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(output, recipeID(chiseled, material));
        if(hasStonecutting) {stonecutting(output, RecipeCategory.BUILDING_BLOCKS, chiseled, 1, material);}
    }
    protected static void fence(RecipeOutput output, ItemLike fence, ItemLike material){
        fence(output, fence, 3, material, Items.STICK, false);
    }
    protected static void netherFence(RecipeOutput output, ItemLike fence, ItemLike material){
        fence(output, fence, 6, material, Items.NETHER_BRICK, true);
    }
    protected static void fence(RecipeOutput output, ItemLike fence, int count, ItemLike material, ItemLike stick, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fence, count).define('W', material).define('#', stick).pattern("W#W").pattern("W#W").unlockedBy(getHasName(material), has(material)).save(output, recipeID(fence, material));
        if(hasStonecutting) {stonecutting(output, RecipeCategory.DECORATIONS, fence, 1, material);}
    }
    protected static void fenceGate(RecipeOutput output, ItemLike fenceGate, ItemLike material){
        fenceGate(output, fenceGate, material, Items.STICK, false);
    }
    protected static void netherFenceGate(RecipeOutput output, ItemLike fenceGate, ItemLike material){
        fenceGate(output, fenceGate, material, Items.NETHER_BRICK, true);
    }
    protected static void fenceGate(RecipeOutput output, ItemLike fenceGate, ItemLike material, ItemLike stick, boolean hasStonecutting){
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, fenceGate).define('#', stick).define('W', material).pattern("#W#").pattern("#W#").unlockedBy(getHasName(material), has(material)).save(output, recipeID(fenceGate, material));
        if(hasStonecutting) {stonecutting(output, RecipeCategory.REDSTONE, fenceGate, 1, material);}
    }
    protected static void door(RecipeOutput output, ItemLike door, ItemLike material){
        doorBuilder(door, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(output, recipeID(door, material));
    }
    protected static void trapdoor(RecipeOutput output, ItemLike trapdoor, ItemLike material){
        trapdoorBuilder(trapdoor, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(output, recipeID(trapdoor, material));
    }

    protected static void torch(RecipeOutput output, ItemLike torch, ItemLike flammable){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, torch)
                .define('#', flammable)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("|")
                .unlockedBy(getHasName(flammable), has(flammable))
                .save(output, recipeID(torch, flammable));
    }
    protected static void torch(RecipeOutput output, ItemLike torch, TagKey<Item> flammable){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, torch)
                .define('#', flammable)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("|")
                .unlockedBy(getHasName(flammable), has(flammable))
                .save(output, recipeID(torch, flammable));
    }

    protected static void campfire(RecipeOutput output, ItemLike campfire, ItemLike flammable){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, campfire)
                .define('|', Items.STICK)
                .define('#', flammable)
                .define('O', ItemTags.LOGS_THAT_BURN)
                .pattern(" | ")
                .pattern("|#|")
                .pattern("OOO")
                .unlockedBy(getHasName(flammable), has(flammable))
                .save(output, recipeID(campfire, flammable));
    }
    protected static void campfire(RecipeOutput output, ItemLike campfire, TagKey<Item> flammable){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, campfire)
                .define('|', Items.STICK)
                .define('#', flammable)
                .define('O', ItemTags.LOGS_THAT_BURN)
                .pattern(" | ")
                .pattern("|#|")
                .pattern("OOO")
                .unlockedBy(getHasName(flammable), has(flammable))
                .save(output, recipeID(campfire, flammable));
    }

    protected static void lantern(RecipeOutput output, ItemLike lantern, ItemLike nugget, ItemLike torch){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, lantern)
                .define('|', nugget)
                .define('#', torch)
                .pattern("|||")
                .pattern("|#|")
                .pattern("|||")
                .unlockedBy(getHasName(torch), has(torch))
                .save(output, recipeID(lantern, nugget));
    }
    protected static void lantern(RecipeOutput output, ItemLike lantern, TagKey<Item> nugget, ItemLike torch){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, lantern)
                .define('|', nugget)
                .define('#', torch)
                .pattern("|||")
                .pattern("|#|")
                .pattern("|||")
                .unlockedBy(getHasName(torch), has(torch))
                .save(output, recipeID(lantern, nugget));
    }

    protected static void tools(RecipeOutput output, ItemLike sword, ItemLike axe, ItemLike pickaxe, ItemLike shovel, ItemLike hoe, ItemLike material){
        sword(output, sword, material);
        axe(output, axe, material);
        pickaxe(output, pickaxe, material);
        shovel(output, shovel, material);
        hoe(output, hoe, material);
    }
    protected static void tools(RecipeOutput output, ItemLike sword, ItemLike axe, ItemLike pickaxe, ItemLike shovel, ItemLike hoe, TagKey<Item> material){
        sword(output, sword, material);
        axe(output, axe, material);
        pickaxe(output, pickaxe, material);
        shovel(output, shovel, material);
        hoe(output, hoe, material);
    }
    protected static void sword(RecipeOutput output, ItemLike sword, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(sword, material));
    }
    protected static void sword(RecipeOutput output, ItemLike sword, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(sword, material));
    }
    protected static void axe(RecipeOutput output, ItemLike axe, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(axe, material));
    }
    protected static void axe(RecipeOutput output, ItemLike axe, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(axe, material));
    }
    protected static void pickaxe(RecipeOutput output, ItemLike pickaxe, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(pickaxe, material));
    }
    protected static void pickaxe(RecipeOutput output, ItemLike pickaxe, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(pickaxe, material));
    }
    protected static void shovel(RecipeOutput output, ItemLike shovel, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(shovel, material));
    }
    protected static void shovel(RecipeOutput output, ItemLike shovel, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(shovel, material));
    }
    protected static void hoe(RecipeOutput output, ItemLike hoe, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("##")
                .pattern("| ")
                .pattern("| ")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(hoe, material));
    }
    protected static void hoe(RecipeOutput output, ItemLike hoe, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe)
                .define('#', material)
                .define('|', Items.STICK)
                .pattern("##")
                .pattern("| ")
                .pattern("| ")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(hoe, material));
    }

    protected static void armor(RecipeOutput output, ItemLike helmet, ItemLike chestplate, ItemLike leggings, ItemLike boots, ItemLike material){
        helmet(output, helmet, material);
        chestplate(output, chestplate, material);
        leggings(output, leggings, material);
        boots(output, boots, material);
    }
    protected static void armor(RecipeOutput output, ItemLike helmet, ItemLike chestplate, ItemLike leggings, ItemLike boots, TagKey<Item> material){
        helmet(output, helmet, material);
        chestplate(output, chestplate, material);
        leggings(output, leggings, material);
        boots(output, boots, material);
    }
    protected static void helmet(RecipeOutput output, ItemLike helmet, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, helmet).define('#', material)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(helmet, material));
    }
    protected static void helmet(RecipeOutput output, ItemLike helmet, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, helmet).define('#', material)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(helmet, material));
    }
    protected static void chestplate(RecipeOutput output, ItemLike chestplate, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, chestplate).define('#', material)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(chestplate, material));
    }
    protected static void chestplate(RecipeOutput output, ItemLike chestplate, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, chestplate).define('#', material)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(chestplate, material));
    }
    protected static void leggings(RecipeOutput output, ItemLike leggings, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, leggings).define('#', material)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(leggings, material));
    }
    protected static void leggings(RecipeOutput output, ItemLike leggings, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, leggings).define('#', material)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(leggings, material));
    }
    protected static void boots(RecipeOutput output, ItemLike boots, ItemLike material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, boots).define('#', material)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(boots, material));
    }
    protected static void boots(RecipeOutput output, ItemLike boots, TagKey<Item> material){
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, boots).define('#', material)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(material), has(material))
                .save(output, recipeID(boots, material));
    }

    protected static void fourConversion(RecipeOutput output, RecipeCategory category, ItemLike to, int count, ItemLike from){
        ShapedRecipeBuilder.shaped(category, to, count).define('#', from)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(from), has(from))
                .save(output, recipeID(to, from));
    }

    protected static void nineBlockStorage(RecipeOutput output, RecipeCategory category, ItemLike unpacked, ItemLike packed) {
        ShapelessRecipeBuilder.shapeless(category, unpacked, 9).requires(packed).unlockedBy(getHasName(packed), has(packed)).save(output, recipeID(unpacked, packed));
        ShapedRecipeBuilder.shaped(category, packed).define('#', unpacked).pattern("###").pattern("###").pattern("###").unlockedBy(getHasName(unpacked), has(unpacked)).save(output, recipeID(packed, unpacked));
    }

    protected static void combine(RecipeOutput output, RecipeCategory category, ItemLike result, ItemLike block, ItemLike moss){
        ShapelessRecipeBuilder.shapeless(category, result).requires(block).requires(moss).unlockedBy(getHasName(block), has(block)).save(output, recipeID(result, block));
    }
    protected static void combine(RecipeOutput output, RecipeCategory category, ItemLike result, TagKey<Item> block, TagKey<Item> moss){
        ShapelessRecipeBuilder.shapeless(category, result).requires(block).requires(moss).unlockedBy(getHasName(block), has(block)).save(output, recipeID(result, block));
    }

    protected static void dying(RecipeOutput output, TagKey<Item> dyedItems, String idPattern, String group){
        for(var dye : DyeColor.values()){
            var resultID = location(idPattern.replace("{color}", dye.getName()));
            var dyeID = new ResourceLocation(dye.getName() + "_dye");
            var result = BuiltInRegistries.ITEM.get(resultID);
            var dyeItem = BuiltInRegistries.ITEM.get(dyeID);
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result).requires(dyedItems).requires(dyeItem).group(group).unlockedBy("has_needed_dye", has(dyeItem)).save(output, location("dye_" + getItemName(result)));
        }
    }

    protected static void oreSmelting(RecipeOutput output, ItemLike ingot, ItemLike raw){
        smelting(output, RecipeCategory.MISC, ingot, raw, 0.7f, 200);
        blasting(output, RecipeCategory.MISC, ingot, raw, 0.7f, 100);
    }
    protected static void oreSmelting(RecipeOutput output, ItemLike ingot, TagKey<Item> raw){
        smelting(output, RecipeCategory.MISC, ingot, raw, 0.7f, 200);
        blasting(output, RecipeCategory.MISC, ingot, raw, 0.7f, 100);
    }
    protected static void stoneSmelting(RecipeOutput output, ItemLike ingot, TagKey<Item> raw){
        smelting(output, RecipeCategory.BUILDING_BLOCKS, ingot, raw, 0.1f, 200);
    }
    protected static void stoneSmelting(RecipeOutput output, ItemLike ingot, ItemLike raw){
        smelting(output, RecipeCategory.BUILDING_BLOCKS, ingot, raw, 0.1f, 200);
    }

    protected static void shapeless(RecipeOutput output, RecipeCategory category, ItemLike result, int countR, ItemLike material, int countM){
        ShapelessRecipeBuilder.shapeless(category, result, countR).requires(material, countM).unlockedBy(getHasName(material), has(material)).save(output, recipeID(result, material));
    }
    protected static void shapeless(RecipeOutput output, RecipeCategory category, ItemLike result, int countR, TagKey<Item> material, int countM){
        ShapelessRecipeBuilder.shapeless(category, result, countR).requires(Ingredient.of(material), countM).unlockedBy(getHasName(material), has(material)).save(output, recipeID(result, material));
    }
    protected static void stonecutting(RecipeOutput output, RecipeCategory category, ItemLike result, int count, ItemLike material){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(material), category, result, count).unlockedBy(getHasName(material), has(material)).save(output, stonecuttingRecipeID(result, material));
    }
    protected static void smelting(RecipeOutput output, RecipeCategory category, ItemLike result, ItemLike ingredient, float xp, int time) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), category, result, xp, time).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, smeltingRecipeID(result, ingredient));
    }
    protected static void smelting(RecipeOutput output, RecipeCategory category, ItemLike result, TagKey<Item> ingredient, float xp, int time) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), category, result, xp, time).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, smeltingRecipeID(result, ingredient));
    }
    protected static void blasting(RecipeOutput output, RecipeCategory category, ItemLike result, ItemLike ingredient, float xp, int time) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), category, result, xp, time).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, blastingRecipeID(result, ingredient));
    }
    protected static void blasting(RecipeOutput output, RecipeCategory category,  ItemLike result, TagKey<Item> ingredient, float xp, int time) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), category, result, xp, time).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, blastingRecipeID(result, ingredient));
    }
    protected static void smoking(RecipeOutput output, ItemLike result, ItemLike ingredient, float xp, int time) {
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, xp, time).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, smokingRecipeID(result, ingredient));
    }
    protected static void smoking(RecipeOutput output, ItemLike result, TagKey<Item> ingredient, float xp, int time) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), RecipeCategory.FOOD, result, xp, time).unlockedBy(getHasName(ingredient), has(ingredient)).save(output, smokingRecipeID(result, ingredient));
    }

    protected static ResourceLocation recipeID(ItemLike result, ItemLike material) {
        String itemID = itemID(result);
        ResourceLocation recipeID = location(itemID);
        if(_recipes.contains(recipeID)){
            return location(getConversionRecipeName(itemID, material));
        }
        return recipeID;
    }
    protected static ResourceLocation recipeID(ItemLike result, TagKey<Item> material) {
        String itemID = itemID(result);
        ResourceLocation recipeID = location(itemID);
        if(_recipes.contains(recipeID)){
            return location(getConversionRecipeName(itemID, material));
        }
        return recipeID;
    }

    protected static ResourceLocation stonecuttingRecipeID(String key) {
        return location("stonecutting/" + key);
    }
    protected static ResourceLocation stonecuttingRecipeID(ItemLike result, ItemLike ingredient) {
        String itemID = itemID(result);
        ResourceLocation recipeID = stonecuttingRecipeID(itemID);
        if(_recipes.contains(recipeID)){
            return location("stonecutting/" + getConversionRecipeName(itemID, ingredient));
        }
        return recipeID;
    }
    protected static ResourceLocation smeltingRecipeID(String key) {
        return location("smelting/" + key);
    }
    protected static ResourceLocation smeltingRecipeID(ItemLike result, ItemLike ingredient) {
        String itemID = itemID(result);
        ResourceLocation recipeID = smeltingRecipeID(itemID);
        if(_recipes.contains(recipeID)){
            return location("smelting/" + getConversionRecipeName(itemID, ingredient));
        }
        return recipeID;
    }
    protected static ResourceLocation smeltingRecipeID(ItemLike result, TagKey<Item> ingredient) {
        String itemID = itemID(result);
        ResourceLocation recipeID = smeltingRecipeID(itemID);
        if(_recipes.contains(recipeID)){
            return location("smelting/" + getConversionRecipeName(itemID, ingredient));
        }
        return recipeID;
    }
    protected static ResourceLocation blastingRecipeID(String key) {
        return location("blasting/" + key);
    }
    protected static ResourceLocation blastingRecipeID(ItemLike result, ItemLike ingredient) {
        String itemID = itemID(result);
        ResourceLocation recipeID = blastingRecipeID(itemID);
        if(_recipes.contains(recipeID)){
            return location("blasting/" + getConversionRecipeName(itemID, ingredient));
        }
        return recipeID;
    }
    protected static ResourceLocation blastingRecipeID(ItemLike result, TagKey<Item> ingredient) {
        String itemID = itemID(result);
        ResourceLocation recipeID = blastingRecipeID(itemID);
        if(_recipes.contains(recipeID)){
            return location("blasting/" + getConversionRecipeName(itemID, ingredient));
        }
        return recipeID;
    }

    protected static ResourceLocation smokingRecipeID(String key) {
        return location("smoking/" + key);
    }
    protected static ResourceLocation smokingRecipeID(ItemLike result, ItemLike ingredient) {
        String itemID = itemID(result);
        ResourceLocation recipeID = smokingRecipeID(itemID);
        if(_recipes.contains(recipeID)){
            return location("smoking/" + getConversionRecipeName(itemID, ingredient));
        }
        return recipeID;
    }
    protected static ResourceLocation smokingRecipeID(ItemLike result, TagKey<Item> ingredient) {
        String itemID = itemID(result);
        ResourceLocation recipeID = smokingRecipeID(itemID);
        if(_recipes.contains(recipeID)){
            return location("smoking/" + getConversionRecipeName(itemID, ingredient));
        }
        return recipeID;
    }

    protected static String getConversionRecipeName(String result, ItemLike ingredient){
        return result + "_from_" + getItemName(ingredient);
    }

    protected static String getConversionRecipeName(String result, TagKey<Item> ingredient){
        return result + "_from_" + getItemTagName(ingredient);
    }

    protected static String getHasName(TagKey<Item> tag) {return "has_" + tag.location().getPath().replace('/', '_');}
    protected static String itemID(ItemLike item) {return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item.asItem())).getPath();}
    protected static String getItemTagName(TagKey<Item> tag) {return tag.location().getPath().replace('/', '_');}
    protected static ResourceLocation location(String key) {
        if(key.contains(":")){
            return ResourceLocation.of(key, ':');
        }
        return new ResourceLocation(currentModID, key);
    }
}