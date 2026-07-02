Feature: Login Test

    Background: 
        Given User navigates the to application
        And User click on the login link

    Scenario: Loign should be success
        And User enter the email as "vigneshwaran.coder@gmail.com"
        And User enter the password as "1234"
        When the user click on login button
        Then Login should be success 

    Scenario: Login should not be success
        And User enter the email as "vigneshwaran@gmail.com"
        And User enter the password as "invalidpassword"
        When the user click on login button
        Then Login should fail