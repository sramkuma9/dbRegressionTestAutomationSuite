$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("convertVisitorToMember.feature");
formatter.feature({
  "line": 1,
  "name": "Convert visitor to member",
  "description": "",
  "id": "convert-visitor-to-member",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7054543,
  "status": "passed"
});
formatter.before({
  "duration": 14637198,
  "status": "passed"
});
formatter.before({
  "duration": 172998,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "convert the added brand new visitor to member",
  "description": "",
  "id": "convert-visitor-to-member;convert-the-added-brand-new-visitor-to-member",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Enter New Application page using the below data",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "country",
        "region",
        "chapter"
      ],
      "line": 5
    },
    {
      "cells": [
        "malshq",
        "Pass1word",
        "Antarctica",
        "Ant - One",
        "Ant - One - Chapter A"
      ],
      "line": 6
    },
    {
      "cells": [
        "malshq",
        "Pass1word",
        "Antarctica",
        "Ant - One",
        "Ant - One - Chapter B"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search emailid and click add and enter the below details and click save",
  "rows": [
    {
      "cells": [
        "applicationDay",
        "",
        "applicationMonth",
        "",
        "applicationYear",
        "",
        "country",
        "",
        "region",
        "",
        "chapter",
        "",
        "profession",
        "",
        "speciality",
        "",
        "firstName",
        "",
        "lastName",
        "",
        "companyName",
        "",
        "addressLine1",
        "",
        "phone",
        "",
        "paymentOption",
        "",
        "membershipOption"
      ],
      "line": 9
    },
    {
      "cells": [
        "9",
        "",
        "Sep",
        "",
        "2019",
        "",
        "Antarctica",
        "",
        "Ant - One",
        "",
        "Ant - One - Chapter A",
        "",
        "Information Technology",
        "",
        "Information Technology",
        "",
        "Selenium",
        "",
        "Test+v",
        "",
        "Airtel",
        "",
        "77, Edward Street",
        "",
        "1234567890",
        "",
        "Card",
        "",
        "One Year Membership"
      ],
      "line": 10
    },
    {
      "cells": [
        "9",
        "",
        "Sep",
        "",
        "2019",
        "",
        "Antarctica",
        "",
        "Ant - One",
        "",
        "Ant - One - Chapter A",
        "",
        "Information Technology",
        "",
        "Information Technology",
        "",
        "Selenium",
        "",
        "Test+v",
        "",
        "Airtel",
        "",
        "77, Edward Street",
        "",
        "1234567890",
        "",
        "Card",
        "",
        "One Year Membership"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "visitor is successfully converted to a member and I signout from BNI",
  "keyword": "Then "
});
formatter.match({
  "location": "ConvertVisitorToMember.I_am_on_the_Enter_New_Application_page_using_the_below_data(DataTable)"
});
formatter.result({
  "duration": 318945464,
  "status": "passed"
});
formatter.match({
  "location": "ConvertVisitorToMember.I_search_emailid_and_click_add_and_enter_the_below_details_and_click_save(DataTable)"
});
formatter.result({
  "duration": 290578449341,
  "error_message": "java.lang.NullPointerException\n\tat bni.regression.libraries.common.ReadWriteExcel.getCellData(ReadWriteExcel.java:29)\n\tat bni.regression.steps.endToEndIntegrationSteps.ConvertVisitorToMember.I_search_emailid_and_click_add_and_enter_the_below_details_and_click_save(ConvertVisitorToMember.java:108)\n\tat ✽.When I search emailid and click add and enter the below details and click save(convertVisitorToMember.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "ConvertVisitorToMember.visitor_is_successfully_converted_to_a_member_and_I_signout_from_BNI()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 43108,
  "status": "passed"
});
formatter.after({
  "duration": 37471,
  "status": "passed"
});
formatter.after({
  "duration": 36382,
  "status": "passed"
});
});