package com.filip.worklearning.SeleniumConfig;

import com.filip.worklearning.inputFiles.PropertiesFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Hooks extends WebDriverInstance {

    public PropertiesFile propertiesFile;

    @BeforeTest
    public void prepareEnv() {
        propertiesFile = new PropertiesFile();
        createDriver(propertiesFile.getValue("baseURL"));
    }

    @AfterTest
    public void clearEnv() {
        cleanUpDriver();
    }

}
