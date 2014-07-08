package com.karsid.modtutorial.item;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemMTAxe extends ItemMT {
    public ItemMTAxe() {
        super();
        this.setUnlocalizedName(Names.Items.AXE);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
}
