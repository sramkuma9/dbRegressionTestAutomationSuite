$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bNILoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "BNI Login page",
  "description": "",
  "id": "bni-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21680711470,
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
  "location": "BniLoginPage.I_am_on_the_BNI_login_page()"
});
formatter.result({
  "duration": 180094226,
  "status": "passed"
});
formatter.match({
  "location": "BniLoginPage.I_enter_an_incorrect_username_and_password()"
});
formatter.result({
  "duration": 174023,
  "status": "passed"
});
formatter.match({
  "location": "BniLoginPage.I_click_Login_button()"
});
formatter.result({
  "duration": 273247,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 20657573581,
  "status": "passed"
});
});