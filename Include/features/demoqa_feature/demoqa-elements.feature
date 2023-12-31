@akbar-testing @demoqa-elements
Feature: User simulating example Demo QA Elements Sub Menu

  Background: User on Elements Page
    Given User on Demo QA Page
    When User click Elements Menu button

  Scenario: User can Submit Form with Complete Data
    And User click Text Box Menu button
    And User input Username Field
    And User input Email Field
    And User input Current Address Field
    And User input Permanent Address Field
    And User click Submit button
    Then User can view Submitted Data

   Scenario: User can't Submit Form with Invalid Email
    And User click Text Box Menu button
    And User input Username Field
    And User input Invalid Email Field
    And User input Current Address Field
    And User input Permanent Address Field
    And User click Submit button
    Then User can not view Submitted Data
   @expand-all
   Scenario: User can expand all menu Checkbox
   	And User click Check Box Menu button
   	And User click + button
   	Then User successfully expand all menu

   Scenario: User can collapse all menu Checkbox
   	And User click Check Box Menu button
   	And User click + button
   	And User click - button
   	Then User successfully collapse all menu
