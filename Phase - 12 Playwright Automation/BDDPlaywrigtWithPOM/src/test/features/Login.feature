Feature: User Login Feature

    Background:
        Given the user launches the application
        And the user clicks the My Account Icon
        And the user clicks the login button

    Scenario: Verify login with valid credentials
        When the user enters the "valid" login details
        And click the Login button
        Then the user navigates the success page
        And the user should see the heading "My Account"

    Scenario: Verify login with an invalid email address
        When the user enters the "invalidEmail" login details
        And click the Login button
        Then the user get the login error message

    Scenario: Verify login with an invalid password
        When the user enters the "invalidPassword" login details
        And click the Login button
        Then the user get the login error message
