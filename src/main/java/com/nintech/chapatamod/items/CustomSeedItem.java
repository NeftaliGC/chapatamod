package com.nintech.chapatamod.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class CustomSeedItem extends Item {

    private final Block BloqueSeed;

    public CustomSeedItem(Properties p_41383_, Block BloqueSeed) {
        super(p_41383_);
        this.BloqueSeed = BloqueSeed;
    }

    @Override
    public InteractionResult useOn(UseOnContext context){
        BlockPos pos = context.getClickedPos();
        BlockState state = context.getLevel().getBlockState(pos);
        BlockPos posAbove = pos.above();
        if (state.getBlock() == Blocks.FARMLAND && context.getLevel().isEmptyBlock(posAbove)){
            context.getLevel().setBlock(posAbove, BloqueSeed.defaultBlockState(),3);
            context.getItemInHand().shrink(1);
            context.getLevel().gameEvent(context.getPlayer(), GameEvent.BLOCK_PLACE,pos);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.FAIL;
    }
}
