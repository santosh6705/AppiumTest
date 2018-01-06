$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login onto magento",
  "description": "line1 description\r\nline2 description",
  "id": "login-onto-magento",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#Scenario: happy path scenario"
    },
    {
      "line": 6,
      "value": "#Given I want t write a step with precondtion"
    },
    {
      "line": 7,
      "value": "#When I update my user name and password"
    },
    {
      "line": 8,
      "value": "#|policy no|name|mobile|email|address|"
    },
    {
      "line": 9,
      "value": "#|123121|testname|987979|test@gmail.com|Pune|"
    },
    {
      "line": 11,
      "value": "#When I click on login button"
    },
    {
      "line": 12,
      "value": "#Then I should get access to the admin panel"
    }
  ],
  "line": 14,
  "name": "Negative scenario",
  "description": "",
  "id": "login-onto-magento;negative-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I want t write a step with precondtion",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I update my \u003cuser name\u003e and \u003cWrong password\u003e",
  "keyword": "When "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login-onto-magento;negative-scenario;",
  "rows": [
    {
      "cells": [
        "User name",
        "Wrong password"
      ],
      "line": 19,
      "id": "login-onto-magento;negative-scenario;;1"
    },
    {
      "cells": [
        "",
        "user1",
        "pass2"
      ],
      "line": 20,
      "id": "login-onto-magento;negative-scenario;;2"
    },
    {
      "cells": [
        "",
        "user1",
        "pass2"
      ],
      "line": 21,
      "id": "login-onto-magento;negative-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Negative scenario",
  "description": "",
  "id": "login-onto-magento;negative-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I want t write a step with precondtion",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I update my \u003cuser name\u003e and user1",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.i_want_t_write_a_step_with_precondtion()"
});
formatter.result({
  "duration": 26715085697,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "Negative scenario",
  "description": "",
  "id": "login-onto-magento;negative-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I want t write a step with precondtion",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I update my \u003cuser name\u003e and user1",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.i_want_t_write_a_step_with_precondtion()"
});
formatter.result({
  "duration": 14005573705,
  "error_message": "org.openqa.selenium.WebDriverException: Failed to decode response from marionette\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027DESKTOP-E7N0R4T\u0027, ip: \u0027192.168.0.56\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 56.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:headless: false, moz:processID: 12148, moz:profile: C:\\Users\\User\\AppData\\Local..., pageLoadStrategy: normal, platform: XP, platformName: XP, platformVersion: 10.0, rotatable: false, specificationLevel: 0, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}}\nSession ID: 5bd01bc4-cbf5-4823-a1b6-1b85417f64fa\n*** Element info: {Using\u003dlink text, value\u003dMY ACCOUNT}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:425)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat runner.stepdef.i_want_t_write_a_step_with_precondtion(stepdef.java:21)\r\n\tat ✽.Given I want t write a step with precondtion(Login.feature:15)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});