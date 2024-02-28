package com.filip.worklearning.SeleniumConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class SeleniumConfig {

    public WebDriver cdriver;

    public void prepareDriver(String baseURL) {
        cdriver = new ChromeDriver();
        cdriver.get(baseURL);
        cdriver.manage().window().maximize();
        // WAIT implicit:
//        cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
    }

    public void afterTest() {
        cdriver.quit();
    }

}
