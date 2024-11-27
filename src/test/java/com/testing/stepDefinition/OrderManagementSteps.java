package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.OrderPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OrderManagementSteps {

    WebDriver driver = Hooks.driver;

    @And("On my account page I click on What's New tab")
    public void onMyAccountPageIClickOnWhatSNewTab() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickWhatsNew();
        
    }

    @And("I click on product link Echo compression Fit short")
    public void iClickOnProductLinkEchoCompressionFitShort() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickEchocompressionFitshort();

    }

    @And("I click on product Size {int}")
    public void iClickOnProductSize(int arg0) {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickSize28();
    }

    @And("I click on colour black")
    public void iClickOnColourBlack() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickColourBlack();
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickAddtocart();
    }

    @And("I click on the cart icon")
    public void iClickOnTheCartIcon() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickonCartIcon();
    }

    @And("I click on the Proceed to checkout button")
    public void iClickOnTheProceedToCheckoutButton() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickCheckOut();

    }

    @And("On Checkout Page I enter {string} {string} {string} {string}")
    public void onCheckoutPageIEnter(String arg0, String arg1, String arg2, String arg3) {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickAddress();
        orderPagePO.clickCountry();
        orderPagePO.clickState();
        orderPagePO.clickPostalCode();
        orderPagePO.clickPhoneNumber();

    }

    @And("I pick Flat rate")
    public void iPickFlatRate() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickFlatRate();

    }

    @And("I click on Next Button")
    public void iClickOnNextButton() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickNext();
    }

    @When("I click on Place Order Button")
    public void iClickOnPlaceOrderButton() {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.clickPlaceOrder();
    }

    @And("I click on My Account from profile drop down menu")
    public void iClickOnMyAccountFromProfileDropDownMenu() {

    }

    @And("I click on My Orders")
    public void iClickOnMyOrders() {
    }

    @Then("Order History should be displayed")
    public void orderHistoryShouldBeDisplayed() {
    }
}
