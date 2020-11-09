package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.Asteroid;
import com.maybeapexin.asteroid.registry.items.*;
import com.maybeapexin.asteroid.registry.items.armor.BaseArmor;
import com.maybeapexin.asteroid.registry.items.armor.GemArmorMaterial;
import com.maybeapexin.asteroid.registry.items.tools.*;
import com.maybeapexin.asteroid.registry.items.weapons.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final ArmorMaterial GEMSTONE_ARMOR = new GemArmorMaterial();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_sword"), GemSword.GEMSTONE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_pickaxe"), GemPickaxe.GEMSTONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_axe"), GemAxe.GEMSTONE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_shovel"), GemShovel.GEMSTONE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_bow"), GemBow.GEMSTONE_BOW);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_shield"), GemShield.GEMSTONE_SHIELD);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "ruby"), RubyGem.RUBY);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "decoy_charge"), DecoyCharge.DECOY_CHARGE);
        // Armor Registries Are Entered below
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_helmet"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_chestplate"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_leggings"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_boots"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.FEET));
    }
}