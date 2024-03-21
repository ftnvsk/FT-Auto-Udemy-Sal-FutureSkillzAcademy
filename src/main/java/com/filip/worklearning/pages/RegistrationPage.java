package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#field-firstname")
    private WebElement registerFirstName;

    @FindBy(css = "input#field-lastname")
    private WebElement registerLastName;

    @FindBy(css = "input#field-email")
    private WebElement registerEmail;

    @FindBy(css = "input#field-password")
    private WebElement enterPassword;

    @FindBy(xpath = "//label[./input[@name='psgdpr']]")
    private WebElement agreeToTermsCheckbox;

    @FindBy(xpath = "//button[@data-link-action='save-customer']")
    private WebElement saveButton;

    public void enterRegisterFirstName() {
        elementMethods.fillElement(registerFirstName, propertiesFile.getValue("firstName"));
    }

    public void enterRegisterLasttName() {
        elementMethods.fillElement(registerFirstName, propertiesFile.getValue("lastName"));
    }

    public void enterRegisterEmail() {
        elementMethods.fillElement(registerFirstName, propertiesFile.getValue("email2"));
    }

    public void enterRegisterPassword() {
        elementMethods.fillElement(registerFirstName, propertiesFile.getValue("password"));
    }

    public void selectAgreeRegisterTerms() {
        elementMethods.clickElement(agreeToTermsCheckbox);
    }

    public void clickOnRegisterSaveButton() {
        elementMethods.scrollToElementJS(saveButton);
    }
}
