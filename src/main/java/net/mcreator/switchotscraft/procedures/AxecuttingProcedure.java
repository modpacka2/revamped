package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AxecuttingProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_OAK_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_SPRUCE_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_BIRCH_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_JUNGLE_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_ACACIA_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_MANGROVE_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_CHERRY_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_OAK_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_OAK_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_SPRUCE_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_BIRCH_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_BIRCH_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_JUNGLE_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_JUNGLE_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_ACACIA_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_ACACIA_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_DARK_OAK_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_MANGROVE_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_MANGROVE_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CHERRY_LOG) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_CHERRY_LOG));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_STEM) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_WARPED_STEM));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_WARPED_STEM) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_WARPED_STEM));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_STEM) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_CRIMSON_STEM));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CRIMSON_STEM) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_CRIMSON_STEM));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.OAK_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.SPRUCE_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.BIRCH_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.JUNGLE_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.ACACIA_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.DARK_OAK_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.MANGROVE_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.CHERRY_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_HYPHAE) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.CRIMSON_HYPHAE));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_HYPHAE) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.WARPED_HYPHAE));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_OAK_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_OAK_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_SPRUCE_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_BIRCH_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_BIRCH_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_JUNGLE_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_JUNGLE_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_ACACIA_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_ACACIA_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_DARK_OAK_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_DARK_OAK_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_MANGROVE_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_MANGROVE_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CHERRY_WOOD) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_CHERRY_WOOD));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_WARPED_HYPHAE) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_WARPED_HYPHAE));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CRIMSON_HYPHAE) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(Blocks.STRIPPED_CRIMSON_HYPHAE));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
