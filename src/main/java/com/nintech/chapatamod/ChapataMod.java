package com.nintech.chapatamod;

import com.nintech.chapatamod.items.ChapataItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ChapataMod.MODID)
public class ChapataMod {
    public static final String MODID = "chapatamod";

    public ChapataMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ChapataItem.ITEMS.register(bus);

    }
}
