package com.filip.worklearning.stepDefinitions;

import com.filip.worklearning.pages.*;
import com.filip.worklearning.utils.WebDriverInstance;

public class PageLibrary {
    // Here I do 'lazy' instantiation of the page objects
    private HomePage homePage;
    private ShopHomePage shopHomePage;
    private ShopProductsPage shopProductsPage;
    private ShopContentPanel shopContentPanel;
    private ShoppingCart shoppingCart;
    private ContactUsPage contactUsPage;
    private LoginPage loginPage;
    private OrderFormPayment orderFormPayment;
    private OrderFormDelivery orderFormDelivery;
    private  OrderFormPersInfo orderFormPersInfo;
    private  OrderFormShippingMethod orderFormShippingMethod;
    private RegistrationPage registrationPage;


    // Add more page objects as needed

    // Below I make sure that page objects are created as needed
    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(WebDriverInstance.getDriver());
        }
        return homePage;
    }

    public ShopHomePage getShopHomePage() {
        if (shopHomePage == null) {
            shopHomePage = new ShopHomePage(WebDriverInstance.getDriver());
        }
        return shopHomePage;
    }

    public ShopProductsPage getShopProductsPage() {
        if (shopProductsPage == null) {
            shopProductsPage = new ShopProductsPage(WebDriverInstance.getDriver());
        }
        return shopProductsPage;
    }

    public ShopContentPanel getShopContentPanel() {
        if (shopContentPanel == null) {
            shopContentPanel = new ShopContentPanel(WebDriverInstance.getDriver());
        }
        return shopContentPanel;
    }

    public ShoppingCart getShoppingCart() {
        if (shoppingCart == null) {
            shoppingCart = new ShoppingCart(WebDriverInstance.getDriver());
        }
        return shoppingCart;
    }
}