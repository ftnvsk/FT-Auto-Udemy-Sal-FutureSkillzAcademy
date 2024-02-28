package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".toggle")
    private WebElement toggleOption;

    @FindBy(linkText = "HOMEPAGE")
    private WebElement homepageLink;

    @FindBy(linkText = "ACCORDION")
    private WebElement accordionLink;

    @FindBy(linkText = "BROWSER TABS")
    private WebElement browserTabsLink;

    @FindBy(linkText = "BUTTONS")
    private WebElement buttonsLink;

    @FindBy(linkText = "CALCULATOR (JS)")
    private WebElement calcLink;

    @FindBy(linkText = "CONTACT US FORM TEST")
    private WebElement contactUsLink;

    @FindBy(linkText = "DATE PICKER")
    private WebElement datePickerLink;

    @FindBy(linkText = "DROPDOWN CHECKBOX & RADIO")
    private WebElement dropdownLink;

    @FindBy(linkText = "FILE UPLOAD")
    private WebElement fileUpload;

    @FindBy(linkText = "HIDDEN ELEMENTS")
    private WebElement hiddenElementsLink;

    @FindBy(linkText = "IFRAME")
    private WebElement iFrameLink;

    @FindBy(linkText = "LOADER")
    private WebElement loaderLink;

    @FindBy(linkText = "LOGIN PORTAL TEST")
    private WebElement loginPortalLink;

    @FindBy(linkText = "MOUSE MOVEMENT")
    private WebElement mouseLink;

    @FindBy(linkText = "POP UPS & ALERTS")
    private WebElement popupLink;

    @FindBy(linkText = "PREDICTIVE SEARCH")
    private WebElement predictiveLink;

    @FindBy(linkText = "TABLES")
    private WebElement tablesLink;

    @FindBy(linkText = "TEST STORE")
    private WebElement testStoreLink;

    @FindBy(linkText = "ABOUT ME")
    private WebElement aboutMeLink;



}
