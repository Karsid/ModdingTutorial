package com.karsid.modtutorial.item;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class ItemAxe extends ItemMT {
    public ItemAxe () {
        super();
        this.setUnlocalizedName(Names.Items.AXE);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
}
