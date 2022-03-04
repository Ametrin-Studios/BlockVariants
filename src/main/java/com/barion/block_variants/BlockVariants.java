package com.barion.block_variants;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BlockVariants.Mod_ID)
public class BlockVariants{
    public static final String Mod_ID = "block_variants";
    public static final Logger LOGGER = LogManager.getLogger();

    public BlockVariants() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BVBlocks.ItemRegistry.register(modBus);
        BVBlocks.BlockRegistry.register(modBus);
    }
}