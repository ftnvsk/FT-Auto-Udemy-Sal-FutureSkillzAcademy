package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderFormShippingMethod extends BasePage {

    public OrderFormShippingMethod(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "textarea#delivery_message")
    private WebElement deliveryMsgTextbox;

    @FindBy(css = "[name='confirmDeliveryOption']")
    private WebElement continueBtn;

}
