package com.nintech.chapatamod.blocks;

import com.nintech.chapatamod.ChapataMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ChapataBlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChapataMod.MODID);

    public static final RegistryObject<Block> CROP_PINA = BLOCKS.register("crop_pina",
            () -> new PinaSeed(BlockBehaviour.Properties.of()
                    .noCollission()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.CROP)
            ));
    public static final RegistryObject<Block> PINA_CROP = BLOCKS.register("pina_crop",
            ()-> new PinaSeed(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).noCollission().instabreak().sound(SoundType.CROP)));
}
