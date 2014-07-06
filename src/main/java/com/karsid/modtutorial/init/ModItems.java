package com.karsid.modtutorial.init;


import com.karsid.modtutorial.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemMTB tutorialAxe = new ItemAxe();
    public static final ItemMTB tutorialHoe = new ItemHoe();
    public static final ItemMTB tutorialPickaxe = new ItemPickaxe();
    public static final ItemMTB tutorialShovel = new ItemShovel();
    public static final ItemMTB tutorialSword = new ItemSword();

    public static void init() {
        GameRegistry.registerItem(tutorialAxe, "tutorialAxe");
        GameRegistry.registerItem(tutorialHoe, "tutorialHoe");
        GameRegistry.registerItem(tutorialPickaxe, "tutorialPickaxe");
        GameRegistry.registerItem(tutorialShovel, "tutorialShovel");
        GameRegistry.registerItem(tutorialSword, "tutorialSword");
    }
}
