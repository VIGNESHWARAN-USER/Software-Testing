Feature: VIGNESHWARAN_M_13-05-2026_QAFox_SearchFeature

  @SearchWithOutline
  Scenario Outline: Scenario Outline with Data-Driven Testing
    Given the user launches the application
    When give the search key "<keyword>" and click enter
    Then the assertion should be as "<result_status>"
    
    Examples:
      | keyword | result_status |
      | iPhone  | contain       |
      | Samsung | contain       |
      | Nik     | contain   |
