
package net.mcreator.switchotscraft.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.switchotscraft.init.RevampedProgressionModJeiPlugin;
import net.mcreator.switchotscraft.init.RevampedProgressionModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class AxecuttingjRecipeCategory implements IRecipeCategory<AxecuttingjRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("revamped_progression", "axecuttingj");
	public final static ResourceLocation TEXTURE = new ResourceLocation("revamped_progression", "textures/screens/axecutting.png");
	private final IDrawable background;
	private final IDrawable icon;

	public AxecuttingjRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 180, 80);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(RevampedProgressionModBlocks.CUTTING_LOG.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<AxecuttingjRecipe> getRecipeType() {
		return RevampedProgressionModJeiPlugin.Axecuttingj_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Cutting log");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, AxecuttingjRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 42, 9).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 42, 50).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 112, 30).addItemStack(recipe.getResultItem(null));
	}
}
