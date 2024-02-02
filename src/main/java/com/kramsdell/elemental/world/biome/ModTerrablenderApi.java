package com.kramsdell.elemental.world.biome;

import com.kramsdell.elemental.ElementalPower;
import com.kramsdell.elemental.world.biome.surface.ModMaterialRules;

import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderApi implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, ElementalPower.MOD_ID, ModMaterialRules.createCustomWorldGen());
    }
}
