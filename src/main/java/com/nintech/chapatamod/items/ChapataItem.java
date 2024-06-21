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

import static com.nintech.chapatamod.items.CreativeTabInit.addToTab;


public class ChapataItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChapataMod.MODID);

    public static final RegistryObject<Item> CHAPATA_BBQ = addToTab(ITEMS.register("chapata_bbq",
            () -> new Item(new Item.Properties().stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(7)
                            .saturationModifier(0.5f)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION,200,2),1f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));


    public static final RegistryObject<Item> CHAPATA_CHICKEN = addToTab(ITEMS.register("chapata_chicken",
            () -> new Item(new Item.Properties().stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(7)
                            .saturationModifier(0.5f)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION,200,2),1f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));
    public static final RegistryObject<Item> QUESO = addToTab(ITEMS.register("queso",
            () -> new Item(new Item.Properties().stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.2f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));
    public static final RegistryObject<Item> SALSA_BBQ = addToTab(ITEMS.register("salsa_bbq",
            () -> new Item(new Item.Properties().stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationModifier(0.2f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));
    public static final RegistryObject<Item> PAN_CORTADO = addToTab(ITEMS.register("pan_cortado",
            () -> new Item(new Item.Properties().stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationModifier(0.5f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));
}
