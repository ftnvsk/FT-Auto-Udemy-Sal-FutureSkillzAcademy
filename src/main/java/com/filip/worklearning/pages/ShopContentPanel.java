package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopContentPanel extends BasePage {

    public ShopContentPanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#blockcart-modal > div:nth-child(1) > div:nth-child(1)")
    public WebElement shoppingContentPanelModal;
    @FindBy(xpath = "//button[contains(text(), 'Continue')]")
    private WebElement continueShoppingBtn;

    @FindBy(linkText = "\uE876PROCEED TO CHECKOUT")
    private WebElement checkoutBtn;

    @FindBy(css = "#myModalLabel")
    private WebElement productAddedSuccessfullyMessage;

    public void clickOnContinueShopping() {
        elementMethods.clickElement(continueShoppingBtn);
    }

    public void clickOnCheckout() {
        elementMethods.clickElement(checkoutBtn);
    }

    public boolean isProductAdded() {
        elementMethods.waitVisibleElement(shoppingContentPanelModal);
        return elementMethods.isElementVisible(productAddedSuccessfullyMessage);
    }

}
