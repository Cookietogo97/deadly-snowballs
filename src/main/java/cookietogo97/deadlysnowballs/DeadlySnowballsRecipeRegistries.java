package cookietogo97.deadlysnowballs;

import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.item.Item;
import turniplabs.halplibe.helper.RecipeBuilder;

public class DeadlySnowballsRecipeRegistries extends RecipeRegistry {
	public static final RecipeNamespace DEADLYSNOWBALLS = new RecipeNamespace();

	public DeadlySnowballsRecipeRegistries() {
		RecipeBuilder.Shapeless("deadlysnowballs")
			.addInput(Item.ammoSnowball)
			.addInput(Item.ammoPebble)
			.create("Heavy Snowball", DeadlySnowballsItems.snowball.getDefaultStack());
	}
}
