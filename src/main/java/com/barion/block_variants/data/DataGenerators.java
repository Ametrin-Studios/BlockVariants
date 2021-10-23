package com.barion.block_variants.data;

import com.barion.block_variants.BlockVariants;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = BlockVariants.Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(new ModBlockModels(generator, fileHelper));
        generator.addProvider(new ModItemModels(generator, fileHelper));
        ModBlockTags blockTags = new ModBlockTags(generator, fileHelper);
        generator.addProvider(blockTags);
        generator.addProvider(new ModItemTags(generator, blockTags, fileHelper));
        generator.addProvider(new ModRecipes(generator));
        generator.addProvider(new ModLootTables(generator));
    }

}
