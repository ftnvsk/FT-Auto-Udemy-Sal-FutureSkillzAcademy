package com.filip.worklearning.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class WebDriverInstance {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    // Initializes the WebDriver for the actual thread
    public static void createDriver(String baseURL) {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseURL);
        driverThreadLocal.set(driver);
    }

    // Returns the WebDriver instance for the actual thread
    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    // this will clean up the Webdriver for the actual thread
    public static void cleanUpDriver() {
        if(driverThreadLocal.get() != null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }

}
