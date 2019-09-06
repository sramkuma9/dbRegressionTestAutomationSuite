#Feature: Add and search brand new visitor
#
#  Scenario: Navigate to Add a Visitor page
#    Given I am on the BNI page
#    When I navigate to Operations, Region -> Add a visitor
#    Then a pop up window Add a Visitor appears
#
#  Scenario: Search with email id and name
#    Given I am on the Add a visitor page
#    And I enter a valid email id
#    And click search and click search by name
#    And I enter the First and Last name
#    And I click the search button
#    Then create new button is displayed and clicked
#
#  Scenario: Add a new visitor
#    Given I am on the add a new visitor page and is displayed
#    When I select a chapter and proffession
#    And select speciality
#    And select person
#    And enter a valid date
#    And select title, first and last name and company name
#    And select the country
#    And enter the phone
#    And click the save button
#    Then visitor detail is saved sucessfully
#
#  Scenario: Search the added visitor
#    Given I am on the Add visitor page
#    When I search the added visitor using the email id
#    Then the saved record should retrive 2 records with type visit and visitor with correct details