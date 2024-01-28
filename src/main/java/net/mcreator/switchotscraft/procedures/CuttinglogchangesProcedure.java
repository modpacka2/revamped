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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.switchotscraft.init.RevampedProgressionModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class CuttinglogchangesProcedure {
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
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RevampedProgressionModBlocks.CUTTING_LOG.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_1.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_101.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_1.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_2.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_102.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_2.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_3.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_103.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_3.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_4.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_104.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_4.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_5.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_105.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_5.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_6.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_106.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_6.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_7.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_107.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_7.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_8.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_108.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_8.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_9.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_109.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_9.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_10.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_110.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_10.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RevampedProgressionModBlocks.CL_2.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_11.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_111.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_11.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_12.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_112.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_12.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_13.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_113.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_13.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_14.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_114.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_14.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_15.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_115.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_15.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_16.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_116.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_16.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_17.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_117.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_17.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_18.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_118.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_18.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_19.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_119.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_19.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_20.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_120.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_20.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RevampedProgressionModBlocks.CL_3.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_21.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_121.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_21.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_22.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_122.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_22.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_23.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_123.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_23.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_24.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_124.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_24.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_25.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_125.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_25.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_26.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_126.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_26.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_27.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_127.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_27.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_28.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_128.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_28.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_29.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_129.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_29.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_30.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_130.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_30.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RevampedProgressionModBlocks.CL_4.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_31.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_131.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_31.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_32.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_132.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_32.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_33.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_133.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_33.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_34.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_134.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_34.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_35.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_135.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_35.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_36.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_136.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_36.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_37.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_137.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_37.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_38.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_138.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_38.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_39.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_139.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_39.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_40.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_140.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_40.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RevampedProgressionModBlocks.CL_5.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_41.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_141.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_41.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_42.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_SPRUCE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_142.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_SPRUCE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_42.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.SPRUCE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_43.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_BIRCH_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_143.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_BIRCH_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BIRCH_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_43.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BIRCH_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_44.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_JUNGLE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_144.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_JUNGLE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.JUNGLE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_44.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.JUNGLE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_45.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_ACACIA_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_145.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_ACACIA_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ACACIA_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_45.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ACACIA_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_46.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_DARK_OAK_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_146.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_DARK_OAK_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_46.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DARK_OAK_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_47.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_MANGROVE_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_147.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_MANGROVE_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MANGROVE_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_47.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.MANGROVE_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_48.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CHERRY_LOG.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_148.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CHERRY_LOG);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CHERRY_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_48.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CHERRY_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_49.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_CRIMSON_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_149.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_CRIMSON_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CRIMSON_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_49.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.CRIMSON_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_50.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.STRIPPED_WARPED_STEM.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.L_150.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STRIPPED_WARPED_STEM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WARPED_PLANKS.asItem()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RevampedProgressionModBlocks.P_50.get().defaultBlockState();
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
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.WARPED_PLANKS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
