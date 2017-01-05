/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This program is licensed under the terms of the GNU General Public License v3.0.
*/
package colorblocks.blocks;

import colorblocks.ColorBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class CbColorStair extends BlockStairs {

    private Block block;

    public CbColorStair(Block block, int extender, String string, int tab) {
        super(block, 1);
        this.block = block;
        this.setBlockName("Cb" + string + "Stair");
        setResistance(50F);
        setHardness(0.1F);
        setStepSound(Block.soundTypeStone);
        setLightLevel(1F);
        this.damageDropped(0);
        if (tab == 0)
            this.setCreativeTab(ColorBlocks.BlueTab);
        if (tab == 1)
            this.setCreativeTab(ColorBlocks.BrownTab);
        if (tab == 2)
            this.setCreativeTab(ColorBlocks.GrayTab);
        if (tab == 3)
            this.setCreativeTab(ColorBlocks.GreenTab);
        if (tab == 4)
            this.setCreativeTab(ColorBlocks.PinkTab);
        if (tab == 5)
            this.setCreativeTab(ColorBlocks.YellowTab);
        if (tab == 6)
            this.setCreativeTab(ColorBlocks.RedTab);
    }

}
