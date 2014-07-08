package com.karsid.modtutorial.block;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStone extends BlockMT {
    public BlockStone() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.STONE);
        this.setBlockTextureName(Names.Blocks.STONE);
        this.setHardness(1.0F);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
