package com.karsid.modtutorial.init;


import com.karsid.modtutorial.item.*;
import com.karsid.modtutorial.reference.Names;
import com.karsid.modtutorial.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemMT tutorialAxe = new ItemAxe();
    public static final ItemMT tutorialHoe = new ItemHoe();
    public static final ItemMT tutorialIngot = new ItemIngot();
    public static final ItemMT tutorialPickaxe = new ItemPickaxe();
    public static final ItemMT tutorialShovel = new ItemShovel();
    public static final ItemMT tutorialSword = new ItemSword();

    public static void init() {
        GameRegistry.registerItem(tutorialAxe, Names.Items.AXE);
        GameRegistry.registerItem(tutorialHoe, Names.Items.HOE);
        GameRegistry.registerItem(tutorialIngot, Names.Items.INGOT);
        GameRegistry.registerItem(tutorialPickaxe, Names.Items.PICKAXE);
        GameRegistry.registerItem(tutorialShovel, Names.Items.SHOVEL);
        GameRegistry.registerItem(tutorialSword, Names.Items.SWORD);
    }
}
