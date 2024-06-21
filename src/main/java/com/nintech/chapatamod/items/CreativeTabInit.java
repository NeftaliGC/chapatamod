package com.nintech.chapatamod.items;

import com.nintech.chapatamod.ChapataMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ChapataMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChapataMod.MODID);

    public static final List<Supplier<? extends ItemLike>> CHAPATA_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> CHAPATA_TAB = TABS.register("chapata_tab",
            ()-> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.chapata_tab"))
                    .icon(ChapataItem.CHAPATA_BBQ.get()::getDefaultInstance)
                    .displayItems((displayParams, output)->{
                       CHAPATA_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );
    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        CHAPATA_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event){
        if (event.getTabKey() == CreativeModeTab.){

        }
    }
}
