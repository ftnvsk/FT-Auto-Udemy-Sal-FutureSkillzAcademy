package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderFormDelivery extends BasePage {

    public OrderFormDelivery(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='firstname']")
    private WebElement firstNameField;

    @FindBy(css = "input[name='lastname']")
    private WebElement lastNameField;

    @FindBy(css = "input[name='company']")
    private WebElement companyNameField;

    @FindBy(css = "input[name='address1']")
    private WebElement addressField;

    @FindBy(css = "input[name='address2']")
    private WebElement addressComplementField;

    @FindBy(css = "input[name='city']")
    private WebElement cityField;

    @FindBy(css = "select[name='id_state']")
    private WebElement stateDropdown;

    @FindBy(css = "input[name='postcode']")
    private WebElement postcodeField;

    @FindBy(css = "select[name='id_country']")
    private WebElement countryDropdown;

    @FindBy(css = "input[name='phone']")
    private WebElement phoneField;

    @FindBy(css = "input#use_same_address")
    private WebElement invoiceSameAddCheckboc;

    @FindBy(css = "button[name='confirm-addresses']")
    private WebElement continueBtn;

}
