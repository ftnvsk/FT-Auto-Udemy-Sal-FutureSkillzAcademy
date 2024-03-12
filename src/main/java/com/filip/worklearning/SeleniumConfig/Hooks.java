package com.filip.worklearning.SeleniumConfig;

import com.filip.worklearning.inputFiles.PropertiesFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends WebDriverInstance {

    public PropertiesFile propertiesFile;

    @BeforeMethod
    public void prepareEnv() {
        propertiesFile = new PropertiesFile();
        createDriver(propertiesFile.getValue("baseURL"));
    }

    @AfterMethod
    public void clearEnv() {
        cleanUpDriver();
    }

}
