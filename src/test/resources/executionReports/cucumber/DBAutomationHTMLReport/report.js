$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addAndsearchBrandNewVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search brand new visitor",
  "description": "",
  "id": "add-and-search-brand-new-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10336199,
  "status": "passed"
});
formatter.before({
  "duration": 51245701,
  "status": "passed"
});
formatter.before({
  "duration": 178652,
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
  "name": "User navigates to BNI homepage using the below login credentials",
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
  "name": "I enter a valid new email id and click search and create new button and I enter the below details and click the save button and search the added visitor",
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
      "line": 9
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
      "line": 10
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
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "brand new visitor details saved successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "sign out from BNI",
  "keyword": "And "
});
formatter.match({
  "location": "AddAndSearchBrandNewVisitor.User_navigates_to_BNI_homepage_using_the_below_login_credentials(DataTable)"
});
formatter.result({
  "duration": 394340143,
  "status": "passed"
});
formatter.match({
  "location": "AddAndSearchBrandNewVisitor.When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button_and_search_the_added_visitor(DataTable)"
});
