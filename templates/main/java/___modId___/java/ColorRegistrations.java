/*
    Modified by (c) 2017 Mutous
    Derived from Color Blocks 1.4 (c) 2014 KeeperofMee
    This program is licensed under the terms of the GNU General Public License v3.0.
*/
package colorblocks;

import colorblocks.*;
import colorblocks.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ColorRegistrations {

	public static void addRegistrations(ColorBlocks m){

    	//Registers the blocks in minecraft
		GameRegistry.registerBlock(m.CbBlack, "Black");
		GameRegistry.registerBlock(m.CbBlue, "Blue");
		GameRegistry.registerBlock(m.CbBrown, "Brown");
		GameRegistry.registerBlock(m.CbCyan, "Cyan");
		GameRegistry.registerBlock(m.CbDarkGreen, "DarkGreen");
		GameRegistry.registerBlock(m.CbGreen, "Green");
		GameRegistry.registerBlock(m.CbGrey, "Grey");
		GameRegistry.registerBlock(m.CbLightBlue, "LightBlue");
		GameRegistry.registerBlock(m.CbLightBrown, "LightBrown");
		GameRegistry.registerBlock(m.CbLightGrey, "LightGrey");
		GameRegistry.registerBlock(m.CbLightPurple, "LightPurple");
		GameRegistry.registerBlock(m.CbLimeGreen, "LimeGreen");
		GameRegistry.registerBlock(m.CbMagenta, "Magenta");
		GameRegistry.registerBlock(m.CbOrange, "Orange");
		GameRegistry.registerBlock(m.CbPink, "Pink");
		GameRegistry.registerBlock(m.CbPurple, "Purple");
		GameRegistry.registerBlock(m.CbRed, "Red");
		GameRegistry.registerBlock(m.CbWhite, "White");
		GameRegistry.registerBlock(m.CbWineRed, "WineRed");
		GameRegistry.registerBlock(m.CbYellow, "Yellow");
		GameRegistry.registerBlock(m.CbRedOrange, "RedOrange");
		GameRegistry.registerBlock(m.CbLightOrange, "LightOrange");
		GameRegistry.registerBlock(m.CbWhitePink, "WhitePink");
		GameRegistry.registerBlock(m.CbSharpPink, "SharpPink");
		GameRegistry.registerBlock(m.CbLightPurpleBlue, "LightPurpleBlue");
		GameRegistry.registerBlock(m.CbPurpleBlue, "PurpleBlue");
		GameRegistry.registerBlock(m.CbBlueishWhite, "BlueishWhite");
		GameRegistry.registerBlock(m.CbLightCyan, "LightCyan");
		GameRegistry.registerBlock(m.CbGreenishCyan, "GreenishCyan");
		GameRegistry.registerBlock(m.CbYellowishGreen, "YellowishGreen");
		GameRegistry.registerBlock(m.CbLightYellow, "LightYellow");
		GameRegistry.registerBlock(m.CbLightOrangeRed, "LightOrangeRed");
		GameRegistry.registerBlock(m.CbWhitePurple, "WhitePurple");
		GameRegistry.registerBlock(m.CbDarkYellow, "DarkYellow");
		GameRegistry.registerBlock(m.CbDarkCyan, "DarkCyan");
		GameRegistry.registerBlock(m.CbDarkPurple, "DarkPurple");
		GameRegistry.registerBlock(m.CbDarkBlueishCyan, "DarkBlueishCyan");
		GameRegistry.registerBlock(m.CbDarkBrownishRed, "DarkBrownishRed");
		GameRegistry.registerBlock(m.CbDarkCyanishGreen, "DarkCyanishGreen");
		GameRegistry.registerBlock(m.CbDarkBlue, "DarkBlue");
		GameRegistry.registerBlock(m.CbDarkGrey, "DarkGrey");
		GameRegistry.registerBlock(m.CbNavyBlue, "NavyBlue");
		GameRegistry.registerBlock(m.CbLavender, "Lavender");
		GameRegistry.registerBlock(m.CbLightLavender, "LightLavender");


		//Register HalfSlabs
		GameRegistry.registerBlock(m.CbBlackHalfSlab, CbBlackSlabItem.class,  "BlackHalfSlab");
		GameRegistry.registerBlock(m.CbBlueHalfSlab, CbBlueSlabItem.class, "BlueHalfSlab");
		GameRegistry.registerBlock(m.CbBrownHalfSlab, CbBrownSlabItem.class, "BrownHalfSlab");
		GameRegistry.registerBlock(m.CbCyanHalfSlab, CbCyanSlabItem.class, "CyanHalfSlab");
		GameRegistry.registerBlock(m.CbDarkGreenHalfSlab, CbDarkGreenSlabItem.class, "DarkGreenHalfSlab");
		GameRegistry.registerBlock(m.CbGreenHalfSlab, CbGreenSlabItem.class, "GreenHalfSlab");
		GameRegistry.registerBlock(m.CbGreyHalfSlab, CbGreySlabItem.class, "GreyHalfSlab");
		GameRegistry.registerBlock(m.CbLightBlueHalfSlab, CbLightBlueSlabItem.class, "LightBlueHalfSlab");
		GameRegistry.registerBlock(m.CbLightBrownHalfSlab, CbLightBrownSlabItem.class, "LightBrownHalfSlab");
		GameRegistry.registerBlock(m.CbLightGreyHalfSlab, CbLightGreySlabItem.class, "LightGreyHalfSlab");
		GameRegistry.registerBlock(m.CbLightPurpleHalfSlab, CbLightPurpleSlabItem.class, "LightPurpleHalfSlab");
		GameRegistry.registerBlock(m.CbLimeGreenHalfSlab, CbLimeGreenSlabItem.class, "LimeGreenHalfSlab");
		GameRegistry.registerBlock(m.CbMagentaHalfSlab, CbMagentaSlabItem.class, "MagentaHalfSlab");
		GameRegistry.registerBlock(m.CbOrangeHalfSlab, CbOrangeSlabItem.class, "OrangeHalfSlab");
		GameRegistry.registerBlock(m.CbPinkHalfSlab, CbPinkSlabItem.class, "PinkHalfSlab");
		GameRegistry.registerBlock(m.CbPurpleHalfSlab, CbPurpleSlabItem.class, "PurpleHalfSlab");
		GameRegistry.registerBlock(m.CbRedHalfSlab, CbRedSlabItem.class, "RedHalfSlab");
		GameRegistry.registerBlock(m.CbWhiteHalfSlab, CbWhiteSlabItem.class, "WhiteHalfSlab");
		GameRegistry.registerBlock(m.CbWineRedHalfSlab, CbWineRedSlabItem.class, "WineRedHalfSlab");
		GameRegistry.registerBlock(m.CbYellowHalfSlab, CbYellowSlabItem.class, "YellowHalfSlab");
		GameRegistry.registerBlock(m.CbRedOrangeHalfSlab, CbRedOrangeSlabItem.class, "RedOrangeHalfSlab");
		GameRegistry.registerBlock(m.CbLightOrangeHalfSlab, CbLightOrangeSlabItem.class, "LightOrangeHalfSlab");
		GameRegistry.registerBlock(m.CbWhitePinkHalfSlab, CbWhitePinkSlabItem.class, "WhitePinkHalfSlab");
		GameRegistry.registerBlock(m.CbSharpPinkHalfSlab, CbSharpPinkSlabItem.class, "SharpPinkHalfSlab");
		GameRegistry.registerBlock(m.CbLightPurpleBlueHalfSlab, CbLightPurpleBlueSlabItem.class, "LightPurpleBlueHalfSlab");
		GameRegistry.registerBlock(m.CbPurpleBlueHalfSlab, CbPurpleBlueSlabItem.class, "PurpleBlueHalfSlab");
		GameRegistry.registerBlock(m.CbBlueishWhiteHalfSlab, CbBlueishWhiteSlabItem.class, "BlueishWhiteHalfSlab");
		GameRegistry.registerBlock(m.CbLightCyanHalfSlab, CbLightCyanSlabItem.class, "LightCyanHalfSlab");
		GameRegistry.registerBlock(m.CbGreenishCyanHalfSlab, CbGreenishCyanSlabItem.class, "GreenishCyanHalfSlab");
		GameRegistry.registerBlock(m.CbYellowishGreenHalfSlab, CbYellowishGreenSlabItem.class, "YellowishGreenHalfSlab");
		GameRegistry.registerBlock(m.CbLightYellowHalfSlab, CbLightYellowSlabItem.class, "LightYellowHalfSlab");
		GameRegistry.registerBlock(m.CbLightOrangeRedHalfSlab, CbLightOrangeRedSlabItem.class, "LightOrangeRedHalfSlab");
		GameRegistry.registerBlock(m.CbWhitePurpleHalfSlab, CbWhitePurpleSlabItem.class, "WhitePurpleHalfSlab");
		GameRegistry.registerBlock(m.CbDarkYellowHalfSlab, CbDarkYellowSlabItem.class, "DarkYellowHalfSlab");
		GameRegistry.registerBlock(m.CbDarkCyanHalfSlab, CbDarkCyanSlabItem.class, "DarkCyanHalfSlab");
		GameRegistry.registerBlock(m.CbDarkPurpleHalfSlab, CbDarkPurpleSlabItem.class, "DarkPurpleHalfSlab");
		GameRegistry.registerBlock(m.CbDarkBlueishCyanHalfSlab, CbDarkBlueishCyanSlabItem.class, "DarkBlueishCyanHalfSlab");
		GameRegistry.registerBlock(m.CbDarkBrownishRedHalfSlab, CbDarkBrownishRedSlabItem.class, "DarkBrownishRedHalfSlab");
		GameRegistry.registerBlock(m.CbDarkCyanishGreenHalfSlab, CbDarkCyanishGreenSlabItem.class, "DarkCyanishGreenHalfSlab");
		GameRegistry.registerBlock(m.CbDarkBlueHalfSlab, CbDarkBlueSlabItem.class, "DarkBlueHalfSlab");
		GameRegistry.registerBlock(m.CbDarkGreyHalfSlab, CbDarkGreySlabItem.class, "DarkGreyHalfSlab");
		GameRegistry.registerBlock(m.CbNavyBlueHalfSlab, CbNavyBlueSlabItem.class, "NavyBlueHalfSlab");
		GameRegistry.registerBlock(m.CbLavenderHalfSlab, CbLavenderSlabItem.class, "LavenderHalfSlab");
		GameRegistry.registerBlock(m.CbLightLavenderHalfSlab, CbLTLavenderSlabItem.class, "LightLavenderHalfSlab");

		//Double slabs
		GameRegistry.registerBlock(m.CbBlackFullSlab, CbBlackSlabItem.class, "BlackFullSlab");
		GameRegistry.registerBlock(m.CbBlueFullSlab, CbBlueSlabItem.class, "BlueFullSlab");
		GameRegistry.registerBlock(m.CbBrownFullSlab, CbBrownSlabItem.class, "BrownFullSlab");
		GameRegistry.registerBlock(m.CbCyanFullSlab, CbCyanSlabItem.class, "CyanFullSlab");
		GameRegistry.registerBlock(m.CbDarkGreenFullSlab, CbDarkGreenSlabItem.class, "DarkGreenFullSlab");
		GameRegistry.registerBlock(m.CbGreenFullSlab, CbGreenSlabItem.class, "GreenFullSlab");
		GameRegistry.registerBlock(m.CbGreyFullSlab, CbGreySlabItem.class, "GreyFullSlab");
		GameRegistry.registerBlock(m.CbLightBlueFullSlab, CbLightBlueSlabItem.class, "LightBlueFullSlab");
		GameRegistry.registerBlock(m.CbLightBrownFullSlab, CbLightBrownSlabItem.class, "LightBrownFullSlab");
		GameRegistry.registerBlock(m.CbLightGreyFullSlab, CbLightGreySlabItem.class, "LightGreyFullSlab");
		GameRegistry.registerBlock(m.CbLightPurpleFullSlab, CbLightPurpleSlabItem.class, "LightPurpleFullSlab");
		GameRegistry.registerBlock(m.CbLimeGreenFullSlab, CbLimeGreenSlabItem.class, "LimeGreenFullSlab");
		GameRegistry.registerBlock(m.CbMagentaFullSlab, CbMagentaSlabItem.class, "MagentaFullSlab");
		GameRegistry.registerBlock(m.CbOrangeFullSlab, CbOrangeSlabItem.class, "OrangeFullSlab");
		GameRegistry.registerBlock(m.CbPinkFullSlab, CbPinkSlabItem.class, "PinkFullSlab");
		GameRegistry.registerBlock(m.CbPurpleFullSlab, CbPurpleSlabItem.class, "PurpleFullSlab");
		GameRegistry.registerBlock(m.CbRedFullSlab, CbRedSlabItem.class, "RedFullSlab");
		GameRegistry.registerBlock(m.CbWhiteFullSlab, CbWhiteSlabItem.class, "WhiteFullSlab");
		GameRegistry.registerBlock(m.CbWineRedFullSlab, CbWineRedSlabItem.class, "WineRedFullSlab");
		GameRegistry.registerBlock(m.CbYellowFullSlab, CbYellowSlabItem.class, "YellowFullSlab");
		GameRegistry.registerBlock(m.CbRedOrangeFullSlab, CbRedOrangeSlabItem.class, "RedOrangeFullSlab");
		GameRegistry.registerBlock(m.CbLightOrangeFullSlab, CbLightOrangeSlabItem.class, "LightOrangeFullSlab");
		GameRegistry.registerBlock(m.CbWhitePinkFullSlab, CbWhitePinkSlabItem.class, "WhitePinkFullSlab");
		GameRegistry.registerBlock(m.CbSharpPinkFullSlab, CbSharpPinkSlabItem.class, "SharpPinkFullSlab");
		GameRegistry.registerBlock(m.CbLightPurpleBlueFullSlab, CbLightPurpleBlueSlabItem.class, "LightPurpleBlueFullSlab");
		GameRegistry.registerBlock(m.CbPurpleBlueFullSlab, CbPurpleBlueSlabItem.class, "PurpleBlueFullSlab");
		GameRegistry.registerBlock(m.CbBlueishWhiteFullSlab, CbBlueishWhiteSlabItem.class, "BlueishWhiteFullSlab");
		GameRegistry.registerBlock(m.CbLightCyanFullSlab, CbLightCyanSlabItem.class, "LightCyanFullSlab");
		GameRegistry.registerBlock(m.CbGreenishCyanFullSlab, CbGreenishCyanSlabItem.class, "GreenishCyanFullSlab");
		GameRegistry.registerBlock(m.CbYellowishGreenFullSlab, CbYellowishGreenSlabItem.class, "YellowishGreenFullSlab");
		GameRegistry.registerBlock(m.CbLightYellowFullSlab, CbLightYellowSlabItem.class, "LightYellowFullSlab");
		GameRegistry.registerBlock(m.CbLightOrangeRedFullSlab, CbLightOrangeRedSlabItem.class, "LightOrangeRedFullSlab");
		GameRegistry.registerBlock(m.CbWhitePurpleFullSlab, CbWhitePurpleSlabItem.class, "WhitePurpleFullSlab");
		GameRegistry.registerBlock(m.CbDarkYellowFullSlab, CbDarkYellowSlabItem.class, "DarkYellowFullSlab");
		GameRegistry.registerBlock(m.CbDarkCyanFullSlab, CbDarkCyanSlabItem.class, "DarkCyanFullSlab");
		GameRegistry.registerBlock(m.CbDarkPurpleFullSlab, CbDarkPurpleSlabItem.class, "DarkPurpleFullSlab");
		GameRegistry.registerBlock(m.CbDarkBlueishCyanFullSlab, CbDarkBlueishCyanSlabItem.class, "DarkBlueishCyanFullSlab");
		GameRegistry.registerBlock(m.CbDarkBrownishRedFullSlab, CbDarkBrownishRedSlabItem.class, "DarkBrownishRedFullSlab");
		GameRegistry.registerBlock(m.CbDarkCyanishGreenFullSlab, CbDarkCyanishGreenSlabItem.class, "DarkCyanishGreenFullSlab");
		GameRegistry.registerBlock(m.CbDarkBlueFullSlab, CbDarkBlueSlabItem.class, "DarkBlueFullSlab");
		GameRegistry.registerBlock(m.CbDarkGreyFullSlab, CbDarkGreySlabItem.class, "DarkGreyFullSlab");
		GameRegistry.registerBlock(m.CbNavyBlueFullSlab, CbNavyBlueSlabItem.class, "NavyBlueFullSlab");
		GameRegistry.registerBlock(m.CbLavenderFullSlab, CbLavenderSlabItem.class, "LavenderFullSlab");
		GameRegistry.registerBlock(m.CbLightLavenderFullSlab, CbLTLavenderSlabItem.class, "LightLavenderFullSlab");


		//Register Stairs
		GameRegistry.registerBlock(m.CbBlackStair, "BlackStair");
		GameRegistry.registerBlock(m.CbBlueStair, "BlueStair");
		GameRegistry.registerBlock(m.CbBrownStair, "BrownStair");
		GameRegistry.registerBlock(m.CbCyanStair, "CyanStair");
		GameRegistry.registerBlock(m.CbDarkGreenStair, "DarkGreenStair");
		GameRegistry.registerBlock(m.CbGreenStair, "GreenStair");
		GameRegistry.registerBlock(m.CbGreyStair, "GreyStair");
		GameRegistry.registerBlock(m.CbLightBlueStair, "LightBlueStair");
		GameRegistry.registerBlock(m.CbLightBrownStair, "LightBrownStair");
		GameRegistry.registerBlock(m.CbLightGreyStair, "LightGreyStair");
		GameRegistry.registerBlock(m.CbLightPurpleStair, "LightPurpleStair");
		GameRegistry.registerBlock(m.CbLimeGreenStair, "LimeGreenStair");
		GameRegistry.registerBlock(m.CbMagentaStair, "MagentaStair");
		GameRegistry.registerBlock(m.CbOrangeStair, "OrangeStair");
		GameRegistry.registerBlock(m.CbPinkStair, "PinkStair");
		GameRegistry.registerBlock(m.CbPurpleStair, "PurpleStair");
		GameRegistry.registerBlock(m.CbRedStair, "RedStair");
		GameRegistry.registerBlock(m.CbWhiteStair, "WhiteStair");
		GameRegistry.registerBlock(m.CbWineRedStair, "WineRedStair");
		GameRegistry.registerBlock(m.CbYellowStair, "YellowStair");
		GameRegistry.registerBlock(m.CbRedOrangeStair, "RedOrangeStair");
		GameRegistry.registerBlock(m.CbLightOrangeStair, "LightOrangeStair");
		GameRegistry.registerBlock(m.CbWhitePinkStair, "WhitePinkStair");
		GameRegistry.registerBlock(m.CbSharpPinkStair, "SharpPinkStair");
		GameRegistry.registerBlock(m.CbLightPurpleBlueStair, "LightPurpleBlueStair");
		GameRegistry.registerBlock(m.CbPurpleBlueStair, "PurpleBlueStair");
		GameRegistry.registerBlock(m.CbBlueishWhiteStair, "BlueishWhiteStair");
		GameRegistry.registerBlock(m.CbLightCyanStair, "LightCyanStair");
		GameRegistry.registerBlock(m.CbGreenishCyanStair, "GreenishCyanStair");
		GameRegistry.registerBlock(m.CbYellowishGreenStair, "YellowishGreenStair");
		GameRegistry.registerBlock(m.CbLightYellowStair, "LightYellowStair");
		GameRegistry.registerBlock(m.CbLightOrangeRedStair, "LightOrangeRedStair");
		GameRegistry.registerBlock(m.CbWhitePurpleStair, "WhitePurpleStair");
		GameRegistry.registerBlock(m.CbDarkYellowStair, "DarkYellowStair");
		GameRegistry.registerBlock(m.CbDarkCyanStair, "DarkCyanStair");
		GameRegistry.registerBlock(m.CbDarkPurpleStair, "DarkPurpleStair");
		GameRegistry.registerBlock(m.CbDarkBlueishCyanStair, "DarkBlueishCyanStair");
		GameRegistry.registerBlock(m.CbDarkBrownishRedStair, "DarkBrownishRedStair");
		GameRegistry.registerBlock(m.CbDarkCyanishGreenStair, "DarkCyanishGreenStair");
		GameRegistry.registerBlock(m.CbDarkBlueStair, "DarkBlueStair");
		GameRegistry.registerBlock(m.CbDarkGreyStair, "DarkGreyStair");
		GameRegistry.registerBlock(m.CbNavyBlueStair, "NavyBlueStair");
		GameRegistry.registerBlock(m.CbLavenderStair, "LavenderStair");
		GameRegistry.registerBlock(m.CbLightLavenderStair, "LightLavenderStair");

    		//Registers items in Minecraft
		GameRegistry.registerItem(m.CbWhiteDust, "WhiteDust");
		GameRegistry.registerItem(m.CbWhiteIngot, "WhiteIngot");
	}

}
