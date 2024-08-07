package com.barion.block_variants;

import com.ametrinstudios.ametrin.data.DataProviderHelper;
import com.barion.block_variants.data.provider.*;
import com.barion.block_variants.data.provider.loot_table.BVBlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(BlockVariants.MOD_ID)
public final class BlockVariants{
    public static final String MOD_ID = "block_variants";
//    public static final Logger Logger = LogUtils.getLogger();

    public BlockVariants(IEventBus modBus) {
        BVBlocks.BLOCK_REGISTER.register(modBus);
        BVBlocks.ITEM_REGISTER.register(modBus);
        modBus.addListener(BlockVariants::buildCreativeModeTabs);
        modBus.addListener(BlockVariants::gatherData);
    }

    public static ResourceLocation locate(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    private static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() != CreativeModeTabs.BUILDING_BLOCKS) return;
        BVBlocks.BLOCK_REGISTER.getEntries().forEach((blockHolder)-> event.accept(blockHolder.get()));
    }

    private static void gatherData(GatherDataEvent event){
        var helper = new DataProviderHelper(event);

        helper.add(BVBlockStateProvider::new);
        helper.add(BVItemModelProvider::new);
        helper.add(BVRecipeProvider::new);
        helper.addBlockAndItemTags(BVBlockTagsProvider::new, BVItemTagsProvider::new);
        helper.addLootTables(builder -> builder.addBlockProvider(BVBlockLootSubProvider::new));
    }
}