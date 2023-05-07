package ganymedes01.etfuturum;

import cpw.mods.fml.common.registry.GameRegistry;
import ganymedes01.etfuturum.blocks.*;
import ganymedes01.etfuturum.blocks.itemblocks.*;
import ganymedes01.etfuturum.blocks.ores.BlockCopperOre;
import ganymedes01.etfuturum.blocks.ores.BlockDeepslateOre;
import ganymedes01.etfuturum.blocks.ores.BlockDeepslateRedstoneOre;
import ganymedes01.etfuturum.blocks.ores.BlockOreNetherGold;
import ganymedes01.etfuturum.client.sound.ModSounds;
import ganymedes01.etfuturum.configuration.configs.ConfigBlocksItems;
import ganymedes01.etfuturum.core.utils.Utils;
import ganymedes01.etfuturum.tileentities.TileEntityWoodSign;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;

public enum ModBlocks {
	CRYING_OBSIDIAN(true, new BlockCryingObsidian()),
	ROSE(true, new BlockOldRose()),
	OLD_GRAVEL(true, new BlockOldGravel()),


	STONE(true, new BlockNewStone(), ItemBlockGeneric.class),
	PRISMARINE_BLOCK(true, new BlockPrismarine(), ItemBlockGeneric.class),
	SEA_LANTERN(true, new BlockSeaLantern()),
	DAYLIGHT_DETECTOR_INVERTED(true, new BlockInvertedDaylightDetector()),
	RED_SANDSTONE(true, new BlockRedSandstone(), ItemBlockRedSandstone.class),
	BROWN_MUSHROOM(true, new BlockSilkedMushroom(Blocks.brown_mushroom_block, "brown")),
	RED_MUSHROOM(true, new BlockSilkedMushroom(Blocks.red_mushroom_block, "red")),
	COARSE_DIRT(true, new BlockCoarseDirt()),
	BANNER(true, new BlockBanner(), ItemBlockBanner.class),
	SLIME(true, new BlockSlime()),
	SPONGE(true, new BlockSponge(), ItemBlockGeneric.class),
	BEETROOTS(true, new BlockBeetroot()),
	PURPUR_BLOCK(true, new BlockPurpur()),
	PURPUR_PILLAR(true, new BlockPurpurPillar()),
	END_BRICKS(true, new BlockEndBricks()),
	GRASS_PATH(true, new BlockGrassPath()),
	END_ROD(true, new BlockEndRod()),
	CHORUS_PLANT(true, new BlockChorusPlant()),
	CHORUS_FLOWER(true, new BlockChorusFlower()),
	BONE(true, new BlockBone()),
	RED_NETHERBRICK(true, new BlockNewNetherBrick(), ItemBlockGeneric.class), //Also contains chiseled and cracked nether bricks
	NETHER_WART(true, new BlockNetherwart()),
	ANCIENT_DEBRIS(true, new BlockAncientDebris(), ItemBlockUninflammable.class),
	NETHERITE_BLOCK(true, new BlockNetherite(), ItemBlockUninflammable.class),
	BARRIER(true, new BlockBarrier()),
	NETHER_GOLD_ORE(true, new BlockOreNetherGold()),
	BLUE_ICE(true, new BlockBlueIce()),
	SMOOTH_STONE(true, new BlockSmoothStone()),
	SMOOTH_SANDSTONE(true, new BlockSmoothSandstone(0)),
	SMOOTH_RED_SANDSTONE(true, new BlockSmoothSandstone(1)),
	SMOOTH_QUARTZ(true, new BlockSmoothQuartz()),
	QUARTZ_BRICKS(true, new BlockQuartzBricks()),
	LOG_STRIPPED(true, new BlockStrippedOldLog(), ItemBlockGeneric.class),
	LOG2_STRIPPED(true, new BlockStrippedNewLog(), ItemBlockGeneric.class),
	BARK(true, new BlockWoodBarkOld(), ItemBlockGeneric.class),
	BARK2(true, new BlockWoodBarkNew(), ItemBlockGeneric.class),
	WOOD_STRIPPED(true, new BlockStrippedOldWood(), ItemBlockGeneric.class),
	WOOD2_STRIPPED(true, new BlockStrippedNewWood(), ItemBlockGeneric.class),
	CONCRETE(true, new BlockConcrete(), ItemBlockGeneric.class),
	CONCRETE_POWDER(true, new BlockConcretePowder(), ItemBlockGeneric.class),
	COPPER_ORE(true, new BlockCopperOre()),
	DEEPSLATE_COPPER_ORE(true, new BlockDeepslateOre(COPPER_ORE.get())),
	CORNFLOWER(true, new BlockCornflower(), ItemBlockFlower.class),
	LILY_OF_THE_VALLEY(true, new BlockLilyOfTheValley(), ItemBlockFlower.class),
	WITHER_ROSE(true, new BlockWitherRose(), ItemBlockFlower.class),
	SWEET_BERRY_BUSH(true, new BlockBerryBush(), null),
	WHITE_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(0)),
	ORANGE_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(1)),
	MAGENTA_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(2)),
	LIGHT_BLUE_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(3)),
	YELLOW_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(4)),
	LIME_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(5)),
	PINK_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(6)),
	GRAY_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(7)),
	LIGHT_GRAY_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(8)),
	CYAN_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(9)),
	PURPLE_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(10)),
	BLUE_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(11)),
	BROWN_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(12)),
	GREEN_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(13)),
	RED_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(14)),
	BLACK_GLAZED_TERRACOTTA(true, new BlockGlazedTerracotta(15)),
	COPPER_BLOCK(true, new BlockCopper(), ItemBlockCopper.class),
	LIGHTNING_ROD(true, new BlockLightningRod()),
	DEEPSLATE(true, new BlockDeepslate()),
	COBBLED_DEEPSLATE(true, new BlockDeepslateCobbled()),
	POLISHED_DEEPSLATE(true, new BlockDeepslatePolished()),
	DEEPSLATE_BRICKS(true, new BlockDeepslateBricks(), ItemBlockDeepslate.class),
	TUFF(true, new BlockTuff()),
	RAW_ORE_BLOCK(true, new BlockRawOre(), ItemBlockRawOre.class),
	SMOOTH_BASALT(true, new BlockSmoothBasalt()),
	CALCITE(true, new BlockCalcite()),
	AMETHYST_BLOCK(true, new BlockAmethystBlock()),
	BUDDING_AMETHYST(true, new BlockBuddingAmethyst()),
	AMETHYST_CLUSTER_1(true, new BlockAmethystCluster(0), ItemBlockAmethystCluster.class),
	AMETHYST_CLUSTER_2(true, new BlockAmethystCluster(1), ItemBlockAmethystCluster.class),
	SCULK(true, new BlockSculk()),
	SCULK_CATALYST(true, new BlockSculkCatalyst()),
	TINTED_GLASS(true, new BlockTintedGlass()),
	STONE_WALL(true, new BlockNewWall("stone_wall", new Block[]{Blocks.stonebrick, Blocks.stonebrick, Blocks.sandstone, Blocks.brick_block}, new int[]{0, 1, 0, 0}, new String[]{"stone_brick_wall", "mossy_stone_brick_wall", "sandstone_wall", "brick_wall"}), ItemBlockNewWall.class),
	NETHER_BRICK_WALL(true, new BlockNewWall("nether_brick_wall", new Block[]{Blocks.nether_brick}, new int[]{0}, null), ItemBlockNewWall.class),
	STONE_WALL_2(true, new BlockNewWall("stone_wall_2", new Block[]{STONE.get(), STONE.get(), STONE.get()}, new int[]{1, 3, 5}, new String[]{"granite_wall", "diorite_wall", "andesite_wall"}), ItemBlockNewWall.class),
	RED_SANDSTONE_WALL(true, new BlockNewWall("red_sandstone_wall", new Block[]{RED_SANDSTONE.get()}, new int[]{0}, null), ItemBlockNewWall.class),
	PRISMARINE_WALL(true, new BlockNewWall("prismarine_wall", new Block[]{PRISMARINE_BLOCK.get()}, new int[]{0}, null), ItemBlockNewWall.class),
	RED_NETHER_BRICK_WALL(true, new BlockNewWall("red_nether_brick_wall", new Block[]{RED_NETHERBRICK.get()}, new int[]{0}, null), ItemBlockNewWall.class),
	END_BRICK_WALL(true, new BlockNewWall("end_brick_wall", new Block[]{END_BRICKS.get()}, new int[]{0}, null), ItemBlockNewWall.class),
	DEEPSLATE_WALL(true, new BlockNewWall("deepslate_wall", new Block[]{COBBLED_DEEPSLATE.get(), POLISHED_DEEPSLATE.get()}, new int[]{0, 0}, new String[]{"cobbled_deepslate_wall", "polished_deepslate_wall"}), ItemBlockNewWall.class),
	DEEPSLATE_BRICK_WALL(true, new BlockNewWall("deepslate_brick_wall", new Block[]{DEEPSLATE_BRICKS.get(), DEEPSLATE_BRICKS.get()}, new int[]{0, 2}, new String[]{"deepslate_brick_wall", "deepslate_tile_wall"}), ItemBlockNewWall.class),
	DEEPSLATE_COAL_ORE(true, new BlockDeepslateOre(Blocks.coal_ore)),
	DEEPSLATE_IRON_ORE(true, new BlockDeepslateOre(Blocks.iron_ore)),
	DEEPSLATE_GOLD_ORE(true, new BlockDeepslateOre(Blocks.gold_ore)),
	DEEPSLATE_REDSTONE_ORE(true, new BlockDeepslateRedstoneOre(false)),
	DEEPSLATE_LIT_REDSTONE_ORE(true, new BlockDeepslateRedstoneOre(true)),
	DEEPSLATE_LAPIS_ORE(true, new BlockDeepslateOre(Blocks.lapis_ore)),
	DEEPSLATE_DIAMOND_ORE(true, new BlockDeepslateOre(Blocks.diamond_ore)),
	DEEPSLATE_EMERALD_ORE(true, new BlockDeepslateOre(Blocks.emerald_ore)),
	BREWING_STAND(true, new BlockNewBrewingStand()),
	BEACON(true, new BlockNewBeacon()),
	ENCHANTMENT_TABLE(true, new BlockNewEnchantmentTable()),
	ANVIL(true, new BlockNewAnvil()),
	DAYLIGHT_DETECTOR(true, new BlockNewDaylightSensor()),
	FROSTED_ICE(true, new BlockFrostedIce()),
	LAVA_CAULDRON(true, new BlockLavaCauldron(), null),
	POTION_CAULDRON(true, new BlockPotionCauldron(), null),
	END_GATEWAY(true, new BlockEndGateway()),
	OBSERVER(true, new BlockObserver()),
	TARGET(true, new BlockTarget()),
	RED_SANDSTONE_STAIRS(true, new BlockGenericStairs(RED_SANDSTONE.get(), 0).setBlockName(Utils.getUnlocalisedName("red_sandstone_stairs"))),
	PURPUR_STAIRS(true, new BlockGenericStairs(PURPUR_BLOCK.get(), 0).setBlockName(Utils.getUnlocalisedName("purpur_stairs"))),
	RED_SANDSTONE_SLAB(true, new BlockRedSandstoneSlab(false), ItemBlockGenericSlab.class),
	DOUBLE_RED_SANDSTONE_SLAB(true, new BlockRedSandstoneSlab(true), ItemBlockGenericSlab.class),
	PURPUR_SLAB(true, new BlockPurpurSlab(false), ItemBlockGenericSlab.class),
	DOUBLE_PURPUR_SLAB(true, new BlockPurpurSlab(true), ItemBlockGenericSlab.class),
	STONE_SLAB(true, new BlockStoneSlab1(false), ItemBlockGenericSlab.class),
	DOUBLE_STONE_SLAB(true, new BlockStoneSlab1(true), ItemBlockGenericSlab.class),
	STONE_SLAB_2(true, new BlockStoneSlab2(false), ItemBlockGenericSlab.class),
	DOUBLE_STONE_SLAB_2(true, new BlockStoneSlab2(true), ItemBlockGenericSlab.class),
	PRISMARINE_STAIRS(true, new BlockGenericStairs(PRISMARINE_BLOCK.get(), 0).setBlockName(Utils.getUnlocalisedName("prismarine_stairs"))),
	PRISMARINE_STAIRS_BRICK(true, new BlockGenericStairs(PRISMARINE_BLOCK.get(), 1).setBlockName(Utils.getUnlocalisedName("prismarine_stairs_brick"))),
	PRISMARINE_STAIRS_DARK(true, new BlockGenericStairs(PRISMARINE_BLOCK.get(), 2).setBlockName(Utils.getUnlocalisedName("prismarine_stairs_dark"))),
	SMOOTH_SANDSTONE_STAIRS(true, new BlockGenericStairs(SMOOTH_SANDSTONE.get(), 0).setBlockName(Utils.getUnlocalisedName("smooth_sandstone_stairs"))),
	SMOOTH_RED_SANDSTONE_STAIRS(true, new BlockGenericStairs(SMOOTH_RED_SANDSTONE.get(), 0).setBlockName(Utils.getUnlocalisedName("smooth_red_sandstone_stairs"))),
	SMOOTH_QUARTZ_STAIRS(true, new BlockGenericStairs(SMOOTH_QUARTZ.get(), 0).setBlockName(Utils.getUnlocalisedName("smooth_quartz_stairs"))),
	RED_NETHERBRICK_STAIRS(true, new BlockGenericStairs(RED_NETHERBRICK.get(), 0).setBlockName(Utils.getUnlocalisedName("red_netherbrick_stairs"))),
	GRANITE_STAIRS(true, new BlockGenericStairs(STONE.get(), 1).setBlockName(Utils.getUnlocalisedName("granite_stairs"))),
	POLISHED_GRANITE_STAIRS(true, new BlockGenericStairs(STONE.get(), 2).setBlockName(Utils.getUnlocalisedName("polished_granite_stairs"))),
	DIORITE_STAIRS(true, new BlockGenericStairs(STONE.get(), 3).setBlockName(Utils.getUnlocalisedName("diorite_stairs"))),
	POLISHED_DIORITE_STAIRS(true, new BlockGenericStairs(STONE.get(), 4).setBlockName(Utils.getUnlocalisedName("polished_diorite_stairs"))),
	ANDESITE_STAIRS(true, new BlockGenericStairs(STONE.get(), 5).setBlockName(Utils.getUnlocalisedName("andesite_stairs"))),
	POLISHED_ANDESITE_STAIRS(true, new BlockGenericStairs(STONE.get(), 6).setBlockName(Utils.getUnlocalisedName("polished_andesite_stairs"))),
	MOSSY_STONE_BRICK_STAIRS(true, new BlockGenericStairs(Blocks.stonebrick, 1).setBlockName(Utils.getUnlocalisedName("mossy_stone_brick_stairs"))),
	MOSSY_COBBLESTONE_STAIRS(true, new BlockGenericStairs(Blocks.mossy_cobblestone, 0).setBlockName(Utils.getUnlocalisedName("mossy_cobblestone_stairs"))),
	STONE_STAIRS(true, new BlockGenericStairs(Blocks.stone, 0).setBlockName(Utils.getUnlocalisedName("stone_stairs"))),
	END_BRICK_STAIRS(true, new BlockGenericStairs(END_BRICKS.get(), 0).setBlockName(Utils.getUnlocalisedName("end_brick_stairs"))),
	SMOOTH_SANDSTONE_SLAB(true, new BlockSmoothSandstoneSlab(0, false), ItemBlockGenericSlab.class),
	DOUBLE_SMOOTH_SANDSTONE_SLAB(true, new BlockSmoothSandstoneSlab(0, true), ItemBlockGenericSlab.class),
	SMOOTH_RED_SANDSTONE_SLAB(true, new BlockSmoothSandstoneSlab(1, false), ItemBlockGenericSlab.class),
	DOUBLE_SMOOTH_RED_SANDSTONE_SLAB(true, new BlockSmoothSandstoneSlab(1, true), ItemBlockGenericSlab.class),
	PRISMARINE_SLAB(true, new BlockPrismarineSlab(false), ItemBlockGenericSlab.class),
	DOUBLE_PRISMARINE_SLAB(true, new BlockPrismarineSlab(true), ItemBlockGenericSlab.class),
	SMOOTH_QUARTZ_SLAB(true, new BlockSmoothQuartzSlab(false), ItemBlockGenericSlab.class),
	DOUBLE_SMOOTH_QUARTZ_SLAB(true, new BlockSmoothQuartzSlab(true), ItemBlockGenericSlab.class),
	RED_NETHERBRICK_SLAB(true, new BlockRedNetherBrickSlab(false), ItemBlockGenericSlab.class),
	DOUBLE_RED_NETHERBRICK_SLAB(true, new BlockRedNetherBrickSlab(true), ItemBlockGenericSlab.class),
	END_BRICK_SLAB(true, new BlockEndBrickSlab(false), ItemBlockGenericSlab.class),
	DOUBLE_END_BRICK_SLAB(true, new BlockEndBrickSlab(true), ItemBlockGenericSlab.class),
	CUT_COPPER_SLAB(true, new BlockCutCopperSlab(false), ItemBlockGenericSlab.class),
	DOUBLE_CUT_COPPER_SLAB(true, new BlockCutCopperSlab(true), ItemBlockGenericSlab.class),
	DEEPSLATE_SLAB(true, new BlockDeepslateSlab(false, false), ItemBlockGenericSlab.class),
	DOUBLE_DEEPSLATE_SLAB(true, new BlockDeepslateSlab(true, false), ItemBlockGenericSlab.class),
	DEEPSLATE_BRICK_SLAB(true, new BlockDeepslateSlab(false, true), ItemBlockGenericSlab.class),
	DOUBLE_DEEPSLATE_BRICK_SLAB(true, new BlockDeepslateSlab(true, true), ItemBlockGenericSlab.class),
	NETHERITE_STAIRS(true, new BlockNetheriteStairs(), ItemBlockUninflammable.class),
	CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(4)),
	EXPOSED_CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(5)),
	WEATHERED_CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(6)),
	OXIDIZED_CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(7)),
	WAXED_CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(12)),
	WAXED_EXPOSED_CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(13)),
	WAXED_WEATHERED_CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(14)),
	WAXED_OXIDIZED_CUT_COPPER_STAIRS(true, new BlockCutCopperStairs(15)),
	COBBLED_DEEPSLATE_STAIRS(true, new BlockGenericStairs(COBBLED_DEEPSLATE.get(), 0).setBlockName(Utils.getUnlocalisedName("cobbled_deepslate_stairs"))),
	POLISHED_DEEPSLATE_STAIRS(true, new BlockGenericStairs(POLISHED_DEEPSLATE.get(), 0).setBlockName(Utils.getUnlocalisedName("polished_deepslate_stairs"))),
	DEEPSLATE_BRICK_STAIRS(true, new BlockGenericStairs(DEEPSLATE_BRICKS.get(), 0).setBlockName(Utils.getUnlocalisedName("deepslate_brick_stairs"))),
	DEEPSLATE_TILE_STAIRS(true, new BlockGenericStairs(DEEPSLATE_BRICKS.get(), 2).setBlockName(Utils.getUnlocalisedName("deepslate_tile_stairs")).setStepSound(ModSounds.soundDeepslateTiles)),
	IRON_TRAPDOOR(true, new BlockIronTrapdoor()),
	MAGMA(true, new BlockMagma()),
	BARREL(true, new BlockBarrel()),
	LANTERN(true, new BlockLantern()),
	SMOKER(true, new BlockSmoker(false)),
	LIT_SMOKER(true, new BlockSmoker(true)),
	BLAST_FURNACE(true, new BlockBlastFurnace(false)),
	LIT_BLAST_FURNACE(true, new BlockBlastFurnace(true)),
	SHULKER_BOX(true, new BlockShulkerBox(), ItemBlockShulkerBox.class),
	SMITHING_TABLE(true, new BlockSmithingTable()),
	COMPOSTER(true, new BlockComposter()),
	STONECUTTER(true, new BlockStonecutter(), ItemBlockDecorationWorkbench.class),
	FLETCHING_TABLE(true, new BlockFletchingTable(), ItemBlockDecorationWorkbench.class),
	CARTOGRAPHY_TABLE(true, new BlockCartographyTable(), ItemBlockDecorationWorkbench.class),
	LOOM(true, new BlockLoom(), ItemBlockDecorationWorkbench.class),
	DRIPSTONE_BLOCK(true, new BlockDripstone()),
	POINTED_DRIPSTONE(true, new BlockPointedDripstone()),

	//signs
	SIGN_SPRUCE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, 1)),
	WALL_SIGN_SPRUCE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, 1)),
	SIGN_BIRCH(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, 2)),
	WALL_SIGN_BIRCH(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, 2)),
	SIGN_JUNGLE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, 3)),
	WALL_SIGN_JUNGLE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, 3)),
	SIGN_ACACIA(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, 4)),
	WALL_SIGN_ACACIA(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, 4)),
	SIGN_DARK_OAK(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, 5)),
	WALL_SIGN_DARK_OAK(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, 5)),

	TRAPDOOR_SPRUCE(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor(1)),
	TRAPDOOR_BIRCH(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor(2)),
	TRAPDOOR_JUNGLE(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor(3)),
	TRAPDOOR_ACACIA(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor(4)),
	TRAPDOOR_DARK_OAK(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor(5)),

	BUTTON_SPRUCE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton(1)),
	BUTTON_BIRCH(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton(2)),
	BUTTON_JUNGLE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton(3)),
	BUTTON_ACACIA(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton(4)),
	BUTTON_DARK_OAK(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton(5)),

	PRESSURE_PLATE_SPRUCE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate(1)),
	PRESSURE_PLATE_BIRCH(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate(2)),
	PRESSURE_PLATE_JUNGLE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate(3)),
	PRESSURE_PLATE_ACACIA(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate(4)),
	PRESSURE_PLATE_DARK_OAK(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate(5)),

	FENCE_SPRUCE(ConfigBlocksItems.enableFences, new BlockWoodFence(1)),
	FENCE_BIRCH(ConfigBlocksItems.enableFences, new BlockWoodFence(2)),
	FENCE_JUNGLE(ConfigBlocksItems.enableFences, new BlockWoodFence(3)),
	FENCE_ACACIA(ConfigBlocksItems.enableFences, new BlockWoodFence(4)),
	FENCE_DARK_OAK(ConfigBlocksItems.enableFences, new BlockWoodFence(5)),

	FENCE_GATE_SPRUCE(ConfigBlocksItems.enableFences, new BlockWoodFenceGate(1)),
	FENCE_GATE_BIRCH(ConfigBlocksItems.enableFences, new BlockWoodFenceGate(2)),
	FENCE_GATE_JUNGLE(ConfigBlocksItems.enableFences, new BlockWoodFenceGate(3)),
	FENCE_GATE_ACACIA(ConfigBlocksItems.enableFences, new BlockWoodFenceGate(4)),
	FENCE_GATE_DARK_OAK(ConfigBlocksItems.enableFences, new BlockWoodFenceGate(5)),

	DOOR_SPRUCE(ConfigBlocksItems.enableDoors, new BlockWoodDoor(1), ItemBlockWoodDoor.class),
	DOOR_BIRCH(ConfigBlocksItems.enableDoors, new BlockWoodDoor(2), ItemBlockWoodDoor.class),
	DOOR_JUNGLE(ConfigBlocksItems.enableDoors, new BlockWoodDoor(3), ItemBlockWoodDoor.class),
	DOOR_ACACIA(ConfigBlocksItems.enableDoors, new BlockWoodDoor(4), ItemBlockWoodDoor.class),
	DOOR_DARK_OAK(ConfigBlocksItems.enableDoors, new BlockWoodDoor(5), ItemBlockWoodDoor.class),

