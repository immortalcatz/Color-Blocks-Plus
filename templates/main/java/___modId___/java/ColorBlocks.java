/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This program is licensed under the terms of the GNU General Public License v3.0.
*/
package colorblocks;

import java.io.File;
import java.io.FileNotFoundException;

import colorblocks.blocks.CbColorBlock;
import colorblocks.blocks.CbColorSlab;
import colorblocks.blocks.CbColorStair;
import colorblocks.items.CbColorItem;
import colorblocks.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid="colorblocks", name="Color Blocks", version="1.4")
public class ColorBlocks {

	//modid = ColorBlocks
	public static final String modid = "colorblocks";


        // The instance of your mod that Forge uses.
        @Instance("ColorBlocks")
        public static ColorBlocks instance;

        //Color Blocks
        public static Block CbBlack;
        public static Block CbBlue;
        public static Block CbBrown;
        public static Block CbCyan;
        public static Block CbDarkGreen;
        public static Block CbGreen;
        public static Block CbGrey;
        public static Block CbLightBlue;
        public static Block CbLightBrown;
        public static Block CbLightGrey;
        public static Block CbLightPurple;
        public static Block CbLimeGreen;
        public static Block CbMagenta;
        public static Block CbOrange;
        public static Block CbPink;
        public static Block CbPurple;
        public static Block CbRed;
        public static Block CbWhite;
        public static Block CbWineRed;
        public static Block CbYellow;
        public static Block CbRedOrange;
        public static Block CbLightOrange;
        public static Block CbWhitePink;
        public static Block CbSharpPink;
        public static Block CbLightPurpleBlue;
        public static Block CbPurpleBlue;
        public static Block CbBlueishWhite;
        public static Block CbLightCyan;
        public static Block CbGreenishCyan;
        public static Block CbYellowishGreen;
        public static Block CbLightYellow;
        public static Block CbLightOrangeRed;
        public static Block CbWhitePurple;
        public static Block CbDarkYellow;
        public static Block CbDarkCyan;
        public static Block CbDarkPurple;
        public static Block CbDarkBlueishCyan;
        public static Block CbDarkBrownishRed;
        public static Block CbDarkCyanishGreen;
        public static Block CbDarkBlue;
        public static Block CbDarkGrey;
        public static Block CbNavyBlue;
        public static Block CbLavender;
        public static Block CbLightLavender;

        //Stairs
        public static BlockSlab CbBlackHalfSlab;
        public static BlockSlab CbBlueHalfSlab;
        public static BlockSlab CbBrownHalfSlab;
        public static BlockSlab CbCyanHalfSlab;
        public static BlockSlab CbDarkGreenHalfSlab;
        public static BlockSlab CbGreenHalfSlab;
        public static BlockSlab CbGreyHalfSlab;
        public static BlockSlab CbLightBlueHalfSlab;
        public static BlockSlab CbLightBrownHalfSlab;
        public static BlockSlab CbLightGreyHalfSlab;
        public static BlockSlab CbLightPurpleHalfSlab;
        public static BlockSlab CbLimeGreenHalfSlab;
        public static BlockSlab CbMagentaHalfSlab;
        public static BlockSlab CbOrangeHalfSlab;
        public static BlockSlab CbPinkHalfSlab;
        public static BlockSlab CbPurpleHalfSlab;
        public static BlockSlab CbRedHalfSlab;
        public static BlockSlab CbWhiteHalfSlab;
        public static BlockSlab CbWineRedHalfSlab;
        public static BlockSlab CbYellowHalfSlab;
        public static BlockSlab CbRedOrangeHalfSlab;
        public static BlockSlab CbLightOrangeHalfSlab;
        public static BlockSlab CbWhitePinkHalfSlab;
        public static BlockSlab CbSharpPinkHalfSlab;
        public static BlockSlab CbLightPurpleBlueHalfSlab;
        public static BlockSlab CbPurpleBlueHalfSlab;
        public static BlockSlab CbBlueishWhiteHalfSlab;
        public static BlockSlab CbLightCyanHalfSlab;
        public static BlockSlab CbGreenishCyanHalfSlab;
        public static BlockSlab CbYellowishGreenHalfSlab;
        public static BlockSlab CbLightYellowHalfSlab;
        public static BlockSlab CbLightOrangeRedHalfSlab;
        public static BlockSlab CbWhitePurpleHalfSlab;
        public static BlockSlab CbDarkYellowHalfSlab;
        public static BlockSlab CbDarkCyanHalfSlab;
        public static BlockSlab CbDarkPurpleHalfSlab;
        public static BlockSlab CbDarkBlueishCyanHalfSlab;
        public static BlockSlab CbDarkBrownishRedHalfSlab;
        public static BlockSlab CbDarkCyanishGreenHalfSlab;
        public static BlockSlab CbDarkBlueHalfSlab;
        public static BlockSlab CbDarkGreyHalfSlab;
        public static BlockSlab CbNavyBlueHalfSlab;
        public static BlockSlab CbLavenderHalfSlab;
        public static BlockSlab CbLightLavenderHalfSlab;

