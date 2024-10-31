@AccountManagement
Feature: Account Management
#Gherkin Steps
  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed


    Examples:
      | FirstName | LastName | Email                 | Password    | ConfirmPassword |
      | Paul      | Jones    | pauljones22@gmail.com | Pauljones1! | Pauljones1!     |


  @LoginAccount
  Scenario Outline: – Account Login with username and password
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I click on Sign In
    Then My account page is displayed successfully


    Examples:
      | Email                 | Password    |
      | pauljones22@gmail.com | Pauljones1! |


    @DuplicateAccount
    Scenario Outline: - Duplicate Account creation not allowed
      Given I am on create an account page
      When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
      And I click on create an account
      Then Error Message should be displayed

      Examples:
        | FirstName | LastName | Email                 | Password    | ConfirmPassword |
        | Paul      | Jones    | pauljones22@gmail.com | Pauljones1! | Pauljones1!     |


      @UnregisteredAccount
      Scenario Outline: – Unregistered Customer cannot login
        Given I am on login page
        When I enter "<Email>" "<Password>"
        And I click on Sign In
        Then Error Message should be displayed

        Examples:
          | Email           | Password    |
          | paulj@gmail.com | Paulj       |


  @AccountLock
  Scenario Outline: Account to be locked after maximum of 5 attempts
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I click on Sign In
    When I repeat entering "<Email>" "<Password>" and Click Sign in four times
    Then Account should be locked with an error message displayed

    Examples:
      | Email                | Password    |
      | pauljones@gmail.com | Pauljones1! |


