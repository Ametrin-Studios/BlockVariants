package com.barion.block_variants;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BVRegister {
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockVariants.Mod_ID);
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, BlockVariants.Mod_ID);

    public static void onRegister(){
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.register(modBus);
        Items.register(modBus);

        BVBlocks.register();
    }
}