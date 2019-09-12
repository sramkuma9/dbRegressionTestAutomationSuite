$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddVisitorForExistingIndividual.feature");
formatter.feature({
  "line": 1,
  "name": "Add a prospective visitor",
  "description": "",
  "id": "add-a-prospective-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19104367,
  "status": "passed"
});
formatter.before({
  "duration": 149869,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add a Prospective Visitor",
  "description": "",
  "id": "add-a-prospective-visitor;add-a-prospective-visitor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user logs into BNI and navigates to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter a valid existing email id and click search and Add button and I enter the below details and click the save button",
  "rows": [
    {
      "cells": [
        "emailId",
        "",
        "chapter",
        "",
        "profession",
        "",
        "speciality",
        "",
        "person",
        "",
        "visitDay",
        "",
        "visitMonth",
        "",
        "visitYear",
        "",
        "title",
        "",
        "firstName",
        "",
        "lastName",
        "",
        "companyName",
        "",
        "country",
        "",
        "phone"
      ],
      "line": 6
    },
    {
      "cells": [
        "meenabni25+adv@gmail.com",
        "",
        "Ant - One - Chapter A",
        "",
        "Information Technology",
        "",
        "Information Technology",
        "",
        "BNI",
        "",
        "12",
        "",
        "Aug",
        "",
        "2019",
        "",
        "Mr",
        "",
        "Selenium",
        "",
        "Test",
        "",
        "Airtel",
        "",
        "Antarctica",
        "",
        "123456789"
      ],
      "line": 7
    },
    {
      "cells": [
        "bnidemo+activeuser@gmail.com",
        "",
        "Ant - One - Chapter A",
        "",
        "Information Technology",
        "",
        "Information Technology",
        "",
        "BNI",
        "",
        "12",
        "",
        "Aug",
        "",
        "2019",
        "",
        "Mr",
        "",
        "Selenium",
        "",
        "Test",
        "",
        "Airtel",
        "",
        "Antarctica",
        "",
        "123456789"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "visitor details saved successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I successfully sign out from BNI",
  "keyword": "And "
});
formatter.match({
  "location": "AddVisitorForExistingIndividual.user_logs_into_BNI_and_navigates_to_home_page()"
});
formatter.result({
  "duration": 36950474677,
  "status": "passed"
});
formatter.match({
  "location": "AddVisitorForExistingIndividual.When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button(DataTable)"
});
formatter.result({
  "duration": 125974480552,
  "status": "passed"
});
formatter.match({
  "location": "AddVisitorForExistingIndividual.visitor_details_saved_successfully()"
});
formatter.result({
  "duration": 488183,
  "status": "passed"
});
formatter.match({
  "location": "AddVisitorForExistingIndividual.I_successfully_sign_out_from_BNI()"
});
formatter.result({
  "duration": 19440183645,
  "status": "passed"
});
formatter.after({
  "duration": 65738,
  "status": "passed"
});
formatter.after({
  "duration": 47362,
  "status": "passed"
});
formatter.uri("searchAndAddBrandNewVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search brand new visitor",
  "description": "",
  "id": "add-and-search-brand-new-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 220195,
  "status": "passed"
});
formatter.before({
  "duration": 55013,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add a brand new Visitor",
  "description": "",
  "id": "add-and-search-brand-new-visitor;add-a-brand-new-visitor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to BNI homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter a valid existing email id and click search and create new button and I enter the below details and click the save button and search the added visitor",
  "rows": [
    {
      "cells": [
        "chapter",
        "",
        "region",
        "",
        "firstName",
        "",
        "lastName",
        "",
        "profession",
        "",
        "speciality",
        "",
        "person",
        "",
        "visitDay",
        "",
        "visitMonth",
        "",
        "visitYear",
        "",
        "title",
        "",
        "companyName",
        "",
        "country",
        "",
        "phone"
      ],
      "line": 6
    },
    {
      "cells": [
        "Ant - One - Chapter A",
        "",
        "Ant - One",
        "",
        "Selenium",
        "",
        "Test+v",
        "",
        "Information Technology",
        "",
        "Information Technology",
        "",
        "BNI",
        "",
        "12",
        "",
        "Aug",
        "",
        "2019",
        "",
        "Mr",
        "",
        "Airtel",
        "",
        "Antarctica",
        "",
        "123456789"
      ],
      "line": 7
    },
    {
      "cells": [
        "Ant - One - Chapter A",
        "",
        "Ant - One",
        "",
        "Selenium",
        "",
        "Test+v",
        "",
        "Information Technology",
        "",
        "Information Technology",
        "",
        "BNI",
        "",
        "12",
        "",
        "Aug",
        "",
        "2019",
        "",
        "Mr",
        "",
        "Airtel",
        "",
        "Antarctica",
        "",
        "123456789"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "brand new visitor details saved successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "sign out from BNI",
  "keyword": "And "
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.User_navigates_to_BNI_homepage()"
});
formatter.result({
  "duration": 34536333836,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button_and_search_the_added_visitor(DataTable)"
});
formatter.result({
  "duration": 173898831023,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.brand_new_visitor_details_saved_successfully()"
});
formatter.result({
  "duration": 265286,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.sign_out_from_BNI()"
});
formatter.result({
  "duration": 18851510068,
  "status": "passed"
});
formatter.after({
  "duration": 65243,
  "status": "passed"
});
formatter.after({
  "duration": 55536,
  "status": "passed"
});
});