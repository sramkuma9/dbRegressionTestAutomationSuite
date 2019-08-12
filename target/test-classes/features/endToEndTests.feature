Feature: BNI Login page

  Scenario: Test login page with incorrect credentials
    Given I am on the BNI login page
    When I enter an incorrect username and password
    And I click Login button
    Then a message Your username or password is incorrect is displayed