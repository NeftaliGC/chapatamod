package com.nintech.chapatamod.items;

import com.nintech.chapatamod.ChapataMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.time.Duration;

public class ChapataItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChapataMod.MODID);

    public static final RegistryObject<Item> CHAPATA = ITEMS.register("chapata_bbq",
            () -> new Item(new Item.Properties().stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.2f)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION,200,2),1f)
                            .build())
                    .rarity(Rarity.EPIC)
            ));
}
