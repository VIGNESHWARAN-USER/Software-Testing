Feature: User registration Feature

    Background:
        Given the user launches the application
        And the user clicks the My Account Icon
        And the user clicks the register button

    Scenario: Verify valid registration
        When the user enters the following registration details
            | firstName | lastName | email             | telephone | password     |
            | Vignesh   | M        | test1@gmail.com   | 9876543210| Password@123 |
        And checks the privacy policy option
        And click the Continue button
        Then the user get the registration success message

    Scenario: Verify registration without accepting privacy policy
        When the user enters the following registration details
            | firstName | lastName | email             | telephone | password     |
            | Vignesh   | M        | test2@gmail.com   | 9876543210| Password@123 |
        And click the Continue button
        Then the user get the registration error message