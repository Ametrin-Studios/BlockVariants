package com.ametrin.block_variants.data.provider;

import com.ametrin.block_variants.BlockVariants;
import com.ametrin.block_variants.registry.BVItems;
import com.ametrin.block_variants.registry.BVOtherBlocks;
import com.ametrin.block_variants.registry.BVTags;
import com.ametrinstudios.ametrin.data.provider.ExtendedLanguageProvider;
import net.minecraft.data.PackOutput;

public final class BVLanguageProvider extends ExtendedLanguageProvider {
    public BVLanguageProvider(PackOutput output) {
        super(output, BlockVariants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        BVItems.REGISTER.getEntries().forEach(item -> {
            if (item.getId().getPath().contains("gold")) return;
            addHumanized(item);
        });

        family("Golden")
                .bars(BVOtherBlocks.GOLD_BARS)
                .chain(BVOtherBlocks.GOLD_CHAIN)
                .grate(BVOtherBlocks.GOLD_GRATE)
        ;

        add(BVTags.Items.STONE_CRAFTING, "Stone Crafting Materials");
        addHumanized(BVTags.Items.WOODEN_WALLS);
        addHumanized(BVTags.Items.CONCRETE_WALLS);
        addHumanized(BVTags.Items.WOOL_WALLS);
    }
}
