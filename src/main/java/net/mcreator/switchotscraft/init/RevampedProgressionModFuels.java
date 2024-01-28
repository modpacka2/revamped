
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.switchotscraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class RevampedProgressionModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_2.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_4.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_3.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_5.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_6.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_7.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_8.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_9.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.LOG_BARK_10.get())
			event.setBurnTime(800);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_1.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_2.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_3.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_4.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_5.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_6.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_7.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_8.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_9.get())
			event.setBurnTime(75);
		else if (itemstack.getItem() == RevampedProgressionModItems.PLANK_10.get())
			event.setBurnTime(75);
	}
}
