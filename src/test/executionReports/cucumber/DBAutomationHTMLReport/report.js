$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchAndAddBrandNewVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search brand new visitor",
  "description": "",
  "id": "add-and-search-brand-new-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6955346,
  "status": "passed"
});
formatter.before({
  "duration": 20356440,
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
  "name": "I am on the BNI homepage",
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
  "name": "I successfully sign out from BNI system",
  "keyword": "And "
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_am_on_the_BNI_homepage()"
});
formatter.result({
  "duration": 35560265948,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button_and_search_the_added_visitor(DataTable)"
});
formatter.result({
  "duration": 173860964765,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.brand_new_visitor_details_saved_successfully()"
});
formatter.result({
  "duration": 392165,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_successfully_sign_out_from_BNI_system()"
});
formatter.result({
  "duration": 19304590407,
  "status": "passed"
});
formatter.after({
  "duration": 54995,
  "status": "passed"
});
formatter.after({
  "duration": 42299,
  "status": "passed"
});
});