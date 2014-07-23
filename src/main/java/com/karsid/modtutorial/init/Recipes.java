package com.karsid.modtutorial.init;

/**
  * When doing a recipe remember to use the generic types provided by forge i.e.
  * don't use Items.stick when you can use "stickWood".
  *
  * You can find a list of the generic types in OreDictionary.java
 **/

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init() {
        // Add recipe for Axe
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModItems.tutorialAxe),
                "xx ", "xy ", " y ",
                'x', new ItemStack(ModItems.tutorialIngot),
                'y', "stickWood"));

        // Add recipe for Hoe
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModItems.tutorialHoe),
                "xx ", " y ", " y ",
                'x', new ItemStack(ModItems.tutorialIngot),
                'y', "stickWood"));

        // Add recipe for PickAxe
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModItems.tutorialPickaxe),
                "xxx", " y ", " y ",
                'x', new ItemStack(ModItems.tutorialIngot),
                'y', "stickWood"));

        // Add recipe for Shovel
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModItems.tutorialShovel),
                " x ", " y ", " y ",
                'x', new ItemStack(ModItems.tutorialIngot),
                'y', "stickWood"));

        // Add recipe for Sword
        GameRegistry.addRecipe(
            new ShapedOreRecipe(
                new ItemStack(ModItems.tutorialSword),
                " x ", " x ", " y ",
                'x', new ItemStack(ModItems.tutorialIngot),
                'y', "stickWood"));

        // Add shapeless recipe for Sword
        GameRegistry.addRecipe(
            new ShapelessOreRecipe(
                new ItemStack(ModItems.tutorialSword),
                new ItemStack(ModItems.tutorialIngot),
                new ItemStack(ModItems.tutorialIngot),
                "stickWood"));
    }
}
