Feature: Login page

Scenario: Navigate to Upoint login page URL
    Given The user opens chrome browser
    When User accesses login URL
    Then Land on Login page

Scenario Outline: Login using multiple users
    Given The user is on the login page
    When The user enters "<userid>" and "<password>"
    Then User should login successfully

    Examples: 
      | userid  | password |
      | nnagapandyan@yahoo.co.in   |   nagahema    |
      | naga@gmail.com   |   Naga    |