package com.filip.worklearning.SeleniumConfig;

import com.filip.worklearning.inputFiles.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.logging.Level;

public class WebDriverInstance {

    public WebDriver driver;

    public void createDriver(String baseURL) {
//        PropertiesFile propertiesFile = new PropertiesFile();
//        if (propertiesFile.getValue("browser").equals("chrome")) {
            driver = new ChromeDriver();
            driver.get(baseURL);
//        } else if (propertiesFile.getValue("browser").equals("firefox")) {
//            driver = new FirefoxDriver();
//        } else {
//            driver = new EdgeDriver();
//        }
        driver.manage().window().maximize();
        // WAIT implicit:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    private void startChromeDriver(String baseURL) {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--disable-popup-blocking");
//        ChromeDriver chromeDriver = new ChromeDriver(options);
//        chromeDriver.get(baseURL);
//    }

    public void cleanUpDriver() {
        driver.quit();
    }

}
