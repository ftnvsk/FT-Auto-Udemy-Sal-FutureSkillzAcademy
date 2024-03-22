package com.filip.worklearning.stepDefinitions;

import com.filip.worklearning.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinitions {

    private final PageLibrary pageLibrary = new PageLibrary();

    // Step definition to navigate to the automation testing store
    @Given("The user opens up the automation testing store website")
    public void userNavigatesToAutoTestingPage() {
        pageLibrary.getHomePage().openTestStore();
        Assert.assertTrue(pageLibrary.getShopHomePage().isUserOnStoreHomePage(),
                "User did not reach the Store Homepage");
    }

    // Step definition for user interaction with the first product
    @When("The user clicks on the 1st Prod")
    public void userClicksOnFirstProduct() {
        pageLibrary.getShopHomePage().clickProdOne();
    }

    @And("The user changes the size option of the product")
    public void usersChangesProdcutSizeOption() {
        pageLibrary.getShopProductsPage().selectSizeOption();
    }

    @And("The user increases product quantity to buy by 1")
    public void usersIncreasesProductQuantityByOne() {
        pageLibrary.getShopProductsPage().increaseQuantitybyOne();
    }

    @And("The user adds the product to the cart")
    public void userAddsProductToCart() {
        pageLibrary.getShopProductsPage().clickAddToCart();
        Assert.assertTrue(pageLibrary.getShopContentPanel().isProductAdded(),
                "Product is not added. Shop Content panel is not displayed.");
    }

    @And("The user clicks on Proceed to Checkout")
    public void userClicksOnCheckout() {
        pageLibrary.getShopContentPanel().clickOnCheckout();
    }

    @Then("The user is taken to the Shopping Cart page")
    public void isUserOnShoppingCartPage() {
        Assert.assertTrue(pageLibrary.getShoppingCart().isUserOnShoppingCartPage(),
                "User is not on shopping cart page.");
    }

    @When("The user scrolls to the newsletter section at the bottom of the page")
    public void userGoesToNewsletterSection() {
        pageLibrary.getShopHomePage().goToNewsletterSubscription();
        Assert.assertTrue(pageLibrary.getShopHomePage().isNewsLetterSectionVisible(),
                "The newsletter section is not visible");
    }

    @And("The user enters the {string} to subscribe to newsletter")
    public void userEntersEmailToSubscribeToNewsletter(String userEmail) {
        pageLibrary.getShopHomePage().subscribeToNewsLetter(userEmail);
    }

    @Then("The user is notified that he has successfully subscribed to the newsletter")
    public void isUserSubscribedToNewsletter() {
        Assert.assertTrue(pageLibrary.getShopHomePage().isUserSubscribedToNewsletter(),
                "The user is not subscribed to newsletter, or no subscription confirmation was received");
    }

}
