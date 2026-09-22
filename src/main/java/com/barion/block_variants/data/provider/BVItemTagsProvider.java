package com.barion.block_variants.data.provider;

import com.ametrinstudios.ametrin.data.provider.ExtendedItemTagsProvider;
import com.barion.block_variants.BlockVariants;
import com.barion.block_variants.registry.BVBuildingBlocks;
import com.barion.block_variants.registry.BVItems;
import com.barion.block_variants.registry.BVOtherBlocks;
import com.barion.block_variants.registry.BVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.common.Tags;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public final class BVItemTagsProvider extends ExtendedItemTagsProvider {
    public BVItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider, BlockVariants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        runRules(BVItems.REGISTER);

        new BVBlockItemTagsProvider() {
            @Override
            protected TagAppender<Block, Block> tag(TagKey<Block> blockTag, TagKey<Item> itemTag) {
                return new BlockToItemConverter(BVItemTagsProvider.this.tag(itemTag));
            }
        }.run();
        tag(BVTags.Items.STONE_CRAFTING).addTags(ItemTags.STONE_CRAFTING_MATERIALS, Tags.Items.STONES);

        tag(ItemTags.PIGLIN_LOVED).add(
                BVOtherBlocks.GOLD_BARS.asItem(),
                BVOtherBlocks.GOLD_CHAIN.asItem(),
                BVOtherBlocks.GOLD_GRATE.asItem()
        );

        var non_flammable_wood = tag(ItemTags.NON_FLAMMABLE_WOOD);

        BVBuildingBlocks.queryWooden(Set.of(WoodType.CRIMSON, WoodType.WARPED)).forEach(block -> non_flammable_wood.add(block.asItem()));
    }
}