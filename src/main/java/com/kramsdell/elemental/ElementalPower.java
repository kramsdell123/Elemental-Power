package com.kramsdell.elemental;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementalPower implements ModInitializer {
	public static final String MOD_ID = "elemental";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod Successfully Loaded");
	}
}