package dev.alexjenkins.almost_vanilla;

import dev.alexjenkins.almost_vanilla.items.AVItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlmostVanilla implements ModInitializer {
	public static final String MOD_ID = "almost_vanilla";
	public static final String MOD_HUMAN = "Almost Vanilla";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_HUMAN);


	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_HUMAN);
		AVItems.register();
	}
}