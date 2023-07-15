package coreapi;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoreAPIClient implements ClientModInitializer {

    public static final String MOD_ID = "coreapi";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Loading CoreAPIClient.");
    }
}
