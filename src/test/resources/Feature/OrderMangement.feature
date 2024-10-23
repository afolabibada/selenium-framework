@OrderManagement
  Feature: Order Management
    #Gherkin Steps
  @CreateOrder
  Scenario Outline: Have at least one order available to view history
    Given I am on create an account page
    And I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    And On my account page I click on What's New tab
    And I click on product link Echo compression Fit short
    And I click on product Size 28
    And I click on colour black
    And I click on Add to cart button
    And I click on the cart icon
    And I click on the Proceed to checkout button
    And On Checkout Page I enter "<Address>" "<State>" "<PostalCode>" "<PhoneNumber>"
    And I pick Flat rate
    And I click on Next Button
    When I click on Place Order Button
    And I click on My Account from profile drop down menu
    And I click on My Orders
    Then Order History should be displayed