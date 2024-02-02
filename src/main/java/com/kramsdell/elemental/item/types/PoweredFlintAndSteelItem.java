package com.kramsdell.elemental.item.types;

import com.kramsdell.elemental.block.ModBlocks;

import net.minecraft.block.Blocks;
import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;

public class PoweredFlintAndSteelItem extends FlintAndSteelItem {

    public PoweredFlintAndSteelItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() == Blocks.OBSIDIAN) {
            context.getWorld().setBlockState(context.getBlockPos(), ModBlocks.lit_obsidian.getDefaultState());
            context.getWorld().playSound(context.getPlayer(), context.getBlockPos(), SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS);
            return ActionResult.SUCCESS;
        } else {
            return super.useOnBlock(context);
        }
    }
    
}
