package com.karsid.modtutorial.block;

import com.karsid.modtutorial.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMT extends Block {
    public BlockMT(Material material) {
        super(material);
    }

    public BlockMT() {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName (String unlocalisedName) {
        return unlocalisedName.substring(unlocalisedName.indexOf(".") + 1);
    }
}
