package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPagePO {

    //Element Locator 1

    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id ="pass" )
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;


    //Stage2 - Initialise web element using selenium webdriver

    public  LogInPagePO(WebDriver driver){
        PageFactory.initElements(driver,this);}


    //Stage 3 - Page Specific Methods

    public void enterEmailAddress(String Email){EmailField.sendKeys(Email);}

    public void enterPassword(String Password){PasswordField.sendKeys(Password);}

    public void clickSignIn(){SignInButton.click();}








}
