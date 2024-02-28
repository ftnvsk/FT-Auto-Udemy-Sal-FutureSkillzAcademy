package com.filip.worklearning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    By cookie = By.cssSelector(".close-cookie-warning > span");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getCookie() {
        return driver.findElement(cookie);
    }

}
