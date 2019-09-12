Feature: Add a prospective visitor

  Scenario: Add a Prospective Visitor
    Given user logs into BNI and navigates to home page
    When I enter a valid existing email id and click search and Add button and I enter the below details and click the save button
      |emailId|                                 |chapter|                  |profession|               |speciality|         |person|  |visitDay|  |visitMonth|  |visitYear|   |title|  |firstName| |lastName| |companyName|     |country|       |phone|
      |meenabni25+adv@gmail.com| |Ant - One - Chapter A|  |Information Technology|    |Information Technology|      |BNI|     |12|         |Aug|         |2019|      |Mr|    |Selenium|  |Test|      |Airtel|       |Antarctica |  |123456789|
      |bnidemo+activeuser@gmail.com| |Ant - One - Chapter A|  |Information Technology|    |Information Technology|      |BNI|     |12|         |Aug|         |2019|      |Mr|    |Selenium|  |Test|      |Airtel|       |Antarctica |  |123456789|
    Then visitor details saved successfully
    And I successfully sign out from BNI