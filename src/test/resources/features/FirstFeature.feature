@FilipFirstTests
Feature: Filip First Tests with Cucumber

  Background:
    Given The user opens up the automation testing store website

  @StartingTheTestsBelow
  Scenario: User is able to add a product to cart and to checkout
    When The user clicks on the 1st Prod
    And The user changes the size option of the product
    And The user increases product quantity to buy by 1
    And The user adds the product to the cart
    And The user clicks on Proceed to Checkout
    Then The user is taken to the Shopping Cart page

  Scenario Outline: User is able to subscribe to the newsletter from the bottom of the page
    When The user scrolls to the newsletter section at the bottom of the page
    And The user enters the "<UserEmail>" to subscribe to newsletter
    Then The user is notified that he has successfully subscribed to the newsletter
    Examples:
      | UserEmail          |
      | randxeeail@Xwa.com |