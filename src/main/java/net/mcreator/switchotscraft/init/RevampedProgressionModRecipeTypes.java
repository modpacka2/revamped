package net.mcreator.switchotscraft.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.switchotscraft.jei_recipes.PunshingRecipe;
import net.mcreator.switchotscraft.jei_recipes.AxecuttingjRecipe;
import net.mcreator.switchotscraft.RevampedProgressionMod;

@Mod.EventBusSubscriber(modid = RevampedProgressionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RevampedProgressionModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "revamped_progression");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("axecuttingj", () -> AxecuttingjRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("punshing", () -> PunshingRecipe.Serializer.INSTANCE);
		});
	}
}
