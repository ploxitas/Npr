package Selenium.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Logger;

public class ConfigFileReader {

    public static ConfigFileReader configFileReader = new ConfigFileReader();

    private Properties properties;

    private final String propertyFileName = "configuration.properties";


    private ConfigFileReader() {

        String propertyFilePath = getClass().getClassLoader().getResource(propertyFileName).getFile();

        try (BufferedReader reader = new BufferedReader(

                new FileReader(propertyFilePath.replaceAll("%20", " ")))) {

            properties = new Properties();

            properties.load(reader);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    public String getApplicationUrl() {

        String url = properties.getProperty("url");

        if (url != null) return url;

        else throw new RuntimeException("url not specified in the Configuration.properties file.");

    }

    private static class LOGGER {
    }

    public String getBrowserName() {
        String brrowserName = properties.getProperty("browserName");
        if (brrowserName != null) return brrowserName;
        else throw new RuntimeException("browserName not specified in the Configuration.properties file.");
    }
}

