package com.karsid.modtutorial.item;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.creativetab.CreativeTabs;

public class ItemPickaxe extends ItemMT {
    public ItemPickaxe () {
        super();
        this.setUnlocalizedName(Names.Items.PICKAXE);
        this.setCreativeTab(CreativeTabs.tabTools);
    }
}
