package cookietogo97.deadlysnowballs;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.data.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class DeadlySnowballs implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "deadylsnowballs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Deadly Snowballs initialized.");
    }

	@Override
	public void beforeGameStart() {
		new DeadlySnowballsItems().Initialize();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {
		new DeadlySnowballsRecipeRegistries();
		Registries.RECIPES.register("deadlysnowballs", DeadlySnowballsRecipeRegistries.DEADLYSNOWBALLS);
	}
}
