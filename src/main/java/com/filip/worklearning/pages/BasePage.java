package com.filip.worklearning.pages;

import helperMethods.ElementMethods;
import com.filip.worklearning.inputFiles.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public PropertiesFile propertiesFile;
    public ElementMethods elementMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        propertiesFile = new PropertiesFile();
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

}
