package ganymedes01.etfuturum.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.client.sound.ModSounds;
import ganymedes01.etfuturum.core.utils.Utils;
import ganymedes01.etfuturum.entities.EntityItemUninflammable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockAncientDebris extends Block {

	@SideOnly(Side.CLIENT)
	public IIcon iconTop;

	public BlockAncientDebris() {
		super(Material.rock);
		setHarvestLevel("pickaxe", 3);
		setHardness(30F);
		setResistance(1200F);
		Utils.setBlockSound(this, ModSounds.soundAncientDebris);
		setBlockTextureName("ancient_debris");
		setBlockName(Utils.getUnlocalisedName("ancient_debris"));
		setCreativeTab(EtFuturum.creativeTabBlocks);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int p_149691_2_) {
		return side > 1 ? blockIcon : iconTop;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register) {
		blockIcon = register.registerIcon(this.getTextureName() + "_side");
		iconTop = register.registerIcon(this.getTextureName() + "_top");
	}

	@Override
	protected void dropBlockAsItem(World world, int x, int y, int z, ItemStack stack) {
		// do not drop items while restoring blockstates, prevents item dupe
		if (!world.isRemote && world.getGameRules().getGameRuleBooleanValue("doTileDrops") && !world.restoringBlockSnapshots) {
			if (captureDrops.get()) {
				capturedDrops.get().add(stack);
				return;
			}
			float f = 0.7F;
			double d0 = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
			double d1 = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
			double d2 = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
			EntityItem entityitem = new EntityItemUninflammable(world, x + d0, y + d1, z + d2, stack);
			entityitem.delayBeforeCanPickup = 10;
			world.spawnEntityInWorld(entityitem);
		}
	}

}
