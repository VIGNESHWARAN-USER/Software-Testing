Feature: Login Functionality

  Scenario: Valid Login
    Given I launch the application
    When I enter valid username and password
    And I click on Login button
    Then I should navigate to the Home page