package com.kramsdell.elemental.block;

import com.kramsdell.elemental.ElementalPower;
import com.kramsdell.elemental.block.types.SolidLavaBlock;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block lit_obsidian = register("lit_obsidian", new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).pistonBehavior(PistonBehavior.BLOCK)));
    public static final Block solid_lava = register("solid_lava", new SolidLavaBlock(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.WOOL)));


    public static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(ElementalPower.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        ElementalPower.LOGGER.info("Registered Blocks");
    }
}
