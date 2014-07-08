package com.karsid.modtutorial.item;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class ItemHoe extends ItemMT {
    public ItemHoe () {
        super();
        this.setUnlocalizedName(Names.Items.HOE);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
}
