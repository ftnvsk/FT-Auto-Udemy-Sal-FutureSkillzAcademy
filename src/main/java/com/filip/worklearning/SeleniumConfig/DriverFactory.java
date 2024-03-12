package com.filip.worklearning.SeleniumConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.filip.worklearning.environment.Browser;
import com.filip.worklearning.environment.OperatingSysFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

@UtilityClass
public class DriverFactory {

    public static WebDriver getWebDriver() {
        startWebDriver("chrome");
        return DriverManager.getWebDriver();
    }

    public void quitDriver() {
        DriverManager.quitWebDriver();
    }

    public void startWebDriver(String browser) {
        WebDriver driver;
        setupDriver(browser);
        switch (browser) {
            case "firefox":
                driver = startFirefoxDriver();
                break;
            case "chrome":
            default:
                driver = startChromeDriver();
                break;
        }
        DriverManager.setWebDriver(driver);
    }

    //Gecko driver doesn't support logging
    //https://github.com/mozilla/geckodriver/issues/284
    private static WebDriver startFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        final WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().maximize();
        return driver;
    }

    //List of Chrome switches - https://peter.sh/experiments/chromium-command-line-switches/
    //https://www.ghacks.net/2013/10/06/list-useful-google-chrome-command-line-switches/
    private static WebDriver startChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling info bars
        options.addArguments("--disable-popup-blocking"); // disabling popup blocking
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("start-maximized");
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setCapability("goog:loggingPrefs", getLoggingPreferences());
        if (System.getProperty("headless") != null && System.getProperty("headless").equals("true"))
            options.addArguments("--headless");
        options.setExperimentalOption("w3c", false);
        //do not open popup when downloading
        final HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("safebrowsing.disable_download_protection", true);
        prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("profile.default_content_settings.popups", 0);
        final ChromeDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.setLogLevel(Level.ALL);
        return chromeDriver;
    }

    private static LoggingPreferences getLoggingPreferences() {
        LoggingPreferences logPref = new LoggingPreferences();
        logPref.enable(LogType.PERFORMANCE, Level.ALL);
        return logPref;
    }

    private static void setupDriver(String browser) {
        final OperatingSystem os = OperatingSysFactory.getCurrentOs();
        final Browser driverType = Browser.valueOf(browser.toUpperCase());
        WebDriverManager.getInstance(driverType.getDriverType()).operatingSystem(os).setup();
    }

    private static Map<String,Object> getClipBoardSettingsMap(int settingValue) throws JsonProcessingException {
        Map<String,Object> map = new HashMap<>();
        map.put("last_modified",String.valueOf(System.currentTimeMillis()));
        map.put("setting", settingValue);
        Map<String,Object> cbPreference = new HashMap<>();
        cbPreference.put("[*.],*",map);
        return cbPreference;
    }

}
