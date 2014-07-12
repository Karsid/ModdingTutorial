package com.karsid.modtutorial.block;

import com.karsid.modtutorial.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMTDirt extends BlockMT {
    public BlockMTDirt() {
        super(Material.ground);
        this.setBlockName(Names.Blocks.DIRT);
        this.setBlockTextureName("tutorialDirt");
        this.setHardness(0.4F);
        this.setStepSound(Block.soundTypeGravel);
    }
}
