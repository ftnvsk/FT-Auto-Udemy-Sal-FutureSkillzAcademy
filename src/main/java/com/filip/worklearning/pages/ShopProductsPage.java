package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShopProductsPage extends BasePage {

    public ShopProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-product-attribute='1']")
    private WebElement sizeOption;

    @FindBy(css = ".touchspin-up")
    private WebElement quantityIncrease;

    @FindBy(css = ".touchspin-down")
    private WebElement quantityDecrease;

    @FindBy(css = ".add-to-cart.btn.btn-primary")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//span[.='Home']")
    private WebElement homepageLink;

    public void clickOnSizeOption() {
        elementMethods.clickElement(sizeOption);
    }

    public void selectSizeOption() {
        clickOnSizeOption();
        Select option = new Select(sizeOption);
        option.selectByVisibleText("L");
    }

    public void increaseQuantitybyOne() {
        elementMethods.clickElement(quantityIncrease);
    }

    public void clickAddToCart() {
        elementMethods.clickElement(addToCartBtn);
    }

}
