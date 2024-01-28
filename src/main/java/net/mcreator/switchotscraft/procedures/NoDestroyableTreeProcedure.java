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
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.switchotscraft.init.RevampedProgressionModItems;
import net.mcreator.switchotscraft.configuration.TreecutConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NoDestroyableTreeProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_2.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_3.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_4.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_6.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_7.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_8.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_OAK_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_BIRCH_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_JUNGLE_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_ACACIA_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_DARK_OAK_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_MANGROVE_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CHERRY_LOG) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_STEM) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_STEM) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 3)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_WARPED_STEM) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CRIMSON_STEM) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_2.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_3.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_4.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_6.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_7.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_8.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_HYPHAE) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_HYPHAE) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
					if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_9.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_OAK_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_BIRCH_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_JUNGLE_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_ACACIA_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_DARK_OAK_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_MANGROVE_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CHERRY_WOOD) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_WARPED_HYPHAE) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STRIPPED_CRIMSON_HYPHAE) {
				if (TreecutConfiguration.DAMAGE_LOG.get() == true) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("revamped_progression:pushatree")))), 5);
				}
				if (TreecutConfiguration.ACTIVATE_DROP.get() == false) {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
		}
	}
}
