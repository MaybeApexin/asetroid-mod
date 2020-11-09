package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.items.RubyGem;
import com.maybeapexin.asteroid.registry.toolReg.AxeTool;
import com.maybeapexin.asteroid.registry.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GemAxe {
    public static final AxeTool GEMSTONE_AXE = new AxeTool(new ToolMaterial() {
        @Override
        public int getDurability() {
            return 750;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 13;
        }

        @Override
        public float getAttackDamage() {
            return 6.7f;
        }

        @Override
        public int getMiningLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 22;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(RubyGem.RUBY);
        }
    }, 7.0f, -1.2f, new Item.Settings().group(ModItemGroups.ITEM_GROUP));
}
