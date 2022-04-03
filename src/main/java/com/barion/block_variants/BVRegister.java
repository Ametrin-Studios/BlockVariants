package com.barion.block_variants;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BVRegister {
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockVariants.ModID);
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, BlockVariants.ModID);

    public static void onRegister(){
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.register(modBus);
        Items.register(modBus);

        BVBlocks.register();
    }
}