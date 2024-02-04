package com.kramsdell.elemental.item;

import com.kramsdell.elemental.ElementalPower;
import com.kramsdell.elemental.block.ModBlocks;
import com.kramsdell.elemental.item.types.PoweredFlintAndSteelItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.NetherStarItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item power_crystal = register("power_crystal", new NetherStarItem(new FabricItemSettings().rarity(Rarity.EPIC)));

    public static final Item powered_flint_and_steel = register("powered_flint_and_steel", new PoweredFlintAndSteelItem(new FabricItemSettings()));


    
    public static final Item solid_lava = register("solid_lava", new BlockItem(ModBlocks.solid_lava, new FabricItemSettings()));

    public static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ElementalPower.MOD_ID, name), item);
    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((entries) -> {
            entries.add(power_crystal);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((entries) -> {
            entries.add(powered_flint_and_steel);
        });
        ElementalPower.LOGGER.info("Registered Items");
    }
}

