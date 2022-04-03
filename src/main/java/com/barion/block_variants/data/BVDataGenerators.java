package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BlockVariants.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BVDataGenerators {
    private BVDataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(new BVBlockStateProvider(generator, fileHelper));
        generator.addProvider(new BVItemModelProvider(generator, fileHelper));
        BVBlockTagsProvider blockTags = new BVBlockTagsProvider(generator, fileHelper);
        generator.addProvider(blockTags);
        generator.addProvider(new BVItemTagsProvider(generator, blockTags, fileHelper));
        generator.addProvider(new BVRecipeProvider(generator));
        generator.addProvider(new BVLootTableProvider(generator));
    }

}
