package com.kramsdell.elemental.world.biome;

import com.kramsdell.elemental.ElementalPower;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final RegistryKey<Biome> fire_dimension = RegistryKey.of(RegistryKeys.BIOME, 
        new Identifier(ElementalPower.MOD_ID, "fire_dimension"));
}
