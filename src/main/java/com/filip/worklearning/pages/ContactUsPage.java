package com.filip.worklearning.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@id='id_contact']")
    private WebElement subjectSelect;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement contactUsEmail;

    @FindBy(xpath = "//textarea[@id='contactform-message']")
    private WebElement contactUsMessage;

    @FindBy(xpath = "//input[@name='submitMessage']")
    private WebElement contactUsSendButton;

    public void selectFormSubject() {
        elementMethods.selectDropDownText(subjectSelect, "Webmaster");
    }

    public void enterFormEmailAddress() {
        elementMethods.fillElement(contactUsEmail, propertiesFile.getValue("email"));
    }

    public void enterContactUsMessage() {
        elementMethods.fillElement(contactUsMessage, propertiesFile.getValue("multipleFrameTestValue"));
    }

    public void clickOnSendButton() {
        elementMethods.clickElement(contactUsSendButton);
    }

}
