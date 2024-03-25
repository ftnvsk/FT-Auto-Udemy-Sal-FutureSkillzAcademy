package com.filip.worklearning.utils;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class WebDriverInstance {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private static WebDriver driver;

    // Initializes the WebDriver for the actual thread
    public static void createDriver(String baseURL) {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
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
    public static void cleanUpDriver(Scenario scenario) {
        if(driverThreadLocal.get() != null) {
            if (scenario.isFailed()) {
                // Take screenshot on failure
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "failure-screenshot");
            }
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }

}
