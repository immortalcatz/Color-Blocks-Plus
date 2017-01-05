/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This program is licensed under the terms of the GNU General Public License v3.0.
*/
package colorblocks.blocks;

import java.io.FileNotFoundException;

import colorblocks.ColorBlocks;
import coloredlightscore.src.api.CLApi;
import cpw.mods.fml.common.LoaderException;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class CbColorBlock extends Block {

    private int R;
    private int G;
    private int B;
    private int LV;

    public CbColorBlock(String string, CreativeTabs creative, int r, int g, int b, int lv) {
        super(Material.wood);
        R = r;
        G = g;
        B = b;
        LV = lv;
        this.setLightLevel(1F);
        //	CLApi.setBlockColorRGB(this, R, G, B, LV);
        this.setCreativeTab(creative);
        this.setResistance(50F);
        this.setHardness(0.1F);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName("Cb" + string);
        this.setBlockTextureName(ColorBlocks.modid + ":" + string);
    }

}



