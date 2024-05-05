package com.ametrinstudios.ametrin.data.provider.loot_table;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class ExtendedBlockLootSubProvider extends BlockLootSubProvider {
    protected ExtendedBlockLootSubProvider() {
        this(Set.of());
    }
    protected ExtendedBlockLootSubProvider(Set<Item> explosionResistant) {
        super(explosionResistant, FeatureFlags.REGISTRY.allFlags());
    }

    protected void dropLeaveLoot(Block block, SaplingBlock sapling){add(block, createLeavesDrops(block, sapling, NORMAL_LEAVES_SAPLING_CHANCES));}
    protected void dropDoor(DoorBlock door){add(door, createDoorTable(door));}
    protected void dropOre(Block block, ItemLike drop){add(block, createOreDrop(block, drop.asItem()));}
    protected void dropDoublePlant(DoublePlantBlock plant){add(plant, createSinglePropConditionTable(plant, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));}
    protected void dropDoublePlantOther(DoublePlantBlock plant, ItemLike drop){add(plant, createSinglePropConditionTableDropOther(plant, drop, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));}

    protected void dropCampfire(CampfireBlock campfireBlock, ItemLike charcoal){
        add(campfireBlock, createSilkTouchDispatchTable(campfireBlock, applyExplosionCondition(campfireBlock, LootItem.lootTableItem(charcoal).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2))))));

    }
    protected <T extends Comparable<T> & StringRepresentable> LootTable.Builder createSinglePropConditionTableDropOther(Block block, ItemLike dropItem, Property<T> property, T validValue){
        return LootTable.lootTable().withPool(applyExplosionCondition(block, LootPool.lootPool().setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(dropItem)
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, validValue))))));
    }

    @SafeVarargs
    protected final <T extends Block> void dropSelf(final T... blocks) {
        dropSelf(Arrays.stream(blocks).iterator());
    }
    protected   <T extends Block> void dropSelf(Iterator<T> blocks) {blocks.forEachRemaining(this::dropSelf);}
    @Override
    protected abstract @NotNull Iterable<Block> getKnownBlocks();
}