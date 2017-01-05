/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This program is licensed under the terms of the GNU General Public License v3.0.
*/
package colorblocks.blocks;

import java.util.Random;

import colorblocks.ColorBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class CbColorSlab extends BlockSlab {

    static ColorBlocks Color = new ColorBlocks();
    static String string1 = new String();

    public CbColorSlab(boolean fullBlock, Material mat, String string, int tab) {
        super(fullBlock, Material.wood);
        string1 = string;
        this.setBlockTextureName(Color.modid + ":" + string);
        this.setBlockName("Cb" + string + "Slab");
        setResistance(50F);
        setHardness(0.1F);
        setStepSound(Block.soundTypeStone);
        setLightLevel(1F);
        this.setLightOpacity(0);
        if (tab == 0)
            this.setCreativeTab(Color.BlueTab);
        if (tab == 1)
            this.setCreativeTab(Color.BrownTab);
        if (tab == 2)
            this.setCreativeTab(Color.GrayTab);
        if (tab == 3)
            this.setCreativeTab(Color.GreenTab);
        if (tab == 4)
            this.setCreativeTab(Color.PinkTab);
        if (tab == 5)
            this.setCreativeTab(Color.YellowTab);
        if (tab == 6)
            this.setCreativeTab(Color.RedTab);


    }


    @SideOnly(Side.CLIENT)
    private static boolean func_150003_a(Block block) {
        return block == Color.CbBlackHalfSlab || block == Color.CbBlueHalfSlab || block == Color.CbBlueishWhiteHalfSlab || block == Color.CbBrownHalfSlab || block == Color.CbCyanHalfSlab || block == Color.CbDarkBlueHalfSlab || block == Color.CbDarkBlueishCyanHalfSlab || block == Color.CbDarkBrownishRedHalfSlab || block == Color.CbDarkCyanHalfSlab || block == Color.CbDarkCyanishGreenHalfSlab || block == Color.CbDarkGreenHalfSlab || block == Color.CbDarkGreyHalfSlab || block == Color.CbDarkPurpleHalfSlab || block == Color.CbDarkYellowHalfSlab || block == Color.CbGreenHalfSlab || block == Color.CbGreenishCyanHalfSlab || block == Color.CbGreyHalfSlab || block == Color.CbLightBlueHalfSlab || block == Color.CbLightGreyHalfSlab || block == Color.CbLightPurpleHalfSlab || block == Color.CbLightOrangeHalfSlab || block == Color.CbLightOrangeRedHalfSlab || block == Color.CbLightPurpleBlueHalfSlab || block == Color.CbLightBrownHalfSlab || block == Color.CbLightCyanHalfSlab || block == Color.CbLightYellowHalfSlab || block == Color.CbLimeGreenHalfSlab || block == Color.CbMagentaHalfSlab || block == Color.CbOrangeHalfSlab || block == Color.CbPinkHalfSlab || block == Color.CbPurpleHalfSlab || block == Color.CbPurpleBlueHalfSlab || block == Color.CbRedHalfSlab || block == Color.CbRedOrangeHalfSlab || block == Color.CbSharpPinkHalfSlab || block == Color.CbWhiteHalfSlab || block == Color.CbWhitePinkHalfSlab || block == Color.CbWhitePurpleHalfSlab || block == Color.CbWineRedHalfSlab || block == Color.CbYellowHalfSlab || block == Color.CbYellowishGreenHalfSlab;
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return func_150003_a(this) ? Item.getItemFromBlock(this) : Item.getItemFromBlock(this);
    }


    //getFullSlabName
    @Override
    public String func_150002_b(int i) {
        return super.getUnlocalizedName();
    }

}


