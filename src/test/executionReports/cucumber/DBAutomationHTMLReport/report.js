$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchAndAddVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search visitor",
  "description": "",
  "id": "add-and-search-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6493387,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Navigate to Add a Visitor page",
  "description": "",
  "id": "add-and-search-visitor;navigate-to-add-a-visitor-page",
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
  "name": "I navigate to Operations -\u003e Region -\u003e Add a visitor",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "a pop up window \u0027Add a Visitor\u0027 appears",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndAddVisitor.I_am_on_the_BNI_home_page()"
});
formatter.result({
  "duration": 33678875471,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddVisitor.I_navigate_to_Operations_Region_Add_visitor()"
});
formatter.result({
  "duration": 5365030848,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddVisitor.a_pop_up_window_Add_a_Visitor_appears()"
});
formatter.result({
  "duration": 50877248,
  "status": "passed"
});
formatter.after({
  "duration": 44860,
  "status": "passed"
});
formatter.before({
  "duration": 66071,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search with email id and name",
  "description": "",
  "id": "add-and-search-visitor;search-with-email-id-and-name",
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
  "name": "create new button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndAddVisitor.I_am_on_the_Add_a_visitor_page()"
});
formatter.result({
  "duration": 94169,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddVisitor.I_enter_a_valid_email_id()"
});
formatter.result({
  "duration": 1118761490,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddVisitor.click_search_and_click_search_by_name()"
});
formatter.result({
  "duration": 6692365083,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "SearchAndAddVisitor.I_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchAndAddVisitor.create_new_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 34919,
  "status": "passed"
});
});