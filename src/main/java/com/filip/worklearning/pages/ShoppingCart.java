package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage {



    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".promo-code-button .collapse-button")
    private WebElement havePromo;

    @FindBy(css = "input[name='discount_name']")
    private WebElement promoTextbox;

    @FindBy(css = "form[method='post']  span")
    private WebElement promoAddBtn;

    @FindBy(css = ".cart-detailed-actions .btn-primary")
    private WebElement proceedToCheckoutBtn;

    @FindBy(css = ".cart-items .cart-item:nth-of-type(1) .float-xs-left")
    private WebElement deleteItemOne;

    @FindBy(css = ".cart-items .cart-item:nth-of-type(2) .float-xs-left")
    private WebElement deleteItemTwo;

    @FindBy(css = ".cart-total .value")
    private WebElement totalValue;

    public void clickHavePromo() {
        elementMethods.clickElement(havePromo);
    }

    public void enterPromoCode() {
        elementMethods.fillElement(promoTextbox, propertiesFile.getValue("promoCode"));
    }

    public void addPromoCode() {
        elementMethods.clickElement(promoAddBtn);
    }

    public void proceedCheckout() {
        elementMethods.clickElement(proceedToCheckoutBtn);
    }

}
