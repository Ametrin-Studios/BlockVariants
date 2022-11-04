package com.barion.block_variants;

import com.barion.block_variants.data.*;
import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BlockVariants.ModID)
public class BlockVariants{
    public static final String ModID = "block_variants";
    public static final Logger Logger = LogUtils.getLogger();

    public BlockVariants() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BVBlocks.BlockRegistry.register(modBus);
        BVBlocks.ItemRegistry.register(modBus);
        modBus.addListener(BVDataGenerators::gatherData);
    }
    public static class BVDataGenerators{
        private BVDataGenerators(){}
        public static void gatherData(GatherDataEvent event){
            DataGenerator generator = event.getGenerator();
            ExistingFileHelper fileHelper = event.getExistingFileHelper();

            generator.addProvider(true, new BVBlockStateProvider(generator, fileHelper));
            generator.addProvider(true, new BVItemModelProvider(generator, fileHelper));
            BVBlockTagsProvider blockTags = new BVBlockTagsProvider(generator, fileHelper);
            generator.addProvider(true, blockTags);
            generator.addProvider(true, new BVItemTagsProvider(generator, blockTags, fileHelper));
            generator.addProvider(true, new BVRecipeProvider(generator));
            generator.addProvider(true, new BVLootTableProvider(generator));
        }
    }
}