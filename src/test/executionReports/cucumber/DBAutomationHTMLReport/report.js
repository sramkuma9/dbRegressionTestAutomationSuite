$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchAndAddVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search visitor",
  "description": "",
  "id": "add-and-search-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 41795946,
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
  "duration": 27053043751,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: The element reference of [object String] \"b4a0ea87-1551-4d7b-8bc2-88e842c630d7\" is stale; either the element is no longer attached to the DOM, it is not in the current frame context, or the document has been refreshed\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ajay-HP-Pavilion-15-Notebook-PC\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.0.0-23-generic\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 68.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20190718161435, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 15304, moz:profile: /tmp/rust_mozprofile.jsw53T..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, platformVersion: 5.0.0-23-generic, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 573f3c39-59e5-473b-bfeb-b0f157fbc781\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\n\tat bni.regression.pageFactory.BNIConnect.navigateMenu(BNIConnect.java:65)\n\tat bni.regression.steps.endToEndIntegrationSteps.SearchAndAddVisitor.I_am_on_the_BNI_home_page(SearchAndAddVisitor.java:71)\n\tat ✽.Given I am on the BNI home page(searchAndAddVisitor.feature:4)\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchAndAddVisitor.I_navigate_to_Operations_Region_Add_visitor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchAndAddVisitor.a_pop_up_window_Add_a_Visitor_appears()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 32913,
  "status": "passed"
});
formatter.before({
  "duration": 149495,
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
  "name": "create new button is displayed and clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndAddVisitor.I_am_on_the_Add_a_visitor_page()"
});
formatter.result({
  "duration": 239147,
  "status": "passed"
});
formatter.match({
  "location": "SearchAndAddVisitor.I_enter_a_valid_email_id()"
});
formatter.result({
  "duration": 20028253099,
  "error_message": "org.openqa.selenium.WebDriverException: Failed to convert data to an object\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ajay-HP-Pavilion-15-Notebook-PC\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.0.0-23-generic\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 68.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20190718161435, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 15304, moz:profile: /tmp/rust_mozprofile.jsw53T..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, platformVersion: 5.0.0-23-generic, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 573f3c39-59e5-473b-bfeb-b0f157fbc781\n*** Element info: {Using\u003dcss selector, value\u003d#droppedMemberEmail}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.access$001(AjaxElementLocator.java:39)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator$SlowLoadingElement.isLoaded(AjaxElementLocator.java:165)\n\tat org.openqa.selenium.support.ui.SlowLoadableComponent.get(SlowLoadableComponent.java:61)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.findElement(AjaxElementLocator.java:95)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\n\tat bni.regression.pageFactory.AddAVisitor.enterEmail(AddAVisitor.java:88)\n\tat bni.regression.steps.endToEndIntegrationSteps.SearchAndAddVisitor.I_enter_a_valid_email_id(SearchAndAddVisitor.java:102)\n\tat ✽.And I enter a valid email id(searchAndAddVisitor.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchAndAddVisitor.click_search_and_click_search_by_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchAndAddVisitor.I_enter_the_First_and_Last_name()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 33144,
  "status": "passed"
});
formatter.before({
  "duration": 192487,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Add a new visitor",
  "description": "",
  "id": "add-and-search-visitor;add-a-new-visitor",
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
  "name": "I select a proffession",
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
  "name": "select title, first and last name",
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
  "name": "click save button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchAndAddVisitor.I_am_on_the_add_a_new_visitor_page_and_is_displayed()"
});
