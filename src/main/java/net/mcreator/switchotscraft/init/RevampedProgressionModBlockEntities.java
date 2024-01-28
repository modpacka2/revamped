
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.switchotscraft.block.entity.SearchingtableBlockEntity;
import net.mcreator.switchotscraft.block.entity.SawblockTileEntity;
import net.mcreator.switchotscraft.RevampedProgressionMod;

public class RevampedProgressionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RevampedProgressionMod.MODID);
	public static final RegistryObject<BlockEntityType<SawblockTileEntity>> SAWBLOCK = REGISTRY.register("sawblock", () -> BlockEntityType.Builder.of(SawblockTileEntity::new, RevampedProgressionModBlocks.SAWBLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SEARCHINGTABLE = register("searchingtable", RevampedProgressionModBlocks.SEARCHINGTABLE, SearchingtableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
