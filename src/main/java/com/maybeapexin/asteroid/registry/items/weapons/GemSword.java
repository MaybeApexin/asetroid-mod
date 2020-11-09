package com.maybeapexin.asteroid.registry.items.weapons;

import com.maybeapexin.asteroid.registry.ModItemGroups;
import com.maybeapexin.asteroid.registry.ModItems;
import com.maybeapexin.asteroid.registry.items.RubyGem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GemSword {
    public static final SwordItem GEMSTONE_SWORD = new SwordItem(new ToolMaterial() {
        @Override
        public int getDurability() {

            return 750;
        }

        @Override
        public float getMiningSpeedMultiplier() {

            return 0;
        }

        @Override
        public float getAttackDamage() {

            return 14.5f;
        }

        @Override
        public int getMiningLevel() {

            return 0;
        }

        @Override
        public int getEnchantability() {

            return 22;
        }

        @Override
        public Ingredient getRepairIngredient() {

            return Ingredient.ofItems(RubyGem.RUBY);
        }
    }, 9, 5, new Item.Settings().group(ModItemGroups.ITEM_GROUP));
}
