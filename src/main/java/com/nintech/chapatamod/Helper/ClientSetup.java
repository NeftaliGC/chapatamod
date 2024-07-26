package com.nintech.chapatamod.Helper;

import com.nintech.chapatamod.ChapataMod;
import com.nintech.chapatamod.blocks.ChapataBlockInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ChapataMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(ChapataBlockInit.PINA_CROP.get(), RenderType.cutout());
    }

}
