Feature: DemoBlaze Login Feature

  Background:
    Given the user launches the home page


  @ValidCredentials @Smoke  
  Scenario: Login with valid credentials
    When the user opens the login pop-up
    And the user enters username "admin"
    And the user enters password "admin"
    And the user submits login
    Then the user should see welcome message "<>"
    
    Examples: 
  | username | password   | errorMessage      |
  | admin    | admin123dc | Wrong password. |
  | admin09873   | admin123dc | User does not exist. |
  |    |  | Please fill out Username and Password. |

  @InvalidPassword @Regression
  Scenario Outline: Login with invalid credentials
    When the user opens the login pop-up
    And the user enters username "<username>"
    And the user enters password "<password>"
    And the user submits login
    Then an alert should appear with message "<errorMessage>"
    
  Examples: Examples:
  | username | password   | errorMessage      |
  | admin    | admin123dc | Wrong password. |
  | admin09873   | admin123dc | User does not exist. |
  |    |  | Please fill out Username and Password. |
