package com.barion.block_variants;

import com.ametrinstudios.ametrin.data.provider.CustomLootTableProvider;
import com.barion.block_variants.data.provider.*;
import com.barion.block_variants.data.provider.loot_table.BVBlockLootSubProvider;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

@Mod(BlockVariants.MOD_ID)
public class BlockVariants{
    public static final String MOD_ID = "block_variants";
    public static final Logger Logger = LogUtils.getLogger();

    public BlockVariants(IEventBus modBus) {
        BVBlocks.BLOCK_REGISTER.register(modBus);
        BVBlocks.ITEM_REGISTER.register(modBus);
        modBus.addListener(BlockVariants::buildCreativeModeTabs);
        modBus.addListener(BlockVariants::gatherData);
    }

    private static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() != CreativeModeTabs.BUILDING_BLOCKS) return;
        BVBlocks.BLOCK_REGISTER.getEntries().forEach((o)-> event.accept(o.get()));
    }

    private static void gatherData(GatherDataEvent event){
        var generator = event.getGenerator();
        var output = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookup = event.getLookupProvider();

        var runClient = event.includeClient();
        var runServer = event.includeServer();

        generator.addProvider(runServer, new BVBlockStateProvider(output, existingFileHelper));
        generator.addProvider(runServer, new BVItemModelProvider(output, existingFileHelper));
        BVBlockTagsProvider blockTags = new BVBlockTagsProvider(output, lookup, existingFileHelper);
        generator.addProvider(runServer, blockTags);
        generator.addProvider(runServer, new BVItemTagsProvider(output, lookup, blockTags.contentsGetter(), existingFileHelper));
        generator.addProvider(runServer, new BVRecipeProvider(output, lookup));
        var lootTableProvider = CustomLootTableProvider.Builder().AddBlockProvider(BVBlockLootSubProvider::new).Build(output);
        generator.addProvider(runServer, lootTableProvider);
    }
}