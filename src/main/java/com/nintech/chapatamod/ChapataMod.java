package com.nintech.chapatamod;

import com.nintech.chapatamod.Helper.ClientSetup;
import com.nintech.chapatamod.items.ChapataItem;
import com.nintech.chapatamod.items.CreativeTabInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.nintech.chapatamod.blocks.ChapataBlockInit.*;

@Mod(ChapataMod.MODID)
@EventBusSubscriber(modid = ChapataMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChapataMod {
    public static final String MODID = "chapatamod";

    public ChapataMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ChapataItem.ITEMS.register(bus);
        CreativeTabInit.TABS.register(bus);
        BLOCKS.register(bus);
        bus.addListener(ClientSetup::clientSetup);
    }

}
