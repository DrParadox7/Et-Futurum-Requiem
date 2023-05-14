package ganymedes01.etfuturum.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

@Mixin(value = BlockFence.class)
public class MixinBlockFence {

	@Overwrite
	public boolean canConnectFenceTo(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_)
	{
		Block block = p_149826_1_.getBlock(p_149826_2_, p_149826_3_, p_149826_4_);
		return block instanceof BlockFence && block.getMaterial() == ((BlockFence) (Object) this).blockMaterial || block instanceof BlockFenceGate || (block.blockMaterial.isOpaque() && block.renderAsNormalBlock() && block.blockMaterial != Material.gourd);
	}
}
