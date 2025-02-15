package ganymedes01.etfuturum.lib;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.MapColor;
import net.minecraft.entity.passive.EntitySheep;

import java.awt.*;

public enum EnumColour {

	BLACK("Black", MapColor.blackColor),
	RED("Red", MapColor.redColor),
	GREEN("Green", MapColor.greenColor),
	BROWN("Brown", MapColor.brownColor),
	BLUE("Blue", MapColor.blueColor),
	PURPLE("Purple", MapColor.purpleColor),
	CYAN("Cyan", MapColor.cyanColor),
	LIGHT_GREY("LightGray", MapColor.silverColor),
	GREY("Gray", MapColor.grayColor),
	PINK("Pink", MapColor.pinkColor),
	LIME("Lime", MapColor.limeColor),
	YELLOW("Yellow", MapColor.yellowColor),
	LIGHT_BLUE("LightBlue", MapColor.lightBlueColor),
	MAGENTA("Magenta", MapColor.magentaColor),
	ORANGE("Orange", MapColor.adobeColor),
	WHITE("White", MapColor.snowColor);

	final String dye;
	final String name;
	final MapColor mapColor;

	EnumColour(String name, MapColor mapColor) {
		dye = "dye" + name;
		this.name = name;
		this.mapColor = mapColor;
	}

	public String getOreName() {
		return dye;
	}

	public MapColor getMapColour() {
		return mapColor;
	}

	public int getDamage() {
		return BlockColored.func_150031_c(ordinal());
	}

	public int getRGB() {
		int i = getDamage();
		return new Color(EntitySheep.fleeceColorTable[i][0], EntitySheep.fleeceColorTable[i][1], EntitySheep.fleeceColorTable[i][2]).getRGB();
	}

	public static EnumColour fromDamage(int meta) {
		meta = BlockColored.func_150031_c(meta);
		return values()[Math.min(Math.max(0, meta), values().length - 1)];
	}

}
