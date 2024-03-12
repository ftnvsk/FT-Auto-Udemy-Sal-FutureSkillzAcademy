package com.filip.worklearning.SeleniumConfig;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>() {
        @Override
        public void remove() {
            WebDriver driver = get();
            if (driver != null) {
                driver.quit();
            }
            super.remove();
        }
    };

    protected WebDriver getWebDriver() {
        return webDriver.get();
    }

    protected void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }

    protected void quitWebDriver() {
        webDriver.remove();
    }

}
