package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(css = "Black")
    public static WebElement ColourBlack;

    @FindBy(css= "Add to Cart")
    public static WebElement AddtoCart;

    @FindBy(id = "input-text")
    public static WebElement Address;

    @FindBy(id = "select")
    public static WebElement Country;

    @FindBy(id = "select")
    public static WebElement State;

    @FindBy(id = "input-text")
    public static WebElement PostalCode;

    @FindBy(id = "input-text")
    public static WebElement PhoneNumber;


    // Stage2 - Initialise web element using selenium webdriver

    public  OrderPagePO(WebDriver driver){
        PageFactory.initElements(driver,this);}



    //Stage 3 - Page Specific Methods
    public void clickWhatsNew(){
        WhatsNew.click();
    }

    




























}
