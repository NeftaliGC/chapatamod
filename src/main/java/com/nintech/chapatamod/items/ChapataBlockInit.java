package com.nintech.chapatamod.items;

import com.nintech.chapatamod.ChapataMod;
import com.nintech.chapatamod.blocks.PinaSeed;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ChapataBlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChapataMod.MODID);

    public static final RegistryObject<Block> CROP_PINA = BLOCKS.register("crop_pina",
            () -> new PinaSeed(BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

}