        //Double Slabs
        public static BlockSlab CbBlackFullSlab;
        public static BlockSlab CbBlueFullSlab;
        public static BlockSlab CbBrownFullSlab;
        public static BlockSlab CbCyanFullSlab;
        public static BlockSlab CbDarkGreenFullSlab;
        public static BlockSlab CbGreenFullSlab;
        public static BlockSlab CbGreyFullSlab;
        public static BlockSlab CbLightBlueFullSlab;
        public static BlockSlab CbLightBrownFullSlab;
        public static BlockSlab CbLightGreyFullSlab;
        public static BlockSlab CbLightPurpleFullSlab;
        public static BlockSlab CbLimeGreenFullSlab;
        public static BlockSlab CbMagentaFullSlab;
        public static BlockSlab CbOrangeFullSlab;
        public static BlockSlab CbPinkFullSlab;
        public static BlockSlab CbPurpleFullSlab;
        public static BlockSlab CbRedFullSlab;
        public static BlockSlab CbWhiteFullSlab;
        public static BlockSlab CbWineRedFullSlab;
        public static BlockSlab CbYellowFullSlab;
        public static BlockSlab CbRedOrangeFullSlab;
        public static BlockSlab CbLightOrangeFullSlab;
        public static BlockSlab CbWhitePinkFullSlab;
        public static BlockSlab CbSharpPinkFullSlab;
        public static BlockSlab CbLightPurpleBlueFullSlab;
        public static BlockSlab CbPurpleBlueFullSlab;
        public static BlockSlab CbBlueishWhiteFullSlab;
        public static BlockSlab CbLightCyanFullSlab;
        public static BlockSlab CbGreenishCyanFullSlab;
        public static BlockSlab CbYellowishGreenFullSlab;
        public static BlockSlab CbLightYellowFullSlab;
        public static BlockSlab CbLightOrangeRedFullSlab;
        public static BlockSlab CbWhitePurpleFullSlab;
        public static BlockSlab CbDarkYellowFullSlab;
        public static BlockSlab CbDarkCyanFullSlab;
        public static BlockSlab CbDarkPurpleFullSlab;
        public static BlockSlab CbDarkBlueishCyanFullSlab;
        public static BlockSlab CbDarkBrownishRedFullSlab;
        public static BlockSlab CbDarkCyanishGreenFullSlab;
        public static BlockSlab CbDarkBlueFullSlab;
        public static BlockSlab CbDarkGreyFullSlab;
        public static BlockSlab CbNavyBlueFullSlab;
        public static BlockSlab CbLavenderFullSlab;
        public static BlockSlab CbLightLavenderFullSlab;

