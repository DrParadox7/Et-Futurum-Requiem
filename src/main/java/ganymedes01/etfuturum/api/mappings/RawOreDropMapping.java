package ganymedes01.etfuturum.api.mappings;

import net.minecraft.item.Item;

import java.util.Random;

public class RawOreDropMapping extends RegistryMapping<Item> {

	private boolean exdrops;

	/**
	 * Used by raw ores to keep a registry of what block drops which raw ores.
	 * Args:
	 * ore: Item to drop
	 * meta: Meta
	 */
	public RawOreDropMapping(Item ore, int meta) {
		super(ore, meta);
	}

	public boolean getDropsExtra() {
		return exdrops;
	}

	public void setDropsExtra(boolean exdrops) {
		this.exdrops = exdrops;
	}

	public int getDropAmount(Random rand, int fortune) {
		return getDropsExtra() ? rand.nextInt(3 * (fortune + 1) - 1) + 2 : rand.nextInt(1 + fortune) + 1;
	}
}