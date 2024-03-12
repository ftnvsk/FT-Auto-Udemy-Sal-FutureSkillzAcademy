package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderFormPersInfo extends BasePage  {

    public OrderFormPersInfo(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "label:nth-of-type(1) > .custom-radio > input[name='id_gender']")
    private WebElement genderMr;

    @FindBy(css = "label:nth-of-type(2) > .custom-radio > input[name='id_gender']")
    private WebElement genderMrs;

    @FindBy(css = "input[name='firstname']")
    private WebElement firstNameField;

    @FindBy(css = "input[name='lastname']")
    private WebElement lastNameField;

    @FindBy(css = "form#customer-form > section input[name='email']")
    private WebElement emailField;

    @FindBy(css = "form#customer-form > section input[name='password']")
    private WebElement passwordField;

    @FindBy(css = "input[name='birthday']")
    private WebElement birthDateField;

    @FindBy(css = "div:nth-of-type(7)  span > label > span")
    private WebElement receiveOffersCheckbox;

    @FindBy(css = "div:nth-of-type(8)  span > label > span")
    private WebElement newsletterCheckbox;

    @FindBy(css = "input[name='psgdpr']")
    private WebElement termsConditionsCheckbox;

    @FindBy(css = "form#customer-form  button[name='continue']")
    private WebElement continueBtn;

}