        // Color Stairs
        public static BlockStairs CbBlackStair;
        public static BlockStairs CbBlueStair;
        public static BlockStairs CbBrownStair;
        public static BlockStairs CbCyanStair;
        public static BlockStairs CbDarkGreenStair;
        public static BlockStairs CbGreenStair;
        public static BlockStairs CbGreyStair;
        public static BlockStairs CbLightBlueStair;
        public static BlockStairs CbLightBrownStair;
        public static BlockStairs CbLightGreyStair;
        public static BlockStairs CbLightPurpleStair;
        public static BlockStairs CbLimeGreenStair;
        public static BlockStairs CbMagentaStair;
        public static BlockStairs CbOrangeStair;
        public static BlockStairs CbPinkStair;
        public static BlockStairs CbPurpleStair;
        public static BlockStairs CbRedStair;
        public static BlockStairs CbWhiteStair;
        public static BlockStairs CbWineRedStair;
        public static BlockStairs CbYellowStair;
        public static BlockStairs CbRedOrangeStair;
        public static BlockStairs CbLightOrangeStair;
        public static BlockStairs CbWhitePinkStair;
        public static BlockStairs CbSharpPinkStair;
        public static BlockStairs CbLightPurpleBlueStair;
        public static BlockStairs CbPurpleBlueStair;
        public static BlockStairs CbBlueishWhiteStair;
        public static BlockStairs CbLightCyanStair;
        public static BlockStairs CbGreenishCyanStair;
        public static BlockStairs CbYellowishGreenStair;
        public static BlockStairs CbLightYellowStair;
        public static BlockStairs CbLightOrangeRedStair;
        public static BlockStairs CbWhitePurpleStair;
        public static BlockStairs CbDarkYellowStair;
        public static BlockStairs CbDarkCyanStair;
        public static BlockStairs CbDarkPurpleStair;
        public static BlockStairs CbDarkBlueishCyanStair;
        public static BlockStairs CbDarkBrownishRedStair;
        public static BlockStairs CbDarkCyanishGreenStair;
        public static BlockStairs CbDarkBlueStair;
        public static BlockStairs CbDarkGreyStair;
        public static BlockStairs CbNavyBlueStair;
        public static BlockStairs CbLavenderStair;
        public static BlockStairs CbLightLavenderStair;


        //Items 1.2
        public static Item CbWhiteDust;
        public static Item CbWhiteIngot;

