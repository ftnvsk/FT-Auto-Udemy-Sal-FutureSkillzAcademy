package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderFormPersInfo extends BasePage  {

    public OrderFormPersInfo(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkout-personal-information-step > h1:nth-child(1)")
    private WebElement pageTitle;

    @FindBy(css = "label.radio-inline:nth-child(1)")
    private WebElement genderMr;

    @FindBy(css = "label.radio-inline:nth-child(2)")
    private WebElement genderMrs;

    @FindBy(css = "input[name='firstname']")
    private WebElement firstNameField;

    @FindBy(css = "input[name='lastname']")
    private WebElement lastNameField;

    @FindBy(css = "input[name='email']")
    private WebElement emailField;

    @FindBy(css = "input[name='password']")
    private WebElement passwordField;

    @FindBy(css = "input[name='birthday']")
    private WebElement birthDateField;

    @FindBy(css = "div:nth-of-type(7)  span > label > span")
    private WebElement receiveOffersCheckbox;

    @FindBy(css = "div:nth-of-type(8)  span > label > span")
    private WebElement newsletterCheckbox;

    @FindBy(css = "div.form-group:nth-child(9) > div:nth-child(2) > span:nth-child(1)")
    private WebElement termsConditionsCheckbox;

    @FindBy(css = "form#customer-form  button[name='continue']")
    private WebElement continueBtn;

    public void selectTitle(String setGender) {
        elementMethods.waitVisibleElement(pageTitle);
        if(setGender.equals(propertiesFile.getValue("socialTitleMrs"))) {
            elementMethods.clickElement(genderMrs);
        } else {
            elementMethods.clickElement(genderMr);
        }
    }

    public void setFirstName() {
        elementMethods.fillElement(firstNameField, propertiesFile.getValue("firstName"));
    }

    public void setLastName() {
        elementMethods.fillElement(lastNameField, propertiesFile.getValue("lastName"));
    }

    public void setEmail() {
        elementMethods.fillElement(emailField, propertiesFile.getValue("email"));
    }

    public void selectTermsCheckbox() {
        elementMethods.clickElement(termsConditionsCheckbox);
    }

    public void clickContinue() {
        elementMethods.scrollToElementJS(continueBtn);
        elementMethods.clickElement(continueBtn);
    }

}
