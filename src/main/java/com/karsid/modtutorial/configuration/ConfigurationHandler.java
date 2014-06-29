package com.karsid.modtutorial.configuration;

import com.karsid.modtutorial.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile) {
        // Create the configuration object from teh given configuration file
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try {
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        } catch (Exception e) {
            // Log exception
        } finally {
            // Save the configuration
            configuration.save();
        }

        System.out.println("Configuration Test: " + configValue);
    }
}
