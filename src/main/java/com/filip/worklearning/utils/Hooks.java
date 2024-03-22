package com.filip.worklearning.utils;

import com.filip.worklearning.inputFiles.PropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    // The below will run before each Cucumber scenario
    @Before
    public void prepareEnv() {
        String baseURL = new PropertiesFile().getValue("baseURL");
        WebDriverInstance.createDriver(baseURL);
    }

    // The below will run after each Cucumber scenario
    @After
    public void clearEnv() {
        WebDriverInstance.cleanUpDriver();
    }

}