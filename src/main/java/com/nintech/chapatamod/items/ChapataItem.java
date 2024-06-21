package com.nintech.chapatamod.items;

import com.nintech.chapatamod.ChapataMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ChapataItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChapataMod.MODID);

    public static final RegistryObject<Item> CHAPATA = ITEMS.register("chapata",
            () -> new Item(new Item.Properties().stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.2f)
                            .build())
                    .rarity(Rarity.EPIC)

            ));
}
