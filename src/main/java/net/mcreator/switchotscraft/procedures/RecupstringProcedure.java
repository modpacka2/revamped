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
public class RecupstringProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RevampedProgressionModItems.ROCK.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FERN) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_GRASS) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LARGE_FERN) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RevampedProgressionModItems.SHARP_ROCK.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FERN) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_GRASS) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LARGE_FERN) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.FIBER_STRING.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS) {
				if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.ROCK.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.TALL_GRASS) {
				if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.ROCK.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FERN) {
				if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.ROCK.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LARGE_FERN) {
				if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.ROCK.get()));
						entityToSpawn.setPickUpDelay(20);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
