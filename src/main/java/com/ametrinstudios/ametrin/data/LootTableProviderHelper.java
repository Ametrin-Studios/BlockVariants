package com.ametrinstudios.ametrin.data;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public final class LootTableProviderHelper {
    public static LootPoolEntryContainer.Builder<?> item(ItemLike item, int weight, NumberProvider amount){
        return LootItem.lootTableItem(item).setWeight(weight).apply(SetItemCountFunction.setCount(amount));
    }
    public static LootPoolEntryContainer.Builder<?> tag(TagKey<Item> tagKey, int weight, NumberProvider amount){
        return TagEntry.expandTag(tagKey).setWeight(weight).apply(SetItemCountFunction.setCount(amount));
    }
    public static LootPoolEntryContainer.Builder<?> enchantedItem(ItemLike item, int weight, NumberProvider enchant, NumberProvider amount, HolderLookup.Provider provider){
        return LootItem.lootTableItem(item).setWeight(weight).apply(SetItemCountFunction.setCount(amount)).apply(EnchantWithLevelsFunction.enchantWithLevels(provider, enchant));
    }
    public static LootPoolEntryContainer.Builder<?> enchantedItem(ItemLike item, int weight, NumberProvider amount, HolderLookup.Provider provider){
        return LootItem.lootTableItem(item).setWeight(weight).apply(SetItemCountFunction.setCount(amount)).apply(EnchantRandomlyFunction.randomApplicableEnchantment(provider));
    }
    public static LootPoolEntryContainer.Builder<?> suspiciousStew(int weight, NumberProvider amount){
        return LootItem.lootTableItem(Items.SUSPICIOUS_STEW).setWeight(weight).apply(SetItemCountFunction.setCount(amount)).apply(SetStewEffectFunction.stewEffect().withEffect(MobEffects.NIGHT_VISION, number(7, 10)).withEffect(MobEffects.JUMP, number(7, 10)).withEffect(MobEffects.WEAKNESS, number(6, 8)).withEffect(MobEffects.BLINDNESS, number(5, 7)).withEffect(MobEffects.POISON, number(10, 20)).withEffect(MobEffects.SATURATION, number(7, 10)));
    }
    public static LootPoolEntryContainer.Builder<?> potion(int weight, Holder<Potion> potion, NumberProvider amount){
        return LootItem.lootTableItem(Items.POTION).setWeight(weight).apply(SetItemCountFunction.setCount(amount)).apply(SetPotionFunction.setPotion(potion));
    }
    public static LootPoolEntryContainer.Builder<?> splashPotion(int weight, Holder<Potion> potion, NumberProvider amount){
        return LootItem.lootTableItem(Items.SPLASH_POTION).setWeight(weight).apply(SetItemCountFunction.setCount(amount)).apply(SetPotionFunction.setPotion(potion));
    }
    public static LootPoolEntryContainer.Builder<?> lingeringPotion(int weight, Holder<Potion> potion, NumberProvider amount){
        return LootItem.lootTableItem(Items.LINGERING_POTION).setWeight(weight).apply(SetItemCountFunction.setCount(amount)).apply(SetPotionFunction.setPotion(potion));
    }

    public static NumberProvider one() {return number(1);}
    public static NumberProvider number(int amount) {return ConstantValue.exactly(amount);}
    public static NumberProvider number(int min, int max) {return UniformGenerator.between(min, max);}
    public static LootPool.Builder pool(NumberProvider rolls) {return LootPool.lootPool().setRolls(rolls);}
}
