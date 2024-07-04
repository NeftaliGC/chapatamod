package com.nintech.chapatamod.blocks;

import com.nintech.chapatamod.items.ChapataItem;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PinaSeed extends CropBlock {
    public PinaSeed(Properties properties) {
        super(properties);
    }


    @Override
    public void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack stack, boolean dropExperience) {
        super.spawnAfterBreak(state, level, pos, stack, dropExperience);
        if (this.isMaxAge(state)) {
            dropPineappleAndSeeds(level, pos);
        }
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        super.performBonemeal(level, random, pos, state);
        if (this.isMaxAge(state)) {
            dropPineappleAndSeeds(level, pos);
        }
    }


    private void dropPineappleAndSeeds(ServerLevel level, BlockPos pos) {
        popResource(level, pos, new ItemStack(ChapataItem.PINEAPPLE.get(), 8));
        popResource(level,pos,new ItemStack(ChapataItem.SEMILLA_PINA.get(),2));
    }


}
