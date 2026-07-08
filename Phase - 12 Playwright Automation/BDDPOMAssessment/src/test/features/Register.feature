Feature: M_VIGNESHWARAN_08-07-2026_DWS_REGISER_FEATURE

  Background:
    Given the user launched the application
    And click on the regiter button

  Scenario: Verify valid user registration
    When the user fills the personal details
      | gender | firstName    | lastName | email                        | password |
      | M   | VIGNESHWARAN | M        | vigneshwaran.coder@gmail.com |   123456 |
    And click on the register button
    Then the user navigates to the registration result page
    And the success message should be displayed as "Your registration completed"
