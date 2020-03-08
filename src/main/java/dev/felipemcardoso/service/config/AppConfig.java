package dev.felipemcardoso.service.config;

import javax.inject.Singleton;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Singleton
public final class AppConfig {

    private static final String CONFIG_FILE = "/config.properties";

    private Properties properties;

    public String find(String key) {
        if (properties == null) {
            properties = loadConfig();
        }

        return properties.getProperty(key);
    }

    public Properties loadConfig() throws AppConfigException {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream(CONFIG_FILE);
            Properties config = new Properties();
            config.load(inputStream);
            processConfigEntries(config);
            return config;

        } catch (FileNotFoundException e) {
            throw new AppConfigException(String.format("File %s not found.", CONFIG_FILE));

        } catch (IOException e) {
            throw new AppConfigException(String.format("Error processing file %s.", CONFIG_FILE));
        }
    }

    private static void processConfigEntries(Properties config) {

        for (String propertyName : config.stringPropertyNames()) {
            String value = config.getProperty(propertyName);

            if (isParam(value)) {
                String newValue = System.getProperty(extractConfigValue(value));
                if (newValue != null) {
                    config.setProperty(propertyName, newValue);
                }
            }
        }
    }

    private static boolean isParam(String propertyName) {
        return propertyName.contains("$");
    }

    private static String extractConfigValue(String value) {
        return value.substring(2, value.length() - 1);
    }
}
