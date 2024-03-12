package com.filip.worklearning.pages;

import com.filip.worklearning.utils.StringUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static com.filip.worklearning.SeleniumConfig.DriverFactory.getWebDriver;


public class BasePage {

    protected final WebDriver driver;
    private final WebDriverWait wait;
    protected final Actions action;
    protected final JavascriptExecutor javascriptExecutor;
    Wait<WebDriver> fluentWait;

    public static final String USER_DIR_PATH = "user.dir";
    public static final String PATH_TO_RESOURCES = "/src/main/java/resources/";

    public BasePage() {
        this.driver = getWebDriver();
        this.action = new Actions(getWebDriver());
        javascriptExecutor = (JavascriptExecutor) getWebDriver();
        wait = new WebDriverWait(getWebDriver(), getMaxWaitTime());
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        PageFactory
                .initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(getWebDriver())),
                        this);
    }

    public static WebDriver getWebdriver() {
        return getWebDriver();
    }

    protected void executeJavaScript(String script) {
        javascriptExecutor.executeScript(script);
    }

    protected String getInnerTextFromElement(WebElement element) {
        return element.getAttribute("innerText").trim();
    }

    public static int getMaxWaitTime() {
        // Get it from Jenkins
        final String timeout = System.getProperty("defaultMaxWaitTime");
        return (StringUtil.isNullOrEmpty(timeout))
                ? Integer.parseInt(AppContext.getProps().getProperty("defaultMaxWaitTime"))
                : Integer.parseInt(timeout);
    }

}
