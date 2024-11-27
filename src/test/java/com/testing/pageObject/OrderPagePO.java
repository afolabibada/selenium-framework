package com.testing.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class OrderPagePO {

    //ElemEnt Locator

    @FindBy(id = "firstname")
    public static WebElement FirstName;

    @FindBy(id = "lastname")
    public static WebElement LastName;

    @FindBy(id = "email")
    public static WebElement Email;

    @FindBy(id = "password")
    public static WebElement Password;

    @FindBy(id = "password-confirmation")
    public static WebElement PasswordConfirmationField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;

    @FindBy(css = "#ui-id-3 > span")
    public static WebElement WhatsNew;

    @FindBy(css ="#maincontent > div.columns > div.column.main > div.widget.block.block-static-block > div.block.widget.block-products-list.grid > div > div > ol > li:nth-child(1) > div > a > span > span > img" )
    public static WebElement EchocompressionFitshort;

    @FindBy(id = "option-label-size-157-item-175")
    public static WebElement Size28;

    @FindBy(id = "option-label-color-93-item-49")
    public static WebElement ColourBlack;

    @FindBy(css= "#product-addtocart-button")
    public static WebElement AddtoCart;

    @FindBy(xpath =  "//span[text()='MyAccount']" )
    public static WebElement CartIcon;

    @FindBy(id = "#maincontent > div.columns > div > div.cart-container > div.cart-summary._sticky > ul > li:nth-child(1) > button > span")
    public static WebElement CheckOut;

    @FindBy(id = "#CFQYTGK" )
    public static WebElement Address;

    @FindBy(id = "#LTDE9XF")
    public static WebElement Country;

    @FindBy(id = "#RLD7KXT")
    public static WebElement State;

    @FindBy(id = "#QCF79GR")
    public static WebElement PostalCode;

    @FindBy(id = "#EEQNNMO")
    public static WebElement PhoneNumber;

    @FindBy(id = "#checkout-shipping-method-load > table > tbody > tr:nth-child(1) > td:nth-child(1) > input")
    public static WebElement FlatRate;

    @FindBy(id = "#shipping-method-buttons-container > div > button > span")
    public static WebElement Next;

    @FindBy(id ="#checkout-payment-method-load > div > div > div.payment-method._active > div.payment-method-content > div.actions-toolbar > div > button > span" )
    public static WebElement PlaceOrder;









    // Stage2 - Initialise web element using selenium webdriver

    public  OrderPagePO(WebDriver driver){
        PageFactory.initElements(driver,this);}



    //Stage 3 - Page Specific Methods


    public void clickWhatsNew(){WhatsNew.click();}

    public void clickEchocompressionFitshort() {EchocompressionFitshort.click();}

    public void clickSize28() {Size28.click();}

    public void clickColourBlack() {ColourBlack.click();}

    public void clickAddtocart() {AddtoCart.click();}

    public void clickonCartIcon() {CartIcon.click();}

    public void clickCheckOut() {CheckOut.click();}

    public void clickAddress() {Address.click();}

    public void clickCountry() {Country.click();}

    public void clickState() {State.click();}

    public void clickPostalCode() {PostalCode.click();}

    public void clickPhoneNumber() {PhoneNumber.click();}

    public void clickFlatRate() {FlatRate.click();}

    public void clickNext() {Next.click();}

    public void clickPlaceOrder() {PlaceOrder.click();}

}
