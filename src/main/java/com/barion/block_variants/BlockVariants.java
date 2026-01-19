package com.barion.block_variants;

import com.ametrinstudios.ametrin.data.provider.CustomLootTableProvider;
import com.barion.block_variants.data.provider.*;
import com.barion.block_variants.data.provider.loot_table.BVBlockLootProvider;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVColoredBlocks;
import com.barion.block_variants.registry.BVItems;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

import java.util.function.Supplier;
import java.util.stream.Stream;

@Mod(BlockVariants.MOD_ID)
public final class BlockVariants {
    public static final String MOD_ID = "block_variants";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BlockVariants(IEventBus modBus) {
        BVBuildingBlocks.REGISTER.register(modBus);
        BVColoredBlocks.REGISTER.register(modBus);
        BVOtherBlocks.REGISTER.register(modBus);
        BVItems.REGISTER.register(modBus);
        modBus.addListener(BlockVariants::buildCreativeModeTabs);
        modBus.addListener(BlockVariants::gatherData);
    }

    public static Identifier locate(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    private static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            BVBuildingBlocks.REGISTER.getEntries().forEach((blockHolder) -> event.accept(blockHolder.get()));
            event.insertAfter(Items.GOLD_BLOCK.getDefaultInstance(), BVOtherBlocks.GOLD_GRATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BVOtherBlocks.GOLD_GRATE.asItem().getDefaultInstance(), BVOtherBlocks.GOLD_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.LIGHT_WEIGHTED_PRESSURE_PLATE.getDefaultInstance(), BVOtherBlocks.GOLD_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            BVColoredBlocks.REGISTER.getEntries().forEach((blockHolder) -> event.accept(blockHolder.get()));
        }

        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS){
            event.insertAfter(Items.IRON_CHAIN.getDefaultInstance(), BVOtherBlocks.GOLD_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    public static Stream<Block> getAllBlocks() {
        return Stream.concat(Stream.concat(BVBuildingBlocks.REGISTER.getEntries().stream(), BVColoredBlocks.REGISTER.getEntries().stream()), BVOtherBlocks.REGISTER.getEntries().stream()).map(Supplier::get);
    }

    private static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(BVModelProvider::new);
        event.createProvider(BVRecipeProvider.Runner::new);
        event.createProvider(BVDataMapProvider::new);
        event.createProvider(BVBlockTagsProvider::new);
        event.createProvider(BVItemTagsProvider::new);
        event.createProvider(CustomLootTableProvider.builder().addBlockProvider(BVBlockLootProvider::new)::build);
    }
}