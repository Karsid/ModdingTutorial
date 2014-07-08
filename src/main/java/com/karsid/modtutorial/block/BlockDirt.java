package com.karsid.modtutorial.block;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDirt extends BlockMT {
    public BlockDirt() {
        super(Material.ground);
        this.setBlockName(Names.Blocks.DIRT);
        this.setBlockTextureName("tutorialDirt");
        this.setHardness(0.4F);
        this.setStepSound(Block.soundTypeGravel);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
