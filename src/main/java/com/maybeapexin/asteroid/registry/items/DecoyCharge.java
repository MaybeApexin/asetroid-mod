package com.maybeapexin.asteroid.registry.items;

import com.maybeapexin.asteroid.registry.ModItemGroups;
import net.minecraft.item.FireworkItem;
import net.minecraft.item.Item;

public class DecoyCharge {
    public static final FireworkItem DECOY_CHARGE = new FireworkItem(new Item.Settings().group(ModItemGroups.ITEM_GROUP).maxCount(16));
}
