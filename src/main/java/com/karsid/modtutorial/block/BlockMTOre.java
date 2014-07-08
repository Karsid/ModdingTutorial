package com.karsid.modtutorial.block;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMTOre extends BlockMT {
    public BlockMTOre() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.ORE);
        this.setBlockTextureName(Names.Blocks.ORE);
        this.setHardness(4.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
