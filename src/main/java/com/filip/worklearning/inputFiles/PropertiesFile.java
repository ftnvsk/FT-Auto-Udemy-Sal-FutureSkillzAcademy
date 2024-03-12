package com.filip.worklearning.inputFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesFile {

    public Properties properties;
    public FileInputStream file;

    public PropertiesFile() {
        loadFile();
    }

    public void loadFile() {
        properties = new Properties();
        try {
            file = new FileInputStream("src/main/java/resources/inputData.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

    public HashMap<String, String> getAll() {
        HashMap<String, String> testData = new HashMap<>();
        for(Object key : properties.keySet()) {
            testData.put(key.toString(), properties.getProperty(key.toString()));
        }
        return testData;
    }

}