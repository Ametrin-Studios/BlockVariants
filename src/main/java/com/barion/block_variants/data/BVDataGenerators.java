package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BlockVariants.Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BVDataGenerators {
    private BVDataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(new BVBlockStates(generator, fileHelper));
        generator.addProvider(new BVItemModels(generator, fileHelper));
        BVBlockTagger blockTags = new BVBlockTagger(generator, fileHelper);
        generator.addProvider(blockTags);
        generator.addProvider(new BVItemTagger(generator, blockTags, fileHelper));
        generator.addProvider(new BVRecipes(generator));
        generator.addProvider(new BVLootTables(generator));
    }

}
