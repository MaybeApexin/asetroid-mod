package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.ModItemGroups;
import com.maybeapexin.asteroid.registry.ModItems;
import com.maybeapexin.asteroid.registry.items.RubyGem;
import com.maybeapexin.asteroid.registry.toolReg.PickaxeTool;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GemPickaxe {
    public static final PickaxeTool GEMSTONE_PICKAXE = new PickaxeTool(new ToolMaterial() {
        @Override
        public int getDurability() {

            return 1000;
        }

        @Override
        public float getMiningSpeedMultiplier() {

            return 45;
        }

        @Override
        public float getAttackDamage() {

            return 1.2f;
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
    }, 1, -2.6f, new Item.Settings().group(ModItemGroups.ITEM_GROUP).maxCount(1));
}
