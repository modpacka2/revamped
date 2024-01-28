package net.mcreator.switchotscraft.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.switchotscraft.jei_recipes.PunshingRecipeCategory;
import net.mcreator.switchotscraft.jei_recipes.PunshingRecipe;
import net.mcreator.switchotscraft.jei_recipes.AxecuttingjRecipeCategory;
import net.mcreator.switchotscraft.jei_recipes.AxecuttingjRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class RevampedProgressionModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<AxecuttingjRecipe> Axecuttingj_Type = new mezz.jei.api.recipe.RecipeType<>(AxecuttingjRecipeCategory.UID, AxecuttingjRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<PunshingRecipe> Punshing_Type = new mezz.jei.api.recipe.RecipeType<>(PunshingRecipeCategory.UID, PunshingRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("revamped_progression:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new AxecuttingjRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new PunshingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<AxecuttingjRecipe> AxecuttingjRecipes = recipeManager.getAllRecipesFor(AxecuttingjRecipe.Type.INSTANCE);
		registration.addRecipes(Axecuttingj_Type, AxecuttingjRecipes);
		List<PunshingRecipe> PunshingRecipes = recipeManager.getAllRecipesFor(PunshingRecipe.Type.INSTANCE);
		registration.addRecipes(Punshing_Type, PunshingRecipes);
	}
}
