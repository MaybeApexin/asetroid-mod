package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.Asteroid;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("asteroid", "library"),

            () -> new ItemStack(ModItems.X_SWORD));

 /*   public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier("tutorial", "other"))
            .icon(() -> new ItemStack(Items.BOWL))
            .build();

/*/
}