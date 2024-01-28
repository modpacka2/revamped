package net.mcreator.switchotscraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.switchotscraft.init.RevampedProgressionModItems;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class UseSawProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:saw")))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_OAK_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_2.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_2.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_BIRCH_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_3.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_3.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_JUNGLE_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_4.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_4.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_ACACIA_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_ACACIA_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_DARK_OAK_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_6.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_6.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_MANGROVE_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_7.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_7.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_LOG) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_CHERRY_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_8.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_8.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_STEM) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_CRIMSON_STEM.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_9.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_9.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_STEM) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_WARPED_STEM.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.OAK_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_OAK_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SPRUCE_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_SPRUCE_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_2.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_2.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_2.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BIRCH_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_BIRCH_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_3.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_3.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_3.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUNGLE_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_JUNGLE_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_4.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_4.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_4.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.ACACIA_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_ACACIA_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_5.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.DARK_OAK_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_DARK_OAK_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_6.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_6.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_6.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.MANGROVE_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_MANGROVE_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_7.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_7.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_7.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CHERRY_WOOD) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_CHERRY_WOOD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_8.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_8.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_8.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRIMSON_HYPHAE) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_CRIMSON_HYPHAE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_9.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_9.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_9.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WARPED_HYPHAE) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.STRIPPED_WARPED_HYPHAE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RevampedProgressionModItems.LOG_BARK_10.get()));
					entityToSpawn.setPickUpDelay(20);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
