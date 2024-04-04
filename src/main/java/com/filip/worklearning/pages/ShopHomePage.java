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

    @FindBy(linkText = "Contact us")
    private WebElement contactUSLink;

    @FindBy(xpath = "//span[text()='Sign in']")
    private WebElement signInForm;

    @FindBy(css = ".no-account > a")
    private WebElement createNewAccountLink;

    @FindBy(css = "input[name='submitNewsletter']")
    private WebElement subscribeToNewsLetterButton;

    @FindBy(css = ".input-wrapper>input[name='email']")
    private WebElement inputSubscribeEmail;

    @FindBy(css = "p.alert-success")
    private WebElement successSubscriptionNewsletterMessage;

    public void clickProdOne() {
        elementMethods.clickElement(productOne);
    }

    public void clickOnContactUsForm() {
        elementMethods.clickElement(contactUSLink);
    }

    public void clickOnSignInLink() {
        elementMethods.clickElement(signInForm);
    }

    public void clickOnCreateNewAccount() {
        clickOnSignInLink();
        elementMethods.waitVisibleElement(createNewAccountLink);
        elementMethods.clickElement(createNewAccountLink);
    }

    public boolean isUserOnStoreHomePage() {
        return elementMethods.isElementVisible(signInForm) && elementMethods.isElementVisible(contactUSLink);
    }

    public void goToNewsletterSubscription() {
        elementMethods.scrollToElement(inputSubscribeEmail);
    }

    public boolean isNewsLetterSectionVisible() {
       return elementMethods.isElementVisible(subscribeToNewsLetterButton) && elementMethods.isElementVisible(inputSubscribeEmail);
    }

    public void subscribeToNewsLetter(String userEmail) {
        elementMethods.fillElement(inputSubscribeEmail, userEmail);
        elementMethods.clickElement(subscribeToNewsLetterButton);
    }

    public boolean isUserSubscribedToNewsletter() {
        elementMethods.waitVisibleElement(successSubscriptionNewsletterMessage);
        return elementMethods.isElementVisible(successSubscriptionNewsletterMessage);
    }

}
