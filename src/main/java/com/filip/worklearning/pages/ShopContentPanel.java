package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopContentPanel extends BasePage {

    public ShopContentPanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(), 'Continue')]")
    private WebElement continueShoppingBtn;

    @FindBy(linkText = "\uE876PROCEED TO CHECKOUT")
    private WebElement checkoutBtn;

    public void clickOnContinueShopping() {
        elementMethods.clickElement(continueShoppingBtn);
    }

    public void clickOnCheckout() {
        elementMethods.clickElement(checkoutBtn);
    }

}
