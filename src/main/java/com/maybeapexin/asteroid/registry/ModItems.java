package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.Asteroid;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item X_SWORD = new Item(new Item.Settings().group(ModItemGroups.ITEM_GROUP));

    public static void registerItems() {
         Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "x_sword"),X_SWORD);
    }
}
