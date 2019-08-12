$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("endToEndTests.feature");
formatter.feature({
  "line": 1,
  "name": "BNI Login page",
  "description": "",
  "id": "bni-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9833349046,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test login page with incorrect credentials",
  "description": "",
  "id": "bni-login-page;test-login-page-with-incorrect-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the BNI login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter an incorrect username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "a message Your username or password is incorrect is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BNITests.I_am_on_the_BNI_login_page()"
});
formatter.result({
  "duration": 526754299,
  "status": "passed"
});
formatter.match({
  "location": "BNITests.I_enter_an_incorrect_username_and_password()"
});
formatter.result({
  "duration": 110863,
  "status": "passed"
});
formatter.match({
  "location": "BNITests.I_click_Login_button()"
});
formatter.result({
  "duration": 10078129,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 54638,
  "status": "passed"
});
});