package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopHomePage extends BasePage{

    public ShopHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Hummingbird Printed T-Shirt")
    private WebElement productOne;

    @FindBy(linkText = "Hummingbird Printed Sweater")
    private WebElement productTwo;

    @FindBy(linkText = "The Best Is Yet To Come'...")
    private WebElement productThree;

    @FindBy(linkText = "The Adventure Begins Framed...")
    private WebElement productFour;

    @FindBy(linkText = "Today Is A Good Day Framed...")
    private WebElement productFive;

    @FindBy(linkText = "Mug The Best Is Yet To Come")
    private WebElement productSix;

    @FindBy(linkText = "Mug The Adventure Begins")
    private WebElement productSeven;

    @FindBy(linkText = "Mug Today Is A Good Day")
    private WebElement productEight;

    public void clickProdOne() {
        elementMethods.clickElement(productOne);
    }

}
