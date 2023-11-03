@akbar-testing @swag-labs
Feature: User simulating usage of Swag Labs

	Background:
		Given User on Swag Labs page

  Scenario Outline: Users can login to Swag Labs
    When User input <user> User username
    And User input correct password
    And User click Login button
    Then User successfully redirected to <page> Home page
    
    Examples:
    	| user       | page       |
    	| Standard   | Standard   |
    	| Problem    | Problem    |
    	
  Scenario: User can not login with wrong username
  	When User input Wrong User username
  	And User input correct password
  	And User click Login button
  	Then User can see credential error message
  	
  Scenario: User can not login with wrong password
  	When User input Standard User username
  	And User input incorrect password
  	And User click Login button
  	Then User can see credential error message
    	
  Scenario: Locked Out user can't login to Swag Labs
  	When User input Locked Out User username
  	And User input correct password
    And User click Login button
    Then User can see locked out error message
    