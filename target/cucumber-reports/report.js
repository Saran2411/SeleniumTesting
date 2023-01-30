$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Bistobites.feature");
formatter.feature({
  "name": "As a user, I want to Order the food",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user gives the invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user enters the bistobites site",
  "keyword": "Given "
});
formatter.match({
  "location": "Bistobites.the_user_enters_the_bistobites_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the account button",
  "keyword": "When "
});
formatter.match({
  "location": "Bistobites.userClicksTheAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Give the wrong username and password",
  "keyword": "And "
});
formatter.match({
  "location": "Bistobites.giveTheWrongUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Bistobites.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the  output",
  "keyword": "Then "
});
formatter.match({
  "location": "Bistobites.checkTheOutput()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user successfully add the dosa",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches bistobites url",
  "keyword": "Given "
});
formatter.match({
  "location": "Bistobites.userLaunchesBistobitesUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Home button",
  "keyword": "When "
});
formatter.match({
  "location": "Bistobites.userClicksTheHomeButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the dosa",
  "keyword": "And "
});
formatter.match({
  "location": "Bistobites.userClicksTheDosa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the masala dosa option",
  "keyword": "And "
});
formatter.match({
  "location": "Bistobites.userClicksTheMasalaDosaOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the available time",
  "keyword": "Then "
});
formatter.match({
  "location": "Bistobites.checkTheAvailableTime()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User fills out the registration form and ignores the confirm password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters the bistobites site",
  "keyword": "Given "
});
formatter.match({
  "location": "Bistobites.userEntersTheBistobitesSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the account button",
  "keyword": "When "
});
formatter.match({
  "location": "Bistobites.userClickTheAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill out the registration form with dummy data",
  "keyword": "And "
});
formatter.match({
  "location": "Bistobites.fillOutTheRegistrationFormWithDummyData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "Bistobites.clickTheRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the popup",
  "keyword": "Then "
});
formatter.match({
  "location": "Bistobites.getThePopup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user search for the Coke can and check the price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario4"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches bistobites site",
  "keyword": "Given "
});
formatter.match({
  "location": "Bistobites.userLaunchesBistobitesSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the search icon",
  "keyword": "When "
});
formatter.match({
  "location": "Bistobites.userClicksTheSearchIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search the coke and check the dollar",
  "keyword": "Then "
});
formatter.match({
  "location": "Bistobites.userSearchTheCokeAndCheckTheDollar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user selects the Spanish Omelet",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario5"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the  site of bistobites",
  "keyword": "Given "
});
formatter.match({
  "location": "Bistobites.userLaunchesTheSiteOfBistobites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the search icon",
  "keyword": "When "
});
formatter.match({
  "location": "Bistobites.userClickTheSearchIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search spanish omelet",
  "keyword": "And "
});
formatter.match({
  "location": "Bistobites.searchSpanishOmelet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the option and check the dollar",
  "keyword": "Then "
});
formatter.match({
  "location": "Bistobites.selectTheOptionAndCheckTheDollar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user read Our Story",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario6"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user visits bistobites site",
  "keyword": "Given "
});
formatter.match({
  "location": "Bistobites.userVisitsBistobitesSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click our story button",
  "keyword": "When "
});
formatter.match({
  "location": "Bistobites.userClickOurStoryButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check spelling mistakes",
  "keyword": "Then "
});
formatter.match({
  "location": "Bistobites.checkSpellingMistakes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});