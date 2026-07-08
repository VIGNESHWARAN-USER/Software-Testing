Feature: M_VIGNESHWARAN_08-07-2026_DWS_LOGIN_FEATURE

  Background:
    Given the user launched the application
    And clicks on the login button

  Scenario: Verify valid user login
    When the user fills the "valid" details
    And click on the login button
    Then the user navigates to the home page
    And the email should be displayed in the navigation area
    And the logout button should be displayed in the navigation area

  Scenario Outline: Verify invalid user login with empty and invalid data
    When the user fills the "<testcase>" details
    And click on the login button
    Then the error message should be displayed as "<message>"

    Examples:
      | testcase                         | message                                |
      | Blank email                      | No customer account found              |
      | Blank password with invaid email | No customer account found              |
      | Blank password with vaid email   | No customer account found              |
      | Blank email and password         | No customer account found              |
      | Invalid email                    | The credentials provided are incorrect |
      | Invalid password                 | The credentials provided are incorrect |
