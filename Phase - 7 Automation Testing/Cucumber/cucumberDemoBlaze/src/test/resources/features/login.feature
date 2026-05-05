Feature: DemoBlaze Login Feature

  Background:
    Given the user launches the home page

  @PopUpValidation @Smoke
  Scenario: Verify login pop-up appears
    When the user clicks the login button
    Then the login pop-up should be displayed

  @ValidCredentials @Smoke @Regression 
  Scenario: Login with valid credentials
    When the user opens the login pop-up
    And the user enters username "admin"
    And the user enters password "admin"
    And the user submits login
    Then the user should see welcome message "Welcome admin"

  @InvalidPassword @Smoke @Regression
  Scenario: Login with invalid password
    When the user opens the login pop-up
    And the user enters username "admin"
    And the user enters password "admin123"
    And the user submits login
    Then an alert should appear with message "Wrong password."

  @InvalidUsername @Vignesh
  Scenario: Login with invalid username
    When the user opens the login pop-up
    And the user enters username "admin1234vetri"
    And the user enters password "admin"
    And the user submits login
    Then an alert should appear with message "User does not exist."