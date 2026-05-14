Feature: VIGNESHWARAN_M_13-05-2026_QAFox_AddressBookFeature

  Background:
    Given the user launches the application
    And the user is logged-in

  @AddAddressWithDataTable
  Scenario Outline: Address Book Feature — Data Table for Multi-Field Form
    Given the user is on address page
    When the user clicks the new address button
    And the user fills the form fields
      | John | Doe | 123 Main Street | Chennai | 600001 | India | Tamil Nadu |
    And the user clicks the continue button
    Then the success message should be displayed as "Your address has been successfully added"
