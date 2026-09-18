package com.barion.block_variants.registry;

import com.ametrinstudios.ametrin.data.DataProviderExtensions;
import com.barion.block_variants.BlockVariants;
import net.minecraft.data.BlockFamilies;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class BVItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(BlockVariants.MOD_ID);

    static {
        REGISTER.addAlias(BlockVariants.locate("tuff_stairs"), DataProviderExtensions.getItemKey(Items.TUFF_STAIRS));
        REGISTER.addAlias(BlockVariants.locate("tuff_slab"), DataProviderExtensions.getItemKey(Items.TUFF_SLAB));
        REGISTER.addAlias(BlockVariants.locate("tuff_wall"), DataProviderExtensions.getItemKey(Items.TUFF_WALL));

        for (var woolFamily : BlockFamilies.WOOL.asList()) {
            for (var variant : woolFamily.getVariants().entrySet()) {
                var key = DataProviderExtensions.getBlockKey(variant.getValue());
                REGISTER.addAlias(BlockVariants.locate(key.getPath()), key);
            }
        }
    }
}
