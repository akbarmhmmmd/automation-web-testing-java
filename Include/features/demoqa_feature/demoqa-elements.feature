@akbar-testing @demoqa-elements
Feature: User simulating example Demo QA Elements Sub Menu

  Background:
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
