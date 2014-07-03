package com.karsid.modtutorial.handler;

import com.karsid.modtutorial.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        if ( configuration == null ) {
            // Create the configuration object from the given configuration file
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if ( event.modID.equalsIgnoreCase(Reference.MOD_ID) ) {
            // Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean ("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example config value");

        // Save the configuration
        if ( configuration.hasChanged() ) {
            configuration.save();
        }
    }
}
