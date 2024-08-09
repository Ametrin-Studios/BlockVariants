package com.barion.block_variants.registry;

import com.barion.block_variants.BVUtil;
import com.barion.block_variants.BlockVariants;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class BVItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(BlockVariants.MOD_ID);

    static {
        REGISTER.addAlias(BlockVariants.locate("tuff_stairs"), BVUtil.getItemID(Items.TUFF_STAIRS));
        REGISTER.addAlias(BlockVariants.locate("tuff_slab"), BVUtil.getItemID(Items.TUFF_SLAB));
        REGISTER.addAlias(BlockVariants.locate("tuff_wall"), BVUtil.getItemID(Items.TUFF_WALL));
    }
}
