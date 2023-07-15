package multiproject.generators;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Generators implements ModInitializer {
    public static final String MOD_ID = "multiproject-generators";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Loading MP Gens.");
    }
}
