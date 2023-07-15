package multiproject.generators;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneratorsClient implements ClientModInitializer {

    public static final String MOD_ID = "multiproject-generators";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Loading MP Gens Client.");
    }
}
