package com.nintech.chapatamod.items;

import com.nintech.chapatamod.ChapataMod;
import com.nintech.chapatamod.blocks.ChapataBlockInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.nintech.chapatamod.items.CreativeTabInit.addToTab;
import static com.nintech.chapatamod.blocks.ChapataBlockInit.*;

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

    public static final RegistryObject<Item> CHAPATA_TROPICAL = addToTab(ITEMS.register("chapata_tropical",
            () -> new Item(new Item.Properties().stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(7)
                            .saturationModifier(0.5f)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION,200,2),1f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));

    public static final RegistryObject<Item> PINEAPPLE = addToTab(ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.5f)
                            .build())
                    .rarity(Rarity.COMMON)
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
    public static final RegistryObject<Item> CUCHILLO = addToTab(ITEMS.register("cuchillo",
            () -> new Item(new Item.Properties().stacksTo(1)
                    .durability(50)
                    .rarity(Rarity.EPIC)
            )));
    public static final RegistryObject<Item> TOMATE = addToTab(ITEMS.register("tomate",
            () -> new Item(new Item.Properties().stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.5f)
                            .build())
                    .rarity(Rarity.COMMON)
            )));
    public static final RegistryObject<Item> SALSA_ITALIANA = addToTab(ITEMS.register("salsa_italiana",
            () -> new Item(new Item.Properties().stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationModifier(0.5f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));

    public static final RegistryObject<Item> PEPERONI = addToTab(ITEMS.register("peperoni",
            () -> new Item(new Item.Properties().stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationModifier(0.5f)
                            .build())
                    .rarity(Rarity.EPIC)
            )));
    //Semilla Piña
    public static final RegistryObject<BlockItem> SEMILLA_PINA = addToTab(ITEMS.register("semilla_pina",
            () -> new BlockItem(CROP_PINA.get(),new Item.Properties().
                    rarity(Rarity.COMMON))
            ));

}
