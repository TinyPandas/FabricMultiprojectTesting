package multiproject;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiprojectClient implements ClientModInitializer {

    public static final String MOD_ID = "multiproject";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Loading MultiprojectClient.");
    }
}
