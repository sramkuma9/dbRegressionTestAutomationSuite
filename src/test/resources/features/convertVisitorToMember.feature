Feature: Convert visitor to member

  Scenario: convert the added brand new visitor to member
    Given i am on the convert to member page
    When I search emailid and click add and enter the below details and click save
     |applicationDay| |applicationMonth|  |applicationYear| |country|      |region|               |chapter|         |profession|  |speciality|  |firstName| |lastName| |companyName|     |addresslLine1|   |phone| |paymentOption||membershipOption|
    |09| |Sep| |2019| |Antarctica| |Ant - One| |Ant - One - Chapter A| |Information Technology| |Information Technology| |Selenium| |Test+v| |Airtel| |77, Edward Street| |1234567890| |Card| |One Year Membership|
    Then visitor is successfully converted to a member and I signout from BNI