package com.karsid.modtutorial.item;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class ItemShovel extends ItemMT {
    public ItemShovel () {
        super();
        this.setUnlocalizedName(Names.Items.SHOVEL);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
}
