package ganymedes01.etfuturum.world;

import java.util.*;
import java.util.Map.Entry;

import ganymedes01.etfuturum.ModBlocks;
import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Maps;

import ganymedes01.etfuturum.configuration.configs.ConfigBlocksItems;
import ganymedes01.etfuturum.configuration.configs.ConfigTweaks;
import ganymedes01.etfuturum.configuration.configs.ConfigWorld;
import ganymedes01.etfuturum.core.utils.DeepslateOreRegistry;
import ganymedes01.etfuturum.core.utils.helpers.BlockAndMetadataMapping;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;

public class EtFuturumLateWorldGenerator extends EtFuturumWorldGenerator {
	
	public static final EtFuturumLateWorldGenerator INSTANCE = new EtFuturumLateWorldGenerator();
	public static final Map<Integer, Map<Long, List<Integer>>> deepslateRedoCache = Maps.newConcurrentMap();

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.getWorldInfo().getTerrainType() != WorldType.FLAT || world.provider.dimensionId != 0 || world.getWorldInfo().getGeneratorOptions().contains("decoration")) {
			if(ConfigBlocksItems.enableDeepslate && ConfigWorld.deepslateGenerationMode == 1 && world.provider.dimensionId != -1 && world.provider.dimensionId != 1) {
				generateOre(deepslateBlobGen, world, rand, chunkX, chunkZ, 1, 6, ConfigWorld.deepslateMaxY);
			}
			if(ConfigBlocksItems.enableTuff && world.provider.dimensionId != -1 && world.provider.dimensionId != 1) {
				generateOre(tuffGen, world, rand, chunkX, chunkZ, 1, 6, ConfigWorld.deepslateMaxY);
			}
		}

		Chunk chunk = null;
		if(doesChunkSupportLayerDeepslate(world.getWorldInfo().getTerrainType(), world.provider.dimensionId)) {
			//Turn off recording here so the world gen isn't an infinite recursion loop of constantly checking the same blocks
			stopRecording = true;
			Map<Long, List<Integer>> map = deepslateRedoCache.get(world.provider.dimensionId);
			if(map != null) {
				Iterator<Entry<Long, List<Integer>>> mapIterator = map.entrySet().iterator();
				while(mapIterator.hasNext()) {
					Entry<Long, List<Integer>> set = mapIterator.next();
					List<Integer> posSet = set.getValue();
					
					if(posSet != null) {
						
						long packedChunkCoords = set.getKey();
						int redoX = (int)packedChunkCoords;
						int redoZ = (int)(packedChunkCoords >> 32);
						
						Chunk cachedChunk = world.getChunkFromChunkCoords(redoX, redoZ);
						for (int pos : posSet) {
							byte posX = (byte) ((pos >> 12));
							short posY = (short) ((pos >> 4 & 0xFF));
							byte posZ = (byte) ((pos & 0xF));

							replaceBlockInChunk(cachedChunk, posX, posZ, redoX << 4 + posX, posY, redoZ << 4 + posZ);
						}
					}
					mapIterator.remove();
				}
			}

			chunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
			doDeepslateGen(chunk);
			
			stopRecording = false;
		}
		
		if(ConfigBlocksItems.enableCoarseDirt && ConfigWorld.enableCoarseDirtReplacement) {
			if(chunk == null) {
				chunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
			}
			doCoarseDirtGen(chunk);
		}
	}
	
	
	private void doCoarseDirtGen(Chunk chunk) {
			for (int x = 0; x < 16; x++) {
				for (int z = 0; z < 16; z++) {
					for (int y = 0; y < chunk.getHeightValue(x, z); y++) {
						ExtendedBlockStorage array = chunk.getBlockStorageArray()[y >> 4];
						if(array != null && array.getExtBlockMetadata(x, y & 15, z) == 1 && array.getBlockByExtId(x, y & 15, z) == Blocks.dirt) {
							array.func_150818_a(x, y & 15, z, ModBlocks.COARSE_DIRT.get());
							array.setExtBlockMetadata(x, y & 15, z, 0);
					}
				}
			}
		}
	}
	
	
	private void doDeepslateGen(Chunk chunk) {
		
		int worldX;
		int worldZ;
		final int chunkMultiplierX = chunk.xPosition << 4;
		final int chunkMultiplierZ = chunk.zPosition << 4;

		for (int y = 0; y <= ConfigWorld.deepslateMaxY; y++) {
			for (int x = 0; x < 16; x++) {
				for (int z = 0; z < 16; z++) {
					if(ConfigWorld.deepslateMaxY >= 255 || y < ConfigWorld.deepslateMaxY - 4 || y <= ConfigWorld.deepslateMaxY - chunk.worldObj.rand.nextInt(4)) {
						
						worldX = x + chunkMultiplierX;
						worldZ = z + chunkMultiplierZ;
						
						this.replaceBlockInChunk(chunk, x, z, worldX, y, worldZ);
					}
				}
			}
		}
	}
	
	private void replaceBlockInChunk(Chunk chunk, int x, int z, int worldX, int worldY, int worldZ) {
		this.replaceBlockInChunk(chunk, chunk.getBlock(x, worldY, z), x, z, worldX, worldY, worldZ);
	}
	
	private void replaceBlockInChunk(Chunk chunk, Block block, int x, int z, int worldX, int worldY, int worldZ) {
		if(block.getMaterial() != Material.air && block != ModBlocks.DEEPSLATE.get() && block != ModBlocks.TUFF.get() && block != ModBlocks.COBBLED_DEEPSLATE.get()) {
			
			ExtendedBlockStorage array = chunk.getBlockStorageArray()[worldY >> 4];
			
			if(array == null) return;
			
			if((block.isReplaceableOreGen(chunk.worldObj, worldX, worldY, worldZ, Blocks.stone) && (ConfigWorld.deepslateReplacesStones || block != ModBlocks.STONE.get()))
					|| (ConfigWorld.deepslateReplacesDirt && block == Blocks.dirt)) {
				array.func_150818_a(x, worldY & 15, z, ModBlocks.DEEPSLATE.get());
				array.setExtBlockMetadata(x, worldY & 15, z, 0);
			} else if(ConfigTweaks.deepslateReplacesCobblestone && block.isReplaceableOreGen(chunk.worldObj, worldX, worldY, worldZ, Blocks.cobblestone)) {
				array.func_150818_a(x, worldY & 15, z, ModBlocks.COBBLED_DEEPSLATE.get());
				array.setExtBlockMetadata(x, worldY & 15, z, 0);
			} else if(!DeepslateOreRegistry.getOreMap().isEmpty()) {
				BlockAndMetadataMapping mapping;
				if((mapping = DeepslateOreRegistry.getOre(block, array.getExtBlockMetadata(x, worldY & 15, z))) != null) {
					array.func_150818_a(x, worldY & 15, z, mapping.getBlock());
					array.setExtBlockMetadata(x, worldY & 15, z, mapping.getMeta());
				}
			}
		}
	}
	
	public static boolean stopRecording;
	
	private boolean doesChunkSupportLayerDeepslate(WorldType terrain, int dimId) {
		if(ConfigBlocksItems.enableDeepslate) {
			if (ConfigWorld.deepslateGenerationMode == 0 && ConfigWorld.deepslateMaxY > 0) {
				if(terrain != WorldType.FLAT && ArrayUtils.contains(ConfigWorld.deepslateLayerDimensionBlacklist, dimId) == ConfigWorld.deepslateLayerDimensionBlacklistAsWhitelist) {
					return true;
				}
			}
		}
		return false;
	}

}