//			"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
	WHITE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(0), ItemBlockDyedBed.class),
	ORANGE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(1), ItemBlockDyedBed.class),
	MAGENTA_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(2), ItemBlockDyedBed.class),
	LIGHT_BLUE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(3), ItemBlockDyedBed.class),
	YELLOW_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(4), ItemBlockDyedBed.class),
	LIME_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(5), ItemBlockDyedBed.class),
	PINK_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(6), ItemBlockDyedBed.class),
	GRAY_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(7), ItemBlockDyedBed.class),
	LIGHT_GRAY_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(8), ItemBlockDyedBed.class),
	CYAN_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(9), ItemBlockDyedBed.class),
	PURPLE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(10), ItemBlockDyedBed.class),
	BLUE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(11), ItemBlockDyedBed.class),
	BROWN_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(12), ItemBlockDyedBed.class),
	GREEN_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(13), ItemBlockDyedBed.class),
	BLACK_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(15), ItemBlockDyedBed.class);

	public static final Block[] signs = new Block[] {SIGN_SPRUCE.get(), SIGN_BIRCH.get(), SIGN_JUNGLE.get(), SIGN_ACACIA.get(), SIGN_DARK_OAK.get()};
	public static final Block[] wall_signs = new Block[] {WALL_SIGN_SPRUCE.get(), WALL_SIGN_BIRCH.get(), WALL_SIGN_JUNGLE.get(), WALL_SIGN_ACACIA.get(), WALL_SIGN_DARK_OAK.get()};
	public static final Block[] trapdoors = new Block[] {TRAPDOOR_SPRUCE.get(), TRAPDOOR_BIRCH.get(), TRAPDOOR_JUNGLE.get(), TRAPDOOR_ACACIA.get(), TRAPDOOR_DARK_OAK.get()};
	public static final Block[] buttons = new Block[] {BUTTON_SPRUCE.get(), BUTTON_BIRCH.get(), BUTTON_JUNGLE.get(), BUTTON_ACACIA.get(), BUTTON_DARK_OAK.get()};
	public static final Block[] pressure_plates = new Block[] {PRESSURE_PLATE_SPRUCE.get(), PRESSURE_PLATE_BIRCH.get(), PRESSURE_PLATE_JUNGLE.get(), PRESSURE_PLATE_ACACIA.get(), PRESSURE_PLATE_DARK_OAK.get()};
	public static final Block[] fences = new Block[] {FENCE_SPRUCE.get(), FENCE_BIRCH.get(), FENCE_JUNGLE.get(), FENCE_ACACIA.get(), FENCE_DARK_OAK.get()};
	public static final Block[] fence_gates = new Block[] {FENCE_GATE_SPRUCE.get(), FENCE_GATE_BIRCH.get(), FENCE_GATE_JUNGLE.get(), FENCE_GATE_ACACIA.get(), FENCE_GATE_DARK_OAK.get()};
	public static final Block[] doors = new Block[] {DOOR_SPRUCE.get(), DOOR_BIRCH.get(), DOOR_JUNGLE.get(), DOOR_ACACIA.get(), DOOR_DARK_OAK.get()};
	public static final Block[] beds = new Block[] {WHITE_BED.get(), ORANGE_BED.get(), MAGENTA_BED.get(), LIGHT_BLUE_BED.get(), YELLOW_BED.get(), LIME_BED.get(), PINK_BED.get(), GRAY_BED.get(),
			LIGHT_GRAY_BED.get(), CYAN_BED.get(), PURPLE_BED.get(), BLUE_BED.get(), BROWN_BED.get(), GREEN_BED.get(), BLACK_BED.get()};

	/*
	 * Stand-in static final fields because some mods incorrectly referenced my code directly.
	 * They should be using GameRegistry.findBlock but it is what it is I guess.
	 */

	//Immersive Cavegen
	@Deprecated public static final Block deepslate = DEEPSLATE.get();

	//D-Mod
	@Deprecated public static final Block sweet_berry_bush = SWEET_BERRY_BUSH.get();

	//WTF Cave Biomes
	@Deprecated public static final Block prismarine = PRISMARINE_BLOCK.get();
	@Deprecated public static final Block sea_lantern = SEA_LANTERN.get();
	@Deprecated public static final Block red_sandstone = RED_SANDSTONE.get();

	public static void init() {
		for(ModBlocks block : values()) {
			if(block.get() instanceof IConfigurable && !((IConfigurable)block.get()).isEnabled()) continue;

			if (block.getItemBlock() != null || !block.getHasItemBlock()) {
				GameRegistry.registerBlock(block.get(), block.getItemBlock(), block.name().toLowerCase());
				//This part is used if the getItemBlock() is not null, so we register a custom ItemBlock class as the ItemBlock
				//It is also used if the getItemBlock() == null and getHasItemBlock() is false, meaning we WANT to register it as null, making the block have no inventory item.
			} else {
				GameRegistry.registerBlock(block.get(), block.name().toLowerCase());
				//Used if getItemBlock() == null but getHasItemBlock() is true, registering it with a default inventory item.
			}
		}
	}

	private final boolean isEnabled;
	private final Block theBlock;
	/**
	 * null == default ItemBlock
	 */
	private final Class<? extends ItemBlock> itemBlock;
	/**
	 * Determines if we should register the block with an ItemBlock.
	 * Set to false when the constructor that specifies the ItemBlock is specifically set to false.
	 */
	private boolean hasItemBlock;

	ModBlocks(Boolean enabled, Block block) {
		this(enabled, block, null);
		hasItemBlock = true;
	}

	ModBlocks(Boolean enabled, Block block, Class<? extends ItemBlock> iblock) {
		isEnabled = enabled;
		theBlock = block;
		itemBlock = iblock;
		hasItemBlock = iblock != null;
	}

	/**
	 * If this is false, the block is initialized without an inventory item, or ItemBlock.
	 */
	public boolean getHasItemBlock() {
		return hasItemBlock;
	}
	public Block get() {
		return theBlock;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public Class<? extends ItemBlock> getItemBlock() {
		return itemBlock;
	}
}