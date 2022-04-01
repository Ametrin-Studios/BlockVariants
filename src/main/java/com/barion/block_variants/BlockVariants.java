package com.barion.block_variants;

import com.barion.block_variants.data.*;
import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.slf4j.Logger;


@Mod(BlockVariants.ModID)
public class BlockVariants{
    public static final String ModID = "block_variants";
    public static final Logger Logger = LogUtils.getLogger();

    public BlockVariants() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BVBlocks.ItemRegistry.register(modBus);
        BVBlocks.BlockRegistry.register(modBus);
    }

    @Mod.EventBusSubscriber(modid = BlockVariants.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class BVDataGenerators{
        private BVDataGenerators(){}

        @SubscribeEvent
        public static void gatherData(GatherDataEvent event){
            DataGenerator generator = event.getGenerator();
            ExistingFileHelper fileHelper = event.getExistingFileHelper();

            generator.addProvider(new BVBlockStateProvider(generator, fileHelper));
            generator.addProvider(new BVItemModelProvider(generator, fileHelper));
            BVBlockTagsProvider blockTags = new BVBlockTagsProvider(generator, fileHelper);
            generator.addProvider(blockTags);
            generator.addProvider(new BVItemTagsProvider(generator, blockTags, fileHelper));
            generator.addProvider(new BVRecipes(generator));
            generator.addProvider(new BVLootTableProvider(generator));
        }

    }
}