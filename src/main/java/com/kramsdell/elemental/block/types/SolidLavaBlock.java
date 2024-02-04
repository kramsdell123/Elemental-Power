package com.kramsdell.elemental.block.types;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SolidLavaBlock extends Block {
    public SolidLavaBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        if(player.getInventory().getMainHandStack().getItem() == Items.BUCKET) {
            if(!player.getAbilities().creativeMode) {
                player.getInventory().getMainHandStack().decrement(1);
            }
            world.setBlockState(pos, Blocks.LAVA.getDefaultState());
            world.playSound(player, pos, SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundCategory.BLOCKS);
            if(player.getInventory().getEmptySlot() != -1) {
                player.getInventory().setStack(player.getInventory().getEmptySlot(), new ItemStack(Items.LAVA_BUCKET));
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}
