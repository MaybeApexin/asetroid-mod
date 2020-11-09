package com.maybeapexin.asteroid.registry.items.armor;

import com.maybeapexin.asteroid.registry.ModItemGroups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class BaseArmor extends ArmorItem {
    public BaseArmor(ArmorMaterial material, EquipmentSlot slot ) {
        super(material, slot, new Item.Settings().group(ModItemGroups.ITEM_GROUP));

    }
}
