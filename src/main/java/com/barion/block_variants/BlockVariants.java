package com.barion.block_variants;

import com.barion.block_variants.data.*;
import com.mojang.logging.LogUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(BlockVariants.ModID)
public class BlockVariants{
    public static final String ModID = "block_variants";
    public static final Logger Logger = LogUtils.getLogger();

    public BlockVariants() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BVBlocks.BlockRegistry.register(modBus);
        BVBlocks.ItemRegistry.register(modBus);
        modBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() != CreativeModeTabs.BUILDING_BLOCKS) { return; }
        BVBlocks.BlockRegistry.getEntries().forEach((o)-> event.accept(o.get()));
    }

    @Mod.EventBusSubscriber(modid = BlockVariants.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class BVDataGenerators{
        private BVDataGenerators(){}

        @SubscribeEvent
        public static void gatherData(GatherDataEvent event){
            DataGenerator generator = event.getGenerator();
            PackOutput packOutput = generator.getPackOutput();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            generator.addProvider(true, new BVBlockStateProvider(packOutput, existingFileHelper));
            generator.addProvider(true, new BVItemModelProvider(packOutput, existingFileHelper));
            BVBlockTagsProvider blockTags = new BVBlockTagsProvider(packOutput, lookupProvider, existingFileHelper);
            generator.addProvider(true, blockTags);
            generator.addProvider(true, new BVItemTagsProvider(packOutput, lookupProvider, blockTags, existingFileHelper));
            generator.addProvider(true, new BVRecipeProvider(packOutput));
            generator.addProvider(true, new BVLootTableProvider(packOutput));
        }
    }
}