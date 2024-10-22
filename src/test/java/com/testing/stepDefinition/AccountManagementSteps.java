package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.LogInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.testing.pageObject.LogInPagePO.*;

public class AccountManagementSteps {

    WebDriver driver = Hooks.driver;


    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();

    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmailAddress(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterPasswordConfirmation(ConfirmPassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateanAccount();

    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
        String ExpectedResult = "My Account";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();

    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        LogInPagePO logInPagePO = new LogInPagePO(driver);
        logInPagePO.enterEmailAddress(Email);
        logInPagePO.enterPassword(Password);
    }

    @And("I click on Sign In")
    public void iClickOnSignIn() {
        LogInPagePO logInPagePO = new LogInPagePO(driver);
        logInPagePO.clickSignIn();

    }

    @Then("My account page is displayed successfully")
    public void myAccountPageIsDisplayedSuccessfully() {
        String ExpectedResult = "Magento 2 Commerce (Enterprise) Demo - Magebit";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);

    }

    @Then("Error Message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        String ExpectedResult = "Create New Customer Account";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);

    }

    @When("I repeat entering {string} {string} and Click Sign in four times")
    public void iRepeatEnteringAndClickSignInFourTimes(String Email, String Password) {
        for (int i = 0; i < 5; i++) {

            LogInPagePO logInPagePO = new LogInPagePO(driver);
            logInPagePO.enterEmailAddress(Email);
            logInPagePO.enterPassword(Password);

            //Clear field before entering new data
            EmailField.clear();
            PasswordField.clear();

            EmailField.sendKeys(Email);
            PasswordField.sendKeys(Password);
            SignInButton.click();

        }
    }
    @Then("Account should be locked with an error message displayed")
    public void accountShouldBeLockedWithAnErrorMessageDisplayed() {

        String ExpectedResult = "Account Locked";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);



    }


}
