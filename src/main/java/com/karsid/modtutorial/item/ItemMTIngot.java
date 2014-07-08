package com.karsid.modtutorial.item;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class ItemMTIngot extends ItemMT {
    public ItemMTIngot() {
        super();
        this.setUnlocalizedName(Names.Items.INGOT);
        this.setMaxStackSize(16);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}