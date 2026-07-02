Feature: Registration Test

    Background: 
        Given User navigates the to application
        And User click on the register link

    Scenario: Registration should be success
        And User enter the first name as "VIGNESGWARAN"
        And User enter the last name as "M"
        And User enter the email as "vignesh@gmail.comtemporary"
        And User enter the mobile number as "9092174486"
        And User enters the password as "1234"
        And User enter the confirm password as "1234"
        And User selects the privacy policy checkbox
        When the user click on register button
        Then Registration should be success 

    Scenario: Registration should not be success
        And User enter the first name as "VIGNESGWARAN"
        And User enter the last name as "M"
        And User enter the email as "vignesh@gmail.com10temp"
        And User enter the mobile number as "9092174486"
        And User enters the password as "1234"
        And User enter the confirm password as "1234"
        And User selects the privacy policy checkbox
        When the user click on register button
        Then Registration should fail