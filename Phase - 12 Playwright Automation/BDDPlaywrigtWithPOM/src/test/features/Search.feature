Feature: Search Feature

    Background: 
        Given the user launches the application

    Scenario: To verify the valid search feature 
        When the user enters the "valid" search key in search box
        And click the search button
        Then the user navigates to the product page
        And the related products should be displayed

    Scenario: To verify the invalid search featurewithout checking privacy policy  
        When the user enters the "invalid" search key in search box
        And click the search button
        Then the user should see the mesage as "No products found"
