Feature: As a user, I want to Order the food

@Scenario1
Scenario: The user gives the invalid username and password

Given The user enters the bistobites site
When User clicks the account button
And Give the wrong username and password
And Click the login button
Then Check the  output

@Scenario2
Scenario: The user successfully add the dosa

Given User launches bistobites url
When User clicks the Home button
And User clicks the dosa
And User clicks the masala dosa option
Then Check the available time

@Scenario3
Scenario: User fills out the registration form and ignores the confirm password

Given user enters the bistobites site
When user click the account button
And Fill out the registration form with dummy data
And Click the register button
Then get the popup

@Scenario4
Scenario: user search for the Coke can and check the price

Given user launches bistobites site
When user clicks the search icon
Then user search the coke and check the dollar 

@Scenario5
Scenario: user selects the Spanish Omelet
Given user launches the  site of bistobites
When user click the search icon 
And search spanish omelet
Then select the option and check the dollar

@Scenario6
Scenario: user read Our Story
Given user visits bistobites site
When user click our story button
Then check spelling mistakes