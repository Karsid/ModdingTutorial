package com.karsid.modtutorial.init;


import com.karsid.modtutorial.item.ItemMTB;
import com.karsid.modtutorial.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemMTB tutorialSword = new ItemSword();

    public static void init() {
        GameRegistry.registerItem(tutorialSword, "tutorialSword");
    }
}
