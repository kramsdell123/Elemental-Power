package com.kramsdell.elemental.world.biome.surface;

import com.kramsdell.elemental.world.biome.ModBiomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    
    public static MaterialRules.MaterialRule createCustomWorldGen() {
        return MaterialRules.sequence(
            MaterialRules.condition(MaterialRules.biome(ModBiomes.fire_dimension),
            MaterialRules.condition(MaterialRules.aboveY(YOffset.aboveBottom(1), 0),
            MaterialRules.block(Blocks.LAVA.getDefaultState())))
        );
    }
}
