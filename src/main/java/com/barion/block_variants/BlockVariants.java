package com.barion.block_variants;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BlockVariants.Mod_ID)
public class BlockVariants{
    public static final String Mod_ID = "block_variants";
    public static final Logger LOGGER = LogManager.getLogger();

    public BlockVariants() {
        BVRegister.onRegister();
        MinecraftForge.EVENT_BUS.register(this);
    }
}