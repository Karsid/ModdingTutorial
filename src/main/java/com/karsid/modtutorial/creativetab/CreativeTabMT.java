package com.karsid.modtutorial.creativetab;

import com.karsid.modtutorial.init.ModItems;
import com.karsid.modtutorial.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMT {
    public static final CreativeTabs MT_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.tutorialIngot;
        }

        @Override
        public String getTranslatedTabLabel() {
            return Reference.MOD_NAME;
        }
    };
}
