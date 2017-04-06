$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sprint_1/Magento_Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login requirement feature",
  "description": "As a customer of magento\r\nI want login to the application\r\nSo that i can buy item",
  "id": "login-requirement-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4034196863,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "1_Login with valid credentials",
  "description": "",
  "id": "login-requirement-feature;1-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "login successfully with \"dannyolu@yahoo.com\" \u0026 \"high123\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see my credential",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmInTheLoginPage()"
});
formatter.result({
  "duration": 103774604,
  "error_message": "java.lang.NullPointerException\r\n\tat com.magento.app.pages.BasePage.goToAccountPage(BasePage.java:48)\r\n\tat com.magento.app.steps.LoginSteps.iAmInTheLoginPage(LoginSteps.java:46)\r\n\tat ✽.Given I am in the login page(sprint_1/Magento_Login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeMyCredential()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 901150720,
  "status": "passed"
});
});