        //Creative tab
        public static CreativeTabs BlueTab = new CreativeTabs("BlueTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbBlue);
    		}

    	};

    	public static CreativeTabs PinkTab = new CreativeTabs("PinkTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbPink);
    		}

    	};

    	public static CreativeTabs GreenTab = new CreativeTabs("GreenTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbGreen);
    		}

    	};

    	public static CreativeTabs RedTab = new CreativeTabs("RedTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbRed);
    		}

    	};

    	public static CreativeTabs GrayTab = new CreativeTabs("GrayTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbGrey);
    		}

    	};

    	public static CreativeTabs BrownTab = new CreativeTabs("BrownTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbBrown);
    		}

    	};

    	public static CreativeTabs YellowTab = new CreativeTabs("YellowTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbYellow);
    		}

    	};

    	public static CreativeTabs ItemTab = new CreativeTabs("ItemTab"){
    		public Item getTabIconItem() {
    			return CbWhiteIngot;
    		}

    	};

        @SidedProxy(clientSide="colorblocks.proxy.ClientProxy", serverSide="colorblocks.proxy.CommonProxy")
        public static CommonProxy proxy;

        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event){


        	//Defines Blocks in Minecraft

        	//GrayTab
        	CbBlack = new CbColorBlock("Black", GrayTab, 0, 0, 0, 0);
    		CbGrey = new CbColorBlock("Grey", GrayTab, 0, 0, 0, 15);
    		CbLightGrey = new CbColorBlock("LightGrey", GrayTab, 0, 0, 0, 15);
    		CbWhite = new CbColorBlock("White", GrayTab, 15, 15, 15, 15);
    		CbDarkGrey = new CbColorBlock("DarkGrey", GrayTab, 4, 4, 4, 4);

    		//BlueTab
    		CbBlue = new CbColorBlock("Blue", BlueTab, 0, 0, 15, 15);
    		CbLightBlue = new CbColorBlock("LightBlue", BlueTab, 12, 14, 15, 15);
    		CbDarkBlueishCyan = new CbColorBlock("DarkBlueishCyan", BlueTab, 5, 10, 12, 12);
    		CbDarkBlue = new CbColorBlock("DarkBlue", BlueTab, 0, 6, 10, 10);
    		CbCyan = new CbColorBlock("Cyan", BlueTab, 7, 14, 15, 15);
    		CbLightCyan = new CbColorBlock("LightCyan", BlueTab, 0, 0, 0, 15);
    		CbBlueishWhite = new CbColorBlock("BlueishWhite", BlueTab, 0, 0, 0, 15);
    		CbNavyBlue = new CbColorBlock("NavyBlue", BlueTab, 0, 0, 0, 15);


    		//GreenTab
    		CbGreen = new CbColorBlock("Green", GreenTab, 0, 15, 0, 15);
    		CbDarkGreen = new CbColorBlock("DarkGreen", GreenTab, 0, 0, 0, 15);
    		CbLimeGreen = new CbColorBlock("LimeGreen", GreenTab, 0, 0, 0, 15);
    		CbGreenishCyan = new CbColorBlock("GreenishCyan", GreenTab, 0, 0, 0, 15);
    		CbYellowishGreen = new CbColorBlock("YellowishGreen", GreenTab, 0, 0, 0, 15);
    		CbDarkCyanishGreen = new CbColorBlock("DarkCyanishGreen", GreenTab, 0, 0, 0, 15);
    		CbDarkCyan = new CbColorBlock("DarkCyan", GreenTab, 0, 0, 0, 15);

    		//BrownTab
    		CbBrown = new CbColorBlock("Brown", BrownTab, 0, 0, 0, 15);
    		CbLightBrown = new CbColorBlock("LightBrown", BrownTab, 0, 0, 0, 15);
    		CbDarkBrownishRed = new CbColorBlock("DarkBrownishRed", BrownTab, 0, 0, 0, 15);

    		//PinkTab
			CbLightPurple = new CbColorBlock("LightPurple", PinkTab, 0, 0, 0, 15);
    		CbMagenta = new CbColorBlock("Magenta", PinkTab, 0, 0, 0, 15);
    		CbPink = new CbColorBlock("Pink", PinkTab, 0, 0, 0, 15);
    		CbPurple = new CbColorBlock("Purple", PinkTab, 0, 0, 0, 15);
    		CbWhitePink = new CbColorBlock("WhitePink", PinkTab, 0, 0, 0, 15);
    		CbSharpPink = new CbColorBlock("SharpPink", PinkTab, 0, 0, 0, 15);
    		CbLightPurpleBlue = new CbColorBlock("LightPurpleBlue", PinkTab, 0, 0, 0, 15);
    		CbPurpleBlue = new CbColorBlock("PurpleBlue", PinkTab, 0, 0, 0, 15);
    		CbWhitePurple = new CbColorBlock("WhitePurple", PinkTab, 0, 0, 0, 15);
    		CbDarkPurple = new CbColorBlock("DarkPurple", PinkTab, 0, 0, 0, 15);
    		CbLavender = new CbColorBlock("Lavender", PinkTab, 0, 0, 0, 15);
    		CbLightLavender = new CbColorBlock("LightLavender", PinkTab, 0, 0, 0, 15);


    		//RedTab
    		CbOrange = new CbColorBlock("Orange", RedTab, 0, 0, 0, 15);
    		CbRed = new CbColorBlock("Red", RedTab, 15, 0, 0, 15);
    		CbWineRed = new CbColorBlock("WineRed", RedTab, 0, 0, 0, 15);
    		CbRedOrange = new CbColorBlock("RedOrange", RedTab, 0, 0, 0, 15);
    		CbLightOrange = new CbColorBlock("LightOrange", RedTab, 0, 0, 0, 15);
    		CbLightOrangeRed = new CbColorBlock("LightOrangeRed", RedTab, 0, 0, 0, 15);

    		//YellowTab
    		CbYellow = new CbColorBlock("Yellow", YellowTab, 0, 0, 0, 15);
    		CbLightYellow = new CbColorBlock("LightYellow", YellowTab, 0, 0, 0, 15);
    		CbDarkYellow = new CbColorBlock("DarkYellow", YellowTab, 0, 0, 0, 15);

        	//Defines Half Slabs in Minecraft

    		//GrayTab
        	CbBlackHalfSlab = new CbColorSlab(false, null, "Black", 2);
    		CbGreyHalfSlab = new CbColorSlab(false, null, "Grey", 2);
    		CbLightGreyHalfSlab = new CbColorSlab(false, null, "LightGrey", 2);
    		CbWhiteHalfSlab = new CbColorSlab(false, null, "White", 2);
    		CbDarkGreyHalfSlab = new CbColorSlab(false, null, "DarkGrey", 2);

    		//BlueTab
    		CbBlueHalfSlab = new CbColorSlab(false, null, "Blue", 0);
    		CbLightBlueHalfSlab = new CbColorSlab(false, null, "LightBlue", 0);
    		CbDarkBlueishCyanHalfSlab = new CbColorSlab(false, null, "DarkBlueishCyan", 0);
    		CbDarkBlueHalfSlab = new CbColorSlab(false, null, "DarkBlue", 0);
    		CbCyanHalfSlab = new CbColorSlab(false, null, "Cyan", 0);
    		CbLightCyanHalfSlab = new CbColorSlab(false, null, "LightCyan", 0);
    		CbBlueishWhiteHalfSlab = new CbColorSlab(false, null, "BlueishWhite", 0);
    		CbNavyBlueHalfSlab = new CbColorSlab(false, null, "NavyBlue", 0);

    		//GreenTab
    		CbGreenHalfSlab = new CbColorSlab(false, null, "Green", 3);
    		CbDarkGreenHalfSlab = new CbColorSlab(false, null, "DarkGreen", 3);
    		CbLimeGreenHalfSlab = new CbColorSlab(false, null, "LimeGreen", 3);
    		CbGreenishCyanHalfSlab = new CbColorSlab(false, null, "GreenishCyan", 3);
    		CbYellowishGreenHalfSlab = new CbColorSlab(false, null, "YellowishGreen", 3);
    		CbDarkCyanishGreenHalfSlab = new CbColorSlab(false, null, "DarkCyanishGreen", 3);
    		CbDarkCyanHalfSlab = new CbColorSlab(false, null, "DarkCyan", 3);

    		//BrownTab
    		CbBrownHalfSlab = new CbColorSlab(false, null, "Brown", 1);
    		CbLightBrownHalfSlab = new CbColorSlab(false, null, "LightBrown", 1);
    		CbDarkBrownishRedHalfSlab = new CbColorSlab(false, null, "DarkBrownishRed", 1);

    		//PinkTab
			CbLightPurpleHalfSlab = new CbColorSlab(false, null, "LightPurple", 4);
    		CbMagentaHalfSlab = new CbColorSlab(false, null, "Magenta", 4);
    		CbPinkHalfSlab = new CbColorSlab(false, null, "Pink", 4);
    		CbPurpleHalfSlab = new CbColorSlab(false, null, "Purple", 4);
    		CbWhitePinkHalfSlab = new CbColorSlab(false, null, "WhitePink", 4);
    		CbSharpPinkHalfSlab = new CbColorSlab(false, null, "SharpPink", 4);
    		CbLightPurpleBlueHalfSlab = new CbColorSlab(false, null, "LightPurpleBlue", 4);
    		CbPurpleBlueHalfSlab = new CbColorSlab(false, null, "PurpleBlue", 4);
    		CbWhitePurpleHalfSlab = new CbColorSlab(false, null, "WhitePurple", 4);
    		CbDarkPurpleHalfSlab = new CbColorSlab(false, null, "DarkPurple", 4);
    		CbLavenderHalfSlab = new CbColorSlab(false, null, "Lavender", 4);
    		CbLightLavenderHalfSlab = new CbColorSlab(false, null, "LightLavender", 4);


    		//RedTab
    		CbOrangeHalfSlab = new CbColorSlab(false, null, "Orange", 6);
    		CbRedHalfSlab = new CbColorSlab(false, null, "Red", 6);
    		CbWineRedHalfSlab = new CbColorSlab(false, null, "WineRed", 6);
    		CbRedOrangeHalfSlab = new CbColorSlab(false, null, "RedOrange", 6);
    		CbLightOrangeHalfSlab = new CbColorSlab(false, null, "LightOrange", 6);
    		CbLightOrangeRedHalfSlab = new CbColorSlab(false, null, "LightOrangeRed", 6);

    		//YellowTab
    		CbYellowHalfSlab = new CbColorSlab(false, null, "Yellow", 5);
    		CbLightYellowHalfSlab = new CbColorSlab(false, null, "LightYellow", 5);
    		CbDarkYellowHalfSlab = new CbColorSlab(false, null, "DarkYellow", 5);

    		//Full Slabs

    		//GrayTab
        	CbBlackFullSlab = new CbColorSlab(true, null, "Black", 7);
    		CbGreyFullSlab = new CbColorSlab(true, null, "Grey", 7);
    		CbLightGreyFullSlab = new CbColorSlab(true, null, "LightGrey", 7);
    		CbWhiteFullSlab = new CbColorSlab(true, null, "White", 7);
    		CbDarkGreyFullSlab = new CbColorSlab(true, null, "DarkGrey", 7);

    		//BlueTab
    		CbBlueFullSlab = new CbColorSlab(true, null, "Blue", 7);
    		CbLightBlueFullSlab = new CbColorSlab(true, null, "LightBlue", 7);
    		CbDarkBlueishCyanFullSlab = new CbColorSlab(true, null, "DarkBlueishCyan", 7);
    		CbDarkBlueFullSlab = new CbColorSlab(true, null, "DarkBlue", 7);
    		CbCyanFullSlab = new CbColorSlab(true, null, "Cyan", 7);
    		CbLightCyanFullSlab = new CbColorSlab(true, null, "LightCyan", 7);
    		CbBlueishWhiteFullSlab = new CbColorSlab(true, null, "BlueishWhite", 7);
    		CbNavyBlueFullSlab = new CbColorSlab(true, null, "NavyBlue", 7);

    		//GreenTab
    		CbGreenFullSlab = new CbColorSlab(true, null, "Green", 7);
    		CbDarkGreenFullSlab = new CbColorSlab(true, null, "DarkGreen", 7);
    		CbLimeGreenFullSlab = new CbColorSlab(true, null, "LimeGreen", 7);
    		CbGreenishCyanFullSlab = new CbColorSlab(true, null, "GreenishCyan", 7);
    		CbYellowishGreenFullSlab = new CbColorSlab(true, null, "YellowishGreen", 7);
    		CbDarkCyanishGreenFullSlab = new CbColorSlab(true, null, "DarkCyanishGreen", 7);
    		CbDarkCyanFullSlab = new CbColorSlab(true, null, "DarkCyan", 7);

    		//BrownTab
    		CbBrownFullSlab = new CbColorSlab(true, null, "Brown", 7);
    		CbLightBrownFullSlab = new CbColorSlab(true, null, "LightBrown", 7);
    		CbDarkBrownishRedFullSlab = new CbColorSlab(true, null, "DarkBrownishRed", 7);

    		//PinkTab
			CbLightPurpleFullSlab = new CbColorSlab(true, null, "LightPurple", 7);
    		CbMagentaFullSlab = new CbColorSlab(true, null, "Magenta", 7);
    		CbPinkFullSlab = new CbColorSlab(true, null, "Pink", 7);
    		CbPurpleFullSlab = new CbColorSlab(true, null, "Purple", 7);
    		CbWhitePinkFullSlab = new CbColorSlab(true, null, "WhitePink", 7);
    		CbSharpPinkFullSlab = new CbColorSlab(true, null, "SharpPink", 7);
    		CbLightPurpleBlueFullSlab = new CbColorSlab(true, null, "LightPurpleBlue", 7);
    		CbPurpleBlueFullSlab = new CbColorSlab(true, null, "PurpleBlue", 7);
    		CbWhitePurpleFullSlab = new CbColorSlab(true, null, "WhitePurple", 7);
    		CbDarkPurpleFullSlab = new CbColorSlab(true, null, "DarkPurple", 7);
    		CbLavenderFullSlab = new CbColorSlab(true, null, "Lavender", 7);
    		CbLightLavenderFullSlab = new CbColorSlab(true, null, "LightLavender", 7);


    		//RedTab
    		CbOrangeFullSlab = new CbColorSlab(true, null, "Orange", 7);
    		CbRedFullSlab = new CbColorSlab(true, null, "Red", 7);
    		CbWineRedFullSlab = new CbColorSlab(true, null, "WineRed", 7);
    		CbRedOrangeFullSlab = new CbColorSlab(true, null, "RedOrange", 7);
    		CbLightOrangeFullSlab = new CbColorSlab(true, null, "LightOrange", 7);
    		CbLightOrangeRedFullSlab = new CbColorSlab(true, null, "LightOrangeRed", 7);

    		//YellowTab
    		CbYellowFullSlab = new CbColorSlab(true, null, "Yellow", 7);
    		CbLightYellowFullSlab = new CbColorSlab(true, null, "LightYellow", 7);
    		CbDarkYellowFullSlab = new CbColorSlab(true, null, "DarkYellow", 7);

    		//Defines the stairs in minecraft

    		//GrayTab
        	CbBlackStair = new CbColorStair(CbBlack, 0, "Black", 2);
    		CbGreyStair = new CbColorStair(CbGrey, 0, "Grey", 2);
    		CbLightGreyStair = new CbColorStair(CbLightGrey, 0, "LightGrey", 2);
    		CbWhiteStair = new CbColorStair(CbWhite, 0, "White", 2);
    		CbDarkGreyStair = new CbColorStair(CbDarkGrey, 0, "DarkGrey", 2);

    		//BlueTab
    		CbBlueStair = new CbColorStair(CbBlue, 0, "Blue", 0);
    		CbLightBlueStair = new CbColorStair(CbLightBlue, 0, "LightBlue", 0);
    		CbDarkBlueishCyanStair = new CbColorStair(CbDarkBlueishCyan, 0, "DarkBlueishCyan", 0);
    		CbDarkBlueStair = new CbColorStair(CbDarkBlue, 0, "DarkBlue", 0);
    		CbCyanStair = new CbColorStair(CbCyan, 0, "Cyan", 0);
    		CbLightCyanStair = new CbColorStair(CbLightCyan, 0, "LightCyan", 0);
    		CbBlueishWhiteStair = new CbColorStair(CbBlueishWhite, 0, "BlueishWhite", 0);
    		CbNavyBlueStair = new CbColorStair(CbNavyBlue, 0, "NavyBlue", 0);

    		//GreenTab
    		CbGreenStair = new CbColorStair(CbGreen, 0, "Green", 3);
    		CbDarkGreenStair = new CbColorStair(CbDarkGreen, 0, "DarkGreen", 3);
    		CbLimeGreenStair = new CbColorStair(CbLimeGreen, 0, "LimeGreen", 3);
    		CbGreenishCyanStair = new CbColorStair(CbGreenishCyan, 0, "GreenishCyan", 3);
    		CbYellowishGreenStair = new CbColorStair(CbYellowishGreen, 0, "YellowishGreen", 3);
    		CbDarkCyanishGreenStair = new CbColorStair(CbDarkCyanishGreen, 0, "DarkCyanishGreen", 3);
    		CbDarkCyanStair = new CbColorStair(CbDarkCyan, 0, "DarkCyan", 3);

    		//BrownTab
    		CbBrownStair = new CbColorStair(CbBrown, 0, "Brown", 1);
    		CbLightBrownStair = new CbColorStair(CbLightBrown, 0, "LightBrown", 1);
    		CbDarkBrownishRedStair = new CbColorStair(CbDarkBrownishRed, 0, "DarkBrownishRed", 1);

    		//PinkTab
			CbLightPurpleStair = new CbColorStair(CbLightPurple, 0, "LightPurple", 4);
    		CbMagentaStair = new CbColorStair(CbMagenta, 0, "Magenta", 4);
    		CbPinkStair = new CbColorStair(CbPink, 0, "Pink", 4);
    		CbPurpleStair = new CbColorStair(CbPurple, 0, "Purple", 4);
    		CbWhitePinkStair = new CbColorStair(CbWhitePink, 0, "WhitePink", 4);
    		CbSharpPinkStair = new CbColorStair(CbSharpPink, 0, "SharpPink", 4);
    		CbLightPurpleBlueStair = new CbColorStair(CbLightPurpleBlue, 0, "LightPurpleBlue", 4);
    		CbPurpleBlueStair = new CbColorStair(CbPurpleBlue, 0, "PurpleBlue", 4);
    		CbWhitePurpleStair = new CbColorStair(CbWhitePurple, 0, "WhitePurple", 4);
    		CbDarkPurpleStair = new CbColorStair(CbDarkPurple, 0, "DarkPurple", 4);
    		CbLavenderStair = new CbColorStair(CbLavender, 0, "Lavender", 4);
    		CbLightLavenderStair = new CbColorStair(CbLightLavender, 0, "LightLavender", 4);



    		//RedTab
    		CbOrangeStair = new CbColorStair(CbOrange, 0, "Orange", 6);
    		CbRedStair = new CbColorStair(CbRed, 0, "Red", 6);
    		CbWineRedStair = new CbColorStair(CbWineRed, 0, "WineRed", 6);
    		CbRedOrangeStair = new CbColorStair(CbRedOrange, 0, "RedOrange", 6);
    		CbLightOrangeStair = new CbColorStair(CbLightOrange, 0, "LightOrange", 6);
    		CbLightOrangeRedStair = new CbColorStair(CbLightOrangeRed, 0, "LightOrangeRed", 6);

    		//YellowTab
    		CbYellowStair = new CbColorStair(CbYellow, 0, "Yellow", 5);
    		CbLightYellowStair = new CbColorStair(CbLightYellow, 0, "LightYellow", 5);
    		CbDarkYellowStair = new CbColorStair(CbDarkYellow, 0, "DarkYellow", 5);


    		//Defines items in minecraft
    		CbWhiteDust = new CbColorItem().setUnlocalizedName("WhiteDust").setCreativeTab(ItemTab).setTextureName(modid + ":" + "WhiteDust");
    		CbWhiteIngot = new CbColorItem().setUnlocalizedName("WhiteIngot").setCreativeTab(ItemTab).setTextureName(modid + ":" + "WhiteIngot");


    		ColorRegistrations.addRegistrations(this);
    		//Smelting Recipes
    			GameRegistry.addSmelting(CbWhiteDust, new ItemStack(CbWhiteIngot, 2), 0.1F);


        	//Crafting Recipes

        	GameRegistry.addShapedRecipe(new ItemStack(CbWhiteDust, 32), new Object[] { "IOI", "OGO", "IOI", 'I', Items.iron_ingot, 'O', Blocks.obsidian, 'G', Blocks.glowstone });
        	GameRegistry.addShapedRecipe(new ItemStack(CbWhite, 4), new Object[] { "WW", "WW", 'W', CbWhiteIngot});
        	GameRegistry.addShapelessRecipe(new ItemStack(CbBlack, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 0)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbRed, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 1)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbGreen, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 2)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbBrown, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 3)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbBlue, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 4)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbPurple, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 5)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbCyan, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 6)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbLightGrey, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 7)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbGrey, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 8)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbPink, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 9)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbLimeGreen, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 10)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbYellow, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 11)  });
       		GameRegistry.addShapelessRecipe(new ItemStack(CbLightBlue, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 12)  });
       		GameRegistry.addShapelessRecipe(new ItemStack(CbMagenta, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 13)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbOrange, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 14)  });

        }


		@EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();



        }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {


        }




}

