$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchAndAddVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search visitor",
  "description": "",
  "id": "add-and-search-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21641764243,
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
  "duration": 12348327105,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddVisitor.I_navigate_to_Operations_Region_Add_visitor()"
});
formatter.result({
  "duration": 5367463958,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddVisitor.a_pop_up_window_Add_a_Visitor_appears()"
});
formatter.result({
  "duration": 44118725,
  "status": "passed"
});
formatter.after({
  "duration": 36762,
  "status": "passed"
});
});