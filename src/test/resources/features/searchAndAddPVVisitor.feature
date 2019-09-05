Feature: Add and search visitor

  Scenario Outline: Add a Prospective Visitor
    Given I am on the BNI home page
    When I navigate to Operations -> Region -> Add a visitor
    And I enter a valid "<emailId>"
    And click search and click Add button
    And I am on the add a new visitor page and is displayed
    And I select a "<chapter>" and "<proffession>"
    And select "<speciality>" in speciality
    And select "<person>" in person
    And enter a "<validDay>" and "<validMonth>" and "<validYear>" in dateField
    And select "<title>" and "<firstName>" and "<lastName>" and "<companyName"> in resp fields
    And select the "<country>" in country field
    And enter the "<phone>" in phone field
    And click save button
    Then visitor details saved sucessfully
    And I sucessfully sign out from BNI

    Examples:
      |emailId|                                 |chapter|                  |proffession|               |speciality|         |person|  |visitDay|  |visitMonth|  |visitYear|   |title|  |firstName| |lastName| |companyName|     |country|       |phone|
      |meenabni25+cd@gmail.com| |Ant - One - Chapter A|  |Information Technology|    |Information Technology|      |BNI|     |12|         |Aug|         |2019|      |Mr|    |Selenium|  |Test|      |Airtel|       |Antarctica |  |123456789|
      |sugabni123+change6@gmail.com| |Ant - One - Chapter A|  |Information Technology|    |Information Technology|      |BNI|     |12|         |Aug|         |2019|      |Mr|    |Selenium|  |Test|      |Airtel|       |Antarctica |  |123456789|