package com.maybeapexin.asteroid;

import com.maybeapexin.asteroid.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Asteroid implements ModInitializer {

    public static final String MOD_ID = "asteroid";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
