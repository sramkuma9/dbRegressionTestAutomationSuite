$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddPVVisitor.feature");
formatter.feature({
  "line": 1,
  "name": "Add and search visitor",
  "description": "",
  "id": "add-and-search-visitor",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6448821,
  "status": "passed"
});
formatter.before({
  "duration": 12370758,
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
  "duration": 35684746022,
  "status": "passed"
});
formatter.match({
  "location": "AddPVVisitor.When_I_enter_a_valid_existing_email_id_and_click_search_and_Add_button_and_I_enter_the_below_details_and_click_the_save_button(DataTable)"
});
formatter.result({
  "duration": 113118959492,
  "status": "passed"
});
formatter.match({
  "location": "AddPVVisitor.visitor_details_saved_sucessfully()"
});
formatter.result({
  "duration": 279382,
  "status": "passed"
});
formatter.match({
  "location": "AddPVVisitor.I_sucessfully_sign_out_from_BNI()"
});
formatter.result({
  "duration": 8197962699,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003ca href\u003d\"/web/logout\"\u003e could not be scrolled into view\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ajay-HP-Pavilion-15-Notebook-PC\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.0.0-23-generic\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 68.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20190718161435, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 20888, moz:profile: /tmp/rust_mozprofile.yUNabH..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, platformVersion: 5.0.0-23-generic, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d956d2fb-fcab-43ab-9b50-4e4cd940b547\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\n\tat bni.regression.pageFactory.BNIConnect.clickSignOut(BNIConnect.java:100)\n\tat bni.regression.libraries.ui.SignOut.signOutBni(SignOut.java:22)\n\tat bni.regression.steps.endToEndIntegrationSteps.AddPVVisitor.I_sucessfully_sign_out_from_BNI(AddPVVisitor.java:115)\n\tat ✽.And I sucessfully sign out from BNI(AddPVVisitor.feature:10)\n",
  "status": "failed"
});
formatter.after({
  "duration": 53787,
  "status": "passed"
});
formatter.after({
  "duration": 53843,
  "status": "passed"
});
});