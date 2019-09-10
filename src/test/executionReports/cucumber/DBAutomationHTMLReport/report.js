$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddPVVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search visitor",
  "description": "",
  "id": "add-and-search-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6925767,
  "status": "passed"
});
formatter.before({
  "duration": 12441519,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add a Prospective Visitor",
  "description": "",
  "id": "add-and-search-visitor;add-a-prospective-visitor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the BNI home page",
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
        "proffession",
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
  "name": "visitor details saved sucessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I sucessfully sign out from BNI",
  "keyword": "And "
});
formatter.match({
  "location": "AddPVVisitor.I_am_on_the_BNI_home_page()"
});
formatter.result({
  "duration": 36772670450,
  "status": "passed"
});
formatter.match({
  "location": "AddPVVisitor.When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button(DataTable)"
});
formatter.result({
  "duration": 102353984803,
  "status": "passed"
});
formatter.match({
  "location": "AddPVVisitor.visitor_details_saved_sucessfully()"
});
formatter.result({
  "duration": 238997,
  "status": "passed"
});
formatter.match({
  "location": "AddPVVisitor.I_sucessfully_sign_out_from_BNI()"
});
formatter.result({
  "duration": 19559189465,
  "status": "passed"
});
formatter.after({
  "duration": 37918,
  "status": "passed"
});
formatter.after({
  "duration": 32449,
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
  "duration": 59656,
  "status": "passed"
});
formatter.before({
  "duration": 185740,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Navigate to Add a Visitor page",
  "description": "",
  "id": "add-and-search-brand-new-visitor;navigate-to-add-a-visitor-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the BNI page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Operations, Region -\u003e Add a visitor",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "a pop up window Add a Visitor appears",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_am_on_the_BNI_page()"
});
formatter.result({
  "duration": 32922189800,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_navigate_to_Operations_And_Region_Add_visitor()"
});
formatter.result({
  "duration": 5361288978,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.a_pop_up_window_Add_a_Visitor_appears()"
});
formatter.result({
  "duration": 37700133,
  "status": "passed"
});
formatter.after({
  "duration": 33411,
  "status": "passed"
});
formatter.after({
  "duration": 53395,
  "status": "passed"
});
formatter.before({
  "duration": 309676,
  "status": "passed"
});
formatter.before({
  "duration": 207006,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search with email id and name",
  "description": "",
  "id": "add-and-search-brand-new-visitor;search-with-email-id-and-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on the Add a visitor page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter a valid email id",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click search and click search by name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter the First and Last name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "create new button is displayed and clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_am_on_the_Add_a_visitor_page()"
});
formatter.result({
  "duration": 135780,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_enter_a_valid_email_id()"
});
formatter.result({
  "duration": 1148102692,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.click_search_and_click_search_by_name()"
});
formatter.result({
  "duration": 6690329570,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_enter_the_First_and_Last_name()"
});
formatter.result({
  "duration": 1097380138,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_click_the_search_button()"
});
formatter.result({
  "duration": 4424346865,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.create_new_button_is_displayed()"
});
formatter.result({
  "duration": 2289582473,
  "status": "passed"
});
formatter.after({
  "duration": 64264,
  "status": "passed"
});
formatter.after({
  "duration": 54941,
  "status": "passed"
});
formatter.before({
  "duration": 97915,
  "status": "passed"
});
formatter.before({
  "duration": 468915,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Add a new visitor",
  "description": "",
  "id": "add-and-search-brand-new-visitor;add-a-new-visitor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I am on the add a new visitor page and is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I select a chapter and proffession",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "select speciality",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select person",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enter a valid date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "select title, first and last name and company name",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "select the country",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "enter the phone",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "click the save button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "visitor detail is saved sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_am_on_the_add_a_new_visitor_page_and_is_displayed()"
});
formatter.result({
  "duration": 28701092,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_select_a_proffession()"
});
formatter.result({
  "duration": 4330564868,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.select_speciality()"
});
formatter.result({
  "duration": 2279726835,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.select_person()"
});
formatter.result({
  "duration": 2279128153,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.enter_a_valid_date()"
});
formatter.result({
  "duration": 12193135671,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.select_title_first_and_last_name()"
});
formatter.result({
  "duration": 7492253208,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.select_the_country()"
});
formatter.result({
  "duration": 2297139581,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.enter_the_phone()"
});
formatter.result({
  "duration": 2088451719,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.click_the_save_button()"
});
formatter.result({
  "duration": 3294839690,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.visitor_detail_is_saved_sucessfully()"
});
formatter.result({
  "duration": 226288,
  "status": "passed"
});
formatter.after({
  "duration": 42003,
  "status": "passed"
});
formatter.after({
  "duration": 33610,
  "status": "passed"
});
formatter.before({
  "duration": 83517,
  "status": "passed"
});
formatter.before({
  "duration": 175482,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Search the added visitor",
  "description": "",
  "id": "add-and-search-brand-new-visitor;search-the-added-visitor",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "I am on the Add visitor page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I search the added visitor using the email id",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "the saved record should retrive 2 records with type visit and visitor with correct details",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.I_am_on_the_Add_visitor_page()"
});
formatter.result({
  "duration": 4000257380,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.search_the_added_visitor_using_the_email_id()"
});
formatter.result({
  "duration": 16533839452,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddBrandNewVisitor.the_saved_records_should_be_retrived_2_records_with_type_visit_and_visitor_with_correct_details()"
});
formatter.result({
  "duration": 25238945419,
  "status": "passed"
});
formatter.after({
  "duration": 35232,
  "status": "passed"
});
formatter.after({
  "duration": 24684,
  "status": "passed"
});
});