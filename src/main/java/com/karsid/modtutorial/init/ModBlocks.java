package com.karsid.modtutorial.init;

import com.karsid.modtutorial.block.BlockDirt;
import com.karsid.modtutorial.block.BlockMT;
import com.karsid.modtutorial.block.BlockOre;
import com.karsid.modtutorial.block.BlockStone;
import com.karsid.modtutorial.reference.Names;
import com.karsid.modtutorial.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockMT tutorialDirt = new BlockDirt();
    public static final BlockMT tutorialOre = new BlockOre();
    public static final BlockMT tutorialStone = new BlockStone();

    public static void init() {
        GameRegistry.registerBlock(tutorialDirt, Names.Blocks.DIRT);
        GameRegistry.registerBlock(tutorialOre, Names.Blocks.ORE);
        GameRegistry.registerBlock(tutorialStone, Names.Blocks.STONE);
    }
}
