Feature: Add and search visitor

  Scenario: Navigate to Add a Visitor page
    Given I am on the BNI home page
    When I navigate to Operations -> Region -> Add a visitor
    Then a pop up window 'Add a Visitor' appears

#  Scenario: Search with email id and name
#    Given I am on the Add a visitor page
#    And I enter a valid email id
#    And click search and click search by name
#    And I enter the First and Last name
#    Then craete new button is displayed
#
#  Scenario: Check if create new button is displayed
#    Given I am on the Add a visitor page
#    And I click the create new button
#    Then details to add a visitor are displayed
#
#  Scenario: Add a new visitor
#    Given I am on the add a new visitor page with all the required details displayed
#    When I select a proffession
#    And speciality
#    And select person
#    And enter a valid date
#    And select title, first and last name
#    And select the country
#    And enter the phone and notes
#    And click save button
#    Then a message Your form has been sucussfully submitted appears