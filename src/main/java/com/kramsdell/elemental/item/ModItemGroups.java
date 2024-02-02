package com.kramsdell.elemental.item;

import com.kramsdell.elemental.ElementalPower;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup elemental = Registry.register(Registries.ITEM_GROUP, new Identifier(ElementalPower.MOD_ID, "elemental"), 
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.power_crystal))
        .displayName(Text.translatable("itemgroup.elemental"))
        .entries((param1, entries) -> {
            entries.add(ModItems.power_crystal);
            entries.add(ModItems.powered_flint_and_steel);
        })
        .build());

    public static void registerItemGroups() {
        ElementalPower.LOGGER.info("Registered Item Groups");
    }
}
