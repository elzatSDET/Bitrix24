$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/login/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a user I should be able to create a task from activity stream.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Btrix24_application"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with following credentials",
  "rows": [
    {
      "cells": [
        "username",
        "helpdesk60@cybertekschool.com"
      ]
    },
    {
      "cells": [
        "password",
        "UserUser"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_following_credentials(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user can create new task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Btrix24_application"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"Activity Stream\" and \"Tasks\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuDefinitions.user_navigation_to_and(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"span[contains(text(),\u0027Tasks\u0027)]\"}\n  (Session info: chrome\u003d76.0.3809.100)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Pro-4.local\u0027, ip: \u0027fe80:0:0:0:10bc:8400:fa39:92d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.5\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.100, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /var/folders/xv/l993cnd54xs...}, goog:chromeOptions: {debuggerAddress: localhost:58264}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 59266a5c8b09b1a4b2cab3f595d5d5b7\n*** Element info: {Using\u003dxpath, value\u003dspan[contains(text(),\u0027Tasks\u0027)]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.cybertek.Btrix24.utilities.BasePage.navigateToModule(BasePage.java:90)\n\tat com.cybertek.Btrix24.step_definitions.TopMenuDefinitions.user_navigation_to_and(TopMenuDefinitions.java:14)\n\tat ✽.user navigates to \"Activity Stream\" and \"Tasks\"(src/test/resources/feature/login/Login.feature:13)\n",
  "status": "failed"
});
formatter.step({
  "name": "user add the \"task name\" and click send to create a Task",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_add_the_task_name_and_click_send_to_create_a_Task(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});