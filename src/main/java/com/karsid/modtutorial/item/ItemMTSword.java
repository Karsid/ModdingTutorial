package com.karsid.modtutorial.item;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class ItemMTSword extends ItemMT {
    public ItemMTSword() {
        super();
        this.setUnlocalizedName(Names.Items.SWORD);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
