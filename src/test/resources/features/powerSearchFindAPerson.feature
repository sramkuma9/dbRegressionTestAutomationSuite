Feature: Power Search Find a person

  Scenario: Power Search Find a person
    Given I’m in the BNI home page, and click Tools->Power search
      | User Name | Password  | country    | region    | chapter               |
      | malshq    | Pass1word | Antarctica | Ant - One | Ant - One - Chapter A |
      | malshq    | Pass1word | Antarctica | Ant - One | Ant - One - Chapter A |
    When I click “Find a Person” and enter the below details and click search button
      | First Name |  | Last Name |
      | Aadhira    |  | Kumar     |
    Then Reports for the specified person displayed successfully- verify with DB