@akbar-testing @login
Feature: User Login

	Scenario: User can Login to Web Page
		Given User on Login Page
		When User enter username akbarmhmmmd@gmail.com
		And User enter password 5xx1bkCcAlw=
		And User is click submit Button
		Then User successfully Login
