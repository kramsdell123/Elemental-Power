package com.kramsdell.elemental;

import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.block.TntBlock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kramsdell.elemental.block.ModBlocks;
import com.kramsdell.elemental.item.ModItemGroups;
import com.kramsdell.elemental.item.ModItems;
/**
 * {@link Items}
 * {@link TntBlock}
 * {@link Explosion}
 */

public class ElementalPower implements ModInitializer {
	public static final String MOD_ID = "elemental";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerBlocks();

		CustomPortalBuilder.beginPortal()
			.frameBlock(ModBlocks.lit_obsidian)
			.destDimID(new Identifier(MOD_ID, "fire"))
			.tintColor(0xE83814)
			.registerPortal();
	}

}