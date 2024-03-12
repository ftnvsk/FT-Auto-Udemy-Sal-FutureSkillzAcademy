package com.filip.worklearning.pages;

import HelpMethods.ElementMethods;
import com.filip.worklearning.SeleniumConfig.WebDriverInstance;
import com.filip.worklearning.inputFiles.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
