package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.switchotscraft.init.RevampedProgressionModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StickdropProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RevampedProgressionModItems.SHARP_ROCK.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RevampedProgressionModItems.ROCK.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.OAKSTICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.SPRUCE_STICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.BIRCH_STICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.JUNGLE_STICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.ACACIA_STICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.DARK_OAK_STICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.MANGROVE_STICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AZALEA_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.OAKSTICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FLOWERING_AZALEA_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.OAKSTICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_LEAVES) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.CHERRY_STICK.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
