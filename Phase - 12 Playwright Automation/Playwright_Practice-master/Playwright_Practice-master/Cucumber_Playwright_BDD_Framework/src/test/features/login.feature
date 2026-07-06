Feature: login a new user


    Feature Description
    Background:
    Given user lanch the application

    Scenario: valid login
    When user click myacclink
    And user click loginlink
    And user enter the email 
    And user enter the tutorial password 
    And user click the login tutorial button
    Then user should login success
      