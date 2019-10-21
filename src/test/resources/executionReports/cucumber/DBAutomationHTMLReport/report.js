$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("powerSearchFindAPerson.feature");
formatter.feature({
  "line": 1,
  "name": "Power Search Find a person",
  "description": "",
  "id": "power-search-find-a-person",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9194960,
  "status": "passed"
});
formatter.before({
  "duration": 16099420,
  "status": "passed"
});
formatter.before({
  "duration": 165813,
  "status": "passed"
});
formatter.before({
  "duration": 277202,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Power Search Find a person",
  "description": "",
  "id": "power-search-find-a-person;power-search-find-a-person",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I’m in the BNI home page, and click Tools-\u003ePower search",
  "rows": [
    {
      "cells": [
        "User Name",
        "Password",
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
        "Ant - One - Chapter A"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click “Find a Person” and enter the below details and click search button",
  "rows": [
    {
      "cells": [
        "First Name",
        "",
        "Last Name"
      ],
      "line": 9
    },
    {
      "cells": [
        "Aadhira",
        "",
        "Kumar"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Reports for the specified person displayed successfully- verify with DB",
  "keyword": "Then "
});
formatter.match({
  "location": "PowerSearchFindAPerson.I_m_in_the_BNI_home_page_and_click_Tools_Power_search(DataTable)"
});
formatter.result({
  "duration": 260842444,
  "status": "passed"
});
formatter.match({
  "location": "PowerSearchFindAPerson.I_click_Find_a_Person_and_enter_the_below_details_and_click_search_button(DataTable)"
});
formatter.result({
  "duration": 86233368371,
  "error_message": "org.openqa.selenium.WebDriverException: Failed to interpret value as array\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ajay-HP-Pavilion-15-Notebook-PC\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.0.0-31-generic\u0027, java.version: \u002711.0.4\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 69.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20191002193559, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 26963, moz:profile: /tmp/rust_mozprofile.MSyfht..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, platformVersion: 5.0.0-31-generic, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a167e2c1-86d7-4e55-ab35-af27ada80d43\n*** Element info: {Using\u003dcss selector, value\u003d#commonFilterListCountries \u003e div \u003e a}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByCssSelector(RemoteWebDriver.java:424)\n\tat org.openqa.selenium.By$ByCssSelector.findElements(By.java:441)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.access$201(AjaxElementLocator.java:39)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator$SlowLoadingElementList.isLoaded(AjaxElementLocator.java:206)\n\tat org.openqa.selenium.support.ui.SlowLoadableComponent.get(SlowLoadableComponent.java:51)\n\tat org.openqa.selenium.support.pagefactory.AjaxElementLocator.findElements(AjaxElementLocator.java:112)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\n\tat com.sun.proxy.$Proxy22.iterator(Unknown Source)\n\tat bni.regression.pageFactory.BNIConnect.selectCountry(BNIConnect.java:79)\n\tat bni.regression.libraries.ui.SelectCountryRegionChapter.selectCountryRegChap(SelectCountryRegionChapter.java:12)\n\tat bni.regression.steps.endToEndIntegrationSteps.PowerSearchFindAPerson.I_click_Find_a_Person_and_enter_the_below_details_and_click_search_button(PowerSearchFindAPerson.java:85)\n\tat ✽.When I click “Find a Person” and enter the below details and click search button(powerSearchFindAPerson.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "PowerSearchFindAPerson.Reports_for_the_specified_person_displayed_successfully_verify_with_DB()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 50613,
  "status": "passed"
});
formatter.after({
  "duration": 47235,
  "status": "passed"
});
formatter.after({
  "duration": 39635,
  "status": "passed"
});
formatter.after({
  "duration": 46044,
  "status": "passed"
});
});