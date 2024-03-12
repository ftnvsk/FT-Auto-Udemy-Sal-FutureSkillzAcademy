package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderFormPayment extends BasePage {

    public OrderFormPayment(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Pay by Check']")
    private WebElement payByCheck;

    @FindBy(xpath = "//span[.='Pay by bank wire']")
    private WebElement payByWire;

    @FindBy(xpath = "//input[@id='conditions_to_approve[terms-and-conditions]']")
    private WebElement payByCtermsAndConditionsheck;

    @FindBy(xpath = "//div[@id='payment-confirmation']//button[@type='submit']")
    private WebElement orderBtn;


}
