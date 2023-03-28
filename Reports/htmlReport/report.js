$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/FrgtPwd.feature");
formatter.feature({
  "name": "",
  "description": "  To validate forgotten password functionality in fb app",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ForgotPwd"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "    To validate forgotten password using invalid mobile number",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ForgotPwd"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter Fb Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_Fb_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click forgotten password button",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_forgotten_password_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter invalid mobile number",
  "rows": [
    {
      "cells": [
        "9876543210",
        "222001",
        "greens@gmail.com",
        "abc123",
        "java",
        "python"
      ]
    }
  ],
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_mobile_number(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027identify$email\u0027]\"}\n  (Session info: chrome\u003d110.0.5481.178)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [fa1daaa6749bf17b94c855d2ade382d1, findElement {using\u003dxpath, value\u003d//*[@id\u003d\u0027identify$email\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.178, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Users\\Amirtha\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:61798}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:61798/devtoo..., se:cdpVersion: 110.0.5481.178, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: fa1daaa6749bf17b94c855d2ade382d1\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\r\n\tat org.stepdefinition.StepDefinition.user_have_to_enter_invalid_mobile_number(StepDefinition.java:39)\r\n\tat ✽.User have to enter invalid mobile number(file:src/test/resources/FeatureFiles/FrgtPwd.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to be in error page",
  "keyword": "* "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_error_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "",
  "description": "  To validate login functionality in Fb",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
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
  "name": "User have to enter Fb Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_Fb_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to maximize the screen",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_maximize_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using valid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User have to enter valid email and invalid password",
  "rows": [
    {
      "cells": [
        "java1234",
        "selenium",
        "9876543210"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "testing",
        "8765432111"
      ]
    },
    {
      "cells": [
        "python",
        "oracle",
        "manual"
      ]
    },
    {
      "cells": [
        "Collection",
        "Gr1234",
        "8908908900"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userHaveToEntervalidEmailAndInvalidPassword(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 10, Size: 3\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat java.util.Collections$UnmodifiableList.get(Unknown Source)\r\n\tat org.stepdefinition.StepDefinition.userHaveToEntervalidEmailAndInvalidPassword(StepDefinition.java:47)\r\n\tat ✽.User have to enter valid email and invalid password(file:src/test/resources/FeatureFiles/Login.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to be in password incorrect page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_password_incorrect_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User have to enter Fb Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_Fb_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to maximize the screen",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_maximize_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using invalid email and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User have to enter invalid email and invalid password",
  "rows": [
    {
      "cells": [
        "email",
        "greens@gmail.com"
      ]
    },
    {
      "cells": [
        "password",
        "Greens@123"
      ]
    },
    {
      "cells": [
        "Username",
        "Greenstech"
      ]
    },
    {
      "cells": [
        "Phno",
        "9876543210"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_email_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to be in password incorrect page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_password_incorrect_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User have to enter Fb Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_Fb_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to maximize the screen",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_maximize_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using invalid email and valid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User have to enter invalid email and valid password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "phoneno"
      ]
    },
    {
      "cells": [
        "Anu",
        "anu123",
        "9876543210"
      ]
    },
    {
      "cells": [
        "Banu",
        "banu98765",
        "7877878988"
      ]
    },
    {
      "cells": [
        "sam",
        "sam092",
        "6789056788"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_email_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to be in password incorrect page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_be_in_password_incorrect_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});