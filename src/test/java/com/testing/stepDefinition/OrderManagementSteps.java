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
        orderPagePO.ClickEchocompressionFitshort();

    }

    @And("I click on product Size {int}")
    public void iClickOnProductSize(int arg0) {
        OrderPagePO orderPagePO = new OrderPagePO(driver);
        orderPagePO.ClickSize28();
    }

    @And("I click on colour black")
    public void iClickOnColourBlack() {
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() {
    }

    @And("I click on the cart icon")
    public void iClickOnTheCartIcon() {
    }

    @And("I click on the Proceed to checkout button")
    public void iClickOnTheProceedToCheckoutButton() {
    }

    @And("On Checkout Page I enter {string} {string} {string} {string}")
    public void onCheckoutPageIEnter(String arg0, String arg1, String arg2, String arg3) {
    }

    @And("I pick Flat rate")
    public void iPickFlatRate() {
    }

    @And("I click on Next Button")
    public void iClickOnNextButton() {
    }

    @When("I click on Place Order Button")
    public void iClickOnPlaceOrderButton() {
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
