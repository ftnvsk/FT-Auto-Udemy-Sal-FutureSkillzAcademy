package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#field-email")
    private WebElement loginEmail;

    @FindBy(css = "input#field-password")
    private WebElement loginPassword;

    @FindBy(css = "button#submit-login")
    private WebElement signInButton;

    public void enterLoginEmail() {
        elementMethods.fillElement(loginEmail, propertiesFile.getValue("email2"));
    }

    public void enterLoginPassword() {
        elementMethods.fillElement(loginPassword, propertiesFile.getValue("password"));
    }

    public void clickOnSignInButton() {
        elementMethods.clickElement(signInButton);
    }

}
